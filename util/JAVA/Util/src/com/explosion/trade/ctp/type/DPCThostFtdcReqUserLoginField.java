/*** Eclipse Class Decompiler plugin, copyright (c) 2012 Chao Chen (cnfree2000@hotmail.com) ***/
package com.explosion.trade.ctp.type;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;
import net.jctp.CThostFtdcReqUserLoginField;

public class DPCThostFtdcReqUserLoginField  implements Serializable {
	public String TradingDay;
	public String BrokerID;
	public String UserID;
	public String Password;
	public String UserProductInfo;
	public String InterfaceProductInfo;
	public String ProtocolInfo;
	public String MacAddress;
	public String OneTimePassword;
	public String ClientIPAddress;
	
	public DPCThostFtdcReqUserLoginField() {
	}

	public DPCThostFtdcReqUserLoginField(String paramString1,
			String paramString2, String paramString3, String paramString4,
			String paramString5, String paramString6, String paramString7,
			String paramString8, String paramString9, String paramString10) {
		this.TradingDay = paramString1;
		this.BrokerID = paramString2;
		this.UserID = paramString3;
		this.Password = paramString4;
		this.UserProductInfo = paramString5;
		this.InterfaceProductInfo = paramString6;
		this.ProtocolInfo = paramString7;
		this.MacAddress = paramString8;
		this.OneTimePassword = paramString9;
		this.ClientIPAddress = paramString10;
	}

	public static DPCThostFtdcReqUserLoginField fromBuffer(ByteBuffer paramByteBuffer) {
		if (paramByteBuffer == null)
			return null;
		assert (paramByteBuffer.capacity() == 188);
		paramByteBuffer.order(ByteOrder.nativeOrder());
		DPCThostFtdcReqUserLoginField DPlocalCThostFtdcReqUserLoginField = new DPCThostFtdcReqUserLoginField();
		DPlocalCThostFtdcReqUserLoginField.TradingDay = BufferUtil.buffer2ascii(
				paramByteBuffer, 0, 9);
		DPlocalCThostFtdcReqUserLoginField.BrokerID = BufferUtil.buffer2ascii(
				paramByteBuffer, 9, 11);
		DPlocalCThostFtdcReqUserLoginField.UserID = BufferUtil.buffer2ascii(
				paramByteBuffer, 20, 16);
		DPlocalCThostFtdcReqUserLoginField.Password = BufferUtil.buffer2str(
				paramByteBuffer, 36, 41);
		DPlocalCThostFtdcReqUserLoginField.UserProductInfo = BufferUtil
				.buffer2str(paramByteBuffer, 77, 11);
		DPlocalCThostFtdcReqUserLoginField.InterfaceProductInfo = BufferUtil
				.buffer2str(paramByteBuffer, 88, 11);
		DPlocalCThostFtdcReqUserLoginField.ProtocolInfo = BufferUtil.buffer2str(
				paramByteBuffer, 99, 11);
		DPlocalCThostFtdcReqUserLoginField.MacAddress = BufferUtil.buffer2str(
				paramByteBuffer, 110, 21);
		DPlocalCThostFtdcReqUserLoginField.OneTimePassword = BufferUtil
				.buffer2str(paramByteBuffer, 131, 41);
		DPlocalCThostFtdcReqUserLoginField.ClientIPAddress = BufferUtil
				.buffer2str(paramByteBuffer, 172, 16);
		return DPlocalCThostFtdcReqUserLoginField;
	}

	public static DPCThostFtdcReqUserLoginField fromBytes(byte[] paramArrayOfByte) {
		if (paramArrayOfByte == null)
			return null;
		assert (paramArrayOfByte.length == 188);
		DPCThostFtdcReqUserLoginField localCThostFtdcReqUserLoginField = new DPCThostFtdcReqUserLoginField();
		localCThostFtdcReqUserLoginField.TradingDay = BufferUtil.bytes2ascii(
				paramArrayOfByte, 0, 9);
		localCThostFtdcReqUserLoginField.BrokerID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 9, 11);
		localCThostFtdcReqUserLoginField.UserID = BufferUtil.bytes2ascii(
				paramArrayOfByte, 20, 16);
		localCThostFtdcReqUserLoginField.Password = BufferUtil.bytes2str(
				paramArrayOfByte, 36, 41);
		localCThostFtdcReqUserLoginField.UserProductInfo = BufferUtil
				.bytes2str(paramArrayOfByte, 77, 11);
		localCThostFtdcReqUserLoginField.InterfaceProductInfo = BufferUtil
				.bytes2str(paramArrayOfByte, 88, 11);
		localCThostFtdcReqUserLoginField.ProtocolInfo = BufferUtil.bytes2str(
				paramArrayOfByte, 99, 11);
		localCThostFtdcReqUserLoginField.MacAddress = BufferUtil.bytes2str(
				paramArrayOfByte, 110, 21);
		localCThostFtdcReqUserLoginField.OneTimePassword = BufferUtil
				.bytes2str(paramArrayOfByte, 131, 41);
		localCThostFtdcReqUserLoginField.ClientIPAddress = BufferUtil
				.bytes2str(paramArrayOfByte, 172, 16);
		return localCThostFtdcReqUserLoginField;
	}

	public byte[] toBytes() {
		ByteBuffer localByteBuffer = ByteBuffer.allocate(188).order(
				ByteOrder.nativeOrder());
		BufferUtil.ascii2bytes(localByteBuffer, this.TradingDay, 0, 9);
		BufferUtil.ascii2bytes(localByteBuffer, this.BrokerID, 9, 11);
		BufferUtil.ascii2bytes(localByteBuffer, this.UserID, 20, 16);
		BufferUtil.str2bytes(localByteBuffer, this.Password, 36, 41);
		BufferUtil.str2bytes(localByteBuffer, this.UserProductInfo, 77, 11);
		BufferUtil
				.str2bytes(localByteBuffer, this.InterfaceProductInfo, 88, 11);
		BufferUtil.str2bytes(localByteBuffer, this.ProtocolInfo, 99, 11);
		BufferUtil.str2bytes(localByteBuffer, this.MacAddress, 110, 21);
		BufferUtil.str2bytes(localByteBuffer, this.OneTimePassword, 131, 41);
		BufferUtil.str2bytes(localByteBuffer, this.ClientIPAddress, 172, 16);
		return localByteBuffer.array();
	}

	public String toString() {
		StringBuilder localStringBuilder = new StringBuilder(128);
		localStringBuilder.append("CThostFtdcReqUserLoginField[")
				.append("TradingDay=").append(this.TradingDay)
				.append(",BrokerID=").append(this.BrokerID).append(",UserID=")
				.append(this.UserID).append(",Password=").append(this.Password)
				.append(",UserProductInfo=").append(this.UserProductInfo)
				.append(",InterfaceProductInfo=")
				.append(this.InterfaceProductInfo).append(",ProtocolInfo=")
				.append(this.ProtocolInfo).append(",MacAddress=")
				.append(this.MacAddress).append(",OneTimePassword=")
				.append(this.OneTimePassword).append(",ClientIPAddress=")
				.append(this.ClientIPAddress).append("]");
		return localStringBuilder.toString();
	}
}