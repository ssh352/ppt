USE [jydb_all]
GO

/****** Object:  Table [dbo].[HisTrade]    Script Date: 06/25/2015 14:40:37 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[HisTrade](
	[DeptID] [nchar](10) NULL,
	[DeptName] [nchar](50) NULL,
	[PortID] [nvarchar](32) NULL,
	[ProductID] [nchar](10) NULL,
	[ProductName] [nchar](100) NULL,
	[BranchNo] [nchar](10) NULL,
	[BranchName] [nchar](50) NULL,
	[FundAccount] [nchar](10) NULL,
	[FundName] [nchar](32) NULL,
	[StockExchange] [nchar](2) NULL,
	[SecurityType] [nchar](2) NULL,
	[SecurityID] [nchar](10) NULL,
	[SecurityName] [nchar](32) NULL,
	[EntrustBS] [nchar](30) NULL,
	[TradeDate] [datetime] NULL,
	[HolderAccount] [nchar](32) NULL,
	[TradeID] [nchar](10) NULL,
	[TradeVolume] [int] NULL,
	[AvgPx] [numeric](18, 3) NULL,
	[NetValue] [numeric](18, 3) NULL,
	[TradePrice] [numeric](18, 3) NULL,
	[GrossValue] [numeric](18, 3) NULL,
	[NationalDebtInt] [numeric](18, 3) NULL,
	[ExchangeAvgPx] [numeric](18, 3) NULL,
	[ClosePx] [numeric](18, 3) NULL,
	[TradeTime] [time](0) NOT NULL
) ON [PRIMARY]

GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'HisTrade', @level2type=N'COLUMN',@level2name=N'ProductName'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'全价成交金额' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'HisTrade', @level2type=N'COLUMN',@level2name=N'GrossValue'
GO


