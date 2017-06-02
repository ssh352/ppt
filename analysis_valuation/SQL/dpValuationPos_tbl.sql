USE [jydb_all]
GO

/****** Object:  Table [dbo].[dpValuationPos]    Script Date: 06/02/2017 14:39:24 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[dpValuationPos](
	[Date] [date] NULL,
	[FundAccount] [nchar](10) NULL,
	[PortID] [nchar](32) NULL,
	[PortSName] [nchar](32) NULL,
	[SecurityID] [nchar](10) NULL,
	[SecurityName] [nchar](32) NULL,
	[StockExchange] [nchar](8) NULL,
	[SecurityType] [nchar](2) NULL,
	[HoldingAmount] [int] NULL,
	[CostPx] [numeric](18, 3) NULL,
	[CostMarketValue] [numeric](18, 3) NOT NULL,
	[PctMVofCost] [numeric](18, 4) NOT NULL,
	[ClosePx] [numeric](18, 3) NULL,
	[CurrentMarketValue] [numeric](18, 3) NULL,
	[PctMVofCurrent] [numeric](18, 4) NOT NULL,
	[PnL] [numeric](18, 3) NOT NULL,
	[Suspension] [nchar](32) NULL,
	[TimeStamp] [datetime] NULL
) ON [PRIMARY]

GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'³Ö²ÖÊýÁ¿
   ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpValuationPos', @level2type=N'COLUMN',@level2name=N'HoldingAmount'
GO

ALTER TABLE [dbo].[dpValuationPos] ADD  CONSTRAINT [DF_dpValuationPos_1_timestamp]  DEFAULT (getdate()) FOR [TimeStamp]
GO


