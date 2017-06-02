USE [jydb_all]
GO

/****** Object:  Table [dbo].[Entrust]    Script Date: 09/09/2015 20:33:08 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Entrust](
	[Date] [date] NULL,
	[PortID] [nchar](10) NULL,
	[PortSName] [nchar](50) NULL,
	[SecurityName] [nchar](32) NULL,
	[SecurityID] [nchar](10) NULL,
	[EntrustBS] [nchar](32) NULL,
	[EntrustPrice] [numeric](18, 3) NULL,
	[EntrustAmount] [int] NULL,
	[TradePrice] [numeric](18, 3) NULL,
	[TradeVolume] [int] NULL,
	[TradeStatus] [nchar](32) NULL,
	[EntrustTime] [time](7) NULL,
	[EnturstNo] [nchar](32) NULL,
	[HolderAccount] [nchar](32) NULL,
	[QuoteWay] [nchar](32) NULL,
	[EntrustWay] [nchar](32) NULL,
	[EntrustIndex] [nchar](32) NULL,
	[Remark] [nchar](255) NULL,
	[UpdateTime] [datetime] NULL
) ON [PRIMARY]

GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品简称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'Entrust', @level2type=N'COLUMN',@level2name=N'PortSName'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'j_交易状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'Entrust', @level2type=N'COLUMN',@level2name=N'TradeStatus'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'w_委托时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'Entrust', @level2type=N'COLUMN',@level2name=N'EntrustTime'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'w_委托编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'Entrust', @level2type=N'COLUMN',@level2name=N'EnturstNo'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'b_报价方式' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'Entrust', @level2type=N'COLUMN',@level2name=N'QuoteWay'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'w_委托方式' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'Entrust', @level2type=N'COLUMN',@level2name=N'EntrustWay'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'w_委托序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'Entrust', @level2type=N'COLUMN',@level2name=N'EntrustIndex'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'更新时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'Entrust', @level2type=N'COLUMN',@level2name=N'UpdateTime'
GO

ALTER TABLE [dbo].[Entrust] ADD  CONSTRAINT [DF_Entrust_1_timestamp]  DEFAULT (getdate()) FOR [UpdateTime]
GO


