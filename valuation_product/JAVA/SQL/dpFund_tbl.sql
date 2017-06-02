USE [jydb_all]
GO

/****** Object:  Table [dbo].[dpFund]    Script Date: 09/09/2015 20:27:56 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[dpFund](
	[Date] [date] NULL,
	[PortID] [nchar](10) NULL,
	[PortSName] [nchar](50) NULL,
	[FundNAV] [numeric](18, 4) NULL,
	[MoneyType] [nchar](32) NULL,
	[StockCash] [numeric](18, 3) NULL,
	[StockMarketValue] [numeric](18, 3) NULL,
	[SecurityCapital] [numeric](18, 3) NULL,
	[SecurityCapital2] [numeric](18, 3) NULL,
	[FundMarketValue] [numeric](18, 3) NULL,
	[CapitalFundMarketValue] [numeric](18, 3) NULL,
	[PreRedeemAmt] [numeric](18, 3) NULL,
	[FutureCash] [numeric](18, 3) NULL,
	[FutureMargin] [numeric](18, 3) NULL,
	[FutureMkv] [numeric](18, 3) NULL,
	[FutureDebt] [numeric](18, 3) NULL,
	[FutureCapital] [numeric](18, 3) NULL,
	[Remark] [nchar](255) NULL,
	[UpdateTime] [datetime] NULL
) ON [PRIMARY]

GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品简称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpFund', @level2type=N'COLUMN',@level2name=N'PortSName'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'g_股票现金' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpFund', @level2type=N'COLUMN',@level2name=N'StockCash'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'g_股票市值' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpFund', @level2type=N'COLUMN',@level2name=N'StockMarketValue'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'q_期货现金' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpFund', @level2type=N'COLUMN',@level2name=N'FutureCash'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'q_期货保证金' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpFund', @level2type=N'COLUMN',@level2name=N'FutureMargin'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'更新时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpFund', @level2type=N'COLUMN',@level2name=N'UpdateTime'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'资金表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpFund'
GO

ALTER TABLE [dbo].[dpFund] ADD  CONSTRAINT [DF_dpFund_1_timestamp]  DEFAULT (getdate()) FOR [UpdateTime]
GO


