



use jydb_all
go


if exists (select 1
            from  sysobjects
           where  id = object_id('dpHisFuturePos')
            and   type = 'U')
   drop table dpHisFuturePos
go

create table dpHisFuturePos (
   Date                 date                 null,
   ProductID            nchar(10)            collate Chinese_PRC_CI_AS null,
   ProdSName            nchar(50)            null,
   PartID               nchar(12)            null,
   ClientID             nchar(12)            null,
   InstrID              nchar(30)            null,
   ClearPrice           numeric(18,3)        null,
   BopenAmt             int                  null,
   BoffAmt              int                  null,
   BuyAmt               int                  null,
   SopenAmt             int                  null,
   SoffAmt              int                  null,
   SellAmt              int                  null,
   BuySum               numeric(18,3)        null,
   SellSum              numeric(18,3)        null,
   bTotalAmt            int                  null,
   sTotalAmt            int                  null,
   Margin               numeric(18,3)        null,
   Actual               numeric(18,3)        null,
   Transfee             numeric(18,3)        null,
   UpdateTime           datetime             null
)
go


ALTER TABLE dpHisFuturePos ADD  CONSTRAINT [DF_dpHisFuturePos_1_timestamp]  DEFAULT (getdate()) FOR [UpdateTime]
GO


if exists (select 1
            from  sysproperties
           where  id = object_id('dpHisFuturePos')
            and   type = 4)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'dpHisFuturePos', 'column', 'ProdSName'


end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   '²úÆ·¼ò³Æ',
   'user', @CurrentUser, 'table', 'dpHisFuturePos', 'column', 'ProdSName'
go
