USE [jydb_all]
GO
/****** Object:  StoredProcedure [dbo].[calcnav]    Script Date: 06/02/2017 15:08:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO



ALTER procedure [dbo].[calcnav] 
	@date		   nvarchar(10),
	@calc		   int
as

set nocount on
begin
	declare 
		@cashprecision int,
		@posprecision  int,
		@LastTradeDate nvarchar(10)
	
	set @cashprecision  = 2
	set @posprecision   = 3

	 
	if(@calc = 1)
		begin
			-- update stockmarketvalue
			begin
				update a set a.stockmarketvalue = b.mkv, a.UpdateTime = getdate()
				from Fund a, (select * from v_dpstockmkv where date = @date) b
				where a.date = b.date and a.PortID = b.portid and a.date = @date
			end

			-- update futuremkv
			begin
				update a set a.futuremkv = b.hedgemkv, a.UpdateTime = getdate()
				from Fund a, (select * from v_dpfuturehedgemkv where date = @date ) b
				where a.date = b.date and a.PortID = b.portid and a.date = @date
			end

			-- update futuredebt
			begin
				update a set a.FutureDebt = b.NationlDebtmkv, a.UpdateTime = getdate()
				from Fund a, (select * from v_dpNationlDebtmkv where date = @date ) b
				where a.date = b.date and a.PortID = b.portid and a.date = @date
			end

				
			-- update fundmkv ���ڼ������λ
			begin
				with fundtmp as( 
				select date, PortID, PortSName, SecurityID, SecurityName, holdingamount, enableamount, ClosePx  from v_Fundmkv where date = @date and enableamount >0
				union
				select date, PortID, PortSName, SecurityID, SecurityName, EntrustAmount as holdingamount, EntrustAmount as enableamount, '1' as ClosePx from Entrust  where date = @date and EntrustBs = '�깺' and (TradeStatus = '�ѱ�' or TradeStatus = 'δ�ɽ�'))
				
				update a set a.FundMarketValue = b.fundmkv
				from Fund a, (select date, PortID, PortSName, SUM(enableamount*ClosePx) as fundmkv from fundtmp where date = @date group by date, PortID, PortSName) b
				where a.date = b.date and a.PortID = b.PortID;	
			end
			
						
			-- calculate ppt02 stockcash
			begin
				update Fund set 
				stockcash = securitycapital - ISNULL(StockMarketValue, 0) - ISNULL(FundMarketValue, 0),
				FutureCash = FutureCapital - FutureMargin
				where portsname = 'ppt02' and date = @date
			end
			
			-- calculate �����Գ�01 FutureMargin
			begin
				update Fund set FutureMargin = FutureCapital - FutureCash
				where PortSName = '�����Գ�01' and date = @date
			end
			
			-- calculate 

			-- update CapitalFundMarketValue ���ڼ���֤ȯ�˻����ʲ�
			begin
				with tmp as( 
					select date, PortID, PortSName, sum(entrustamount) as fundmkv from Entrust where EntrustBS = '�깺' and date = @date and (TradeStatus = '�ѱ�' or TradeStatus = 'δ�ɽ�') group by date, PortID, PortSName
					union	
					select date, PortID, PortSName, SUM(HoldingAmount*ClosePx) as fundmkv from PortDetails where date = @date and SecurityType = '3' group by date, PortID, PortSName)

				update a set a.CapitalFundMarketValue = b.fundmkv
				from Fund a, (select date, PortID, PortSName,SUM(fundmkv) as fundmkv from tmp group by date, PortID, PortSName) b
				where a.date = b.date and a.PortID = b.PortID;
			end
						
			
			
			-- calc securitycaptial2
			exec  LastTradingday @date, @LastTradeDate output
			begin
				with Redeem as(
				select date, PortID, PortSName, sum(EntrustAmount*TradePrice) as RedeemAmt  from Entrust  where date = @LastTradeDate and EntrustBs = '���' and (TradeStatus = '�ѱ�' or TradeStatus = 'δ�ɽ�') group by date, PortID, PortSName)
				
				update 
					a set a.PreRedeemAmt = b.RedeemAmt
				from
					Fund a, Redeem b
				where a.date = @date and a.PortID = b.PortID;
				
				update a set a.SecurityCapital2 = ISNULL(a.CapitalFundMarketValue, 0) + ISNULL(a.StockCash, 0) + ISNULL(a.StockMarketValue,0) + ISNULL(a.PreRedeemAmt, 0)
				from Fund a where a.date = @date;	
			end
			

		end			
		
		
		

	begin
		with fundtmp as(select 
			rtrim(PortID) as portid,
			rtrim(portsname) as portsname,  
			(case when PortSName in ('ppt01', 'ppt02')  then SecurityCapital2 
				  else SecurityCapital end) as SecurityCapital,
			ISNULL(StockCash, 0) as stockcash,
			ISNULL(FutureMargin, 0) as futuremargin,
			ISNULL(FutureCash, 0) as futurecash,
			ISNULL(StockMarketValue, 0) as stockmarketvalue,
			ISNULL(FundMarketValue, 0) as fundmarketvalue,
			ISNULL(futuremkv, 0) as futuremkv,
			ISNULL(FutureDebt, 0) as futuredebt,
			futurecapital
			from 
				Fund a
			where 
				a.date = @date)
		
		select 
			rtrim(portsname)																							as '��Ʒ���',
			round(SecurityCapital, @cashprecision)																		as '֤ȯ�ʲ�',
			round(FutureCapital, @cashprecision)																		as '�ڻ��ʲ�',
			round(SecurityCapital+futurecapital, @cashprecision)														as '���ʲ�',
			round(stockcash, @cashprecision)																			as '��Ʊ�ֽ�',
			round(futuremargin, @cashprecision)																			as '�ڻ���֤��',
			round(futurecash, @cashprecision)																			as '�ڻ��ֽ�',
			round(stockcash+futurecapital, @cashprecision)																as '�ֽ�',
			round(stockmarketvalue, @cashprecision)																		as '��Ʊ��ֵ',
			convert(decimal(18,3), 100*stockmarketvalue/(SecurityCapital+futurecapital))								as '��Ʊ��λ(%)',
			round(fundmarketvalue, @cashprecision)																		as '������ֵ',
			convert(decimal(18,3), 100*fundmarketvalue/(SecurityCapital+futurecapital))									as '�����λ(%)',
			round(futuremkv, @cashprecision)																			as '��ָ�ڻ���ֵ',
			convert(decimal(18,3), 100*futuremkv/(SecurityCapital+futurecapital)) 										as '��ָ�ڻ���λ',
			convert(decimal(18,3), abs(100*futuremargin/futurecapital))													as '��ָ�ڻ���֤��ռ��(%)',
			round(futuredebt, @cashprecision)																			as '��ծ�ֻ�+��ծ�ڻ���ֵ',
			convert(decimal(18,3), 100*futuredebt/(SecurityCapital+futurecapital))										as '��ծ�ֻ�+��ծ�ڻ���λ(%)',
			convert(decimal(18,3), 100*(stockmarketvalue+fundmarketvalue+futuremkv)/(SecurityCapital+futurecapital))		as '����(%)',
			portid
		from 
			fundtmp
		order by portsname
	end
end

