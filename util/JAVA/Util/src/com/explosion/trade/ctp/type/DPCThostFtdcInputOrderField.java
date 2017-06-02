/*** Eclipse Class Decompiler plugin, copyright (c) 2012 Chao Chen (cnfree2000@hotmail.com) ***/
package com.explosion.trade.ctp.type;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;
import net.jctp.CThostFtdcInputOrderField;

public final class DPCThostFtdcInputOrderField implements Serializable {
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
	public boolean UserForceClose;
	public boolean IsSwapOrder;
	public String TacticID;
	public String TacticType;
	public String PortName;
	public int validinvertal;
	public long unixtime;				// entrust time
	public String sRemark;
	
	
	public DPCThostFtdcInputOrderField() {
	}

	public DPCThostFtdcInputOrderField(CThostFtdcInputOrderField f) {
		this.BrokerID = f.BrokerID;
		this.InvestorID = f.InvestorID;
		this.InstrumentID = f.InstrumentID;
		this.OrderRef = f.OrderRef;
		this.UserID = f.UserID;
		this.OrderPriceType = f.OrderPriceType;
		this.Direction = f.Direction;
		this.CombOffsetFlag = f.CombOffsetFlag;
		this.CombHedgeFlag = f.CombHedgeFlag;
		this.LimitPrice = f.LimitPrice;
		this.VolumeTotalOriginal = f.VolumeTotalOriginal;
		this.TimeCondition = f.TimeCondition;
		this.GTDDate = f.GTDDate;
		this.VolumeCondition = f.VolumeCondition;
		this.MinVolume = f.MinVolume;
		this.ContingentCondition = f.ContingentCondition;
		this.StopPrice = f.StopPrice;
		this.ForceCloseReason = f.ForceCloseReason;
		this.IsAutoSuspend = f.IsAutoSuspend;
		this.BusinessUnit = f.BusinessUnit;
		this.RequestID = f.RequestID;
		this.UserForceClose = f.UserForceClose;
		this.IsSwapOrder = f.IsSwapOrder;
	}
	
	public DPCThostFtdcInputOrderField(String paramString1, String paramString2,
			String paramString3, String paramString4, String paramString5,
			char paramChar1, char paramChar2, String paramString6,
			String paramString7, double paramDouble1, int paramInt1,
			char paramChar3, String paramString8, char paramChar4,
			int paramInt2, char paramChar5, double paramDouble2,
			char paramChar6, boolean paramBoolean1, String paramString9,
			int paramInt3, boolean paramBoolean2, boolean paramBoolean3) {
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
		this.UserForceClose = paramBoolean2;
		this.IsSwapOrder = paramBoolean3;
	}

	static DPCThostFtdcInputOrderField fromBuffer(ByteBuffer paramByteBuffer) {
		if (paramByteBuffer == null)
			return null;
		assert (paramByteBuffer.capacity() == 184);
		paramByteBuffer.order(ByteOrder.nativeOrder());
		DPCThostFtdcInputOrderField localCThostFtdcInputOrderField = new DPCThostFtdcInputOrderField();
		localCThostFtdcInputOrderField.BrokerID = BufferUtil.buffer2ascii(
				paramByteBuffer, 0, 11);
		localCThostFtdcInputOrderField.InvestorID = BufferUtil.buffer2ascii(
				paramByteBuffer, 11, 13);
		localCThostFtdcInputOrderField.InstrumentID = BufferUtil.buffer2ascii(
				paramByteBuffer, 24, 31);
		localCThostFtdcInputOrderField.OrderRef = BufferUtil.buffer2str(
				paramByteBuffer, 55, 13);
		localCThostFtdcInputOrderField.UserID = BufferUtil.buffer2ascii(
				paramByteBuffer, 68, 16);
		localCThostFtdcInputOrderField.OrderPriceType = (char) paramByteBuffer
				.get(84);
		localCThostFtdcInputOrderField.Direction = (char) paramByteBuffer
				.get(85);
		localCThostFtdcInputOrderField.CombOffsetFlag = BufferUtil.buffer2str(
				paramByteBuffer, 86, 5);
		localCThostFtdcInputOrderField.CombHedgeFlag = BufferUtil.buffer2str(
				paramByteBuffer, 91, 5);
		localCThostFtdcInputOrderField.LimitPrice = paramByteBuffer
				.getDouble(96);
		localCThostFtdcInputOrderField.VolumeTotalOriginal = paramByteBuffer
				.getInt(104);
		localCThostFtdcInputOrderField.TimeCondition = (char) paramByteBuffer
				.get(108);
		localCThostFtdcInputOrderField.GTDDate = BufferUtil.buffer2ascii(
				paramByteBuffer, 109, 9);
		localCThostFtdcInputOrderField.VolumeCondition = (char) paramByteBuffer
				.get(118);
		localCThostFtdcInputOrderField.MinVolume = paramByteBuffer.getInt(120);
		localCThostFtdcInputOrderField.ContingentCondition = (char) paramByteBuffer
				.get(124);
		localCThostFtdcInputOrderField.StopPrice = paramByteBuffer
				.getDouble(128);
		localCThostFtdcInputOrderField.ForceCloseReason = (char) paramByteBuffer
				.get(136);
		localCThostFtdcInputOrderField.IsAutoSuspend = (paramByteBuffer
				.getInt(140) != 0);
		localCThostFtdcInputOrderField.BusinessUnit = BufferUtil.buffer2str(
				paramByteBuffer, 144, 21);
		localCThostFtdcInputOrderField.RequestID = paramByteBuffer.getInt(168);
		localCThostFtdcInputOrderField.UserForceClose = (paramByteBuffer
				.getInt(172) != 0);
		localCThostFtdcInputOrderField.IsSwapOrder = (paramByteBuffer
				.getInt(176) != 0);
		return localCThostFtdcInputOrderField;
	}

	static DPCThostFtdcInputOrderField fromBytes(byte[] paramArrayOfByte) {
		if (paramArrayOfByte == null)
			return null;
		assert (paramArrayOfByte.length == 184);
		ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte).order(
				ByteOrder.nativeOrder());
		DPCThostFtdcInputOrderField localCThostFtdcInputOrderField = new DPCThostFtdcInputOrderField();
		localCThostFtdcInputOrderField.BrokerID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 0, 11);
		localCThostFtdcInputOrderField.InvestorID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 11, 13);
		localCThostFtdcInputOrderField.InstrumentID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 24, 31);
		localCThostFtdcInputOrderField.OrderRef = BufferUtil.bytes2str(
				paramArrayOfByte, 55, 13);
		localCThostFtdcInputOrderField.UserID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 68, 16);
		localCThostFtdcInputOrderField.OrderPriceType = (char) paramArrayOfByte[84];
		localCThostFtdcInputOrderField.Direction = (char) paramArrayOfByte[85];
		localCThostFtdcInputOrderField.CombOffsetFlag = BufferUtil.bytes2str(
				paramArrayOfByte, 86, 5);
		localCThostFtdcInputOrderField.CombHedgeFlag = BufferUtil.bytes2str(
				paramArrayOfByte, 91, 5);
		localCThostFtdcInputOrderField.LimitPrice = localByteBuffer
				.getDouble(96);
		localCThostFtdcInputOrderField.VolumeTotalOriginal = localByteBuffer
				.getInt(104);
		localCThostFtdcInputOrderField.TimeCondition = (char) paramArrayOfByte[108];
		localCThostFtdcInputOrderField.GTDDate = BufferUtil.bytes2ascii(
				paramArrayOfByte, 109, 9);
		localCThostFtdcInputOrderField.VolumeCondition = (char) paramArrayOfByte[118];
		localCThostFtdcInputOrderField.MinVolume = localByteBuffer.getInt(120);
		localCThostFtdcInputOrderField.ContingentCondition = (char) paramArrayOfByte[124];
		localCThostFtdcInputOrderField.StopPrice = localByteBuffer
				.getDouble(128);
		localCThostFtdcInputOrderField.ForceCloseReason = (char) paramArrayOfByte[136];
		localCThostFtdcInputOrderField.IsAutoSuspend = (localByteBuffer
				.getInt(140) != 0);
		localCThostFtdcInputOrderField.BusinessUnit = BufferUtil.bytes2str(
				paramArrayOfByte, 144, 21);
		localCThostFtdcInputOrderField.RequestID = localByteBuffer.getInt(168);
		localCThostFtdcInputOrderField.UserForceClose = (localByteBuffer
				.getInt(172) != 0);
		localCThostFtdcInputOrderField.IsSwapOrder = (localByteBuffer
				.getInt(176) != 0);
		return localCThostFtdcInputOrderField;
	}

	byte[] toBytes() {
		ByteBuffer localByteBuffer = ByteBuffer.allocate(184).order(
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
		localByteBuffer.putInt(172, (this.UserForceClose) ? 1 : 0);
		localByteBuffer.putInt(176, (this.IsSwapOrder) ? 1 : 0);
		return localByteBuffer.array();
	}

	public String toString() {
		StringBuilder localStringBuilder = new StringBuilder(128);
		localStringBuilder
				.append("DPCThostFtdcInputOrderField[")
				.append("TacticID=")
				.append(this.TacticID)
				.append(",TacticType=")
				.append(this.TacticType)
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
						: this.ForceCloseReason).append(",IsAutoSuspend=")
				.append(this.IsAutoSuspend).append(",BusinessUnit=")
				.append(this.BusinessUnit).append(",RequestID=")
				.append(this.RequestID).append(",UserForceClose=")
				.append(this.UserForceClose).append(",IsSwapOrder=")
				.append(this.IsSwapOrder).append("]");
		return localStringBuilder.toString();
	}
}