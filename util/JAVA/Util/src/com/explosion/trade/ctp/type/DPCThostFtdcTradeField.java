/*** Eclipse Class Decompiler plugin, copyright (c) 2012 Chao Chen (cnfree2000@hotmail.com) ***/
package com.explosion.trade.ctp.type;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;
import net.jctp.CThostFtdcTradeField;

public final class DPCThostFtdcTradeField implements Serializable {
	public String BrokerID;
	public String InvestorID;
	public String InstrumentID;
	public String OrderRef;
	public String UserID;
	public String ExchangeID;
	public String TradeID;
	public char Direction;
	public String OrderSysID;
	public String ParticipantID;
	public String ClientID;
	public char TradingRole;
	public String ExchangeInstID;
	public char OffsetFlag;
	public char HedgeFlag;
	public double Price;
	public int Volume;
	public String TradeDate;
	public String TradeTime;
	public char TradeType;
	public char PriceSource;
	public String TraderID;
	public String OrderLocalID;
	public String ClearingPartID;
	public String BusinessUnit;
	public int SequenceNo;
	public String TradingDay;
	public int SettlementID;
	public int BrokerOrderSeq;
	public char TradeSource;

	public DPCThostFtdcTradeField() {
	}

	public DPCThostFtdcTradeField(CThostFtdcTradeField pTrade) {
		this.BrokerID = pTrade.BrokerID;
		this.InvestorID = pTrade.InvestorID;
		this.InstrumentID = pTrade.InstrumentID;
		this.OrderRef = pTrade.OrderRef;
		this.UserID = pTrade.UserID;
		this.ExchangeID = pTrade.ExchangeID;
		this.TradeID = pTrade.TradeID;
		this.Direction = pTrade.Direction;
		this.OrderSysID = pTrade.OrderSysID;
		this.ParticipantID = pTrade.ParticipantID;
		this.ClientID = pTrade.ClientID;
		this.TradingRole = pTrade.TradingRole;
		this.ExchangeInstID = pTrade.ExchangeInstID;
		this.OffsetFlag = pTrade.OffsetFlag;
		this.HedgeFlag = pTrade.HedgeFlag;
		this.Price = pTrade.Price;
		this.Volume = pTrade.Volume;
		this.TradeDate = pTrade.TradeDate;
		this.TradeTime = pTrade.TradeTime;
		this.TradeType = pTrade.TradeType;
		this.PriceSource = pTrade.PriceSource;
		this.TraderID = pTrade.TraderID;
		this.OrderLocalID = pTrade.OrderLocalID;
		this.ClearingPartID = pTrade.ClearingPartID;
		this.BusinessUnit = pTrade.BusinessUnit;
		this.SequenceNo = pTrade.SequenceNo;
		this.TradingDay = pTrade.TradingDay;
		this.SettlementID = pTrade.SettlementID;
		this.BrokerOrderSeq = pTrade.BrokerOrderSeq;
		this.TradeSource = pTrade.TradeSource;
	}
	
	public DPCThostFtdcTradeField(String paramString1, String paramString2,
			String paramString3, String paramString4, String paramString5,
			String paramString6, String paramString7, char paramChar1,
			String paramString8, String paramString9, String paramString10,
			char paramChar2, String paramString11, char paramChar3,
			char paramChar4, double paramDouble, int paramInt1,
			String paramString12, String paramString13, char paramChar5,
			char paramChar6, String paramString14, String paramString15,
			String paramString16, String paramString17, int paramInt2,
			String paramString18, int paramInt3, int paramInt4, char paramChar7) {
		this.BrokerID = paramString1;
		this.InvestorID = paramString2;
		this.InstrumentID = paramString3;
		this.OrderRef = paramString4;
		this.UserID = paramString5;
		this.ExchangeID = paramString6;
		this.TradeID = paramString7;
		this.Direction = paramChar1;
		this.OrderSysID = paramString8;
		this.ParticipantID = paramString9;
		this.ClientID = paramString10;
		this.TradingRole = paramChar2;
		this.ExchangeInstID = paramString11;
		this.OffsetFlag = paramChar3;
		this.HedgeFlag = paramChar4;
		this.Price = paramDouble;
		this.Volume = paramInt1;
		this.TradeDate = paramString12;
		this.TradeTime = paramString13;
		this.TradeType = paramChar5;
		this.PriceSource = paramChar6;
		this.TraderID = paramString14;
		this.OrderLocalID = paramString15;
		this.ClearingPartID = paramString16;
		this.BusinessUnit = paramString17;
		this.SequenceNo = paramInt2;
		this.TradingDay = paramString18;
		this.SettlementID = paramInt3;
		this.BrokerOrderSeq = paramInt4;
		this.TradeSource = paramChar7;
	}

	static DPCThostFtdcTradeField fromBuffer(ByteBuffer paramByteBuffer) {
		if (paramByteBuffer == null)
			return null;
		assert (paramByteBuffer.capacity() == 320);
		paramByteBuffer.order(ByteOrder.nativeOrder());
		DPCThostFtdcTradeField localCThostFtdcTradeField = new DPCThostFtdcTradeField();
		localCThostFtdcTradeField.BrokerID = BufferUtil.buffer2ascii(
				paramByteBuffer, 0, 11);
		localCThostFtdcTradeField.InvestorID = BufferUtil.buffer2ascii(
				paramByteBuffer, 11, 13);
		localCThostFtdcTradeField.InstrumentID = BufferUtil.buffer2ascii(
				paramByteBuffer, 24, 31);
		localCThostFtdcTradeField.OrderRef = BufferUtil.buffer2str(
				paramByteBuffer, 55, 13);
		localCThostFtdcTradeField.UserID = BufferUtil.buffer2ascii(
				paramByteBuffer, 68, 16);
		localCThostFtdcTradeField.ExchangeID = BufferUtil.buffer2ascii(
				paramByteBuffer, 84, 9);
		localCThostFtdcTradeField.TradeID = BufferUtil.buffer2ascii(
				paramByteBuffer, 93, 21);
		localCThostFtdcTradeField.Direction = (char) paramByteBuffer.get(114);
		localCThostFtdcTradeField.OrderSysID = BufferUtil.buffer2ascii(
				paramByteBuffer, 115, 21);
		localCThostFtdcTradeField.ParticipantID = BufferUtil.buffer2ascii(
				paramByteBuffer, 136, 11);
		localCThostFtdcTradeField.ClientID = BufferUtil.buffer2ascii(
				paramByteBuffer, 147, 11);
		localCThostFtdcTradeField.TradingRole = (char) paramByteBuffer.get(158);
		localCThostFtdcTradeField.ExchangeInstID = BufferUtil.buffer2ascii(
				paramByteBuffer, 159, 31);
		localCThostFtdcTradeField.OffsetFlag = (char) paramByteBuffer.get(190);
		localCThostFtdcTradeField.HedgeFlag = (char) paramByteBuffer.get(191);
		localCThostFtdcTradeField.Price = paramByteBuffer.getDouble(192);
		localCThostFtdcTradeField.Volume = paramByteBuffer.getInt(200);
		localCThostFtdcTradeField.TradeDate = BufferUtil.buffer2ascii(
				paramByteBuffer, 204, 9);
		localCThostFtdcTradeField.TradeTime = BufferUtil.buffer2ascii(
				paramByteBuffer, 213, 9);
		localCThostFtdcTradeField.TradeType = (char) paramByteBuffer.get(222);
		localCThostFtdcTradeField.PriceSource = (char) paramByteBuffer.get(223);
		localCThostFtdcTradeField.TraderID = BufferUtil.buffer2ascii(
				paramByteBuffer, 224, 21);
		localCThostFtdcTradeField.OrderLocalID = BufferUtil.buffer2ascii(
				paramByteBuffer, 245, 13);
		localCThostFtdcTradeField.ClearingPartID = BufferUtil.buffer2ascii(
				paramByteBuffer, 258, 11);
		localCThostFtdcTradeField.BusinessUnit = BufferUtil.buffer2str(
				paramByteBuffer, 269, 21);
		localCThostFtdcTradeField.SequenceNo = paramByteBuffer.getInt(292);
		localCThostFtdcTradeField.TradingDay = BufferUtil.buffer2ascii(
				paramByteBuffer, 296, 9);
		localCThostFtdcTradeField.SettlementID = paramByteBuffer.getInt(308);
		localCThostFtdcTradeField.BrokerOrderSeq = paramByteBuffer.getInt(312);
		localCThostFtdcTradeField.TradeSource = (char) paramByteBuffer.get(316);
		return localCThostFtdcTradeField;
	}

	static DPCThostFtdcTradeField fromBytes(byte[] paramArrayOfByte) {
		if (paramArrayOfByte == null)
			return null;
		assert (paramArrayOfByte.length == 320);
		ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte).order(
				ByteOrder.nativeOrder());
		DPCThostFtdcTradeField localCThostFtdcTradeField = new DPCThostFtdcTradeField();
		localCThostFtdcTradeField.BrokerID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 0, 11);
		localCThostFtdcTradeField.InvestorID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 11, 13);
		localCThostFtdcTradeField.InstrumentID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 24, 31);
		localCThostFtdcTradeField.OrderRef = BufferUtil.bytes2str(
				paramArrayOfByte, 55, 13);
		localCThostFtdcTradeField.UserID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 68, 16);
		localCThostFtdcTradeField.ExchangeID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 84, 9);
		localCThostFtdcTradeField.TradeID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 93, 21);
		localCThostFtdcTradeField.Direction = (char) paramArrayOfByte[114];
		localCThostFtdcTradeField.OrderSysID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 115, 21);
		localCThostFtdcTradeField.ParticipantID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 136, 11);
		localCThostFtdcTradeField.ClientID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 147, 11);
		localCThostFtdcTradeField.TradingRole = (char) paramArrayOfByte[158];
		localCThostFtdcTradeField.ExchangeInstID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 159, 31);
		localCThostFtdcTradeField.OffsetFlag = (char) paramArrayOfByte[190];
		localCThostFtdcTradeField.HedgeFlag = (char) paramArrayOfByte[191];
		localCThostFtdcTradeField.Price = localByteBuffer.getDouble(192);
		localCThostFtdcTradeField.Volume = localByteBuffer.getInt(200);
		localCThostFtdcTradeField.TradeDate = BufferUtil.bytes2ascii(
				paramArrayOfByte, 204, 9);
		localCThostFtdcTradeField.TradeTime = BufferUtil.bytes2ascii(
				paramArrayOfByte, 213, 9);
		localCThostFtdcTradeField.TradeType = (char) paramArrayOfByte[222];
		localCThostFtdcTradeField.PriceSource = (char) paramArrayOfByte[223];
		localCThostFtdcTradeField.TraderID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 224, 21);
		localCThostFtdcTradeField.OrderLocalID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 245, 13);
		localCThostFtdcTradeField.ClearingPartID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 258, 11);
		localCThostFtdcTradeField.BusinessUnit = BufferUtil.bytes2str(
				paramArrayOfByte, 269, 21);
		localCThostFtdcTradeField.SequenceNo = localByteBuffer.getInt(292);
		localCThostFtdcTradeField.TradingDay = BufferUtil.bytes2ascii(
				paramArrayOfByte, 296, 9);
		localCThostFtdcTradeField.SettlementID = localByteBuffer.getInt(308);
		localCThostFtdcTradeField.BrokerOrderSeq = localByteBuffer.getInt(312);
		localCThostFtdcTradeField.TradeSource = (char) paramArrayOfByte[316];
		return localCThostFtdcTradeField;
	}

	byte[] toBytes() {
		ByteBuffer localByteBuffer = ByteBuffer.allocate(320).order(
				ByteOrder.nativeOrder());
		BufferUtil.ascii2bytes(localByteBuffer, this.BrokerID, 0, 11);
		BufferUtil.ascii2bytes(localByteBuffer, this.InvestorID, 11, 13);
		BufferUtil.ascii2bytes(localByteBuffer, this.InstrumentID, 24, 31);
		BufferUtil.str2bytes(localByteBuffer, this.OrderRef, 55, 13);
		BufferUtil.ascii2bytes(localByteBuffer, this.UserID, 68, 16);
		BufferUtil.ascii2bytes(localByteBuffer, this.ExchangeID, 84, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.TradeID, 93, 21);
		localByteBuffer.put(114, (byte) this.Direction);
		BufferUtil.ascii2bytes(localByteBuffer, this.OrderSysID, 115, 21);
		BufferUtil.ascii2bytes(localByteBuffer, this.ParticipantID, 136, 11);
		BufferUtil.ascii2bytes(localByteBuffer, this.ClientID, 147, 11);
		localByteBuffer.put(158, (byte) this.TradingRole);
		BufferUtil.ascii2bytes(localByteBuffer, this.ExchangeInstID, 159, 31);
		localByteBuffer.put(190, (byte) this.OffsetFlag);
		localByteBuffer.put(191, (byte) this.HedgeFlag);
		localByteBuffer.putDouble(192, this.Price);
		localByteBuffer.putInt(200, this.Volume);
		BufferUtil.ascii2bytes(localByteBuffer, this.TradeDate, 204, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.TradeTime, 213, 9);
		localByteBuffer.put(222, (byte) this.TradeType);
		localByteBuffer.put(223, (byte) this.PriceSource);
		BufferUtil.ascii2bytes(localByteBuffer, this.TraderID, 224, 21);
		BufferUtil.ascii2bytes(localByteBuffer, this.OrderLocalID, 245, 13);
		BufferUtil.ascii2bytes(localByteBuffer, this.ClearingPartID, 258, 11);
		BufferUtil.str2bytes(localByteBuffer, this.BusinessUnit, 269, 21);
		localByteBuffer.putInt(292, this.SequenceNo);
		BufferUtil.ascii2bytes(localByteBuffer, this.TradingDay, 296, 9);
		localByteBuffer.putInt(308, this.SettlementID);
		localByteBuffer.putInt(312, this.BrokerOrderSeq);
		localByteBuffer.put(316, (byte) this.TradeSource);
		return localByteBuffer.array();
	}

	public String toString() {
		StringBuilder localStringBuilder = new StringBuilder(128);
		localStringBuilder.append("CThostFtdcTradeField[").append("BrokerID=")
				.append(this.BrokerID).append(",InvestorID=")
				.append(this.InvestorID).append(",InstrumentID=")
				.append(this.InstrumentID).append(",OrderRef=")
				.append(this.OrderRef).append(",UserID=").append(this.UserID)
				.append(",ExchangeID=").append(this.ExchangeID)
				.append(",TradeID=").append(this.TradeID).append(",Direction=")
				.append((this.Direction == 0) ? ' ' : this.Direction)
				.append(",OrderSysID=").append(this.OrderSysID)
				.append(",ParticipantID=").append(this.ParticipantID)
				.append(",ClientID=").append(this.ClientID)
				.append(",TradingRole=")
				.append((this.TradingRole == 0) ? ' ' : this.TradingRole)
				.append(",ExchangeInstID=").append(this.ExchangeInstID)
				.append(",OffsetFlag=")
				.append((this.OffsetFlag == 0) ? ' ' : this.OffsetFlag)
				.append(",HedgeFlag=")
				.append((this.HedgeFlag == 0) ? ' ' : this.HedgeFlag)
				.append(",Price=").append(this.Price).append(",Volume=")
				.append(this.Volume).append(",TradeDate=")
				.append(this.TradeDate).append(",TradeTime=")
				.append(this.TradeTime).append(",TradeType=")
				.append((this.TradeType == 0) ? ' ' : this.TradeType)
				.append(",PriceSource=")
				.append((this.PriceSource == 0) ? ' ' : this.PriceSource)
				.append(",TraderID=").append(this.TraderID)
				.append(",OrderLocalID=").append(this.OrderLocalID)
				.append(",ClearingPartID=").append(this.ClearingPartID)
				.append(",BusinessUnit=").append(this.BusinessUnit)
				.append(",SequenceNo=").append(this.SequenceNo)
				.append(",TradingDay=").append(this.TradingDay)
				.append(",SettlementID=").append(this.SettlementID)
				.append(",BrokerOrderSeq=").append(this.BrokerOrderSeq)
				.append(",TradeSource=")
				.append((this.TradeSource == 0) ? ' ' : this.TradeSource)
				.append("]");
		return localStringBuilder.toString();
	}
}