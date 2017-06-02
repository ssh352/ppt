USE [jydb_all]
GO

/****** Object:  Table [dbo].[TransDetails]    Script Date: 09/09/2015 20:34:35 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[TransDetails](
	[Date] [date] NULL,
	[PortID] [nchar](10) NULL,
	[PortSName] [nchar](50) NULL,
	[SecurityID] [nchar](10) NULL,
	[SecurityName] [nchar](32) NULL,
	[SecurityType] [nchar](2) NULL,
	[EntrustBS] [nchar](2) NULL,
	[TradeTime] [time](7) NULL,
	[TradeVolume] [int] NULL,
	[AvgPx] [numeric](18, 3) NULL,
	[TradeAmount] [numeric](18, 3) NULL,
	[EnturstNo] [nchar](32) NULL,
	[HolderAccount] [nchar](32) NULL,
	[TradeID] [nchar](10) NULL,
	[UpdateTime] [datetime] NULL
) ON [PRIMARY]

GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品简称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TransDetails', @level2type=N'COLUMN',@level2name=N'PortSName'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'w_委托编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TransDetails', @level2type=N'COLUMN',@level2name=N'EnturstNo'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'更新时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TransDetails', @level2type=N'COLUMN',@level2name=N'UpdateTime'
GO

ALTER TABLE [dbo].[TransDetails] ADD  CONSTRAINT [DF_TransDetails_1_timestamp]  DEFAULT (getdate()) FOR [UpdateTime]
GO


