using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApplication1
{
    class ConstantVar
    {
        static public bool DBLOCAL = false;
        //static public string VALUATIONMONITORPATH = "E:\\public\\市场监控\\估值报告归档入库数据";
        static public string VALUATIONMONITORPATH = "E:\\估值报告归档入库数据";
        

        //static public bool DBLOCAL = true;
        //static public string VALUATIONMONITORPATH = "D:\\workspace\\DP\\SRC\\LoadExcelData\\data";

        //static public bool UseEmailLog = false;
        static public bool UseEmailLog = true;

        static public int INTERVALTIME = 60;
        static public string MONITOREMAIL = "909290665@qq.com";
        

        

        /*************Dictionary Define**************/
        static public class DICTSTOCKEXCHANGEKEYS {
            static public String SH_EXCHANGE            =    "SH";                // SH
            static public String SZ_EXCHANGE            =    "SZ";                // SZ
            static public String VENTURE_EXCHANGE       =    "SZ";                // SZ 
            static public String REVERSE_REPURCHASE_GC  =    "SH";                // SH
            static public String FUTURE_EXCHANGE_IF     =    "CFE";               // CFE
            static public String HK                     =    "HK";
            static public String SHF                    =    "SHF";               
            static public String UNKNOW                 =    "-1";
        }

        static public class DICTSECURITYTYPEKEYS {
            static public string STOCK      = "0";
            static public string BOND       = "1";
            static public string FUTURE     = "2";
            static public string FUND           = "3";
            static public string CONVERTIBLEBOND  = "4";
            static public string CMFUTURE       = "5";
            static public string NDFUTURE       = "6";
            static public string HKSTOCK        = "7";
        }


        /*************Valuation Define**************/
        // values map
        static public Dictionary<string, string> DictStockExchangeChangeKeys;
        static public Dictionary<string, string> DictSecurityTypeChangeKeys;
        static public Dictionary<string, string> DictEntrustBSChangeKeys;

        static public Dictionary<string, string> DictTradeKeys;
        static public Dictionary<string, string> DictPositionKeys;
        static public Dictionary<string, int>    DictFileTypeKeys;

        static public Dictionary<string, int>    DictHB0A01LocationKeys;
        static public Dictionary<string, string> DictHB0A01ValuationKeys;
        static public Dictionary<string, int>    DictPH0A02LocationKeys;
        static public Dictionary<string, string> DictPH0A02ValuationKeys;
        static public Dictionary<string, int>    DictCS1B02LocationKeys;
        static public Dictionary<string, string> DictCS1B02ValuationKeys;

        static public Dictionary<string, string> DictCS1D01ValuationKeys;
        static public Dictionary<string, int>    DictCS1D01LocationKeys;

        //static public Dictionary<string, int>    DictCS2B0201LocationKeys;
        static public Dictionary<string, string> DictCS2B0201ValuationKeys;

        static public Dictionary<string, string> DictCS2D0101ValuationKeys;
        static public Dictionary<string, int>    DictCS2D0101LocationKeys;
        

        static public Dictionary<string, string> DictCM1B01ValuationKeys;
        static public Dictionary<string, int>    DictCM1B01LocationKeys;

        static public Dictionary<string, string> DictCM1A01ValuationKeys;
        static public Dictionary<string, int>    DictCM1A01LocationKeys;

        static public Dictionary<string, string> DictCM1H01ValuationKeys;
        //static public Dictionary<string, int>    DictCM1H01LocationKeys;


        static public Dictionary<string, string> DictCS1E02ValuationKeys;
        //static public Dictionary<string, int>    DictCS1E02LocationKeys;


        static public Dictionary<string, string> DictCM2B0101ValuationKeys;
        //static public Dictionary<string, int>    DictCM2B0101LocationKeys;
        static public Dictionary<string, string> DictCM1C01ValuationKeys;
        static public Dictionary<string, string> DictCM2C0101ValuationKeys;
        static public Dictionary<string, string> DictCM2A0101ValuationKeys;
        


        static public Dictionary<string, string> PORTSNAMES;
        static public Dictionary<string, string> PORTSNAMESCHANGEMAP;

        //static public string[] FUNDTRADEPATH = { "E:\\public\\市场监控\\估值报告归档入库数据" };
        static public string[] FUNDTRADEPATH = { "E:\\估值报告归档入库数据" }; 
        
        
        static public string PRODHB0A01NAME       = "华宝对冲01";
        static public string PRODPH0A02NAME       = "鹏华对冲02";
        static public string PRODCM1B01NAME       = "招商主动01";
        static public string PRODCM2B0101NAME     = "招商主动01一期";
        static public string PRODCS1B02NAME       = "中信主动02";
        static public string PRODCS2B0201NAME     = "中信主动02一期";
        static public string PRODCM1C01NAME       = "招商稳健01";
        static public string PRODCM2C0101NAME     = "招商稳健01一期";
        static public string PRODCS1D01NAME       = "中信精选01";
        static public string PRODCS2D0101NAME     = "中信精选01一期";
        static public string PRODCM1A01NAME       = "招商对冲01";
        static public string PRODCM2A0101NAME     = "招商对冲01一期";
        static public string PRODCM1H01NAME       = "行业精选01";
        static public string PRODCS1E02NAME       = "中信增强02";

        

        //static public string PRODCM2B0101NAME     = "招商主动01一期";


        static public string HBVALUATIONPATH      = "华宝1期\\估值报告";
        static public string PHVALUATIONPATH      = "鹏华1期\\估值报告";

        static public string CM1H01PATH =           "行业精选";
        static public string CS1E02PATH =           "中信增强2号";


        static public string CSVALUATIONPATH      = "中信主动2号";
        static public string CSONEVALUATIONPATH   = "基金1期";

        static public string CMZD1VALUATIONPATH      = "招商主动1号";
        static public string CMZD1ONEVALUATIONPATH   = "基金1期";

        static public string CMWJ1VALUATIONPATH      = "招商稳健1号";
        static public string CMWJ1ONEVALUATIONPATH   = "基金1期";

        static public string ZXJX1VALUATIONPATH         = "中信精选1号";
        static public string ZXJX1ONEVALUATIONPATH      = "精选1号1期";

        static public string ZSDC1VALUATIONPATH         = "招商对冲1号";
        static public string ZSDCONEVALUATIONPATH       = "对冲1号1期";

        
        static public string EXPPATH              = "dingshi\\data\\exp";
        static public string FUNDTRADEOBJ         = "Trade";

        static public int HB0A01   = 0;
        static public int PH0A02   = 1;
        static public int CM1B01   = 2;
        static public int CM2B0101 = 3;
        static public int CS1B02   = 4;
        static public int CS2B0201 = 5;
        static public int CM1C01   = 6;
        static public int CM2C0101 = 7;
        static public int CS1D01   = 8;
        static public int CS2D0101 = 9;

        static public int CM1A01    = 10;
        static public int CM2A0101  = 11;

        static public int CM1H01 = 12;
        static public int CS1E02 = 13;

        /*************ProductInfo Define**************/
        static public Dictionary<string, string> DictProdInfoKeys;
        static public Dictionary<string, string> DictProdFeeKeys;
        static ConstantVar(){
            /*************Valuation Define**************/
            DictTradeKeys = new Dictionary<string, string>();
            DictTradeKeys.Add("DeptID",         "部门编号");
            DictTradeKeys.Add("DeptName",       "部门名称");  
            DictTradeKeys.Add("ProtID",         "组合ID");
            DictTradeKeys.Add("ProductID",      "项目编号");
            DictTradeKeys.Add("ProductName",    "项目简称");
            DictTradeKeys.Add("BranchNo",       "营业部号");
            DictTradeKeys.Add("BranchName",     "营业部名称");
            DictTradeKeys.Add("FundAccount",    "资金帐号");
            DictTradeKeys.Add("FundName",       "帐号简称");
            DictTradeKeys.Add("StockExchange",  "交易类别");
            DictTradeKeys.Add("SecurityType",   "证券类别");
            DictTradeKeys.Add("SecurityID",     "证券代码");
            DictTradeKeys.Add("SecurityName",   "证券名称");
            DictTradeKeys.Add("EntrustBS",      "委托方向");
            DictTradeKeys.Add("TradeDate",      "成交日期");
            DictTradeKeys.Add("HolderAccount",  "股东帐号");
            DictTradeKeys.Add("TradeID",        "成交编号");
            DictTradeKeys.Add("TradeVolume",    "成交数量");
            DictTradeKeys.Add("AvgPx",          "成交均价");
            DictTradeKeys.Add("NetValue",       "净价金额");
            DictTradeKeys.Add("TradePrice",     "成交全价");
            DictTradeKeys.Add("GrossValue",     "全价成交金额");
            DictTradeKeys.Add("NationalDebtInt","国债利息");
            DictTradeKeys.Add("ExchangeAvgPx",  "交易所成交均价");
            DictTradeKeys.Add("ClosePx",        "收盘价");
            DictTradeKeys.Add("TradeTime",      "成交时间");

            DictPositionKeys = new Dictionary<string, string>();
            DictPositionKeys.Add("Date", "日期");
            DictPositionKeys.Add("FundAccount",         "资金帐号");
            DictPositionKeys.Add("FundName",            "帐号简称");
            DictPositionKeys.Add("StockExchange",       "市场类别");
            DictPositionKeys.Add("SecurityID",          "证券代码");
            DictPositionKeys.Add("SecurityName",        "证券名称");
            DictPositionKeys.Add("SecurityType",        "证券类别");
            DictPositionKeys.Add("EnableAmount",        "可用数量");
            DictPositionKeys.Add("HoldingAmount",       "持仓量");
            DictPositionKeys.Add("CostPx",              "成本价");
            DictPositionKeys.Add("ClosePx",             "收盘价");
            DictPositionKeys.Add("Assets",              "资金占用");
            DictPositionKeys.Add("CurrentMarketValue",  "市值");
            DictPositionKeys.Add("CurrentPnL",          "当日盈亏");
            DictPositionKeys.Add("AccumulatedPnL",      "累计盈亏");
            DictPositionKeys.Add("FloatPnL",            "浮动盈亏");
            DictPositionKeys.Add("GrossPnL",            "总体盈亏");
            DictPositionKeys.Add("Suspension",          "停牌标志");

            // 1: 昨日成交 2：昨日持仓 3：历史成交 4： 历史持仓 5：净值
            DictFileTypeKeys = new Dictionary<string, int>();
            DictFileTypeKeys.Add("昨日成交", 1);
            DictFileTypeKeys.Add("昨日持仓", 2);
            DictFileTypeKeys.Add("历史成交", 3);
            DictFileTypeKeys.Add("历史持仓", 4);
            DictFileTypeKeys.Add("估值报告", 5);
            DictFileTypeKeys.Add("产品信息", 6);
            DictFileTypeKeys.Add("产品信息（费用）", 7);
            DictFileTypeKeys.Add("EXP", 8);
            

            DictStockExchangeChangeKeys = new Dictionary<string, string>();
            DictStockExchangeChangeKeys.Add("上海A股", "0");
            DictStockExchangeChangeKeys.Add("深圳A股", "1");
            DictStockExchangeChangeKeys.Add("金交所",  "2");

            DictSecurityTypeChangeKeys = new Dictionary<string, string>();
            DictSecurityTypeChangeKeys.Add("股票",      "0");
            DictSecurityTypeChangeKeys.Add("质押回购",  "1");
            DictSecurityTypeChangeKeys.Add("指数期货",  "2");

            DictEntrustBSChangeKeys = new Dictionary<string, string>();
            DictEntrustBSChangeKeys.Add("股票买入",     "0");
            DictEntrustBSChangeKeys.Add("股票卖出",     "1");
            DictEntrustBSChangeKeys.Add("开仓",         "2");
            DictEntrustBSChangeKeys.Add("平仓",         "3");
            DictEntrustBSChangeKeys.Add("融券回购",     "4");


            DictHB0A01ValuationKeys = new Dictionary<string, string>();
            DictHB0A01ValuationKeys.Add("PortID",             "HB0A01");
            DictHB0A01ValuationKeys.Add("PortSName",          "华宝对冲01");
            DictHB0A01ValuationKeys.Add("InitialAsset",       "实收资本");
            DictHB0A01ValuationKeys.Add("GrossAsset",         "资产类合计：");
            DictHB0A01ValuationKeys.Add("GrossDebt",          "负债类合计：");
            DictHB0A01ValuationKeys.Add("FundAsset",          "基金资产净值：");
            DictHB0A01ValuationKeys.Add("FundNAV",            "今日单位净值：");
            DictHB0A01ValuationKeys.Add("FundNAVLocation",    "1");
            DictHB0A01ValuationKeys.Add("FundAccount",        "110120");
            DictHB0A01ValuationKeys.Add("Location",           "7");
            DictHB0A01ValuationKeys.Add("SH_EXCHANGE",        "11012063");       //  SH
            DictHB0A01ValuationKeys.Add("SZ_EXCHANGE",        "11012013");       //  SZ
            DictHB0A01ValuationKeys.Add("VENTURE_EXCHANGE",   "11012069");       //  SZ
            DictHB0A01ValuationKeys.Add("BOND_SUBJECT",       "11110101");      
            DictHB0A01ValuationKeys.Add("FUTURE_SUBJECT",     "31020303");
            DictHB0A01ValuationKeys.Add("STOCKINDEX_SUBJECT", "31020101");
            DictHB0A01ValuationKeys.Add("STOCKINDEX_SUBJECT50", "31020201");
            DictHB0A01ValuationKeys.Add("FUND_SUBJECT",       "11050101");
            DictHB0A01ValuationKeys.Add("FUND_SUBJECT_SZ",    "11050201");


            DictHB0A01LocationKeys = new Dictionary<string, int>();
            DictHB0A01LocationKeys.Add("SecurityID",         0);
            DictHB0A01LocationKeys.Add("SecurityName",       1);
            DictHB0A01LocationKeys.Add("AvaiAmount",         2);
            DictHB0A01LocationKeys.Add("CostPirce",          3);
            DictHB0A01LocationKeys.Add("Cost",               4);
            DictHB0A01LocationKeys.Add("RatioOfCost",        5);
            DictHB0A01LocationKeys.Add("ClosePx",            6);
            DictHB0A01LocationKeys.Add("MarketValue",        7);
            DictHB0A01LocationKeys.Add("RatioOfMarketValue", 8);
            DictHB0A01LocationKeys.Add("Increment",          9);
            DictHB0A01LocationKeys.Add("Suspension",        10);

            DictPH0A02ValuationKeys = new Dictionary<string, string>();
            DictPH0A02ValuationKeys.Add("PortID",           "PH0A02");
            DictPH0A02ValuationKeys.Add("PortSName",        "鹏华对冲02");
            DictPH0A02ValuationKeys.Add("InitialAsset",     "实收资本");
            DictPH0A02ValuationKeys.Add("GrossAsset",       "资产类合计：");
            DictPH0A02ValuationKeys.Add("GrossDebt",        "负债类合计：");
            DictPH0A02ValuationKeys.Add("FundAsset",        "资产资产净值：");
            DictPH0A02ValuationKeys.Add("FundNAV",          "今日单位净值：");
            DictPH0A02ValuationKeys.Add("FundNAVLocation",  "1");
            DictPH0A02ValuationKeys.Add("FundAccount",      "1102");
            DictPH0A02ValuationKeys.Add("Location",         "7");
            DictPH0A02ValuationKeys.Add("SH_EXCHANGE",      "11020101");       //  SH
            DictPH0A02ValuationKeys.Add("SZ_EXCHANGE",      "11023101");       //  SZ
            DictPH0A02ValuationKeys.Add("VENTURE_EXCHANGE", "11024101");       //  SZ
            DictPH0A02ValuationKeys.Add("BOND_SUBJECT",     "12020101");
            DictPH0A02ValuationKeys.Add("FUTURE_SUBJECT",   "31020401");
            DictPH0A02ValuationKeys.Add("STOCKINDEX_SUBJECT", "31020101");
            DictPH0A02ValuationKeys.Add("STOCKINDEX_SUBJECT50", "31020201");
            DictPH0A02ValuationKeys.Add("FUND_SUBJECT",     "11050101");
            DictPH0A02ValuationKeys.Add("FUND_SUBJECT_SZ",  "11050201");

            DictPH0A02LocationKeys = new Dictionary<string, int>();
            DictPH0A02LocationKeys.Add("SecurityID",        0);
            DictPH0A02LocationKeys.Add("SecurityName",      1);
            DictPH0A02LocationKeys.Add("AvaiAmount",        2);
            DictPH0A02LocationKeys.Add("CostPirce",         3);
            DictPH0A02LocationKeys.Add("Cost",              4);
            DictPH0A02LocationKeys.Add("RatioOfCost",       5);
            DictPH0A02LocationKeys.Add("ClosePx",           6);
            DictPH0A02LocationKeys.Add("MarketValue",       7);
            DictPH0A02LocationKeys.Add("RatioOfMarketValue", 8);
            DictPH0A02LocationKeys.Add("Increment",         9);
            DictPH0A02LocationKeys.Add("Suspension",        10);


            DictCS1E02ValuationKeys = new Dictionary<string, string>();
            DictCS1E02ValuationKeys.Add("PortID",           "CS1E02");
            DictCS1E02ValuationKeys.Add("PortSName",        "中信增强02");
            DictCS1E02ValuationKeys.Add("InitialAsset",     "实收资本");
            DictCS1E02ValuationKeys.Add("GrossAsset",       "资产合计");
            DictCS1E02ValuationKeys.Add("GrossDebt", "负债合计");
            DictCS1E02ValuationKeys.Add("FundAsset", "资产净值");
            DictCS1E02ValuationKeys.Add("FundNAV", "今日单位净值");
            DictCS1E02ValuationKeys.Add("FundAccount", "1102");
            DictCS1E02ValuationKeys.Add("Location", "9");
            DictCS1E02ValuationKeys.Add("FundNAVLocation", "1");
            DictCS1E02ValuationKeys.Add("SH_EXCHANGE", "1102.01.01.");       //  SH
            DictCS1E02ValuationKeys.Add("SZ_EXCHANGE", "1102.33.01.");       //  SZ
            DictCS1E02ValuationKeys.Add("VENTURE_EXCHANGE", "1102.34.01.");       //  SZ
            DictCS1E02ValuationKeys.Add("BOND_SUBJECT", "1202.01.01.");
            DictCS1E02ValuationKeys.Add("FUTURE_SUBJECT", "3102.04.01.");
            DictCS1E02ValuationKeys.Add("STOCKINDEX_SUBJECT", "3102.01.01.");
            DictCS1E02ValuationKeys.Add("STOCKINDEX_SUBJECT50", "3102.02.01.");
            DictCS1E02ValuationKeys.Add("FUND_SUBJECT", "1105.01.01.");
            DictCS1E02ValuationKeys.Add("FUND_SUBJECT_SZ", "1105.02.01.");
            DictCS1E02ValuationKeys.Add("BOND", "1103.12.01.");
            DictCS1E02ValuationKeys.Add("HKSTOCK", "1102.65.01.");
            DictCS1E02ValuationKeys.Add("CMF", "3102.06.01.");
            DictCS1E02ValuationKeys.Add("NATIONDEBTF", "310211010");


            DictCS1B02ValuationKeys = new Dictionary<string, string>();
            DictCS1B02ValuationKeys.Add("PortID",           "CS2B02");
            DictCS1B02ValuationKeys.Add("PortSName",        "中信主动02");
            DictCS1B02ValuationKeys.Add("InitialAsset",     "实收资本");
            DictCS1B02ValuationKeys.Add("GrossAsset",       "资产合计");
            DictCS1B02ValuationKeys.Add("GrossDebt",        "负债合计");
            DictCS1B02ValuationKeys.Add("FundAsset",        "资产净值");
            DictCS1B02ValuationKeys.Add("FundNAV",          "今日单位净值");
            DictCS1B02ValuationKeys.Add("FundAccount",      "1102");
            DictCS1B02ValuationKeys.Add("Location",         "9");
            DictCS1B02ValuationKeys.Add("FundNAVLocation",  "1");
            DictCS1B02ValuationKeys.Add("SH_EXCHANGE",      "1102.01.01.");       //  SH
            DictCS1B02ValuationKeys.Add("SZ_EXCHANGE",      "1102.33.01.");       //  SZ
            DictCS1B02ValuationKeys.Add("VENTURE_EXCHANGE", "1102.34.01.");       //  SZ
            DictCS1B02ValuationKeys.Add("BOND_SUBJECT",     "1202.01.01.");
            DictCS1B02ValuationKeys.Add("FUTURE_SUBJECT",   "3102.04.01.");
            DictCS1B02ValuationKeys.Add("STOCKINDEX_SUBJECT", "3102.01.01.");
            DictCS1B02ValuationKeys.Add("STOCKINDEX_SUBJECT50", "3102.02.01.");
            DictCS1B02ValuationKeys.Add("FUND_SUBJECT",     "1105.01.01.");
            DictCS1B02ValuationKeys.Add("FUND_SUBJECT_SZ", "1105.02.01.");
            DictCS1B02ValuationKeys.Add("BOND", "1103.12.01.");
            DictCS1B02ValuationKeys.Add("HKSTOCK", "1102.65.01.");
            DictCS1B02ValuationKeys.Add("CMF", "3102.06.01.");
            DictCS1B02ValuationKeys.Add("NATIONDEBTF", "310211010");

            DictCS1D01ValuationKeys = new Dictionary<string, string>();
            DictCS1D01ValuationKeys.Add("PortID",       "CS1D01");
            DictCS1D01ValuationKeys.Add("PortSName",    "中信精选01");
            DictCS1D01ValuationKeys.Add("InitialAsset", "实收资本");
            DictCS1D01ValuationKeys.Add("GrossAsset",   "资产合计");
            DictCS1D01ValuationKeys.Add("GrossDebt",    "负债类合计");
            DictCS1D01ValuationKeys.Add("FundAsset",    "资产净值");
            DictCS1D01ValuationKeys.Add("FundNAV",      "今日单位净值");
            DictCS1D01ValuationKeys.Add("FundAccount",  "1102");
            DictCS1D01ValuationKeys.Add("Location",     "9");
            DictCS1D01ValuationKeys.Add("FundNAVLocation", "1");
            DictCS1D01ValuationKeys.Add("SH_EXCHANGE", "1102.01.01.");       //  SH
            DictCS1D01ValuationKeys.Add("SZ_EXCHANGE", "1102.33.01.");       //  SZ
            DictCS1D01ValuationKeys.Add("VENTURE_EXCHANGE", "1102.34.01.");       //  SZ
            DictCS1D01ValuationKeys.Add("BOND_SUBJECT", "1202.01.01.");
            DictCS1D01ValuationKeys.Add("FUTURE_SUBJECT", "3102.04.01.");
            DictCS1D01ValuationKeys.Add("STOCKINDEX_SUBJECT", "3102.01.01.");
            DictCS1D01ValuationKeys.Add("STOCKINDEX_SUBJECT50", "3102.02.01.");
            DictCS1D01ValuationKeys.Add("FUND_SUBJECT", "1105.01.01.");
            DictCS1D01ValuationKeys.Add("FUND_SUBJECT_SZ", "1105.02.01.");
            DictCS1D01ValuationKeys.Add("BOND", "1103.12.01.");
            DictCS1D01ValuationKeys.Add("HKSTOCK", "1102.65.01.");
            DictCS1D01ValuationKeys.Add("CMF", "3102.06.01.");
            DictCS1D01ValuationKeys.Add("NATIONDEBTF", "310211010");

            

            
            DictCS1B02LocationKeys = new Dictionary<string, int>();
            DictCS1B02LocationKeys.Add("SecurityID",            0);
            DictCS1B02LocationKeys.Add("SecurityName",          1);
            DictCS1B02LocationKeys.Add("AvaiAmount",            4);
            DictCS1B02LocationKeys.Add("CostPirce",             5);
            DictCS1B02LocationKeys.Add("Cost",                  6);
            DictCS1B02LocationKeys.Add("RatioOfCost",           7);
            DictCS1B02LocationKeys.Add("ClosePx",               8);
            DictCS1B02LocationKeys.Add("MarketValue",           9);
            DictCS1B02LocationKeys.Add("RatioOfMarketValue",    10);
            DictCS1B02LocationKeys.Add("Increment",             11);
            DictCS1B02LocationKeys.Add("Suspension",            12);

            DictCS1D01LocationKeys = new Dictionary<string, int>();
            DictCS1D01LocationKeys.Add("SecurityID", 0);
            DictCS1D01LocationKeys.Add("SecurityName", 1);
            DictCS1D01LocationKeys.Add("AvaiAmount", 4);
            DictCS1D01LocationKeys.Add("CostPirce", 5);
            DictCS1D01LocationKeys.Add("Cost", 6);
            DictCS1D01LocationKeys.Add("RatioOfCost", 7);
            DictCS1D01LocationKeys.Add("ClosePx", 8);
            DictCS1D01LocationKeys.Add("MarketValue", 9);
            DictCS1D01LocationKeys.Add("RatioOfMarketValue", 10);
            DictCS1D01LocationKeys.Add("Increment", 11);
            DictCS1D01LocationKeys.Add("Suspension", 12);


            DictCS2B0201ValuationKeys = new Dictionary<string,string>();
            DictCS2B0201ValuationKeys.Add("PortID",             "CS2B0201");
            DictCS2B0201ValuationKeys.Add("PortSName",          "中信主动02");
            DictCS2B0201ValuationKeys.Add("InitialAsset",       "实收资本");
            DictCS2B0201ValuationKeys.Add("GrossAsset",         "资产合计");
            DictCS2B0201ValuationKeys.Add("GrossDebt",          "负债合计");
            DictCS2B0201ValuationKeys.Add("FundAsset",          "资产净值");
            DictCS2B0201ValuationKeys.Add("FundNAV",            "今日单位净值");
            DictCS2B0201ValuationKeys.Add("FundNAVLocation",    "1");
            DictCS2B0201ValuationKeys.Add("FundAccount",        "1102");
            DictCS2B0201ValuationKeys.Add("Location",           "9");
            DictCS2B0201ValuationKeys.Add("SH_EXCHANGE",        "1102.01.01.");       //  SH
            DictCS2B0201ValuationKeys.Add("SZ_EXCHANGE",        "1102.33.01.");       //  SZ
            DictCS2B0201ValuationKeys.Add("VENTURE_EXCHANGE",   "1102.34.01.");       //  SZ
            DictCS2B0201ValuationKeys.Add("BOND_SUBJECT",       "1202.01.01.");
            DictCS2B0201ValuationKeys.Add("FUTURE_SUBJECT",     "3102.04.01.");
            DictCS2B0201ValuationKeys.Add("STOCKINDEX_SUBJECT", "3102.01.01.");
            DictCS2B0201ValuationKeys.Add("STOCKINDEX_SUBJECT50", "3102.02.01.");
            DictCS2B0201ValuationKeys.Add("FUND_SUBJECT",       "1105.01.01.");
            DictCS2B0201ValuationKeys.Add("FUND_SUBJECT_SZ",    "1105.02.01.");

            DictCS2D0101ValuationKeys = new Dictionary<string, string>();
            DictCS2D0101ValuationKeys.Add("PortID",         "CS2D0101");
            DictCS2D0101ValuationKeys.Add("PortSName",      "中信精选从01");
            DictCS2D0101ValuationKeys.Add("InitialAsset",   "实收资本");
            DictCS2D0101ValuationKeys.Add("GrossAsset",     "资产合计");
            DictCS2D0101ValuationKeys.Add("GrossDebt",      "负债合计");
            DictCS2D0101ValuationKeys.Add("FundAsset",      "资产净值");
            DictCS2D0101ValuationKeys.Add("FundNAV",        "今日单位净值");
            DictCS2D0101ValuationKeys.Add("FundNAVLocation", "1");
            DictCS2D0101ValuationKeys.Add("FundAccount",     "1102");
            DictCS2D0101ValuationKeys.Add("Location",        "9");
            DictCS2D0101ValuationKeys.Add("SH_EXCHANGE",            "1102.01.01");       //  SH
            DictCS2D0101ValuationKeys.Add("SZ_EXCHANGE",            "1102.33.01");       //  SZ
            DictCS2D0101ValuationKeys.Add("VENTURE_EXCHANGE",       "1102.41.01");       //  SZ
            DictCS2D0101ValuationKeys.Add("BOND_SUBJECT",           "1202.01.01");
            DictCS2D0101ValuationKeys.Add("FUTURE_SUBJECT",         "3102.04.01");
            DictCS2D0101ValuationKeys.Add("STOCKINDEX_SUBJECT",     "3102.01.01");
            DictCS2D0101ValuationKeys.Add("STOCKINDEX_SUBJECT50",   "3102.02.01");
            DictCS2D0101ValuationKeys.Add("FUND_SUBJECT",           "1105.01.01");
            DictCS2D0101ValuationKeys.Add("FUND_SUBJECT_SZ",        "1105.02.01");          

            DictCM1B01ValuationKeys = new Dictionary<string, string>();
            DictCM1B01ValuationKeys.Add("PortID",           "CM1B01");
            DictCM1B01ValuationKeys.Add("PortSName",        "招商主动01");
            DictCM1B01ValuationKeys.Add("InitialAsset",     "实收资本");
            DictCM1B01ValuationKeys.Add("GrossAsset",       "资产合计");
            DictCM1B01ValuationKeys.Add("GrossDebt",        "负债合计");
            DictCM1B01ValuationKeys.Add("FundAsset",        "资产净值");
            DictCM1B01ValuationKeys.Add("FundNAV",          "单位净值");
            DictCM1B01ValuationKeys.Add("FundNAVLocation",  "1");
            DictCM1B01ValuationKeys.Add("FundAccount",      "1102");
            DictCM1B01ValuationKeys.Add("Location",         "7");
            DictCM1B01ValuationKeys.Add("SH_EXCHANGE",      "1102.01.01.");       //  SH
            DictCM1B01ValuationKeys.Add("SZ_EXCHANGE",      "1102.33.01.");       //  SZ
            DictCM1B01ValuationKeys.Add("VENTURE_EXCHANGE", "1102.34.01.");       //  SZ
            DictCM1B01ValuationKeys.Add("BOND_SUBJECT",     "1202.01.01.");
            DictCM1B01ValuationKeys.Add("FUTURE_SUBJECT",   "3102.04.01.");             // IF  空 3102.03.01
            DictCM1B01ValuationKeys.Add("STOCKINDEX_SUBJECT", "3102.01.01.");           // IC
            DictCM1B01ValuationKeys.Add("STOCKINDEX_SUBJECT50", "3102.02.01.");         // IH
            DictCM1B01ValuationKeys.Add("FUND_SUBJECT",         "1105.01.01.");         // 上交所基金
            DictCM1B01ValuationKeys.Add("FUND_SUBJECT_SZ",      "1105.13.01.");         // 深交所基金
            DictCM1B01ValuationKeys.Add("NEW_STOCK_SZ",         "1102.42.01.");         // 深交所新股
            DictCM1B01ValuationKeys.Add("NEW_STOCK_VENTURE",    "1102.41.01.");         // 创业板新股

            DictCM1B01LocationKeys = new Dictionary<string, int>();
            DictCM1B01LocationKeys.Add("SecurityID", 0);
            DictCM1B01LocationKeys.Add("SecurityName", 1);
            DictCM1B01LocationKeys.Add("AvaiAmount", 2);
            DictCM1B01LocationKeys.Add("CostPirce", 3);
            DictCM1B01LocationKeys.Add("Cost", 4);
            DictCM1B01LocationKeys.Add("RatioOfCost", 5);
            DictCM1B01LocationKeys.Add("ClosePx", 6);
            DictCM1B01LocationKeys.Add("MarketValue", 7);
            DictCM1B01LocationKeys.Add("RatioOfMarketValue", 8);
            DictCM1B01LocationKeys.Add("Increment", 9);
            DictCM1B01LocationKeys.Add("Suspension", 10);

            DictCM1H01ValuationKeys = new Dictionary<string, string>();
            DictCM1H01ValuationKeys.Add("PortID", "CM1H01");
            DictCM1H01ValuationKeys.Add("PortSName", "行业精选01");
            DictCM1H01ValuationKeys.Add("InitialAsset", "实收资本");
            DictCM1H01ValuationKeys.Add("GrossAsset", "资产合计");
            DictCM1H01ValuationKeys.Add("GrossDebt", "负债合计");
            DictCM1H01ValuationKeys.Add("FundAsset", "资产净值");
            DictCM1H01ValuationKeys.Add("FundNAV", "单位净值");
            DictCM1H01ValuationKeys.Add("FundNAVLocation", "1");
            DictCM1H01ValuationKeys.Add("FundAccount", "1102");
            DictCM1H01ValuationKeys.Add("Location", "7");
            DictCM1H01ValuationKeys.Add("SH_EXCHANGE", "1102.01.01.");       //  SH
            DictCM1H01ValuationKeys.Add("SZ_EXCHANGE", "1102.33.01.");       //  SZ
            DictCM1H01ValuationKeys.Add("VENTURE_EXCHANGE", "1102.34.01.");       //  SZ
            DictCM1H01ValuationKeys.Add("BOND_SUBJECT", "1202.01.01.");
            DictCM1H01ValuationKeys.Add("FUTURE_SUBJECT", "3102.04.01.");             // IF  空 3102.03.01
            DictCM1H01ValuationKeys.Add("STOCKINDEX_SUBJECT", "3102.01.01.");           // IC
            DictCM1H01ValuationKeys.Add("STOCKINDEX_SUBJECT50", "3102.02.01.");         // IH
            DictCM1H01ValuationKeys.Add("FUND_SUBJECT", "1105.01.01.");         // 上交所基金
            DictCM1H01ValuationKeys.Add("FUND_SUBJECT_SZ", "1105.13.01.");         // 深交所基金
            DictCM1H01ValuationKeys.Add("NEW_STOCK_SZ", "1102.42.01.");         // 深交所新股
            DictCM1H01ValuationKeys.Add("NEW_STOCK_VENTURE", "1102.41.01.");         // 创业板新股



            DictCM1A01ValuationKeys = new Dictionary<string, string>();
            DictCM1A01ValuationKeys.Add("PortID", "CM1A01");
            DictCM1A01ValuationKeys.Add("PortSName", "招商对冲01");
            DictCM1A01ValuationKeys.Add("InitialAsset", "实收资本");
            DictCM1A01ValuationKeys.Add("GrossAsset", "资产合计");
            DictCM1A01ValuationKeys.Add("GrossDebt", "负债合计");
            DictCM1A01ValuationKeys.Add("FundAsset", "资产净值");
            DictCM1A01ValuationKeys.Add("FundNAV", "单位净值");
            DictCM1A01ValuationKeys.Add("FundNAVLocation", "1");
            DictCM1A01ValuationKeys.Add("FundAccount", "1102");
            DictCM1A01ValuationKeys.Add("Location", "7");
            DictCM1A01ValuationKeys.Add("SH_EXCHANGE",  "1102.01.01.");       //  SH
            DictCM1A01ValuationKeys.Add("SZ_EXCHANGE", "1102.33.01.");       //  SZ
            DictCM1A01ValuationKeys.Add("VENTURE_EXCHANGE", "1102.34.01.");       //  SZ
            DictCM1A01ValuationKeys.Add("BOND_SUBJECT", "1202.01.01.");
            DictCM1A01ValuationKeys.Add("FUTURE_SUBJECT", "3102.04.01.");             // IF  空 3102.03.01
            DictCM1A01ValuationKeys.Add("STOCKINDEX_SUBJECT", "3102.01.01.");           // IC
            DictCM1A01ValuationKeys.Add("STOCKINDEX_SUBJECT50", "3102.02.01.");         // IH
            DictCM1A01ValuationKeys.Add("FUND_SUBJECT", "1105.01.01.");         // 上交所基金
            DictCM1A01ValuationKeys.Add("FUND_SUBJECT_SZ", "1105.13.01.");         // 深交所基金
            DictCM1A01ValuationKeys.Add("NEW_STOCK_SZ", "1102.42.01.");         // 深交所新股
            DictCM1A01ValuationKeys.Add("NEW_STOCK_VENTURE", "1102.41.01.");         // 创业板新股


            DictCM1A01LocationKeys = new Dictionary<string, int>();
            DictCM1A01LocationKeys.Add("SecurityID", 0);
            DictCM1A01LocationKeys.Add("SecurityName", 1);
            DictCM1A01LocationKeys.Add("AvaiAmount", 2);
            DictCM1A01LocationKeys.Add("CostPirce", 3);
            DictCM1A01LocationKeys.Add("Cost", 4);
            DictCM1A01LocationKeys.Add("RatioOfCost", 5);
            DictCM1A01LocationKeys.Add("ClosePx", 6);
            DictCM1A01LocationKeys.Add("MarketValue", 7);
            DictCM1A01LocationKeys.Add("RatioOfMarketValue", 8);
            DictCM1A01LocationKeys.Add("Increment", 9);
            DictCM1A01LocationKeys.Add("Suspension", 10);


            DictCM2B0101ValuationKeys = new Dictionary<string, string>();
            DictCM2B0101ValuationKeys.Add("PortID",             "CM2B0101");
            DictCM2B0101ValuationKeys.Add("PortSName",          "招商主动01");
            DictCM2B0101ValuationKeys.Add("InitialAsset",       "实收资本");
            DictCM2B0101ValuationKeys.Add("GrossAsset",         "资产合计");
            DictCM2B0101ValuationKeys.Add("GrossDebt",          "负债合计");
            DictCM2B0101ValuationKeys.Add("FundAsset",          "资产净值");
            DictCM2B0101ValuationKeys.Add("FundNAV",            "单位净值");
            DictCM2B0101ValuationKeys.Add("FundNAVLocation",    "1");
            DictCM2B0101ValuationKeys.Add("FundAccount",        "1102");
            DictCM2B0101ValuationKeys.Add("Location",           "7");
            DictCM2B0101ValuationKeys.Add("SH_EXCHANGE",        "1102.01.01.");       //  SH
            DictCM2B0101ValuationKeys.Add("SZ_EXCHANGE",        "1102.33.01.");       //  SZ
            DictCM2B0101ValuationKeys.Add("VENTURE_EXCHANGE",   "1102.34.01.");       //  SZ
            DictCM2B0101ValuationKeys.Add("BOND_SUBJECT",       "1202.01.01.");
            DictCM2B0101ValuationKeys.Add("FUTURE_SUBJECT",     "3102.04.01.");             // IF  空 3102.03.01
            DictCM2B0101ValuationKeys.Add("STOCKINDEX_SUBJECT", "3102.01.01.");           // IC
            DictCM2B0101ValuationKeys.Add("STOCKINDEX_SUBJECT50", "3102.02.01.");         // IH
            DictCM2B0101ValuationKeys.Add("FUND_SUBJECT",         "1105.01.01.");            // 上交所基金
            DictCM2B0101ValuationKeys.Add("FUND_SUBJECT_SZ",    "1105.13.01.");         // 深交所基金

            DictCM1C01ValuationKeys = new Dictionary<string, string>();
            DictCM1C01ValuationKeys.Add("PortID",           "CM1C01");
            DictCM1C01ValuationKeys.Add("PortSName",        "招商稳健01");
            DictCM1C01ValuationKeys.Add("InitialAsset",     "实收资本");
            DictCM1C01ValuationKeys.Add("GrossAsset",       "资产合计");
            DictCM1C01ValuationKeys.Add("GrossDebt",        "负债合计");
            DictCM1C01ValuationKeys.Add("FundAsset",        "资产净值");
            DictCM1C01ValuationKeys.Add("FundNAV",          "单位净值");
            DictCM1C01ValuationKeys.Add("FundNAVLocation",  "1");
            DictCM1C01ValuationKeys.Add("FundAccount",      "1102");
            DictCM1C01ValuationKeys.Add("Location",         "7");
            DictCM1C01ValuationKeys.Add("SH_EXCHANGE",      "1102.01.01.");       //  SH
            DictCM1C01ValuationKeys.Add("SZ_EXCHANGE",      "1102.33.01.");       //  SZ
            DictCM1C01ValuationKeys.Add("VENTURE_EXCHANGE", "1102.34.01.");       //  SZ
            DictCM1C01ValuationKeys.Add("BOND_SUBJECT",     "1202.01.01.");
            DictCM1C01ValuationKeys.Add("FUTURE_SUBJECT",   "3102.04.01.");             // IF  空 3102.03.01
            DictCM1C01ValuationKeys.Add("STOCKINDEX_SUBJECT", "3102.01.01.");           // IC
            DictCM1C01ValuationKeys.Add("STOCKINDEX_SUBJECT50", "3102.02.01.");         // IH
            DictCM1C01ValuationKeys.Add("FUND_SUBJECT",         "1105.01.01.");            // 上交所基金
            DictCM1C01ValuationKeys.Add("FUND_SUBJECT_SZ",      "1105.13.01.");         // 深交所基金

            DictCM2C0101ValuationKeys = new Dictionary<string, string>();
            DictCM2C0101ValuationKeys.Add("PortID",             "CM2C0101");
            DictCM2C0101ValuationKeys.Add("PortSName",          "招商稳健01");
            DictCM2C0101ValuationKeys.Add("InitialAsset",       "实收资本");
            DictCM2C0101ValuationKeys.Add("GrossAsset",         "资产合计");
            DictCM2C0101ValuationKeys.Add("GrossDebt",          "负债合计");
            DictCM2C0101ValuationKeys.Add("FundAsset",          "资产净值");
            DictCM2C0101ValuationKeys.Add("FundNAV",            "单位净值");
            DictCM2C0101ValuationKeys.Add("FundNAVLocation",    "1");
            DictCM2C0101ValuationKeys.Add("FundAccount",        "1102");
            DictCM2C0101ValuationKeys.Add("Location",           "7");
            DictCM2C0101ValuationKeys.Add("SH_EXCHANGE",        "1102.01.01.");       //  SH
            DictCM2C0101ValuationKeys.Add("SZ_EXCHANGE",        "1102.33.01.");       //  SZ
            DictCM2C0101ValuationKeys.Add("VENTURE_EXCHANGE",   "1102.34.01.");       //  SZ
            DictCM2C0101ValuationKeys.Add("BOND_SUBJECT",       "1202.01.01.");
            DictCM2C0101ValuationKeys.Add("FUTURE_SUBJECT",     "3102.04.01.");             // IF  空 3102.03.01
            DictCM2C0101ValuationKeys.Add("STOCKINDEX_SUBJECT", "3102.01.01.");           // IC
            DictCM2C0101ValuationKeys.Add("STOCKINDEX_SUBJECT50", "3102.02.01.");         // IH
            DictCM2C0101ValuationKeys.Add("FUND_SUBJECT",       "1105.01.01.");            // 上交所基金
            DictCM2C0101ValuationKeys.Add("FUND_SUBJECT_SZ",    "1105.13.01.");         // 深交所基金

            DictCM2A0101ValuationKeys = new Dictionary<string, string>();
            DictCM2A0101ValuationKeys.Add("PortID", "CM2A0101");
            DictCM2A0101ValuationKeys.Add("PortSName", "招商对冲从01");
            DictCM2A0101ValuationKeys.Add("InitialAsset", "实收资本");
            DictCM2A0101ValuationKeys.Add("GrossAsset", "资产合计");
            DictCM2A0101ValuationKeys.Add("GrossDebt", "负债合计");
            DictCM2A0101ValuationKeys.Add("FundAsset", "资产净值");
            DictCM2A0101ValuationKeys.Add("FundNAV", "单位净值");
            DictCM2A0101ValuationKeys.Add("FundNAVLocation", "1");
            DictCM2A0101ValuationKeys.Add("FundAccount", "1102");
            DictCM2A0101ValuationKeys.Add("Location", "7");
            DictCM2A0101ValuationKeys.Add("SH_EXCHANGE", "1102.01.01.");       //  SH
            DictCM2A0101ValuationKeys.Add("SZ_EXCHANGE", "1102.33.01.");       //  SZ
            DictCM2A0101ValuationKeys.Add("VENTURE_EXCHANGE", "1102.34.01.");       //  SZ
            DictCM2A0101ValuationKeys.Add("BOND_SUBJECT", "1202.01.01.");
            DictCM2A0101ValuationKeys.Add("FUTURE_SUBJECT", "3102.04.01.");             // IF  空 3102.03.01
            DictCM2A0101ValuationKeys.Add("STOCKINDEX_SUBJECT", "3102.01.01.");           // IC
            DictCM2A0101ValuationKeys.Add("STOCKINDEX_SUBJECT50", "3102.02.01.");         // IH
            DictCM2A0101ValuationKeys.Add("FUND_SUBJECT", "1105.01.01.");            // 上交所基金
            DictCM2A0101ValuationKeys.Add("FUND_SUBJECT_SZ", "1105.13.01.");         // 深交所基金


            /*************ProductInfo Define**************/
            DictProdInfoKeys = new Dictionary<string, string>();
            DictProdInfoKeys.Add("ProductName",             "产品名称");
            DictProdInfoKeys.Add("ProductID",               "产品ID");
            DictProdInfoKeys.Add("ProdSName",               "产品简称");
            DictProdInfoKeys.Add("FundManager",             "基金管理人");
            DictProdInfoKeys.Add("FundCustodian",           "基金托管人");
            DictProdInfoKeys.Add("FutureBroker",            "期货经纪商");
            DictProdInfoKeys.Add("CashSource",              "资金方");
            DictProdInfoKeys.Add("SaleOrgan",               "销售机构");
            DictProdInfoKeys.Add("ProdScale",               "产品规模");
            DictProdInfoKeys.Add("InferiorCash",            "劣后资金");
            DictProdInfoKeys.Add("PriorityCash",            "优先资金");
            DictProdInfoKeys.Add("ProdType",                "产品结构类型");
            DictProdInfoKeys.Add("IissueDate",              "成立时间");
            DictProdInfoKeys.Add("OperatePeriod",           "运作期限");
            DictProdInfoKeys.Add("OperateMode",             "运作方式");
            DictProdInfoKeys.Add("BlackoutPeriod",          "封闭期");
            DictProdInfoKeys.Add("OpenDate",                "开放日");
            DictProdInfoKeys.Add("ValuationOrgan",          "估值机构");
            DictProdInfoKeys.Add("ValuationFreq",           "估值频率");
            DictProdInfoKeys.Add("DisclosureFreq",          "净值披露频率");
            DictProdInfoKeys.Add("RecordUpdate",            "备案更新");
            DictProdInfoKeys.Add("StdExposure",             "标准敞口");
            DictProdInfoKeys.Add("FundNAV",                 "单位净值");
            DictProdInfoKeys.Add("AnnualReportMode",        "年报方式");
            DictProdInfoKeys.Add("WarningLine",             "预警线");
            DictProdInfoKeys.Add("StopLine",                "止损线");


            DictProdFeeKeys = new Dictionary<string, string>();
            DictProdFeeKeys.Add("ProductID", "产品ID");
            DictProdFeeKeys.Add("ProdSName", "产品简称");
            DictProdFeeKeys.Add("ManageFees", "管理费");
            DictProdFeeKeys.Add("ManageFeesPvs", "管理费计提方式");
            DictProdFeeKeys.Add("TrustFees", "托管费");
            DictProdFeeKeys.Add("TrustFeesPvs", "托管费计提方式");
            DictProdFeeKeys.Add("AdminServFees", "行政服务费");
            DictProdFeeKeys.Add("AdminServFeesPvs", "行政服务费计提方式");
            DictProdFeeKeys.Add("PurchaseFees", "认购费");
            DictProdFeeKeys.Add("RedeemRemark", "赎回");
            DictProdFeeKeys.Add("Reward", "业绩报酬");
            DictProdFeeKeys.Add("SlottingFees", "通道费");
            DictProdFeeKeys.Add("SlottingFeesPvs", "通道费计提方式");
            DictProdFeeKeys.Add("ClassABase", "优先方业绩比较基准");
            DictProdFeeKeys.Add("FixedInvestFees", "固定投顾费");
            DictProdFeeKeys.Add("FixedInvestFeesPvs", "固定投顾费计提方式");

            PORTSNAMES = new Dictionary<string, string>();
            PORTSNAMES.Add("招商稳健1号", "CM1C01");
            PORTSNAMES.Add("招商主动1号", "CM1B01");
            PORTSNAMES.Add("中信主动2号", "CS1B02");
            PORTSNAMES.Add("中信自营",    "CS9Z01");

            PORTSNAMESCHANGEMAP = new Dictionary<string, string>();
            PORTSNAMESCHANGEMAP.Add("招商稳健1号", "招商稳健01");
            PORTSNAMESCHANGEMAP.Add("招商主动1号", "招商主动01");
            PORTSNAMESCHANGEMAP.Add("中信主动2号", "中信主动02");
            PORTSNAMESCHANGEMAP.Add("中信自营", "中信自营");

        }
        

    }
}

