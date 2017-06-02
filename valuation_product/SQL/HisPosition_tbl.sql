USE [jydb_all]
GO

/****** Object:  Table [dbo].[HisPosition]    Script Date: 06/25/2015 15:51:56 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[HisPosition](
	[Date] [date] NULL,
	[FundAccount] [nchar](10) NULL,
	[FundName] [nchar](32) NULL,
	[StockExchange] [nchar](20) NULL,
	[SecurityID] [nchar](10) NULL,
	[SecurityName] [nchar](32) NULL,
	[SecurityType] [nchar](20) NULL,
	[EnableAmount] [int] NULL,
	[HoldingAmount] [int] NULL,
	[CostPx] [numeric](18, 3) NULL,
	[ClosePx] [numeric](18, 3) NULL,
	[Assets] [numeric](18, 3) NULL,
	[CurrentMarketValue] [numeric](18, 3) NULL,
	[CurrentPnL] [numeric](18, 3) NULL,
	[AccumulatedPnL] [numeric](18, 3) NULL,
	[FloatPnL] [numeric](18, 3) NULL,
	[GrossPnL] [numeric](18, 3) NULL,
	[Suspension] [nchar](32) NULL
) ON [PRIMARY]

GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'可用数量' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'HisPosition', @level2type=N'COLUMN',@level2name=N'EnableAmount'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'持仓数量
   ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'HisPosition', @level2type=N'COLUMN',@level2name=N'HoldingAmount'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'累计收益' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'HisPosition', @level2type=N'COLUMN',@level2name=N'AccumulatedPnL'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'总体盈亏' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'HisPosition', @level2type=N'COLUMN',@level2name=N'GrossPnL'
GO


