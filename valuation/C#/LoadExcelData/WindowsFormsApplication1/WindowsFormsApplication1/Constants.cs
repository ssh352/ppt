using System;

namespace DPExcelFileLoad{
    class Constants
    {
        private Dictionary<string, string> TradeKeys;

        Constants(){
            TradeKeys = Dictionary<string, string>();
            TradeKeys.add("部门编号", "DeptID");
            TradeKeys.add("部门名称", "DeptName");
            TradeKeys.add("组合ID", "ProtID");
            TradeKeys.add("项目编号", "ProductID");
            TradeKeys.add("项目简称", "ProductName");
            TradeKeys.add("营业部号", "branch_no");
            TradeKeys.add("营业部名称", "branch_name");
            TradeKeys.add("资金帐号", "fund_account");
            TradeKeys.add("帐号简称", "fund_name");
            TradeKeys.add("交易类别", "SecurityExchange");
            TradeKeys.add("证券类别", "SecurityType");
            TradeKeys.add("证券代码", "SecurityID");
            TradeKeys.add("证券名称", "SecurityName");
            TradeKeys.add("委托方向", "entrust_bs");
            TradeKeys.add("成交日期", "TradeDate");
            TradeKeys.add("股东帐号", "holder_account");
            TradeKeys.add("成交编号", "TradeID");
            TradeKeys.add("成交数量", "TradeVolume");
            TradeKeys.add("成交均价", "AvgPx");
            TradeKeys.add("净价金额", "NetValue");
            TradeKeys.add("成交全价", "TradePrice");
            TradeKeys.add("全价成交金额", "GrossValue");
            TradeKeys.add("国债利息", "NationalDebtInt");
            TradeKeys.add("交易所成交均价", "ExchangeAvgPx");
            TradeKeys.add("收盘价", "ClosePx");
            TradeKeys.add("成交时间", "TradeTime");
        }

    }
}