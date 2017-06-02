using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Data.OleDb;
using System.Data.SqlClient;
using System.Net.Mail;
using System.Net;
using System.Threading; 


namespace WindowsFormsApplication1
{

    public partial class Form1 : Form
    {
        public delegate string FormatSql(DataRow dr, string sFormatstr);
        public delegate void LoadProdData();
        public delegate void Print(string slog);
        public delegate void SetLabel(string sLabel);
        public delegate void SetProgress(int var);
        public delegate void InitProdgress();
        public delegate void SetProgressMax(int max);

        private string[] FileList;
        private DataTable Data;
        private string ConnString = "Data Source=192.168.1.252;Initial Catalog=jydb_all;User ID=dpadmin;pwd=dpadmin;";
        private SqlConnection Conn;
        private int Batch = 1000;
        private int FileType;   // 1: 昨日成交 2：昨日持仓 3：历史成交 4： 历史持仓 5：净值
        private int ProdType;   // 
        private Dictionary<int, LoadProdData> FuncMap;
        private List<FileSystemWatcher> watchers;
        private string sFileChanged = "";
        private DateTime FileChangedTime;


        private String sTradeSql = "use jydb_all insert into jydb_all.dbo.dp_HisTrade(DeptID, DeptName, PortID, ProductID,ProductName,BranchNo,BranchName,FundAccount,FundName,StockExchange,SecurityType,SecurityID,SecurityName,EntrustBS,TradeDate,HolderAccount,TradeID,TradeVolume,AvgPx,NetValue,TradePrice,GrossValue,NationalDebtInt,ExchangeAvgPx,ClosePx,TradeTime)"
                                 + "values('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}','{8}','{9}',"
                                 + "'{10}','{11}','{12}','{13}','{14}', '{15}','{16}','{17}','{18}','{19}',"
                                 + "'{20}','{21}','{22}', '{23}', '{24}', '{25}')";
        private String sTradeSql2 = "('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}','{8}','{9}',"
                                  + "'{10}','{11}','{12}','{13}','{14}', '{15}','{16}','{17}','{18}','{19}',"
                                  + "'{20}','{21}','{22}', '{23}', '{24}',  '{25}')";

        private String sPositionSql = "use jydb_all insert into jydb_all.dbo.dp_HisPosition(Date,FundAccount,FundName,StockExchange,SecurityID,SecurityName,SecurityType,EnableAmount,HoldingAmount,CostPx,ClosePx,Assets,CurrentMarketValue,CurrentPnL,AccumulatedPnL,FloatPnL,GrossPnL,Suspension)"
                                    + "values('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}','{8}','{9}',"
                                    + "'{10}','{11}','{12}','{13}','{14}', '{15}','{16}','{17}')";
        private String sPositionSql2 = "('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}','{8}','{9}',"
                                    + "'{10}','{11}','{12}','{13}','{14}', '{15}','{16}','{17}')";


        private String sNAVSQL = "use jydb_all insert into jydb_all.dbo.dpProd(Date,PortID,PortSName,InitialAsset,GrossAsset,GrossDebt,NetAsset,FundNAV)"
                                + "values ('{0}','{1}','{2}',{3},{4},{5},{6},{7})";
        private String sNAVDELSQL = "use jydb_all delete from jydb_all.dbo.dpProd where Date = '{0}' and PortID = '{1}'";

        private String sDPPRODUCTINFOSQL = "use jydb_all update jydb_all.dbo.dpProductInfo set FundNAV = {0}, UpdateTime = getdate() where ProductID = '{1}'";

        private String sValuationPositionSql = "use jydb_all insert into jydb_all.dbo.dpValuationPos(Date,FundAccount,PortID,PortSName,SecurityID,SecurityName,StockExchange, SecurityType, HoldingAmount,CostPx,CostMarketValue,PctMVofCost,ClosePx,CurrentMarketValue,PctMVofCurrent,PnL,Suspension)"
                            + "values('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}',{8},{9},"
                            + "{10},{11},{12},{13},{14},{15}, '{16}')";
        private String sValuationPositionSql2 = "('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}',{8},{9},"
                            + "{10},{11},{12},{13},{14},{15}, '{16}')";
        private String sValuationDel = "use jydb_all delete from jydb_all.dbo.dpValuationPos where Date='{0}' and PortID = '{1}'";

        private String sProductInfoSql = "use jydb_all insert into jydb_all.dbo.dpProductInfo(ProductName,ProductID,ProdSName,FundManager,FundCustodian,FuturesBroker,FundingSource,SalesAgent,ProdAUM,InitialCashClassB,InitialCashClassA,ProdType,IssueDate,ProdTerm,OperateMode,ClosePeriod,OpenDate,ValuationAgent,ValuationFreq,DisclosureFreq,RecordUpdate,Exposure,FundNAV,AnnualReportMode,WarningLine,StopLine)"
                                        + "values('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}','{8}','{9}',"
                                        + "'{10}','{11}','{12}','{13}','{14}', '{15}','{16}','{17}','{18}','{19}',"
                                        + "'{20}','{21}','{22}', '{23}', '{24}', '{25}')";
        private String sProductInfoSql2 = "('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}','{8}','{9}',"
                                        + "'{10}','{11}','{12}','{13}','{14}', '{15}','{16}','{17}','{18}','{19}',"
                                        + "'{20}','{21}','{22}', '{23}', '{24}', '{25}')";

        private String sProductInfoDelSql = "use jydb_all delete from jydb_all.dbo.dpProductInfo where ProductID in '{0}'";

        private String sProductFeesSql = "use jydb_all insert into jydb_all.dbo.dpProductsFees(ProductID,ProdSName,ManageFees,ManageFeesPvs,TrustFees,TrustFeesPvs,AdminServFees,AdminServFeesPvs,PurchaseFees,RedeemRemark,Reward,SlottingFees,SlottingFeesPvs,ClassABase,FixedInvestFees,FixedInvestFeesPvs)"
                                        + "values('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}','{8}','{9}',"
                                        + "'{10}','{11}','{12}','{13}','{14}', '{15}')";
        private String sProductFeesSql2 = "('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}','{8}','{9}',"
                                        + "'{10}','{11}','{12}','{13}','{14}', '{15}')";

        private String sBarraRiskExpSql = "use jydb_all insert into jydb_all.dbo.barra_risk_exp(d_date,Asset_ID,Name,BETA,BTOP,EARNYILD,GROWTH,LEVERAGE,LIQUIDTY,MOMENTUM,RESVOL,SIZE,SIZENL,Main_Industry_Number,Main_Industry_Name,Asset_Selection_Var)"
                                        + "values('{0}','{1}',\'{2}','{3}','{4}','{5}','{6}','{7}','{8}','{9}',"
                                        + "'{10}','{11}','{12}','{13}','{14}', '{15}')";
        private String sBarraRiskExpSql2 = "('{0}','{1}',\'{2}','{3}','{4}','{5}','{6}','{7}','{8}','{9}',"
                                        + "'{10}','{11}','{12}','{13}','{14}', '{15}')";
        private String sDelBarraRiskExp = "delete from jydb_all.dbo.barra_risk_exp where d_date = '{0}'";

        private String sFundTradesql = "use jydb_all insert into jydb_all.dbo.dpFundjour(Date,SecurityID,EntrustBS,PurchaseAmt,TradeVolume,FundNAV,TradePrice,Trader,PortSName,PortID, OperateID)"
                                       + "values('{0}','{1}','{2}',{3},{4},{5},{6},'{7}','{8}','{9}', '{10}')";
        private String sFundTradesql2 = "('{0}','{1}','{2}',{3},{4},{5},{6},'{7}','{8}','{9}','{10}')";
        private String sFundTradeDel = "delete from jydb_all.dbo.dpFundjour where Date = '{0}' and Trader = '{1}'";

        private String SBarraRiskExpFileDate = "";
        private Thread workerThread;


        public Form1()
        {
            InitializeComponent();
            textBox1.Text = ConstantVar.VALUATIONMONITORPATH;
            textBox2.Text = ConstantVar.VALUATIONMONITORPATH;
            FuncMap = new Dictionary<int, LoadProdData>();
            FuncMap.Add(ConstantVar.HB0A01,     LoadHB0A01Data);
            FuncMap.Add(ConstantVar.PH0A02,     LoadPH0A02Data);

            FuncMap.Add(ConstantVar.CS1B02,     LoadCS1B02Data);
            FuncMap.Add(ConstantVar.CS2B0201,   LoadCS2B0201Data);
            // 精选一号
            FuncMap.Add(ConstantVar.CS1D01,     LoadCS1D01Data);
            FuncMap.Add(ConstantVar.CS2D0101,   LoadCS2D0101Data);
            // 主动一号
            FuncMap.Add(ConstantVar.CM1B01,     LoadCM1B01Data);
            FuncMap.Add(ConstantVar.CM2B0101,   LoadCM2B0101Data);
            // 稳健一号
            FuncMap.Add(ConstantVar.CM1C01,     LoadCM1C01Data);
            FuncMap.Add(ConstantVar.CM2C0101,   LoadCM2C0101Data);
            // 对冲一号
            FuncMap.Add(ConstantVar.CM1A01,     LoadCM1A01Data);
            FuncMap.Add(ConstantVar.CM2A0101,   LoadCM2A0101Data);
            // 行业精选一号
            FuncMap.Add(ConstantVar.CM1H01,     LoadCM1H01Data);
            // 中信增强2号
            FuncMap.Add(ConstantVar.CS1E02,     LoadCS1E02Data);
            


            watchers = new List<FileSystemWatcher>();

            //DpWork worker = new DpTimer();
            //workerThread = new Thread(worker.DoWork);
            //workerThread.Start();

            DpTimer T = new DpTimer("Data Source=" + textHost.Text.Trim() + ";Initial Catalog="
                               + textCatalog.Text.Trim() + ";User ID=" + textUserID.Text.Trim()
                               + ";pwd=" + textPwd.Text.Trim() + ";");

            Thread.Sleep(1000);
            button1_Click(null, null);

        }

        private void MonitorStart(string path, string filter)
        {
            FileSystemWatcher Watcher = new FileSystemWatcher();
            Watcher.Path = path;
            Watcher.Filter = filter;
            Watcher.Created += new FileSystemEventHandler(OnProcess);
            Watcher.Changed += new FileSystemEventHandler(OnProcess);
            Watcher.NotifyFilter = NotifyFilters.CreationTime | NotifyFilters.Size;
            Watcher.EnableRaisingEvents = true;
            Watcher.IncludeSubdirectories = true;
            PrintLog("Start monitor " + path + "\\" + filter, false);
            FileChangedTime = DateTime.Now.ToLocalTime();
            watchers.Add(Watcher);
        }


        private void PrintLog(string slog, bool bSendMail = true, String sub = "")
        {
            if (this.textBoxLog.InvokeRequired)  //判断是否跨线程  
            {
                this.textBoxLog.Invoke(new Print(LogMsg), slog);   //使用委托将方法封送到UI主线程处理  
            }
            else
            {
                LogMsg(slog);
            }

            if (ConstantVar.UseEmailLog && bSendMail)
            {
                Mail.SendMail(slog, sub);
            }
        }


        private void OnProcess(object source, FileSystemEventArgs e)
        {
            string ProdName = "";
            int ProdID = 9999;
            PrintLog("Waiting File Copy!");
            Thread.Sleep(1000);
            PrintLog("Finish File Copy, Begin load file data!");

            FileInfo FileMonitor = new FileInfo(e.FullPath);
            if (e.FullPath.Equals(sFileChanged) && DateTime.Now.ToLocalTime().CompareTo(FileChangedTime.AddSeconds(ConstantVar.INTERVALTIME)) < 0)
            {
                return;
            }
            // 华宝一期
            if (e.FullPath.Contains(ConstantVar.HBVALUATIONPATH))
            {
                ProdName = ConstantVar.PRODHB0A01NAME;
                ProdID = ConstantVar.HB0A01;
            }
            // 鹏华一期
            else if (e.FullPath.Contains(ConstantVar.PHVALUATIONPATH))
            {
                ProdName = ConstantVar.PRODPH0A02NAME;
                ProdID = ConstantVar.PH0A02;
            }
            // 招商行业精选1号
            else if(e.FullPath.Contains(ConstantVar.CM1H01PATH)){
                ProdName = ConstantVar.PRODCM1H01NAME;
                ProdID = ConstantVar.CM1H01;
            }
            else if (e.FullPath.Contains(ConstantVar.CS1E02PATH)){
                ProdName = ConstantVar.PRODCS1E02NAME;
                ProdID = ConstantVar.CS1E02;
            }
            // 中信主动2号
            else if (e.FullPath.Contains(ConstantVar.CSVALUATIONPATH))
            {
                if (e.Name.Contains(ConstantVar.CSONEVALUATIONPATH))
                {
                    ProdName = ConstantVar.PRODCS2B0201NAME;
                    ProdID = ConstantVar.CS2B0201;
                }
                else
                {
                    ProdName = ConstantVar.PRODCS1B02NAME;
                    ProdID = ConstantVar.CS1B02;
                }
            }
            // 招商主动1号
            else if (e.FullPath.Contains(ConstantVar.CMZD1VALUATIONPATH))
            {
                if (e.Name.Contains(ConstantVar.CMZD1ONEVALUATIONPATH))
                { 
                    ProdName = ConstantVar.PRODCM2B0101NAME;
                    ProdID = ConstantVar.CM2B0101;
                }
                else
                {
                    ProdName = ConstantVar.PRODCM1B01NAME;
                    ProdID = ConstantVar.CM1B01;
                }
            }
            // 招商稳健1号
            else if (e.FullPath.Contains(ConstantVar.CMWJ1VALUATIONPATH))
            {
                if (e.Name.Contains(ConstantVar.CMWJ1ONEVALUATIONPATH))
                {
                    ProdName = ConstantVar.PRODCM2C0101NAME;
                    ProdID = ConstantVar.CM2C0101;
                }
                else
                {
                    ProdName = ConstantVar.PRODCM1C01NAME;
                    ProdID = ConstantVar.CM1C01;
                }
            }
            // 中信精选1号
            else if (e.FullPath.Contains(ConstantVar.ZXJX1VALUATIONPATH)) { 
                if (e.Name.Contains(ConstantVar.ZXJX1ONEVALUATIONPATH))
                {
                    ProdName = ConstantVar.PRODCS2D0101NAME;
                    ProdID = ConstantVar.CS2D0101;
                }
                else
                {
                    ProdName = ConstantVar.PRODCS1D01NAME;
                    ProdID = ConstantVar.CS1D01;
                }
            }
            // 招商对冲1号 
            else if (e.FullPath.Contains(ConstantVar.ZSDC1VALUATIONPATH))
            {
                if (e.Name.Contains(ConstantVar.ZSDCONEVALUATIONPATH))
                {
                    ProdName = ConstantVar.PRODCM2A0101NAME;
                    ProdID = ConstantVar.CM2A0101;
                }
                else
                {
                    ProdName = ConstantVar.PRODCM1A01NAME;
                    ProdID = ConstantVar.CM1A01;
                }
            }
            else if (e.FullPath.Contains(ConstantVar.EXPPATH))
            {
                FileList = new string[1];
                FileList[0] = e.FullPath;
                LoadExp();
            }
            else if (e.FullPath.Contains(ConstantVar.FUNDTRADEOBJ))
            {
                FileList = new string[1];
                FileList[0] = e.FullPath;
                LoadFundTrade();
                return;
            }
            else
            {
                return;
            }
            if(FileMonitor.Extension.Equals(".xls")){
                FileType = ConstantVar.DictFileTypeKeys["估值报告"];
                FileList = new string[1];
                FileList[0] = e.FullPath;
                PrintLog(String.Format("MONITOR: {0} created, file is '{1}'", ProdName, e.Name), false);
                if (FuncMap.ContainsKey(ProdID))
                {
                    FuncMap[ProdID]();
                    sFileChanged = e.FullPath;
                    FileChangedTime = DateTime.Now.ToLocalTime();
                }
                else 
                {
                    PrintLog("Can't find " + e.FullPath + " Load function");
                }
           }
        }

        private void LoadFundTrade() {
            foreach (string sFile in FileList)
            {
                Data = ExcelToDataTable(sFile, "Trade");
                //Data.Rows.Remove(Data.Rows[0]);
                FileInfo file = new System.IO.FileInfo(sFile);

                ExecSql(String.Format(sFundTradeDel, file.Name.Substring(file.Name.Length - 12, 8), GetDataByIndex(Data.Rows[0], 7).Trim()));
                LoadExcel("Trade", FormatFundTrade, sFundTradesql, sFundTradesql2, sFile, false);
            }
        }

        private string[] GetFilename()
        {
            string[] sfile = { };
            OpenFileDialog openFileDialog1 = new OpenFileDialog();
            openFileDialog1.Multiselect = true;
            openFileDialog1.Filter = "xls Files|*.xls| xlsx Files|*.xlsx| csv Files|*.csv";
            openFileDialog1.Title = "Select a Cursor File";
            openFileDialog1.InitialDirectory = ConstantVar.VALUATIONMONITORPATH;
            if (openFileDialog1.ShowDialog() == System.Windows.Forms.DialogResult.OK)
            {
                sfile = openFileDialog1.FileNames;
            }
            return sfile;
        }

        private string FormatTradeSql(DataRow dr, string sFormatstr)
        {
            if (GetData(dr, "DeptID", ConstantVar.DictTradeKeys).Equals(""))
            {
                return "";
            }
            else
            {
                return String.Format(sFormatstr,
                                            GetData(dr, "DeptID", ConstantVar.DictTradeKeys),
                                            GetData(dr, "DeptName", ConstantVar.DictTradeKeys),
                                            ConstantVar.DictHB0A01ValuationKeys["PortID"],
                                            ConstantVar.DictHB0A01ValuationKeys["PortID"],
                    //GetData(dr, "ProductID", ConstantVar.DictTradeKeys),
                                            GetData(dr, "ProductName", ConstantVar.DictTradeKeys),
                                            GetData(dr, "BranchNo", ConstantVar.DictTradeKeys),
                                            GetData(dr, "BranchName", ConstantVar.DictTradeKeys),
                                            GetData(dr, "FundAccount", ConstantVar.DictTradeKeys),
                                            GetData(dr, "FundName", ConstantVar.DictTradeKeys),
                                            GetData(dr, "StockExchange", ConstantVar.DictTradeKeys, ConstantVar.DictStockExchangeChangeKeys),
                                            GetData(dr, "SecurityType", ConstantVar.DictTradeKeys, ConstantVar.DictSecurityTypeChangeKeys),
                                            GetData(dr, "SecurityID", ConstantVar.DictTradeKeys),
                                            GetData(dr, "SecurityName", ConstantVar.DictTradeKeys),
                                            GetData(dr, "EntrustBS", ConstantVar.DictTradeKeys, ConstantVar.DictEntrustBSChangeKeys),
                                            GetData(dr, "TradeDate", ConstantVar.DictTradeKeys),
                                            GetData(dr, "HolderAccount", ConstantVar.DictTradeKeys),
                                            GetData(dr, "TradeID", ConstantVar.DictTradeKeys),
                                            GetData(dr, "TradeVolume", ConstantVar.DictTradeKeys),
                                            GetData(dr, "AvgPx", ConstantVar.DictTradeKeys),
                                            GetData(dr, "NetValue", ConstantVar.DictTradeKeys),
                                            GetData(dr, "TradePrice", ConstantVar.DictTradeKeys),
                                            GetData(dr, "GrossValue", ConstantVar.DictTradeKeys),
                                            GetData(dr, "NationalDebtInt", ConstantVar.DictTradeKeys),
                                            GetData(dr, "ExchangeAvgPx", ConstantVar.DictTradeKeys),
                                            GetData(dr, "ClosePx", ConstantVar.DictTradeKeys),
                                            GetData(dr, "TradeTime", ConstantVar.DictTradeKeys));
            }
        }

        private string FormatPositionSql(DataRow dr, string sFormatstr)
        {
            if (GetData(dr, "Date", ConstantVar.DictPositionKeys).Equals(""))
            {
                return "";
            }
            else
            {
                return String.Format(sFormatstr,
                                             GetData(dr, "Date", ConstantVar.DictPositionKeys),
                                             GetData(dr, "FundAccount", ConstantVar.DictPositionKeys),
                                             GetData(dr, "FundName", ConstantVar.DictPositionKeys),
                                             GetData(dr, "StockExchange", ConstantVar.DictPositionKeys, ConstantVar.DictStockExchangeChangeKeys),
                                             GetData(dr, "SecurityID", ConstantVar.DictPositionKeys),
                                             GetData(dr, "SecurityName", ConstantVar.DictPositionKeys),
                                             GetData(dr, "SecurityType", ConstantVar.DictPositionKeys, ConstantVar.DictSecurityTypeChangeKeys),
                                             GetData(dr, "EnableAmount", ConstantVar.DictPositionKeys),
                                             GetData(dr, "HoldingAmount", ConstantVar.DictPositionKeys),
                                             GetData(dr, "CostPx", ConstantVar.DictPositionKeys),
                                             GetData(dr, "ClosePx", ConstantVar.DictPositionKeys),
                                             GetData(dr, "Assets", ConstantVar.DictPositionKeys),
                                             GetData(dr, "CurrentMarketValue", ConstantVar.DictPositionKeys),
                                             GetData(dr, "CurrentPnL", ConstantVar.DictPositionKeys),
                                             GetData(dr, "AccumulatedPnL", ConstantVar.DictPositionKeys),
                                             GetData(dr, "FloatPnL", ConstantVar.DictPositionKeys),
                                             GetData(dr, "GrossPnL", ConstantVar.DictPositionKeys),
                                             GetData(dr, "Suspension", ConstantVar.DictPositionKeys));
            }
        }

        private string FormatProductInfoSql(DataRow dr, string sFormatstr)
        {
            if (GetData(dr, "ProductName", ConstantVar.DictProdInfoKeys).Equals(""))
            {
                return "";
            }
            else
            {
                return String.Format(sFormatstr,
                                                GetData(dr, "ProductName", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "ProductID", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "ProdSName", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "FundManager", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "FundCustodian", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "FutureBroker", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "CashSource", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "SaleOrgan", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "ProdScale", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "InferiorCash", ConstantVar.DictProdInfoKeys),
                            
                    GetData(dr, "PriorityCash", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "ProdType", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "IissueDate", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "OperatePeriod", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "OperateMode", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "BlackoutPeriod", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "OpenDate", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "ValuationOrgan", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "ValuationFreq", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "DisclosureFreq", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "RecordUpdate", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "StdExposure", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "FundNAV", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "AnnualReportMode", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "WarningLine", ConstantVar.DictProdInfoKeys),
                                                GetData(dr, "StopLine", ConstantVar.DictProdInfoKeys));
            }
        }


        private string FormatProductFeesSql(DataRow dr, string sFormatstr)
        {
            if (GetData(dr, "ProductID", ConstantVar.DictProdFeeKeys).Equals(""))
            {
                return "";
            }
            else
            {
                return String.Format(sFormatstr,
                                                GetData(dr, "ProductID", ConstantVar.DictProdFeeKeys),
                                                GetData(dr, "ProdSName", ConstantVar.DictProdFeeKeys),
                                                GetDouble(dr, "ManageFees", ConstantVar.DictProdFeeKeys),
                                                GetData(dr, "ManageFeesPvs", ConstantVar.DictProdFeeKeys),
                                                GetDouble(dr, "TrustFees", ConstantVar.DictProdFeeKeys),
                                                GetData(dr, "TrustFeesPvs", ConstantVar.DictProdFeeKeys),
                                                GetDouble(dr, "AdminServFees", ConstantVar.DictProdFeeKeys),
                                                GetData(dr, "AdminServFeesPvs", ConstantVar.DictProdFeeKeys),
                                                GetDouble(dr, "PurchaseFees", ConstantVar.DictProdFeeKeys),
                                                GetData(dr, "RedeemRemark", ConstantVar.DictProdFeeKeys),
                                                GetData(dr, "Reward", ConstantVar.DictProdFeeKeys),
                                                GetDouble(dr, "SlottingFees", ConstantVar.DictProdFeeKeys),
                                                GetData(dr, "SlottingFeesPvs", ConstantVar.DictProdFeeKeys),
                                                GetDouble(dr, "ClassABase", ConstantVar.DictProdFeeKeys),
                                                GetDouble(dr, "FixedInvestFees", ConstantVar.DictProdFeeKeys),
                                                GetData(dr, "FixedInvestFeesPvs", ConstantVar.DictProdFeeKeys));
            }
        }

        private string FormatFundTrade(DataRow dr, string sFormatstr)
        {
            if (GetDataByIndex(dr, 0).Equals(""))
            {
                return "";
            }
            else
	        {
                return String.Format(sFormatstr,
                                                GetDataByIndex(dr, 0),
                                                GetDataByIndex(dr, 1),
                                                GetDataByIndex(dr, 2),
                                                Util.GetDouble(dr, 3),
                                                Util.GetDouble(dr, 4),
                                                Util.GetDouble(dr, 5),
                                                Util.GetDouble(dr, 6),
                                                GetDataByIndex(dr, 7),
                                                ConstantVar.PORTSNAMESCHANGEMAP[GetDataByIndex(dr, 8).Trim()],
                                                ConstantVar.PORTSNAMES[GetDataByIndex(dr, 8).Trim()],
                                                GetDataByIndex(dr, 9));
	        }

        }
        private string FormatBarraRiskExpSql(DataRow dr, string sFormatstr)
        {
            if (GetDataByIndex(dr,0).Equals(""))
            {
                return "";
            }
            else
            {
                return String.Format(sFormatstr,
                                                SBarraRiskExpFileDate,
                                                GetDataByIndex(dr, 0).PadLeft(6,'0'),
                                                GetDataByIndex(dr, 1).Replace("'", ""),
                                                GetDataByIndex(dr, 2),
                                                GetDataByIndex(dr, 3),
                                                GetDataByIndex(dr, 4),
                                                GetDataByIndex(dr, 5),
                                                GetDataByIndex(dr, 6),
                                                GetDataByIndex(dr, 7),
                                                GetDataByIndex(dr, 8),
                                                GetDataByIndex(dr, 9),
                                                GetDataByIndex(dr, 10),
                                                GetDataByIndex(dr, 11),
                                                GetDataByIndex(dr, 12),
                                                GetDataByIndex(dr, 13),
                                                GetDataByIndex(dr, 14));
            }
        
        }

        private void button2_Click_Load_TradeData(object sender, EventArgs e)
        {
            // Get Bathch amount
            Batch = Convert.ToInt32(textBox3.Text);

            // Get Loaded file name
            FileList = GetFilename();
            textBox1.Text = String.Join(",", FileList);
        }

        private void ExecSql(string sql)
        {
            if (ConstantVar.DBLOCAL)
            {
                ConnString = "Data Source=(local);Initial Catalog=jydb_all;Integrated Security=True;";
            }
            else
            {
                ConnString = "Data Source=" + textHost.Text.Trim() + ";Initial Catalog="
                               + textCatalog.Text.Trim() + ";User ID=" + textUserID.Text.Trim()
                               + ";pwd=" + textPwd.Text.Trim() + ";";
            }
            Conn = new SqlConnection(ConnString);
            Conn.Open();

            SqlCommand command = new SqlCommand(sql, Conn);
            command.ExecuteNonQuery();
        }

        private double GetDouble(DataRow dataRow, String field, Dictionary<string, string> dt)
        {
            double ret = 0;
            if (dt.ContainsKey(field))
            {
                string field2 = dt[field];
                DataColumnCollection cols = dataRow.Table.Columns;
                if (cols.Contains(field2))
                {
                    if (!dataRow[field2].ToString().Equals(""))
                    {
                        ret = Convert.ToDouble(dataRow[field2].ToString());
                    }
                }
                else
                {
                    LogMsg("Not exists field " + "'" + field2 + "' , 请检查导入文件类型");
                }
            }

            return ret;
        }

        private string GetDataByIndex(DataRow dataRow, int index) {
            string val = "";
            val = dataRow[index].ToString();
            return val;
        }

        private string GetData(DataRow dataRow, String field, Dictionary<string, string> dt, Dictionary<string, string> dtChange = null)
        {

            string val = "";
            if (dt.ContainsKey(field))
            {
                string field2 = dt[field];
                DataColumnCollection cols = dataRow.Table.Columns;

                if (cols.Contains(field2))
                {
                    val = Convert.ToString(dataRow[field2]);
                }
                else
                {
                    LogMsg("Not exists field " + "'" + field2 + "' , 请检查导入文件类型");
                }
            }
            if (dtChange != null)
            {
                if (dtChange.ContainsKey(val))
                {
                    val = dtChange[val];
                }
                else
                {
                    LogMsg("不存在值'" + val + "' 的映射值");
                }
            }
            return val.Trim();
        }


       

        public DataTable ExcelToDataTable(string pathName, string sheetName)
        {
            DataTable tbContainer = new DataTable();
            string strConn = string.Empty;
            if (string.IsNullOrEmpty(sheetName)) { sheetName = "Sheet1"; }
            FileInfo file = new System.IO.FileInfo(pathName);
            if (!file.Exists) { throw new Exception("文件不存在"); }
            string extension = file.Extension;
            switch (extension)
            {
                case ".xls":
                    strConn = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" + pathName + ";Extended Properties='Excel 8.0;HDR=Yes;IMEX=1;'";
                    break;
                //case ".csv":
                //    strConn = string.Format(@"Provider=Microsoft.Jet.OLEDB.4.0;Data Source={0};Extended Properties=Text;", pathName);
                    //break;
                case ".xlsx":
                    strConn = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" + pathName + ";Extended Properties='Excel 12.0;HDR=Yes;IMEX=1;'";
                    break;
                default:
                    strConn = "Provider=Microsoft.Jet.OLssEDB.4.0;Data Source=" + pathName + ";Extended Properties='Excel 8.0;HDR=Yes;IMEX=1;'";
                    break;
            }
            //链接Excel  
            OleDbConnection cnnxls = new OleDbConnection(strConn);
            //读取Excel里面有 表Sheet1  
            OleDbDataAdapter oda = new OleDbDataAdapter(string.Format("select * from [{0}$]", sheetName), cnnxls);
            DataSet ds = new DataSet();
            //将Excel里面有表内容装载到内存表中！  
            oda.Fill(tbContainer);
            return tbContainer;
        }

        public DataTable readCsvSql(string path, string filename)
        {
            string strconn = string.Format(@"Provider=Microsoft.Jet.OLEDB.4.0;Data Source={0};Extended Properties=Text;", path);
            string sql = string.Format("SELECT * FROM [{0}]", filename);
            using (OleDbConnection conn = new OleDbConnection(strconn))
            {
                DataTable dtTable = new DataTable();
                OleDbDataAdapter adapter = new OleDbDataAdapter(sql, conn);
                try
                {
                    adapter.Fill(dtTable);
                }
                catch (Exception ex)
                {
                    dtTable = new DataTable();
                    PrintLog(string.Format("[设备]:-->读取文件-->结果:{0}", ex.Message));
                    throw ex;
                }
                return dtTable;
            }

        }

        private void LoadExcel(string sSheetName, FormatSql FormatFunc, string sFormatsql1, string sFormatsql2, string fileName, Boolean ReadExcel = true)
        {
            if (ReadExcel)
            {
                Data = ExcelToDataTable(fileName, sSheetName);
            }
            int rowCount = Data.Rows.Count;
            int times = rowCount / Batch;
            int index = 0;
            SetProgressMaxDelegate(rowCount);
            ShowDelegate(index + "/" + progressBar1.Maximum, 0);

            PrintLog(fileName + " 开始导入", false);
            for (int j = 0; j < times + 1 && index < rowCount; j++)
            {
                List<string> sqllist = new List<string>();
                string sql = FormatFunc(Data.Rows[index], sFormatsql1);
                if (sql.Equals(""))
                {
                    PrintLog("不能格式化sql，请检查: " + sFormatsql1);
                    break;
                }
                sqllist.Add(sql);
                ++index;

                ShowDelegate(index + "/" + progressBar1.Maximum, index);
                for (int i = 1; i < Batch && index < rowCount; i++)
                {
                    DataRow dataRow = Data.Rows[index];
                    sql = FormatFunc(dataRow, sFormatsql2);
                    if (sql.Equals("")) { break; }
                    sqllist.Add(sql);
                    ShowDelegate(index + "/" + progressBar1.Maximum, index++);
                }
                ExecSql(string.Join(",", sqllist.ToArray()));
            }
            if (index > 0)
            {
                PrintLog(fileName + " 导入成功，共导入" + rowCount + "条数据", false);
            }
        }


        private void FileTypeChange(object sender, EventArgs e)
        {
            if (ConstantVar.DictFileTypeKeys.ContainsKey(comboBox2.Text))
            {
                FileType = ConstantVar.DictFileTypeKeys[comboBox2.Text];
            }
            else
            {
                LogMsg("不支持 " + comboBox2.Text + " 类型导入， 请联系开发人员");
            }
        }

        private String GetMapValue(Dictionary<string, string> NAVKeys, String sKey)
        {
            String ret = "unknown";
            if (NAVKeys.ContainsKey(sKey))
            {
                ret = NAVKeys[sKey];
            }
            return ret;
        }

        private void LoadValuationPos(string sFile, string sSheet, Dictionary<string, string> NAVKeys, Dictionary<string, int> PositionLocationKeys)
        {
            // load net
            DataTable ValuationData = ExcelToDataTable(sFile, sSheet);

            //int rowCount = ValuationData.Rows.Count;
            int rowCount = ValuationData.Rows.Count;
            int times = rowCount / Batch;

            string sTradeDate = "";
            string sPortID = NAVKeys["PortID"];
            string sPortSName = NAVKeys["PortSName"];
            double InitialAsset = 0;
            double GrossAsset = 0;
            double GrossDebt = 0;
            double FundAsset = 0;
            double FundNAV = 0;


            string FundAccount = NAVKeys["FundAccount"];
            string SecurityID = "";
            string SecurityName = "";
            double AvaiAmount = 0;
            double CostPirce = 0;
            double Cost = 0;
            double RatioOfCost = 0;
            double ClosePx = 0;
            double MarketValue = 0;
            double RatioOfMarketValue = 0;
            double Increment = 0;
            string Suspension = "";
            string StockExchange = "";
            string SecurityType = "";
            int PosIndex = 0;

            List<string> sqllist = new List<string>();
            for (int j = 0; j < rowCount; j++)
            {
                // init
                SecurityID = "";
                SecurityName = "";
                AvaiAmount = 0;
                CostPirce = 0;
                Cost = 0;
                RatioOfCost = 0;
                ClosePx = 0;
                MarketValue = 0;
                RatioOfMarketValue = 0;
                Increment = 0;
                Suspension = "";
                StockExchange = "";

                DataRow dr = ValuationData.Rows[j];
                if (dr[0].ToString().Contains("日期"))
                {
                    string sDate = dr[0].ToString();
                    int year_index = sDate.LastIndexOf("年");
                    int month_index = sDate.LastIndexOf("月");
                    int day_index = sDate.LastIndexOf("日");
                    if (year_index > 0)
                    {
                        sTradeDate = sDate.Substring(year_index - 4, 4) + "-" + sDate.Substring(month_index - 2, 2) + "-" + sDate.Substring(day_index - 2, 2);
                    }
                    else 
                    {
                        sTradeDate = sDate.Substring(sDate.Length - 10, 10);
                    }
                }
                else if (dr[0].Equals(NAVKeys["InitialAsset"]))
                {
                    InitialAsset = Util.GetDouble(dr, Convert.ToInt32(NAVKeys["Location"]));
                }
                else if (dr[0].Equals(NAVKeys["GrossAsset"]))
                {
                    GrossAsset = Util.GetDouble(dr, Convert.ToInt32(NAVKeys["Location"]));
                }
                else if (dr[0].Equals(NAVKeys["GrossDebt"]))
                {
                    GrossDebt = Util.GetDouble(dr, Convert.ToInt32(NAVKeys["Location"]));
                }
                else if (dr[0].Equals(NAVKeys["FundAsset"]))
                {
                    FundAsset = Util.GetDouble(dr, Convert.ToInt32(NAVKeys["Location"]));
                }
                else if (dr[0].Equals(NAVKeys["FundNAV"]))
                {

                    //double tmp1 = Convert.ToDouble(dr[Convert.ToInt32(NAVKeys["Location"]), DataRowVersion.Original]);
                    //double tmp2 = Convert.ToDouble(dr[Convert.ToInt32(NAVKeys["Location"]), DataRowVersion.Current]);
                    //double tmp3 = Convert.ToDouble(dr[Convert.ToInt32(NAVKeys["Location"]), DataRowVersion.Default]);
                    //double tmp4 = Convert.ToDouble(dr[Convert.ToInt32(NAVKeys["Location"]), DataRowVersion.Proposed]);

                    FundNAV = Util.GetDouble(dr, Convert.ToInt32(NAVKeys["FundNAVLocation"]));
                }
                    // 需要统计的持仓数据！！！
                else if (dr[0].ToString().Contains(NAVKeys["FundAccount"]) || dr[0].ToString().Contains(NAVKeys["BOND_SUBJECT"])
                        || dr[0].ToString().Contains(GetMapValue(NAVKeys, "HKSTOCK")) || dr[0].ToString().Contains(GetMapValue(NAVKeys, "CMF"))
                      || dr[0].ToString().Contains(GetMapValue(NAVKeys, "NATIONDEBTF"))
                      || dr[0].ToString().Contains(NAVKeys["FUTURE_SUBJECT"]) || dr[0].ToString().Contains(NAVKeys["STOCKINDEX_SUBJECT"]) || dr[0].ToString().Contains(NAVKeys["STOCKINDEX_SUBJECT50"])
                      || dr[0].ToString().Contains(NAVKeys["FUND_SUBJECT"]) || dr[0].ToString().Contains(NAVKeys["FUND_SUBJECT_SZ"]) || dr[0].ToString().Contains(GetMapValue(NAVKeys, "BOND"))
                      )
                {

                    string sCode = dr[PositionLocationKeys["SecurityID"]].ToString();
                    SecurityName = dr[PositionLocationKeys["SecurityName"]].ToString();
                    string sql = "";
                    if (sCode.Length > 10)
                    {
                        //if (sCode.Length == 14)
                        //{
                        //    SecurityID = sCode.Substring(8, 6);
                        //}
                        
                        AvaiAmount = Util.GetDouble(dr, PositionLocationKeys["AvaiAmount"]);
                        if (AvaiAmount == 0)
                        {
                            continue;
                        }
                        CostPirce = Util.GetDouble(dr, PositionLocationKeys["CostPirce"]);
                        ClosePx = Util.GetDouble(dr, PositionLocationKeys["ClosePx"]);
                        Suspension = dr[PositionLocationKeys["Suspension"]].ToString();
                        if (sCode.Contains(NAVKeys["SH_EXCHANGE"]))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["SH_EXCHANGE"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["SH_EXCHANGE"].ToString().Length, 6);
                            StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.SH_EXCHANGE;
                            SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.STOCK;
                        }
                        else if (sCode.Contains(NAVKeys["SZ_EXCHANGE"]))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["SZ_EXCHANGE"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["SZ_EXCHANGE"].ToString().Length, 6);
                            StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.SZ_EXCHANGE;
                            SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.STOCK;
                        }
                        else if (sCode.Contains(NAVKeys["VENTURE_EXCHANGE"]))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["VENTURE_EXCHANGE"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["VENTURE_EXCHANGE"].ToString().Length, 6);
                            StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.VENTURE_EXCHANGE;
                            SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.STOCK;
                        }
                        else if (sCode.Contains(NAVKeys["BOND_SUBJECT"]))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["BOND_SUBJECT"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["BOND_SUBJECT"].ToString().Length, 6);

                            if (SecurityName.Contains("GC"))
                            {
                                StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.REVERSE_REPURCHASE_GC;
                                SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.BOND;
                            }
                            else
                            {
                                StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.UNKNOW;
                            }
                        }
                        else if (sCode.Contains(NAVKeys["FUTURE_SUBJECT"]) || sCode.Contains(NAVKeys["STOCKINDEX_SUBJECT"]) || sCode.Contains(NAVKeys["STOCKINDEX_SUBJECT50"]))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["STOCKINDEX_SUBJECT"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["STOCKINDEX_SUBJECT"].ToString().Length, 6);

                            if (SecurityName.Contains("IF") || SecurityName.Contains("IC") || SecurityName.Contains("IH"))
                            {
                                StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.FUTURE_EXCHANGE_IF;
                                SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.FUTURE;
                            }
                            else
                            {
                                StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.UNKNOW;
                            }
                        }
                        else if (sCode.Contains(NAVKeys["FUND_SUBJECT"]))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["FUND_SUBJECT"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["FUND_SUBJECT"].ToString().Length, 6);
                            
                            StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.SH_EXCHANGE;
                            SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.FUND;
                        }
                        else if (sCode.Contains(NAVKeys["FUND_SUBJECT_SZ"]))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["FUND_SUBJECT_SZ"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["FUND_SUBJECT_SZ"].ToString().Length, 6);
                            StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.SZ_EXCHANGE;
                            SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.FUND;
                        }
                        else if (NAVKeys.ContainsKey("NEW_STOCK_SZ") && sCode.Contains(NAVKeys["NEW_STOCK_SZ"]))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["NEW_STOCK_SZ"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["NEW_STOCK_SZ"].ToString().Length, 6);
                            StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.SZ_EXCHANGE;
                            SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.STOCK;
                        }
                        else if (NAVKeys.ContainsKey("NEW_STOCK_VENTURE") && sCode.Contains(NAVKeys["NEW_STOCK_VENTURE"]))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["NEW_STOCK_VENTURE"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["NEW_STOCK_VENTURE"].ToString().Length, 6);
                            StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.SZ_EXCHANGE;
                            SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.STOCK;
                        }
                        else if (dr[0].ToString().Contains(GetMapValue(NAVKeys, "BOND")))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["BOND"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["BOND"].ToString().Length, 6);
                            StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.SH_EXCHANGE;
                            SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.CONVERTIBLEBOND;
                        }
                        else if (dr[0].ToString().Contains(GetMapValue(NAVKeys, "HKSTOCK")))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["HKSTOCK"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["HKSTOCK"].ToString().Length+2, 4);
                            StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.HK;
                            SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.HKSTOCK;
                        }
                        else if (dr[0].ToString().Contains(GetMapValue(NAVKeys, "CMF")))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["CMF"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["CMF"].ToString().Length, 6);
                            StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.SHF;
                            SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.CMFUTURE;
                        }
                        else if (dr[0].ToString().Contains(GetMapValue(NAVKeys, "NATIONDEBTF")))
                        {
                            int codeidx = sCode.LastIndexOf(NAVKeys["NATIONDEBTF"]);
                            SecurityID = sCode.Substring(codeidx + NAVKeys["NATIONDEBTF"].ToString().Length, 5);
                            StockExchange = ConstantVar.DICTSTOCKEXCHANGEKEYS.FUTURE_EXCHANGE_IF;
                            SecurityType = ConstantVar.DICTSECURITYTYPEKEYS.NDFUTURE;
                        }
                    }
                    else
                    {
                        continue;
                    }
                    string tmpRatioOfCost = dr[PositionLocationKeys["RatioOfCost"]].ToString();
                    string tmpRatioOfMarketValue = dr[PositionLocationKeys["RatioOfCost"]].ToString();
                    if (tmpRatioOfCost.Equals("") || tmpRatioOfCost.Equals("0"))
                    {
                        RatioOfCost = 0;
                    }
                    else {
                        RatioOfCost = Convert.ToDouble(tmpRatioOfCost.Substring(0, tmpRatioOfCost.Length - 1));
                    }
                    if (tmpRatioOfMarketValue.Equals("") || tmpRatioOfMarketValue.Equals("0"))
                    {
                        RatioOfMarketValue = 0;
                    }
                    else {
                        RatioOfMarketValue = Convert.ToDouble(tmpRatioOfMarketValue.Substring(0, tmpRatioOfMarketValue.Length - 1));
                    }

                    Cost = Util.GetDouble(dr, PositionLocationKeys["Cost"]);
                    MarketValue = Util.GetDouble(dr, PositionLocationKeys["MarketValue"]);
                    Increment = Util.GetDouble(dr, PositionLocationKeys["Increment"]);

                    if (PosIndex == 0)
                    {
                        sql = string.Format(sValuationPositionSql, sTradeDate,
                                                                FundAccount,
                                                                sPortID,
                                                                sPortSName,
                                                                SecurityID,
                                                                SecurityName,
                                                                StockExchange,
                                                                SecurityType,
                                                                AvaiAmount,
                                                                CostPirce,
                                                                Cost,
                                                                RatioOfCost,
                                                                ClosePx,
                                                                MarketValue,
                                                                RatioOfMarketValue,
                                                                Increment,
                                                                Suspension);
                    }
                    else
                    {
                        sql = string.Format(sValuationPositionSql2, sTradeDate,
                                    FundAccount,
                                    sPortID,
                                    sPortSName,
                                    SecurityID,
                                    SecurityName,
                                    StockExchange,
                                    SecurityType,
                                    AvaiAmount,
                                    CostPirce,
                                    Cost,
                                    RatioOfCost,
                                    ClosePx,
                                    MarketValue,
                                    RatioOfMarketValue,
                                    Increment,
                                    Suspension);
                    }
                    sqllist.Add(sql);
                    PosIndex++;

                }
            }

            String s = String.Format(sNAVSQL,
                                    sTradeDate,
                                    sPortID,
                                    sPortSName,
                                    InitialAsset,
                                    GrossAsset,
                                    GrossDebt,
                                    FundAsset,
                                    FundNAV);
            //LogMsg("删除数据 sql：" + String.Format(sNAVDELSQL, sTradeDate, sProdID));
            ExecSql(String.Format(sNAVDELSQL, sTradeDate, sPortID));

            PrintLog(sFile + " 导入净值------------------------开始", false);
            ExecSql(s);
            PrintLog(sFile + " 导入净值------------------------结束", false);

            PrintLog(sFile + " 导入持仓数据--------------------开始", false);
            ExecSql(String.Format(sValuationDel, sTradeDate, sPortID) + ";" + string.Join(",", sqllist.ToArray()));
            PrintLog(sFile + " 导入持仓数据----结束，共导入" + PosIndex + "条数据", true, sPortSName);

            File.Delete(sFile);
            File.Delete(sFile.Replace("new", ""));
        }

        private void LogMsg(string info)
        {
            textBoxLog.AppendText(DateTime.Now.ToLocalTime().ToString() + ": " + info + "\n");
        }

        private void ShowDelegate(string slabel, int progress)
        {
            if (this.progressBar1.InvokeRequired)
            {
                this.progressBar1.Invoke(new SetProgress(setFormProgress), progress);
            }
            else
            {
                setFormProgress(progress);
            }

            if (this.labelProcess.InvokeRequired)
            {
                this.labelProcess.Invoke(new SetLabel(setFormLabel), slabel);
            }
            else
            {
                setFormLabel(slabel);
            }
        }

        private void InitProgressDelegate()
        {
            if (this.progressBar1.InvokeRequired)
            {
                this.progressBar1.Invoke(new InitProdgress(InitProgress));
            }
            else
            {
                InitProgress();
            }
        }

        private void SetProgressMaxDelegate(int max)
        {
            if (this.progressBar1.InvokeRequired)
            {
                this.progressBar1.Invoke(new SetProgressMax(SetFormProgressMax), max);
            }
            else
            {
                SetFormProgressMax(max);
            }
        }


        private void SetFormProgressMax(int max)
        {
            progressBar1.Maximum = max;
        }

        private void InitProgress()
        {
            progressBar1.Maximum = FileList.Length;
            progressBar1.Value = 0;
        }

        private void setFormLabel(string s)
        {
            labelProcess.Text = s;
        }

        private void setFormProgress(int var)
        {
            progressBar1.Value = var;
        }




        private void LoadHB0A01Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["历史成交"])
            {
                // load history trading 0
                foreach (string sFile in FileList)
                {
                    LoadExcel("Sheet 1", FormatTradeSql, sTradeSql, sTradeSql2, sFile);
                }
            }
            else if (FileType == ConstantVar.DictFileTypeKeys["历史持仓"])
            {
                // load history position
                foreach (string sFile in FileList)
                {
                    LoadExcel("Sheet 1", FormatPositionSql, sPositionSql, sPositionSql2, sFile);
                }
            }
            else if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);

                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictHB0A01ValuationKeys, ConstantVar.DictHB0A01LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }
        }

        private void LoadPH0A02Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictPH0A02ValuationKeys, ConstantVar.DictPH0A02LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }
        }

        private void LoadCS1D01Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    if (sFile != null && !sFile.Equals(""))
                        LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCS1D01ValuationKeys, ConstantVar.DictCS1D01LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }
        }


        private void LoadCS1B02Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    if (sFile != null && !sFile.Equals(""))
                        LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCS1B02ValuationKeys, ConstantVar.DictCS1B02LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }
        }
       
        private void LoadCM1C01Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCM1C01ValuationKeys, ConstantVar.DictCM1B01LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }  
        }
        
        private void LoadCM2C0101Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCM2C0101ValuationKeys, ConstantVar.DictCM1B01LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }  
        }

        private void LoadCM2A0101Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCM2A0101ValuationKeys, ConstantVar.DictCM1A01LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }  
        }

        private void LoadCM2B0101Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCM2B0101ValuationKeys, ConstantVar.DictCM1B01LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }        
        }

        private void LoadCM1B01Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCM1B01ValuationKeys, ConstantVar.DictCM1B01LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }        
        }

        private void LoadCM1A01Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCM1A01ValuationKeys, ConstantVar.DictCM1A01LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }
        }

        private void LoadCM1H01Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCM1H01ValuationKeys, ConstantVar.DictCM1A01LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }
        }


        private void LoadCS1E02Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCS1E02ValuationKeys, ConstantVar.DictCS1D01LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }
        }

        private void LoadCS2B0201Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCS2B0201ValuationKeys, ConstantVar.DictCS1B02LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }
        }


        private void LoadCS2D0101Data()
        {
            if (FileType == ConstantVar.DictFileTypeKeys["估值报告"])
            {
                InitProgressDelegate();
                ShowDelegate("0/0", 0);
                int index = 0;
                foreach (string sFile in FileList)
                {
                    index++;
                    ShowDelegate(index + "/" + progressBar1.Maximum, index);
                    LoadValuationPos(sFile, "Sheet1", ConstantVar.DictCS2D0101ValuationKeys, ConstantVar.DictCS1D01LocationKeys);
                }
            }
            else
            {
                LogMsg("未实现\"" + comboBoxProdType.Text + "\" " + comboBox2.Text + "导入功能");
            }
        }


        private void LoadExp() {
            foreach (string sFile in FileList)
            {
                FileInfo file = new System.IO.FileInfo(sFile);
                SBarraRiskExpFileDate = file.Name.Substring(file.Name.Length - 12, 8);
                //DataTable tmp = ExcelToDataTable(sFile, file.Name.Substring(0, file.Name.Length - 4));
                DataTable tmp = readCsvSql(file.DirectoryName, file.Name);
                Data = tmp.Clone();
                for (int j = 0; j < tmp.Rows.Count; j++)
                {
                    if (Util.IsNumber(tmp.Rows[j][0].ToString()))
                    {
                        //Data.Rows.Add(tmp.Rows[j].ItemArray);
                        Data.ImportRow(tmp.Rows[j]);
                    }
                }
                // ExecSql
                ExecSql(String.Format(sDelBarraRiskExp, SBarraRiskExpFileDate));
                LoadExcel(file.Name.Substring(0, file.Name.Length - 4), FormatBarraRiskExpSql, sBarraRiskExpSql, sBarraRiskExpSql2, sFile, false);
            }
        }

        private void LoadData(object sender, EventArgs e)
        {
            if (FileList == null)
            {
                LogMsg("未选择xls文件， 请正确选择文件");
                return;
            }
            FileTypeChange(null, null);     // get FileType
            ProdTypeChange(null, null);     // get ProdType

            if (FileType == ConstantVar.DictFileTypeKeys["产品信息"])
            {
                foreach (string sFile in FileList)
                {
                    LoadExcel("Prod", FormatProductInfoSql, sProductInfoSql, sProductInfoSql2, sFile);
                }
            }
            else if (FileType == ConstantVar.DictFileTypeKeys["产品信息（费用）"])
            {
                foreach (string sFile in FileList)
                {
                    LoadExcel("Fare", FormatProductFeesSql, sProductFeesSql, sProductFeesSql2, sFile);
                }
            }
            else if (FileType == ConstantVar.DictFileTypeKeys["EXP"]) {
                LoadExp();
            }
            else if (FuncMap.ContainsKey(ProdType))
            {
                FuncMap[ProdType]();
            }
            else
            {
                LogMsg("暂不支持\"" + comboBoxProdType.Text + "\"导入");
            }
        }

        private void ProdTypeChange(object sender, EventArgs e)
        {
            ProdType = comboBoxProdType.SelectedIndex;
        }

        public void button1_Click(object sender, EventArgs e)
        {
            string[] filters = {"*.xls", "*.csv" };
            foreach (string f in filters)
            {
                MonitorStart(ConstantVar.VALUATIONMONITORPATH, f);
            }
            //MonitorFundTrade();
        }

        private void MonitorFundTrade()
        {
            foreach (string path in ConstantVar.FUNDTRADEPATH)
            {
                MonitorStart(path, "*.xls");
            }
        }
        private void textHost_TextChanged(object sender, EventArgs e)
        {

        }

    }
}

