USE [jydb_all]
GO

/****** Object:  Table [dbo].[dpPortDetails]    Script Date: 09/09/2015 20:12:51 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[dpPortDetails](
	[Date] [date] NULL,
	[PortID] [nchar](10) NULL,
	[PortSName] [nchar](50) NULL,
	[SecurityID] [nchar](10) NULL,
	[SecurityName] [nchar](32) NULL,
	[SecurityType] [nchar](2) NULL,
	[HoldingAmount] [int] NULL,
	[EnableAmount] [int] NULL,
	[MoneyType] [nchar](32) NULL,
	[CostPx] [numeric](18, 3) NULL,
	[CostMarketValue] [numeric](18, 3) NULL,
	[CurrentMarketValue] [numeric](18, 3) NULL,
	[ClosePx] [numeric](18, 3) NULL,
	[HolderAccount] [nchar](32) NULL,
	[PnL] [numeric](18, 3) NULL,
	[BuyVolume] [int] NULL,
	[SellVolume] [char](10) NULL,
	[UpdateTime] [datetime] NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品简称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpPortDetails', @level2type=N'COLUMN',@level2name=N'PortSName'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'持仓数量
   ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpPortDetails', @level2type=N'COLUMN',@level2name=N'HoldingAmount'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'可用数量' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpPortDetails', @level2type=N'COLUMN',@level2name=N'EnableAmount'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'更新时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'dpPortDetails', @level2type=N'COLUMN',@level2name=N'UpdateTime'
GO

ALTER TABLE [dbo].[dpPortDetails] ADD  CONSTRAINT [DF_dpPortDetials_1_timestamp]  DEFAULT (getdate()) FOR [UpdateTime]
GO


