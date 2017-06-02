

use jydb_all
go

if exists (select 1
            from  sysobjects
           where  id = object_id('FutureTransDetails')
            and   type = 'U')
   drop table FutureTransDetails
go

create table FutureTransDetails (
   Date                 date              null,
   ProductID            nchar(10)            collate Chinese_PRC_CI_AS null,
   ProdSName            nchar(50)            null,
   InstrID              nchar(30)            null,
   TradeAmount          int                  null,
   TradeID              nchar(10)            collate Chinese_PRC_CI_AS null,
   TradePrice           numeric(18,3)        null,
   TradeTime            time             null,
   TradeVolume          int                  null,
   EntrustBS            nchar(2)             collate Chinese_PRC_CI_AS null,
   OffsetFlag           nchar(32)            null,
   OrderID              nchar(32)            null,
   UpdateTime           datetime             null
)
go

ALTER TABLE [dbo].FutureTransDetails ADD  CONSTRAINT [DF_FutureTransDetails_1_timestamp]  DEFAULT (getdate()) FOR [UpdateTime]
GO


if exists (select 1
            from  sysproperties
           where  id = object_id('FutureTransDetails')
            and   type = 4)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'FutureTransDetails', 'column', 'ProdSName'


end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   '产品简称',
   'user', @CurrentUser, 'table', 'FutureTransDetails', 'column', 'ProdSName'
go

if exists (select 1
            from  sysproperties
           where  id = object_id('FutureTransDetails')
            and   type = 4)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'FutureTransDetails', 'column', 'UpdateTime'


end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   '更新时间',
   'user', @CurrentUser, 'table', 'FutureTransDetails', 'column', 'UpdateTime'
go
