USE [jydb_all]
GO

/****** Object:  Table [dbo].[dpProd]    Script Date: 06/02/2017 14:40:49 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[dpProd](
	[Date] [date] NULL,
	[PortID] [nvarchar](32) NULL,
	[PortSName] [nchar](32) NULL,
	[InitialAsset] [numeric](18, 3) NULL,
	[GrossAsset] [numeric](18, 3) NULL,
	[GrossDebt] [numeric](18, 3) NULL,
	[NetAsset] [numeric](18, 3) NULL,
	[FundNAV] [numeric](18, 4) NULL,
	[TimeStamp] [datetime] NULL
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[dpProd] ADD  CONSTRAINT [DF_dpProd_1_timestamp]  DEFAULT (getdate()) FOR [TimeStamp]
GO


