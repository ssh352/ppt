USE [jydb_all]
GO

/****** Object:  Table [dbo].[FuturePos]    Script Date: 09/09/2015 20:31:31 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[FuturePos](
	[Date] [date] NULL,
	[PortID] [nchar](10) NULL,
	[PortSName] [nchar](50) NULL,
	[PartID] [nchar](12) NULL,
	[ClientID] [nchar](12) NULL,
	[InstrID] [nchar](30) NULL,
	[ClearPrice] [numeric](18, 3) NULL,
	[BopenAmt] [int] NULL,
	[BoffAmt] [int] NULL,
	[BuyAmt] [int] NULL,
	[SopenAmt] [int] NULL,
	[SoffAmt] [int] NULL,
	[SellAmt] [int] NULL,
	[BuySum] [numeric](18, 3) NULL,
	[SellSum] [numeric](18, 3) NULL,
	[bTotalAmt] [int] NULL,
	[sTotalAmt] [int] NULL,
	[Margin] [numeric](18, 3) NULL,
	[Actual] [numeric](18, 3) NULL,
	[Transfee] [numeric](18, 3) NULL,
	[UpdateTime] [datetime] NULL
) ON [PRIMARY]

GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品简称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'FuturePos', @level2type=N'COLUMN',@level2name=N'PortSName'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'更新时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'FuturePos', @level2type=N'COLUMN',@level2name=N'UpdateTime'
GO

ALTER TABLE [dbo].[FuturePos] ADD  CONSTRAINT [DF_FuturePos_1_timestamp]  DEFAULT (getdate()) FOR [UpdateTime]
GO


