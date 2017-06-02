/*** Eclipse Class Decompiler plugin, copyright (c) 2012 Chao Chen (cnfree2000@hotmail.com) ***/
package com.explosion.trade.ctp.type;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;
import net.jctp.CThostFtdcOrderField;

public class DPCThostFtdcOrderField implements Serializable {
	public String BrokerID;
	public String InvestorID;
	public String InstrumentID;
	public String OrderRef;
	public String UserID;
	public char OrderPriceType;
	public char Direction;
	public String CombOffsetFlag;
	public String CombHedgeFlag;
	public double LimitPrice;
	public int VolumeTotalOriginal;
	public char TimeCondition;
	public String GTDDate;
	public char VolumeCondition;
	public int MinVolume;
	public char ContingentCondition;
	public double StopPrice;
	public char ForceCloseReason;
	public boolean IsAutoSuspend;
	public String BusinessUnit;
	public int RequestID;
	public String OrderLocalID;
	public String ExchangeID;
	public String ParticipantID;
	public String ClientID;
	public String ExchangeInstID;
	public String TraderID;
	public int InstallID;
	public char OrderSubmitStatus;
	public int NotifySequence;
	public String TradingDay;
	public int SettlementID;
	public String OrderSysID;
	public char OrderSource;
	public char OrderStatus;
	public char OrderType;
	public int VolumeTraded;
	public int VolumeTotal;
	public String InsertDate;
	public String InsertTime;
	public String ActiveTime;
	public String SuspendTime;
	public String UpdateTime;
	public String CancelTime;
	public String ActiveTraderID;
	public String ClearingPartID;
	public int SequenceNo;
	public int FrontID;
	public int SessionID;
	public String UserProductInfo;
	public String StatusMsg;
	public boolean UserForceClose;
	public String ActiveUserID;
	public int BrokerOrderSeq;
	public String RelativeOrderSysID;
	public int ZCETotalTradedVolume;
	public boolean IsSwapOrder;

	public DPCThostFtdcOrderField() {
	}

	public DPCThostFtdcOrderField(String paramString1, String paramString2,
			String paramString3, String paramString4, String paramString5,
			char paramChar1, char paramChar2, String paramString6,
			String paramString7, double paramDouble1, int paramInt1,
			char paramChar3, String paramString8, char paramChar4,
			int paramInt2, char paramChar5, double paramDouble2,
			char paramChar6, boolean paramBoolean1, String paramString9,
			int paramInt3, String paramString10, String paramString11,
			String paramString12, String paramString13, String paramString14,
			String paramString15, int paramInt4, char paramChar7,
			int paramInt5, String paramString16, int paramInt6,
			String paramString17, char paramChar8, char paramChar9,
			char paramChar10, int paramInt7, int paramInt8,
			String paramString18, String paramString19, String paramString20,
			String paramString21, String paramString22, String paramString23,
			String paramString24, String paramString25, int paramInt9,
			int paramInt10, int paramInt11, String paramString26,
			String paramString27, boolean paramBoolean2, String paramString28,
			int paramInt12, String paramString29, int paramInt13,
			boolean paramBoolean3) {
		this.BrokerID = paramString1;
		this.InvestorID = paramString2;
		this.InstrumentID = paramString3;
		this.OrderRef = paramString4;
		this.UserID = paramString5;
		this.OrderPriceType = paramChar1;
		this.Direction = paramChar2;
		this.CombOffsetFlag = paramString6;
		this.CombHedgeFlag = paramString7;
		this.LimitPrice = paramDouble1;
		this.VolumeTotalOriginal = paramInt1;
		this.TimeCondition = paramChar3;
		this.GTDDate = paramString8;
		this.VolumeCondition = paramChar4;
		this.MinVolume = paramInt2;
		this.ContingentCondition = paramChar5;
		this.StopPrice = paramDouble2;
		this.ForceCloseReason = paramChar6;
		this.IsAutoSuspend = paramBoolean1;
		this.BusinessUnit = paramString9;
		this.RequestID = paramInt3;
		this.OrderLocalID = paramString10;
		this.ExchangeID = paramString11;
		this.ParticipantID = paramString12;
		this.ClientID = paramString13;
		this.ExchangeInstID = paramString14;
		this.TraderID = paramString15;
		this.InstallID = paramInt4;
		this.OrderSubmitStatus = paramChar7;
		this.NotifySequence = paramInt5;
		this.TradingDay = paramString16;
		this.SettlementID = paramInt6;
		this.OrderSysID = paramString17;
		this.OrderSource = paramChar8;
		this.OrderStatus = paramChar9;
		this.OrderType = paramChar10;
		this.VolumeTraded = paramInt7;
		this.VolumeTotal = paramInt8;
		this.InsertDate = paramString18;
		this.InsertTime = paramString19;
		this.ActiveTime = paramString20;
		this.SuspendTime = paramString21;
		this.UpdateTime = paramString22;
		this.CancelTime = paramString23;
		this.ActiveTraderID = paramString24;
		this.ClearingPartID = paramString25;
		this.SequenceNo = paramInt9;
		this.FrontID = paramInt10;
		this.SessionID = paramInt11;
		this.UserProductInfo = paramString26;
		this.StatusMsg = paramString27;
		this.UserForceClose = paramBoolean2;
		this.ActiveUserID = paramString28;
		this.BrokerOrderSeq = paramInt12;
		this.RelativeOrderSysID = paramString29;
		this.ZCETotalTradedVolume = paramInt13;
		this.IsSwapOrder = paramBoolean3;
	}
	
	public DPCThostFtdcOrderField(CThostFtdcOrderField pOrder){
		this.BrokerID = pOrder.BrokerID;
		this.InvestorID = pOrder.InvestorID;
		this.InstrumentID = pOrder.InstrumentID;
		this.OrderRef = pOrder.OrderRef;
		this.UserID = pOrder.UserID;
		this.OrderPriceType = pOrder.OrderPriceType;
		this.Direction = pOrder.Direction;
		this.CombOffsetFlag = pOrder.CombOffsetFlag;
		this.CombHedgeFlag = pOrder.CombHedgeFlag;
		this.LimitPrice = pOrder.LimitPrice;
		this.VolumeTotalOriginal = pOrder.VolumeTotalOriginal;
		this.TimeCondition = pOrder.TimeCondition;
		this.GTDDate = pOrder.GTDDate;
		this.VolumeCondition = pOrder.VolumeCondition;
		this.MinVolume = pOrder.MinVolume;
		this.ContingentCondition = pOrder.ContingentCondition;
		this.StopPrice = pOrder.StopPrice;
		this.ForceCloseReason = pOrder.ForceCloseReason;
		this.IsAutoSuspend = pOrder.IsAutoSuspend;
		this.BusinessUnit = pOrder.BusinessUnit;
		this.RequestID = pOrder.RequestID;
		this.OrderLocalID = pOrder.OrderLocalID;
		this.ExchangeID = pOrder.ExchangeID;
		this.ParticipantID = pOrder.ParticipantID;
		this.ClientID = pOrder.ClientID;
		this.ExchangeInstID = pOrder.ExchangeInstID;
		this.TraderID = pOrder.TraderID;
		this.InstallID = pOrder.InstallID;
		this.OrderSubmitStatus = pOrder.OrderSubmitStatus;
		this.NotifySequence = pOrder.NotifySequence;
		this.TradingDay = pOrder.TradingDay;
		this.SettlementID = pOrder.SettlementID;
		this.OrderSysID = pOrder.OrderSysID;
		this.OrderSource = pOrder.OrderSource;
		this.OrderStatus = pOrder.OrderStatus;
		this.OrderType = pOrder.OrderType;
		this.VolumeTraded = pOrder.VolumeTraded;
		this.VolumeTotal = pOrder.VolumeTotal;
		this.InsertDate = pOrder.InsertDate;
		this.InsertTime = pOrder.InsertTime;
		this.ActiveTime = pOrder.ActiveTime;
		this.SuspendTime = pOrder.SuspendTime;
		this.UpdateTime = pOrder.UpdateTime;
		this.CancelTime = pOrder.CancelTime;
		this.ActiveTraderID = pOrder.ActiveTraderID;
		this.ClearingPartID = pOrder.ClearingPartID;
		this.SequenceNo = pOrder.SequenceNo;
		this.FrontID = pOrder.FrontID;
		this.SessionID = pOrder.SessionID;
		this.UserProductInfo = pOrder.UserProductInfo;
		this.StatusMsg = pOrder.StatusMsg;
		this.UserForceClose = pOrder.UserForceClose;
		this.ActiveUserID = pOrder.ActiveUserID;
		this.BrokerOrderSeq = pOrder.BrokerOrderSeq;
		this.RelativeOrderSysID = pOrder.RelativeOrderSysID;
		this.ZCETotalTradedVolume = pOrder.ZCETotalTradedVolume;
		this.IsSwapOrder = pOrder.IsSwapOrder;
	}

	static DPCThostFtdcOrderField fromBuffer(ByteBuffer paramByteBuffer) {
		if (paramByteBuffer == null)
			return null;
		assert (paramByteBuffer.capacity() == 576);
		paramByteBuffer.order(ByteOrder.nativeOrder());
		DPCThostFtdcOrderField localCThostFtdcOrderField = new DPCThostFtdcOrderField();
		localCThostFtdcOrderField.BrokerID = BufferUtil.buffer2ascii(
				paramByteBuffer, 0, 11);
		localCThostFtdcOrderField.InvestorID = BufferUtil.buffer2ascii(
				paramByteBuffer, 11, 13);
		localCThostFtdcOrderField.InstrumentID = BufferUtil.buffer2ascii(
				paramByteBuffer, 24, 31);
		localCThostFtdcOrderField.OrderRef = BufferUtil.buffer2str(
				paramByteBuffer, 55, 13);
		localCThostFtdcOrderField.UserID = BufferUtil.buffer2ascii(
				paramByteBuffer, 68, 16);
		localCThostFtdcOrderField.OrderPriceType = (char) paramByteBuffer
				.get(84);
		localCThostFtdcOrderField.Direction = (char) paramByteBuffer.get(85);
		localCThostFtdcOrderField.CombOffsetFlag = BufferUtil.buffer2str(
				paramByteBuffer, 86, 5);
		localCThostFtdcOrderField.CombHedgeFlag = BufferUtil.buffer2str(
				paramByteBuffer, 91, 5);
		localCThostFtdcOrderField.LimitPrice = paramByteBuffer.getDouble(96);
		localCThostFtdcOrderField.VolumeTotalOriginal = paramByteBuffer
				.getInt(104);
		localCThostFtdcOrderField.TimeCondition = (char) paramByteBuffer
				.get(108);
		localCThostFtdcOrderField.GTDDate = BufferUtil.buffer2ascii(
				paramByteBuffer, 109, 9);
		localCThostFtdcOrderField.VolumeCondition = (char) paramByteBuffer
				.get(118);
		localCThostFtdcOrderField.MinVolume = paramByteBuffer.getInt(120);
		localCThostFtdcOrderField.ContingentCondition = (char) paramByteBuffer
				.get(124);
		localCThostFtdcOrderField.StopPrice = paramByteBuffer.getDouble(128);
		localCThostFtdcOrderField.ForceCloseReason = (char) paramByteBuffer
				.get(136);
		localCThostFtdcOrderField.IsAutoSuspend = (paramByteBuffer.getInt(140) != 0);
		localCThostFtdcOrderField.BusinessUnit = BufferUtil.buffer2str(
				paramByteBuffer, 144, 21);
		localCThostFtdcOrderField.RequestID = paramByteBuffer.getInt(168);
		localCThostFtdcOrderField.OrderLocalID = BufferUtil.buffer2ascii(
				paramByteBuffer, 172, 13);
		localCThostFtdcOrderField.ExchangeID = BufferUtil.buffer2ascii(
				paramByteBuffer, 185, 9);
		localCThostFtdcOrderField.ParticipantID = BufferUtil.buffer2ascii(
				paramByteBuffer, 194, 11);
		localCThostFtdcOrderField.ClientID = BufferUtil.buffer2ascii(
				paramByteBuffer, 205, 11);
		localCThostFtdcOrderField.ExchangeInstID = BufferUtil.buffer2ascii(
				paramByteBuffer, 216, 31);
		localCThostFtdcOrderField.TraderID = BufferUtil.buffer2ascii(
				paramByteBuffer, 247, 21);
		localCThostFtdcOrderField.InstallID = paramByteBuffer.getInt(268);
		localCThostFtdcOrderField.OrderSubmitStatus = (char) paramByteBuffer
				.get(272);
		localCThostFtdcOrderField.NotifySequence = paramByteBuffer.getInt(276);
		localCThostFtdcOrderField.TradingDay = BufferUtil.buffer2ascii(
				paramByteBuffer, 280, 9);
		localCThostFtdcOrderField.SettlementID = paramByteBuffer.getInt(292);
		localCThostFtdcOrderField.OrderSysID = BufferUtil.buffer2ascii(
				paramByteBuffer, 296, 21);
		localCThostFtdcOrderField.OrderSource = (char) paramByteBuffer.get(317);
		localCThostFtdcOrderField.OrderStatus = (char) paramByteBuffer.get(318);
		localCThostFtdcOrderField.OrderType = (char) paramByteBuffer.get(319);
		localCThostFtdcOrderField.VolumeTraded = paramByteBuffer.getInt(320);
		localCThostFtdcOrderField.VolumeTotal = paramByteBuffer.getInt(324);
		localCThostFtdcOrderField.InsertDate = BufferUtil.buffer2ascii(
				paramByteBuffer, 328, 9);
		localCThostFtdcOrderField.InsertTime = BufferUtil.buffer2ascii(
				paramByteBuffer, 337, 9);
		localCThostFtdcOrderField.ActiveTime = BufferUtil.buffer2ascii(
				paramByteBuffer, 346, 9);
		localCThostFtdcOrderField.SuspendTime = BufferUtil.buffer2ascii(
				paramByteBuffer, 355, 9);
		localCThostFtdcOrderField.UpdateTime = BufferUtil.buffer2ascii(
				paramByteBuffer, 364, 9);
		localCThostFtdcOrderField.CancelTime = BufferUtil.buffer2ascii(
				paramByteBuffer, 373, 9);
		localCThostFtdcOrderField.ActiveTraderID = BufferUtil.buffer2ascii(
				paramByteBuffer, 382, 21);
		localCThostFtdcOrderField.ClearingPartID = BufferUtil.buffer2ascii(
				paramByteBuffer, 403, 11);
		localCThostFtdcOrderField.SequenceNo = paramByteBuffer.getInt(416);
		localCThostFtdcOrderField.FrontID = paramByteBuffer.getInt(420);
		localCThostFtdcOrderField.SessionID = paramByteBuffer.getInt(424);
		localCThostFtdcOrderField.UserProductInfo = BufferUtil.buffer2str(
				paramByteBuffer, 428, 11);
		localCThostFtdcOrderField.StatusMsg = BufferUtil.buffer2str(
				paramByteBuffer, 439, 81);
		localCThostFtdcOrderField.UserForceClose = (paramByteBuffer.getInt(520) != 0);
		localCThostFtdcOrderField.ActiveUserID = BufferUtil.buffer2ascii(
				paramByteBuffer, 524, 16);
		localCThostFtdcOrderField.BrokerOrderSeq = paramByteBuffer.getInt(540);
		localCThostFtdcOrderField.RelativeOrderSysID = BufferUtil.buffer2ascii(
				paramByteBuffer, 544, 21);
		localCThostFtdcOrderField.ZCETotalTradedVolume = paramByteBuffer
				.getInt(568);
		localCThostFtdcOrderField.IsSwapOrder = (paramByteBuffer.getInt(572) != 0);
		return localCThostFtdcOrderField;
	}

	static DPCThostFtdcOrderField fromBytes(byte[] paramArrayOfByte) {
		if (paramArrayOfByte == null)
			return null;
		assert (paramArrayOfByte.length == 576);
		ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte).order(
				ByteOrder.nativeOrder());
		DPCThostFtdcOrderField localCThostFtdcOrderField = new DPCThostFtdcOrderField();
		localCThostFtdcOrderField.BrokerID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 0, 11);
		localCThostFtdcOrderField.InvestorID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 11, 13);
		localCThostFtdcOrderField.InstrumentID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 24, 31);
		localCThostFtdcOrderField.OrderRef = BufferUtil.bytes2str(
				paramArrayOfByte, 55, 13);
		localCThostFtdcOrderField.UserID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 68, 16);
		localCThostFtdcOrderField.OrderPriceType = (char) paramArrayOfByte[84];
		localCThostFtdcOrderField.Direction = (char) paramArrayOfByte[85];
		localCThostFtdcOrderField.CombOffsetFlag = BufferUtil.bytes2str(
				paramArrayOfByte, 86, 5);
		localCThostFtdcOrderField.CombHedgeFlag = BufferUtil.bytes2str(
				paramArrayOfByte, 91, 5);
		localCThostFtdcOrderField.LimitPrice = localByteBuffer.getDouble(96);
		localCThostFtdcOrderField.VolumeTotalOriginal = localByteBuffer
				.getInt(104);
		localCThostFtdcOrderField.TimeCondition = (char) paramArrayOfByte[108];
		localCThostFtdcOrderField.GTDDate = BufferUtil.bytes2ascii(
				paramArrayOfByte, 109, 9);
		localCThostFtdcOrderField.VolumeCondition = (char) paramArrayOfByte[118];
		localCThostFtdcOrderField.MinVolume = localByteBuffer.getInt(120);
		localCThostFtdcOrderField.ContingentCondition = (char) paramArrayOfByte[124];
		localCThostFtdcOrderField.StopPrice = localByteBuffer.getDouble(128);
		localCThostFtdcOrderField.ForceCloseReason = (char) paramArrayOfByte[136];
		localCThostFtdcOrderField.IsAutoSuspend = (localByteBuffer.getInt(140) != 0);
		localCThostFtdcOrderField.BusinessUnit = BufferUtil.bytes2str(
				paramArrayOfByte, 144, 21);
		localCThostFtdcOrderField.RequestID = localByteBuffer.getInt(168);
		localCThostFtdcOrderField.OrderLocalID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 172, 13);
		localCThostFtdcOrderField.ExchangeID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 185, 9);
		localCThostFtdcOrderField.ParticipantID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 194, 11);
		localCThostFtdcOrderField.ClientID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 205, 11);
		localCThostFtdcOrderField.ExchangeInstID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 216, 31);
		localCThostFtdcOrderField.TraderID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 247, 21);
		localCThostFtdcOrderField.InstallID = localByteBuffer.getInt(268);
		localCThostFtdcOrderField.OrderSubmitStatus = (char) paramArrayOfByte[272];
		localCThostFtdcOrderField.NotifySequence = localByteBuffer.getInt(276);
		localCThostFtdcOrderField.TradingDay = BufferUtil.bytes2ascii(
				paramArrayOfByte, 280, 9);
		localCThostFtdcOrderField.SettlementID = localByteBuffer.getInt(292);
		localCThostFtdcOrderField.OrderSysID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 296, 21);
		localCThostFtdcOrderField.OrderSource = (char) paramArrayOfByte[317];
		localCThostFtdcOrderField.OrderStatus = (char) paramArrayOfByte[318];
		localCThostFtdcOrderField.OrderType = (char) paramArrayOfByte[319];
		localCThostFtdcOrderField.VolumeTraded = localByteBuffer.getInt(320);
		localCThostFtdcOrderField.VolumeTotal = localByteBuffer.getInt(324);
		localCThostFtdcOrderField.InsertDate = BufferUtil.bytes2ascii(
				paramArrayOfByte, 328, 9);
		localCThostFtdcOrderField.InsertTime = BufferUtil.bytes2ascii(
				paramArrayOfByte, 337, 9);
		localCThostFtdcOrderField.ActiveTime = BufferUtil.bytes2ascii(
				paramArrayOfByte, 346, 9);
		localCThostFtdcOrderField.SuspendTime = BufferUtil.bytes2ascii(
				paramArrayOfByte, 355, 9);
		localCThostFtdcOrderField.UpdateTime = BufferUtil.bytes2ascii(
				paramArrayOfByte, 364, 9);
		localCThostFtdcOrderField.CancelTime = BufferUtil.bytes2ascii(
				paramArrayOfByte, 373, 9);
		localCThostFtdcOrderField.ActiveTraderID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 382, 21);
		localCThostFtdcOrderField.ClearingPartID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 403, 11);
		localCThostFtdcOrderField.SequenceNo = localByteBuffer.getInt(416);
		localCThostFtdcOrderField.FrontID = localByteBuffer.getInt(420);
		localCThostFtdcOrderField.SessionID = localByteBuffer.getInt(424);
		localCThostFtdcOrderField.UserProductInfo = BufferUtil.bytes2str(
				paramArrayOfByte, 428, 11);
		localCThostFtdcOrderField.StatusMsg = BufferUtil.bytes2str(
				paramArrayOfByte, 439, 81);
		localCThostFtdcOrderField.UserForceClose = (localByteBuffer.getInt(520) != 0);
		localCThostFtdcOrderField.ActiveUserID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 524, 16);
		localCThostFtdcOrderField.BrokerOrderSeq = localByteBuffer.getInt(540);
		localCThostFtdcOrderField.RelativeOrderSysID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 544, 21);
		localCThostFtdcOrderField.ZCETotalTradedVolume = localByteBuffer
				.getInt(568);
		localCThostFtdcOrderField.IsSwapOrder = (localByteBuffer.getInt(572) != 0);
		return localCThostFtdcOrderField;
	}

	byte[] toBytes() {
		ByteBuffer localByteBuffer = ByteBuffer.allocate(576).order(
				ByteOrder.nativeOrder());
		BufferUtil.ascii2bytes(localByteBuffer, this.BrokerID, 0, 11);
		BufferUtil.ascii2bytes(localByteBuffer, this.InvestorID, 11, 13);
		BufferUtil.ascii2bytes(localByteBuffer, this.InstrumentID, 24, 31);
		BufferUtil.str2bytes(localByteBuffer, this.OrderRef, 55, 13);
		BufferUtil.ascii2bytes(localByteBuffer, this.UserID, 68, 16);
		localByteBuffer.put(84, (byte) this.OrderPriceType);
		localByteBuffer.put(85, (byte) this.Direction);
		BufferUtil.str2bytes(localByteBuffer, this.CombOffsetFlag, 86, 5);
		BufferUtil.str2bytes(localByteBuffer, this.CombHedgeFlag, 91, 5);
		localByteBuffer.putDouble(96, this.LimitPrice);
		localByteBuffer.putInt(104, this.VolumeTotalOriginal);
		localByteBuffer.put(108, (byte) this.TimeCondition);
		BufferUtil.ascii2bytes(localByteBuffer, this.GTDDate, 109, 9);
		localByteBuffer.put(118, (byte) this.VolumeCondition);
		localByteBuffer.putInt(120, this.MinVolume);
		localByteBuffer.put(124, (byte) this.ContingentCondition);
		localByteBuffer.putDouble(128, this.StopPrice);
		localByteBuffer.put(136, (byte) this.ForceCloseReason);
		localByteBuffer.putInt(140, (this.IsAutoSuspend) ? 1 : 0);
		BufferUtil.str2bytes(localByteBuffer, this.BusinessUnit, 144, 21);
		localByteBuffer.putInt(168, this.RequestID);
		BufferUtil.ascii2bytes(localByteBuffer, this.OrderLocalID, 172, 13);
		BufferUtil.ascii2bytes(localByteBuffer, this.ExchangeID, 185, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.ParticipantID, 194, 11);
		BufferUtil.ascii2bytes(localByteBuffer, this.ClientID, 205, 11);
		BufferUtil.ascii2bytes(localByteBuffer, this.ExchangeInstID, 216, 31);
		BufferUtil.ascii2bytes(localByteBuffer, this.TraderID, 247, 21);
		localByteBuffer.putInt(268, this.InstallID);
		localByteBuffer.put(272, (byte) this.OrderSubmitStatus);
		localByteBuffer.putInt(276, this.NotifySequence);
		BufferUtil.ascii2bytes(localByteBuffer, this.TradingDay, 280, 9);
		localByteBuffer.putInt(292, this.SettlementID);
		BufferUtil.ascii2bytes(localByteBuffer, this.OrderSysID, 296, 21);
		localByteBuffer.put(317, (byte) this.OrderSource);
		localByteBuffer.put(318, (byte) this.OrderStatus);
		localByteBuffer.put(319, (byte) this.OrderType);
		localByteBuffer.putInt(320, this.VolumeTraded);
		localByteBuffer.putInt(324, this.VolumeTotal);
		BufferUtil.ascii2bytes(localByteBuffer, this.InsertDate, 328, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.InsertTime, 337, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.ActiveTime, 346, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.SuspendTime, 355, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.UpdateTime, 364, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.CancelTime, 373, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.ActiveTraderID, 382, 21);
		BufferUtil.ascii2bytes(localByteBuffer, this.ClearingPartID, 403, 11);
		localByteBuffer.putInt(416, this.SequenceNo);
		localByteBuffer.putInt(420, this.FrontID);
		localByteBuffer.putInt(424, this.SessionID);
		BufferUtil.str2bytes(localByteBuffer, this.UserProductInfo, 428, 11);
		BufferUtil.str2bytes(localByteBuffer, this.StatusMsg, 439, 81);
		localByteBuffer.putInt(520, (this.UserForceClose) ? 1 : 0);
		BufferUtil.ascii2bytes(localByteBuffer, this.ActiveUserID, 524, 16);
		localByteBuffer.putInt(540, this.BrokerOrderSeq);
		BufferUtil.ascii2bytes(localByteBuffer, this.RelativeOrderSysID, 544,
				21);
		localByteBuffer.putInt(568, this.ZCETotalTradedVolume);
		localByteBuffer.putInt(572, (this.IsSwapOrder) ? 1 : 0);
		return localByteBuffer.array();
	}

	public String toString() {
		StringBuilder localStringBuilder = new StringBuilder(128);
		localStringBuilder
				.append("CThostFtdcOrderField[")
				.append("BrokerID=")
				.append(this.BrokerID)
				.append(",InvestorID=")
				.append(this.InvestorID)
				.append(",InstrumentID=")
				.append(this.InstrumentID)
				.append(",OrderRef=")
				.append(this.OrderRef)
				.append(",UserID=")
				.append(this.UserID)
				.append(",OrderPriceType=")
				.append((this.OrderPriceType == 0) ? ' ' : this.OrderPriceType)
				.append(",Direction=")
				.append((this.Direction == 0) ? ' ' : this.Direction)
				.append(",CombOffsetFlag=")
				.append(this.CombOffsetFlag)
				.append(",CombHedgeFlag=")
				.append(this.CombHedgeFlag)
				.append(",LimitPrice=")
				.append(this.LimitPrice)
				.append(",VolumeTotalOriginal=")
				.append(this.VolumeTotalOriginal)
				.append(",TimeCondition=")
				.append((this.TimeCondition == 0) ? ' ' : this.TimeCondition)
				.append(",GTDDate=")
				.append(this.GTDDate)
				.append(",VolumeCondition=")
				.append((this.VolumeCondition == 0) ? ' '
						: this.VolumeCondition)
				.append(",MinVolume=")
				.append(this.MinVolume)
				.append(",ContingentCondition=")
				.append((this.ContingentCondition == 0) ? ' '
						: this.ContingentCondition)
				.append(",StopPrice=")
				.append(this.StopPrice)
				.append(",ForceCloseReason=")
				.append((this.ForceCloseReason == 0) ? ' '
						: this.ForceCloseReason)
				.append(",IsAutoSuspend=")
				.append(this.IsAutoSuspend)
				.append(",BusinessUnit=")
				.append(this.BusinessUnit)
				.append(",RequestID=")
				.append(this.RequestID)
				.append(",OrderLocalID=")
				.append(this.OrderLocalID)
				.append(",ExchangeID=")
				.append(this.ExchangeID)
				.append(",ParticipantID=")
				.append(this.ParticipantID)
				.append(",ClientID=")
				.append(this.ClientID)
				.append(",ExchangeInstID=")
				.append(this.ExchangeInstID)
				.append(",TraderID=")
				.append(this.TraderID)
				.append(",InstallID=")
				.append(this.InstallID)
				.append(",OrderSubmitStatus=")
				.append((this.OrderSubmitStatus == 0) ? ' '
						: this.OrderSubmitStatus).append(",NotifySequence=")
				.append(this.NotifySequence).append(",TradingDay=")
				.append(this.TradingDay).append(",SettlementID=")
				.append(this.SettlementID).append(",OrderSysID=")
				.append(this.OrderSysID).append(",OrderSource=")
				.append((this.OrderSource == 0) ? ' ' : this.OrderSource)
				.append(",OrderStatus=")
				.append((this.OrderStatus == 0) ? ' ' : this.OrderStatus)
				.append(",OrderType=")
				.append((this.OrderType == 0) ? ' ' : this.OrderType)
				.append(",VolumeTraded=").append(this.VolumeTraded)
				.append(",VolumeTotal=").append(this.VolumeTotal)
				.append(",InsertDate=").append(this.InsertDate)
				.append(",InsertTime=").append(this.InsertTime)
				.append(",ActiveTime=").append(this.ActiveTime)
				.append(",SuspendTime=").append(this.SuspendTime)
				.append(",UpdateTime=").append(this.UpdateTime)
				.append(",CancelTime=").append(this.CancelTime)
				.append(",ActiveTraderID=").append(this.ActiveTraderID)
				.append(",ClearingPartID=").append(this.ClearingPartID)
				.append(",SequenceNo=").append(this.SequenceNo)
				.append(",FrontID=").append(this.FrontID).append(",SessionID=")
				.append(this.SessionID).append(",UserProductInfo=")
				.append(this.UserProductInfo).append(",StatusMsg=")
				.append(this.StatusMsg).append(",UserForceClose=")
				.append(this.UserForceClose).append(",ActiveUserID=")
				.append(this.ActiveUserID).append(",BrokerOrderSeq=")
				.append(this.BrokerOrderSeq).append(",RelativeOrderSysID=")
				.append(this.RelativeOrderSysID)
				.append(",ZCETotalTradedVolume=")
				.append(this.ZCETotalTradedVolume).append(",IsSwapOrder=")
				.append(this.IsSwapOrder).append("]");
		return localStringBuilder.toString();
	}
}