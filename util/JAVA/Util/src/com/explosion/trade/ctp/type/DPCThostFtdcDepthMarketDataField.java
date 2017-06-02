/*** Eclipse Class Decompiler plugin, copyright (c) 2012 Chao Chen (cnfree2000@hotmail.com) ***/
package com.explosion.trade.ctp.type;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;
import net.jctp.CThostFtdcDepthMarketDataField;

public final class DPCThostFtdcDepthMarketDataField implements Serializable {
	public String TradingDay;
	public String InstrumentID;
	public String ExchangeID;
	public String ExchangeInstID;
	public double LastPrice;
	public double PreSettlementPrice;
	public double PreClosePrice;
	public double PreOpenInterest;
	public double OpenPrice;
	public double HighestPrice;
	public double LowestPrice;
	public int Volume;
	public double Turnover;
	public double OpenInterest;
	public double ClosePrice;
	public double SettlementPrice;
	public double UpperLimitPrice;
	public double LowerLimitPrice;
	public double PreDelta;
	public double CurrDelta;
	public String UpdateTime;
	public int UpdateMillisec;
	public double BidPrice1;
	public int BidVolume1;
	public double AskPrice1;
	public int AskVolume1;
	public double BidPrice2;
	public int BidVolume2;
	public double AskPrice2;
	public int AskVolume2;
	public double BidPrice3;
	public int BidVolume3;
	public double AskPrice3;
	public int AskVolume3;
	public double BidPrice4;
	public int BidVolume4;
	public double AskPrice4;
	public int AskVolume4;
	public double BidPrice5;
	public int BidVolume5;
	public double AskPrice5;
	public int AskVolume5;
	public double AveragePrice;
	public String ActionDay;

	public DPCThostFtdcDepthMarketDataField() {
	}
	
	public DPCThostFtdcDepthMarketDataField(CThostFtdcDepthMarketDataField r){
		this.TradingDay = r.TradingDay;
		this.InstrumentID = r.InstrumentID;
		this.ExchangeID = r.ExchangeID;
		this.ExchangeInstID = r.ExchangeInstID;
		this.LastPrice = r.LastPrice;
		this.PreSettlementPrice = r.PreSettlementPrice;
		this.PreClosePrice = r.PreClosePrice;
		this.PreOpenInterest = r.PreOpenInterest;
		this.OpenPrice = r.OpenPrice;
		this.HighestPrice = r.HighestPrice;
		this.LowestPrice = r.LowestPrice;
		this.Volume = r.Volume;
		this.Turnover = r.Turnover;
		this.OpenInterest = r.OpenInterest;
		this.ClosePrice = r.ClosePrice;
		this.SettlementPrice = r.SettlementPrice;
		this.UpperLimitPrice = r.UpperLimitPrice;
		this.LowerLimitPrice = r.LowerLimitPrice;
		this.PreDelta = r.PreDelta;
		this.CurrDelta = r.CurrDelta;
		this.UpdateTime = r.UpdateTime;
		this.UpdateMillisec = r.UpdateMillisec;
		this.BidPrice1 = r.BidPrice1;
		this.BidVolume1 = r.BidVolume1;
		this.AskPrice1 = r.AskPrice1;
		this.AskVolume1 = r.AskVolume1;
		this.BidPrice2 = r.BidPrice2;
		this.BidVolume2 = r.BidVolume2;
		this.AskPrice2 = r.AskPrice2;
		this.AskVolume2 = r.AskVolume2;
		this.BidPrice3 = r.BidPrice3;
		this.BidVolume3 = r.BidVolume3;
		this.AskPrice3 = r.AskPrice3;
		this.AskVolume3 = r.AskVolume3;
		this.BidPrice4 = r.BidPrice4;
		this.BidVolume4 = r.BidVolume4;
		this.AskPrice4 = r.AskPrice4;
		this.AskVolume4 = r.AskVolume4;
		this.BidPrice5 = r.BidPrice5;
		this.BidVolume5 = r.BidVolume5;
		this.AskPrice5 = r.AskPrice5;
		this.AskVolume5 = r.AskVolume5;
		this.AveragePrice = r.AveragePrice;
		this.ActionDay = r.ActionDay;
	}

	public DPCThostFtdcDepthMarketDataField(String paramString1,
			String paramString2, String paramString3, String paramString4,
			double paramDouble1, double paramDouble2, double paramDouble3,
			double paramDouble4, double paramDouble5, double paramDouble6,
			double paramDouble7, int paramInt1, double paramDouble8,
			double paramDouble9, double paramDouble10, double paramDouble11,
			double paramDouble12, double paramDouble13, double paramDouble14,
			double paramDouble15, String paramString5, int paramInt2,
			double paramDouble16, int paramInt3, double paramDouble17,
			int paramInt4, double paramDouble18, int paramInt5,
			double paramDouble19, int paramInt6, double paramDouble20,
			int paramInt7, double paramDouble21, int paramInt8,
			double paramDouble22, int paramInt9, double paramDouble23,
			int paramInt10, double paramDouble24, int paramInt11,
			double paramDouble25, int paramInt12, double paramDouble26,
			String paramString6) {
		this.TradingDay = paramString1;
		this.InstrumentID = paramString2;
		this.ExchangeID = paramString3;
		this.ExchangeInstID = paramString4;
		this.LastPrice = paramDouble1;
		this.PreSettlementPrice = paramDouble2;
		this.PreClosePrice = paramDouble3;
		this.PreOpenInterest = paramDouble4;
		this.OpenPrice = paramDouble5;
		this.HighestPrice = paramDouble6;
		this.LowestPrice = paramDouble7;
		this.Volume = paramInt1;
		this.Turnover = paramDouble8;
		this.OpenInterest = paramDouble9;
		this.ClosePrice = paramDouble10;
		this.SettlementPrice = paramDouble11;
		this.UpperLimitPrice = paramDouble12;
		this.LowerLimitPrice = paramDouble13;
		this.PreDelta = paramDouble14;
		this.CurrDelta = paramDouble15;
		this.UpdateTime = paramString5;
		this.UpdateMillisec = paramInt2;
		this.BidPrice1 = paramDouble16;
		this.BidVolume1 = paramInt3;
		this.AskPrice1 = paramDouble17;
		this.AskVolume1 = paramInt4;
		this.BidPrice2 = paramDouble18;
		this.BidVolume2 = paramInt5;
		this.AskPrice2 = paramDouble19;
		this.AskVolume2 = paramInt6;
		this.BidPrice3 = paramDouble20;
		this.BidVolume3 = paramInt7;
		this.AskPrice3 = paramDouble21;
		this.AskVolume3 = paramInt8;
		this.BidPrice4 = paramDouble22;
		this.BidVolume4 = paramInt9;
		this.AskPrice4 = paramDouble23;
		this.AskVolume4 = paramInt10;
		this.BidPrice5 = paramDouble24;
		this.BidVolume5 = paramInt11;
		this.AskPrice5 = paramDouble25;
		this.AskVolume5 = paramInt12;
		this.AveragePrice = paramDouble26;
		this.ActionDay = paramString6;
	}

	static DPCThostFtdcDepthMarketDataField fromBuffer(ByteBuffer paramByteBuffer) {
		if (paramByteBuffer == null)
			return null;
		assert (paramByteBuffer.capacity() == 408);
		paramByteBuffer.order(ByteOrder.nativeOrder());
		DPCThostFtdcDepthMarketDataField localCThostFtdcDepthMarketDataField = new DPCThostFtdcDepthMarketDataField();
		localCThostFtdcDepthMarketDataField.TradingDay = BufferUtil
				.buffer2ascii(paramByteBuffer, 0, 9);
		localCThostFtdcDepthMarketDataField.InstrumentID = BufferUtil
				.buffer2ascii(paramByteBuffer, 9, 31);
		localCThostFtdcDepthMarketDataField.ExchangeID = BufferUtil
				.buffer2ascii(paramByteBuffer, 40, 9);
		localCThostFtdcDepthMarketDataField.ExchangeInstID = BufferUtil
				.buffer2ascii(paramByteBuffer, 49, 31);
		localCThostFtdcDepthMarketDataField.LastPrice = paramByteBuffer
				.getDouble(80);
		localCThostFtdcDepthMarketDataField.PreSettlementPrice = paramByteBuffer
				.getDouble(88);
		localCThostFtdcDepthMarketDataField.PreClosePrice = paramByteBuffer
				.getDouble(96);
		localCThostFtdcDepthMarketDataField.PreOpenInterest = paramByteBuffer
				.getDouble(104);
		localCThostFtdcDepthMarketDataField.OpenPrice = paramByteBuffer
				.getDouble(112);
		localCThostFtdcDepthMarketDataField.HighestPrice = paramByteBuffer
				.getDouble(120);
		localCThostFtdcDepthMarketDataField.LowestPrice = paramByteBuffer
				.getDouble(128);
		localCThostFtdcDepthMarketDataField.Volume = paramByteBuffer
				.getInt(136);
		localCThostFtdcDepthMarketDataField.Turnover = paramByteBuffer
				.getDouble(144);
		localCThostFtdcDepthMarketDataField.OpenInterest = paramByteBuffer
				.getDouble(152);
		localCThostFtdcDepthMarketDataField.ClosePrice = paramByteBuffer
				.getDouble(160);
		localCThostFtdcDepthMarketDataField.SettlementPrice = paramByteBuffer
				.getDouble(168);
		localCThostFtdcDepthMarketDataField.UpperLimitPrice = paramByteBuffer
				.getDouble(176);
		localCThostFtdcDepthMarketDataField.LowerLimitPrice = paramByteBuffer
				.getDouble(184);
		localCThostFtdcDepthMarketDataField.PreDelta = paramByteBuffer
				.getDouble(192);
		localCThostFtdcDepthMarketDataField.CurrDelta = paramByteBuffer
				.getDouble(200);
		localCThostFtdcDepthMarketDataField.UpdateTime = BufferUtil
				.buffer2ascii(paramByteBuffer, 208, 9);
		localCThostFtdcDepthMarketDataField.UpdateMillisec = paramByteBuffer
				.getInt(220);
		localCThostFtdcDepthMarketDataField.BidPrice1 = paramByteBuffer
				.getDouble(224);
		localCThostFtdcDepthMarketDataField.BidVolume1 = paramByteBuffer
				.getInt(232);
		localCThostFtdcDepthMarketDataField.AskPrice1 = paramByteBuffer
				.getDouble(240);
		localCThostFtdcDepthMarketDataField.AskVolume1 = paramByteBuffer
				.getInt(248);
		localCThostFtdcDepthMarketDataField.BidPrice2 = paramByteBuffer
				.getDouble(256);
		localCThostFtdcDepthMarketDataField.BidVolume2 = paramByteBuffer
				.getInt(264);
		localCThostFtdcDepthMarketDataField.AskPrice2 = paramByteBuffer
				.getDouble(272);
		localCThostFtdcDepthMarketDataField.AskVolume2 = paramByteBuffer
				.getInt(280);
		localCThostFtdcDepthMarketDataField.BidPrice3 = paramByteBuffer
				.getDouble(288);
		localCThostFtdcDepthMarketDataField.BidVolume3 = paramByteBuffer
				.getInt(296);
		localCThostFtdcDepthMarketDataField.AskPrice3 = paramByteBuffer
				.getDouble(304);
		localCThostFtdcDepthMarketDataField.AskVolume3 = paramByteBuffer
				.getInt(312);
		localCThostFtdcDepthMarketDataField.BidPrice4 = paramByteBuffer
				.getDouble(320);
		localCThostFtdcDepthMarketDataField.BidVolume4 = paramByteBuffer
				.getInt(328);
		localCThostFtdcDepthMarketDataField.AskPrice4 = paramByteBuffer
				.getDouble(336);
		localCThostFtdcDepthMarketDataField.AskVolume4 = paramByteBuffer
				.getInt(344);
		localCThostFtdcDepthMarketDataField.BidPrice5 = paramByteBuffer
				.getDouble(352);
		localCThostFtdcDepthMarketDataField.BidVolume5 = paramByteBuffer
				.getInt(360);
		localCThostFtdcDepthMarketDataField.AskPrice5 = paramByteBuffer
				.getDouble(368);
		localCThostFtdcDepthMarketDataField.AskVolume5 = paramByteBuffer
				.getInt(376);
		localCThostFtdcDepthMarketDataField.AveragePrice = paramByteBuffer
				.getDouble(384);
		localCThostFtdcDepthMarketDataField.ActionDay = BufferUtil
				.buffer2ascii(paramByteBuffer, 392, 9);
		return localCThostFtdcDepthMarketDataField;
	}

	static DPCThostFtdcDepthMarketDataField fromBytes(byte[] paramArrayOfByte) {
		if (paramArrayOfByte == null)
			return null;
		assert (paramArrayOfByte.length == 408);
		ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte).order(
				ByteOrder.nativeOrder());
		DPCThostFtdcDepthMarketDataField localCThostFtdcDepthMarketDataField = new DPCThostFtdcDepthMarketDataField();
		localCThostFtdcDepthMarketDataField.TradingDay = BufferUtil
				.bytes2ascii(paramArrayOfByte, 0, 9);
		localCThostFtdcDepthMarketDataField.InstrumentID = BufferUtil
				.bytes2ascii(paramArrayOfByte, 9, 31);
		localCThostFtdcDepthMarketDataField.ExchangeID = BufferUtil
				.bytes2ascii(paramArrayOfByte, 40, 9);
		localCThostFtdcDepthMarketDataField.ExchangeInstID = BufferUtil
				.bytes2ascii(paramArrayOfByte, 49, 31);
		localCThostFtdcDepthMarketDataField.LastPrice = localByteBuffer
				.getDouble(80);
		localCThostFtdcDepthMarketDataField.PreSettlementPrice = localByteBuffer
				.getDouble(88);
		localCThostFtdcDepthMarketDataField.PreClosePrice = localByteBuffer
				.getDouble(96);
		localCThostFtdcDepthMarketDataField.PreOpenInterest = localByteBuffer
				.getDouble(104);
		localCThostFtdcDepthMarketDataField.OpenPrice = localByteBuffer
				.getDouble(112);
		localCThostFtdcDepthMarketDataField.HighestPrice = localByteBuffer
				.getDouble(120);
		localCThostFtdcDepthMarketDataField.LowestPrice = localByteBuffer
				.getDouble(128);
		localCThostFtdcDepthMarketDataField.Volume = localByteBuffer
				.getInt(136);
		localCThostFtdcDepthMarketDataField.Turnover = localByteBuffer
				.getDouble(144);
		localCThostFtdcDepthMarketDataField.OpenInterest = localByteBuffer
				.getDouble(152);
		localCThostFtdcDepthMarketDataField.ClosePrice = localByteBuffer
				.getDouble(160);
		localCThostFtdcDepthMarketDataField.SettlementPrice = localByteBuffer
				.getDouble(168);
		localCThostFtdcDepthMarketDataField.UpperLimitPrice = localByteBuffer
				.getDouble(176);
		localCThostFtdcDepthMarketDataField.LowerLimitPrice = localByteBuffer
				.getDouble(184);
		localCThostFtdcDepthMarketDataField.PreDelta = localByteBuffer
				.getDouble(192);
		localCThostFtdcDepthMarketDataField.CurrDelta = localByteBuffer
				.getDouble(200);
		localCThostFtdcDepthMarketDataField.UpdateTime = BufferUtil
				.bytes2ascii(paramArrayOfByte, 208, 9);
		localCThostFtdcDepthMarketDataField.UpdateMillisec = localByteBuffer
				.getInt(220);
		localCThostFtdcDepthMarketDataField.BidPrice1 = localByteBuffer
				.getDouble(224);
		localCThostFtdcDepthMarketDataField.BidVolume1 = localByteBuffer
				.getInt(232);
		localCThostFtdcDepthMarketDataField.AskPrice1 = localByteBuffer
				.getDouble(240);
		localCThostFtdcDepthMarketDataField.AskVolume1 = localByteBuffer
				.getInt(248);
		localCThostFtdcDepthMarketDataField.BidPrice2 = localByteBuffer
				.getDouble(256);
		localCThostFtdcDepthMarketDataField.BidVolume2 = localByteBuffer
				.getInt(264);
		localCThostFtdcDepthMarketDataField.AskPrice2 = localByteBuffer
				.getDouble(272);
		localCThostFtdcDepthMarketDataField.AskVolume2 = localByteBuffer
				.getInt(280);
		localCThostFtdcDepthMarketDataField.BidPrice3 = localByteBuffer
				.getDouble(288);
		localCThostFtdcDepthMarketDataField.BidVolume3 = localByteBuffer
				.getInt(296);
		localCThostFtdcDepthMarketDataField.AskPrice3 = localByteBuffer
				.getDouble(304);
		localCThostFtdcDepthMarketDataField.AskVolume3 = localByteBuffer
				.getInt(312);
		localCThostFtdcDepthMarketDataField.BidPrice4 = localByteBuffer
				.getDouble(320);
		localCThostFtdcDepthMarketDataField.BidVolume4 = localByteBuffer
				.getInt(328);
		localCThostFtdcDepthMarketDataField.AskPrice4 = localByteBuffer
				.getDouble(336);
		localCThostFtdcDepthMarketDataField.AskVolume4 = localByteBuffer
				.getInt(344);
		localCThostFtdcDepthMarketDataField.BidPrice5 = localByteBuffer
				.getDouble(352);
		localCThostFtdcDepthMarketDataField.BidVolume5 = localByteBuffer
				.getInt(360);
		localCThostFtdcDepthMarketDataField.AskPrice5 = localByteBuffer
				.getDouble(368);
		localCThostFtdcDepthMarketDataField.AskVolume5 = localByteBuffer
				.getInt(376);
		localCThostFtdcDepthMarketDataField.AveragePrice = localByteBuffer
				.getDouble(384);
		localCThostFtdcDepthMarketDataField.ActionDay = BufferUtil.bytes2ascii(
				paramArrayOfByte, 392, 9);
		return localCThostFtdcDepthMarketDataField;
	}

	byte[] toBytes() {
		ByteBuffer localByteBuffer = ByteBuffer.allocate(408).order(
				ByteOrder.nativeOrder());
		BufferUtil.ascii2bytes(localByteBuffer, this.TradingDay, 0, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.InstrumentID, 9, 31);
		BufferUtil.ascii2bytes(localByteBuffer, this.ExchangeID, 40, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.ExchangeInstID, 49, 31);
		localByteBuffer.putDouble(80, this.LastPrice);
		localByteBuffer.putDouble(88, this.PreSettlementPrice);
		localByteBuffer.putDouble(96, this.PreClosePrice);
		localByteBuffer.putDouble(104, this.PreOpenInterest);
		localByteBuffer.putDouble(112, this.OpenPrice);
		localByteBuffer.putDouble(120, this.HighestPrice);
		localByteBuffer.putDouble(128, this.LowestPrice);
		localByteBuffer.putInt(136, this.Volume);
		localByteBuffer.putDouble(144, this.Turnover);
		localByteBuffer.putDouble(152, this.OpenInterest);
		localByteBuffer.putDouble(160, this.ClosePrice);
		localByteBuffer.putDouble(168, this.SettlementPrice);
		localByteBuffer.putDouble(176, this.UpperLimitPrice);
		localByteBuffer.putDouble(184, this.LowerLimitPrice);
		localByteBuffer.putDouble(192, this.PreDelta);
		localByteBuffer.putDouble(200, this.CurrDelta);
		BufferUtil.ascii2bytes(localByteBuffer, this.UpdateTime, 208, 9);
		localByteBuffer.putInt(220, this.UpdateMillisec);
		localByteBuffer.putDouble(224, this.BidPrice1);
		localByteBuffer.putInt(232, this.BidVolume1);
		localByteBuffer.putDouble(240, this.AskPrice1);
		localByteBuffer.putInt(248, this.AskVolume1);
		localByteBuffer.putDouble(256, this.BidPrice2);
		localByteBuffer.putInt(264, this.BidVolume2);
		localByteBuffer.putDouble(272, this.AskPrice2);
		localByteBuffer.putInt(280, this.AskVolume2);
		localByteBuffer.putDouble(288, this.BidPrice3);
		localByteBuffer.putInt(296, this.BidVolume3);
		localByteBuffer.putDouble(304, this.AskPrice3);
		localByteBuffer.putInt(312, this.AskVolume3);
		localByteBuffer.putDouble(320, this.BidPrice4);
		localByteBuffer.putInt(328, this.BidVolume4);
		localByteBuffer.putDouble(336, this.AskPrice4);
		localByteBuffer.putInt(344, this.AskVolume4);
		localByteBuffer.putDouble(352, this.BidPrice5);
		localByteBuffer.putInt(360, this.BidVolume5);
		localByteBuffer.putDouble(368, this.AskPrice5);
		localByteBuffer.putInt(376, this.AskVolume5);
		localByteBuffer.putDouble(384, this.AveragePrice);
		BufferUtil.ascii2bytes(localByteBuffer, this.ActionDay, 392, 9);
		return localByteBuffer.array();
	}
	
	public String toCSVString() {
		StringBuilder localStringBuilder = new StringBuilder(128);
		localStringBuilder.append("")
				.append(this.TradingDay)
				.append(",").append(this.InstrumentID)
				.append(",").append(this.ExchangeID)
				.append(",").append(this.ExchangeInstID)
				.append(",").append(this.LastPrice)
				.append(",").append(this.PreSettlementPrice)
				.append(",").append(this.PreClosePrice)
				.append(",").append(this.PreOpenInterest)
				.append(",").append(this.OpenPrice)
				.append(",").append(this.HighestPrice)
				.append(",").append(this.LowestPrice)
				.append(",").append(this.Volume)
				.append(",").append(this.Turnover)
				.append(",").append(this.OpenInterest)
				.append(",").append(this.ClosePrice)
				.append(",").append(this.SettlementPrice)
				.append(",").append(this.UpperLimitPrice)
				.append(",").append(this.LowerLimitPrice)
				.append(",").append(this.PreDelta)
				.append(",").append(this.CurrDelta)
				.append(",").append(this.UpdateTime)
				.append(",").append(this.UpdateMillisec)
				.append(",").append(this.BidPrice1)
				.append(",").append(this.BidVolume1)
				.append(",").append(this.AskPrice1)
				.append(",").append(this.AskVolume1)
				.append(",").append(this.BidPrice2)
				.append(",").append(this.BidVolume2)
				.append(",").append(this.AskPrice2)
				.append(",").append(this.AskVolume2)
				.append(",").append(this.BidPrice3)
				.append(",").append(this.BidVolume3)
				.append(",").append(this.AskPrice3)
				.append(",").append(this.AskVolume3)
				.append(",").append(this.BidPrice4)
				.append(",").append(this.BidVolume4)
				.append(",").append(this.AskPrice4)
				.append(",").append(this.AskVolume4)
				.append(",").append(this.BidPrice5)
				.append(",").append(this.BidVolume5)
				.append(",").append(this.AskPrice5)
				.append(",").append(this.AskVolume5)
				.append(",").append(this.AveragePrice)
				.append(",").append(this.ActionDay);
		return localStringBuilder.toString();
	}

	public String toString() {
		StringBuilder localStringBuilder = new StringBuilder(128);
		localStringBuilder.append("CThostFtdcDepthMarketDataField[")
				.append("TradingDay=").append(this.TradingDay)
				.append(",InstrumentID=").append(this.InstrumentID)
				.append(",ExchangeID=").append(this.ExchangeID)
				.append(",ExchangeInstID=").append(this.ExchangeInstID)
				.append(",LastPrice=").append(this.LastPrice)
				.append(",PreSettlementPrice=").append(this.PreSettlementPrice)
				.append(",PreClosePrice=").append(this.PreClosePrice)
				.append(",PreOpenInterest=").append(this.PreOpenInterest)
				.append(",OpenPrice=").append(this.OpenPrice)
				.append(",HighestPrice=").append(this.HighestPrice)
				.append(",LowestPrice=").append(this.LowestPrice)
				.append(",Volume=").append(this.Volume).append(",Turnover=")
				.append(this.Turnover).append(",OpenInterest=")
				.append(this.OpenInterest).append(",ClosePrice=")
				.append(this.ClosePrice).append(",SettlementPrice=")
				.append(this.SettlementPrice).append(",UpperLimitPrice=")
				.append(this.UpperLimitPrice).append(",LowerLimitPrice=")
				.append(this.LowerLimitPrice).append(",PreDelta=")
				.append(this.PreDelta).append(",CurrDelta=")
				.append(this.CurrDelta).append(",UpdateTime=")
				.append(this.UpdateTime).append(",UpdateMillisec=")
				.append(this.UpdateMillisec).append(",BidPrice1=")
				.append(this.BidPrice1).append(",BidVolume1=")
				.append(this.BidVolume1).append(",AskPrice1=")
				.append(this.AskPrice1).append(",AskVolume1=")
				.append(this.AskVolume1).append(",BidPrice2=")
				.append(this.BidPrice2).append(",BidVolume2=")
				.append(this.BidVolume2).append(",AskPrice2=")
				.append(this.AskPrice2).append(",AskVolume2=")
				.append(this.AskVolume2).append(",BidPrice3=")
				.append(this.BidPrice3).append(",BidVolume3=")
				.append(this.BidVolume3).append(",AskPrice3=")
				.append(this.AskPrice3).append(",AskVolume3=")
				.append(this.AskVolume3).append(",BidPrice4=")
				.append(this.BidPrice4).append(",BidVolume4=")
				.append(this.BidVolume4).append(",AskPrice4=")
				.append(this.AskPrice4).append(",AskVolume4=")
				.append(this.AskVolume4).append(",BidPrice5=")
				.append(this.BidPrice5).append(",BidVolume5=")
				.append(this.BidVolume5).append(",AskPrice5=")
				.append(this.AskPrice5).append(",AskVolume5=")
				.append(this.AskVolume5).append(",AveragePrice=")
				.append(this.AveragePrice).append(",ActionDay=")
				.append(this.ActionDay).append("]");
		return localStringBuilder.toString();
	}
}