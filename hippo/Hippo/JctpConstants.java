package net.jctp;

public interface JctpConstants {
    public static final int SizeOf_Pointer=4;
    public static final int THOST_TERT_RESTART=0;
    public static final int THOST_TERT_RESUME=1;
    public static final int THOST_TERT_QUICK=2;

    /**
     *TFtdcTraderIDType是一个交易所交易员代码类型
     */
    public static final int SizeOf_TThostFtdcTraderIDType=21;

    /**
     *TFtdcInvestorIDType是一个投资者代码类型
     */
    public static final int SizeOf_TThostFtdcInvestorIDType=13;

    /**
     *TFtdcBrokerIDType是一个经纪公司代码类型
     */
    public static final int SizeOf_TThostFtdcBrokerIDType=11;

    /**
     *TFtdcBrokerAbbrType是一个经纪公司简称类型
     */
    public static final int SizeOf_TThostFtdcBrokerAbbrType=9;

    /**
     *TFtdcBrokerNameType是一个经纪公司名称类型
     */
    public static final int SizeOf_TThostFtdcBrokerNameType=81;

    /**
     *TFtdcExchangeInstIDType是一个合约在交易所的代码类型
     */
    public static final int SizeOf_TThostFtdcExchangeInstIDType=31;

    /**
     *TFtdcOrderRefType是一个报单引用类型
     */
    public static final int SizeOf_TThostFtdcOrderRefType=13;

    /**
     *TFtdcParticipantIDType是一个会员代码类型
     */
    public static final int SizeOf_TThostFtdcParticipantIDType=11;

    /**
     *TFtdcUserIDType是一个用户代码类型
     */
    public static final int SizeOf_TThostFtdcUserIDType=16;

    /**
     *TFtdcPasswordType是一个密码类型
     */
    public static final int SizeOf_TThostFtdcPasswordType=41;

    /**
     *TFtdcClientIDType是一个交易编码类型
     */
    public static final int SizeOf_TThostFtdcClientIDType=11;

    /**
     *TFtdcInstrumentIDType是一个合约代码类型
     */
    public static final int SizeOf_TThostFtdcInstrumentIDType=31;

    /**
     *TFtdcMarketIDType是一个市场代码类型
     */
    public static final int SizeOf_TThostFtdcMarketIDType=31;

    /**
     *TFtdcProductNameType是一个产品名称类型
     */
    public static final int SizeOf_TThostFtdcProductNameType=21;

    /**
     *TFtdcExchangeIDType是一个交易所代码类型
     */
    public static final int SizeOf_TThostFtdcExchangeIDType=9;

    /**
     *TFtdcExchangeNameType是一个交易所名称类型
     */
    public static final int SizeOf_TThostFtdcExchangeNameType=61;

    /**
     *TFtdcExchangeAbbrType是一个交易所简称类型
     */
    public static final int SizeOf_TThostFtdcExchangeAbbrType=9;

    /**
     *TFtdcExchangeFlagType是一个交易所标志类型
     */
    public static final int SizeOf_TThostFtdcExchangeFlagType=2;

    /**
     *TFtdcMacAddressType是一个Mac地址类型
     */
    public static final int SizeOf_TThostFtdcMacAddressType=21;

    /**
     *TFtdcSystemIDType是一个系统编号类型
     */
    public static final int SizeOf_TThostFtdcSystemIDType=21;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcExchangePropertyType
     */
    public static final char THOST_FTDC_EXP_Normal='0';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcExchangePropertyType
     */
    public static final String STRING_THOST_FTDC_EXP_Normal="0";

    /**
     *根据成交生成报单 {@value}
     *@see #SizeOf_TThostFtdcExchangePropertyType
     */
    public static final char THOST_FTDC_EXP_GenOrderByTrade='1';

    /**
     *根据成交生成报单 {@value}
     *@see #SizeOf_TThostFtdcExchangePropertyType
     */
    public static final String STRING_THOST_FTDC_EXP_GenOrderByTrade="1";

    /**
     *TFtdcExchangePropertyType是一个交易所属性类型
     *@see #THOST_FTDC_EXP_Normal
     *@see #THOST_FTDC_EXP_GenOrderByTrade
     */
    public static final int SizeOf_TThostFtdcExchangePropertyType=1;

    /**
     *TFtdcDateType是一个日期类型
     */
    public static final int SizeOf_TThostFtdcDateType=9;

    /**
     *TFtdcTimeType是一个时间类型
     */
    public static final int SizeOf_TThostFtdcTimeType=9;

    /**
     *TFtdcLongTimeType是一个长时间类型
     */
    public static final int SizeOf_TThostFtdcLongTimeType=13;

    /**
     *TFtdcInstrumentNameType是一个合约名称类型
     */
    public static final int SizeOf_TThostFtdcInstrumentNameType=21;

    /**
     *TFtdcSettlementGroupIDType是一个结算组代码类型
     */
    public static final int SizeOf_TThostFtdcSettlementGroupIDType=9;

    /**
     *TFtdcOrderSysIDType是一个报单编号类型
     */
    public static final int SizeOf_TThostFtdcOrderSysIDType=21;

    /**
     *TFtdcTradeIDType是一个成交编号类型
     */
    public static final int SizeOf_TThostFtdcTradeIDType=21;

    /**
     *TFtdcCommandTypeType是一个DB命令类型类型
     */
    public static final int SizeOf_TThostFtdcCommandTypeType=65;

    /**
     *TFtdcIPAddressType是一个IP地址类型
     */
    public static final int SizeOf_TThostFtdcIPAddressType=16;

    /**
     *TFtdcIPPortType是一个IP端口类型
     */
    public static final int SizeOf_TThostFtdcIPPortType=4;

    /**
     *TFtdcProductInfoType是一个产品信息类型
     */
    public static final int SizeOf_TThostFtdcProductInfoType=11;

    /**
     *TFtdcProtocolInfoType是一个协议信息类型
     */
    public static final int SizeOf_TThostFtdcProtocolInfoType=11;

    /**
     *TFtdcBusinessUnitType是一个业务单元类型
     */
    public static final int SizeOf_TThostFtdcBusinessUnitType=21;

    /**
     *TFtdcDepositSeqNoType是一个出入金流水号类型
     */
    public static final int SizeOf_TThostFtdcDepositSeqNoType=15;

    /**
     *TFtdcIdentifiedCardNoType是一个证件号码类型
     */
    public static final int SizeOf_TThostFtdcIdentifiedCardNoType=51;

    /**
     *组织机构代码 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_EID='0';

    /**
     *组织机构代码 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_EID="0";

    /**
     *中国公民身份证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_IDCard='1';

    /**
     *中国公民身份证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_IDCard="1";

    /**
     *军官证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_OfficerIDCard='2';

    /**
     *军官证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_OfficerIDCard="2";

    /**
     *警官证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_PoliceIDCard='3';

    /**
     *警官证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_PoliceIDCard="3";

    /**
     *士兵证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_SoldierIDCard='4';

    /**
     *士兵证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_SoldierIDCard="4";

    /**
     *户口簿 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_HouseholdRegister='5';

    /**
     *户口簿 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_HouseholdRegister="5";

    /**
     *护照 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_Passport='6';

    /**
     *护照 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_Passport="6";

    /**
     *台胞证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_TaiwanCompatriotIDCard='7';

    /**
     *台胞证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_TaiwanCompatriotIDCard="7";

    /**
     *回乡证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_HomeComingCard='8';

    /**
     *回乡证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_HomeComingCard="8";

    /**
     *营业执照号 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_LicenseNo='9';

    /**
     *营业执照号 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_LicenseNo="9";

    /**
     *税务登记号/当地纳税ID {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_TaxNo='A';

    /**
     *税务登记号/当地纳税ID {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_TaxNo="A";

    /**
     *港澳居民来往内地通行证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_HMMainlandTravelPermit='B';

    /**
     *港澳居民来往内地通行证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_HMMainlandTravelPermit="B";

    /**
     *台湾居民来往大陆通行证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_TwMainlandTravelPermit='C';

    /**
     *台湾居民来往大陆通行证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_TwMainlandTravelPermit="C";

    /**
     *驾照 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_DrivingLicense='D';

    /**
     *驾照 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_DrivingLicense="D";

    /**
     *当地社保ID {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_SocialID='F';

    /**
     *当地社保ID {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_SocialID="F";

    /**
     *当地身份证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_LocalID='G';

    /**
     *当地身份证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_LocalID="G";

    /**
     *商业登记证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_BusinessRegistration='H';

    /**
     *商业登记证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_BusinessRegistration="H";

    /**
     *港澳永久性居民身份证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_HKMCIDCard='I';

    /**
     *港澳永久性居民身份证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_HKMCIDCard="I";

    /**
     *人行开户许可证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_AccountsPermits='J';

    /**
     *人行开户许可证 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_AccountsPermits="J";

    /**
     *其他证件 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final char THOST_FTDC_ICT_OtherCard='x';

    /**
     *其他证件 {@value}
     *@see #SizeOf_TThostFtdcIdCardTypeType
     */
    public static final String STRING_THOST_FTDC_ICT_OtherCard="x";

    /**
     *TFtdcIdCardTypeType是一个证件类型类型
     *@see #THOST_FTDC_ICT_EID
     *@see #THOST_FTDC_ICT_IDCard
     *@see #THOST_FTDC_ICT_OfficerIDCard
     *@see #THOST_FTDC_ICT_PoliceIDCard
     *@see #THOST_FTDC_ICT_SoldierIDCard
     *@see #THOST_FTDC_ICT_HouseholdRegister
     *@see #THOST_FTDC_ICT_Passport
     *@see #THOST_FTDC_ICT_TaiwanCompatriotIDCard
     *@see #THOST_FTDC_ICT_HomeComingCard
     *@see #THOST_FTDC_ICT_LicenseNo
     *@see #THOST_FTDC_ICT_TaxNo
     *@see #THOST_FTDC_ICT_HMMainlandTravelPermit
     *@see #THOST_FTDC_ICT_TwMainlandTravelPermit
     *@see #THOST_FTDC_ICT_DrivingLicense
     *@see #THOST_FTDC_ICT_SocialID
     *@see #THOST_FTDC_ICT_LocalID
     *@see #THOST_FTDC_ICT_BusinessRegistration
     *@see #THOST_FTDC_ICT_HKMCIDCard
     *@see #THOST_FTDC_ICT_AccountsPermits
     *@see #THOST_FTDC_ICT_OtherCard
     */
    public static final int SizeOf_TThostFtdcIdCardTypeType=1;

    /**
     *TFtdcOrderLocalIDType是一个本地报单编号类型
     */
    public static final int SizeOf_TThostFtdcOrderLocalIDType=13;

    /**
     *TFtdcUserNameType是一个用户名称类型
     */
    public static final int SizeOf_TThostFtdcUserNameType=81;

    /**
     *TFtdcPartyNameType是一个参与人名称类型
     */
    public static final int SizeOf_TThostFtdcPartyNameType=81;

    /**
     *TFtdcErrorMsgType是一个错误信息类型
     */
    public static final int SizeOf_TThostFtdcErrorMsgType=81;

    /**
     *TFtdcFieldNameType是一个字段名类型
     */
    public static final int SizeOf_TThostFtdcFieldNameType=2049;

    /**
     *TFtdcFieldContentType是一个字段内容类型
     */
    public static final int SizeOf_TThostFtdcFieldContentType=2049;

    /**
     *TFtdcSystemNameType是一个系统名称类型
     */
    public static final int SizeOf_TThostFtdcSystemNameType=41;

    /**
     *TFtdcContentType是一个消息正文类型
     */
    public static final int SizeOf_TThostFtdcContentType=501;

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcInvestorRangeType
     */
    public static final char THOST_FTDC_IR_All='1';

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_IR_All="1";

    /**
     *投资者组 {@value}
     *@see #SizeOf_TThostFtdcInvestorRangeType
     */
    public static final char THOST_FTDC_IR_Group='2';

    /**
     *投资者组 {@value}
     *@see #SizeOf_TThostFtdcInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_IR_Group="2";

    /**
     *单一投资者 {@value}
     *@see #SizeOf_TThostFtdcInvestorRangeType
     */
    public static final char THOST_FTDC_IR_Single='3';

    /**
     *单一投资者 {@value}
     *@see #SizeOf_TThostFtdcInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_IR_Single="3";

    /**
     *TFtdcInvestorRangeType是一个投资者范围类型
     *@see #THOST_FTDC_IR_All
     *@see #THOST_FTDC_IR_Group
     *@see #THOST_FTDC_IR_Single
     */
    public static final int SizeOf_TThostFtdcInvestorRangeType=1;

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcDepartmentRangeType
     */
    public static final char THOST_FTDC_DR_All='1';

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcDepartmentRangeType
     */
    public static final String STRING_THOST_FTDC_DR_All="1";

    /**
     *组织架构 {@value}
     *@see #SizeOf_TThostFtdcDepartmentRangeType
     */
    public static final char THOST_FTDC_DR_Group='2';

    /**
     *组织架构 {@value}
     *@see #SizeOf_TThostFtdcDepartmentRangeType
     */
    public static final String STRING_THOST_FTDC_DR_Group="2";

    /**
     *单一投资者 {@value}
     *@see #SizeOf_TThostFtdcDepartmentRangeType
     */
    public static final char THOST_FTDC_DR_Single='3';

    /**
     *单一投资者 {@value}
     *@see #SizeOf_TThostFtdcDepartmentRangeType
     */
    public static final String STRING_THOST_FTDC_DR_Single="3";

    /**
     *TFtdcDepartmentRangeType是一个投资者范围类型
     *@see #THOST_FTDC_DR_All
     *@see #THOST_FTDC_DR_Group
     *@see #THOST_FTDC_DR_Single
     */
    public static final int SizeOf_TThostFtdcDepartmentRangeType=1;

    /**
     *未同步 {@value}
     *@see #SizeOf_TThostFtdcDataSyncStatusType
     */
    public static final char THOST_FTDC_DS_Asynchronous='1';

    /**
     *未同步 {@value}
     *@see #SizeOf_TThostFtdcDataSyncStatusType
     */
    public static final String STRING_THOST_FTDC_DS_Asynchronous="1";

    /**
     *同步中 {@value}
     *@see #SizeOf_TThostFtdcDataSyncStatusType
     */
    public static final char THOST_FTDC_DS_Synchronizing='2';

    /**
     *同步中 {@value}
     *@see #SizeOf_TThostFtdcDataSyncStatusType
     */
    public static final String STRING_THOST_FTDC_DS_Synchronizing="2";

    /**
     *已同步 {@value}
     *@see #SizeOf_TThostFtdcDataSyncStatusType
     */
    public static final char THOST_FTDC_DS_Synchronized='3';

    /**
     *已同步 {@value}
     *@see #SizeOf_TThostFtdcDataSyncStatusType
     */
    public static final String STRING_THOST_FTDC_DS_Synchronized="3";

    /**
     *TFtdcDataSyncStatusType是一个数据同步状态类型
     *@see #THOST_FTDC_DS_Asynchronous
     *@see #THOST_FTDC_DS_Synchronizing
     *@see #THOST_FTDC_DS_Synchronized
     */
    public static final int SizeOf_TThostFtdcDataSyncStatusType=1;

    /**
     *已同步 {@value}
     *@see #SizeOf_TThostFtdcBrokerDataSyncStatusType
     */
    public static final char THOST_FTDC_BDS_Synchronized='1';

    /**
     *已同步 {@value}
     *@see #SizeOf_TThostFtdcBrokerDataSyncStatusType
     */
    public static final String STRING_THOST_FTDC_BDS_Synchronized="1";

    /**
     *同步中 {@value}
     *@see #SizeOf_TThostFtdcBrokerDataSyncStatusType
     */
    public static final char THOST_FTDC_BDS_Synchronizing='2';

    /**
     *同步中 {@value}
     *@see #SizeOf_TThostFtdcBrokerDataSyncStatusType
     */
    public static final String STRING_THOST_FTDC_BDS_Synchronizing="2";

    /**
     *TFtdcBrokerDataSyncStatusType是一个经纪公司数据同步状态类型
     *@see #THOST_FTDC_BDS_Synchronized
     *@see #THOST_FTDC_BDS_Synchronizing
     */
    public static final int SizeOf_TThostFtdcBrokerDataSyncStatusType=1;

    /**
     *没有任何连接 {@value}
     *@see #SizeOf_TThostFtdcExchangeConnectStatusType
     */
    public static final char THOST_FTDC_ECS_NoConnection='1';

    /**
     *没有任何连接 {@value}
     *@see #SizeOf_TThostFtdcExchangeConnectStatusType
     */
    public static final String STRING_THOST_FTDC_ECS_NoConnection="1";

    /**
     *已经发出合约查询请求 {@value}
     *@see #SizeOf_TThostFtdcExchangeConnectStatusType
     */
    public static final char THOST_FTDC_ECS_QryInstrumentSent='2';

    /**
     *已经发出合约查询请求 {@value}
     *@see #SizeOf_TThostFtdcExchangeConnectStatusType
     */
    public static final String STRING_THOST_FTDC_ECS_QryInstrumentSent="2";

    /**
     *已经获取信息 {@value}
     *@see #SizeOf_TThostFtdcExchangeConnectStatusType
     */
    public static final char THOST_FTDC_ECS_GotInformation='9';

    /**
     *已经获取信息 {@value}
     *@see #SizeOf_TThostFtdcExchangeConnectStatusType
     */
    public static final String STRING_THOST_FTDC_ECS_GotInformation="9";

    /**
     *TFtdcExchangeConnectStatusType是一个交易所连接状态类型
     *@see #THOST_FTDC_ECS_NoConnection
     *@see #THOST_FTDC_ECS_QryInstrumentSent
     *@see #THOST_FTDC_ECS_GotInformation
     */
    public static final int SizeOf_TThostFtdcExchangeConnectStatusType=1;

    /**
     *没有任何连接 {@value}
     *@see #SizeOf_TThostFtdcTraderConnectStatusType
     */
    public static final char THOST_FTDC_TCS_NotConnected='1';

    /**
     *没有任何连接 {@value}
     *@see #SizeOf_TThostFtdcTraderConnectStatusType
     */
    public static final String STRING_THOST_FTDC_TCS_NotConnected="1";

    /**
     *已经连接 {@value}
     *@see #SizeOf_TThostFtdcTraderConnectStatusType
     */
    public static final char THOST_FTDC_TCS_Connected='2';

    /**
     *已经连接 {@value}
     *@see #SizeOf_TThostFtdcTraderConnectStatusType
     */
    public static final String STRING_THOST_FTDC_TCS_Connected="2";

    /**
     *已经发出合约查询请求 {@value}
     *@see #SizeOf_TThostFtdcTraderConnectStatusType
     */
    public static final char THOST_FTDC_TCS_QryInstrumentSent='3';

    /**
     *已经发出合约查询请求 {@value}
     *@see #SizeOf_TThostFtdcTraderConnectStatusType
     */
    public static final String STRING_THOST_FTDC_TCS_QryInstrumentSent="3";

    /**
     *订阅私有流 {@value}
     *@see #SizeOf_TThostFtdcTraderConnectStatusType
     */
    public static final char THOST_FTDC_TCS_SubPrivateFlow='4';

    /**
     *订阅私有流 {@value}
     *@see #SizeOf_TThostFtdcTraderConnectStatusType
     */
    public static final String STRING_THOST_FTDC_TCS_SubPrivateFlow="4";

    /**
     *TFtdcTraderConnectStatusType是一个交易所交易员连接状态类型
     *@see #THOST_FTDC_TCS_NotConnected
     *@see #THOST_FTDC_TCS_Connected
     *@see #THOST_FTDC_TCS_QryInstrumentSent
     *@see #THOST_FTDC_TCS_SubPrivateFlow
     */
    public static final int SizeOf_TThostFtdcTraderConnectStatusType=1;

    /**
     *数据异步化 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_DataAsync='1';

    /**
     *数据异步化 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_DataAsync="1";

    /**
     *强制用户登出 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_ForceUserLogout='2';

    /**
     *强制用户登出 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_ForceUserLogout="2";

    /**
     *变更管理用户口令 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_UserPasswordUpdate='3';

    /**
     *变更管理用户口令 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_UserPasswordUpdate="3";

    /**
     *变更经纪公司口令 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_BrokerPasswordUpdate='4';

    /**
     *变更经纪公司口令 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_BrokerPasswordUpdate="4";

    /**
     *变更投资者口令 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_InvestorPasswordUpdate='5';

    /**
     *变更投资者口令 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_InvestorPasswordUpdate="5";

    /**
     *报单插入 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_OrderInsert='6';

    /**
     *报单插入 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_OrderInsert="6";

    /**
     *报单操作 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_OrderAction='7';

    /**
     *报单操作 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_OrderAction="7";

    /**
     *同步系统数据 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_SyncSystemData='8';

    /**
     *同步系统数据 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_SyncSystemData="8";

    /**
     *同步经纪公司数据 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_SyncBrokerData='9';

    /**
     *同步经纪公司数据 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_SyncBrokerData="9";

    /**
     *批量同步经纪公司数据 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_BachSyncBrokerData='A';

    /**
     *批量同步经纪公司数据 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_BachSyncBrokerData="A";

    /**
     *超级查询 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_SuperQuery='B';

    /**
     *超级查询 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_SuperQuery="B";

    /**
     *预埋报单插入 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_ParkedOrderInsert='C';

    /**
     *预埋报单插入 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_ParkedOrderInsert="C";

    /**
     *预埋报单操作 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_ParkedOrderAction='D';

    /**
     *预埋报单操作 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_ParkedOrderAction="D";

    /**
     *同步动态令牌 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_SyncOTP='E';

    /**
     *同步动态令牌 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_SyncOTP="E";

    /**
     *删除未知单 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final char THOST_FTDC_FC_DeleteOrder='F';

    /**
     *删除未知单 {@value}
     *@see #SizeOf_TThostFtdcFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_FC_DeleteOrder="F";

    /**
     *TFtdcFunctionCodeType是一个功能代码类型
     *@see #THOST_FTDC_FC_DataAsync
     *@see #THOST_FTDC_FC_ForceUserLogout
     *@see #THOST_FTDC_FC_UserPasswordUpdate
     *@see #THOST_FTDC_FC_BrokerPasswordUpdate
     *@see #THOST_FTDC_FC_InvestorPasswordUpdate
     *@see #THOST_FTDC_FC_OrderInsert
     *@see #THOST_FTDC_FC_OrderAction
     *@see #THOST_FTDC_FC_SyncSystemData
     *@see #THOST_FTDC_FC_SyncBrokerData
     *@see #THOST_FTDC_FC_BachSyncBrokerData
     *@see #THOST_FTDC_FC_SuperQuery
     *@see #THOST_FTDC_FC_ParkedOrderInsert
     *@see #THOST_FTDC_FC_ParkedOrderAction
     *@see #THOST_FTDC_FC_SyncOTP
     *@see #THOST_FTDC_FC_DeleteOrder
     */
    public static final int SizeOf_TThostFtdcFunctionCodeType=1;

    /**
     *强制用户登出 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_ForceUserLogout='1';

    /**
     *强制用户登出 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_ForceUserLogout="1";

    /**
     *变更用户口令 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_UserPasswordUpdate='2';

    /**
     *变更用户口令 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_UserPasswordUpdate="2";

    /**
     *同步经纪公司数据 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_SyncBrokerData='3';

    /**
     *同步经纪公司数据 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_SyncBrokerData="3";

    /**
     *批量同步经纪公司数据 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_BachSyncBrokerData='4';

    /**
     *批量同步经纪公司数据 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_BachSyncBrokerData="4";

    /**
     *报单插入 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_OrderInsert='5';

    /**
     *报单插入 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_OrderInsert="5";

    /**
     *报单操作 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_OrderAction='6';

    /**
     *报单操作 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_OrderAction="6";

    /**
     *全部查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_AllQuery='7';

    /**
     *全部查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_AllQuery="7";

    /**
     *系统功能：登入/登出/修改密码等 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_log='a';

    /**
     *系统功能：登入/登出/修改密码等 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_log="a";

    /**
     *基本查询：查询基础数据，如合约，交易所等常量 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_BaseQry='b';

    /**
     *基本查询：查询基础数据，如合约，交易所等常量 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_BaseQry="b";

    /**
     *交易查询：如查成交，委托 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_TradeQry='c';

    /**
     *交易查询：如查成交，委托 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_TradeQry="c";

    /**
     *交易功能：报单，撤单 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_Trade='d';

    /**
     *交易功能：报单，撤单 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_Trade="d";

    /**
     *银期转账 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_Virement='e';

    /**
     *银期转账 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_Virement="e";

    /**
     *风险监控 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_Risk='f';

    /**
     *风险监控 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_Risk="f";

    /**
     *查询/管理：查询会话，踢人等 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_Session='g';

    /**
     *查询/管理：查询会话，踢人等 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_Session="g";

    /**
     *风控通知控制 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_RiskNoticeCtl='h';

    /**
     *风控通知控制 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_RiskNoticeCtl="h";

    /**
     *风控通知发送 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_RiskNotice='i';

    /**
     *风控通知发送 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_RiskNotice="i";

    /**
     *察看经纪公司资金权限 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_BrokerDeposit='j';

    /**
     *察看经纪公司资金权限 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_BrokerDeposit="j";

    /**
     *资金查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_QueryFund='k';

    /**
     *资金查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_QueryFund="k";

    /**
     *报单查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_QueryOrder='l';

    /**
     *报单查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_QueryOrder="l";

    /**
     *成交查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_QueryTrade='m';

    /**
     *成交查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_QueryTrade="m";

    /**
     *持仓查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_QueryPosition='n';

    /**
     *持仓查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_QueryPosition="n";

    /**
     *行情查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_QueryMarketData='o';

    /**
     *行情查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_QueryMarketData="o";

    /**
     *用户事件查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_QueryUserEvent='p';

    /**
     *用户事件查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_QueryUserEvent="p";

    /**
     *风险通知查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_QueryRiskNotify='q';

    /**
     *风险通知查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_QueryRiskNotify="q";

    /**
     *出入金查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_QueryFundChange='r';

    /**
     *出入金查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_QueryFundChange="r";

    /**
     *投资者信息查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_QueryInvestor='s';

    /**
     *投资者信息查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_QueryInvestor="s";

    /**
     *交易编码查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_QueryTradingCode='t';

    /**
     *交易编码查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_QueryTradingCode="t";

    /**
     *强平 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_ForceClose='u';

    /**
     *强平 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_ForceClose="u";

    /**
     *压力测试 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_PressTest='v';

    /**
     *压力测试 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_PressTest="v";

    /**
     *权益反算 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_RemainCalc='w';

    /**
     *权益反算 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_RemainCalc="w";

    /**
     *净持仓保证金指标 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_NetPositionInd='x';

    /**
     *净持仓保证金指标 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_NetPositionInd="x";

    /**
     *风险预算 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_RiskPredict='y';

    /**
     *风险预算 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_RiskPredict="y";

    /**
     *数据导出 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_DataExport='z';

    /**
     *数据导出 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_DataExport="z";

    /**
     *风控指标设置 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_RiskTargetSetup='A';

    /**
     *风控指标设置 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_RiskTargetSetup="A";

    /**
     *行情预警 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_MarketDataWarn='B';

    /**
     *行情预警 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_MarketDataWarn="B";

    /**
     *业务通知查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_QryBizNotice='C';

    /**
     *业务通知查询 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_QryBizNotice="C";

    /**
     *业务通知模板设置 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_CfgBizNotice='D';

    /**
     *业务通知模板设置 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_CfgBizNotice="D";

    /**
     *同步动态令牌 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_SyncOTP='E';

    /**
     *同步动态令牌 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_SyncOTP="E";

    /**
     *发送业务通知 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_SendBizNotice='F';

    /**
     *发送业务通知 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_SendBizNotice="F";

    /**
     *风险级别标准设置 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_CfgRiskLevelStd='G';

    /**
     *风险级别标准设置 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_CfgRiskLevelStd="G";

    /**
     *交易终端应急功能 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_TbCommand='H';

    /**
     *交易终端应急功能 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_TbCommand="H";

    /**
     *删除未知单 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_DeleteOrder='J';

    /**
     *删除未知单 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_DeleteOrder="J";

    /**
     *预埋报单插入 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_ParkedOrderInsert='K';

    /**
     *预埋报单插入 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_ParkedOrderInsert="K";

    /**
     *预埋报单操作 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final char THOST_FTDC_BFC_ParkedOrderAction='L';

    /**
     *预埋报单操作 {@value}
     *@see #SizeOf_TThostFtdcBrokerFunctionCodeType
     */
    public static final String STRING_THOST_FTDC_BFC_ParkedOrderAction="L";

    /**
     *TFtdcBrokerFunctionCodeType是一个经纪公司功能代码类型
     *@see #THOST_FTDC_BFC_ForceUserLogout
     *@see #THOST_FTDC_BFC_UserPasswordUpdate
     *@see #THOST_FTDC_BFC_SyncBrokerData
     *@see #THOST_FTDC_BFC_BachSyncBrokerData
     *@see #THOST_FTDC_BFC_OrderInsert
     *@see #THOST_FTDC_BFC_OrderAction
     *@see #THOST_FTDC_BFC_AllQuery
     *@see #THOST_FTDC_BFC_log
     *@see #THOST_FTDC_BFC_BaseQry
     *@see #THOST_FTDC_BFC_TradeQry
     *@see #THOST_FTDC_BFC_Trade
     *@see #THOST_FTDC_BFC_Virement
     *@see #THOST_FTDC_BFC_Risk
     *@see #THOST_FTDC_BFC_Session
     *@see #THOST_FTDC_BFC_RiskNoticeCtl
     *@see #THOST_FTDC_BFC_RiskNotice
     *@see #THOST_FTDC_BFC_BrokerDeposit
     *@see #THOST_FTDC_BFC_QueryFund
     *@see #THOST_FTDC_BFC_QueryOrder
     *@see #THOST_FTDC_BFC_QueryTrade
     *@see #THOST_FTDC_BFC_QueryPosition
     *@see #THOST_FTDC_BFC_QueryMarketData
     *@see #THOST_FTDC_BFC_QueryUserEvent
     *@see #THOST_FTDC_BFC_QueryRiskNotify
     *@see #THOST_FTDC_BFC_QueryFundChange
     *@see #THOST_FTDC_BFC_QueryInvestor
     *@see #THOST_FTDC_BFC_QueryTradingCode
     *@see #THOST_FTDC_BFC_ForceClose
     *@see #THOST_FTDC_BFC_PressTest
     *@see #THOST_FTDC_BFC_RemainCalc
     *@see #THOST_FTDC_BFC_NetPositionInd
     *@see #THOST_FTDC_BFC_RiskPredict
     *@see #THOST_FTDC_BFC_DataExport
     *@see #THOST_FTDC_BFC_RiskTargetSetup
     *@see #THOST_FTDC_BFC_MarketDataWarn
     *@see #THOST_FTDC_BFC_QryBizNotice
     *@see #THOST_FTDC_BFC_CfgBizNotice
     *@see #THOST_FTDC_BFC_SyncOTP
     *@see #THOST_FTDC_BFC_SendBizNotice
     *@see #THOST_FTDC_BFC_CfgRiskLevelStd
     *@see #THOST_FTDC_BFC_TbCommand
     *@see #THOST_FTDC_BFC_DeleteOrder
     *@see #THOST_FTDC_BFC_ParkedOrderInsert
     *@see #THOST_FTDC_BFC_ParkedOrderAction
     */
    public static final int SizeOf_TThostFtdcBrokerFunctionCodeType=1;

    /**
     *已经提交 {@value}
     *@see #SizeOf_TThostFtdcOrderActionStatusType
     */
    public static final char THOST_FTDC_OAS_Submitted='a';

    /**
     *已经提交 {@value}
     *@see #SizeOf_TThostFtdcOrderActionStatusType
     */
    public static final String STRING_THOST_FTDC_OAS_Submitted="a";

    /**
     *已经接受 {@value}
     *@see #SizeOf_TThostFtdcOrderActionStatusType
     */
    public static final char THOST_FTDC_OAS_Accepted='b';

    /**
     *已经接受 {@value}
     *@see #SizeOf_TThostFtdcOrderActionStatusType
     */
    public static final String STRING_THOST_FTDC_OAS_Accepted="b";

    /**
     *已经被拒绝 {@value}
     *@see #SizeOf_TThostFtdcOrderActionStatusType
     */
    public static final char THOST_FTDC_OAS_Rejected='c';

    /**
     *已经被拒绝 {@value}
     *@see #SizeOf_TThostFtdcOrderActionStatusType
     */
    public static final String STRING_THOST_FTDC_OAS_Rejected="c";

    /**
     *TFtdcOrderActionStatusType是一个报单操作状态类型
     *@see #THOST_FTDC_OAS_Submitted
     *@see #THOST_FTDC_OAS_Accepted
     *@see #THOST_FTDC_OAS_Rejected
     */
    public static final int SizeOf_TThostFtdcOrderActionStatusType=1;

    /**
     *全部成交 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final char THOST_FTDC_OST_AllTraded='0';

    /**
     *全部成交 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final String STRING_THOST_FTDC_OST_AllTraded="0";

    /**
     *部分成交还在队列中 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final char THOST_FTDC_OST_PartTradedQueueing='1';

    /**
     *部分成交还在队列中 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final String STRING_THOST_FTDC_OST_PartTradedQueueing="1";

    /**
     *部分成交不在队列中 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final char THOST_FTDC_OST_PartTradedNotQueueing='2';

    /**
     *部分成交不在队列中 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final String STRING_THOST_FTDC_OST_PartTradedNotQueueing="2";

    /**
     *未成交还在队列中 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final char THOST_FTDC_OST_NoTradeQueueing='3';

    /**
     *未成交还在队列中 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final String STRING_THOST_FTDC_OST_NoTradeQueueing="3";

    /**
     *未成交不在队列中 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final char THOST_FTDC_OST_NoTradeNotQueueing='4';

    /**
     *未成交不在队列中 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final String STRING_THOST_FTDC_OST_NoTradeNotQueueing="4";

    /**
     *撤单 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final char THOST_FTDC_OST_Canceled='5';

    /**
     *撤单 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final String STRING_THOST_FTDC_OST_Canceled="5";

    /**
     *未知 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final char THOST_FTDC_OST_Unknown='a';

    /**
     *未知 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final String STRING_THOST_FTDC_OST_Unknown="a";

    /**
     *尚未触发 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final char THOST_FTDC_OST_NotTouched='b';

    /**
     *尚未触发 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final String STRING_THOST_FTDC_OST_NotTouched="b";

    /**
     *已触发 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final char THOST_FTDC_OST_Touched='c';

    /**
     *已触发 {@value}
     *@see #SizeOf_TThostFtdcOrderStatusType
     */
    public static final String STRING_THOST_FTDC_OST_Touched="c";

    /**
     *TFtdcOrderStatusType是一个报单状态类型
     *@see #THOST_FTDC_OST_AllTraded
     *@see #THOST_FTDC_OST_PartTradedQueueing
     *@see #THOST_FTDC_OST_PartTradedNotQueueing
     *@see #THOST_FTDC_OST_NoTradeQueueing
     *@see #THOST_FTDC_OST_NoTradeNotQueueing
     *@see #THOST_FTDC_OST_Canceled
     *@see #THOST_FTDC_OST_Unknown
     *@see #THOST_FTDC_OST_NotTouched
     *@see #THOST_FTDC_OST_Touched
     */
    public static final int SizeOf_TThostFtdcOrderStatusType=1;

    /**
     *已经提交 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final char THOST_FTDC_OSS_InsertSubmitted='0';

    /**
     *已经提交 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final String STRING_THOST_FTDC_OSS_InsertSubmitted="0";

    /**
     *撤单已经提交 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final char THOST_FTDC_OSS_CancelSubmitted='1';

    /**
     *撤单已经提交 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final String STRING_THOST_FTDC_OSS_CancelSubmitted="1";

    /**
     *修改已经提交 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final char THOST_FTDC_OSS_ModifySubmitted='2';

    /**
     *修改已经提交 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final String STRING_THOST_FTDC_OSS_ModifySubmitted="2";

    /**
     *已经接受 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final char THOST_FTDC_OSS_Accepted='3';

    /**
     *已经接受 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final String STRING_THOST_FTDC_OSS_Accepted="3";

    /**
     *报单已经被拒绝 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final char THOST_FTDC_OSS_InsertRejected='4';

    /**
     *报单已经被拒绝 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final String STRING_THOST_FTDC_OSS_InsertRejected="4";

    /**
     *撤单已经被拒绝 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final char THOST_FTDC_OSS_CancelRejected='5';

    /**
     *撤单已经被拒绝 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final String STRING_THOST_FTDC_OSS_CancelRejected="5";

    /**
     *改单已经被拒绝 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final char THOST_FTDC_OSS_ModifyRejected='6';

    /**
     *改单已经被拒绝 {@value}
     *@see #SizeOf_TThostFtdcOrderSubmitStatusType
     */
    public static final String STRING_THOST_FTDC_OSS_ModifyRejected="6";

    /**
     *TFtdcOrderSubmitStatusType是一个报单提交状态类型
     *@see #THOST_FTDC_OSS_InsertSubmitted
     *@see #THOST_FTDC_OSS_CancelSubmitted
     *@see #THOST_FTDC_OSS_ModifySubmitted
     *@see #THOST_FTDC_OSS_Accepted
     *@see #THOST_FTDC_OSS_InsertRejected
     *@see #THOST_FTDC_OSS_CancelRejected
     *@see #THOST_FTDC_OSS_ModifyRejected
     */
    public static final int SizeOf_TThostFtdcOrderSubmitStatusType=1;

    /**
     *今日持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionDateType
     */
    public static final char THOST_FTDC_PSD_Today='1';

    /**
     *今日持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionDateType
     */
    public static final String STRING_THOST_FTDC_PSD_Today="1";

    /**
     *历史持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionDateType
     */
    public static final char THOST_FTDC_PSD_History='2';

    /**
     *历史持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionDateType
     */
    public static final String STRING_THOST_FTDC_PSD_History="2";

    /**
     *TFtdcPositionDateType是一个持仓日期类型
     *@see #THOST_FTDC_PSD_Today
     *@see #THOST_FTDC_PSD_History
     */
    public static final int SizeOf_TThostFtdcPositionDateType=1;

    /**
     *使用历史持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionDateTypeType
     */
    public static final char THOST_FTDC_PDT_UseHistory='1';

    /**
     *使用历史持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionDateTypeType
     */
    public static final String STRING_THOST_FTDC_PDT_UseHistory="1";

    /**
     *不使用历史持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionDateTypeType
     */
    public static final char THOST_FTDC_PDT_NoUseHistory='2';

    /**
     *不使用历史持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionDateTypeType
     */
    public static final String STRING_THOST_FTDC_PDT_NoUseHistory="2";

    /**
     *TFtdcPositionDateTypeType是一个持仓日期类型类型
     *@see #THOST_FTDC_PDT_UseHistory
     *@see #THOST_FTDC_PDT_NoUseHistory
     */
    public static final int SizeOf_TThostFtdcPositionDateTypeType=1;

    /**
     *代理 {@value}
     *@see #SizeOf_TThostFtdcTradingRoleType
     */
    public static final char THOST_FTDC_ER_Broker='1';

    /**
     *代理 {@value}
     *@see #SizeOf_TThostFtdcTradingRoleType
     */
    public static final String STRING_THOST_FTDC_ER_Broker="1";

    /**
     *自营 {@value}
     *@see #SizeOf_TThostFtdcTradingRoleType
     */
    public static final char THOST_FTDC_ER_Host='2';

    /**
     *自营 {@value}
     *@see #SizeOf_TThostFtdcTradingRoleType
     */
    public static final String STRING_THOST_FTDC_ER_Host="2";

    /**
     *做市商 {@value}
     *@see #SizeOf_TThostFtdcTradingRoleType
     */
    public static final char THOST_FTDC_ER_Maker='3';

    /**
     *做市商 {@value}
     *@see #SizeOf_TThostFtdcTradingRoleType
     */
    public static final String STRING_THOST_FTDC_ER_Maker="3";

    /**
     *TFtdcTradingRoleType是一个交易角色类型
     *@see #THOST_FTDC_ER_Broker
     *@see #THOST_FTDC_ER_Host
     *@see #THOST_FTDC_ER_Maker
     */
    public static final int SizeOf_TThostFtdcTradingRoleType=1;

    /**
     *期货 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final char THOST_FTDC_PC_Futures='1';

    /**
     *期货 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final String STRING_THOST_FTDC_PC_Futures="1";

    /**
     *期货期权 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final char THOST_FTDC_PC_Options='2';

    /**
     *期货期权 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final String STRING_THOST_FTDC_PC_Options="2";

    /**
     *组合 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final char THOST_FTDC_PC_Combination='3';

    /**
     *组合 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final String STRING_THOST_FTDC_PC_Combination="3";

    /**
     *即期 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final char THOST_FTDC_PC_Spot='4';

    /**
     *即期 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final String STRING_THOST_FTDC_PC_Spot="4";

    /**
     *期转现 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final char THOST_FTDC_PC_EFP='5';

    /**
     *期转现 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final String STRING_THOST_FTDC_PC_EFP="5";

    /**
     *现货期权 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final char THOST_FTDC_PC_SpotOption='6';

    /**
     *现货期权 {@value}
     *@see #SizeOf_TThostFtdcProductClassType
     */
    public static final String STRING_THOST_FTDC_PC_SpotOption="6";

    /**
     *TFtdcProductClassType是一个产品类型类型
     *@see #THOST_FTDC_PC_Futures
     *@see #THOST_FTDC_PC_Options
     *@see #THOST_FTDC_PC_Combination
     *@see #THOST_FTDC_PC_Spot
     *@see #THOST_FTDC_PC_EFP
     *@see #THOST_FTDC_PC_SpotOption
     */
    public static final int SizeOf_TThostFtdcProductClassType=1;

    /**
     *未上市 {@value}
     *@see #SizeOf_TThostFtdcInstLifePhaseType
     */
    public static final char THOST_FTDC_IP_NotStart='0';

    /**
     *未上市 {@value}
     *@see #SizeOf_TThostFtdcInstLifePhaseType
     */
    public static final String STRING_THOST_FTDC_IP_NotStart="0";

    /**
     *上市 {@value}
     *@see #SizeOf_TThostFtdcInstLifePhaseType
     */
    public static final char THOST_FTDC_IP_Started='1';

    /**
     *上市 {@value}
     *@see #SizeOf_TThostFtdcInstLifePhaseType
     */
    public static final String STRING_THOST_FTDC_IP_Started="1";

    /**
     *停牌 {@value}
     *@see #SizeOf_TThostFtdcInstLifePhaseType
     */
    public static final char THOST_FTDC_IP_Pause='2';

    /**
     *停牌 {@value}
     *@see #SizeOf_TThostFtdcInstLifePhaseType
     */
    public static final String STRING_THOST_FTDC_IP_Pause="2";

    /**
     *到期 {@value}
     *@see #SizeOf_TThostFtdcInstLifePhaseType
     */
    public static final char THOST_FTDC_IP_Expired='3';

    /**
     *到期 {@value}
     *@see #SizeOf_TThostFtdcInstLifePhaseType
     */
    public static final String STRING_THOST_FTDC_IP_Expired="3";

    /**
     *TFtdcInstLifePhaseType是一个合约生命周期状态类型
     *@see #THOST_FTDC_IP_NotStart
     *@see #THOST_FTDC_IP_Started
     *@see #THOST_FTDC_IP_Pause
     *@see #THOST_FTDC_IP_Expired
     */
    public static final int SizeOf_TThostFtdcInstLifePhaseType=1;

    /**
     *买 {@value}
     *@see #SizeOf_TThostFtdcDirectionType
     */
    public static final char THOST_FTDC_D_Buy='0';

    /**
     *买 {@value}
     *@see #SizeOf_TThostFtdcDirectionType
     */
    public static final String STRING_THOST_FTDC_D_Buy="0";

    /**
     *卖 {@value}
     *@see #SizeOf_TThostFtdcDirectionType
     */
    public static final char THOST_FTDC_D_Sell='1';

    /**
     *卖 {@value}
     *@see #SizeOf_TThostFtdcDirectionType
     */
    public static final String STRING_THOST_FTDC_D_Sell="1";

    /**
     *TFtdcDirectionType是一个买卖方向类型
     *@see #THOST_FTDC_D_Buy
     *@see #THOST_FTDC_D_Sell
     */
    public static final int SizeOf_TThostFtdcDirectionType=1;

    /**
     *净持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionTypeType
     */
    public static final char THOST_FTDC_PT_Net='1';

    /**
     *净持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionTypeType
     */
    public static final String STRING_THOST_FTDC_PT_Net="1";

    /**
     *综合持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionTypeType
     */
    public static final char THOST_FTDC_PT_Gross='2';

    /**
     *综合持仓 {@value}
     *@see #SizeOf_TThostFtdcPositionTypeType
     */
    public static final String STRING_THOST_FTDC_PT_Gross="2";

    /**
     *TFtdcPositionTypeType是一个持仓类型类型
     *@see #THOST_FTDC_PT_Net
     *@see #THOST_FTDC_PT_Gross
     */
    public static final int SizeOf_TThostFtdcPositionTypeType=1;

    /**
     *净 {@value}
     *@see #SizeOf_TThostFtdcPosiDirectionType
     */
    public static final char THOST_FTDC_PD_Net='1';

    /**
     *净 {@value}
     *@see #SizeOf_TThostFtdcPosiDirectionType
     */
    public static final String STRING_THOST_FTDC_PD_Net="1";

    /**
     *多头 {@value}
     *@see #SizeOf_TThostFtdcPosiDirectionType
     */
    public static final char THOST_FTDC_PD_Long='2';

    /**
     *多头 {@value}
     *@see #SizeOf_TThostFtdcPosiDirectionType
     */
    public static final String STRING_THOST_FTDC_PD_Long="2";

    /**
     *空头 {@value}
     *@see #SizeOf_TThostFtdcPosiDirectionType
     */
    public static final char THOST_FTDC_PD_Short='3';

    /**
     *空头 {@value}
     *@see #SizeOf_TThostFtdcPosiDirectionType
     */
    public static final String STRING_THOST_FTDC_PD_Short="3";

    /**
     *TFtdcPosiDirectionType是一个持仓多空方向类型
     *@see #THOST_FTDC_PD_Net
     *@see #THOST_FTDC_PD_Long
     *@see #THOST_FTDC_PD_Short
     */
    public static final int SizeOf_TThostFtdcPosiDirectionType=1;

    /**
     *不活跃 {@value}
     *@see #SizeOf_TThostFtdcSysSettlementStatusType
     */
    public static final char THOST_FTDC_SS_NonActive='1';

    /**
     *不活跃 {@value}
     *@see #SizeOf_TThostFtdcSysSettlementStatusType
     */
    public static final String STRING_THOST_FTDC_SS_NonActive="1";

    /**
     *启动 {@value}
     *@see #SizeOf_TThostFtdcSysSettlementStatusType
     */
    public static final char THOST_FTDC_SS_Startup='2';

    /**
     *启动 {@value}
     *@see #SizeOf_TThostFtdcSysSettlementStatusType
     */
    public static final String STRING_THOST_FTDC_SS_Startup="2";

    /**
     *操作 {@value}
     *@see #SizeOf_TThostFtdcSysSettlementStatusType
     */
    public static final char THOST_FTDC_SS_Operating='3';

    /**
     *操作 {@value}
     *@see #SizeOf_TThostFtdcSysSettlementStatusType
     */
    public static final String STRING_THOST_FTDC_SS_Operating="3";

    /**
     *结算 {@value}
     *@see #SizeOf_TThostFtdcSysSettlementStatusType
     */
    public static final char THOST_FTDC_SS_Settlement='4';

    /**
     *结算 {@value}
     *@see #SizeOf_TThostFtdcSysSettlementStatusType
     */
    public static final String STRING_THOST_FTDC_SS_Settlement="4";

    /**
     *结算完成 {@value}
     *@see #SizeOf_TThostFtdcSysSettlementStatusType
     */
    public static final char THOST_FTDC_SS_SettlementFinished='5';

    /**
     *结算完成 {@value}
     *@see #SizeOf_TThostFtdcSysSettlementStatusType
     */
    public static final String STRING_THOST_FTDC_SS_SettlementFinished="5";

    /**
     *TFtdcSysSettlementStatusType是一个系统结算状态类型
     *@see #THOST_FTDC_SS_NonActive
     *@see #THOST_FTDC_SS_Startup
     *@see #THOST_FTDC_SS_Operating
     *@see #THOST_FTDC_SS_Settlement
     *@see #THOST_FTDC_SS_SettlementFinished
     */
    public static final int SizeOf_TThostFtdcSysSettlementStatusType=1;

    /**
     *交易费率 {@value}
     *@see #SizeOf_TThostFtdcRatioAttrType
     */
    public static final char THOST_FTDC_RA_Trade='0';

    /**
     *交易费率 {@value}
     *@see #SizeOf_TThostFtdcRatioAttrType
     */
    public static final String STRING_THOST_FTDC_RA_Trade="0";

    /**
     *结算费率 {@value}
     *@see #SizeOf_TThostFtdcRatioAttrType
     */
    public static final char THOST_FTDC_RA_Settlement='1';

    /**
     *结算费率 {@value}
     *@see #SizeOf_TThostFtdcRatioAttrType
     */
    public static final String STRING_THOST_FTDC_RA_Settlement="1";

    /**
     *TFtdcRatioAttrType是一个费率属性类型
     *@see #THOST_FTDC_RA_Trade
     *@see #THOST_FTDC_RA_Settlement
     */
    public static final int SizeOf_TThostFtdcRatioAttrType=1;

    /**
     *投机 {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagType
     */
    public static final char THOST_FTDC_HF_Speculation='1';

    /**
     *投机 {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagType
     */
    public static final String STRING_THOST_FTDC_HF_Speculation="1";

    /**
     *套利 {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagType
     */
    public static final char THOST_FTDC_HF_Arbitrage='2';

    /**
     *套利 {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagType
     */
    public static final String STRING_THOST_FTDC_HF_Arbitrage="2";

    /**
     *套保 {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagType
     */
    public static final char THOST_FTDC_HF_Hedge='3';

    /**
     *套保 {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagType
     */
    public static final String STRING_THOST_FTDC_HF_Hedge="3";

    /**
     *TFtdcHedgeFlagType是一个投机套保标志类型
     *@see #THOST_FTDC_HF_Speculation
     *@see #THOST_FTDC_HF_Arbitrage
     *@see #THOST_FTDC_HF_Hedge
     */
    public static final int SizeOf_TThostFtdcHedgeFlagType=1;

    /**
     *投机 {@value}
     *@see #SizeOf_TThostFtdcBillHedgeFlagType
     */
    public static final char THOST_FTDC_BHF_Speculation='1';

    /**
     *投机 {@value}
     *@see #SizeOf_TThostFtdcBillHedgeFlagType
     */
    public static final String STRING_THOST_FTDC_BHF_Speculation="1";

    /**
     *套利 {@value}
     *@see #SizeOf_TThostFtdcBillHedgeFlagType
     */
    public static final char THOST_FTDC_BHF_Arbitrage='2';

    /**
     *套利 {@value}
     *@see #SizeOf_TThostFtdcBillHedgeFlagType
     */
    public static final String STRING_THOST_FTDC_BHF_Arbitrage="2";

    /**
     *套保 {@value}
     *@see #SizeOf_TThostFtdcBillHedgeFlagType
     */
    public static final char THOST_FTDC_BHF_Hedge='3';

    /**
     *套保 {@value}
     *@see #SizeOf_TThostFtdcBillHedgeFlagType
     */
    public static final String STRING_THOST_FTDC_BHF_Hedge="3";

    /**
     *TFtdcBillHedgeFlagType是一个投机套保标志类型
     *@see #THOST_FTDC_BHF_Speculation
     *@see #THOST_FTDC_BHF_Arbitrage
     *@see #THOST_FTDC_BHF_Hedge
     */
    public static final int SizeOf_TThostFtdcBillHedgeFlagType=1;

    /**
     *投机 {@value}
     *@see #SizeOf_TThostFtdcClientIDTypeType
     */
    public static final char THOST_FTDC_CIDT_Speculation='1';

    /**
     *投机 {@value}
     *@see #SizeOf_TThostFtdcClientIDTypeType
     */
    public static final String STRING_THOST_FTDC_CIDT_Speculation="1";

    /**
     *套利 {@value}
     *@see #SizeOf_TThostFtdcClientIDTypeType
     */
    public static final char THOST_FTDC_CIDT_Arbitrage='2';

    /**
     *套利 {@value}
     *@see #SizeOf_TThostFtdcClientIDTypeType
     */
    public static final String STRING_THOST_FTDC_CIDT_Arbitrage="2";

    /**
     *套保 {@value}
     *@see #SizeOf_TThostFtdcClientIDTypeType
     */
    public static final char THOST_FTDC_CIDT_Hedge='3';

    /**
     *套保 {@value}
     *@see #SizeOf_TThostFtdcClientIDTypeType
     */
    public static final String STRING_THOST_FTDC_CIDT_Hedge="3";

    /**
     *TFtdcClientIDTypeType是一个交易编码类型类型
     *@see #THOST_FTDC_CIDT_Speculation
     *@see #THOST_FTDC_CIDT_Arbitrage
     *@see #THOST_FTDC_CIDT_Hedge
     */
    public static final int SizeOf_TThostFtdcClientIDTypeType=1;

    /**
     *任意价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_AnyPrice='1';

    /**
     *任意价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_AnyPrice="1";

    /**
     *限价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_LimitPrice='2';

    /**
     *限价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_LimitPrice="2";

    /**
     *最优价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_BestPrice='3';

    /**
     *最优价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_BestPrice="3";

    /**
     *最新价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_LastPrice='4';

    /**
     *最新价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_LastPrice="4";

    /**
     *最新价浮动上浮1个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_LastPricePlusOneTicks='5';

    /**
     *最新价浮动上浮1个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_LastPricePlusOneTicks="5";

    /**
     *最新价浮动上浮2个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_LastPricePlusTwoTicks='6';

    /**
     *最新价浮动上浮2个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_LastPricePlusTwoTicks="6";

    /**
     *最新价浮动上浮3个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_LastPricePlusThreeTicks='7';

    /**
     *最新价浮动上浮3个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_LastPricePlusThreeTicks="7";

    /**
     *卖一价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_AskPrice1='8';

    /**
     *卖一价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_AskPrice1="8";

    /**
     *卖一价浮动上浮1个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_AskPrice1PlusOneTicks='9';

    /**
     *卖一价浮动上浮1个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_AskPrice1PlusOneTicks="9";

    /**
     *卖一价浮动上浮2个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_AskPrice1PlusTwoTicks='A';

    /**
     *卖一价浮动上浮2个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_AskPrice1PlusTwoTicks="A";

    /**
     *卖一价浮动上浮3个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_AskPrice1PlusThreeTicks='B';

    /**
     *卖一价浮动上浮3个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_AskPrice1PlusThreeTicks="B";

    /**
     *买一价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_BidPrice1='C';

    /**
     *买一价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_BidPrice1="C";

    /**
     *买一价浮动上浮1个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_BidPrice1PlusOneTicks='D';

    /**
     *买一价浮动上浮1个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_BidPrice1PlusOneTicks="D";

    /**
     *买一价浮动上浮2个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_BidPrice1PlusTwoTicks='E';

    /**
     *买一价浮动上浮2个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_BidPrice1PlusTwoTicks="E";

    /**
     *买一价浮动上浮3个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_BidPrice1PlusThreeTicks='F';

    /**
     *买一价浮动上浮3个ticks {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_BidPrice1PlusThreeTicks="F";

    /**
     *五档价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final char THOST_FTDC_OPT_FiveLevelPrice='G';

    /**
     *五档价 {@value}
     *@see #SizeOf_TThostFtdcOrderPriceTypeType
     */
    public static final String STRING_THOST_FTDC_OPT_FiveLevelPrice="G";

    /**
     *TFtdcOrderPriceTypeType是一个报单价格条件类型
     *@see #THOST_FTDC_OPT_AnyPrice
     *@see #THOST_FTDC_OPT_LimitPrice
     *@see #THOST_FTDC_OPT_BestPrice
     *@see #THOST_FTDC_OPT_LastPrice
     *@see #THOST_FTDC_OPT_LastPricePlusOneTicks
     *@see #THOST_FTDC_OPT_LastPricePlusTwoTicks
     *@see #THOST_FTDC_OPT_LastPricePlusThreeTicks
     *@see #THOST_FTDC_OPT_AskPrice1
     *@see #THOST_FTDC_OPT_AskPrice1PlusOneTicks
     *@see #THOST_FTDC_OPT_AskPrice1PlusTwoTicks
     *@see #THOST_FTDC_OPT_AskPrice1PlusThreeTicks
     *@see #THOST_FTDC_OPT_BidPrice1
     *@see #THOST_FTDC_OPT_BidPrice1PlusOneTicks
     *@see #THOST_FTDC_OPT_BidPrice1PlusTwoTicks
     *@see #THOST_FTDC_OPT_BidPrice1PlusThreeTicks
     *@see #THOST_FTDC_OPT_FiveLevelPrice
     */
    public static final int SizeOf_TThostFtdcOrderPriceTypeType=1;

    /**
     *开仓 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final char THOST_FTDC_OF_Open='0';

    /**
     *开仓 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final String STRING_THOST_FTDC_OF_Open="0";

    /**
     *平仓 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final char THOST_FTDC_OF_Close='1';

    /**
     *平仓 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final String STRING_THOST_FTDC_OF_Close="1";

    /**
     *强平 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final char THOST_FTDC_OF_ForceClose='2';

    /**
     *强平 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final String STRING_THOST_FTDC_OF_ForceClose="2";

    /**
     *平今 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final char THOST_FTDC_OF_CloseToday='3';

    /**
     *平今 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final String STRING_THOST_FTDC_OF_CloseToday="3";

    /**
     *平昨 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final char THOST_FTDC_OF_CloseYesterday='4';

    /**
     *平昨 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final String STRING_THOST_FTDC_OF_CloseYesterday="4";

    /**
     *强减 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final char THOST_FTDC_OF_ForceOff='5';

    /**
     *强减 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final String STRING_THOST_FTDC_OF_ForceOff="5";

    /**
     *本地强平 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final char THOST_FTDC_OF_LocalForceClose='6';

    /**
     *本地强平 {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagType
     */
    public static final String STRING_THOST_FTDC_OF_LocalForceClose="6";

    /**
     *TFtdcOffsetFlagType是一个开平标志类型
     *@see #THOST_FTDC_OF_Open
     *@see #THOST_FTDC_OF_Close
     *@see #THOST_FTDC_OF_ForceClose
     *@see #THOST_FTDC_OF_CloseToday
     *@see #THOST_FTDC_OF_CloseYesterday
     *@see #THOST_FTDC_OF_ForceOff
     *@see #THOST_FTDC_OF_LocalForceClose
     */
    public static final int SizeOf_TThostFtdcOffsetFlagType=1;

    /**
     *非强平 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final char THOST_FTDC_FCC_NotForceClose='0';

    /**
     *非强平 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final String STRING_THOST_FTDC_FCC_NotForceClose="0";

    /**
     *资金不足 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final char THOST_FTDC_FCC_LackDeposit='1';

    /**
     *资金不足 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final String STRING_THOST_FTDC_FCC_LackDeposit="1";

    /**
     *客户超仓 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final char THOST_FTDC_FCC_ClientOverPositionLimit='2';

    /**
     *客户超仓 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final String STRING_THOST_FTDC_FCC_ClientOverPositionLimit="2";

    /**
     *会员超仓 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final char THOST_FTDC_FCC_MemberOverPositionLimit='3';

    /**
     *会员超仓 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final String STRING_THOST_FTDC_FCC_MemberOverPositionLimit="3";

    /**
     *持仓非整数倍 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final char THOST_FTDC_FCC_NotMultiple='4';

    /**
     *持仓非整数倍 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final String STRING_THOST_FTDC_FCC_NotMultiple="4";

    /**
     *违规 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final char THOST_FTDC_FCC_Violation='5';

    /**
     *违规 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final String STRING_THOST_FTDC_FCC_Violation="5";

    /**
     *其它 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final char THOST_FTDC_FCC_Other='6';

    /**
     *其它 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final String STRING_THOST_FTDC_FCC_Other="6";

    /**
     *自然人临近交割 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final char THOST_FTDC_FCC_PersonDeliv='7';

    /**
     *自然人临近交割 {@value}
     *@see #SizeOf_TThostFtdcForceCloseReasonType
     */
    public static final String STRING_THOST_FTDC_FCC_PersonDeliv="7";

    /**
     *TFtdcForceCloseReasonType是一个强平原因类型
     *@see #THOST_FTDC_FCC_NotForceClose
     *@see #THOST_FTDC_FCC_LackDeposit
     *@see #THOST_FTDC_FCC_ClientOverPositionLimit
     *@see #THOST_FTDC_FCC_MemberOverPositionLimit
     *@see #THOST_FTDC_FCC_NotMultiple
     *@see #THOST_FTDC_FCC_Violation
     *@see #THOST_FTDC_FCC_Other
     *@see #THOST_FTDC_FCC_PersonDeliv
     */
    public static final int SizeOf_TThostFtdcForceCloseReasonType=1;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final char THOST_FTDC_ORDT_Normal='0';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final String STRING_THOST_FTDC_ORDT_Normal="0";

    /**
     *报价衍生 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final char THOST_FTDC_ORDT_DeriveFromQuote='1';

    /**
     *报价衍生 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final String STRING_THOST_FTDC_ORDT_DeriveFromQuote="1";

    /**
     *组合衍生 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final char THOST_FTDC_ORDT_DeriveFromCombination='2';

    /**
     *组合衍生 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final String STRING_THOST_FTDC_ORDT_DeriveFromCombination="2";

    /**
     *组合报单 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final char THOST_FTDC_ORDT_Combination='3';

    /**
     *组合报单 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final String STRING_THOST_FTDC_ORDT_Combination="3";

    /**
     *条件单 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final char THOST_FTDC_ORDT_ConditionalOrder='4';

    /**
     *条件单 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final String STRING_THOST_FTDC_ORDT_ConditionalOrder="4";

    /**
     *互换单 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final char THOST_FTDC_ORDT_Swap='5';

    /**
     *互换单 {@value}
     *@see #SizeOf_TThostFtdcOrderTypeType
     */
    public static final String STRING_THOST_FTDC_ORDT_Swap="5";

    /**
     *TFtdcOrderTypeType是一个报单类型类型
     *@see #THOST_FTDC_ORDT_Normal
     *@see #THOST_FTDC_ORDT_DeriveFromQuote
     *@see #THOST_FTDC_ORDT_DeriveFromCombination
     *@see #THOST_FTDC_ORDT_Combination
     *@see #THOST_FTDC_ORDT_ConditionalOrder
     *@see #THOST_FTDC_ORDT_Swap
     */
    public static final int SizeOf_TThostFtdcOrderTypeType=1;

    /**
     *立即完成，否则撤销 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final char THOST_FTDC_TC_IOC='1';

    /**
     *立即完成，否则撤销 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final String STRING_THOST_FTDC_TC_IOC="1";

    /**
     *本节有效 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final char THOST_FTDC_TC_GFS='2';

    /**
     *本节有效 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final String STRING_THOST_FTDC_TC_GFS="2";

    /**
     *当日有效 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final char THOST_FTDC_TC_GFD='3';

    /**
     *当日有效 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final String STRING_THOST_FTDC_TC_GFD="3";

    /**
     *指定日期前有效 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final char THOST_FTDC_TC_GTD='4';

    /**
     *指定日期前有效 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final String STRING_THOST_FTDC_TC_GTD="4";

    /**
     *撤销前有效 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final char THOST_FTDC_TC_GTC='5';

    /**
     *撤销前有效 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final String STRING_THOST_FTDC_TC_GTC="5";

    /**
     *集合竞价有效 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final char THOST_FTDC_TC_GFA='6';

    /**
     *集合竞价有效 {@value}
     *@see #SizeOf_TThostFtdcTimeConditionType
     */
    public static final String STRING_THOST_FTDC_TC_GFA="6";

    /**
     *TFtdcTimeConditionType是一个有效期类型类型
     *@see #THOST_FTDC_TC_IOC
     *@see #THOST_FTDC_TC_GFS
     *@see #THOST_FTDC_TC_GFD
     *@see #THOST_FTDC_TC_GTD
     *@see #THOST_FTDC_TC_GTC
     *@see #THOST_FTDC_TC_GFA
     */
    public static final int SizeOf_TThostFtdcTimeConditionType=1;

    /**
     *任何数量 {@value}
     *@see #SizeOf_TThostFtdcVolumeConditionType
     */
    public static final char THOST_FTDC_VC_AV='1';

    /**
     *任何数量 {@value}
     *@see #SizeOf_TThostFtdcVolumeConditionType
     */
    public static final String STRING_THOST_FTDC_VC_AV="1";

    /**
     *最小数量 {@value}
     *@see #SizeOf_TThostFtdcVolumeConditionType
     */
    public static final char THOST_FTDC_VC_MV='2';

    /**
     *最小数量 {@value}
     *@see #SizeOf_TThostFtdcVolumeConditionType
     */
    public static final String STRING_THOST_FTDC_VC_MV="2";

    /**
     *全部数量 {@value}
     *@see #SizeOf_TThostFtdcVolumeConditionType
     */
    public static final char THOST_FTDC_VC_CV='3';

    /**
     *全部数量 {@value}
     *@see #SizeOf_TThostFtdcVolumeConditionType
     */
    public static final String STRING_THOST_FTDC_VC_CV="3";

    /**
     *TFtdcVolumeConditionType是一个成交量类型类型
     *@see #THOST_FTDC_VC_AV
     *@see #THOST_FTDC_VC_MV
     *@see #THOST_FTDC_VC_CV
     */
    public static final int SizeOf_TThostFtdcVolumeConditionType=1;

    /**
     *立即 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_Immediately='1';

    /**
     *立即 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_Immediately="1";

    /**
     *止损 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_Touch='2';

    /**
     *止损 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_Touch="2";

    /**
     *止赢 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_TouchProfit='3';

    /**
     *止赢 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_TouchProfit="3";

    /**
     *预埋单 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_ParkedOrder='4';

    /**
     *预埋单 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_ParkedOrder="4";

    /**
     *最新价大于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_LastPriceGreaterThanStopPrice='5';

    /**
     *最新价大于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_LastPriceGreaterThanStopPrice="5";

    /**
     *最新价大于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_LastPriceGreaterEqualStopPrice='6';

    /**
     *最新价大于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_LastPriceGreaterEqualStopPrice="6";

    /**
     *最新价小于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_LastPriceLesserThanStopPrice='7';

    /**
     *最新价小于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_LastPriceLesserThanStopPrice="7";

    /**
     *最新价小于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_LastPriceLesserEqualStopPrice='8';

    /**
     *最新价小于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_LastPriceLesserEqualStopPrice="8";

    /**
     *卖一价大于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_AskPriceGreaterThanStopPrice='9';

    /**
     *卖一价大于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_AskPriceGreaterThanStopPrice="9";

    /**
     *卖一价大于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_AskPriceGreaterEqualStopPrice='A';

    /**
     *卖一价大于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_AskPriceGreaterEqualStopPrice="A";

    /**
     *卖一价小于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_AskPriceLesserThanStopPrice='B';

    /**
     *卖一价小于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_AskPriceLesserThanStopPrice="B";

    /**
     *卖一价小于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_AskPriceLesserEqualStopPrice='C';

    /**
     *卖一价小于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_AskPriceLesserEqualStopPrice="C";

    /**
     *买一价大于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_BidPriceGreaterThanStopPrice='D';

    /**
     *买一价大于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_BidPriceGreaterThanStopPrice="D";

    /**
     *买一价大于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_BidPriceGreaterEqualStopPrice='E';

    /**
     *买一价大于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_BidPriceGreaterEqualStopPrice="E";

    /**
     *买一价小于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_BidPriceLesserThanStopPrice='F';

    /**
     *买一价小于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_BidPriceLesserThanStopPrice="F";

    /**
     *买一价小于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final char THOST_FTDC_CC_BidPriceLesserEqualStopPrice='H';

    /**
     *买一价小于等于条件价 {@value}
     *@see #SizeOf_TThostFtdcContingentConditionType
     */
    public static final String STRING_THOST_FTDC_CC_BidPriceLesserEqualStopPrice="H";

    /**
     *TFtdcContingentConditionType是一个触发条件类型
     *@see #THOST_FTDC_CC_Immediately
     *@see #THOST_FTDC_CC_Touch
     *@see #THOST_FTDC_CC_TouchProfit
     *@see #THOST_FTDC_CC_ParkedOrder
     *@see #THOST_FTDC_CC_LastPriceGreaterThanStopPrice
     *@see #THOST_FTDC_CC_LastPriceGreaterEqualStopPrice
     *@see #THOST_FTDC_CC_LastPriceLesserThanStopPrice
     *@see #THOST_FTDC_CC_LastPriceLesserEqualStopPrice
     *@see #THOST_FTDC_CC_AskPriceGreaterThanStopPrice
     *@see #THOST_FTDC_CC_AskPriceGreaterEqualStopPrice
     *@see #THOST_FTDC_CC_AskPriceLesserThanStopPrice
     *@see #THOST_FTDC_CC_AskPriceLesserEqualStopPrice
     *@see #THOST_FTDC_CC_BidPriceGreaterThanStopPrice
     *@see #THOST_FTDC_CC_BidPriceGreaterEqualStopPrice
     *@see #THOST_FTDC_CC_BidPriceLesserThanStopPrice
     *@see #THOST_FTDC_CC_BidPriceLesserEqualStopPrice
     */
    public static final int SizeOf_TThostFtdcContingentConditionType=1;

    /**
     *删除 {@value}
     *@see #SizeOf_TThostFtdcActionFlagType
     */
    public static final char THOST_FTDC_AF_Delete='0';

    /**
     *删除 {@value}
     *@see #SizeOf_TThostFtdcActionFlagType
     */
    public static final String STRING_THOST_FTDC_AF_Delete="0";

    /**
     *修改 {@value}
     *@see #SizeOf_TThostFtdcActionFlagType
     */
    public static final char THOST_FTDC_AF_Modify='3';

    /**
     *修改 {@value}
     *@see #SizeOf_TThostFtdcActionFlagType
     */
    public static final String STRING_THOST_FTDC_AF_Modify="3";

    /**
     *TFtdcActionFlagType是一个操作标志类型
     *@see #THOST_FTDC_AF_Delete
     *@see #THOST_FTDC_AF_Modify
     */
    public static final int SizeOf_TThostFtdcActionFlagType=1;

    /**
     *可以交易 {@value}
     *@see #SizeOf_TThostFtdcTradingRightType
     */
    public static final char THOST_FTDC_TR_Allow='0';

    /**
     *可以交易 {@value}
     *@see #SizeOf_TThostFtdcTradingRightType
     */
    public static final String STRING_THOST_FTDC_TR_Allow="0";

    /**
     *只能平仓 {@value}
     *@see #SizeOf_TThostFtdcTradingRightType
     */
    public static final char THOST_FTDC_TR_CloseOnly='1';

    /**
     *只能平仓 {@value}
     *@see #SizeOf_TThostFtdcTradingRightType
     */
    public static final String STRING_THOST_FTDC_TR_CloseOnly="1";

    /**
     *不能交易 {@value}
     *@see #SizeOf_TThostFtdcTradingRightType
     */
    public static final char THOST_FTDC_TR_Forbidden='2';

    /**
     *不能交易 {@value}
     *@see #SizeOf_TThostFtdcTradingRightType
     */
    public static final String STRING_THOST_FTDC_TR_Forbidden="2";

    /**
     *TFtdcTradingRightType是一个交易权限类型
     *@see #THOST_FTDC_TR_Allow
     *@see #THOST_FTDC_TR_CloseOnly
     *@see #THOST_FTDC_TR_Forbidden
     */
    public static final int SizeOf_TThostFtdcTradingRightType=1;

    /**
     *来自参与者 {@value}
     *@see #SizeOf_TThostFtdcOrderSourceType
     */
    public static final char THOST_FTDC_OSRC_Participant='0';

    /**
     *来自参与者 {@value}
     *@see #SizeOf_TThostFtdcOrderSourceType
     */
    public static final String STRING_THOST_FTDC_OSRC_Participant="0";

    /**
     *来自管理员 {@value}
     *@see #SizeOf_TThostFtdcOrderSourceType
     */
    public static final char THOST_FTDC_OSRC_Administrator='1';

    /**
     *来自管理员 {@value}
     *@see #SizeOf_TThostFtdcOrderSourceType
     */
    public static final String STRING_THOST_FTDC_OSRC_Administrator="1";

    /**
     *TFtdcOrderSourceType是一个报单来源类型
     *@see #THOST_FTDC_OSRC_Participant
     *@see #THOST_FTDC_OSRC_Administrator
     */
    public static final int SizeOf_TThostFtdcOrderSourceType=1;

    /**
     *组合持仓拆分为单一持仓,初始化不应包含该类型的持仓 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final char THOST_FTDC_TRDT_SplitCombination='#';

    /**
     *组合持仓拆分为单一持仓,初始化不应包含该类型的持仓 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final String STRING_THOST_FTDC_TRDT_SplitCombination="#";

    /**
     *普通成交 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final char THOST_FTDC_TRDT_Common='0';

    /**
     *普通成交 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final String STRING_THOST_FTDC_TRDT_Common="0";

    /**
     *期权执行 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final char THOST_FTDC_TRDT_OptionsExecution='1';

    /**
     *期权执行 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final String STRING_THOST_FTDC_TRDT_OptionsExecution="1";

    /**
     *OTC成交 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final char THOST_FTDC_TRDT_OTC='2';

    /**
     *OTC成交 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final String STRING_THOST_FTDC_TRDT_OTC="2";

    /**
     *期转现衍生成交 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final char THOST_FTDC_TRDT_EFPDerived='3';

    /**
     *期转现衍生成交 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final String STRING_THOST_FTDC_TRDT_EFPDerived="3";

    /**
     *组合衍生成交 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final char THOST_FTDC_TRDT_CombinationDerived='4';

    /**
     *组合衍生成交 {@value}
     *@see #SizeOf_TThostFtdcTradeTypeType
     */
    public static final String STRING_THOST_FTDC_TRDT_CombinationDerived="4";

    /**
     *TFtdcTradeTypeType是一个成交类型类型
     *@see #THOST_FTDC_TRDT_SplitCombination
     *@see #THOST_FTDC_TRDT_Common
     *@see #THOST_FTDC_TRDT_OptionsExecution
     *@see #THOST_FTDC_TRDT_OTC
     *@see #THOST_FTDC_TRDT_EFPDerived
     *@see #THOST_FTDC_TRDT_CombinationDerived
     */
    public static final int SizeOf_TThostFtdcTradeTypeType=1;

    /**
     *前成交价 {@value}
     *@see #SizeOf_TThostFtdcPriceSourceType
     */
    public static final char THOST_FTDC_PSRC_LastPrice='0';

    /**
     *前成交价 {@value}
     *@see #SizeOf_TThostFtdcPriceSourceType
     */
    public static final String STRING_THOST_FTDC_PSRC_LastPrice="0";

    /**
     *买委托价 {@value}
     *@see #SizeOf_TThostFtdcPriceSourceType
     */
    public static final char THOST_FTDC_PSRC_Buy='1';

    /**
     *买委托价 {@value}
     *@see #SizeOf_TThostFtdcPriceSourceType
     */
    public static final String STRING_THOST_FTDC_PSRC_Buy="1";

    /**
     *卖委托价 {@value}
     *@see #SizeOf_TThostFtdcPriceSourceType
     */
    public static final char THOST_FTDC_PSRC_Sell='2';

    /**
     *卖委托价 {@value}
     *@see #SizeOf_TThostFtdcPriceSourceType
     */
    public static final String STRING_THOST_FTDC_PSRC_Sell="2";

    /**
     *TFtdcPriceSourceType是一个成交价来源类型
     *@see #THOST_FTDC_PSRC_LastPrice
     *@see #THOST_FTDC_PSRC_Buy
     *@see #THOST_FTDC_PSRC_Sell
     */
    public static final int SizeOf_TThostFtdcPriceSourceType=1;

    /**
     *开盘前 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final char THOST_FTDC_IS_BeforeTrading='0';

    /**
     *开盘前 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final String STRING_THOST_FTDC_IS_BeforeTrading="0";

    /**
     *非交易 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final char THOST_FTDC_IS_NoTrading='1';

    /**
     *非交易 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final String STRING_THOST_FTDC_IS_NoTrading="1";

    /**
     *连续交易 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final char THOST_FTDC_IS_Continous='2';

    /**
     *连续交易 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final String STRING_THOST_FTDC_IS_Continous="2";

    /**
     *集合竞价报单 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final char THOST_FTDC_IS_AuctionOrdering='3';

    /**
     *集合竞价报单 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final String STRING_THOST_FTDC_IS_AuctionOrdering="3";

    /**
     *集合竞价价格平衡 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final char THOST_FTDC_IS_AuctionBalance='4';

    /**
     *集合竞价价格平衡 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final String STRING_THOST_FTDC_IS_AuctionBalance="4";

    /**
     *集合竞价撮合 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final char THOST_FTDC_IS_AuctionMatch='5';

    /**
     *集合竞价撮合 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final String STRING_THOST_FTDC_IS_AuctionMatch="5";

    /**
     *收盘 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final char THOST_FTDC_IS_Closed='6';

    /**
     *收盘 {@value}
     *@see #SizeOf_TThostFtdcInstrumentStatusType
     */
    public static final String STRING_THOST_FTDC_IS_Closed="6";

    /**
     *TFtdcInstrumentStatusType是一个合约交易状态类型
     *@see #THOST_FTDC_IS_BeforeTrading
     *@see #THOST_FTDC_IS_NoTrading
     *@see #THOST_FTDC_IS_Continous
     *@see #THOST_FTDC_IS_AuctionOrdering
     *@see #THOST_FTDC_IS_AuctionBalance
     *@see #THOST_FTDC_IS_AuctionMatch
     *@see #THOST_FTDC_IS_Closed
     */
    public static final int SizeOf_TThostFtdcInstrumentStatusType=1;

    /**
     *自动切换 {@value}
     *@see #SizeOf_TThostFtdcInstStatusEnterReasonType
     */
    public static final char THOST_FTDC_IER_Automatic='1';

    /**
     *自动切换 {@value}
     *@see #SizeOf_TThostFtdcInstStatusEnterReasonType
     */
    public static final String STRING_THOST_FTDC_IER_Automatic="1";

    /**
     *手动切换 {@value}
     *@see #SizeOf_TThostFtdcInstStatusEnterReasonType
     */
    public static final char THOST_FTDC_IER_Manual='2';

    /**
     *手动切换 {@value}
     *@see #SizeOf_TThostFtdcInstStatusEnterReasonType
     */
    public static final String STRING_THOST_FTDC_IER_Manual="2";

    /**
     *熔断 {@value}
     *@see #SizeOf_TThostFtdcInstStatusEnterReasonType
     */
    public static final char THOST_FTDC_IER_Fuse='3';

    /**
     *熔断 {@value}
     *@see #SizeOf_TThostFtdcInstStatusEnterReasonType
     */
    public static final String STRING_THOST_FTDC_IER_Fuse="3";

    /**
     *TFtdcInstStatusEnterReasonType是一个品种进入交易状态原因类型
     *@see #THOST_FTDC_IER_Automatic
     *@see #THOST_FTDC_IER_Manual
     *@see #THOST_FTDC_IER_Fuse
     */
    public static final int SizeOf_TThostFtdcInstStatusEnterReasonType=1;

    /**
     *TFtdcOrderActionRefType是一个报单操作引用类型
     */
    public static final int SizeOf_TThostFtdcOrderActionRefType=4;

    /**
     *TFtdcInstallCountType是一个安装数量类型
     */
    public static final int SizeOf_TThostFtdcInstallCountType=4;

    /**
     *TFtdcInstallIDType是一个安装编号类型
     */
    public static final int SizeOf_TThostFtdcInstallIDType=4;

    /**
     *TFtdcErrorIDType是一个错误代码类型
     */
    public static final int SizeOf_TThostFtdcErrorIDType=4;

    /**
     *TFtdcSettlementIDType是一个结算编号类型
     */
    public static final int SizeOf_TThostFtdcSettlementIDType=4;

    /**
     *TFtdcVolumeType是一个数量类型
     */
    public static final int SizeOf_TThostFtdcVolumeType=4;

    /**
     *TFtdcFrontIDType是一个前置编号类型
     */
    public static final int SizeOf_TThostFtdcFrontIDType=4;

    /**
     *TFtdcSessionIDType是一个会话编号类型
     */
    public static final int SizeOf_TThostFtdcSessionIDType=4;

    /**
     *TFtdcSequenceNoType是一个序号类型
     */
    public static final int SizeOf_TThostFtdcSequenceNoType=4;

    /**
     *TFtdcCommandNoType是一个DB命令序号类型
     */
    public static final int SizeOf_TThostFtdcCommandNoType=4;

    /**
     *TFtdcMillisecType是一个时间（毫秒）类型
     */
    public static final int SizeOf_TThostFtdcMillisecType=4;

    /**
     *TFtdcVolumeMultipleType是一个合约数量乘数类型
     */
    public static final int SizeOf_TThostFtdcVolumeMultipleType=4;

    /**
     *TFtdcTradingSegmentSNType是一个交易阶段编号类型
     */
    public static final int SizeOf_TThostFtdcTradingSegmentSNType=4;

    /**
     *TFtdcRequestIDType是一个请求编号类型
     */
    public static final int SizeOf_TThostFtdcRequestIDType=4;

    /**
     *TFtdcYearType是一个年份类型
     */
    public static final int SizeOf_TThostFtdcYearType=4;

    /**
     *TFtdcMonthType是一个月份类型
     */
    public static final int SizeOf_TThostFtdcMonthType=4;

    /**
     *TFtdcBoolType是一个布尔型类型
     */
    public static final int SizeOf_TThostFtdcBoolType=4;

    /**
     *TFtdcPriceType是一个价格类型
     */
    public static final int SizeOf_TThostFtdcPriceType=8;

    /**
     *TFtdcCombOffsetFlagType是一个组合开平标志类型
     *@see #THOST_FTDC_OF_Open
     *@see #THOST_FTDC_OF_Close
     *@see #THOST_FTDC_OF_ForceClose
     *@see #THOST_FTDC_OF_CloseToday
     *@see #THOST_FTDC_OF_CloseYesterday
     *@see #THOST_FTDC_OF_ForceOff
     *@see #THOST_FTDC_OF_LocalForceClose
     */
    public static final int SizeOf_TThostFtdcCombOffsetFlagType=5;

    /**
     *TFtdcCombHedgeFlagType是一个组合投机套保标志类型
     *@see #THOST_FTDC_HF_Speculation
     *@see #THOST_FTDC_HF_Arbitrage
     *@see #THOST_FTDC_HF_Hedge
     */
    public static final int SizeOf_TThostFtdcCombHedgeFlagType=5;

    /**
     *TFtdcRatioType是一个比率类型
     */
    public static final int SizeOf_TThostFtdcRatioType=8;

    /**
     *TFtdcMoneyType是一个资金类型
     */
    public static final int SizeOf_TThostFtdcMoneyType=8;

    /**
     *TFtdcLargeVolumeType是一个大额数量类型
     */
    public static final int SizeOf_TThostFtdcLargeVolumeType=8;

    /**
     *TFtdcSequenceSeriesType是一个序列系列号类型
     */
    public static final int SizeOf_TThostFtdcSequenceSeriesType=2;

    /**
     *TFtdcCommPhaseNoType是一个通讯时段编号类型
     */
    public static final int SizeOf_TThostFtdcCommPhaseNoType=2;

    /**
     *TFtdcSequenceLabelType是一个序列编号类型
     */
    public static final int SizeOf_TThostFtdcSequenceLabelType=2;

    /**
     *TFtdcUnderlyingMultipleType是一个基础商品乘数类型
     */
    public static final int SizeOf_TThostFtdcUnderlyingMultipleType=8;

    /**
     *TFtdcPriorityType是一个优先级类型
     */
    public static final int SizeOf_TThostFtdcPriorityType=4;

    /**
     *TFtdcContractCodeType是一个合同编号类型
     */
    public static final int SizeOf_TThostFtdcContractCodeType=41;

    /**
     *TFtdcCityType是一个市类型
     */
    public static final int SizeOf_TThostFtdcCityType=51;

    /**
     *TFtdcIsStockType是一个是否股民类型
     */
    public static final int SizeOf_TThostFtdcIsStockType=11;

    /**
     *TFtdcChannelType是一个渠道类型
     */
    public static final int SizeOf_TThostFtdcChannelType=51;

    /**
     *TFtdcAddressType是一个通讯地址类型
     */
    public static final int SizeOf_TThostFtdcAddressType=101;

    /**
     *TFtdcZipCodeType是一个邮政编码类型
     */
    public static final int SizeOf_TThostFtdcZipCodeType=7;

    /**
     *TFtdcTelephoneType是一个联系电话类型
     */
    public static final int SizeOf_TThostFtdcTelephoneType=41;

    /**
     *TFtdcFaxType是一个传真类型
     */
    public static final int SizeOf_TThostFtdcFaxType=41;

    /**
     *TFtdcMobileType是一个手机类型
     */
    public static final int SizeOf_TThostFtdcMobileType=41;

    /**
     *TFtdcEMailType是一个电子邮件类型
     */
    public static final int SizeOf_TThostFtdcEMailType=41;

    /**
     *TFtdcMemoType是一个备注类型
     */
    public static final int SizeOf_TThostFtdcMemoType=161;

    /**
     *TFtdcCompanyCodeType是一个企业代码类型
     */
    public static final int SizeOf_TThostFtdcCompanyCodeType=51;

    /**
     *TFtdcWebsiteType是一个网站地址类型
     */
    public static final int SizeOf_TThostFtdcWebsiteType=51;

    /**
     *TFtdcTaxNoType是一个税务登记号类型
     */
    public static final int SizeOf_TThostFtdcTaxNoType=31;

    /**
     *未上传 {@value}
     *@see #SizeOf_TThostFtdcBatchStatusType
     */
    public static final char THOST_FTDC_BS_NoUpload='1';

    /**
     *未上传 {@value}
     *@see #SizeOf_TThostFtdcBatchStatusType
     */
    public static final String STRING_THOST_FTDC_BS_NoUpload="1";

    /**
     *已上传 {@value}
     *@see #SizeOf_TThostFtdcBatchStatusType
     */
    public static final char THOST_FTDC_BS_Uploaded='2';

    /**
     *已上传 {@value}
     *@see #SizeOf_TThostFtdcBatchStatusType
     */
    public static final String STRING_THOST_FTDC_BS_Uploaded="2";

    /**
     *审核失败 {@value}
     *@see #SizeOf_TThostFtdcBatchStatusType
     */
    public static final char THOST_FTDC_BS_Failed='3';

    /**
     *审核失败 {@value}
     *@see #SizeOf_TThostFtdcBatchStatusType
     */
    public static final String STRING_THOST_FTDC_BS_Failed="3";

    /**
     *TFtdcBatchStatusType是一个处理状态类型
     *@see #THOST_FTDC_BS_NoUpload
     *@see #THOST_FTDC_BS_Uploaded
     *@see #THOST_FTDC_BS_Failed
     */
    public static final int SizeOf_TThostFtdcBatchStatusType=1;

    /**
     *TFtdcPropertyIDType是一个属性代码类型
     */
    public static final int SizeOf_TThostFtdcPropertyIDType=33;

    /**
     *TFtdcPropertyNameType是一个属性名称类型
     */
    public static final int SizeOf_TThostFtdcPropertyNameType=65;

    /**
     *TFtdcLicenseNoType是一个营业执照号类型
     */
    public static final int SizeOf_TThostFtdcLicenseNoType=51;

    /**
     *TFtdcAgentIDType是一个经纪人代码类型
     */
    public static final int SizeOf_TThostFtdcAgentIDType=13;

    /**
     *TFtdcAgentNameType是一个经纪人名称类型
     */
    public static final int SizeOf_TThostFtdcAgentNameType=41;

    /**
     *TFtdcAgentGroupIDType是一个经纪人组代码类型
     */
    public static final int SizeOf_TThostFtdcAgentGroupIDType=13;

    /**
     *TFtdcAgentGroupNameType是一个经纪人组名称类型
     */
    public static final int SizeOf_TThostFtdcAgentGroupNameType=41;

    /**
     *按所有品种 {@value}
     *@see #SizeOf_TThostFtdcReturnStyleType
     */
    public static final char THOST_FTDC_RS_All='1';

    /**
     *按所有品种 {@value}
     *@see #SizeOf_TThostFtdcReturnStyleType
     */
    public static final String STRING_THOST_FTDC_RS_All="1";

    /**
     *按品种 {@value}
     *@see #SizeOf_TThostFtdcReturnStyleType
     */
    public static final char THOST_FTDC_RS_ByProduct='2';

    /**
     *按品种 {@value}
     *@see #SizeOf_TThostFtdcReturnStyleType
     */
    public static final String STRING_THOST_FTDC_RS_ByProduct="2";

    /**
     *TFtdcReturnStyleType是一个按品种返还方式类型
     *@see #THOST_FTDC_RS_All
     *@see #THOST_FTDC_RS_ByProduct
     */
    public static final int SizeOf_TThostFtdcReturnStyleType=1;

    /**
     *按成交手数 {@value}
     *@see #SizeOf_TThostFtdcReturnPatternType
     */
    public static final char THOST_FTDC_RP_ByVolume='1';

    /**
     *按成交手数 {@value}
     *@see #SizeOf_TThostFtdcReturnPatternType
     */
    public static final String STRING_THOST_FTDC_RP_ByVolume="1";

    /**
     *按留存手续费 {@value}
     *@see #SizeOf_TThostFtdcReturnPatternType
     */
    public static final char THOST_FTDC_RP_ByFeeOnHand='2';

    /**
     *按留存手续费 {@value}
     *@see #SizeOf_TThostFtdcReturnPatternType
     */
    public static final String STRING_THOST_FTDC_RP_ByFeeOnHand="2";

    /**
     *TFtdcReturnPatternType是一个返还模式类型
     *@see #THOST_FTDC_RP_ByVolume
     *@see #THOST_FTDC_RP_ByFeeOnHand
     */
    public static final int SizeOf_TThostFtdcReturnPatternType=1;

    /**
     *级别1 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final char THOST_FTDC_RL_Level1='1';

    /**
     *级别1 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final String STRING_THOST_FTDC_RL_Level1="1";

    /**
     *级别2 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final char THOST_FTDC_RL_Level2='2';

    /**
     *级别2 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final String STRING_THOST_FTDC_RL_Level2="2";

    /**
     *级别3 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final char THOST_FTDC_RL_Level3='3';

    /**
     *级别3 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final String STRING_THOST_FTDC_RL_Level3="3";

    /**
     *级别4 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final char THOST_FTDC_RL_Level4='4';

    /**
     *级别4 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final String STRING_THOST_FTDC_RL_Level4="4";

    /**
     *级别5 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final char THOST_FTDC_RL_Level5='5';

    /**
     *级别5 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final String STRING_THOST_FTDC_RL_Level5="5";

    /**
     *级别6 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final char THOST_FTDC_RL_Level6='6';

    /**
     *级别6 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final String STRING_THOST_FTDC_RL_Level6="6";

    /**
     *级别7 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final char THOST_FTDC_RL_Level7='7';

    /**
     *级别7 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final String STRING_THOST_FTDC_RL_Level7="7";

    /**
     *级别8 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final char THOST_FTDC_RL_Level8='8';

    /**
     *级别8 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final String STRING_THOST_FTDC_RL_Level8="8";

    /**
     *级别9 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final char THOST_FTDC_RL_Level9='9';

    /**
     *级别9 {@value}
     *@see #SizeOf_TThostFtdcReturnLevelType
     */
    public static final String STRING_THOST_FTDC_RL_Level9="9";

    /**
     *TFtdcReturnLevelType是一个返还级别类型
     *@see #THOST_FTDC_RL_Level1
     *@see #THOST_FTDC_RL_Level2
     *@see #THOST_FTDC_RL_Level3
     *@see #THOST_FTDC_RL_Level4
     *@see #THOST_FTDC_RL_Level5
     *@see #THOST_FTDC_RL_Level6
     *@see #THOST_FTDC_RL_Level7
     *@see #THOST_FTDC_RL_Level8
     *@see #THOST_FTDC_RL_Level9
     */
    public static final int SizeOf_TThostFtdcReturnLevelType=1;

    /**
     *分阶段返还 {@value}
     *@see #SizeOf_TThostFtdcReturnStandardType
     */
    public static final char THOST_FTDC_RSD_ByPeriod='1';

    /**
     *分阶段返还 {@value}
     *@see #SizeOf_TThostFtdcReturnStandardType
     */
    public static final String STRING_THOST_FTDC_RSD_ByPeriod="1";

    /**
     *按某一标准 {@value}
     *@see #SizeOf_TThostFtdcReturnStandardType
     */
    public static final char THOST_FTDC_RSD_ByStandard='2';

    /**
     *按某一标准 {@value}
     *@see #SizeOf_TThostFtdcReturnStandardType
     */
    public static final String STRING_THOST_FTDC_RSD_ByStandard="2";

    /**
     *TFtdcReturnStandardType是一个返还标准类型
     *@see #THOST_FTDC_RSD_ByPeriod
     *@see #THOST_FTDC_RSD_ByStandard
     */
    public static final int SizeOf_TThostFtdcReturnStandardType=1;

    /**
     *质出 {@value}
     *@see #SizeOf_TThostFtdcMortgageTypeType
     */
    public static final char THOST_FTDC_MT_Out='0';

    /**
     *质出 {@value}
     *@see #SizeOf_TThostFtdcMortgageTypeType
     */
    public static final String STRING_THOST_FTDC_MT_Out="0";

    /**
     *质入 {@value}
     *@see #SizeOf_TThostFtdcMortgageTypeType
     */
    public static final char THOST_FTDC_MT_In='1';

    /**
     *质入 {@value}
     *@see #SizeOf_TThostFtdcMortgageTypeType
     */
    public static final String STRING_THOST_FTDC_MT_In="1";

    /**
     *TFtdcMortgageTypeType是一个质押类型类型
     *@see #THOST_FTDC_MT_Out
     *@see #THOST_FTDC_MT_In
     */
    public static final int SizeOf_TThostFtdcMortgageTypeType=1;

    /**
     *质押比例 {@value}
     *@see #SizeOf_TThostFtdcInvestorSettlementParamIDType
     */
    public static final char THOST_FTDC_ISPI_MortgageRatio='4';

    /**
     *质押比例 {@value}
     *@see #SizeOf_TThostFtdcInvestorSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ISPI_MortgageRatio="4";

    /**
     *保证金算法 {@value}
     *@see #SizeOf_TThostFtdcInvestorSettlementParamIDType
     */
    public static final char THOST_FTDC_ISPI_MarginWay='5';

    /**
     *保证金算法 {@value}
     *@see #SizeOf_TThostFtdcInvestorSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ISPI_MarginWay="5";

    /**
     *结算单结存是否包含质押 {@value}
     *@see #SizeOf_TThostFtdcInvestorSettlementParamIDType
     */
    public static final char THOST_FTDC_ISPI_BillDeposit='9';

    /**
     *结算单结存是否包含质押 {@value}
     *@see #SizeOf_TThostFtdcInvestorSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ISPI_BillDeposit="9";

    /**
     *TFtdcInvestorSettlementParamIDType是一个投资者结算参数代码类型
     *@see #THOST_FTDC_ISPI_MortgageRatio
     *@see #THOST_FTDC_ISPI_MarginWay
     *@see #THOST_FTDC_ISPI_BillDeposit
     */
    public static final int SizeOf_TThostFtdcInvestorSettlementParamIDType=1;

    /**
     *质押比例 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final char THOST_FTDC_ESPI_MortgageRatio='1';

    /**
     *质押比例 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ESPI_MortgageRatio="1";

    /**
     *分项资金导入项 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final char THOST_FTDC_ESPI_OtherFundItem='2';

    /**
     *分项资金导入项 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ESPI_OtherFundItem="2";

    /**
     *分项资金入交易所出入金 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final char THOST_FTDC_ESPI_OtherFundImport='3';

    /**
     *分项资金入交易所出入金 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ESPI_OtherFundImport="3";

    /**
     *中金所开户最低可用金额 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final char THOST_FTDC_ESPI_CFFEXMinPrepa='6';

    /**
     *中金所开户最低可用金额 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ESPI_CFFEXMinPrepa="6";

    /**
     *郑商所结算方式 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final char THOST_FTDC_ESPI_CZCESettlementType='7';

    /**
     *郑商所结算方式 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ESPI_CZCESettlementType="7";

    /**
     *交易所交割手续费收取方式 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final char THOST_FTDC_ESPI_ExchDelivFeeMode='9';

    /**
     *交易所交割手续费收取方式 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ESPI_ExchDelivFeeMode="9";

    /**
     *投资者交割手续费收取方式 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final char THOST_FTDC_ESPI_DelivFeeMode='0';

    /**
     *投资者交割手续费收取方式 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ESPI_DelivFeeMode="0";

    /**
     *郑商所组合持仓保证金收取方式 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final char THOST_FTDC_ESPI_CZCEComMarginType='A';

    /**
     *郑商所组合持仓保证金收取方式 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ESPI_CZCEComMarginType="A";

    /**
     *大商所套利保证金是否优惠 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final char THOST_FTDC_ESPI_DceComMarginType='B';

    /**
     *大商所套利保证金是否优惠 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ESPI_DceComMarginType="B";

    /**
     *虚值期权保证金优惠比率 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final char THOST_FTDC_ESPI_OptOutDisCountRate='a';

    /**
     *虚值期权保证金优惠比率 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ESPI_OptOutDisCountRate="a";

    /**
     *最低保障系数 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final char THOST_FTDC_ESPI_OptMiniGuarantee='b';

    /**
     *最低保障系数 {@value}
     *@see #SizeOf_TThostFtdcExchangeSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ESPI_OptMiniGuarantee="b";

    /**
     *TFtdcExchangeSettlementParamIDType是一个交易所结算参数代码类型
     *@see #THOST_FTDC_ESPI_MortgageRatio
     *@see #THOST_FTDC_ESPI_OtherFundItem
     *@see #THOST_FTDC_ESPI_OtherFundImport
     *@see #THOST_FTDC_ESPI_CFFEXMinPrepa
     *@see #THOST_FTDC_ESPI_CZCESettlementType
     *@see #THOST_FTDC_ESPI_ExchDelivFeeMode
     *@see #THOST_FTDC_ESPI_DelivFeeMode
     *@see #THOST_FTDC_ESPI_CZCEComMarginType
     *@see #THOST_FTDC_ESPI_DceComMarginType
     *@see #THOST_FTDC_ESPI_OptOutDisCountRate
     *@see #THOST_FTDC_ESPI_OptMiniGuarantee
     */
    public static final int SizeOf_TThostFtdcExchangeSettlementParamIDType=1;

    /**
     *投资者代码最小长度 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_InvestorIDMinLength='1';

    /**
     *投资者代码最小长度 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_InvestorIDMinLength="1";

    /**
     *投资者帐号代码最小长度 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_AccountIDMinLength='2';

    /**
     *投资者帐号代码最小长度 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_AccountIDMinLength="2";

    /**
     *投资者开户默认登录权限 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_UserRightLogon='3';

    /**
     *投资者开户默认登录权限 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_UserRightLogon="3";

    /**
     *投资者交易结算单成交汇总方式 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_SettlementBillTrade='4';

    /**
     *投资者交易结算单成交汇总方式 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_SettlementBillTrade="4";

    /**
     *统一开户更新交易编码方式 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_TradingCode='5';

    /**
     *统一开户更新交易编码方式 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_TradingCode="5";

    /**
     *结算是否判断存在未复核的出入金和分项资金 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_CheckFund='6';

    /**
     *结算是否判断存在未复核的出入金和分项资金 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_CheckFund="6";

    /**
     *是否启用手续费模板数据权限 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_CommModelRight='7';

    /**
     *是否启用手续费模板数据权限 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_CommModelRight="7";

    /**
     *是否启用保证金率模板数据权限 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_MarginModelRight='9';

    /**
     *是否启用保证金率模板数据权限 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_MarginModelRight="9";

    /**
     *是否规范用户才能激活 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_IsStandardActive='8';

    /**
     *是否规范用户才能激活 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_IsStandardActive="8";

    /**
     *上传的交易所结算文件路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_UploadSettlementFile='U';

    /**
     *上传的交易所结算文件路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_UploadSettlementFile="U";

    /**
     *上报保证金监控中心文件路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_DownloadCSRCFile='D';

    /**
     *上报保证金监控中心文件路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_DownloadCSRCFile="D";

    /**
     *生成的结算单文件路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_SettlementBillFile='S';

    /**
     *生成的结算单文件路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_SettlementBillFile="S";

    /**
     *证监会文件标识 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_CSRCOthersFile='C';

    /**
     *证监会文件标识 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_CSRCOthersFile="C";

    /**
     *投资者照片路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_InvestorPhoto='P';

    /**
     *投资者照片路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_InvestorPhoto="P";

    /**
     *全结经纪公司上传文件路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_CSRCData='R';

    /**
     *全结经纪公司上传文件路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_CSRCData="R";

    /**
     *开户密码录入方式 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_InvestorPwdModel='I';

    /**
     *开户密码录入方式 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_InvestorPwdModel="I";

    /**
     *投资者中金所结算文件下载路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_CFFEXInvestorSettleFile='F';

    /**
     *投资者中金所结算文件下载路径 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_CFFEXInvestorSettleFile="F";

    /**
     *投资者代码编码方式 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_InvestorIDType='a';

    /**
     *投资者代码编码方式 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_InvestorIDType="a";

    /**
     *休眠户最高权益 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_FreezeMaxReMain='r';

    /**
     *休眠户最高权益 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_FreezeMaxReMain="r";

    /**
     *手续费相关操作实时上场开关 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_IsSync='A';

    /**
     *手续费相关操作实时上场开关 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_IsSync="A";

    /**
     *解除开仓权限限制 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_RelieveOpenLimit='O';

    /**
     *解除开仓权限限制 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_RelieveOpenLimit="O";

    /**
     *是否规范用户才能休眠 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_IsStandardFreeze='X';

    /**
     *是否规范用户才能休眠 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_IsStandardFreeze="X";

    /**
     *郑商所是否开放所有品种套保交易 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final char THOST_FTDC_SPI_CZCENormalProductHedge='B';

    /**
     *郑商所是否开放所有品种套保交易 {@value}
     *@see #SizeOf_TThostFtdcSystemParamIDType
     */
    public static final String STRING_THOST_FTDC_SPI_CZCENormalProductHedge="B";

    /**
     *TFtdcSystemParamIDType是一个系统参数代码类型
     *@see #THOST_FTDC_SPI_InvestorIDMinLength
     *@see #THOST_FTDC_SPI_AccountIDMinLength
     *@see #THOST_FTDC_SPI_UserRightLogon
     *@see #THOST_FTDC_SPI_SettlementBillTrade
     *@see #THOST_FTDC_SPI_TradingCode
     *@see #THOST_FTDC_SPI_CheckFund
     *@see #THOST_FTDC_SPI_CommModelRight
     *@see #THOST_FTDC_SPI_MarginModelRight
     *@see #THOST_FTDC_SPI_IsStandardActive
     *@see #THOST_FTDC_SPI_UploadSettlementFile
     *@see #THOST_FTDC_SPI_DownloadCSRCFile
     *@see #THOST_FTDC_SPI_SettlementBillFile
     *@see #THOST_FTDC_SPI_CSRCOthersFile
     *@see #THOST_FTDC_SPI_InvestorPhoto
     *@see #THOST_FTDC_SPI_CSRCData
     *@see #THOST_FTDC_SPI_InvestorPwdModel
     *@see #THOST_FTDC_SPI_CFFEXInvestorSettleFile
     *@see #THOST_FTDC_SPI_InvestorIDType
     *@see #THOST_FTDC_SPI_FreezeMaxReMain
     *@see #THOST_FTDC_SPI_IsSync
     *@see #THOST_FTDC_SPI_RelieveOpenLimit
     *@see #THOST_FTDC_SPI_IsStandardFreeze
     *@see #THOST_FTDC_SPI_CZCENormalProductHedge
     */
    public static final int SizeOf_TThostFtdcSystemParamIDType=1;

    /**
     *系统加密算法 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final char THOST_FTDC_TPID_EncryptionStandard='E';

    /**
     *系统加密算法 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final String STRING_THOST_FTDC_TPID_EncryptionStandard="E";

    /**
     *系统风险算法 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final char THOST_FTDC_TPID_RiskMode='R';

    /**
     *系统风险算法 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final String STRING_THOST_FTDC_TPID_RiskMode="R";

    /**
     *系统风险算法是否全局 0-否 1-是 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final char THOST_FTDC_TPID_RiskModeGlobal='G';

    /**
     *系统风险算法是否全局 0-否 1-是 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final String STRING_THOST_FTDC_TPID_RiskModeGlobal="G";

    /**
     *密码加密算法 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final char THOST_FTDC_TPID_modeEncode='P';

    /**
     *密码加密算法 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final String STRING_THOST_FTDC_TPID_modeEncode="P";

    /**
     *价格小数位数参数 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final char THOST_FTDC_TPID_tickMode='T';

    /**
     *价格小数位数参数 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final String STRING_THOST_FTDC_TPID_tickMode="T";

    /**
     *用户最大会话数 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final char THOST_FTDC_TPID_SingleUserSessionMaxNum='S';

    /**
     *用户最大会话数 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final String STRING_THOST_FTDC_TPID_SingleUserSessionMaxNum="S";

    /**
     *最大连续登录失败数 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final char THOST_FTDC_TPID_LoginFailMaxNum='L';

    /**
     *最大连续登录失败数 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final String STRING_THOST_FTDC_TPID_LoginFailMaxNum="L";

    /**
     *是否强制认证 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final char THOST_FTDC_TPID_IsAuthForce='A';

    /**
     *是否强制认证 {@value}
     *@see #SizeOf_TThostFtdcTradeParamIDType
     */
    public static final String STRING_THOST_FTDC_TPID_IsAuthForce="A";

    /**
     *TFtdcTradeParamIDType是一个交易系统参数代码类型
     *@see #THOST_FTDC_TPID_EncryptionStandard
     *@see #THOST_FTDC_TPID_RiskMode
     *@see #THOST_FTDC_TPID_RiskModeGlobal
     *@see #THOST_FTDC_TPID_modeEncode
     *@see #THOST_FTDC_TPID_tickMode
     *@see #THOST_FTDC_TPID_SingleUserSessionMaxNum
     *@see #THOST_FTDC_TPID_LoginFailMaxNum
     *@see #THOST_FTDC_TPID_IsAuthForce
     */
    public static final int SizeOf_TThostFtdcTradeParamIDType=1;

    /**
     *TFtdcSettlementParamValueType是一个参数代码值类型
     */
    public static final int SizeOf_TThostFtdcSettlementParamValueType=256;

    /**
     *TFtdcCounterIDType是一个计数器代码类型
     */
    public static final int SizeOf_TThostFtdcCounterIDType=33;

    /**
     *TFtdcInvestorGroupNameType是一个投资者分组名称类型
     */
    public static final int SizeOf_TThostFtdcInvestorGroupNameType=41;

    /**
     *TFtdcBrandCodeType是一个牌号类型
     */
    public static final int SizeOf_TThostFtdcBrandCodeType=257;

    /**
     *TFtdcWarehouseType是一个仓库类型
     */
    public static final int SizeOf_TThostFtdcWarehouseType=257;

    /**
     *TFtdcProductDateType是一个产期类型
     */
    public static final int SizeOf_TThostFtdcProductDateType=41;

    /**
     *TFtdcGradeType是一个等级类型
     */
    public static final int SizeOf_TThostFtdcGradeType=41;

    /**
     *TFtdcClassifyType是一个类别类型
     */
    public static final int SizeOf_TThostFtdcClassifyType=41;

    /**
     *TFtdcPositionType是一个货位类型
     */
    public static final int SizeOf_TThostFtdcPositionType=41;

    /**
     *TFtdcYieldlyType是一个产地类型
     */
    public static final int SizeOf_TThostFtdcYieldlyType=41;

    /**
     *TFtdcWeightType是一个公定重量类型
     */
    public static final int SizeOf_TThostFtdcWeightType=41;

    /**
     *TFtdcSubEntryFundNoType是一个分项资金流水号类型
     */
    public static final int SizeOf_TThostFtdcSubEntryFundNoType=4;

    /**
     *资金数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_SettlementFund='F';

    /**
     *资金数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_SettlementFund="F";

    /**
     *成交数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_Trade='T';

    /**
     *成交数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_Trade="T";

    /**
     *投资者持仓数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_InvestorPosition='P';

    /**
     *投资者持仓数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_InvestorPosition="P";

    /**
     *投资者分项资金数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_SubEntryFund='O';

    /**
     *投资者分项资金数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_SubEntryFund="O";

    /**
     *组合持仓数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_CZCECombinationPos='C';

    /**
     *组合持仓数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_CZCECombinationPos="C";

    /**
     *上报保证金监控中心数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_CSRCData='R';

    /**
     *上报保证金监控中心数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_CSRCData="R";

    /**
     *郑商所平仓了结数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_CZCEClose='L';

    /**
     *郑商所平仓了结数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_CZCEClose="L";

    /**
     *郑商所非平仓了结数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_CZCENoClose='N';

    /**
     *郑商所非平仓了结数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_CZCENoClose="N";

    /**
     *持仓明细数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_PositionDtl='D';

    /**
     *持仓明细数据 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_PositionDtl="D";

    /**
     *期权执行文件 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_OptionStrike='S';

    /**
     *期权执行文件 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_OptionStrike="S";

    /**
     *结算价比对文件 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_SettlementPriceComparison='M';

    /**
     *结算价比对文件 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_SettlementPriceComparison="M";

    /**
     *上期所非持仓变动明细 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final char THOST_FTDC_FI_NonTradePosChange='B';

    /**
     *上期所非持仓变动明细 {@value}
     *@see #SizeOf_TThostFtdcFileIDType
     */
    public static final String STRING_THOST_FTDC_FI_NonTradePosChange="B";

    /**
     *TFtdcFileIDType是一个文件标识类型
     *@see #THOST_FTDC_FI_SettlementFund
     *@see #THOST_FTDC_FI_Trade
     *@see #THOST_FTDC_FI_InvestorPosition
     *@see #THOST_FTDC_FI_SubEntryFund
     *@see #THOST_FTDC_FI_CZCECombinationPos
     *@see #THOST_FTDC_FI_CSRCData
     *@see #THOST_FTDC_FI_CZCEClose
     *@see #THOST_FTDC_FI_CZCENoClose
     *@see #THOST_FTDC_FI_PositionDtl
     *@see #THOST_FTDC_FI_OptionStrike
     *@see #THOST_FTDC_FI_SettlementPriceComparison
     *@see #THOST_FTDC_FI_NonTradePosChange
     */
    public static final int SizeOf_TThostFtdcFileIDType=1;

    /**
     *TFtdcFileNameType是一个文件名称类型
     */
    public static final int SizeOf_TThostFtdcFileNameType=257;

    /**
     *结算 {@value}
     *@see #SizeOf_TThostFtdcFileTypeType
     */
    public static final char THOST_FTDC_FUT_Settlement='0';

    /**
     *结算 {@value}
     *@see #SizeOf_TThostFtdcFileTypeType
     */
    public static final String STRING_THOST_FTDC_FUT_Settlement="0";

    /**
     *核对 {@value}
     *@see #SizeOf_TThostFtdcFileTypeType
     */
    public static final char THOST_FTDC_FUT_Check='1';

    /**
     *核对 {@value}
     *@see #SizeOf_TThostFtdcFileTypeType
     */
    public static final String STRING_THOST_FTDC_FUT_Check="1";

    /**
     *TFtdcFileTypeType是一个文件上传类型类型
     *@see #THOST_FTDC_FUT_Settlement
     *@see #THOST_FTDC_FUT_Check
     */
    public static final int SizeOf_TThostFtdcFileTypeType=1;

    /**
     *文本文件(.txt) {@value}
     *@see #SizeOf_TThostFtdcFileFormatType
     */
    public static final char THOST_FTDC_FFT_Txt='0';

    /**
     *文本文件(.txt) {@value}
     *@see #SizeOf_TThostFtdcFileFormatType
     */
    public static final String STRING_THOST_FTDC_FFT_Txt="0";

    /**
     *压缩文件(.zip) {@value}
     *@see #SizeOf_TThostFtdcFileFormatType
     */
    public static final char THOST_FTDC_FFT_Zip='1';

    /**
     *压缩文件(.zip) {@value}
     *@see #SizeOf_TThostFtdcFileFormatType
     */
    public static final String STRING_THOST_FTDC_FFT_Zip="1";

    /**
     *DBF文件(.dbf) {@value}
     *@see #SizeOf_TThostFtdcFileFormatType
     */
    public static final char THOST_FTDC_FFT_DBF='2';

    /**
     *DBF文件(.dbf) {@value}
     *@see #SizeOf_TThostFtdcFileFormatType
     */
    public static final String STRING_THOST_FTDC_FFT_DBF="2";

    /**
     *TFtdcFileFormatType是一个文件格式类型
     *@see #THOST_FTDC_FFT_Txt
     *@see #THOST_FTDC_FFT_Zip
     *@see #THOST_FTDC_FFT_DBF
     */
    public static final int SizeOf_TThostFtdcFileFormatType=1;

    /**
     *上传成功 {@value}
     *@see #SizeOf_TThostFtdcFileUploadStatusType
     */
    public static final char THOST_FTDC_FUS_SucceedUpload='1';

    /**
     *上传成功 {@value}
     *@see #SizeOf_TThostFtdcFileUploadStatusType
     */
    public static final String STRING_THOST_FTDC_FUS_SucceedUpload="1";

    /**
     *上传失败 {@value}
     *@see #SizeOf_TThostFtdcFileUploadStatusType
     */
    public static final char THOST_FTDC_FUS_FailedUpload='2';

    /**
     *上传失败 {@value}
     *@see #SizeOf_TThostFtdcFileUploadStatusType
     */
    public static final String STRING_THOST_FTDC_FUS_FailedUpload="2";

    /**
     *导入成功 {@value}
     *@see #SizeOf_TThostFtdcFileUploadStatusType
     */
    public static final char THOST_FTDC_FUS_SucceedLoad='3';

    /**
     *导入成功 {@value}
     *@see #SizeOf_TThostFtdcFileUploadStatusType
     */
    public static final String STRING_THOST_FTDC_FUS_SucceedLoad="3";

    /**
     *导入部分成功 {@value}
     *@see #SizeOf_TThostFtdcFileUploadStatusType
     */
    public static final char THOST_FTDC_FUS_PartSucceedLoad='4';

    /**
     *导入部分成功 {@value}
     *@see #SizeOf_TThostFtdcFileUploadStatusType
     */
    public static final String STRING_THOST_FTDC_FUS_PartSucceedLoad="4";

    /**
     *导入失败 {@value}
     *@see #SizeOf_TThostFtdcFileUploadStatusType
     */
    public static final char THOST_FTDC_FUS_FailedLoad='5';

    /**
     *导入失败 {@value}
     *@see #SizeOf_TThostFtdcFileUploadStatusType
     */
    public static final String STRING_THOST_FTDC_FUS_FailedLoad="5";

    /**
     *TFtdcFileUploadStatusType是一个文件状态类型
     *@see #THOST_FTDC_FUS_SucceedUpload
     *@see #THOST_FTDC_FUS_FailedUpload
     *@see #THOST_FTDC_FUS_SucceedLoad
     *@see #THOST_FTDC_FUS_PartSucceedLoad
     *@see #THOST_FTDC_FUS_FailedLoad
     */
    public static final int SizeOf_TThostFtdcFileUploadStatusType=1;

    /**
     *移出 {@value}
     *@see #SizeOf_TThostFtdcTransferDirectionType
     */
    public static final char THOST_FTDC_TD_Out='0';

    /**
     *移出 {@value}
     *@see #SizeOf_TThostFtdcTransferDirectionType
     */
    public static final String STRING_THOST_FTDC_TD_Out="0";

    /**
     *移入 {@value}
     *@see #SizeOf_TThostFtdcTransferDirectionType
     */
    public static final char THOST_FTDC_TD_In='1';

    /**
     *移入 {@value}
     *@see #SizeOf_TThostFtdcTransferDirectionType
     */
    public static final String STRING_THOST_FTDC_TD_In="1";

    /**
     *TFtdcTransferDirectionType是一个移仓方向类型
     *@see #THOST_FTDC_TD_Out
     *@see #THOST_FTDC_TD_In
     */
    public static final int SizeOf_TThostFtdcTransferDirectionType=1;

    /**
     *TFtdcUploadModeType是一个上传文件类型类型
     */
    public static final int SizeOf_TThostFtdcUploadModeType=21;

    /**
     *TFtdcAccountIDType是一个投资者帐号类型
     */
    public static final int SizeOf_TThostFtdcAccountIDType=13;

    /**
     *TFtdcBankFlagType是一个银行统一标识类型类型
     */
    public static final int SizeOf_TThostFtdcBankFlagType=4;

    /**
     *TFtdcBankAccountType是一个银行账户类型
     */
    public static final int SizeOf_TThostFtdcBankAccountType=41;

    /**
     *TFtdcOpenNameType是一个银行账户的开户人名称类型
     */
    public static final int SizeOf_TThostFtdcOpenNameType=61;

    /**
     *TFtdcOpenBankType是一个银行账户的开户行类型
     */
    public static final int SizeOf_TThostFtdcOpenBankType=101;

    /**
     *TFtdcBankNameType是一个银行名称类型
     */
    public static final int SizeOf_TThostFtdcBankNameType=101;

    /**
     *TFtdcPublishPathType是一个发布路径类型
     */
    public static final int SizeOf_TThostFtdcPublishPathType=257;

    /**
     *TFtdcOperatorIDType是一个操作员代码类型
     */
    public static final int SizeOf_TThostFtdcOperatorIDType=65;

    /**
     *TFtdcMonthCountType是一个月份数量类型
     */
    public static final int SizeOf_TThostFtdcMonthCountType=4;

    /**
     *TFtdcAdvanceMonthArrayType是一个月份提前数组类型
     */
    public static final int SizeOf_TThostFtdcAdvanceMonthArrayType=13;

    /**
     *TFtdcDateExprType是一个日期表达式类型
     */
    public static final int SizeOf_TThostFtdcDateExprType=1025;

    /**
     *TFtdcInstrumentIDExprType是一个合约代码表达式类型
     */
    public static final int SizeOf_TThostFtdcInstrumentIDExprType=41;

    /**
     *TFtdcInstrumentNameExprType是一个合约名称表达式类型
     */
    public static final int SizeOf_TThostFtdcInstrumentNameExprType=41;

    /**
     *没有特殊创建规则 {@value}
     *@see #SizeOf_TThostFtdcSpecialCreateRuleType
     */
    public static final char THOST_FTDC_SC_NoSpecialRule='0';

    /**
     *没有特殊创建规则 {@value}
     *@see #SizeOf_TThostFtdcSpecialCreateRuleType
     */
    public static final String STRING_THOST_FTDC_SC_NoSpecialRule="0";

    /**
     *不包含春节 {@value}
     *@see #SizeOf_TThostFtdcSpecialCreateRuleType
     */
    public static final char THOST_FTDC_SC_NoSpringFestival='1';

    /**
     *不包含春节 {@value}
     *@see #SizeOf_TThostFtdcSpecialCreateRuleType
     */
    public static final String STRING_THOST_FTDC_SC_NoSpringFestival="1";

    /**
     *TFtdcSpecialCreateRuleType是一个特殊的创建规则类型
     *@see #THOST_FTDC_SC_NoSpecialRule
     *@see #THOST_FTDC_SC_NoSpringFestival
     */
    public static final int SizeOf_TThostFtdcSpecialCreateRuleType=1;

    /**
     *上一合约结算价 {@value}
     *@see #SizeOf_TThostFtdcBasisPriceTypeType
     */
    public static final char THOST_FTDC_IPT_LastSettlement='1';

    /**
     *上一合约结算价 {@value}
     *@see #SizeOf_TThostFtdcBasisPriceTypeType
     */
    public static final String STRING_THOST_FTDC_IPT_LastSettlement="1";

    /**
     *上一合约收盘价 {@value}
     *@see #SizeOf_TThostFtdcBasisPriceTypeType
     */
    public static final char THOST_FTDC_IPT_LaseClose='2';

    /**
     *上一合约收盘价 {@value}
     *@see #SizeOf_TThostFtdcBasisPriceTypeType
     */
    public static final String STRING_THOST_FTDC_IPT_LaseClose="2";

    /**
     *TFtdcBasisPriceTypeType是一个挂牌基准价类型类型
     *@see #THOST_FTDC_IPT_LastSettlement
     *@see #THOST_FTDC_IPT_LaseClose
     */
    public static final int SizeOf_TThostFtdcBasisPriceTypeType=1;

    /**
     *活跃 {@value}
     *@see #SizeOf_TThostFtdcProductLifePhaseType
     */
    public static final char THOST_FTDC_PLP_Active='1';

    /**
     *活跃 {@value}
     *@see #SizeOf_TThostFtdcProductLifePhaseType
     */
    public static final String STRING_THOST_FTDC_PLP_Active="1";

    /**
     *不活跃 {@value}
     *@see #SizeOf_TThostFtdcProductLifePhaseType
     */
    public static final char THOST_FTDC_PLP_NonActive='2';

    /**
     *不活跃 {@value}
     *@see #SizeOf_TThostFtdcProductLifePhaseType
     */
    public static final String STRING_THOST_FTDC_PLP_NonActive="2";

    /**
     *注销 {@value}
     *@see #SizeOf_TThostFtdcProductLifePhaseType
     */
    public static final char THOST_FTDC_PLP_Canceled='3';

    /**
     *注销 {@value}
     *@see #SizeOf_TThostFtdcProductLifePhaseType
     */
    public static final String STRING_THOST_FTDC_PLP_Canceled="3";

    /**
     *TFtdcProductLifePhaseType是一个产品生命周期状态类型
     *@see #THOST_FTDC_PLP_Active
     *@see #THOST_FTDC_PLP_NonActive
     *@see #THOST_FTDC_PLP_Canceled
     */
    public static final int SizeOf_TThostFtdcProductLifePhaseType=1;

    /**
     *现金交割 {@value}
     *@see #SizeOf_TThostFtdcDeliveryModeType
     */
    public static final char THOST_FTDC_DM_CashDeliv='1';

    /**
     *现金交割 {@value}
     *@see #SizeOf_TThostFtdcDeliveryModeType
     */
    public static final String STRING_THOST_FTDC_DM_CashDeliv="1";

    /**
     *实物交割 {@value}
     *@see #SizeOf_TThostFtdcDeliveryModeType
     */
    public static final char THOST_FTDC_DM_CommodityDeliv='2';

    /**
     *实物交割 {@value}
     *@see #SizeOf_TThostFtdcDeliveryModeType
     */
    public static final String STRING_THOST_FTDC_DM_CommodityDeliv="2";

    /**
     *TFtdcDeliveryModeType是一个交割方式类型
     *@see #THOST_FTDC_DM_CashDeliv
     *@see #THOST_FTDC_DM_CommodityDeliv
     */
    public static final int SizeOf_TThostFtdcDeliveryModeType=1;

    /**
     *TFtdcLogLevelType是一个日志级别类型
     */
    public static final int SizeOf_TThostFtdcLogLevelType=33;

    /**
     *TFtdcProcessNameType是一个存储过程名称类型
     */
    public static final int SizeOf_TThostFtdcProcessNameType=257;

    /**
     *TFtdcOperationMemoType是一个操作摘要类型
     */
    public static final int SizeOf_TThostFtdcOperationMemoType=1025;

    /**
     *出入金 {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeType
     */
    public static final char THOST_FTDC_FIOT_FundIO='1';

    /**
     *出入金 {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeType
     */
    public static final String STRING_THOST_FTDC_FIOT_FundIO="1";

    /**
     *银期转帐 {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeType
     */
    public static final char THOST_FTDC_FIOT_Transfer='2';

    /**
     *银期转帐 {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeType
     */
    public static final String STRING_THOST_FTDC_FIOT_Transfer="2";

    /**
     *银期换汇 {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeType
     */
    public static final char THOST_FTDC_FIOT_SwapCurrency='3';

    /**
     *银期换汇 {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeType
     */
    public static final String STRING_THOST_FTDC_FIOT_SwapCurrency="3";

    /**
     *TFtdcFundIOTypeType是一个出入金类型类型
     *@see #THOST_FTDC_FIOT_FundIO
     *@see #THOST_FTDC_FIOT_Transfer
     *@see #THOST_FTDC_FIOT_SwapCurrency
     */
    public static final int SizeOf_TThostFtdcFundIOTypeType=1;

    /**
     *银行存款 {@value}
     *@see #SizeOf_TThostFtdcFundTypeType
     */
    public static final char THOST_FTDC_FT_Deposite='1';

    /**
     *银行存款 {@value}
     *@see #SizeOf_TThostFtdcFundTypeType
     */
    public static final String STRING_THOST_FTDC_FT_Deposite="1";

    /**
     *分项资金 {@value}
     *@see #SizeOf_TThostFtdcFundTypeType
     */
    public static final char THOST_FTDC_FT_ItemFund='2';

    /**
     *分项资金 {@value}
     *@see #SizeOf_TThostFtdcFundTypeType
     */
    public static final String STRING_THOST_FTDC_FT_ItemFund="2";

    /**
     *公司调整 {@value}
     *@see #SizeOf_TThostFtdcFundTypeType
     */
    public static final char THOST_FTDC_FT_Company='3';

    /**
     *公司调整 {@value}
     *@see #SizeOf_TThostFtdcFundTypeType
     */
    public static final String STRING_THOST_FTDC_FT_Company="3";

    /**
     *资金内转 {@value}
     *@see #SizeOf_TThostFtdcFundTypeType
     */
    public static final char THOST_FTDC_FT_InnerTransfer='4';

    /**
     *资金内转 {@value}
     *@see #SizeOf_TThostFtdcFundTypeType
     */
    public static final String STRING_THOST_FTDC_FT_InnerTransfer="4";

    /**
     *TFtdcFundTypeType是一个资金类型类型
     *@see #THOST_FTDC_FT_Deposite
     *@see #THOST_FTDC_FT_ItemFund
     *@see #THOST_FTDC_FT_Company
     *@see #THOST_FTDC_FT_InnerTransfer
     */
    public static final int SizeOf_TThostFtdcFundTypeType=1;

    /**
     *入金 {@value}
     *@see #SizeOf_TThostFtdcFundDirectionType
     */
    public static final char THOST_FTDC_FD_In='1';

    /**
     *入金 {@value}
     *@see #SizeOf_TThostFtdcFundDirectionType
     */
    public static final String STRING_THOST_FTDC_FD_In="1";

    /**
     *出金 {@value}
     *@see #SizeOf_TThostFtdcFundDirectionType
     */
    public static final char THOST_FTDC_FD_Out='2';

    /**
     *出金 {@value}
     *@see #SizeOf_TThostFtdcFundDirectionType
     */
    public static final String STRING_THOST_FTDC_FD_Out="2";

    /**
     *TFtdcFundDirectionType是一个出入金方向类型
     *@see #THOST_FTDC_FD_In
     *@see #THOST_FTDC_FD_Out
     */
    public static final int SizeOf_TThostFtdcFundDirectionType=1;

    /**
     *已录入 {@value}
     *@see #SizeOf_TThostFtdcFundStatusType
     */
    public static final char THOST_FTDC_FS_Record='1';

    /**
     *已录入 {@value}
     *@see #SizeOf_TThostFtdcFundStatusType
     */
    public static final String STRING_THOST_FTDC_FS_Record="1";

    /**
     *已复核 {@value}
     *@see #SizeOf_TThostFtdcFundStatusType
     */
    public static final char THOST_FTDC_FS_Check='2';

    /**
     *已复核 {@value}
     *@see #SizeOf_TThostFtdcFundStatusType
     */
    public static final String STRING_THOST_FTDC_FS_Check="2";

    /**
     *已冲销 {@value}
     *@see #SizeOf_TThostFtdcFundStatusType
     */
    public static final char THOST_FTDC_FS_Charge='3';

    /**
     *已冲销 {@value}
     *@see #SizeOf_TThostFtdcFundStatusType
     */
    public static final String STRING_THOST_FTDC_FS_Charge="3";

    /**
     *TFtdcFundStatusType是一个资金状态类型
     *@see #THOST_FTDC_FS_Record
     *@see #THOST_FTDC_FS_Check
     *@see #THOST_FTDC_FS_Charge
     */
    public static final int SizeOf_TThostFtdcFundStatusType=1;

    /**
     *TFtdcBillNoType是一个票据号类型
     */
    public static final int SizeOf_TThostFtdcBillNoType=15;

    /**
     *TFtdcBillNameType是一个票据名称类型
     */
    public static final int SizeOf_TThostFtdcBillNameType=33;

    /**
     *未发布 {@value}
     *@see #SizeOf_TThostFtdcPublishStatusType
     */
    public static final char THOST_FTDC_PS_None='1';

    /**
     *未发布 {@value}
     *@see #SizeOf_TThostFtdcPublishStatusType
     */
    public static final String STRING_THOST_FTDC_PS_None="1";

    /**
     *正在发布 {@value}
     *@see #SizeOf_TThostFtdcPublishStatusType
     */
    public static final char THOST_FTDC_PS_Publishing='2';

    /**
     *正在发布 {@value}
     *@see #SizeOf_TThostFtdcPublishStatusType
     */
    public static final String STRING_THOST_FTDC_PS_Publishing="2";

    /**
     *已发布 {@value}
     *@see #SizeOf_TThostFtdcPublishStatusType
     */
    public static final char THOST_FTDC_PS_Published='3';

    /**
     *已发布 {@value}
     *@see #SizeOf_TThostFtdcPublishStatusType
     */
    public static final String STRING_THOST_FTDC_PS_Published="3";

    /**
     *TFtdcPublishStatusType是一个发布状态类型
     *@see #THOST_FTDC_PS_None
     *@see #THOST_FTDC_PS_Publishing
     *@see #THOST_FTDC_PS_Published
     */
    public static final int SizeOf_TThostFtdcPublishStatusType=1;

    /**
     *TFtdcEnumValueIDType是一个枚举值代码类型
     */
    public static final int SizeOf_TThostFtdcEnumValueIDType=65;

    /**
     *TFtdcEnumValueTypeType是一个枚举值类型类型
     */
    public static final int SizeOf_TThostFtdcEnumValueTypeType=33;

    /**
     *TFtdcEnumValueLabelType是一个枚举值名称类型
     */
    public static final int SizeOf_TThostFtdcEnumValueLabelType=65;

    /**
     *TFtdcEnumValueResultType是一个枚举值结果类型
     */
    public static final int SizeOf_TThostFtdcEnumValueResultType=33;

    /**
     *不活跃 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final char THOST_FTDC_ES_NonActive='1';

    /**
     *不活跃 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final String STRING_THOST_FTDC_ES_NonActive="1";

    /**
     *启动 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final char THOST_FTDC_ES_Startup='2';

    /**
     *启动 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final String STRING_THOST_FTDC_ES_Startup="2";

    /**
     *交易开始初始化 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final char THOST_FTDC_ES_Initialize='3';

    /**
     *交易开始初始化 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final String STRING_THOST_FTDC_ES_Initialize="3";

    /**
     *交易完成初始化 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final char THOST_FTDC_ES_Initialized='4';

    /**
     *交易完成初始化 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final String STRING_THOST_FTDC_ES_Initialized="4";

    /**
     *收市开始 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final char THOST_FTDC_ES_Close='5';

    /**
     *收市开始 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final String STRING_THOST_FTDC_ES_Close="5";

    /**
     *收市完成 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final char THOST_FTDC_ES_Closed='6';

    /**
     *收市完成 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final String STRING_THOST_FTDC_ES_Closed="6";

    /**
     *结算 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final char THOST_FTDC_ES_Settlement='7';

    /**
     *结算 {@value}
     *@see #SizeOf_TThostFtdcSystemStatusType
     */
    public static final String STRING_THOST_FTDC_ES_Settlement="7";

    /**
     *TFtdcSystemStatusType是一个系统状态类型
     *@see #THOST_FTDC_ES_NonActive
     *@see #THOST_FTDC_ES_Startup
     *@see #THOST_FTDC_ES_Initialize
     *@see #THOST_FTDC_ES_Initialized
     *@see #THOST_FTDC_ES_Close
     *@see #THOST_FTDC_ES_Closed
     *@see #THOST_FTDC_ES_Settlement
     */
    public static final int SizeOf_TThostFtdcSystemStatusType=1;

    /**
     *初始 {@value}
     *@see #SizeOf_TThostFtdcSettlementStatusType
     */
    public static final char THOST_FTDC_STS_Initialize='0';

    /**
     *初始 {@value}
     *@see #SizeOf_TThostFtdcSettlementStatusType
     */
    public static final String STRING_THOST_FTDC_STS_Initialize="0";

    /**
     *结算中 {@value}
     *@see #SizeOf_TThostFtdcSettlementStatusType
     */
    public static final char THOST_FTDC_STS_Settlementing='1';

    /**
     *结算中 {@value}
     *@see #SizeOf_TThostFtdcSettlementStatusType
     */
    public static final String STRING_THOST_FTDC_STS_Settlementing="1";

    /**
     *已结算 {@value}
     *@see #SizeOf_TThostFtdcSettlementStatusType
     */
    public static final char THOST_FTDC_STS_Settlemented='2';

    /**
     *已结算 {@value}
     *@see #SizeOf_TThostFtdcSettlementStatusType
     */
    public static final String STRING_THOST_FTDC_STS_Settlemented="2";

    /**
     *结算完成 {@value}
     *@see #SizeOf_TThostFtdcSettlementStatusType
     */
    public static final char THOST_FTDC_STS_Finished='3';

    /**
     *结算完成 {@value}
     *@see #SizeOf_TThostFtdcSettlementStatusType
     */
    public static final String STRING_THOST_FTDC_STS_Finished="3";

    /**
     *TFtdcSettlementStatusType是一个结算状态类型
     *@see #THOST_FTDC_STS_Initialize
     *@see #THOST_FTDC_STS_Settlementing
     *@see #THOST_FTDC_STS_Settlemented
     *@see #THOST_FTDC_STS_Finished
     */
    public static final int SizeOf_TThostFtdcSettlementStatusType=1;

    /**
     *TFtdcRangeIntTypeType是一个限定值类型类型
     */
    public static final int SizeOf_TThostFtdcRangeIntTypeType=33;

    /**
     *TFtdcRangeIntFromType是一个限定值下限类型
     */
    public static final int SizeOf_TThostFtdcRangeIntFromType=33;

    /**
     *TFtdcRangeIntToType是一个限定值上限类型
     */
    public static final int SizeOf_TThostFtdcRangeIntToType=33;

    /**
     *TFtdcFunctionIDType是一个功能代码类型
     */
    public static final int SizeOf_TThostFtdcFunctionIDType=25;

    /**
     *TFtdcFunctionValueCodeType是一个功能编码类型
     */
    public static final int SizeOf_TThostFtdcFunctionValueCodeType=257;

    /**
     *TFtdcFunctionNameType是一个功能名称类型
     */
    public static final int SizeOf_TThostFtdcFunctionNameType=65;

    /**
     *TFtdcRoleIDType是一个角色编号类型
     */
    public static final int SizeOf_TThostFtdcRoleIDType=11;

    /**
     *TFtdcRoleNameType是一个角色名称类型
     */
    public static final int SizeOf_TThostFtdcRoleNameType=41;

    /**
     *TFtdcDescriptionType是一个描述类型
     */
    public static final int SizeOf_TThostFtdcDescriptionType=401;

    /**
     *TFtdcCombineIDType是一个组合编号类型
     */
    public static final int SizeOf_TThostFtdcCombineIDType=25;

    /**
     *TFtdcCombineTypeType是一个组合类型类型
     */
    public static final int SizeOf_TThostFtdcCombineTypeType=25;

    /**
     *自然人 {@value}
     *@see #SizeOf_TThostFtdcInvestorTypeType
     */
    public static final char THOST_FTDC_CT_Person='0';

    /**
     *自然人 {@value}
     *@see #SizeOf_TThostFtdcInvestorTypeType
     */
    public static final String STRING_THOST_FTDC_CT_Person="0";

    /**
     *法人 {@value}
     *@see #SizeOf_TThostFtdcInvestorTypeType
     */
    public static final char THOST_FTDC_CT_Company='1';

    /**
     *法人 {@value}
     *@see #SizeOf_TThostFtdcInvestorTypeType
     */
    public static final String STRING_THOST_FTDC_CT_Company="1";

    /**
     *投资基金 {@value}
     *@see #SizeOf_TThostFtdcInvestorTypeType
     */
    public static final char THOST_FTDC_CT_Fund='2';

    /**
     *投资基金 {@value}
     *@see #SizeOf_TThostFtdcInvestorTypeType
     */
    public static final String STRING_THOST_FTDC_CT_Fund="2";

    /**
     *特殊法人 {@value}
     *@see #SizeOf_TThostFtdcInvestorTypeType
     */
    public static final char THOST_FTDC_CT_SpecialOrgan='3';

    /**
     *特殊法人 {@value}
     *@see #SizeOf_TThostFtdcInvestorTypeType
     */
    public static final String STRING_THOST_FTDC_CT_SpecialOrgan="3";

    /**
     *资管户 {@value}
     *@see #SizeOf_TThostFtdcInvestorTypeType
     */
    public static final char THOST_FTDC_CT_Asset='4';

    /**
     *资管户 {@value}
     *@see #SizeOf_TThostFtdcInvestorTypeType
     */
    public static final String STRING_THOST_FTDC_CT_Asset="4";

    /**
     *TFtdcInvestorTypeType是一个投资者类型类型
     *@see #THOST_FTDC_CT_Person
     *@see #THOST_FTDC_CT_Company
     *@see #THOST_FTDC_CT_Fund
     *@see #THOST_FTDC_CT_SpecialOrgan
     *@see #THOST_FTDC_CT_Asset
     */
    public static final int SizeOf_TThostFtdcInvestorTypeType=1;

    /**
     *交易会员 {@value}
     *@see #SizeOf_TThostFtdcBrokerTypeType
     */
    public static final char THOST_FTDC_BT_Trade='0';

    /**
     *交易会员 {@value}
     *@see #SizeOf_TThostFtdcBrokerTypeType
     */
    public static final String STRING_THOST_FTDC_BT_Trade="0";

    /**
     *交易结算会员 {@value}
     *@see #SizeOf_TThostFtdcBrokerTypeType
     */
    public static final char THOST_FTDC_BT_TradeSettle='1';

    /**
     *交易结算会员 {@value}
     *@see #SizeOf_TThostFtdcBrokerTypeType
     */
    public static final String STRING_THOST_FTDC_BT_TradeSettle="1";

    /**
     *TFtdcBrokerTypeType是一个经纪公司类型类型
     *@see #THOST_FTDC_BT_Trade
     *@see #THOST_FTDC_BT_TradeSettle
     */
    public static final int SizeOf_TThostFtdcBrokerTypeType=1;

    /**
     *低风险客户 {@value}
     *@see #SizeOf_TThostFtdcRiskLevelType
     */
    public static final char THOST_FTDC_FAS_Low='1';

    /**
     *低风险客户 {@value}
     *@see #SizeOf_TThostFtdcRiskLevelType
     */
    public static final String STRING_THOST_FTDC_FAS_Low="1";

    /**
     *普通客户 {@value}
     *@see #SizeOf_TThostFtdcRiskLevelType
     */
    public static final char THOST_FTDC_FAS_Normal='2';

    /**
     *普通客户 {@value}
     *@see #SizeOf_TThostFtdcRiskLevelType
     */
    public static final String STRING_THOST_FTDC_FAS_Normal="2";

    /**
     *关注客户 {@value}
     *@see #SizeOf_TThostFtdcRiskLevelType
     */
    public static final char THOST_FTDC_FAS_Focus='3';

    /**
     *关注客户 {@value}
     *@see #SizeOf_TThostFtdcRiskLevelType
     */
    public static final String STRING_THOST_FTDC_FAS_Focus="3";

    /**
     *风险客户 {@value}
     *@see #SizeOf_TThostFtdcRiskLevelType
     */
    public static final char THOST_FTDC_FAS_Risk='4';

    /**
     *风险客户 {@value}
     *@see #SizeOf_TThostFtdcRiskLevelType
     */
    public static final String STRING_THOST_FTDC_FAS_Risk="4";

    /**
     *TFtdcRiskLevelType是一个风险等级类型
     *@see #THOST_FTDC_FAS_Low
     *@see #THOST_FTDC_FAS_Normal
     *@see #THOST_FTDC_FAS_Focus
     *@see #THOST_FTDC_FAS_Risk
     */
    public static final int SizeOf_TThostFtdcRiskLevelType=1;

    /**
     *按交易收取 {@value}
     *@see #SizeOf_TThostFtdcFeeAcceptStyleType
     */
    public static final char THOST_FTDC_FAS_ByTrade='1';

    /**
     *按交易收取 {@value}
     *@see #SizeOf_TThostFtdcFeeAcceptStyleType
     */
    public static final String STRING_THOST_FTDC_FAS_ByTrade="1";

    /**
     *按交割收取 {@value}
     *@see #SizeOf_TThostFtdcFeeAcceptStyleType
     */
    public static final char THOST_FTDC_FAS_ByDeliv='2';

    /**
     *按交割收取 {@value}
     *@see #SizeOf_TThostFtdcFeeAcceptStyleType
     */
    public static final String STRING_THOST_FTDC_FAS_ByDeliv="2";

    /**
     *不收 {@value}
     *@see #SizeOf_TThostFtdcFeeAcceptStyleType
     */
    public static final char THOST_FTDC_FAS_None='3';

    /**
     *不收 {@value}
     *@see #SizeOf_TThostFtdcFeeAcceptStyleType
     */
    public static final String STRING_THOST_FTDC_FAS_None="3";

    /**
     *按指定手续费收取 {@value}
     *@see #SizeOf_TThostFtdcFeeAcceptStyleType
     */
    public static final char THOST_FTDC_FAS_FixFee='4';

    /**
     *按指定手续费收取 {@value}
     *@see #SizeOf_TThostFtdcFeeAcceptStyleType
     */
    public static final String STRING_THOST_FTDC_FAS_FixFee="4";

    /**
     *TFtdcFeeAcceptStyleType是一个手续费收取方式类型
     *@see #THOST_FTDC_FAS_ByTrade
     *@see #THOST_FTDC_FAS_ByDeliv
     *@see #THOST_FTDC_FAS_None
     *@see #THOST_FTDC_FAS_FixFee
     */
    public static final int SizeOf_TThostFtdcFeeAcceptStyleType=1;

    /**
     *交易密码 {@value}
     *@see #SizeOf_TThostFtdcPasswordTypeType
     */
    public static final char THOST_FTDC_PWDT_Trade='1';

    /**
     *交易密码 {@value}
     *@see #SizeOf_TThostFtdcPasswordTypeType
     */
    public static final String STRING_THOST_FTDC_PWDT_Trade="1";

    /**
     *资金密码 {@value}
     *@see #SizeOf_TThostFtdcPasswordTypeType
     */
    public static final char THOST_FTDC_PWDT_Account='2';

    /**
     *资金密码 {@value}
     *@see #SizeOf_TThostFtdcPasswordTypeType
     */
    public static final String STRING_THOST_FTDC_PWDT_Account="2";

    /**
     *TFtdcPasswordTypeType是一个密码类型类型
     *@see #THOST_FTDC_PWDT_Trade
     *@see #THOST_FTDC_PWDT_Account
     */
    public static final int SizeOf_TThostFtdcPasswordTypeType=1;

    /**
     *浮盈浮亏都计算 {@value}
     *@see #SizeOf_TThostFtdcAlgorithmType
     */
    public static final char THOST_FTDC_AG_All='1';

    /**
     *浮盈浮亏都计算 {@value}
     *@see #SizeOf_TThostFtdcAlgorithmType
     */
    public static final String STRING_THOST_FTDC_AG_All="1";

    /**
     *浮盈不计，浮亏计 {@value}
     *@see #SizeOf_TThostFtdcAlgorithmType
     */
    public static final char THOST_FTDC_AG_OnlyLost='2';

    /**
     *浮盈不计，浮亏计 {@value}
     *@see #SizeOf_TThostFtdcAlgorithmType
     */
    public static final String STRING_THOST_FTDC_AG_OnlyLost="2";

    /**
     *浮盈计，浮亏不计 {@value}
     *@see #SizeOf_TThostFtdcAlgorithmType
     */
    public static final char THOST_FTDC_AG_OnlyGain='3';

    /**
     *浮盈计，浮亏不计 {@value}
     *@see #SizeOf_TThostFtdcAlgorithmType
     */
    public static final String STRING_THOST_FTDC_AG_OnlyGain="3";

    /**
     *浮盈浮亏都不计算 {@value}
     *@see #SizeOf_TThostFtdcAlgorithmType
     */
    public static final char THOST_FTDC_AG_None='4';

    /**
     *浮盈浮亏都不计算 {@value}
     *@see #SizeOf_TThostFtdcAlgorithmType
     */
    public static final String STRING_THOST_FTDC_AG_None="4";

    /**
     *TFtdcAlgorithmType是一个盈亏算法类型
     *@see #THOST_FTDC_AG_All
     *@see #THOST_FTDC_AG_OnlyLost
     *@see #THOST_FTDC_AG_OnlyGain
     *@see #THOST_FTDC_AG_None
     */
    public static final int SizeOf_TThostFtdcAlgorithmType=1;

    /**
     *包含平仓盈利 {@value}
     *@see #SizeOf_TThostFtdcIncludeCloseProfitType
     */
    public static final char THOST_FTDC_ICP_Include='0';

    /**
     *包含平仓盈利 {@value}
     *@see #SizeOf_TThostFtdcIncludeCloseProfitType
     */
    public static final String STRING_THOST_FTDC_ICP_Include="0";

    /**
     *不包含平仓盈利 {@value}
     *@see #SizeOf_TThostFtdcIncludeCloseProfitType
     */
    public static final char THOST_FTDC_ICP_NotInclude='2';

    /**
     *不包含平仓盈利 {@value}
     *@see #SizeOf_TThostFtdcIncludeCloseProfitType
     */
    public static final String STRING_THOST_FTDC_ICP_NotInclude="2";

    /**
     *TFtdcIncludeCloseProfitType是一个是否包含平仓盈利类型
     *@see #THOST_FTDC_ICP_Include
     *@see #THOST_FTDC_ICP_NotInclude
     */
    public static final int SizeOf_TThostFtdcIncludeCloseProfitType=1;

    /**
     *无仓无成交不受可提比例限制 {@value}
     *@see #SizeOf_TThostFtdcAllWithoutTradeType
     */
    public static final char THOST_FTDC_AWT_Enable='0';

    /**
     *无仓无成交不受可提比例限制 {@value}
     *@see #SizeOf_TThostFtdcAllWithoutTradeType
     */
    public static final String STRING_THOST_FTDC_AWT_Enable="0";

    /**
     *受可提比例限制 {@value}
     *@see #SizeOf_TThostFtdcAllWithoutTradeType
     */
    public static final char THOST_FTDC_AWT_Disable='2';

    /**
     *受可提比例限制 {@value}
     *@see #SizeOf_TThostFtdcAllWithoutTradeType
     */
    public static final String STRING_THOST_FTDC_AWT_Disable="2";

    /**
     *无仓不受可提比例限制 {@value}
     *@see #SizeOf_TThostFtdcAllWithoutTradeType
     */
    public static final char THOST_FTDC_AWT_NoHoldEnable='3';

    /**
     *无仓不受可提比例限制 {@value}
     *@see #SizeOf_TThostFtdcAllWithoutTradeType
     */
    public static final String STRING_THOST_FTDC_AWT_NoHoldEnable="3";

    /**
     *TFtdcAllWithoutTradeType是一个是否受可提比例限制类型
     *@see #THOST_FTDC_AWT_Enable
     *@see #THOST_FTDC_AWT_Disable
     *@see #THOST_FTDC_AWT_NoHoldEnable
     */
    public static final int SizeOf_TThostFtdcAllWithoutTradeType=1;

    /**
     *TFtdcCommentType是一个盈亏算法说明类型
     */
    public static final int SizeOf_TThostFtdcCommentType=31;

    /**
     *TFtdcVersionType是一个版本号类型
     */
    public static final int SizeOf_TThostFtdcVersionType=4;

    /**
     *TFtdcTradeCodeType是一个交易代码类型
     */
    public static final int SizeOf_TThostFtdcTradeCodeType=7;

    /**
     *TFtdcTradeDateType是一个交易日期类型
     */
    public static final int SizeOf_TThostFtdcTradeDateType=9;

    /**
     *TFtdcTradeTimeType是一个交易时间类型
     */
    public static final int SizeOf_TThostFtdcTradeTimeType=9;

    /**
     *TFtdcTradeSerialType是一个发起方流水号类型
     */
    public static final int SizeOf_TThostFtdcTradeSerialType=9;

    /**
     *TFtdcTradeSerialNoType是一个发起方流水号类型
     */
    public static final int SizeOf_TThostFtdcTradeSerialNoType=4;

    /**
     *TFtdcFutureIDType是一个期货公司代码类型
     */
    public static final int SizeOf_TThostFtdcFutureIDType=11;

    /**
     *TFtdcBankIDType是一个银行代码类型
     */
    public static final int SizeOf_TThostFtdcBankIDType=4;

    /**
     *TFtdcBankBrchIDType是一个银行分中心代码类型
     */
    public static final int SizeOf_TThostFtdcBankBrchIDType=5;

    /**
     *TFtdcBankBranchIDType是一个分中心代码类型
     */
    public static final int SizeOf_TThostFtdcBankBranchIDType=11;

    /**
     *TFtdcOperNoType是一个交易柜员类型
     */
    public static final int SizeOf_TThostFtdcOperNoType=17;

    /**
     *TFtdcDeviceIDType是一个渠道标志类型
     */
    public static final int SizeOf_TThostFtdcDeviceIDType=3;

    /**
     *TFtdcRecordNumType是一个记录数类型
     */
    public static final int SizeOf_TThostFtdcRecordNumType=7;

    /**
     *TFtdcFutureAccountType是一个期货资金账号类型
     */
    public static final int SizeOf_TThostFtdcFutureAccountType=22;

    /**
     *不核对 {@value}
     *@see #SizeOf_TThostFtdcFuturePwdFlagType
     */
    public static final char THOST_FTDC_FPWD_UnCheck='0';

    /**
     *不核对 {@value}
     *@see #SizeOf_TThostFtdcFuturePwdFlagType
     */
    public static final String STRING_THOST_FTDC_FPWD_UnCheck="0";

    /**
     *核对 {@value}
     *@see #SizeOf_TThostFtdcFuturePwdFlagType
     */
    public static final char THOST_FTDC_FPWD_Check='1';

    /**
     *核对 {@value}
     *@see #SizeOf_TThostFtdcFuturePwdFlagType
     */
    public static final String STRING_THOST_FTDC_FPWD_Check="1";

    /**
     *TFtdcFuturePwdFlagType是一个资金密码核对标志类型
     *@see #THOST_FTDC_FPWD_UnCheck
     *@see #THOST_FTDC_FPWD_Check
     */
    public static final int SizeOf_TThostFtdcFuturePwdFlagType=1;

    /**
     *银行转期货 {@value}
     *@see #SizeOf_TThostFtdcTransferTypeType
     */
    public static final char THOST_FTDC_TT_BankToFuture='0';

    /**
     *银行转期货 {@value}
     *@see #SizeOf_TThostFtdcTransferTypeType
     */
    public static final String STRING_THOST_FTDC_TT_BankToFuture="0";

    /**
     *期货转银行 {@value}
     *@see #SizeOf_TThostFtdcTransferTypeType
     */
    public static final char THOST_FTDC_TT_FutureToBank='1';

    /**
     *期货转银行 {@value}
     *@see #SizeOf_TThostFtdcTransferTypeType
     */
    public static final String STRING_THOST_FTDC_TT_FutureToBank="1";

    /**
     *TFtdcTransferTypeType是一个银期转账类型类型
     *@see #THOST_FTDC_TT_BankToFuture
     *@see #THOST_FTDC_TT_FutureToBank
     */
    public static final int SizeOf_TThostFtdcTransferTypeType=1;

    /**
     *TFtdcFutureAccPwdType是一个期货资金密码类型
     */
    public static final int SizeOf_TThostFtdcFutureAccPwdType=17;

    /**
     *TFtdcCurrencyCodeType是一个币种类型
     */
    public static final int SizeOf_TThostFtdcCurrencyCodeType=4;

    /**
     *TFtdcRetCodeType是一个响应代码类型
     */
    public static final int SizeOf_TThostFtdcRetCodeType=5;

    /**
     *TFtdcRetInfoType是一个响应信息类型
     */
    public static final int SizeOf_TThostFtdcRetInfoType=129;

    /**
     *TFtdcTradeAmtType是一个银行总余额类型
     */
    public static final int SizeOf_TThostFtdcTradeAmtType=20;

    /**
     *TFtdcUseAmtType是一个银行可用余额类型
     */
    public static final int SizeOf_TThostFtdcUseAmtType=20;

    /**
     *TFtdcFetchAmtType是一个银行可取余额类型
     */
    public static final int SizeOf_TThostFtdcFetchAmtType=20;

    /**
     *无效或失败 {@value}
     *@see #SizeOf_TThostFtdcTransferValidFlagType
     */
    public static final char THOST_FTDC_TVF_Invalid='0';

    /**
     *无效或失败 {@value}
     *@see #SizeOf_TThostFtdcTransferValidFlagType
     */
    public static final String STRING_THOST_FTDC_TVF_Invalid="0";

    /**
     *有效 {@value}
     *@see #SizeOf_TThostFtdcTransferValidFlagType
     */
    public static final char THOST_FTDC_TVF_Valid='1';

    /**
     *有效 {@value}
     *@see #SizeOf_TThostFtdcTransferValidFlagType
     */
    public static final String STRING_THOST_FTDC_TVF_Valid="1";

    /**
     *冲正 {@value}
     *@see #SizeOf_TThostFtdcTransferValidFlagType
     */
    public static final char THOST_FTDC_TVF_Reverse='2';

    /**
     *冲正 {@value}
     *@see #SizeOf_TThostFtdcTransferValidFlagType
     */
    public static final String STRING_THOST_FTDC_TVF_Reverse="2";

    /**
     *TFtdcTransferValidFlagType是一个转账有效标志类型
     *@see #THOST_FTDC_TVF_Invalid
     *@see #THOST_FTDC_TVF_Valid
     *@see #THOST_FTDC_TVF_Reverse
     */
    public static final int SizeOf_TThostFtdcTransferValidFlagType=1;

    /**
     *TFtdcCertCodeType是一个证件号码类型
     */
    public static final int SizeOf_TThostFtdcCertCodeType=21;

    /**
     *错单 {@value}
     *@see #SizeOf_TThostFtdcReasonType
     */
    public static final char THOST_FTDC_RN_CD='0';

    /**
     *错单 {@value}
     *@see #SizeOf_TThostFtdcReasonType
     */
    public static final String STRING_THOST_FTDC_RN_CD="0";

    /**
     *资金在途 {@value}
     *@see #SizeOf_TThostFtdcReasonType
     */
    public static final char THOST_FTDC_RN_ZT='1';

    /**
     *资金在途 {@value}
     *@see #SizeOf_TThostFtdcReasonType
     */
    public static final String STRING_THOST_FTDC_RN_ZT="1";

    /**
     *其它 {@value}
     *@see #SizeOf_TThostFtdcReasonType
     */
    public static final char THOST_FTDC_RN_QT='2';

    /**
     *其它 {@value}
     *@see #SizeOf_TThostFtdcReasonType
     */
    public static final String STRING_THOST_FTDC_RN_QT="2";

    /**
     *TFtdcReasonType是一个事由类型
     *@see #THOST_FTDC_RN_CD
     *@see #THOST_FTDC_RN_ZT
     *@see #THOST_FTDC_RN_QT
     */
    public static final int SizeOf_TThostFtdcReasonType=1;

    /**
     *TFtdcFundProjectIDType是一个资金项目编号类型
     */
    public static final int SizeOf_TThostFtdcFundProjectIDType=5;

    /**
     *未知 {@value}
     *@see #SizeOf_TThostFtdcSexType
     */
    public static final char THOST_FTDC_SEX_None='0';

    /**
     *未知 {@value}
     *@see #SizeOf_TThostFtdcSexType
     */
    public static final String STRING_THOST_FTDC_SEX_None="0";

    /**
     *男 {@value}
     *@see #SizeOf_TThostFtdcSexType
     */
    public static final char THOST_FTDC_SEX_Man='1';

    /**
     *男 {@value}
     *@see #SizeOf_TThostFtdcSexType
     */
    public static final String STRING_THOST_FTDC_SEX_Man="1";

    /**
     *女 {@value}
     *@see #SizeOf_TThostFtdcSexType
     */
    public static final char THOST_FTDC_SEX_Woman='2';

    /**
     *女 {@value}
     *@see #SizeOf_TThostFtdcSexType
     */
    public static final String STRING_THOST_FTDC_SEX_Woman="2";

    /**
     *TFtdcSexType是一个性别类型
     *@see #THOST_FTDC_SEX_None
     *@see #THOST_FTDC_SEX_Man
     *@see #THOST_FTDC_SEX_Woman
     */
    public static final int SizeOf_TThostFtdcSexType=1;

    /**
     *TFtdcProfessionType是一个职业类型
     */
    public static final int SizeOf_TThostFtdcProfessionType=101;

    /**
     *TFtdcNationalType是一个国籍类型
     */
    public static final int SizeOf_TThostFtdcNationalType=31;

    /**
     *TFtdcProvinceType是一个省类型
     */
    public static final int SizeOf_TThostFtdcProvinceType=51;

    /**
     *TFtdcRegionType是一个区类型
     */
    public static final int SizeOf_TThostFtdcRegionType=16;

    /**
     *TFtdcCountryType是一个国家类型
     */
    public static final int SizeOf_TThostFtdcCountryType=16;

    /**
     *TFtdcLicenseNOType是一个营业执照类型
     */
    public static final int SizeOf_TThostFtdcLicenseNOType=33;

    /**
     *TFtdcCompanyTypeType是一个企业性质类型
     */
    public static final int SizeOf_TThostFtdcCompanyTypeType=16;

    /**
     *TFtdcBusinessScopeType是一个经营范围类型
     */
    public static final int SizeOf_TThostFtdcBusinessScopeType=1001;

    /**
     *TFtdcCapitalCurrencyType是一个注册资本币种类型
     */
    public static final int SizeOf_TThostFtdcCapitalCurrencyType=4;

    /**
     *投资者 {@value}
     *@see #SizeOf_TThostFtdcUserTypeType
     */
    public static final char THOST_FTDC_UT_Investor='0';

    /**
     *投资者 {@value}
     *@see #SizeOf_TThostFtdcUserTypeType
     */
    public static final String STRING_THOST_FTDC_UT_Investor="0";

    /**
     *操作员 {@value}
     *@see #SizeOf_TThostFtdcUserTypeType
     */
    public static final char THOST_FTDC_UT_Operator='1';

    /**
     *操作员 {@value}
     *@see #SizeOf_TThostFtdcUserTypeType
     */
    public static final String STRING_THOST_FTDC_UT_Operator="1";

    /**
     *管理员 {@value}
     *@see #SizeOf_TThostFtdcUserTypeType
     */
    public static final char THOST_FTDC_UT_SuperUser='2';

    /**
     *管理员 {@value}
     *@see #SizeOf_TThostFtdcUserTypeType
     */
    public static final String STRING_THOST_FTDC_UT_SuperUser="2";

    /**
     *TFtdcUserTypeType是一个用户类型类型
     *@see #THOST_FTDC_UT_Investor
     *@see #THOST_FTDC_UT_Operator
     *@see #THOST_FTDC_UT_SuperUser
     */
    public static final int SizeOf_TThostFtdcUserTypeType=1;

    /**
     *保证金率 {@value}
     *@see #SizeOf_TThostFtdcRateTypeType
     */
    public static final char THOST_FTDC_RATETYPE_MarginRate='2';

    /**
     *保证金率 {@value}
     *@see #SizeOf_TThostFtdcRateTypeType
     */
    public static final String STRING_THOST_FTDC_RATETYPE_MarginRate="2";

    /**
     *TFtdcRateTypeType是一个费率类型类型
     *@see #THOST_FTDC_RATETYPE_MarginRate
     */
    public static final int SizeOf_TThostFtdcRateTypeType=1;

    /**
     *交易结算单 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final char THOST_FTDC_NOTETYPE_TradeSettleBill='1';

    /**
     *交易结算单 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final String STRING_THOST_FTDC_NOTETYPE_TradeSettleBill="1";

    /**
     *交易结算月报 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final char THOST_FTDC_NOTETYPE_TradeSettleMonth='2';

    /**
     *交易结算月报 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final String STRING_THOST_FTDC_NOTETYPE_TradeSettleMonth="2";

    /**
     *追加保证金通知书 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final char THOST_FTDC_NOTETYPE_CallMarginNotes='3';

    /**
     *追加保证金通知书 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final String STRING_THOST_FTDC_NOTETYPE_CallMarginNotes="3";

    /**
     *强行平仓通知书 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final char THOST_FTDC_NOTETYPE_ForceCloseNotes='4';

    /**
     *强行平仓通知书 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final String STRING_THOST_FTDC_NOTETYPE_ForceCloseNotes="4";

    /**
     *成交通知书 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final char THOST_FTDC_NOTETYPE_TradeNotes='5';

    /**
     *成交通知书 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final String STRING_THOST_FTDC_NOTETYPE_TradeNotes="5";

    /**
     *交割通知书 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final char THOST_FTDC_NOTETYPE_DelivNotes='6';

    /**
     *交割通知书 {@value}
     *@see #SizeOf_TThostFtdcNoteTypeType
     */
    public static final String STRING_THOST_FTDC_NOTETYPE_DelivNotes="6";

    /**
     *TFtdcNoteTypeType是一个通知类型类型
     *@see #THOST_FTDC_NOTETYPE_TradeSettleBill
     *@see #THOST_FTDC_NOTETYPE_TradeSettleMonth
     *@see #THOST_FTDC_NOTETYPE_CallMarginNotes
     *@see #THOST_FTDC_NOTETYPE_ForceCloseNotes
     *@see #THOST_FTDC_NOTETYPE_TradeNotes
     *@see #THOST_FTDC_NOTETYPE_DelivNotes
     */
    public static final int SizeOf_TThostFtdcNoteTypeType=1;

    /**
     *逐日盯市 {@value}
     *@see #SizeOf_TThostFtdcSettlementStyleType
     */
    public static final char THOST_FTDC_SBS_Day='1';

    /**
     *逐日盯市 {@value}
     *@see #SizeOf_TThostFtdcSettlementStyleType
     */
    public static final String STRING_THOST_FTDC_SBS_Day="1";

    /**
     *逐笔对冲 {@value}
     *@see #SizeOf_TThostFtdcSettlementStyleType
     */
    public static final char THOST_FTDC_SBS_Volume='2';

    /**
     *逐笔对冲 {@value}
     *@see #SizeOf_TThostFtdcSettlementStyleType
     */
    public static final String STRING_THOST_FTDC_SBS_Volume="2";

    /**
     *TFtdcSettlementStyleType是一个结算单方式类型
     *@see #THOST_FTDC_SBS_Day
     *@see #THOST_FTDC_SBS_Volume
     */
    public static final int SizeOf_TThostFtdcSettlementStyleType=1;

    /**
     *TFtdcBrokerDNSType是一个域名类型
     */
    public static final int SizeOf_TThostFtdcBrokerDNSType=256;

    /**
     *TFtdcSentenceType是一个语句类型
     */
    public static final int SizeOf_TThostFtdcSentenceType=501;

    /**
     *日报 {@value}
     *@see #SizeOf_TThostFtdcSettlementBillTypeType
     */
    public static final char THOST_FTDC_ST_Day='0';

    /**
     *日报 {@value}
     *@see #SizeOf_TThostFtdcSettlementBillTypeType
     */
    public static final String STRING_THOST_FTDC_ST_Day="0";

    /**
     *月报 {@value}
     *@see #SizeOf_TThostFtdcSettlementBillTypeType
     */
    public static final char THOST_FTDC_ST_Month='1';

    /**
     *月报 {@value}
     *@see #SizeOf_TThostFtdcSettlementBillTypeType
     */
    public static final String STRING_THOST_FTDC_ST_Month="1";

    /**
     *TFtdcSettlementBillTypeType是一个结算单类型类型
     *@see #THOST_FTDC_ST_Day
     *@see #THOST_FTDC_ST_Month
     */
    public static final int SizeOf_TThostFtdcSettlementBillTypeType=1;

    /**
     *登录 {@value}
     *@see #SizeOf_TThostFtdcUserRightTypeType
     */
    public static final char THOST_FTDC_URT_Logon='1';

    /**
     *登录 {@value}
     *@see #SizeOf_TThostFtdcUserRightTypeType
     */
    public static final String STRING_THOST_FTDC_URT_Logon="1";

    /**
     *银期转帐 {@value}
     *@see #SizeOf_TThostFtdcUserRightTypeType
     */
    public static final char THOST_FTDC_URT_Transfer='2';

    /**
     *银期转帐 {@value}
     *@see #SizeOf_TThostFtdcUserRightTypeType
     */
    public static final String STRING_THOST_FTDC_URT_Transfer="2";

    /**
     *邮寄结算单 {@value}
     *@see #SizeOf_TThostFtdcUserRightTypeType
     */
    public static final char THOST_FTDC_URT_EMail='3';

    /**
     *邮寄结算单 {@value}
     *@see #SizeOf_TThostFtdcUserRightTypeType
     */
    public static final String STRING_THOST_FTDC_URT_EMail="3";

    /**
     *传真结算单 {@value}
     *@see #SizeOf_TThostFtdcUserRightTypeType
     */
    public static final char THOST_FTDC_URT_Fax='4';

    /**
     *传真结算单 {@value}
     *@see #SizeOf_TThostFtdcUserRightTypeType
     */
    public static final String STRING_THOST_FTDC_URT_Fax="4";

    /**
     *条件单 {@value}
     *@see #SizeOf_TThostFtdcUserRightTypeType
     */
    public static final char THOST_FTDC_URT_ConditionOrder='5';

    /**
     *条件单 {@value}
     *@see #SizeOf_TThostFtdcUserRightTypeType
     */
    public static final String STRING_THOST_FTDC_URT_ConditionOrder="5";

    /**
     *TFtdcUserRightTypeType是一个客户权限类型类型
     *@see #THOST_FTDC_URT_Logon
     *@see #THOST_FTDC_URT_Transfer
     *@see #THOST_FTDC_URT_EMail
     *@see #THOST_FTDC_URT_Fax
     *@see #THOST_FTDC_URT_ConditionOrder
     */
    public static final int SizeOf_TThostFtdcUserRightTypeType=1;

    /**
     *昨结算价 {@value}
     *@see #SizeOf_TThostFtdcMarginPriceTypeType
     */
    public static final char THOST_FTDC_MPT_PreSettlementPrice='1';

    /**
     *昨结算价 {@value}
     *@see #SizeOf_TThostFtdcMarginPriceTypeType
     */
    public static final String STRING_THOST_FTDC_MPT_PreSettlementPrice="1";

    /**
     *最新价 {@value}
     *@see #SizeOf_TThostFtdcMarginPriceTypeType
     */
    public static final char THOST_FTDC_MPT_SettlementPrice='2';

    /**
     *最新价 {@value}
     *@see #SizeOf_TThostFtdcMarginPriceTypeType
     */
    public static final String STRING_THOST_FTDC_MPT_SettlementPrice="2";

    /**
     *成交均价 {@value}
     *@see #SizeOf_TThostFtdcMarginPriceTypeType
     */
    public static final char THOST_FTDC_MPT_AveragePrice='3';

    /**
     *成交均价 {@value}
     *@see #SizeOf_TThostFtdcMarginPriceTypeType
     */
    public static final String STRING_THOST_FTDC_MPT_AveragePrice="3";

    /**
     *开仓价 {@value}
     *@see #SizeOf_TThostFtdcMarginPriceTypeType
     */
    public static final char THOST_FTDC_MPT_OpenPrice='4';

    /**
     *开仓价 {@value}
     *@see #SizeOf_TThostFtdcMarginPriceTypeType
     */
    public static final String STRING_THOST_FTDC_MPT_OpenPrice="4";

    /**
     *TFtdcMarginPriceTypeType是一个保证金价格类型类型
     *@see #THOST_FTDC_MPT_PreSettlementPrice
     *@see #THOST_FTDC_MPT_SettlementPrice
     *@see #THOST_FTDC_MPT_AveragePrice
     *@see #THOST_FTDC_MPT_OpenPrice
     */
    public static final int SizeOf_TThostFtdcMarginPriceTypeType=1;

    /**
     *未生成 {@value}
     *@see #SizeOf_TThostFtdcBillGenStatusType
     */
    public static final char THOST_FTDC_BGS_None='0';

    /**
     *未生成 {@value}
     *@see #SizeOf_TThostFtdcBillGenStatusType
     */
    public static final String STRING_THOST_FTDC_BGS_None="0";

    /**
     *生成中 {@value}
     *@see #SizeOf_TThostFtdcBillGenStatusType
     */
    public static final char THOST_FTDC_BGS_NoGenerated='1';

    /**
     *生成中 {@value}
     *@see #SizeOf_TThostFtdcBillGenStatusType
     */
    public static final String STRING_THOST_FTDC_BGS_NoGenerated="1";

    /**
     *已生成 {@value}
     *@see #SizeOf_TThostFtdcBillGenStatusType
     */
    public static final char THOST_FTDC_BGS_Generated='2';

    /**
     *已生成 {@value}
     *@see #SizeOf_TThostFtdcBillGenStatusType
     */
    public static final String STRING_THOST_FTDC_BGS_Generated="2";

    /**
     *TFtdcBillGenStatusType是一个结算单生成状态类型
     *@see #THOST_FTDC_BGS_None
     *@see #THOST_FTDC_BGS_NoGenerated
     *@see #THOST_FTDC_BGS_Generated
     */
    public static final int SizeOf_TThostFtdcBillGenStatusType=1;

    /**
     *持仓处理算法 {@value}
     *@see #SizeOf_TThostFtdcAlgoTypeType
     */
    public static final char THOST_FTDC_AT_HandlePositionAlgo='1';

    /**
     *持仓处理算法 {@value}
     *@see #SizeOf_TThostFtdcAlgoTypeType
     */
    public static final String STRING_THOST_FTDC_AT_HandlePositionAlgo="1";

    /**
     *寻找保证金率算法 {@value}
     *@see #SizeOf_TThostFtdcAlgoTypeType
     */
    public static final char THOST_FTDC_AT_FindMarginRateAlgo='2';

    /**
     *寻找保证金率算法 {@value}
     *@see #SizeOf_TThostFtdcAlgoTypeType
     */
    public static final String STRING_THOST_FTDC_AT_FindMarginRateAlgo="2";

    /**
     *TFtdcAlgoTypeType是一个算法类型类型
     *@see #THOST_FTDC_AT_HandlePositionAlgo
     *@see #THOST_FTDC_AT_FindMarginRateAlgo
     */
    public static final int SizeOf_TThostFtdcAlgoTypeType=1;

    /**
     *基本 {@value}
     *@see #SizeOf_TThostFtdcHandlePositionAlgoIDType
     */
    public static final char THOST_FTDC_HPA_Base='1';

    /**
     *基本 {@value}
     *@see #SizeOf_TThostFtdcHandlePositionAlgoIDType
     */
    public static final String STRING_THOST_FTDC_HPA_Base="1";

    /**
     *大连商品交易所 {@value}
     *@see #SizeOf_TThostFtdcHandlePositionAlgoIDType
     */
    public static final char THOST_FTDC_HPA_DCE='2';

    /**
     *大连商品交易所 {@value}
     *@see #SizeOf_TThostFtdcHandlePositionAlgoIDType
     */
    public static final String STRING_THOST_FTDC_HPA_DCE="2";

    /**
     *郑州商品交易所 {@value}
     *@see #SizeOf_TThostFtdcHandlePositionAlgoIDType
     */
    public static final char THOST_FTDC_HPA_CZCE='3';

    /**
     *郑州商品交易所 {@value}
     *@see #SizeOf_TThostFtdcHandlePositionAlgoIDType
     */
    public static final String STRING_THOST_FTDC_HPA_CZCE="3";

    /**
     *TFtdcHandlePositionAlgoIDType是一个持仓处理算法编号类型
     *@see #THOST_FTDC_HPA_Base
     *@see #THOST_FTDC_HPA_DCE
     *@see #THOST_FTDC_HPA_CZCE
     */
    public static final int SizeOf_TThostFtdcHandlePositionAlgoIDType=1;

    /**
     *基本 {@value}
     *@see #SizeOf_TThostFtdcFindMarginRateAlgoIDType
     */
    public static final char THOST_FTDC_FMRA_Base='1';

    /**
     *基本 {@value}
     *@see #SizeOf_TThostFtdcFindMarginRateAlgoIDType
     */
    public static final String STRING_THOST_FTDC_FMRA_Base="1";

    /**
     *大连商品交易所 {@value}
     *@see #SizeOf_TThostFtdcFindMarginRateAlgoIDType
     */
    public static final char THOST_FTDC_FMRA_DCE='2';

    /**
     *大连商品交易所 {@value}
     *@see #SizeOf_TThostFtdcFindMarginRateAlgoIDType
     */
    public static final String STRING_THOST_FTDC_FMRA_DCE="2";

    /**
     *郑州商品交易所 {@value}
     *@see #SizeOf_TThostFtdcFindMarginRateAlgoIDType
     */
    public static final char THOST_FTDC_FMRA_CZCE='3';

    /**
     *郑州商品交易所 {@value}
     *@see #SizeOf_TThostFtdcFindMarginRateAlgoIDType
     */
    public static final String STRING_THOST_FTDC_FMRA_CZCE="3";

    /**
     *TFtdcFindMarginRateAlgoIDType是一个寻找保证金率算法编号类型
     *@see #THOST_FTDC_FMRA_Base
     *@see #THOST_FTDC_FMRA_DCE
     *@see #THOST_FTDC_FMRA_CZCE
     */
    public static final int SizeOf_TThostFtdcFindMarginRateAlgoIDType=1;

    /**
     *基本 {@value}
     *@see #SizeOf_TThostFtdcHandleTradingAccountAlgoIDType
     */
    public static final char THOST_FTDC_HTAA_Base='1';

    /**
     *基本 {@value}
     *@see #SizeOf_TThostFtdcHandleTradingAccountAlgoIDType
     */
    public static final String STRING_THOST_FTDC_HTAA_Base="1";

    /**
     *大连商品交易所 {@value}
     *@see #SizeOf_TThostFtdcHandleTradingAccountAlgoIDType
     */
    public static final char THOST_FTDC_HTAA_DCE='2';

    /**
     *大连商品交易所 {@value}
     *@see #SizeOf_TThostFtdcHandleTradingAccountAlgoIDType
     */
    public static final String STRING_THOST_FTDC_HTAA_DCE="2";

    /**
     *郑州商品交易所 {@value}
     *@see #SizeOf_TThostFtdcHandleTradingAccountAlgoIDType
     */
    public static final char THOST_FTDC_HTAA_CZCE='3';

    /**
     *郑州商品交易所 {@value}
     *@see #SizeOf_TThostFtdcHandleTradingAccountAlgoIDType
     */
    public static final String STRING_THOST_FTDC_HTAA_CZCE="3";

    /**
     *TFtdcHandleTradingAccountAlgoIDType是一个资金处理算法编号类型
     *@see #THOST_FTDC_HTAA_Base
     *@see #THOST_FTDC_HTAA_DCE
     *@see #THOST_FTDC_HTAA_CZCE
     */
    public static final int SizeOf_TThostFtdcHandleTradingAccountAlgoIDType=1;

    /**
     *指定下单人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_Order='1';

    /**
     *指定下单人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_Order="1";

    /**
     *开户授权人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_Open='2';

    /**
     *开户授权人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_Open="2";

    /**
     *资金调拨人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_Fund='3';

    /**
     *资金调拨人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_Fund="3";

    /**
     *结算单确认人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_Settlement='4';

    /**
     *结算单确认人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_Settlement="4";

    /**
     *法人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_Company='5';

    /**
     *法人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_Company="5";

    /**
     *法人代表 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_Corporation='6';

    /**
     *法人代表 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_Corporation="6";

    /**
     *投资者联系人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_LinkMan='7';

    /**
     *投资者联系人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_LinkMan="7";

    /**
     *分户管理资产负责人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_Ledger='8';

    /**
     *分户管理资产负责人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_Ledger="8";

    /**
     *托（保）管人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_Trustee='9';

    /**
     *托（保）管人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_Trustee="9";

    /**
     *托（保）管机构法人代表 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_TrusteeCorporation='A';

    /**
     *托（保）管机构法人代表 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_TrusteeCorporation="A";

    /**
     *托（保）管机构开户授权人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_TrusteeOpen='B';

    /**
     *托（保）管机构开户授权人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_TrusteeOpen="B";

    /**
     *托（保）管机构联系人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_TrusteeContact='C';

    /**
     *托（保）管机构联系人 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_TrusteeContact="C";

    /**
     *境外自然人参考证件 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_ForeignerRefer='D';

    /**
     *境外自然人参考证件 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_ForeignerRefer="D";

    /**
     *法人代表参考证件 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final char THOST_FTDC_PST_CorporationRefer='E';

    /**
     *法人代表参考证件 {@value}
     *@see #SizeOf_TThostFtdcPersonTypeType
     */
    public static final String STRING_THOST_FTDC_PST_CorporationRefer="E";

    /**
     *TFtdcPersonTypeType是一个联系人类型类型
     *@see #THOST_FTDC_PST_Order
     *@see #THOST_FTDC_PST_Open
     *@see #THOST_FTDC_PST_Fund
     *@see #THOST_FTDC_PST_Settlement
     *@see #THOST_FTDC_PST_Company
     *@see #THOST_FTDC_PST_Corporation
     *@see #THOST_FTDC_PST_LinkMan
     *@see #THOST_FTDC_PST_Ledger
     *@see #THOST_FTDC_PST_Trustee
     *@see #THOST_FTDC_PST_TrusteeCorporation
     *@see #THOST_FTDC_PST_TrusteeOpen
     *@see #THOST_FTDC_PST_TrusteeContact
     *@see #THOST_FTDC_PST_ForeignerRefer
     *@see #THOST_FTDC_PST_CorporationRefer
     */
    public static final int SizeOf_TThostFtdcPersonTypeType=1;

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcQueryInvestorRangeType
     */
    public static final char THOST_FTDC_QIR_All='1';

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcQueryInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_QIR_All="1";

    /**
     *查询分类 {@value}
     *@see #SizeOf_TThostFtdcQueryInvestorRangeType
     */
    public static final char THOST_FTDC_QIR_Group='2';

    /**
     *查询分类 {@value}
     *@see #SizeOf_TThostFtdcQueryInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_QIR_Group="2";

    /**
     *单一投资者 {@value}
     *@see #SizeOf_TThostFtdcQueryInvestorRangeType
     */
    public static final char THOST_FTDC_QIR_Single='3';

    /**
     *单一投资者 {@value}
     *@see #SizeOf_TThostFtdcQueryInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_QIR_Single="3";

    /**
     *TFtdcQueryInvestorRangeType是一个查询范围类型
     *@see #THOST_FTDC_QIR_All
     *@see #THOST_FTDC_QIR_Group
     *@see #THOST_FTDC_QIR_Single
     */
    public static final int SizeOf_TThostFtdcQueryInvestorRangeType=1;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcInvestorRiskStatusType
     */
    public static final char THOST_FTDC_IRS_Normal='1';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcInvestorRiskStatusType
     */
    public static final String STRING_THOST_FTDC_IRS_Normal="1";

    /**
     *警告 {@value}
     *@see #SizeOf_TThostFtdcInvestorRiskStatusType
     */
    public static final char THOST_FTDC_IRS_Warn='2';

    /**
     *警告 {@value}
     *@see #SizeOf_TThostFtdcInvestorRiskStatusType
     */
    public static final String STRING_THOST_FTDC_IRS_Warn="2";

    /**
     *追保 {@value}
     *@see #SizeOf_TThostFtdcInvestorRiskStatusType
     */
    public static final char THOST_FTDC_IRS_Call='3';

    /**
     *追保 {@value}
     *@see #SizeOf_TThostFtdcInvestorRiskStatusType
     */
    public static final String STRING_THOST_FTDC_IRS_Call="3";

    /**
     *强平 {@value}
     *@see #SizeOf_TThostFtdcInvestorRiskStatusType
     */
    public static final char THOST_FTDC_IRS_Force='4';

    /**
     *强平 {@value}
     *@see #SizeOf_TThostFtdcInvestorRiskStatusType
     */
    public static final String STRING_THOST_FTDC_IRS_Force="4";

    /**
     *异常 {@value}
     *@see #SizeOf_TThostFtdcInvestorRiskStatusType
     */
    public static final char THOST_FTDC_IRS_Exception='5';

    /**
     *异常 {@value}
     *@see #SizeOf_TThostFtdcInvestorRiskStatusType
     */
    public static final String STRING_THOST_FTDC_IRS_Exception="5";

    /**
     *TFtdcInvestorRiskStatusType是一个投资者风险状态类型
     *@see #THOST_FTDC_IRS_Normal
     *@see #THOST_FTDC_IRS_Warn
     *@see #THOST_FTDC_IRS_Call
     *@see #THOST_FTDC_IRS_Force
     *@see #THOST_FTDC_IRS_Exception
     */
    public static final int SizeOf_TThostFtdcInvestorRiskStatusType=1;

    /**
     *TFtdcLegIDType是一个单腿编号类型
     */
    public static final int SizeOf_TThostFtdcLegIDType=4;

    /**
     *TFtdcLegMultipleType是一个单腿乘数类型
     */
    public static final int SizeOf_TThostFtdcLegMultipleType=4;

    /**
     *TFtdcImplyLevelType是一个派生层数类型
     */
    public static final int SizeOf_TThostFtdcImplyLevelType=4;

    /**
     *TFtdcClearAccountType是一个结算账户类型
     */
    public static final int SizeOf_TThostFtdcClearAccountType=33;

    /**
     *TFtdcOrganNOType是一个结算账户类型
     */
    public static final int SizeOf_TThostFtdcOrganNOType=6;

    /**
     *TFtdcClearbarchIDType是一个结算账户联行号类型
     */
    public static final int SizeOf_TThostFtdcClearbarchIDType=6;

    /**
     *登录 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final char THOST_FTDC_UET_Login='1';

    /**
     *登录 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_UET_Login="1";

    /**
     *登出 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final char THOST_FTDC_UET_Logout='2';

    /**
     *登出 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_UET_Logout="2";

    /**
     *交易成功 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final char THOST_FTDC_UET_Trading='3';

    /**
     *交易成功 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_UET_Trading="3";

    /**
     *交易失败 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final char THOST_FTDC_UET_TradingError='4';

    /**
     *交易失败 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_UET_TradingError="4";

    /**
     *修改密码 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final char THOST_FTDC_UET_UpdatePassword='5';

    /**
     *修改密码 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_UET_UpdatePassword="5";

    /**
     *客户端认证 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final char THOST_FTDC_UET_Authenticate='6';

    /**
     *客户端认证 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_UET_Authenticate="6";

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final char THOST_FTDC_UET_Other='9';

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_UET_Other="9";

    /**
     *TFtdcUserEventTypeType是一个用户事件类型类型
     *@see #THOST_FTDC_UET_Login
     *@see #THOST_FTDC_UET_Logout
     *@see #THOST_FTDC_UET_Trading
     *@see #THOST_FTDC_UET_TradingError
     *@see #THOST_FTDC_UET_UpdatePassword
     *@see #THOST_FTDC_UET_Authenticate
     *@see #THOST_FTDC_UET_Other
     */
    public static final int SizeOf_TThostFtdcUserEventTypeType=1;

    /**
     *TFtdcUserEventInfoType是一个用户事件信息类型
     */
    public static final int SizeOf_TThostFtdcUserEventInfoType=1025;

    /**
     *先开先平 {@value}
     *@see #SizeOf_TThostFtdcCloseStyleType
     */
    public static final char THOST_FTDC_ICS_Close='0';

    /**
     *先开先平 {@value}
     *@see #SizeOf_TThostFtdcCloseStyleType
     */
    public static final String STRING_THOST_FTDC_ICS_Close="0";

    /**
     *先平今再平昨 {@value}
     *@see #SizeOf_TThostFtdcCloseStyleType
     */
    public static final char THOST_FTDC_ICS_CloseToday='1';

    /**
     *先平今再平昨 {@value}
     *@see #SizeOf_TThostFtdcCloseStyleType
     */
    public static final String STRING_THOST_FTDC_ICS_CloseToday="1";

    /**
     *TFtdcCloseStyleType是一个平仓方式类型
     *@see #THOST_FTDC_ICS_Close
     *@see #THOST_FTDC_ICS_CloseToday
     */
    public static final int SizeOf_TThostFtdcCloseStyleType=1;

    /**
     *---- {@value}
     *@see #SizeOf_TThostFtdcStatModeType
     */
    public static final char THOST_FTDC_SM_Non='0';

    /**
     *---- {@value}
     *@see #SizeOf_TThostFtdcStatModeType
     */
    public static final String STRING_THOST_FTDC_SM_Non="0";

    /**
     *按合约统计 {@value}
     *@see #SizeOf_TThostFtdcStatModeType
     */
    public static final char THOST_FTDC_SM_Instrument='1';

    /**
     *按合约统计 {@value}
     *@see #SizeOf_TThostFtdcStatModeType
     */
    public static final String STRING_THOST_FTDC_SM_Instrument="1";

    /**
     *按产品统计 {@value}
     *@see #SizeOf_TThostFtdcStatModeType
     */
    public static final char THOST_FTDC_SM_Product='2';

    /**
     *按产品统计 {@value}
     *@see #SizeOf_TThostFtdcStatModeType
     */
    public static final String STRING_THOST_FTDC_SM_Product="2";

    /**
     *按投资者统计 {@value}
     *@see #SizeOf_TThostFtdcStatModeType
     */
    public static final char THOST_FTDC_SM_Investor='3';

    /**
     *按投资者统计 {@value}
     *@see #SizeOf_TThostFtdcStatModeType
     */
    public static final String STRING_THOST_FTDC_SM_Investor="3";

    /**
     *TFtdcStatModeType是一个统计方式类型
     *@see #THOST_FTDC_SM_Non
     *@see #THOST_FTDC_SM_Instrument
     *@see #THOST_FTDC_SM_Product
     *@see #THOST_FTDC_SM_Investor
     */
    public static final int SizeOf_TThostFtdcStatModeType=1;

    /**
     *未发送 {@value}
     *@see #SizeOf_TThostFtdcParkedOrderStatusType
     */
    public static final char THOST_FTDC_PAOS_NotSend='1';

    /**
     *未发送 {@value}
     *@see #SizeOf_TThostFtdcParkedOrderStatusType
     */
    public static final String STRING_THOST_FTDC_PAOS_NotSend="1";

    /**
     *已发送 {@value}
     *@see #SizeOf_TThostFtdcParkedOrderStatusType
     */
    public static final char THOST_FTDC_PAOS_Send='2';

    /**
     *已发送 {@value}
     *@see #SizeOf_TThostFtdcParkedOrderStatusType
     */
    public static final String STRING_THOST_FTDC_PAOS_Send="2";

    /**
     *已删除 {@value}
     *@see #SizeOf_TThostFtdcParkedOrderStatusType
     */
    public static final char THOST_FTDC_PAOS_Deleted='3';

    /**
     *已删除 {@value}
     *@see #SizeOf_TThostFtdcParkedOrderStatusType
     */
    public static final String STRING_THOST_FTDC_PAOS_Deleted="3";

    /**
     *TFtdcParkedOrderStatusType是一个预埋单状态类型
     *@see #THOST_FTDC_PAOS_NotSend
     *@see #THOST_FTDC_PAOS_Send
     *@see #THOST_FTDC_PAOS_Deleted
     */
    public static final int SizeOf_TThostFtdcParkedOrderStatusType=1;

    /**
     *TFtdcParkedOrderIDType是一个预埋报单编号类型
     */
    public static final int SizeOf_TThostFtdcParkedOrderIDType=13;

    /**
     *TFtdcParkedOrderActionIDType是一个预埋撤单编号类型
     */
    public static final int SizeOf_TThostFtdcParkedOrderActionIDType=13;

    /**
     *正在处理 {@value}
     *@see #SizeOf_TThostFtdcVirDealStatusType
     */
    public static final char THOST_FTDC_VDS_Dealing='1';

    /**
     *正在处理 {@value}
     *@see #SizeOf_TThostFtdcVirDealStatusType
     */
    public static final String STRING_THOST_FTDC_VDS_Dealing="1";

    /**
     *处理成功 {@value}
     *@see #SizeOf_TThostFtdcVirDealStatusType
     */
    public static final char THOST_FTDC_VDS_DeaclSucceed='2';

    /**
     *处理成功 {@value}
     *@see #SizeOf_TThostFtdcVirDealStatusType
     */
    public static final String STRING_THOST_FTDC_VDS_DeaclSucceed="2";

    /**
     *TFtdcVirDealStatusType是一个处理状态类型
     *@see #THOST_FTDC_VDS_Dealing
     *@see #THOST_FTDC_VDS_DeaclSucceed
     */
    public static final int SizeOf_TThostFtdcVirDealStatusType=1;

    /**
     *综合交易平台 {@value}
     *@see #SizeOf_TThostFtdcOrgSystemIDType
     */
    public static final char THOST_FTDC_ORGS_Standard='0';

    /**
     *综合交易平台 {@value}
     *@see #SizeOf_TThostFtdcOrgSystemIDType
     */
    public static final String STRING_THOST_FTDC_ORGS_Standard="0";

    /**
     *易盛系统 {@value}
     *@see #SizeOf_TThostFtdcOrgSystemIDType
     */
    public static final char THOST_FTDC_ORGS_ESunny='1';

    /**
     *易盛系统 {@value}
     *@see #SizeOf_TThostFtdcOrgSystemIDType
     */
    public static final String STRING_THOST_FTDC_ORGS_ESunny="1";

    /**
     *金仕达V6系统 {@value}
     *@see #SizeOf_TThostFtdcOrgSystemIDType
     */
    public static final char THOST_FTDC_ORGS_KingStarV6='2';

    /**
     *金仕达V6系统 {@value}
     *@see #SizeOf_TThostFtdcOrgSystemIDType
     */
    public static final String STRING_THOST_FTDC_ORGS_KingStarV6="2";

    /**
     *TFtdcOrgSystemIDType是一个原有系统代码类型
     *@see #THOST_FTDC_ORGS_Standard
     *@see #THOST_FTDC_ORGS_ESunny
     *@see #THOST_FTDC_ORGS_KingStarV6
     */
    public static final int SizeOf_TThostFtdcOrgSystemIDType=1;

    /**
     *正常处理中 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final char THOST_FTDC_VTS_NaturalDeal='0';

    /**
     *正常处理中 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final String STRING_THOST_FTDC_VTS_NaturalDeal="0";

    /**
     *成功结束 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final char THOST_FTDC_VTS_SucceedEnd='1';

    /**
     *成功结束 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final String STRING_THOST_FTDC_VTS_SucceedEnd="1";

    /**
     *失败结束 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final char THOST_FTDC_VTS_FailedEND='2';

    /**
     *失败结束 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final String STRING_THOST_FTDC_VTS_FailedEND="2";

    /**
     *异常中 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final char THOST_FTDC_VTS_Exception='3';

    /**
     *异常中 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final String STRING_THOST_FTDC_VTS_Exception="3";

    /**
     *已人工异常处理 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final char THOST_FTDC_VTS_ManualDeal='4';

    /**
     *已人工异常处理 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final String STRING_THOST_FTDC_VTS_ManualDeal="4";

    /**
     *通讯异常 ，请人工处理 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final char THOST_FTDC_VTS_MesException='5';

    /**
     *通讯异常 ，请人工处理 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final String STRING_THOST_FTDC_VTS_MesException="5";

    /**
     *系统出错，请人工处理 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final char THOST_FTDC_VTS_SysException='6';

    /**
     *系统出错，请人工处理 {@value}
     *@see #SizeOf_TThostFtdcVirTradeStatusType
     */
    public static final String STRING_THOST_FTDC_VTS_SysException="6";

    /**
     *TFtdcVirTradeStatusType是一个交易状态类型
     *@see #THOST_FTDC_VTS_NaturalDeal
     *@see #THOST_FTDC_VTS_SucceedEnd
     *@see #THOST_FTDC_VTS_FailedEND
     *@see #THOST_FTDC_VTS_Exception
     *@see #THOST_FTDC_VTS_ManualDeal
     *@see #THOST_FTDC_VTS_MesException
     *@see #THOST_FTDC_VTS_SysException
     */
    public static final int SizeOf_TThostFtdcVirTradeStatusType=1;

    /**
     *存折 {@value}
     *@see #SizeOf_TThostFtdcVirBankAccTypeType
     */
    public static final char THOST_FTDC_VBAT_BankBook='1';

    /**
     *存折 {@value}
     *@see #SizeOf_TThostFtdcVirBankAccTypeType
     */
    public static final String STRING_THOST_FTDC_VBAT_BankBook="1";

    /**
     *储蓄卡 {@value}
     *@see #SizeOf_TThostFtdcVirBankAccTypeType
     */
    public static final char THOST_FTDC_VBAT_BankCard='2';

    /**
     *储蓄卡 {@value}
     *@see #SizeOf_TThostFtdcVirBankAccTypeType
     */
    public static final String STRING_THOST_FTDC_VBAT_BankCard="2";

    /**
     *信用卡 {@value}
     *@see #SizeOf_TThostFtdcVirBankAccTypeType
     */
    public static final char THOST_FTDC_VBAT_CreditCard='3';

    /**
     *信用卡 {@value}
     *@see #SizeOf_TThostFtdcVirBankAccTypeType
     */
    public static final String STRING_THOST_FTDC_VBAT_CreditCard="3";

    /**
     *TFtdcVirBankAccTypeType是一个银行帐户类型类型
     *@see #THOST_FTDC_VBAT_BankBook
     *@see #THOST_FTDC_VBAT_BankCard
     *@see #THOST_FTDC_VBAT_CreditCard
     */
    public static final int SizeOf_TThostFtdcVirBankAccTypeType=1;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcVirementStatusType
     */
    public static final char THOST_FTDC_VMS_Natural='0';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcVirementStatusType
     */
    public static final String STRING_THOST_FTDC_VMS_Natural="0";

    /**
     *销户 {@value}
     *@see #SizeOf_TThostFtdcVirementStatusType
     */
    public static final char THOST_FTDC_VMS_Canceled='9';

    /**
     *销户 {@value}
     *@see #SizeOf_TThostFtdcVirementStatusType
     */
    public static final String STRING_THOST_FTDC_VMS_Canceled="9";

    /**
     *TFtdcVirementStatusType是一个银行帐户类型类型
     *@see #THOST_FTDC_VMS_Natural
     *@see #THOST_FTDC_VMS_Canceled
     */
    public static final int SizeOf_TThostFtdcVirementStatusType=1;

    /**
     *未确认 {@value}
     *@see #SizeOf_TThostFtdcVirementAvailAbilityType
     */
    public static final char THOST_FTDC_VAA_NoAvailAbility='0';

    /**
     *未确认 {@value}
     *@see #SizeOf_TThostFtdcVirementAvailAbilityType
     */
    public static final String STRING_THOST_FTDC_VAA_NoAvailAbility="0";

    /**
     *有效 {@value}
     *@see #SizeOf_TThostFtdcVirementAvailAbilityType
     */
    public static final char THOST_FTDC_VAA_AvailAbility='1';

    /**
     *有效 {@value}
     *@see #SizeOf_TThostFtdcVirementAvailAbilityType
     */
    public static final String STRING_THOST_FTDC_VAA_AvailAbility="1";

    /**
     *冲正 {@value}
     *@see #SizeOf_TThostFtdcVirementAvailAbilityType
     */
    public static final char THOST_FTDC_VAA_Repeal='2';

    /**
     *冲正 {@value}
     *@see #SizeOf_TThostFtdcVirementAvailAbilityType
     */
    public static final String STRING_THOST_FTDC_VAA_Repeal="2";

    /**
     *TFtdcVirementAvailAbilityType是一个有效标志类型
     *@see #THOST_FTDC_VAA_NoAvailAbility
     *@see #THOST_FTDC_VAA_AvailAbility
     *@see #THOST_FTDC_VAA_Repeal
     */
    public static final int SizeOf_TThostFtdcVirementAvailAbilityType=1;

    /**
     *TFtdcPhotoTypeNameType是一个影像类型名称类型
     */
    public static final int SizeOf_TThostFtdcPhotoTypeNameType=41;

    /**
     *TFtdcPhotoTypeIDType是一个影像类型代码类型
     */
    public static final int SizeOf_TThostFtdcPhotoTypeIDType=5;

    /**
     *TFtdcPhotoNameType是一个影像名称类型
     */
    public static final int SizeOf_TThostFtdcPhotoNameType=161;

    /**
     *TFtdcTopicIDType是一个主题代码类型
     */
    public static final int SizeOf_TThostFtdcTopicIDType=4;

    /**
     *TFtdcReportTypeIDType是一个交易报告类型标识类型
     */
    public static final int SizeOf_TThostFtdcReportTypeIDType=3;

    /**
     *TFtdcCharacterIDType是一个交易特征代码类型
     */
    public static final int SizeOf_TThostFtdcCharacterIDType=5;

    /**
     *TFtdcAMLParamIDType是一个参数代码类型
     */
    public static final int SizeOf_TThostFtdcAMLParamIDType=21;

    /**
     *TFtdcAMLInvestorTypeType是一个投资者类型类型
     */
    public static final int SizeOf_TThostFtdcAMLInvestorTypeType=3;

    /**
     *TFtdcAMLIdCardTypeType是一个证件类型类型
     */
    public static final int SizeOf_TThostFtdcAMLIdCardTypeType=3;

    /**
     *TFtdcAMLTradeDirectType是一个资金进出方向类型
     */
    public static final int SizeOf_TThostFtdcAMLTradeDirectType=3;

    /**
     *TFtdcAMLTradeModelType是一个资金进出方式类型
     */
    public static final int SizeOf_TThostFtdcAMLTradeModelType=3;

    /**
     *TFtdcAMLOpParamValueType是一个业务参数代码值类型
     */
    public static final int SizeOf_TThostFtdcAMLOpParamValueType=8;

    /**
     *TFtdcAMLCustomerCardTypeType是一个客户身份证件/证明文件类型类型
     */
    public static final int SizeOf_TThostFtdcAMLCustomerCardTypeType=81;

    /**
     *TFtdcAMLInstitutionNameType是一个金融机构网点名称类型
     */
    public static final int SizeOf_TThostFtdcAMLInstitutionNameType=65;

    /**
     *TFtdcAMLDistrictIDType是一个金融机构网点所在地区行政区划代码类型
     */
    public static final int SizeOf_TThostFtdcAMLDistrictIDType=7;

    /**
     *TFtdcAMLRelationShipType是一个金融机构网点与大额交易的关系类型
     */
    public static final int SizeOf_TThostFtdcAMLRelationShipType=3;

    /**
     *TFtdcAMLInstitutionTypeType是一个金融机构网点代码类型类型
     */
    public static final int SizeOf_TThostFtdcAMLInstitutionTypeType=3;

    /**
     *TFtdcAMLInstitutionIDType是一个金融机构网点代码类型
     */
    public static final int SizeOf_TThostFtdcAMLInstitutionIDType=13;

    /**
     *TFtdcAMLAccountTypeType是一个账户类型类型
     */
    public static final int SizeOf_TThostFtdcAMLAccountTypeType=5;

    /**
     *TFtdcAMLTradingTypeType是一个交易方式类型
     */
    public static final int SizeOf_TThostFtdcAMLTradingTypeType=7;

    /**
     *TFtdcAMLTransactClassType是一个涉外收支交易分类与代码类型
     */
    public static final int SizeOf_TThostFtdcAMLTransactClassType=7;

    /**
     *TFtdcAMLCapitalIOType是一个资金收付标识类型
     */
    public static final int SizeOf_TThostFtdcAMLCapitalIOType=3;

    /**
     *TFtdcAMLSiteType是一个交易地点类型
     */
    public static final int SizeOf_TThostFtdcAMLSiteType=10;

    /**
     *TFtdcAMLCapitalPurposeType是一个资金用途类型
     */
    public static final int SizeOf_TThostFtdcAMLCapitalPurposeType=129;

    /**
     *TFtdcAMLReportTypeType是一个报文类型类型
     */
    public static final int SizeOf_TThostFtdcAMLReportTypeType=2;

    /**
     *TFtdcAMLSerialNoType是一个编号类型
     */
    public static final int SizeOf_TThostFtdcAMLSerialNoType=5;

    /**
     *TFtdcAMLStatusType是一个状态类型
     */
    public static final int SizeOf_TThostFtdcAMLStatusType=2;

    /**
     *程序生成 {@value}
     *@see #SizeOf_TThostFtdcAMLGenStatusType
     */
    public static final char THOST_FTDC_GEN_Program='0';

    /**
     *程序生成 {@value}
     *@see #SizeOf_TThostFtdcAMLGenStatusType
     */
    public static final String STRING_THOST_FTDC_GEN_Program="0";

    /**
     *人工生成 {@value}
     *@see #SizeOf_TThostFtdcAMLGenStatusType
     */
    public static final char THOST_FTDC_GEN_HandWork='1';

    /**
     *人工生成 {@value}
     *@see #SizeOf_TThostFtdcAMLGenStatusType
     */
    public static final String STRING_THOST_FTDC_GEN_HandWork="1";

    /**
     *TFtdcAMLGenStatusType是一个Aml生成方式类型
     *@see #THOST_FTDC_GEN_Program
     *@see #THOST_FTDC_GEN_HandWork
     */
    public static final int SizeOf_TThostFtdcAMLGenStatusType=1;

    /**
     *TFtdcAMLSeqCodeType是一个业务标识号类型
     */
    public static final int SizeOf_TThostFtdcAMLSeqCodeType=65;

    /**
     *TFtdcAMLFileNameType是一个AML文件名类型
     */
    public static final int SizeOf_TThostFtdcAMLFileNameType=257;

    /**
     *TFtdcAMLMoneyType是一个反洗钱资金类型
     */
    public static final int SizeOf_TThostFtdcAMLMoneyType=8;

    /**
     *TFtdcAMLFileAmountType是一个反洗钱资金类型
     */
    public static final int SizeOf_TThostFtdcAMLFileAmountType=4;

    /**
     *TFtdcCFMMCKeyType是一个密钥类型(保证金监管)类型
     */
    public static final int SizeOf_TThostFtdcCFMMCKeyType=21;

    /**
     *TFtdcCFMMCTokenType是一个令牌类型(保证金监管)类型
     */
    public static final int SizeOf_TThostFtdcCFMMCTokenType=21;

    /**
     *主动请求更新 {@value}
     *@see #SizeOf_TThostFtdcCFMMCKeyKindType
     */
    public static final char THOST_FTDC_CFMMCKK_REQUEST='R';

    /**
     *主动请求更新 {@value}
     *@see #SizeOf_TThostFtdcCFMMCKeyKindType
     */
    public static final String STRING_THOST_FTDC_CFMMCKK_REQUEST="R";

    /**
     *CFMMC自动更新 {@value}
     *@see #SizeOf_TThostFtdcCFMMCKeyKindType
     */
    public static final char THOST_FTDC_CFMMCKK_AUTO='A';

    /**
     *CFMMC自动更新 {@value}
     *@see #SizeOf_TThostFtdcCFMMCKeyKindType
     */
    public static final String STRING_THOST_FTDC_CFMMCKK_AUTO="A";

    /**
     *CFMMC手动更新 {@value}
     *@see #SizeOf_TThostFtdcCFMMCKeyKindType
     */
    public static final char THOST_FTDC_CFMMCKK_MANUAL='M';

    /**
     *CFMMC手动更新 {@value}
     *@see #SizeOf_TThostFtdcCFMMCKeyKindType
     */
    public static final String STRING_THOST_FTDC_CFMMCKK_MANUAL="M";

    /**
     *TFtdcCFMMCKeyKindType是一个动态密钥类别(保证金监管)类型
     *@see #THOST_FTDC_CFMMCKK_REQUEST
     *@see #THOST_FTDC_CFMMCKK_AUTO
     *@see #THOST_FTDC_CFMMCKK_MANUAL
     */
    public static final int SizeOf_TThostFtdcCFMMCKeyKindType=1;

    /**
     *TFtdcAMLReportNameType是一个报文名称类型
     */
    public static final int SizeOf_TThostFtdcAMLReportNameType=81;

    /**
     *TFtdcIndividualNameType是一个个人姓名类型
     */
    public static final int SizeOf_TThostFtdcIndividualNameType=51;

    /**
     *TFtdcCurrencyIDType是一个币种代码类型
     */
    public static final int SizeOf_TThostFtdcCurrencyIDType=4;

    /**
     *TFtdcCustNumberType是一个客户编号类型
     */
    public static final int SizeOf_TThostFtdcCustNumberType=36;

    /**
     *TFtdcOrganCodeType是一个机构编码类型
     */
    public static final int SizeOf_TThostFtdcOrganCodeType=36;

    /**
     *TFtdcOrganNameType是一个机构名称类型
     */
    public static final int SizeOf_TThostFtdcOrganNameType=71;

    /**
     *TFtdcSuperOrganCodeType是一个上级机构编码,即期货公司总部、银行总行类型
     */
    public static final int SizeOf_TThostFtdcSuperOrganCodeType=12;

    /**
     *TFtdcSubBranchIDType是一个分支机构类型
     */
    public static final int SizeOf_TThostFtdcSubBranchIDType=31;

    /**
     *TFtdcSubBranchNameType是一个分支机构名称类型
     */
    public static final int SizeOf_TThostFtdcSubBranchNameType=71;

    /**
     *TFtdcBranchNetCodeType是一个机构网点号类型
     */
    public static final int SizeOf_TThostFtdcBranchNetCodeType=31;

    /**
     *TFtdcBranchNetNameType是一个机构网点名称类型
     */
    public static final int SizeOf_TThostFtdcBranchNetNameType=71;

    /**
     *TFtdcOrganFlagType是一个机构标识类型
     */
    public static final int SizeOf_TThostFtdcOrganFlagType=2;

    /**
     *TFtdcBankCodingForFutureType是一个银行对期货公司的编码类型
     */
    public static final int SizeOf_TThostFtdcBankCodingForFutureType=33;

    /**
     *TFtdcBankReturnCodeType是一个银行对返回码的定义类型
     */
    public static final int SizeOf_TThostFtdcBankReturnCodeType=7;

    /**
     *TFtdcPlateReturnCodeType是一个银期转帐平台对返回码的定义类型
     */
    public static final int SizeOf_TThostFtdcPlateReturnCodeType=5;

    /**
     *TFtdcBankSubBranchIDType是一个银行分支机构编码类型
     */
    public static final int SizeOf_TThostFtdcBankSubBranchIDType=31;

    /**
     *TFtdcFutureBranchIDType是一个期货分支机构编码类型
     */
    public static final int SizeOf_TThostFtdcFutureBranchIDType=31;

    /**
     *TFtdcReturnCodeType是一个返回代码类型
     */
    public static final int SizeOf_TThostFtdcReturnCodeType=7;

    /**
     *TFtdcOperatorCodeType是一个操作员类型
     */
    public static final int SizeOf_TThostFtdcOperatorCodeType=17;

    /**
     *TFtdcClearDepIDType是一个机构结算帐户机构号类型
     */
    public static final int SizeOf_TThostFtdcClearDepIDType=6;

    /**
     *TFtdcClearBrchIDType是一个机构结算帐户联行号类型
     */
    public static final int SizeOf_TThostFtdcClearBrchIDType=6;

    /**
     *TFtdcClearNameType是一个机构结算帐户名称类型
     */
    public static final int SizeOf_TThostFtdcClearNameType=71;

    /**
     *TFtdcBankAccountNameType是一个银行帐户名称类型
     */
    public static final int SizeOf_TThostFtdcBankAccountNameType=71;

    /**
     *TFtdcInvDepIDType是一个机构投资人账号机构号类型
     */
    public static final int SizeOf_TThostFtdcInvDepIDType=6;

    /**
     *TFtdcInvBrchIDType是一个机构投资人联行号类型
     */
    public static final int SizeOf_TThostFtdcInvBrchIDType=6;

    /**
     *TFtdcMessageFormatVersionType是一个信息格式版本类型
     */
    public static final int SizeOf_TThostFtdcMessageFormatVersionType=36;

    /**
     *TFtdcDigestType是一个摘要类型
     */
    public static final int SizeOf_TThostFtdcDigestType=36;

    /**
     *TFtdcAuthenticDataType是一个认证数据类型
     */
    public static final int SizeOf_TThostFtdcAuthenticDataType=129;

    /**
     *TFtdcPasswordKeyType是一个密钥类型
     */
    public static final int SizeOf_TThostFtdcPasswordKeyType=129;

    /**
     *TFtdcFutureAccountNameType是一个期货帐户名称类型
     */
    public static final int SizeOf_TThostFtdcFutureAccountNameType=129;

    /**
     *TFtdcMobilePhoneType是一个手机类型
     */
    public static final int SizeOf_TThostFtdcMobilePhoneType=21;

    /**
     *TFtdcFutureMainKeyType是一个期货公司主密钥类型
     */
    public static final int SizeOf_TThostFtdcFutureMainKeyType=129;

    /**
     *TFtdcFutureWorkKeyType是一个期货公司工作密钥类型
     */
    public static final int SizeOf_TThostFtdcFutureWorkKeyType=129;

    /**
     *TFtdcFutureTransKeyType是一个期货公司传输密钥类型
     */
    public static final int SizeOf_TThostFtdcFutureTransKeyType=129;

    /**
     *TFtdcBankMainKeyType是一个银行主密钥类型
     */
    public static final int SizeOf_TThostFtdcBankMainKeyType=129;

    /**
     *TFtdcBankWorkKeyType是一个银行工作密钥类型
     */
    public static final int SizeOf_TThostFtdcBankWorkKeyType=129;

    /**
     *TFtdcBankTransKeyType是一个银行传输密钥类型
     */
    public static final int SizeOf_TThostFtdcBankTransKeyType=129;

    /**
     *TFtdcBankServerDescriptionType是一个银行服务器描述信息类型
     */
    public static final int SizeOf_TThostFtdcBankServerDescriptionType=129;

    /**
     *TFtdcAddInfoType是一个附加信息类型
     */
    public static final int SizeOf_TThostFtdcAddInfoType=129;

    /**
     *TFtdcDescrInfoForReturnCodeType是一个返回码描述类型
     */
    public static final int SizeOf_TThostFtdcDescrInfoForReturnCodeType=129;

    /**
     *TFtdcCountryCodeType是一个国家代码类型
     */
    public static final int SizeOf_TThostFtdcCountryCodeType=21;

    /**
     *TFtdcSerialType是一个流水号类型
     */
    public static final int SizeOf_TThostFtdcSerialType=4;

    /**
     *TFtdcPlateSerialType是一个平台流水号类型
     */
    public static final int SizeOf_TThostFtdcPlateSerialType=4;

    /**
     *TFtdcBankSerialType是一个银行流水号类型
     */
    public static final int SizeOf_TThostFtdcBankSerialType=13;

    /**
     *TFtdcCorrectSerialType是一个被冲正交易流水号类型
     */
    public static final int SizeOf_TThostFtdcCorrectSerialType=4;

    /**
     *TFtdcFutureSerialType是一个期货公司流水号类型
     */
    public static final int SizeOf_TThostFtdcFutureSerialType=4;

    /**
     *TFtdcApplicationIDType是一个应用标识类型
     */
    public static final int SizeOf_TThostFtdcApplicationIDType=4;

    /**
     *TFtdcBankProxyIDType是一个银行代理标识类型
     */
    public static final int SizeOf_TThostFtdcBankProxyIDType=4;

    /**
     *TFtdcFBTCoreIDType是一个银期转帐核心系统标识类型
     */
    public static final int SizeOf_TThostFtdcFBTCoreIDType=4;

    /**
     *TFtdcServerPortType是一个服务端口号类型
     */
    public static final int SizeOf_TThostFtdcServerPortType=4;

    /**
     *TFtdcRepealedTimesType是一个已经冲正次数类型
     */
    public static final int SizeOf_TThostFtdcRepealedTimesType=4;

    /**
     *TFtdcRepealTimeIntervalType是一个冲正时间间隔类型
     */
    public static final int SizeOf_TThostFtdcRepealTimeIntervalType=4;

    /**
     *TFtdcTotalTimesType是一个每日累计转帐次数类型
     */
    public static final int SizeOf_TThostFtdcTotalTimesType=4;

    /**
     *TFtdcFBTRequestIDType是一个请求ID类型
     */
    public static final int SizeOf_TThostFtdcFBTRequestIDType=4;

    /**
     *TFtdcTIDType是一个交易ID类型
     */
    public static final int SizeOf_TThostFtdcTIDType=4;

    /**
     *TFtdcTradeAmountType是一个交易金额（元）类型
     */
    public static final int SizeOf_TThostFtdcTradeAmountType=8;

    /**
     *TFtdcCustFeeType是一个应收客户费用（元）类型
     */
    public static final int SizeOf_TThostFtdcCustFeeType=8;

    /**
     *TFtdcFutureFeeType是一个应收期货公司费用（元）类型
     */
    public static final int SizeOf_TThostFtdcFutureFeeType=8;

    /**
     *TFtdcSingleMaxAmtType是一个单笔最高限额类型
     */
    public static final int SizeOf_TThostFtdcSingleMaxAmtType=8;

    /**
     *TFtdcSingleMinAmtType是一个单笔最低限额类型
     */
    public static final int SizeOf_TThostFtdcSingleMinAmtType=8;

    /**
     *TFtdcTotalAmtType是一个每日累计转帐额度类型
     */
    public static final int SizeOf_TThostFtdcTotalAmtType=8;

    /**
     *身份证 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_IDCard='0';

    /**
     *身份证 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_IDCard="0";

    /**
     *护照 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_Passport='1';

    /**
     *护照 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_Passport="1";

    /**
     *军官证 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_OfficerIDCard='2';

    /**
     *军官证 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_OfficerIDCard="2";

    /**
     *士兵证 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_SoldierIDCard='3';

    /**
     *士兵证 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_SoldierIDCard="3";

    /**
     *回乡证 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_HomeComingCard='4';

    /**
     *回乡证 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_HomeComingCard="4";

    /**
     *户口簿 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_HouseholdRegister='5';

    /**
     *户口簿 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_HouseholdRegister="5";

    /**
     *营业执照号 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_LicenseNo='6';

    /**
     *营业执照号 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_LicenseNo="6";

    /**
     *组织机构代码证 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_InstitutionCodeCard='7';

    /**
     *组织机构代码证 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_InstitutionCodeCard="7";

    /**
     *临时营业执照号 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_TempLicenseNo='8';

    /**
     *临时营业执照号 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_TempLicenseNo="8";

    /**
     *民办非企业登记证书 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_NoEnterpriseLicenseNo='9';

    /**
     *民办非企业登记证书 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_NoEnterpriseLicenseNo="9";

    /**
     *其他证件 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_OtherCard='x';

    /**
     *其他证件 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_OtherCard="x";

    /**
     *主管部门批文 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final char THOST_FTDC_CFT_SuperDepAgree='a';

    /**
     *主管部门批文 {@value}
     *@see #SizeOf_TThostFtdcCertificationTypeType
     */
    public static final String STRING_THOST_FTDC_CFT_SuperDepAgree="a";

    /**
     *TFtdcCertificationTypeType是一个证件类型类型
     *@see #THOST_FTDC_CFT_IDCard
     *@see #THOST_FTDC_CFT_Passport
     *@see #THOST_FTDC_CFT_OfficerIDCard
     *@see #THOST_FTDC_CFT_SoldierIDCard
     *@see #THOST_FTDC_CFT_HomeComingCard
     *@see #THOST_FTDC_CFT_HouseholdRegister
     *@see #THOST_FTDC_CFT_LicenseNo
     *@see #THOST_FTDC_CFT_InstitutionCodeCard
     *@see #THOST_FTDC_CFT_TempLicenseNo
     *@see #THOST_FTDC_CFT_NoEnterpriseLicenseNo
     *@see #THOST_FTDC_CFT_OtherCard
     *@see #THOST_FTDC_CFT_SuperDepAgree
     */
    public static final int SizeOf_TThostFtdcCertificationTypeType=1;

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_Others='0';

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_Others="0";

    /**
     *转账交易明细对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_TransferDetails='1';

    /**
     *转账交易明细对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_TransferDetails="1";

    /**
     *客户账户状态对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_CustAccStatus='2';

    /**
     *客户账户状态对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_CustAccStatus="2";

    /**
     *账户类交易明细对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_AccountTradeDetails='3';

    /**
     *账户类交易明细对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_AccountTradeDetails="3";

    /**
     *期货账户信息变更明细对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_FutureAccountChangeInfoDetails='4';

    /**
     *期货账户信息变更明细对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_FutureAccountChangeInfoDetails="4";

    /**
     *客户资金台账余额明细对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_CustMoneyDetail='5';

    /**
     *客户资金台账余额明细对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_CustMoneyDetail="5";

    /**
     *客户销户结息明细对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_CustCancelAccountInfo='6';

    /**
     *客户销户结息明细对账 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_CustCancelAccountInfo="6";

    /**
     *客户资金余额对账结果 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_CustMoneyResult='7';

    /**
     *客户资金余额对账结果 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_CustMoneyResult="7";

    /**
     *其它对账异常结果文件 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_OthersExceptionResult='8';

    /**
     *其它对账异常结果文件 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_OthersExceptionResult="8";

    /**
     *客户结息净额明细 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_CustInterestNetMoneyDetails='9';

    /**
     *客户结息净额明细 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_CustInterestNetMoneyDetails="9";

    /**
     *客户资金交收明细 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_CustMoneySendAndReceiveDetails='a';

    /**
     *客户资金交收明细 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_CustMoneySendAndReceiveDetails="a";

    /**
     *法人存管银行资金交收汇总 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_CorporationMoneyTotal='b';

    /**
     *法人存管银行资金交收汇总 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_CorporationMoneyTotal="b";

    /**
     *主体间资金交收汇总 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_MainbodyMoneyTotal='c';

    /**
     *主体间资金交收汇总 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_MainbodyMoneyTotal="c";

    /**
     *总分平衡监管数据 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_MainPartMonitorData='d';

    /**
     *总分平衡监管数据 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_MainPartMonitorData="d";

    /**
     *存管银行备付金余额 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_PreparationMoney='e';

    /**
     *存管银行备付金余额 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_PreparationMoney="e";

    /**
     *协办存管银行资金监管数据 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final char THOST_FTDC_FBC_BankMoneyMonitorData='f';

    /**
     *协办存管银行资金监管数据 {@value}
     *@see #SizeOf_TThostFtdcFileBusinessCodeType
     */
    public static final String STRING_THOST_FTDC_FBC_BankMoneyMonitorData="f";

    /**
     *TFtdcFileBusinessCodeType是一个文件业务功能类型
     *@see #THOST_FTDC_FBC_Others
     *@see #THOST_FTDC_FBC_TransferDetails
     *@see #THOST_FTDC_FBC_CustAccStatus
     *@see #THOST_FTDC_FBC_AccountTradeDetails
     *@see #THOST_FTDC_FBC_FutureAccountChangeInfoDetails
     *@see #THOST_FTDC_FBC_CustMoneyDetail
     *@see #THOST_FTDC_FBC_CustCancelAccountInfo
     *@see #THOST_FTDC_FBC_CustMoneyResult
     *@see #THOST_FTDC_FBC_OthersExceptionResult
     *@see #THOST_FTDC_FBC_CustInterestNetMoneyDetails
     *@see #THOST_FTDC_FBC_CustMoneySendAndReceiveDetails
     *@see #THOST_FTDC_FBC_CorporationMoneyTotal
     *@see #THOST_FTDC_FBC_MainbodyMoneyTotal
     *@see #THOST_FTDC_FBC_MainPartMonitorData
     *@see #THOST_FTDC_FBC_PreparationMoney
     *@see #THOST_FTDC_FBC_BankMoneyMonitorData
     */
    public static final int SizeOf_TThostFtdcFileBusinessCodeType=1;

    /**
     *汇 {@value}
     *@see #SizeOf_TThostFtdcCashExchangeCodeType
     */
    public static final char THOST_FTDC_CEC_Exchange='1';

    /**
     *汇 {@value}
     *@see #SizeOf_TThostFtdcCashExchangeCodeType
     */
    public static final String STRING_THOST_FTDC_CEC_Exchange="1";

    /**
     *钞 {@value}
     *@see #SizeOf_TThostFtdcCashExchangeCodeType
     */
    public static final char THOST_FTDC_CEC_Cash='2';

    /**
     *钞 {@value}
     *@see #SizeOf_TThostFtdcCashExchangeCodeType
     */
    public static final String STRING_THOST_FTDC_CEC_Cash="2";

    /**
     *TFtdcCashExchangeCodeType是一个汇钞标志类型
     *@see #THOST_FTDC_CEC_Exchange
     *@see #THOST_FTDC_CEC_Cash
     */
    public static final int SizeOf_TThostFtdcCashExchangeCodeType=1;

    /**
     *是 {@value}
     *@see #SizeOf_TThostFtdcYesNoIndicatorType
     */
    public static final char THOST_FTDC_YNI_Yes='0';

    /**
     *是 {@value}
     *@see #SizeOf_TThostFtdcYesNoIndicatorType
     */
    public static final String STRING_THOST_FTDC_YNI_Yes="0";

    /**
     *否 {@value}
     *@see #SizeOf_TThostFtdcYesNoIndicatorType
     */
    public static final char THOST_FTDC_YNI_No='1';

    /**
     *否 {@value}
     *@see #SizeOf_TThostFtdcYesNoIndicatorType
     */
    public static final String STRING_THOST_FTDC_YNI_No="1";

    /**
     *TFtdcYesNoIndicatorType是一个是或否标识类型
     *@see #THOST_FTDC_YNI_Yes
     *@see #THOST_FTDC_YNI_No
     */
    public static final int SizeOf_TThostFtdcYesNoIndicatorType=1;

    /**
     *当前余额 {@value}
     *@see #SizeOf_TThostFtdcBanlanceTypeType
     */
    public static final char THOST_FTDC_BLT_CurrentMoney='0';

    /**
     *当前余额 {@value}
     *@see #SizeOf_TThostFtdcBanlanceTypeType
     */
    public static final String STRING_THOST_FTDC_BLT_CurrentMoney="0";

    /**
     *可用余额 {@value}
     *@see #SizeOf_TThostFtdcBanlanceTypeType
     */
    public static final char THOST_FTDC_BLT_UsableMoney='1';

    /**
     *可用余额 {@value}
     *@see #SizeOf_TThostFtdcBanlanceTypeType
     */
    public static final String STRING_THOST_FTDC_BLT_UsableMoney="1";

    /**
     *可取余额 {@value}
     *@see #SizeOf_TThostFtdcBanlanceTypeType
     */
    public static final char THOST_FTDC_BLT_FetchableMoney='2';

    /**
     *可取余额 {@value}
     *@see #SizeOf_TThostFtdcBanlanceTypeType
     */
    public static final String STRING_THOST_FTDC_BLT_FetchableMoney="2";

    /**
     *冻结余额 {@value}
     *@see #SizeOf_TThostFtdcBanlanceTypeType
     */
    public static final char THOST_FTDC_BLT_FreezeMoney='3';

    /**
     *冻结余额 {@value}
     *@see #SizeOf_TThostFtdcBanlanceTypeType
     */
    public static final String STRING_THOST_FTDC_BLT_FreezeMoney="3";

    /**
     *TFtdcBanlanceTypeType是一个余额类型类型
     *@see #THOST_FTDC_BLT_CurrentMoney
     *@see #THOST_FTDC_BLT_UsableMoney
     *@see #THOST_FTDC_BLT_FetchableMoney
     *@see #THOST_FTDC_BLT_FreezeMoney
     */
    public static final int SizeOf_TThostFtdcBanlanceTypeType=1;

    /**
     *未知状态 {@value}
     *@see #SizeOf_TThostFtdcGenderType
     */
    public static final char THOST_FTDC_GD_Unknown='0';

    /**
     *未知状态 {@value}
     *@see #SizeOf_TThostFtdcGenderType
     */
    public static final String STRING_THOST_FTDC_GD_Unknown="0";

    /**
     *男 {@value}
     *@see #SizeOf_TThostFtdcGenderType
     */
    public static final char THOST_FTDC_GD_Male='1';

    /**
     *男 {@value}
     *@see #SizeOf_TThostFtdcGenderType
     */
    public static final String STRING_THOST_FTDC_GD_Male="1";

    /**
     *女 {@value}
     *@see #SizeOf_TThostFtdcGenderType
     */
    public static final char THOST_FTDC_GD_Female='2';

    /**
     *女 {@value}
     *@see #SizeOf_TThostFtdcGenderType
     */
    public static final String STRING_THOST_FTDC_GD_Female="2";

    /**
     *TFtdcGenderType是一个性别类型
     *@see #THOST_FTDC_GD_Unknown
     *@see #THOST_FTDC_GD_Male
     *@see #THOST_FTDC_GD_Female
     */
    public static final int SizeOf_TThostFtdcGenderType=1;

    /**
     *由受益方支付费用 {@value}
     *@see #SizeOf_TThostFtdcFeePayFlagType
     */
    public static final char THOST_FTDC_FPF_BEN='0';

    /**
     *由受益方支付费用 {@value}
     *@see #SizeOf_TThostFtdcFeePayFlagType
     */
    public static final String STRING_THOST_FTDC_FPF_BEN="0";

    /**
     *由发送方支付费用 {@value}
     *@see #SizeOf_TThostFtdcFeePayFlagType
     */
    public static final char THOST_FTDC_FPF_OUR='1';

    /**
     *由发送方支付费用 {@value}
     *@see #SizeOf_TThostFtdcFeePayFlagType
     */
    public static final String STRING_THOST_FTDC_FPF_OUR="1";

    /**
     *由发送方支付发起的费用，受益方支付接受的费用 {@value}
     *@see #SizeOf_TThostFtdcFeePayFlagType
     */
    public static final char THOST_FTDC_FPF_SHA='2';

    /**
     *由发送方支付发起的费用，受益方支付接受的费用 {@value}
     *@see #SizeOf_TThostFtdcFeePayFlagType
     */
    public static final String STRING_THOST_FTDC_FPF_SHA="2";

    /**
     *TFtdcFeePayFlagType是一个费用支付标志类型
     *@see #THOST_FTDC_FPF_BEN
     *@see #THOST_FTDC_FPF_OUR
     *@see #THOST_FTDC_FPF_SHA
     */
    public static final int SizeOf_TThostFtdcFeePayFlagType=1;

    /**
     *交换密钥 {@value}
     *@see #SizeOf_TThostFtdcPassWordKeyTypeType
     */
    public static final char THOST_FTDC_PWKT_ExchangeKey='0';

    /**
     *交换密钥 {@value}
     *@see #SizeOf_TThostFtdcPassWordKeyTypeType
     */
    public static final String STRING_THOST_FTDC_PWKT_ExchangeKey="0";

    /**
     *密码密钥 {@value}
     *@see #SizeOf_TThostFtdcPassWordKeyTypeType
     */
    public static final char THOST_FTDC_PWKT_PassWordKey='1';

    /**
     *密码密钥 {@value}
     *@see #SizeOf_TThostFtdcPassWordKeyTypeType
     */
    public static final String STRING_THOST_FTDC_PWKT_PassWordKey="1";

    /**
     *MAC密钥 {@value}
     *@see #SizeOf_TThostFtdcPassWordKeyTypeType
     */
    public static final char THOST_FTDC_PWKT_MACKey='2';

    /**
     *MAC密钥 {@value}
     *@see #SizeOf_TThostFtdcPassWordKeyTypeType
     */
    public static final String STRING_THOST_FTDC_PWKT_MACKey="2";

    /**
     *报文密钥 {@value}
     *@see #SizeOf_TThostFtdcPassWordKeyTypeType
     */
    public static final char THOST_FTDC_PWKT_MessageKey='3';

    /**
     *报文密钥 {@value}
     *@see #SizeOf_TThostFtdcPassWordKeyTypeType
     */
    public static final String STRING_THOST_FTDC_PWKT_MessageKey="3";

    /**
     *TFtdcPassWordKeyTypeType是一个密钥类型类型
     *@see #THOST_FTDC_PWKT_ExchangeKey
     *@see #THOST_FTDC_PWKT_PassWordKey
     *@see #THOST_FTDC_PWKT_MACKey
     *@see #THOST_FTDC_PWKT_MessageKey
     */
    public static final int SizeOf_TThostFtdcPassWordKeyTypeType=1;

    /**
     *查询 {@value}
     *@see #SizeOf_TThostFtdcFBTPassWordTypeType
     */
    public static final char THOST_FTDC_PWT_Query='0';

    /**
     *查询 {@value}
     *@see #SizeOf_TThostFtdcFBTPassWordTypeType
     */
    public static final String STRING_THOST_FTDC_PWT_Query="0";

    /**
     *取款 {@value}
     *@see #SizeOf_TThostFtdcFBTPassWordTypeType
     */
    public static final char THOST_FTDC_PWT_Fetch='1';

    /**
     *取款 {@value}
     *@see #SizeOf_TThostFtdcFBTPassWordTypeType
     */
    public static final String STRING_THOST_FTDC_PWT_Fetch="1";

    /**
     *转帐 {@value}
     *@see #SizeOf_TThostFtdcFBTPassWordTypeType
     */
    public static final char THOST_FTDC_PWT_Transfer='2';

    /**
     *转帐 {@value}
     *@see #SizeOf_TThostFtdcFBTPassWordTypeType
     */
    public static final String STRING_THOST_FTDC_PWT_Transfer="2";

    /**
     *交易 {@value}
     *@see #SizeOf_TThostFtdcFBTPassWordTypeType
     */
    public static final char THOST_FTDC_PWT_Trade='3';

    /**
     *交易 {@value}
     *@see #SizeOf_TThostFtdcFBTPassWordTypeType
     */
    public static final String STRING_THOST_FTDC_PWT_Trade="3";

    /**
     *TFtdcFBTPassWordTypeType是一个密码类型类型
     *@see #THOST_FTDC_PWT_Query
     *@see #THOST_FTDC_PWT_Fetch
     *@see #THOST_FTDC_PWT_Transfer
     *@see #THOST_FTDC_PWT_Trade
     */
    public static final int SizeOf_TThostFtdcFBTPassWordTypeType=1;

    /**
     *不加密 {@value}
     *@see #SizeOf_TThostFtdcFBTEncryModeType
     */
    public static final char THOST_FTDC_EM_NoEncry='0';

    /**
     *不加密 {@value}
     *@see #SizeOf_TThostFtdcFBTEncryModeType
     */
    public static final String STRING_THOST_FTDC_EM_NoEncry="0";

    /**
     *DES {@value}
     *@see #SizeOf_TThostFtdcFBTEncryModeType
     */
    public static final char THOST_FTDC_EM_DES='1';

    /**
     *DES {@value}
     *@see #SizeOf_TThostFtdcFBTEncryModeType
     */
    public static final String STRING_THOST_FTDC_EM_DES="1";

    /**
     *3DES {@value}
     *@see #SizeOf_TThostFtdcFBTEncryModeType
     */
    public static final char THOST_FTDC_EM_3DES='2';

    /**
     *3DES {@value}
     *@see #SizeOf_TThostFtdcFBTEncryModeType
     */
    public static final String STRING_THOST_FTDC_EM_3DES="2";

    /**
     *TFtdcFBTEncryModeType是一个加密方式类型
     *@see #THOST_FTDC_EM_NoEncry
     *@see #THOST_FTDC_EM_DES
     *@see #THOST_FTDC_EM_3DES
     */
    public static final int SizeOf_TThostFtdcFBTEncryModeType=1;

    /**
     *银行无需自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBankRepealFlagType
     */
    public static final char THOST_FTDC_BRF_BankNotNeedRepeal='0';

    /**
     *银行无需自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBankRepealFlagType
     */
    public static final String STRING_THOST_FTDC_BRF_BankNotNeedRepeal="0";

    /**
     *银行待自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBankRepealFlagType
     */
    public static final char THOST_FTDC_BRF_BankWaitingRepeal='1';

    /**
     *银行待自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBankRepealFlagType
     */
    public static final String STRING_THOST_FTDC_BRF_BankWaitingRepeal="1";

    /**
     *银行已自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBankRepealFlagType
     */
    public static final char THOST_FTDC_BRF_BankBeenRepealed='2';

    /**
     *银行已自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBankRepealFlagType
     */
    public static final String STRING_THOST_FTDC_BRF_BankBeenRepealed="2";

    /**
     *TFtdcBankRepealFlagType是一个银行冲正标志类型
     *@see #THOST_FTDC_BRF_BankNotNeedRepeal
     *@see #THOST_FTDC_BRF_BankWaitingRepeal
     *@see #THOST_FTDC_BRF_BankBeenRepealed
     */
    public static final int SizeOf_TThostFtdcBankRepealFlagType=1;

    /**
     *期商无需自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBrokerRepealFlagType
     */
    public static final char THOST_FTDC_BRORF_BrokerNotNeedRepeal='0';

    /**
     *期商无需自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBrokerRepealFlagType
     */
    public static final String STRING_THOST_FTDC_BRORF_BrokerNotNeedRepeal="0";

    /**
     *期商待自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBrokerRepealFlagType
     */
    public static final char THOST_FTDC_BRORF_BrokerWaitingRepeal='1';

    /**
     *期商待自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBrokerRepealFlagType
     */
    public static final String STRING_THOST_FTDC_BRORF_BrokerWaitingRepeal="1";

    /**
     *期商已自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBrokerRepealFlagType
     */
    public static final char THOST_FTDC_BRORF_BrokerBeenRepealed='2';

    /**
     *期商已自动冲正 {@value}
     *@see #SizeOf_TThostFtdcBrokerRepealFlagType
     */
    public static final String STRING_THOST_FTDC_BRORF_BrokerBeenRepealed="2";

    /**
     *TFtdcBrokerRepealFlagType是一个期商冲正标志类型
     *@see #THOST_FTDC_BRORF_BrokerNotNeedRepeal
     *@see #THOST_FTDC_BRORF_BrokerWaitingRepeal
     *@see #THOST_FTDC_BRORF_BrokerBeenRepealed
     */
    public static final int SizeOf_TThostFtdcBrokerRepealFlagType=1;

    /**
     *银行 {@value}
     *@see #SizeOf_TThostFtdcInstitutionTypeType
     */
    public static final char THOST_FTDC_TS_Bank='0';

    /**
     *银行 {@value}
     *@see #SizeOf_TThostFtdcInstitutionTypeType
     */
    public static final String STRING_THOST_FTDC_TS_Bank="0";

    /**
     *期商 {@value}
     *@see #SizeOf_TThostFtdcInstitutionTypeType
     */
    public static final char THOST_FTDC_TS_Future='1';

    /**
     *期商 {@value}
     *@see #SizeOf_TThostFtdcInstitutionTypeType
     */
    public static final String STRING_THOST_FTDC_TS_Future="1";

    /**
     *券商 {@value}
     *@see #SizeOf_TThostFtdcInstitutionTypeType
     */
    public static final char THOST_FTDC_TS_Store='2';

    /**
     *券商 {@value}
     *@see #SizeOf_TThostFtdcInstitutionTypeType
     */
    public static final String STRING_THOST_FTDC_TS_Store="2";

    /**
     *TFtdcInstitutionTypeType是一个机构类别类型
     *@see #THOST_FTDC_TS_Bank
     *@see #THOST_FTDC_TS_Future
     *@see #THOST_FTDC_TS_Store
     */
    public static final int SizeOf_TThostFtdcInstitutionTypeType=1;

    /**
     *是最后分片 {@value}
     *@see #SizeOf_TThostFtdcLastFragmentType
     */
    public static final char THOST_FTDC_LF_Yes='0';

    /**
     *是最后分片 {@value}
     *@see #SizeOf_TThostFtdcLastFragmentType
     */
    public static final String STRING_THOST_FTDC_LF_Yes="0";

    /**
     *不是最后分片 {@value}
     *@see #SizeOf_TThostFtdcLastFragmentType
     */
    public static final char THOST_FTDC_LF_No='1';

    /**
     *不是最后分片 {@value}
     *@see #SizeOf_TThostFtdcLastFragmentType
     */
    public static final String STRING_THOST_FTDC_LF_No="1";

    /**
     *TFtdcLastFragmentType是一个最后分片标志类型
     *@see #THOST_FTDC_LF_Yes
     *@see #THOST_FTDC_LF_No
     */
    public static final int SizeOf_TThostFtdcLastFragmentType=1;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcBankAccStatusType
     */
    public static final char THOST_FTDC_BAS_Normal='0';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcBankAccStatusType
     */
    public static final String STRING_THOST_FTDC_BAS_Normal="0";

    /**
     *冻结 {@value}
     *@see #SizeOf_TThostFtdcBankAccStatusType
     */
    public static final char THOST_FTDC_BAS_Freeze='1';

    /**
     *冻结 {@value}
     *@see #SizeOf_TThostFtdcBankAccStatusType
     */
    public static final String STRING_THOST_FTDC_BAS_Freeze="1";

    /**
     *挂失 {@value}
     *@see #SizeOf_TThostFtdcBankAccStatusType
     */
    public static final char THOST_FTDC_BAS_ReportLoss='2';

    /**
     *挂失 {@value}
     *@see #SizeOf_TThostFtdcBankAccStatusType
     */
    public static final String STRING_THOST_FTDC_BAS_ReportLoss="2";

    /**
     *TFtdcBankAccStatusType是一个银行账户状态类型
     *@see #THOST_FTDC_BAS_Normal
     *@see #THOST_FTDC_BAS_Freeze
     *@see #THOST_FTDC_BAS_ReportLoss
     */
    public static final int SizeOf_TThostFtdcBankAccStatusType=1;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcMoneyAccountStatusType
     */
    public static final char THOST_FTDC_MAS_Normal='0';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcMoneyAccountStatusType
     */
    public static final String STRING_THOST_FTDC_MAS_Normal="0";

    /**
     *销户 {@value}
     *@see #SizeOf_TThostFtdcMoneyAccountStatusType
     */
    public static final char THOST_FTDC_MAS_Cancel='1';

    /**
     *销户 {@value}
     *@see #SizeOf_TThostFtdcMoneyAccountStatusType
     */
    public static final String STRING_THOST_FTDC_MAS_Cancel="1";

    /**
     *TFtdcMoneyAccountStatusType是一个资金账户状态类型
     *@see #THOST_FTDC_MAS_Normal
     *@see #THOST_FTDC_MAS_Cancel
     */
    public static final int SizeOf_TThostFtdcMoneyAccountStatusType=1;

    /**
     *指定存管 {@value}
     *@see #SizeOf_TThostFtdcManageStatusType
     */
    public static final char THOST_FTDC_MSS_Point='0';

    /**
     *指定存管 {@value}
     *@see #SizeOf_TThostFtdcManageStatusType
     */
    public static final String STRING_THOST_FTDC_MSS_Point="0";

    /**
     *预指定 {@value}
     *@see #SizeOf_TThostFtdcManageStatusType
     */
    public static final char THOST_FTDC_MSS_PrePoint='1';

    /**
     *预指定 {@value}
     *@see #SizeOf_TThostFtdcManageStatusType
     */
    public static final String STRING_THOST_FTDC_MSS_PrePoint="1";

    /**
     *撤销指定 {@value}
     *@see #SizeOf_TThostFtdcManageStatusType
     */
    public static final char THOST_FTDC_MSS_CancelPoint='2';

    /**
     *撤销指定 {@value}
     *@see #SizeOf_TThostFtdcManageStatusType
     */
    public static final String STRING_THOST_FTDC_MSS_CancelPoint="2";

    /**
     *TFtdcManageStatusType是一个存管状态类型
     *@see #THOST_FTDC_MSS_Point
     *@see #THOST_FTDC_MSS_PrePoint
     *@see #THOST_FTDC_MSS_CancelPoint
     */
    public static final int SizeOf_TThostFtdcManageStatusType=1;

    /**
     *银期转帐 {@value}
     *@see #SizeOf_TThostFtdcSystemTypeType
     */
    public static final char THOST_FTDC_SYT_FutureBankTransfer='0';

    /**
     *银期转帐 {@value}
     *@see #SizeOf_TThostFtdcSystemTypeType
     */
    public static final String STRING_THOST_FTDC_SYT_FutureBankTransfer="0";

    /**
     *银证转帐 {@value}
     *@see #SizeOf_TThostFtdcSystemTypeType
     */
    public static final char THOST_FTDC_SYT_StockBankTransfer='1';

    /**
     *银证转帐 {@value}
     *@see #SizeOf_TThostFtdcSystemTypeType
     */
    public static final String STRING_THOST_FTDC_SYT_StockBankTransfer="1";

    /**
     *第三方存管 {@value}
     *@see #SizeOf_TThostFtdcSystemTypeType
     */
    public static final char THOST_FTDC_SYT_TheThirdPartStore='2';

    /**
     *第三方存管 {@value}
     *@see #SizeOf_TThostFtdcSystemTypeType
     */
    public static final String STRING_THOST_FTDC_SYT_TheThirdPartStore="2";

    /**
     *TFtdcSystemTypeType是一个应用系统类型类型
     *@see #THOST_FTDC_SYT_FutureBankTransfer
     *@see #THOST_FTDC_SYT_StockBankTransfer
     *@see #THOST_FTDC_SYT_TheThirdPartStore
     */
    public static final int SizeOf_TThostFtdcSystemTypeType=1;

    /**
     *正常处理中 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final char THOST_FTDC_TEF_NormalProcessing='0';

    /**
     *正常处理中 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final String STRING_THOST_FTDC_TEF_NormalProcessing="0";

    /**
     *成功结束 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final char THOST_FTDC_TEF_Success='1';

    /**
     *成功结束 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final String STRING_THOST_FTDC_TEF_Success="1";

    /**
     *失败结束 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final char THOST_FTDC_TEF_Failed='2';

    /**
     *失败结束 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final String STRING_THOST_FTDC_TEF_Failed="2";

    /**
     *异常中 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final char THOST_FTDC_TEF_Abnormal='3';

    /**
     *异常中 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final String STRING_THOST_FTDC_TEF_Abnormal="3";

    /**
     *已人工异常处理 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final char THOST_FTDC_TEF_ManualProcessedForException='4';

    /**
     *已人工异常处理 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final String STRING_THOST_FTDC_TEF_ManualProcessedForException="4";

    /**
     *通讯异常 ，请人工处理 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final char THOST_FTDC_TEF_CommuFailedNeedManualProcess='5';

    /**
     *通讯异常 ，请人工处理 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final String STRING_THOST_FTDC_TEF_CommuFailedNeedManualProcess="5";

    /**
     *系统出错，请人工处理 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final char THOST_FTDC_TEF_SysErrorNeedManualProcess='6';

    /**
     *系统出错，请人工处理 {@value}
     *@see #SizeOf_TThostFtdcTxnEndFlagType
     */
    public static final String STRING_THOST_FTDC_TEF_SysErrorNeedManualProcess="6";

    /**
     *TFtdcTxnEndFlagType是一个银期转帐划转结果标志类型
     *@see #THOST_FTDC_TEF_NormalProcessing
     *@see #THOST_FTDC_TEF_Success
     *@see #THOST_FTDC_TEF_Failed
     *@see #THOST_FTDC_TEF_Abnormal
     *@see #THOST_FTDC_TEF_ManualProcessedForException
     *@see #THOST_FTDC_TEF_CommuFailedNeedManualProcess
     *@see #THOST_FTDC_TEF_SysErrorNeedManualProcess
     */
    public static final int SizeOf_TThostFtdcTxnEndFlagType=1;

    /**
     *未处理 {@value}
     *@see #SizeOf_TThostFtdcProcessStatusType
     */
    public static final char THOST_FTDC_PSS_NotProcess='0';

    /**
     *未处理 {@value}
     *@see #SizeOf_TThostFtdcProcessStatusType
     */
    public static final String STRING_THOST_FTDC_PSS_NotProcess="0";

    /**
     *开始处理 {@value}
     *@see #SizeOf_TThostFtdcProcessStatusType
     */
    public static final char THOST_FTDC_PSS_StartProcess='1';

    /**
     *开始处理 {@value}
     *@see #SizeOf_TThostFtdcProcessStatusType
     */
    public static final String STRING_THOST_FTDC_PSS_StartProcess="1";

    /**
     *处理完成 {@value}
     *@see #SizeOf_TThostFtdcProcessStatusType
     */
    public static final char THOST_FTDC_PSS_Finished='2';

    /**
     *处理完成 {@value}
     *@see #SizeOf_TThostFtdcProcessStatusType
     */
    public static final String STRING_THOST_FTDC_PSS_Finished="2";

    /**
     *TFtdcProcessStatusType是一个银期转帐服务处理状态类型
     *@see #THOST_FTDC_PSS_NotProcess
     *@see #THOST_FTDC_PSS_StartProcess
     *@see #THOST_FTDC_PSS_Finished
     */
    public static final int SizeOf_TThostFtdcProcessStatusType=1;

    /**
     *自然人 {@value}
     *@see #SizeOf_TThostFtdcCustTypeType
     */
    public static final char THOST_FTDC_CUSTT_Person='0';

    /**
     *自然人 {@value}
     *@see #SizeOf_TThostFtdcCustTypeType
     */
    public static final String STRING_THOST_FTDC_CUSTT_Person="0";

    /**
     *机构户 {@value}
     *@see #SizeOf_TThostFtdcCustTypeType
     */
    public static final char THOST_FTDC_CUSTT_Institution='1';

    /**
     *机构户 {@value}
     *@see #SizeOf_TThostFtdcCustTypeType
     */
    public static final String STRING_THOST_FTDC_CUSTT_Institution="1";

    /**
     *TFtdcCustTypeType是一个客户类型类型
     *@see #THOST_FTDC_CUSTT_Person
     *@see #THOST_FTDC_CUSTT_Institution
     */
    public static final int SizeOf_TThostFtdcCustTypeType=1;

    /**
     *入金，银行转期货 {@value}
     *@see #SizeOf_TThostFtdcFBTTransferDirectionType
     */
    public static final char THOST_FTDC_FBTTD_FromBankToFuture='1';

    /**
     *入金，银行转期货 {@value}
     *@see #SizeOf_TThostFtdcFBTTransferDirectionType
     */
    public static final String STRING_THOST_FTDC_FBTTD_FromBankToFuture="1";

    /**
     *出金，期货转银行 {@value}
     *@see #SizeOf_TThostFtdcFBTTransferDirectionType
     */
    public static final char THOST_FTDC_FBTTD_FromFutureToBank='2';

    /**
     *出金，期货转银行 {@value}
     *@see #SizeOf_TThostFtdcFBTTransferDirectionType
     */
    public static final String STRING_THOST_FTDC_FBTTD_FromFutureToBank="2";

    /**
     *TFtdcFBTTransferDirectionType是一个银期转帐方向类型
     *@see #THOST_FTDC_FBTTD_FromBankToFuture
     *@see #THOST_FTDC_FBTTD_FromFutureToBank
     */
    public static final int SizeOf_TThostFtdcFBTTransferDirectionType=1;

    /**
     *开户 {@value}
     *@see #SizeOf_TThostFtdcOpenOrDestroyType
     */
    public static final char THOST_FTDC_OOD_Open='1';

    /**
     *开户 {@value}
     *@see #SizeOf_TThostFtdcOpenOrDestroyType
     */
    public static final String STRING_THOST_FTDC_OOD_Open="1";

    /**
     *销户 {@value}
     *@see #SizeOf_TThostFtdcOpenOrDestroyType
     */
    public static final char THOST_FTDC_OOD_Destroy='0';

    /**
     *销户 {@value}
     *@see #SizeOf_TThostFtdcOpenOrDestroyType
     */
    public static final String STRING_THOST_FTDC_OOD_Destroy="0";

    /**
     *TFtdcOpenOrDestroyType是一个开销户类别类型
     *@see #THOST_FTDC_OOD_Open
     *@see #THOST_FTDC_OOD_Destroy
     */
    public static final int SizeOf_TThostFtdcOpenOrDestroyType=1;

    /**
     *未确认 {@value}
     *@see #SizeOf_TThostFtdcAvailabilityFlagType
     */
    public static final char THOST_FTDC_AVAF_Invalid='0';

    /**
     *未确认 {@value}
     *@see #SizeOf_TThostFtdcAvailabilityFlagType
     */
    public static final String STRING_THOST_FTDC_AVAF_Invalid="0";

    /**
     *有效 {@value}
     *@see #SizeOf_TThostFtdcAvailabilityFlagType
     */
    public static final char THOST_FTDC_AVAF_Valid='1';

    /**
     *有效 {@value}
     *@see #SizeOf_TThostFtdcAvailabilityFlagType
     */
    public static final String STRING_THOST_FTDC_AVAF_Valid="1";

    /**
     *冲正 {@value}
     *@see #SizeOf_TThostFtdcAvailabilityFlagType
     */
    public static final char THOST_FTDC_AVAF_Repeal='2';

    /**
     *冲正 {@value}
     *@see #SizeOf_TThostFtdcAvailabilityFlagType
     */
    public static final String STRING_THOST_FTDC_AVAF_Repeal="2";

    /**
     *TFtdcAvailabilityFlagType是一个有效标志类型
     *@see #THOST_FTDC_AVAF_Invalid
     *@see #THOST_FTDC_AVAF_Valid
     *@see #THOST_FTDC_AVAF_Repeal
     */
    public static final int SizeOf_TThostFtdcAvailabilityFlagType=1;

    /**
     *银行代理 {@value}
     *@see #SizeOf_TThostFtdcOrganTypeType
     */
    public static final char THOST_FTDC_OT_Bank='1';

    /**
     *银行代理 {@value}
     *@see #SizeOf_TThostFtdcOrganTypeType
     */
    public static final String STRING_THOST_FTDC_OT_Bank="1";

    /**
     *交易前置 {@value}
     *@see #SizeOf_TThostFtdcOrganTypeType
     */
    public static final char THOST_FTDC_OT_Future='2';

    /**
     *交易前置 {@value}
     *@see #SizeOf_TThostFtdcOrganTypeType
     */
    public static final String STRING_THOST_FTDC_OT_Future="2";

    /**
     *银期转帐平台管理 {@value}
     *@see #SizeOf_TThostFtdcOrganTypeType
     */
    public static final char THOST_FTDC_OT_PlateForm='9';

    /**
     *银期转帐平台管理 {@value}
     *@see #SizeOf_TThostFtdcOrganTypeType
     */
    public static final String STRING_THOST_FTDC_OT_PlateForm="9";

    /**
     *TFtdcOrganTypeType是一个机构类型类型
     *@see #THOST_FTDC_OT_Bank
     *@see #THOST_FTDC_OT_Future
     *@see #THOST_FTDC_OT_PlateForm
     */
    public static final int SizeOf_TThostFtdcOrganTypeType=1;

    /**
     *银行总行或期商总部 {@value}
     *@see #SizeOf_TThostFtdcOrganLevelType
     */
    public static final char THOST_FTDC_OL_HeadQuarters='1';

    /**
     *银行总行或期商总部 {@value}
     *@see #SizeOf_TThostFtdcOrganLevelType
     */
    public static final String STRING_THOST_FTDC_OL_HeadQuarters="1";

    /**
     *银行分中心或期货公司营业部 {@value}
     *@see #SizeOf_TThostFtdcOrganLevelType
     */
    public static final char THOST_FTDC_OL_Branch='2';

    /**
     *银行分中心或期货公司营业部 {@value}
     *@see #SizeOf_TThostFtdcOrganLevelType
     */
    public static final String STRING_THOST_FTDC_OL_Branch="2";

    /**
     *TFtdcOrganLevelType是一个机构级别类型
     *@see #THOST_FTDC_OL_HeadQuarters
     *@see #THOST_FTDC_OL_Branch
     */
    public static final int SizeOf_TThostFtdcOrganLevelType=1;

    /**
     *期商协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final char THOST_FTDC_PID_FutureProtocal='0';

    /**
     *期商协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final String STRING_THOST_FTDC_PID_FutureProtocal="0";

    /**
     *工行协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final char THOST_FTDC_PID_ICBCProtocal='1';

    /**
     *工行协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final String STRING_THOST_FTDC_PID_ICBCProtocal="1";

    /**
     *农行协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final char THOST_FTDC_PID_ABCProtocal='2';

    /**
     *农行协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final String STRING_THOST_FTDC_PID_ABCProtocal="2";

    /**
     *中国银行协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final char THOST_FTDC_PID_CBCProtocal='3';

    /**
     *中国银行协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final String STRING_THOST_FTDC_PID_CBCProtocal="3";

    /**
     *建行协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final char THOST_FTDC_PID_CCBProtocal='4';

    /**
     *建行协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final String STRING_THOST_FTDC_PID_CCBProtocal="4";

    /**
     *交行协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final char THOST_FTDC_PID_BOCOMProtocal='5';

    /**
     *交行协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final String STRING_THOST_FTDC_PID_BOCOMProtocal="5";

    /**
     *银期转帐平台协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final char THOST_FTDC_PID_FBTPlateFormProtocal='X';

    /**
     *银期转帐平台协议 {@value}
     *@see #SizeOf_TThostFtdcProtocalIDType
     */
    public static final String STRING_THOST_FTDC_PID_FBTPlateFormProtocal="X";

    /**
     *TFtdcProtocalIDType是一个协议类型类型
     *@see #THOST_FTDC_PID_FutureProtocal
     *@see #THOST_FTDC_PID_ICBCProtocal
     *@see #THOST_FTDC_PID_ABCProtocal
     *@see #THOST_FTDC_PID_CBCProtocal
     *@see #THOST_FTDC_PID_CCBProtocal
     *@see #THOST_FTDC_PID_BOCOMProtocal
     *@see #THOST_FTDC_PID_FBTPlateFormProtocal
     */
    public static final int SizeOf_TThostFtdcProtocalIDType=1;

    /**
     *短连接 {@value}
     *@see #SizeOf_TThostFtdcConnectModeType
     */
    public static final char THOST_FTDC_CM_ShortConnect='0';

    /**
     *短连接 {@value}
     *@see #SizeOf_TThostFtdcConnectModeType
     */
    public static final String STRING_THOST_FTDC_CM_ShortConnect="0";

    /**
     *长连接 {@value}
     *@see #SizeOf_TThostFtdcConnectModeType
     */
    public static final char THOST_FTDC_CM_LongConnect='1';

    /**
     *长连接 {@value}
     *@see #SizeOf_TThostFtdcConnectModeType
     */
    public static final String STRING_THOST_FTDC_CM_LongConnect="1";

    /**
     *TFtdcConnectModeType是一个套接字连接方式类型
     *@see #THOST_FTDC_CM_ShortConnect
     *@see #THOST_FTDC_CM_LongConnect
     */
    public static final int SizeOf_TThostFtdcConnectModeType=1;

    /**
     *异步 {@value}
     *@see #SizeOf_TThostFtdcSyncModeType
     */
    public static final char THOST_FTDC_SRM_ASync='0';

    /**
     *异步 {@value}
     *@see #SizeOf_TThostFtdcSyncModeType
     */
    public static final String STRING_THOST_FTDC_SRM_ASync="0";

    /**
     *同步 {@value}
     *@see #SizeOf_TThostFtdcSyncModeType
     */
    public static final char THOST_FTDC_SRM_Sync='1';

    /**
     *同步 {@value}
     *@see #SizeOf_TThostFtdcSyncModeType
     */
    public static final String STRING_THOST_FTDC_SRM_Sync="1";

    /**
     *TFtdcSyncModeType是一个套接字通信方式类型
     *@see #THOST_FTDC_SRM_ASync
     *@see #THOST_FTDC_SRM_Sync
     */
    public static final int SizeOf_TThostFtdcSyncModeType=1;

    /**
     *银行存折 {@value}
     *@see #SizeOf_TThostFtdcBankAccTypeType
     */
    public static final char THOST_FTDC_BAT_BankBook='1';

    /**
     *银行存折 {@value}
     *@see #SizeOf_TThostFtdcBankAccTypeType
     */
    public static final String STRING_THOST_FTDC_BAT_BankBook="1";

    /**
     *储蓄卡 {@value}
     *@see #SizeOf_TThostFtdcBankAccTypeType
     */
    public static final char THOST_FTDC_BAT_SavingCard='2';

    /**
     *储蓄卡 {@value}
     *@see #SizeOf_TThostFtdcBankAccTypeType
     */
    public static final String STRING_THOST_FTDC_BAT_SavingCard="2";

    /**
     *信用卡 {@value}
     *@see #SizeOf_TThostFtdcBankAccTypeType
     */
    public static final char THOST_FTDC_BAT_CreditCard='3';

    /**
     *信用卡 {@value}
     *@see #SizeOf_TThostFtdcBankAccTypeType
     */
    public static final String STRING_THOST_FTDC_BAT_CreditCard="3";

    /**
     *TFtdcBankAccTypeType是一个银行帐号类型类型
     *@see #THOST_FTDC_BAT_BankBook
     *@see #THOST_FTDC_BAT_SavingCard
     *@see #THOST_FTDC_BAT_CreditCard
     */
    public static final int SizeOf_TThostFtdcBankAccTypeType=1;

    /**
     *银行存折 {@value}
     *@see #SizeOf_TThostFtdcFutureAccTypeType
     */
    public static final char THOST_FTDC_FAT_BankBook='1';

    /**
     *银行存折 {@value}
     *@see #SizeOf_TThostFtdcFutureAccTypeType
     */
    public static final String STRING_THOST_FTDC_FAT_BankBook="1";

    /**
     *储蓄卡 {@value}
     *@see #SizeOf_TThostFtdcFutureAccTypeType
     */
    public static final char THOST_FTDC_FAT_SavingCard='2';

    /**
     *储蓄卡 {@value}
     *@see #SizeOf_TThostFtdcFutureAccTypeType
     */
    public static final String STRING_THOST_FTDC_FAT_SavingCard="2";

    /**
     *信用卡 {@value}
     *@see #SizeOf_TThostFtdcFutureAccTypeType
     */
    public static final char THOST_FTDC_FAT_CreditCard='3';

    /**
     *信用卡 {@value}
     *@see #SizeOf_TThostFtdcFutureAccTypeType
     */
    public static final String STRING_THOST_FTDC_FAT_CreditCard="3";

    /**
     *TFtdcFutureAccTypeType是一个期货公司帐号类型类型
     *@see #THOST_FTDC_FAT_BankBook
     *@see #THOST_FTDC_FAT_SavingCard
     *@see #THOST_FTDC_FAT_CreditCard
     */
    public static final int SizeOf_TThostFtdcFutureAccTypeType=1;

    /**
     *启用 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final char THOST_FTDC_OS_Ready='0';

    /**
     *启用 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final String STRING_THOST_FTDC_OS_Ready="0";

    /**
     *签到 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final char THOST_FTDC_OS_CheckIn='1';

    /**
     *签到 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final String STRING_THOST_FTDC_OS_CheckIn="1";

    /**
     *签退 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final char THOST_FTDC_OS_CheckOut='2';

    /**
     *签退 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final String STRING_THOST_FTDC_OS_CheckOut="2";

    /**
     *对帐文件到达 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final char THOST_FTDC_OS_CheckFileArrived='3';

    /**
     *对帐文件到达 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final String STRING_THOST_FTDC_OS_CheckFileArrived="3";

    /**
     *对帐 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final char THOST_FTDC_OS_CheckDetail='4';

    /**
     *对帐 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final String STRING_THOST_FTDC_OS_CheckDetail="4";

    /**
     *日终清理 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final char THOST_FTDC_OS_DayEndClean='5';

    /**
     *日终清理 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final String STRING_THOST_FTDC_OS_DayEndClean="5";

    /**
     *注销 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final char THOST_FTDC_OS_Invalid='9';

    /**
     *注销 {@value}
     *@see #SizeOf_TThostFtdcOrganStatusType
     */
    public static final String STRING_THOST_FTDC_OS_Invalid="9";

    /**
     *TFtdcOrganStatusType是一个接入机构状态类型
     *@see #THOST_FTDC_OS_Ready
     *@see #THOST_FTDC_OS_CheckIn
     *@see #THOST_FTDC_OS_CheckOut
     *@see #THOST_FTDC_OS_CheckFileArrived
     *@see #THOST_FTDC_OS_CheckDetail
     *@see #THOST_FTDC_OS_DayEndClean
     *@see #THOST_FTDC_OS_Invalid
     */
    public static final int SizeOf_TThostFtdcOrganStatusType=1;

    /**
     *按金额扣收 {@value}
     *@see #SizeOf_TThostFtdcCCBFeeModeType
     */
    public static final char THOST_FTDC_CCBFM_ByAmount='1';

    /**
     *按金额扣收 {@value}
     *@see #SizeOf_TThostFtdcCCBFeeModeType
     */
    public static final String STRING_THOST_FTDC_CCBFM_ByAmount="1";

    /**
     *按月扣收 {@value}
     *@see #SizeOf_TThostFtdcCCBFeeModeType
     */
    public static final char THOST_FTDC_CCBFM_ByMonth='2';

    /**
     *按月扣收 {@value}
     *@see #SizeOf_TThostFtdcCCBFeeModeType
     */
    public static final String STRING_THOST_FTDC_CCBFM_ByMonth="2";

    /**
     *TFtdcCCBFeeModeType是一个建行收费模式类型
     *@see #THOST_FTDC_CCBFM_ByAmount
     *@see #THOST_FTDC_CCBFM_ByMonth
     */
    public static final int SizeOf_TThostFtdcCCBFeeModeType=1;

    /**
     *客户端 {@value}
     *@see #SizeOf_TThostFtdcCommApiTypeType
     */
    public static final char THOST_FTDC_CAPIT_Client='1';

    /**
     *客户端 {@value}
     *@see #SizeOf_TThostFtdcCommApiTypeType
     */
    public static final String STRING_THOST_FTDC_CAPIT_Client="1";

    /**
     *服务端 {@value}
     *@see #SizeOf_TThostFtdcCommApiTypeType
     */
    public static final char THOST_FTDC_CAPIT_Server='2';

    /**
     *服务端 {@value}
     *@see #SizeOf_TThostFtdcCommApiTypeType
     */
    public static final String STRING_THOST_FTDC_CAPIT_Server="2";

    /**
     *交易系统的UserApi {@value}
     *@see #SizeOf_TThostFtdcCommApiTypeType
     */
    public static final char THOST_FTDC_CAPIT_UserApi='3';

    /**
     *交易系统的UserApi {@value}
     *@see #SizeOf_TThostFtdcCommApiTypeType
     */
    public static final String STRING_THOST_FTDC_CAPIT_UserApi="3";

    /**
     *TFtdcCommApiTypeType是一个通讯API类型类型
     *@see #THOST_FTDC_CAPIT_Client
     *@see #THOST_FTDC_CAPIT_Server
     *@see #THOST_FTDC_CAPIT_UserApi
     */
    public static final int SizeOf_TThostFtdcCommApiTypeType=1;

    /**
     *TFtdcServiceIDType是一个服务编号类型
     */
    public static final int SizeOf_TThostFtdcServiceIDType=4;

    /**
     *TFtdcServiceLineNoType是一个服务线路编号类型
     */
    public static final int SizeOf_TThostFtdcServiceLineNoType=4;

    /**
     *TFtdcServiceNameType是一个服务名类型
     */
    public static final int SizeOf_TThostFtdcServiceNameType=61;

    /**
     *已经连接 {@value}
     *@see #SizeOf_TThostFtdcLinkStatusType
     */
    public static final char THOST_FTDC_LS_Connected='1';

    /**
     *已经连接 {@value}
     *@see #SizeOf_TThostFtdcLinkStatusType
     */
    public static final String STRING_THOST_FTDC_LS_Connected="1";

    /**
     *没有连接 {@value}
     *@see #SizeOf_TThostFtdcLinkStatusType
     */
    public static final char THOST_FTDC_LS_Disconnected='2';

    /**
     *没有连接 {@value}
     *@see #SizeOf_TThostFtdcLinkStatusType
     */
    public static final String STRING_THOST_FTDC_LS_Disconnected="2";

    /**
     *TFtdcLinkStatusType是一个连接状态类型
     *@see #THOST_FTDC_LS_Connected
     *@see #THOST_FTDC_LS_Disconnected
     */
    public static final int SizeOf_TThostFtdcLinkStatusType=1;

    /**
     *TFtdcCommApiPointerType是一个通讯API指针类型
     */
    public static final int SizeOf_TThostFtdcCommApiPointerType=4;

    /**
     *不核对 {@value}
     *@see #SizeOf_TThostFtdcPwdFlagType
     */
    public static final char THOST_FTDC_BPWDF_NoCheck='0';

    /**
     *不核对 {@value}
     *@see #SizeOf_TThostFtdcPwdFlagType
     */
    public static final String STRING_THOST_FTDC_BPWDF_NoCheck="0";

    /**
     *明文核对 {@value}
     *@see #SizeOf_TThostFtdcPwdFlagType
     */
    public static final char THOST_FTDC_BPWDF_BlankCheck='1';

    /**
     *明文核对 {@value}
     *@see #SizeOf_TThostFtdcPwdFlagType
     */
    public static final String STRING_THOST_FTDC_BPWDF_BlankCheck="1";

    /**
     *密文核对 {@value}
     *@see #SizeOf_TThostFtdcPwdFlagType
     */
    public static final char THOST_FTDC_BPWDF_EncryptCheck='2';

    /**
     *密文核对 {@value}
     *@see #SizeOf_TThostFtdcPwdFlagType
     */
    public static final String STRING_THOST_FTDC_BPWDF_EncryptCheck="2";

    /**
     *TFtdcPwdFlagType是一个密码核对标志类型
     *@see #THOST_FTDC_BPWDF_NoCheck
     *@see #THOST_FTDC_BPWDF_BlankCheck
     *@see #THOST_FTDC_BPWDF_EncryptCheck
     */
    public static final int SizeOf_TThostFtdcPwdFlagType=1;

    /**
     *资金帐号 {@value}
     *@see #SizeOf_TThostFtdcSecuAccTypeType
     */
    public static final char THOST_FTDC_SAT_AccountID='1';

    /**
     *资金帐号 {@value}
     *@see #SizeOf_TThostFtdcSecuAccTypeType
     */
    public static final String STRING_THOST_FTDC_SAT_AccountID="1";

    /**
     *资金卡号 {@value}
     *@see #SizeOf_TThostFtdcSecuAccTypeType
     */
    public static final char THOST_FTDC_SAT_CardID='2';

    /**
     *资金卡号 {@value}
     *@see #SizeOf_TThostFtdcSecuAccTypeType
     */
    public static final String STRING_THOST_FTDC_SAT_CardID="2";

    /**
     *上海股东帐号 {@value}
     *@see #SizeOf_TThostFtdcSecuAccTypeType
     */
    public static final char THOST_FTDC_SAT_SHStockholderID='3';

    /**
     *上海股东帐号 {@value}
     *@see #SizeOf_TThostFtdcSecuAccTypeType
     */
    public static final String STRING_THOST_FTDC_SAT_SHStockholderID="3";

    /**
     *深圳股东帐号 {@value}
     *@see #SizeOf_TThostFtdcSecuAccTypeType
     */
    public static final char THOST_FTDC_SAT_SZStockholderID='4';

    /**
     *深圳股东帐号 {@value}
     *@see #SizeOf_TThostFtdcSecuAccTypeType
     */
    public static final String STRING_THOST_FTDC_SAT_SZStockholderID="4";

    /**
     *TFtdcSecuAccTypeType是一个期货帐号类型类型
     *@see #THOST_FTDC_SAT_AccountID
     *@see #THOST_FTDC_SAT_CardID
     *@see #THOST_FTDC_SAT_SHStockholderID
     *@see #THOST_FTDC_SAT_SZStockholderID
     */
    public static final int SizeOf_TThostFtdcSecuAccTypeType=1;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcTransferStatusType
     */
    public static final char THOST_FTDC_TRFS_Normal='0';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcTransferStatusType
     */
    public static final String STRING_THOST_FTDC_TRFS_Normal="0";

    /**
     *被冲正 {@value}
     *@see #SizeOf_TThostFtdcTransferStatusType
     */
    public static final char THOST_FTDC_TRFS_Repealed='1';

    /**
     *被冲正 {@value}
     *@see #SizeOf_TThostFtdcTransferStatusType
     */
    public static final String STRING_THOST_FTDC_TRFS_Repealed="1";

    /**
     *TFtdcTransferStatusType是一个转账交易状态类型
     *@see #THOST_FTDC_TRFS_Normal
     *@see #THOST_FTDC_TRFS_Repealed
     */
    public static final int SizeOf_TThostFtdcTransferStatusType=1;

    /**
     *期商 {@value}
     *@see #SizeOf_TThostFtdcSponsorTypeType
     */
    public static final char THOST_FTDC_SPTYPE_Broker='0';

    /**
     *期商 {@value}
     *@see #SizeOf_TThostFtdcSponsorTypeType
     */
    public static final String STRING_THOST_FTDC_SPTYPE_Broker="0";

    /**
     *银行 {@value}
     *@see #SizeOf_TThostFtdcSponsorTypeType
     */
    public static final char THOST_FTDC_SPTYPE_Bank='1';

    /**
     *银行 {@value}
     *@see #SizeOf_TThostFtdcSponsorTypeType
     */
    public static final String STRING_THOST_FTDC_SPTYPE_Bank="1";

    /**
     *TFtdcSponsorTypeType是一个发起方类型
     *@see #THOST_FTDC_SPTYPE_Broker
     *@see #THOST_FTDC_SPTYPE_Bank
     */
    public static final int SizeOf_TThostFtdcSponsorTypeType=1;

    /**
     *请求 {@value}
     *@see #SizeOf_TThostFtdcReqRspTypeType
     */
    public static final char THOST_FTDC_REQRSP_Request='0';

    /**
     *请求 {@value}
     *@see #SizeOf_TThostFtdcReqRspTypeType
     */
    public static final String STRING_THOST_FTDC_REQRSP_Request="0";

    /**
     *响应 {@value}
     *@see #SizeOf_TThostFtdcReqRspTypeType
     */
    public static final char THOST_FTDC_REQRSP_Response='1';

    /**
     *响应 {@value}
     *@see #SizeOf_TThostFtdcReqRspTypeType
     */
    public static final String STRING_THOST_FTDC_REQRSP_Response="1";

    /**
     *TFtdcReqRspTypeType是一个请求响应类别类型
     *@see #THOST_FTDC_REQRSP_Request
     *@see #THOST_FTDC_REQRSP_Response
     */
    public static final int SizeOf_TThostFtdcReqRspTypeType=1;

    /**
     *签到 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_SignIn='0';

    /**
     *签到 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_SignIn="0";

    /**
     *银行转期货 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_FromBankToFuture='1';

    /**
     *银行转期货 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_FromBankToFuture="1";

    /**
     *期货转银行 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_FromFutureToBank='2';

    /**
     *期货转银行 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_FromFutureToBank="2";

    /**
     *开户 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_OpenAccount='3';

    /**
     *开户 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_OpenAccount="3";

    /**
     *销户 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_CancelAccount='4';

    /**
     *销户 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_CancelAccount="4";

    /**
     *变更银行账户 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_ChangeAccount='5';

    /**
     *变更银行账户 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_ChangeAccount="5";

    /**
     *冲正银行转期货 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_RepealFromBankToFuture='6';

    /**
     *冲正银行转期货 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_RepealFromBankToFuture="6";

    /**
     *冲正期货转银行 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_RepealFromFutureToBank='7';

    /**
     *冲正期货转银行 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_RepealFromFutureToBank="7";

    /**
     *查询银行账户 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_QueryBankAccount='8';

    /**
     *查询银行账户 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_QueryBankAccount="8";

    /**
     *查询期货账户 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_QueryFutureAccount='9';

    /**
     *查询期货账户 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_QueryFutureAccount="9";

    /**
     *签退 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_SignOut='A';

    /**
     *签退 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_SignOut="A";

    /**
     *密钥同步 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_SyncKey='B';

    /**
     *密钥同步 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_SyncKey="B";

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final char THOST_FTDC_FBTUET_Other='Z';

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcFBTUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBTUET_Other="Z";

    /**
     *TFtdcFBTUserEventTypeType是一个银期转帐用户事件类型类型
     *@see #THOST_FTDC_FBTUET_SignIn
     *@see #THOST_FTDC_FBTUET_FromBankToFuture
     *@see #THOST_FTDC_FBTUET_FromFutureToBank
     *@see #THOST_FTDC_FBTUET_OpenAccount
     *@see #THOST_FTDC_FBTUET_CancelAccount
     *@see #THOST_FTDC_FBTUET_ChangeAccount
     *@see #THOST_FTDC_FBTUET_RepealFromBankToFuture
     *@see #THOST_FTDC_FBTUET_RepealFromFutureToBank
     *@see #THOST_FTDC_FBTUET_QueryBankAccount
     *@see #THOST_FTDC_FBTUET_QueryFutureAccount
     *@see #THOST_FTDC_FBTUET_SignOut
     *@see #THOST_FTDC_FBTUET_SyncKey
     *@see #THOST_FTDC_FBTUET_Other
     */
    public static final int SizeOf_TThostFtdcFBTUserEventTypeType=1;

    /**
     *TFtdcBankIDByBankType是一个银行自己的编码类型
     */
    public static final int SizeOf_TThostFtdcBankIDByBankType=21;

    /**
     *TFtdcBankOperNoType是一个银行操作员号类型
     */
    public static final int SizeOf_TThostFtdcBankOperNoType=4;

    /**
     *TFtdcBankCustNoType是一个银行客户号类型
     */
    public static final int SizeOf_TThostFtdcBankCustNoType=21;

    /**
     *TFtdcDBOPSeqNoType是一个递增的序列号类型
     */
    public static final int SizeOf_TThostFtdcDBOPSeqNoType=4;

    /**
     *TFtdcTableNameType是一个FBT表名类型
     */
    public static final int SizeOf_TThostFtdcTableNameType=61;

    /**
     *TFtdcPKNameType是一个FBT表操作主键名类型
     */
    public static final int SizeOf_TThostFtdcPKNameType=201;

    /**
     *TFtdcPKValueType是一个FBT表操作主键值类型
     */
    public static final int SizeOf_TThostFtdcPKValueType=501;

    /**
     *插入 {@value}
     *@see #SizeOf_TThostFtdcDBOperationType
     */
    public static final char THOST_FTDC_DBOP_Insert='0';

    /**
     *插入 {@value}
     *@see #SizeOf_TThostFtdcDBOperationType
     */
    public static final String STRING_THOST_FTDC_DBOP_Insert="0";

    /**
     *更新 {@value}
     *@see #SizeOf_TThostFtdcDBOperationType
     */
    public static final char THOST_FTDC_DBOP_Update='1';

    /**
     *更新 {@value}
     *@see #SizeOf_TThostFtdcDBOperationType
     */
    public static final String STRING_THOST_FTDC_DBOP_Update="1";

    /**
     *删除 {@value}
     *@see #SizeOf_TThostFtdcDBOperationType
     */
    public static final char THOST_FTDC_DBOP_Delete='2';

    /**
     *删除 {@value}
     *@see #SizeOf_TThostFtdcDBOperationType
     */
    public static final String STRING_THOST_FTDC_DBOP_Delete="2";

    /**
     *TFtdcDBOperationType是一个记录操作类型类型
     *@see #THOST_FTDC_DBOP_Insert
     *@see #THOST_FTDC_DBOP_Update
     *@see #THOST_FTDC_DBOP_Delete
     */
    public static final int SizeOf_TThostFtdcDBOperationType=1;

    /**
     *已同步 {@value}
     *@see #SizeOf_TThostFtdcSyncFlagType
     */
    public static final char THOST_FTDC_SYNF_Yes='0';

    /**
     *已同步 {@value}
     *@see #SizeOf_TThostFtdcSyncFlagType
     */
    public static final String STRING_THOST_FTDC_SYNF_Yes="0";

    /**
     *未同步 {@value}
     *@see #SizeOf_TThostFtdcSyncFlagType
     */
    public static final char THOST_FTDC_SYNF_No='1';

    /**
     *未同步 {@value}
     *@see #SizeOf_TThostFtdcSyncFlagType
     */
    public static final String STRING_THOST_FTDC_SYNF_No="1";

    /**
     *TFtdcSyncFlagType是一个同步标记类型
     *@see #THOST_FTDC_SYNF_Yes
     *@see #THOST_FTDC_SYNF_No
     */
    public static final int SizeOf_TThostFtdcSyncFlagType=1;

    /**
     *TFtdcTargetIDType是一个同步目标编号类型
     */
    public static final int SizeOf_TThostFtdcTargetIDType=4;

    /**
     *一次同步 {@value}
     *@see #SizeOf_TThostFtdcSyncTypeType
     */
    public static final char THOST_FTDC_SYNT_OneOffSync='0';

    /**
     *一次同步 {@value}
     *@see #SizeOf_TThostFtdcSyncTypeType
     */
    public static final String STRING_THOST_FTDC_SYNT_OneOffSync="0";

    /**
     *定时同步 {@value}
     *@see #SizeOf_TThostFtdcSyncTypeType
     */
    public static final char THOST_FTDC_SYNT_TimerSync='1';

    /**
     *定时同步 {@value}
     *@see #SizeOf_TThostFtdcSyncTypeType
     */
    public static final String STRING_THOST_FTDC_SYNT_TimerSync="1";

    /**
     *定时完全同步 {@value}
     *@see #SizeOf_TThostFtdcSyncTypeType
     */
    public static final char THOST_FTDC_SYNT_TimerFullSync='2';

    /**
     *定时完全同步 {@value}
     *@see #SizeOf_TThostFtdcSyncTypeType
     */
    public static final String STRING_THOST_FTDC_SYNT_TimerFullSync="2";

    /**
     *TFtdcSyncTypeType是一个同步类型类型
     *@see #THOST_FTDC_SYNT_OneOffSync
     *@see #THOST_FTDC_SYNT_TimerSync
     *@see #THOST_FTDC_SYNT_TimerFullSync
     */
    public static final int SizeOf_TThostFtdcSyncTypeType=1;

    /**
     *TFtdcFBETimeType是一个各种换汇时间类型
     */
    public static final int SizeOf_TThostFtdcFBETimeType=7;

    /**
     *TFtdcFBEBankNoType是一个换汇银行行号类型
     */
    public static final int SizeOf_TThostFtdcFBEBankNoType=13;

    /**
     *TFtdcFBECertNoType是一个换汇凭证号类型
     */
    public static final int SizeOf_TThostFtdcFBECertNoType=13;

    /**
     *结汇 {@value}
     *@see #SizeOf_TThostFtdcExDirectionType
     */
    public static final char THOST_FTDC_FBEDIR_Settlement='0';

    /**
     *结汇 {@value}
     *@see #SizeOf_TThostFtdcExDirectionType
     */
    public static final String STRING_THOST_FTDC_FBEDIR_Settlement="0";

    /**
     *售汇 {@value}
     *@see #SizeOf_TThostFtdcExDirectionType
     */
    public static final char THOST_FTDC_FBEDIR_Sale='1';

    /**
     *售汇 {@value}
     *@see #SizeOf_TThostFtdcExDirectionType
     */
    public static final String STRING_THOST_FTDC_FBEDIR_Sale="1";

    /**
     *TFtdcExDirectionType是一个换汇方向类型
     *@see #THOST_FTDC_FBEDIR_Settlement
     *@see #THOST_FTDC_FBEDIR_Sale
     */
    public static final int SizeOf_TThostFtdcExDirectionType=1;

    /**
     *TFtdcFBEBankAccountType是一个换汇银行账户类型
     */
    public static final int SizeOf_TThostFtdcFBEBankAccountType=33;

    /**
     *TFtdcFBEBankAccountNameType是一个换汇银行账户名类型
     */
    public static final int SizeOf_TThostFtdcFBEBankAccountNameType=61;

    /**
     *TFtdcFBEAmtType是一个各种换汇金额类型
     */
    public static final int SizeOf_TThostFtdcFBEAmtType=8;

    /**
     *TFtdcFBEBusinessTypeType是一个换汇业务类型类型
     */
    public static final int SizeOf_TThostFtdcFBEBusinessTypeType=3;

    /**
     *TFtdcFBEPostScriptType是一个换汇附言类型
     */
    public static final int SizeOf_TThostFtdcFBEPostScriptType=61;

    /**
     *TFtdcFBERemarkType是一个换汇备注类型
     */
    public static final int SizeOf_TThostFtdcFBERemarkType=71;

    /**
     *TFtdcExRateType是一个换汇汇率类型
     */
    public static final int SizeOf_TThostFtdcExRateType=8;

    /**
     *成功 {@value}
     *@see #SizeOf_TThostFtdcFBEResultFlagType
     */
    public static final char THOST_FTDC_FBERES_Success='0';

    /**
     *成功 {@value}
     *@see #SizeOf_TThostFtdcFBEResultFlagType
     */
    public static final String STRING_THOST_FTDC_FBERES_Success="0";

    /**
     *账户余额不足 {@value}
     *@see #SizeOf_TThostFtdcFBEResultFlagType
     */
    public static final char THOST_FTDC_FBERES_InsufficientBalance='1';

    /**
     *账户余额不足 {@value}
     *@see #SizeOf_TThostFtdcFBEResultFlagType
     */
    public static final String STRING_THOST_FTDC_FBERES_InsufficientBalance="1";

    /**
     *交易结果未知 {@value}
     *@see #SizeOf_TThostFtdcFBEResultFlagType
     */
    public static final char THOST_FTDC_FBERES_UnknownTrading='8';

    /**
     *交易结果未知 {@value}
     *@see #SizeOf_TThostFtdcFBEResultFlagType
     */
    public static final String STRING_THOST_FTDC_FBERES_UnknownTrading="8";

    /**
     *失败 {@value}
     *@see #SizeOf_TThostFtdcFBEResultFlagType
     */
    public static final char THOST_FTDC_FBERES_Fail='x';

    /**
     *失败 {@value}
     *@see #SizeOf_TThostFtdcFBEResultFlagType
     */
    public static final String STRING_THOST_FTDC_FBERES_Fail="x";

    /**
     *TFtdcFBEResultFlagType是一个换汇成功标志类型
     *@see #THOST_FTDC_FBERES_Success
     *@see #THOST_FTDC_FBERES_InsufficientBalance
     *@see #THOST_FTDC_FBERES_UnknownTrading
     *@see #THOST_FTDC_FBERES_Fail
     */
    public static final int SizeOf_TThostFtdcFBEResultFlagType=1;

    /**
     *TFtdcFBERtnMsgType是一个换汇返回信息类型
     */
    public static final int SizeOf_TThostFtdcFBERtnMsgType=61;

    /**
     *TFtdcFBEExtendMsgType是一个换汇扩展信息类型
     */
    public static final int SizeOf_TThostFtdcFBEExtendMsgType=61;

    /**
     *TFtdcFBEBusinessSerialType是一个换汇记账流水号类型
     */
    public static final int SizeOf_TThostFtdcFBEBusinessSerialType=31;

    /**
     *TFtdcFBESystemSerialType是一个换汇流水号类型
     */
    public static final int SizeOf_TThostFtdcFBESystemSerialType=21;

    /**
     *TFtdcFBETotalExCntType是一个换汇交易总笔数类型
     */
    public static final int SizeOf_TThostFtdcFBETotalExCntType=4;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcFBEExchStatusType
     */
    public static final char THOST_FTDC_FBEES_Normal='0';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcFBEExchStatusType
     */
    public static final String STRING_THOST_FTDC_FBEES_Normal="0";

    /**
     *交易重发 {@value}
     *@see #SizeOf_TThostFtdcFBEExchStatusType
     */
    public static final char THOST_FTDC_FBEES_ReExchange='1';

    /**
     *交易重发 {@value}
     *@see #SizeOf_TThostFtdcFBEExchStatusType
     */
    public static final String STRING_THOST_FTDC_FBEES_ReExchange="1";

    /**
     *TFtdcFBEExchStatusType是一个换汇交易状态类型
     *@see #THOST_FTDC_FBEES_Normal
     *@see #THOST_FTDC_FBEES_ReExchange
     */
    public static final int SizeOf_TThostFtdcFBEExchStatusType=1;

    /**
     *数据包 {@value}
     *@see #SizeOf_TThostFtdcFBEFileFlagType
     */
    public static final char THOST_FTDC_FBEFG_DataPackage='0';

    /**
     *数据包 {@value}
     *@see #SizeOf_TThostFtdcFBEFileFlagType
     */
    public static final String STRING_THOST_FTDC_FBEFG_DataPackage="0";

    /**
     *文件 {@value}
     *@see #SizeOf_TThostFtdcFBEFileFlagType
     */
    public static final char THOST_FTDC_FBEFG_File='1';

    /**
     *文件 {@value}
     *@see #SizeOf_TThostFtdcFBEFileFlagType
     */
    public static final String STRING_THOST_FTDC_FBEFG_File="1";

    /**
     *TFtdcFBEFileFlagType是一个换汇文件标志类型
     *@see #THOST_FTDC_FBEFG_DataPackage
     *@see #THOST_FTDC_FBEFG_File
     */
    public static final int SizeOf_TThostFtdcFBEFileFlagType=1;

    /**
     *未交易 {@value}
     *@see #SizeOf_TThostFtdcFBEAlreadyTradeType
     */
    public static final char THOST_FTDC_FBEAT_NotTrade='0';

    /**
     *未交易 {@value}
     *@see #SizeOf_TThostFtdcFBEAlreadyTradeType
     */
    public static final String STRING_THOST_FTDC_FBEAT_NotTrade="0";

    /**
     *已交易 {@value}
     *@see #SizeOf_TThostFtdcFBEAlreadyTradeType
     */
    public static final char THOST_FTDC_FBEAT_Trade='1';

    /**
     *已交易 {@value}
     *@see #SizeOf_TThostFtdcFBEAlreadyTradeType
     */
    public static final String STRING_THOST_FTDC_FBEAT_Trade="1";

    /**
     *TFtdcFBEAlreadyTradeType是一个换汇已交易标志类型
     *@see #THOST_FTDC_FBEAT_NotTrade
     *@see #THOST_FTDC_FBEAT_Trade
     */
    public static final int SizeOf_TThostFtdcFBEAlreadyTradeType=1;

    /**
     *TFtdcFBEOpenBankType是一个换汇账户开户行类型
     */
    public static final int SizeOf_TThostFtdcFBEOpenBankType=61;

    /**
     *签到 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final char THOST_FTDC_FBEUET_SignIn='0';

    /**
     *签到 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBEUET_SignIn="0";

    /**
     *换汇 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final char THOST_FTDC_FBEUET_Exchange='1';

    /**
     *换汇 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBEUET_Exchange="1";

    /**
     *换汇重发 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final char THOST_FTDC_FBEUET_ReExchange='2';

    /**
     *换汇重发 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBEUET_ReExchange="2";

    /**
     *银行账户查询 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final char THOST_FTDC_FBEUET_QueryBankAccount='3';

    /**
     *银行账户查询 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBEUET_QueryBankAccount="3";

    /**
     *换汇明细查询 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final char THOST_FTDC_FBEUET_QueryExchDetial='4';

    /**
     *换汇明细查询 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBEUET_QueryExchDetial="4";

    /**
     *换汇汇总查询 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final char THOST_FTDC_FBEUET_QueryExchSummary='5';

    /**
     *换汇汇总查询 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBEUET_QueryExchSummary="5";

    /**
     *换汇汇率查询 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final char THOST_FTDC_FBEUET_QueryExchRate='6';

    /**
     *换汇汇率查询 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBEUET_QueryExchRate="6";

    /**
     *对账文件通知 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final char THOST_FTDC_FBEUET_CheckBankAccount='7';

    /**
     *对账文件通知 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBEUET_CheckBankAccount="7";

    /**
     *签退 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final char THOST_FTDC_FBEUET_SignOut='8';

    /**
     *签退 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBEUET_SignOut="8";

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final char THOST_FTDC_FBEUET_Other='Z';

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcFBEUserEventTypeType
     */
    public static final String STRING_THOST_FTDC_FBEUET_Other="Z";

    /**
     *TFtdcFBEUserEventTypeType是一个银期换汇用户事件类型类型
     *@see #THOST_FTDC_FBEUET_SignIn
     *@see #THOST_FTDC_FBEUET_Exchange
     *@see #THOST_FTDC_FBEUET_ReExchange
     *@see #THOST_FTDC_FBEUET_QueryBankAccount
     *@see #THOST_FTDC_FBEUET_QueryExchDetial
     *@see #THOST_FTDC_FBEUET_QueryExchSummary
     *@see #THOST_FTDC_FBEUET_QueryExchRate
     *@see #THOST_FTDC_FBEUET_CheckBankAccount
     *@see #THOST_FTDC_FBEUET_SignOut
     *@see #THOST_FTDC_FBEUET_Other
     */
    public static final int SizeOf_TThostFtdcFBEUserEventTypeType=1;

    /**
     *TFtdcFBEFileNameType是一个换汇相关文件名类型
     */
    public static final int SizeOf_TThostFtdcFBEFileNameType=21;

    /**
     *TFtdcFBEBatchSerialType是一个换汇批次号类型
     */
    public static final int SizeOf_TThostFtdcFBEBatchSerialType=21;

    /**
     *未处理 {@value}
     *@see #SizeOf_TThostFtdcFBEReqFlagType
     */
    public static final char THOST_FTDC_FBERF_UnProcessed='0';

    /**
     *未处理 {@value}
     *@see #SizeOf_TThostFtdcFBEReqFlagType
     */
    public static final String STRING_THOST_FTDC_FBERF_UnProcessed="0";

    /**
     *等待发送 {@value}
     *@see #SizeOf_TThostFtdcFBEReqFlagType
     */
    public static final char THOST_FTDC_FBERF_WaitSend='1';

    /**
     *等待发送 {@value}
     *@see #SizeOf_TThostFtdcFBEReqFlagType
     */
    public static final String STRING_THOST_FTDC_FBERF_WaitSend="1";

    /**
     *发送成功 {@value}
     *@see #SizeOf_TThostFtdcFBEReqFlagType
     */
    public static final char THOST_FTDC_FBERF_SendSuccess='2';

    /**
     *发送成功 {@value}
     *@see #SizeOf_TThostFtdcFBEReqFlagType
     */
    public static final String STRING_THOST_FTDC_FBERF_SendSuccess="2";

    /**
     *发送失败 {@value}
     *@see #SizeOf_TThostFtdcFBEReqFlagType
     */
    public static final char THOST_FTDC_FBERF_SendFailed='3';

    /**
     *发送失败 {@value}
     *@see #SizeOf_TThostFtdcFBEReqFlagType
     */
    public static final String STRING_THOST_FTDC_FBERF_SendFailed="3";

    /**
     *等待重发 {@value}
     *@see #SizeOf_TThostFtdcFBEReqFlagType
     */
    public static final char THOST_FTDC_FBERF_WaitReSend='4';

    /**
     *等待重发 {@value}
     *@see #SizeOf_TThostFtdcFBEReqFlagType
     */
    public static final String STRING_THOST_FTDC_FBERF_WaitReSend="4";

    /**
     *TFtdcFBEReqFlagType是一个换汇发送标志类型
     *@see #THOST_FTDC_FBERF_UnProcessed
     *@see #THOST_FTDC_FBERF_WaitSend
     *@see #THOST_FTDC_FBERF_SendSuccess
     *@see #THOST_FTDC_FBERF_SendFailed
     *@see #THOST_FTDC_FBERF_WaitReSend
     */
    public static final int SizeOf_TThostFtdcFBEReqFlagType=1;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final char THOST_FTDC_NC_NOERROR='0';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final String STRING_THOST_FTDC_NC_NOERROR="0";

    /**
     *警示 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final char THOST_FTDC_NC_Warn='1';

    /**
     *警示 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final String STRING_THOST_FTDC_NC_Warn="1";

    /**
     *追保 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final char THOST_FTDC_NC_Call='2';

    /**
     *追保 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final String STRING_THOST_FTDC_NC_Call="2";

    /**
     *强平 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final char THOST_FTDC_NC_Force='3';

    /**
     *强平 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final String STRING_THOST_FTDC_NC_Force="3";

    /**
     *穿仓 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final char THOST_FTDC_NC_CHUANCANG='4';

    /**
     *穿仓 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final String STRING_THOST_FTDC_NC_CHUANCANG="4";

    /**
     *异常 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final char THOST_FTDC_NC_Exception='5';

    /**
     *异常 {@value}
     *@see #SizeOf_TThostFtdcNotifyClassType
     */
    public static final String STRING_THOST_FTDC_NC_Exception="5";

    /**
     *TFtdcNotifyClassType是一个风险通知类型类型
     *@see #THOST_FTDC_NC_NOERROR
     *@see #THOST_FTDC_NC_Warn
     *@see #THOST_FTDC_NC_Call
     *@see #THOST_FTDC_NC_Force
     *@see #THOST_FTDC_NC_CHUANCANG
     *@see #THOST_FTDC_NC_Exception
     */
    public static final int SizeOf_TThostFtdcNotifyClassType=1;

    /**
     *TFtdcRiskNofityInfoType是一个客户风险通知消息类型
     */
    public static final int SizeOf_TThostFtdcRiskNofityInfoType=257;

    /**
     *TFtdcForceCloseSceneIdType是一个强平场景编号类型
     */
    public static final int SizeOf_TThostFtdcForceCloseSceneIdType=24;

    /**
     *手工强平 {@value}
     *@see #SizeOf_TThostFtdcForceCloseTypeType
     */
    public static final char THOST_FTDC_FCT_Manual='0';

    /**
     *手工强平 {@value}
     *@see #SizeOf_TThostFtdcForceCloseTypeType
     */
    public static final String STRING_THOST_FTDC_FCT_Manual="0";

    /**
     *单一投资者辅助强平 {@value}
     *@see #SizeOf_TThostFtdcForceCloseTypeType
     */
    public static final char THOST_FTDC_FCT_Single='1';

    /**
     *单一投资者辅助强平 {@value}
     *@see #SizeOf_TThostFtdcForceCloseTypeType
     */
    public static final String STRING_THOST_FTDC_FCT_Single="1";

    /**
     *批量投资者辅助强平 {@value}
     *@see #SizeOf_TThostFtdcForceCloseTypeType
     */
    public static final char THOST_FTDC_FCT_Group='2';

    /**
     *批量投资者辅助强平 {@value}
     *@see #SizeOf_TThostFtdcForceCloseTypeType
     */
    public static final String STRING_THOST_FTDC_FCT_Group="2";

    /**
     *TFtdcForceCloseTypeType是一个强平单类型类型
     *@see #THOST_FTDC_FCT_Manual
     *@see #THOST_FTDC_FCT_Single
     *@see #THOST_FTDC_FCT_Group
     */
    public static final int SizeOf_TThostFtdcForceCloseTypeType=1;

    /**
     *TFtdcInstrumentIDsType是一个多个产品代码,用+分隔,如cu+zn类型
     */
    public static final int SizeOf_TThostFtdcInstrumentIDsType=101;

    /**
     *系统通知 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyMethodType
     */
    public static final char THOST_FTDC_RNM_System='0';

    /**
     *系统通知 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyMethodType
     */
    public static final String STRING_THOST_FTDC_RNM_System="0";

    /**
     *短信通知 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyMethodType
     */
    public static final char THOST_FTDC_RNM_SMS='1';

    /**
     *短信通知 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyMethodType
     */
    public static final String STRING_THOST_FTDC_RNM_SMS="1";

    /**
     *邮件通知 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyMethodType
     */
    public static final char THOST_FTDC_RNM_EMail='2';

    /**
     *邮件通知 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyMethodType
     */
    public static final String STRING_THOST_FTDC_RNM_EMail="2";

    /**
     *人工通知 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyMethodType
     */
    public static final char THOST_FTDC_RNM_Manual='3';

    /**
     *人工通知 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyMethodType
     */
    public static final String STRING_THOST_FTDC_RNM_Manual="3";

    /**
     *TFtdcRiskNotifyMethodType是一个风险通知途径类型
     *@see #THOST_FTDC_RNM_System
     *@see #THOST_FTDC_RNM_SMS
     *@see #THOST_FTDC_RNM_EMail
     *@see #THOST_FTDC_RNM_Manual
     */
    public static final int SizeOf_TThostFtdcRiskNotifyMethodType=1;

    /**
     *未生成 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final char THOST_FTDC_RNS_NotGen='0';

    /**
     *未生成 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final String STRING_THOST_FTDC_RNS_NotGen="0";

    /**
     *已生成未发送 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final char THOST_FTDC_RNS_Generated='1';

    /**
     *已生成未发送 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final String STRING_THOST_FTDC_RNS_Generated="1";

    /**
     *发送失败 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final char THOST_FTDC_RNS_SendError='2';

    /**
     *发送失败 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final String STRING_THOST_FTDC_RNS_SendError="2";

    /**
     *已发送未接收 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final char THOST_FTDC_RNS_SendOk='3';

    /**
     *已发送未接收 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final String STRING_THOST_FTDC_RNS_SendOk="3";

    /**
     *已接收未确认 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final char THOST_FTDC_RNS_Received='4';

    /**
     *已接收未确认 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final String STRING_THOST_FTDC_RNS_Received="4";

    /**
     *已确认 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final char THOST_FTDC_RNS_Confirmed='5';

    /**
     *已确认 {@value}
     *@see #SizeOf_TThostFtdcRiskNotifyStatusType
     */
    public static final String STRING_THOST_FTDC_RNS_Confirmed="5";

    /**
     *TFtdcRiskNotifyStatusType是一个风险通知状态类型
     *@see #THOST_FTDC_RNS_NotGen
     *@see #THOST_FTDC_RNS_Generated
     *@see #THOST_FTDC_RNS_SendError
     *@see #THOST_FTDC_RNS_SendOk
     *@see #THOST_FTDC_RNS_Received
     *@see #THOST_FTDC_RNS_Confirmed
     */
    public static final int SizeOf_TThostFtdcRiskNotifyStatusType=1;

    /**
     *导出数据 {@value}
     *@see #SizeOf_TThostFtdcRiskUserEventType
     */
    public static final char THOST_FTDC_RUE_ExportData='0';

    /**
     *导出数据 {@value}
     *@see #SizeOf_TThostFtdcRiskUserEventType
     */
    public static final String STRING_THOST_FTDC_RUE_ExportData="0";

    /**
     *TFtdcRiskUserEventType是一个风控用户操作事件类型
     *@see #THOST_FTDC_RUE_ExportData
     */
    public static final int SizeOf_TThostFtdcRiskUserEventType=1;

    /**
     *TFtdcParamIDType是一个参数代码类型
     */
    public static final int SizeOf_TThostFtdcParamIDType=4;

    /**
     *TFtdcParamNameType是一个参数名类型
     */
    public static final int SizeOf_TThostFtdcParamNameType=41;

    /**
     *TFtdcParamValueType是一个参数值类型
     */
    public static final int SizeOf_TThostFtdcParamValueType=41;

    /**
     *使用最新价升序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final char THOST_FTDC_COST_LastPriceAsc='0';

    /**
     *使用最新价升序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final String STRING_THOST_FTDC_COST_LastPriceAsc="0";

    /**
     *使用最新价降序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final char THOST_FTDC_COST_LastPriceDesc='1';

    /**
     *使用最新价降序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final String STRING_THOST_FTDC_COST_LastPriceDesc="1";

    /**
     *使用卖价升序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final char THOST_FTDC_COST_AskPriceAsc='2';

    /**
     *使用卖价升序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final String STRING_THOST_FTDC_COST_AskPriceAsc="2";

    /**
     *使用卖价降序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final char THOST_FTDC_COST_AskPriceDesc='3';

    /**
     *使用卖价降序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final String STRING_THOST_FTDC_COST_AskPriceDesc="3";

    /**
     *使用买价升序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final char THOST_FTDC_COST_BidPriceAsc='4';

    /**
     *使用买价升序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final String STRING_THOST_FTDC_COST_BidPriceAsc="4";

    /**
     *使用买价降序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final char THOST_FTDC_COST_BidPriceDesc='5';

    /**
     *使用买价降序 {@value}
     *@see #SizeOf_TThostFtdcConditionalOrderSortTypeType
     */
    public static final String STRING_THOST_FTDC_COST_BidPriceDesc="5";

    /**
     *TFtdcConditionalOrderSortTypeType是一个条件单索引条件类型
     *@see #THOST_FTDC_COST_LastPriceAsc
     *@see #THOST_FTDC_COST_LastPriceDesc
     *@see #THOST_FTDC_COST_AskPriceAsc
     *@see #THOST_FTDC_COST_AskPriceDesc
     *@see #THOST_FTDC_COST_BidPriceAsc
     *@see #THOST_FTDC_COST_BidPriceDesc
     */
    public static final int SizeOf_TThostFtdcConditionalOrderSortTypeType=1;

    /**
     *未发送 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final char THOST_FTDC_UOAST_NoSend='0';

    /**
     *未发送 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final String STRING_THOST_FTDC_UOAST_NoSend="0";

    /**
     *已发送 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final char THOST_FTDC_UOAST_Sended='1';

    /**
     *已发送 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final String STRING_THOST_FTDC_UOAST_Sended="1";

    /**
     *已生成 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final char THOST_FTDC_UOAST_Generated='2';

    /**
     *已生成 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final String STRING_THOST_FTDC_UOAST_Generated="2";

    /**
     *报送失败 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final char THOST_FTDC_UOAST_SendFail='3';

    /**
     *报送失败 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final String STRING_THOST_FTDC_UOAST_SendFail="3";

    /**
     *接收成功 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final char THOST_FTDC_UOAST_Success='4';

    /**
     *接收成功 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final String STRING_THOST_FTDC_UOAST_Success="4";

    /**
     *接收失败 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final char THOST_FTDC_UOAST_Fail='5';

    /**
     *接收失败 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final String STRING_THOST_FTDC_UOAST_Fail="5";

    /**
     *取消报送 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final char THOST_FTDC_UOAST_Cancel='6';

    /**
     *取消报送 {@value}
     *@see #SizeOf_TThostFtdcSendTypeType
     */
    public static final String STRING_THOST_FTDC_UOAST_Cancel="6";

    /**
     *TFtdcSendTypeType是一个报送状态类型
     *@see #THOST_FTDC_UOAST_NoSend
     *@see #THOST_FTDC_UOAST_Sended
     *@see #THOST_FTDC_UOAST_Generated
     *@see #THOST_FTDC_UOAST_SendFail
     *@see #THOST_FTDC_UOAST_Success
     *@see #THOST_FTDC_UOAST_Fail
     *@see #THOST_FTDC_UOAST_Cancel
     */
    public static final int SizeOf_TThostFtdcSendTypeType=1;

    /**
     *未申请 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final char THOST_FTDC_UOACS_NoApply='1';

    /**
     *未申请 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final String STRING_THOST_FTDC_UOACS_NoApply="1";

    /**
     *已提交申请 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final char THOST_FTDC_UOACS_Submited='2';

    /**
     *已提交申请 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final String STRING_THOST_FTDC_UOACS_Submited="2";

    /**
     *已发送申请 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final char THOST_FTDC_UOACS_Sended='3';

    /**
     *已发送申请 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final String STRING_THOST_FTDC_UOACS_Sended="3";

    /**
     *完成 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final char THOST_FTDC_UOACS_Success='4';

    /**
     *完成 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final String STRING_THOST_FTDC_UOACS_Success="4";

    /**
     *拒绝 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final char THOST_FTDC_UOACS_Refuse='5';

    /**
     *拒绝 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final String STRING_THOST_FTDC_UOACS_Refuse="5";

    /**
     *已撤销编码 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final char THOST_FTDC_UOACS_Cancel='6';

    /**
     *已撤销编码 {@value}
     *@see #SizeOf_TThostFtdcClientIDStatusType
     */
    public static final String STRING_THOST_FTDC_UOACS_Cancel="6";

    /**
     *TFtdcClientIDStatusType是一个交易编码状态类型
     *@see #THOST_FTDC_UOACS_NoApply
     *@see #THOST_FTDC_UOACS_Submited
     *@see #THOST_FTDC_UOACS_Sended
     *@see #THOST_FTDC_UOACS_Success
     *@see #THOST_FTDC_UOACS_Refuse
     *@see #THOST_FTDC_UOACS_Cancel
     */
    public static final int SizeOf_TThostFtdcClientIDStatusType=1;

    /**
     *TFtdcIndustryIDType是一个行业编码类型
     */
    public static final int SizeOf_TThostFtdcIndustryIDType=17;

    /**
     *TFtdcQuestionIDType是一个特有信息编号类型
     */
    public static final int SizeOf_TThostFtdcQuestionIDType=5;

    /**
     *TFtdcQuestionContentType是一个特有信息说明类型
     */
    public static final int SizeOf_TThostFtdcQuestionContentType=41;

    /**
     *TFtdcOptionIDType是一个选项编号类型
     */
    public static final int SizeOf_TThostFtdcOptionIDType=13;

    /**
     *TFtdcOptionContentType是一个选项说明类型
     */
    public static final int SizeOf_TThostFtdcOptionContentType=61;

    /**
     *单选 {@value}
     *@see #SizeOf_TThostFtdcQuestionTypeType
     */
    public static final char THOST_FTDC_QT_Radio='1';

    /**
     *单选 {@value}
     *@see #SizeOf_TThostFtdcQuestionTypeType
     */
    public static final String STRING_THOST_FTDC_QT_Radio="1";

    /**
     *多选 {@value}
     *@see #SizeOf_TThostFtdcQuestionTypeType
     */
    public static final char THOST_FTDC_QT_Option='2';

    /**
     *多选 {@value}
     *@see #SizeOf_TThostFtdcQuestionTypeType
     */
    public static final String STRING_THOST_FTDC_QT_Option="2";

    /**
     *填空 {@value}
     *@see #SizeOf_TThostFtdcQuestionTypeType
     */
    public static final char THOST_FTDC_QT_Blank='3';

    /**
     *填空 {@value}
     *@see #SizeOf_TThostFtdcQuestionTypeType
     */
    public static final String STRING_THOST_FTDC_QT_Blank="3";

    /**
     *TFtdcQuestionTypeType是一个特有信息类型类型
     *@see #THOST_FTDC_QT_Radio
     *@see #THOST_FTDC_QT_Option
     *@see #THOST_FTDC_QT_Blank
     */
    public static final int SizeOf_TThostFtdcQuestionTypeType=1;

    /**
     *TFtdcProcessIDType是一个业务流水号类型
     */
    public static final int SizeOf_TThostFtdcProcessIDType=33;

    /**
     *TFtdcSeqNoType是一个流水号类型
     */
    public static final int SizeOf_TThostFtdcSeqNoType=4;

    /**
     *TFtdcUOAProcessStatusType是一个流程状态类型
     */
    public static final int SizeOf_TThostFtdcUOAProcessStatusType=3;

    /**
     *TFtdcProcessTypeType是一个流程功能类型类型
     */
    public static final int SizeOf_TThostFtdcProcessTypeType=3;

    /**
     *请求 {@value}
     *@see #SizeOf_TThostFtdcBusinessTypeType
     */
    public static final char THOST_FTDC_BT_Request='1';

    /**
     *请求 {@value}
     *@see #SizeOf_TThostFtdcBusinessTypeType
     */
    public static final String STRING_THOST_FTDC_BT_Request="1";

    /**
     *应答 {@value}
     *@see #SizeOf_TThostFtdcBusinessTypeType
     */
    public static final char THOST_FTDC_BT_Response='2';

    /**
     *应答 {@value}
     *@see #SizeOf_TThostFtdcBusinessTypeType
     */
    public static final String STRING_THOST_FTDC_BT_Response="2";

    /**
     *通知 {@value}
     *@see #SizeOf_TThostFtdcBusinessTypeType
     */
    public static final char THOST_FTDC_BT_Notice='3';

    /**
     *通知 {@value}
     *@see #SizeOf_TThostFtdcBusinessTypeType
     */
    public static final String STRING_THOST_FTDC_BT_Notice="3";

    /**
     *TFtdcBusinessTypeType是一个业务类型类型
     *@see #THOST_FTDC_BT_Request
     *@see #THOST_FTDC_BT_Response
     *@see #THOST_FTDC_BT_Notice
     */
    public static final int SizeOf_TThostFtdcBusinessTypeType=1;

    /**
     *成功 {@value}
     *@see #SizeOf_TThostFtdcCfmmcReturnCodeType
     */
    public static final char THOST_FTDC_CRC_Success='0';

    /**
     *成功 {@value}
     *@see #SizeOf_TThostFtdcCfmmcReturnCodeType
     */
    public static final String STRING_THOST_FTDC_CRC_Success="0";

    /**
     *该客户已经有流程在处理中 {@value}
     *@see #SizeOf_TThostFtdcCfmmcReturnCodeType
     */
    public static final char THOST_FTDC_CRC_Working='1';

    /**
     *该客户已经有流程在处理中 {@value}
     *@see #SizeOf_TThostFtdcCfmmcReturnCodeType
     */
    public static final String STRING_THOST_FTDC_CRC_Working="1";

    /**
     *监控中客户资料检查失败 {@value}
     *@see #SizeOf_TThostFtdcCfmmcReturnCodeType
     */
    public static final char THOST_FTDC_CRC_InfoFail='2';

    /**
     *监控中客户资料检查失败 {@value}
     *@see #SizeOf_TThostFtdcCfmmcReturnCodeType
     */
    public static final String STRING_THOST_FTDC_CRC_InfoFail="2";

    /**
     *监控中实名制检查失败 {@value}
     *@see #SizeOf_TThostFtdcCfmmcReturnCodeType
     */
    public static final char THOST_FTDC_CRC_IDCardFail='3';

    /**
     *监控中实名制检查失败 {@value}
     *@see #SizeOf_TThostFtdcCfmmcReturnCodeType
     */
    public static final String STRING_THOST_FTDC_CRC_IDCardFail="3";

    /**
     *其他错误 {@value}
     *@see #SizeOf_TThostFtdcCfmmcReturnCodeType
     */
    public static final char THOST_FTDC_CRC_OtherFail='4';

    /**
     *其他错误 {@value}
     *@see #SizeOf_TThostFtdcCfmmcReturnCodeType
     */
    public static final String STRING_THOST_FTDC_CRC_OtherFail="4";

    /**
     *TFtdcCfmmcReturnCodeType是一个监控中心返回码类型
     *@see #THOST_FTDC_CRC_Success
     *@see #THOST_FTDC_CRC_Working
     *@see #THOST_FTDC_CRC_InfoFail
     *@see #THOST_FTDC_CRC_IDCardFail
     *@see #THOST_FTDC_CRC_OtherFail
     */
    public static final int SizeOf_TThostFtdcCfmmcReturnCodeType=1;

    /**
     *TFtdcExReturnCodeType是一个交易所返回码类型
     */
    public static final int SizeOf_TThostFtdcExReturnCodeType=4;

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final char THOST_FTDC_CfMMCCT_All='0';

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final String STRING_THOST_FTDC_CfMMCCT_All="0";

    /**
     *个人 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final char THOST_FTDC_CfMMCCT_Person='1';

    /**
     *个人 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final String STRING_THOST_FTDC_CfMMCCT_Person="1";

    /**
     *单位 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final char THOST_FTDC_CfMMCCT_Company='2';

    /**
     *单位 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final String STRING_THOST_FTDC_CfMMCCT_Company="2";

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final char THOST_FTDC_CfMMCCT_Other='3';

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final String STRING_THOST_FTDC_CfMMCCT_Other="3";

    /**
     *特殊法人 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final char THOST_FTDC_CfMMCCT_SpecialOrgan='4';

    /**
     *特殊法人 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final String STRING_THOST_FTDC_CfMMCCT_SpecialOrgan="4";

    /**
     *资管户 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final char THOST_FTDC_CfMMCCT_Asset='5';

    /**
     *资管户 {@value}
     *@see #SizeOf_TThostFtdcClientTypeType
     */
    public static final String STRING_THOST_FTDC_CfMMCCT_Asset="5";

    /**
     *TFtdcClientTypeType是一个客户类型类型
     *@see #THOST_FTDC_CfMMCCT_All
     *@see #THOST_FTDC_CfMMCCT_Person
     *@see #THOST_FTDC_CfMMCCT_Company
     *@see #THOST_FTDC_CfMMCCT_Other
     *@see #THOST_FTDC_CfMMCCT_SpecialOrgan
     *@see #THOST_FTDC_CfMMCCT_Asset
     */
    public static final int SizeOf_TThostFtdcClientTypeType=1;

    /**
     *上海期货交易所 {@value}
     *@see #SizeOf_TThostFtdcExchangeIDTypeType
     */
    public static final char THOST_FTDC_EIDT_SHFE='S';

    /**
     *上海期货交易所 {@value}
     *@see #SizeOf_TThostFtdcExchangeIDTypeType
     */
    public static final String STRING_THOST_FTDC_EIDT_SHFE="S";

    /**
     *郑州商品交易所 {@value}
     *@see #SizeOf_TThostFtdcExchangeIDTypeType
     */
    public static final char THOST_FTDC_EIDT_CZCE='Z';

    /**
     *郑州商品交易所 {@value}
     *@see #SizeOf_TThostFtdcExchangeIDTypeType
     */
    public static final String STRING_THOST_FTDC_EIDT_CZCE="Z";

    /**
     *大连商品交易所 {@value}
     *@see #SizeOf_TThostFtdcExchangeIDTypeType
     */
    public static final char THOST_FTDC_EIDT_DCE='D';

    /**
     *大连商品交易所 {@value}
     *@see #SizeOf_TThostFtdcExchangeIDTypeType
     */
    public static final String STRING_THOST_FTDC_EIDT_DCE="D";

    /**
     *中国金融期货交易所 {@value}
     *@see #SizeOf_TThostFtdcExchangeIDTypeType
     */
    public static final char THOST_FTDC_EIDT_CFFEX='J';

    /**
     *中国金融期货交易所 {@value}
     *@see #SizeOf_TThostFtdcExchangeIDTypeType
     */
    public static final String STRING_THOST_FTDC_EIDT_CFFEX="J";

    /**
     *上海国际能源交易中心股份有限公司 {@value}
     *@see #SizeOf_TThostFtdcExchangeIDTypeType
     */
    public static final char THOST_FTDC_EIDT_INE='N';

    /**
     *上海国际能源交易中心股份有限公司 {@value}
     *@see #SizeOf_TThostFtdcExchangeIDTypeType
     */
    public static final String STRING_THOST_FTDC_EIDT_INE="N";

    /**
     *TFtdcExchangeIDTypeType是一个交易所编号类型
     *@see #THOST_FTDC_EIDT_SHFE
     *@see #THOST_FTDC_EIDT_CZCE
     *@see #THOST_FTDC_EIDT_DCE
     *@see #THOST_FTDC_EIDT_CFFEX
     *@see #THOST_FTDC_EIDT_INE
     */
    public static final int SizeOf_TThostFtdcExchangeIDTypeType=1;

    /**
     *套保 {@value}
     *@see #SizeOf_TThostFtdcExClientIDTypeType
     */
    public static final char THOST_FTDC_ECIDT_Hedge='1';

    /**
     *套保 {@value}
     *@see #SizeOf_TThostFtdcExClientIDTypeType
     */
    public static final String STRING_THOST_FTDC_ECIDT_Hedge="1";

    /**
     *套利 {@value}
     *@see #SizeOf_TThostFtdcExClientIDTypeType
     */
    public static final char THOST_FTDC_ECIDT_Arbitrage='2';

    /**
     *套利 {@value}
     *@see #SizeOf_TThostFtdcExClientIDTypeType
     */
    public static final String STRING_THOST_FTDC_ECIDT_Arbitrage="2";

    /**
     *投机 {@value}
     *@see #SizeOf_TThostFtdcExClientIDTypeType
     */
    public static final char THOST_FTDC_ECIDT_Speculation='3';

    /**
     *投机 {@value}
     *@see #SizeOf_TThostFtdcExClientIDTypeType
     */
    public static final String STRING_THOST_FTDC_ECIDT_Speculation="3";

    /**
     *TFtdcExClientIDTypeType是一个交易编码类型类型
     *@see #THOST_FTDC_ECIDT_Hedge
     *@see #THOST_FTDC_ECIDT_Arbitrage
     *@see #THOST_FTDC_ECIDT_Speculation
     */
    public static final int SizeOf_TThostFtdcExClientIDTypeType=1;

    /**
     *TFtdcClientClassifyType是一个客户分类码类型
     */
    public static final int SizeOf_TThostFtdcClientClassifyType=11;

    /**
     *TFtdcUOAOrganTypeType是一个单位性质类型
     */
    public static final int SizeOf_TThostFtdcUOAOrganTypeType=11;

    /**
     *TFtdcUOACountryCodeType是一个国家代码类型
     */
    public static final int SizeOf_TThostFtdcUOACountryCodeType=11;

    /**
     *TFtdcAreaCodeType是一个区号类型
     */
    public static final int SizeOf_TThostFtdcAreaCodeType=11;

    /**
     *TFtdcFuturesIDType是一个监控中心为客户分配的代码类型
     */
    public static final int SizeOf_TThostFtdcFuturesIDType=21;

    /**
     *TFtdcCffmcDateType是一个日期类型
     */
    public static final int SizeOf_TThostFtdcCffmcDateType=11;

    /**
     *TFtdcCffmcTimeType是一个时间类型
     */
    public static final int SizeOf_TThostFtdcCffmcTimeType=11;

    /**
     *TFtdcNocIDType是一个组织机构代码类型
     */
    public static final int SizeOf_TThostFtdcNocIDType=21;

    /**
     *未更新 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final char THOST_FTDC_UF_NoUpdate='0';

    /**
     *未更新 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final String STRING_THOST_FTDC_UF_NoUpdate="0";

    /**
     *更新全部信息成功 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final char THOST_FTDC_UF_Success='1';

    /**
     *更新全部信息成功 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final String STRING_THOST_FTDC_UF_Success="1";

    /**
     *更新全部信息失败 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final char THOST_FTDC_UF_Fail='2';

    /**
     *更新全部信息失败 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final String STRING_THOST_FTDC_UF_Fail="2";

    /**
     *更新交易编码成功 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final char THOST_FTDC_UF_TCSuccess='3';

    /**
     *更新交易编码成功 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final String STRING_THOST_FTDC_UF_TCSuccess="3";

    /**
     *更新交易编码失败 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final char THOST_FTDC_UF_TCFail='4';

    /**
     *更新交易编码失败 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final String STRING_THOST_FTDC_UF_TCFail="4";

    /**
     *已丢弃 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final char THOST_FTDC_UF_Cancel='5';

    /**
     *已丢弃 {@value}
     *@see #SizeOf_TThostFtdcUpdateFlagType
     */
    public static final String STRING_THOST_FTDC_UF_Cancel="5";

    /**
     *TFtdcUpdateFlagType是一个更新状态类型
     *@see #THOST_FTDC_UF_NoUpdate
     *@see #THOST_FTDC_UF_Success
     *@see #THOST_FTDC_UF_Fail
     *@see #THOST_FTDC_UF_TCSuccess
     *@see #THOST_FTDC_UF_TCFail
     *@see #THOST_FTDC_UF_Cancel
     */
    public static final int SizeOf_TThostFtdcUpdateFlagType=1;

    /**
     *开户 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final char THOST_FTDC_AOID_OpenInvestor='1';

    /**
     *开户 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final String STRING_THOST_FTDC_AOID_OpenInvestor="1";

    /**
     *修改身份信息 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final char THOST_FTDC_AOID_ModifyIDCard='2';

    /**
     *修改身份信息 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final String STRING_THOST_FTDC_AOID_ModifyIDCard="2";

    /**
     *修改一般信息 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final char THOST_FTDC_AOID_ModifyNoIDCard='3';

    /**
     *修改一般信息 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final String STRING_THOST_FTDC_AOID_ModifyNoIDCard="3";

    /**
     *申请交易编码 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final char THOST_FTDC_AOID_ApplyTradingCode='4';

    /**
     *申请交易编码 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final String STRING_THOST_FTDC_AOID_ApplyTradingCode="4";

    /**
     *撤销交易编码 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final char THOST_FTDC_AOID_CancelTradingCode='5';

    /**
     *撤销交易编码 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final String STRING_THOST_FTDC_AOID_CancelTradingCode="5";

    /**
     *销户 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final char THOST_FTDC_AOID_CancelInvestor='6';

    /**
     *销户 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final String STRING_THOST_FTDC_AOID_CancelInvestor="6";

    /**
     *账户休眠 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final char THOST_FTDC_AOID_FreezeAccount='8';

    /**
     *账户休眠 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final String STRING_THOST_FTDC_AOID_FreezeAccount="8";

    /**
     *激活休眠账户 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final char THOST_FTDC_AOID_ActiveFreezeAccount='9';

    /**
     *激活休眠账户 {@value}
     *@see #SizeOf_TThostFtdcApplyOperateIDType
     */
    public static final String STRING_THOST_FTDC_AOID_ActiveFreezeAccount="9";

    /**
     *TFtdcApplyOperateIDType是一个申请动作类型
     *@see #THOST_FTDC_AOID_OpenInvestor
     *@see #THOST_FTDC_AOID_ModifyIDCard
     *@see #THOST_FTDC_AOID_ModifyNoIDCard
     *@see #THOST_FTDC_AOID_ApplyTradingCode
     *@see #THOST_FTDC_AOID_CancelTradingCode
     *@see #THOST_FTDC_AOID_CancelInvestor
     *@see #THOST_FTDC_AOID_FreezeAccount
     *@see #THOST_FTDC_AOID_ActiveFreezeAccount
     */
    public static final int SizeOf_TThostFtdcApplyOperateIDType=1;

    /**
     *未补全 {@value}
     *@see #SizeOf_TThostFtdcApplyStatusIDType
     */
    public static final char THOST_FTDC_ASID_NoComplete='1';

    /**
     *未补全 {@value}
     *@see #SizeOf_TThostFtdcApplyStatusIDType
     */
    public static final String STRING_THOST_FTDC_ASID_NoComplete="1";

    /**
     *已提交 {@value}
     *@see #SizeOf_TThostFtdcApplyStatusIDType
     */
    public static final char THOST_FTDC_ASID_Submited='2';

    /**
     *已提交 {@value}
     *@see #SizeOf_TThostFtdcApplyStatusIDType
     */
    public static final String STRING_THOST_FTDC_ASID_Submited="2";

    /**
     *已审核 {@value}
     *@see #SizeOf_TThostFtdcApplyStatusIDType
     */
    public static final char THOST_FTDC_ASID_Checked='3';

    /**
     *已审核 {@value}
     *@see #SizeOf_TThostFtdcApplyStatusIDType
     */
    public static final String STRING_THOST_FTDC_ASID_Checked="3";

    /**
     *已拒绝 {@value}
     *@see #SizeOf_TThostFtdcApplyStatusIDType
     */
    public static final char THOST_FTDC_ASID_Refused='4';

    /**
     *已拒绝 {@value}
     *@see #SizeOf_TThostFtdcApplyStatusIDType
     */
    public static final String STRING_THOST_FTDC_ASID_Refused="4";

    /**
     *已删除 {@value}
     *@see #SizeOf_TThostFtdcApplyStatusIDType
     */
    public static final char THOST_FTDC_ASID_Deleted='5';

    /**
     *已删除 {@value}
     *@see #SizeOf_TThostFtdcApplyStatusIDType
     */
    public static final String STRING_THOST_FTDC_ASID_Deleted="5";

    /**
     *TFtdcApplyStatusIDType是一个申请状态类型
     *@see #THOST_FTDC_ASID_NoComplete
     *@see #THOST_FTDC_ASID_Submited
     *@see #THOST_FTDC_ASID_Checked
     *@see #THOST_FTDC_ASID_Refused
     *@see #THOST_FTDC_ASID_Deleted
     */
    public static final int SizeOf_TThostFtdcApplyStatusIDType=1;

    /**
     *文件发送 {@value}
     *@see #SizeOf_TThostFtdcSendMethodType
     */
    public static final char THOST_FTDC_UOASM_ByAPI='1';

    /**
     *文件发送 {@value}
     *@see #SizeOf_TThostFtdcSendMethodType
     */
    public static final String STRING_THOST_FTDC_UOASM_ByAPI="1";

    /**
     *电子发送 {@value}
     *@see #SizeOf_TThostFtdcSendMethodType
     */
    public static final char THOST_FTDC_UOASM_ByFile='2';

    /**
     *电子发送 {@value}
     *@see #SizeOf_TThostFtdcSendMethodType
     */
    public static final String STRING_THOST_FTDC_UOASM_ByFile="2";

    /**
     *TFtdcSendMethodType是一个发送方式类型
     *@see #THOST_FTDC_UOASM_ByAPI
     *@see #THOST_FTDC_UOASM_ByFile
     */
    public static final int SizeOf_TThostFtdcSendMethodType=1;

    /**
     *TFtdcEventTypeType是一个业务操作类型类型
     */
    public static final int SizeOf_TThostFtdcEventTypeType=33;

    /**
     *增加 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final char THOST_FTDC_EvM_ADD='1';

    /**
     *增加 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final String STRING_THOST_FTDC_EvM_ADD="1";

    /**
     *修改 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final char THOST_FTDC_EvM_UPDATE='2';

    /**
     *修改 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final String STRING_THOST_FTDC_EvM_UPDATE="2";

    /**
     *删除 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final char THOST_FTDC_EvM_DELETE='3';

    /**
     *删除 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final String STRING_THOST_FTDC_EvM_DELETE="3";

    /**
     *复核 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final char THOST_FTDC_EvM_CHECK='4';

    /**
     *复核 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final String STRING_THOST_FTDC_EvM_CHECK="4";

    /**
     *复制 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final char THOST_FTDC_EvM_COPY='5';

    /**
     *复制 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final String STRING_THOST_FTDC_EvM_COPY="5";

    /**
     *注销 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final char THOST_FTDC_EvM_CANCEL='6';

    /**
     *注销 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final String STRING_THOST_FTDC_EvM_CANCEL="6";

    /**
     *冲销 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final char THOST_FTDC_EvM_Reverse='7';

    /**
     *冲销 {@value}
     *@see #SizeOf_TThostFtdcEventModeType
     */
    public static final String STRING_THOST_FTDC_EvM_Reverse="7";

    /**
     *TFtdcEventModeType是一个操作方法类型
     *@see #THOST_FTDC_EvM_ADD
     *@see #THOST_FTDC_EvM_UPDATE
     *@see #THOST_FTDC_EvM_DELETE
     *@see #THOST_FTDC_EvM_CHECK
     *@see #THOST_FTDC_EvM_COPY
     *@see #THOST_FTDC_EvM_CANCEL
     *@see #THOST_FTDC_EvM_Reverse
     */
    public static final int SizeOf_TThostFtdcEventModeType=1;

    /**
     *自动发送并接收 {@value}
     *@see #SizeOf_TThostFtdcUOAAutoSendType
     */
    public static final char THOST_FTDC_UOAA_ASR='1';

    /**
     *自动发送并接收 {@value}
     *@see #SizeOf_TThostFtdcUOAAutoSendType
     */
    public static final String STRING_THOST_FTDC_UOAA_ASR="1";

    /**
     *自动发送，不自动接收 {@value}
     *@see #SizeOf_TThostFtdcUOAAutoSendType
     */
    public static final char THOST_FTDC_UOAA_ASNR='2';

    /**
     *自动发送，不自动接收 {@value}
     *@see #SizeOf_TThostFtdcUOAAutoSendType
     */
    public static final String STRING_THOST_FTDC_UOAA_ASNR="2";

    /**
     *不自动发送，自动接收 {@value}
     *@see #SizeOf_TThostFtdcUOAAutoSendType
     */
    public static final char THOST_FTDC_UOAA_NSAR='3';

    /**
     *不自动发送，自动接收 {@value}
     *@see #SizeOf_TThostFtdcUOAAutoSendType
     */
    public static final String STRING_THOST_FTDC_UOAA_NSAR="3";

    /**
     *不自动发送，也不自动接收 {@value}
     *@see #SizeOf_TThostFtdcUOAAutoSendType
     */
    public static final char THOST_FTDC_UOAA_NSR='4';

    /**
     *不自动发送，也不自动接收 {@value}
     *@see #SizeOf_TThostFtdcUOAAutoSendType
     */
    public static final String STRING_THOST_FTDC_UOAA_NSR="4";

    /**
     *TFtdcUOAAutoSendType是一个统一开户申请自动发送类型
     *@see #THOST_FTDC_UOAA_ASR
     *@see #THOST_FTDC_UOAA_ASNR
     *@see #THOST_FTDC_UOAA_NSAR
     *@see #THOST_FTDC_UOAA_NSR
     */
    public static final int SizeOf_TThostFtdcUOAAutoSendType=1;

    /**
     *TFtdcQueryDepthType是一个查询深度类型
     */
    public static final int SizeOf_TThostFtdcQueryDepthType=4;

    /**
     *TFtdcDataCenterIDType是一个数据中心代码类型
     */
    public static final int SizeOf_TThostFtdcDataCenterIDType=4;

    /**
     *投资者对应投资者组设置 {@value}
     *@see #SizeOf_TThostFtdcFlowIDType
     */
    public static final char THOST_FTDC_EvM_InvestorGroupFlow='1';

    /**
     *投资者对应投资者组设置 {@value}
     *@see #SizeOf_TThostFtdcFlowIDType
     */
    public static final String STRING_THOST_FTDC_EvM_InvestorGroupFlow="1";

    /**
     *投资者手续费率设置 {@value}
     *@see #SizeOf_TThostFtdcFlowIDType
     */
    public static final char THOST_FTDC_EvM_InvestorRate='2';

    /**
     *投资者手续费率设置 {@value}
     *@see #SizeOf_TThostFtdcFlowIDType
     */
    public static final String STRING_THOST_FTDC_EvM_InvestorRate="2";

    /**
     *投资者手续费率模板关系设置 {@value}
     *@see #SizeOf_TThostFtdcFlowIDType
     */
    public static final char THOST_FTDC_EvM_InvestorCommRateModel='3';

    /**
     *投资者手续费率模板关系设置 {@value}
     *@see #SizeOf_TThostFtdcFlowIDType
     */
    public static final String STRING_THOST_FTDC_EvM_InvestorCommRateModel="3";

    /**
     *TFtdcFlowIDType是一个流程ID类型
     *@see #THOST_FTDC_EvM_InvestorGroupFlow
     *@see #THOST_FTDC_EvM_InvestorRate
     *@see #THOST_FTDC_EvM_InvestorCommRateModel
     */
    public static final int SizeOf_TThostFtdcFlowIDType=1;

    /**
     *零级复核 {@value}
     *@see #SizeOf_TThostFtdcCheckLevelType
     */
    public static final char THOST_FTDC_CL_Zero='0';

    /**
     *零级复核 {@value}
     *@see #SizeOf_TThostFtdcCheckLevelType
     */
    public static final String STRING_THOST_FTDC_CL_Zero="0";

    /**
     *一级复核 {@value}
     *@see #SizeOf_TThostFtdcCheckLevelType
     */
    public static final char THOST_FTDC_CL_One='1';

    /**
     *一级复核 {@value}
     *@see #SizeOf_TThostFtdcCheckLevelType
     */
    public static final String STRING_THOST_FTDC_CL_One="1";

    /**
     *二级复核 {@value}
     *@see #SizeOf_TThostFtdcCheckLevelType
     */
    public static final char THOST_FTDC_CL_Two='2';

    /**
     *二级复核 {@value}
     *@see #SizeOf_TThostFtdcCheckLevelType
     */
    public static final String STRING_THOST_FTDC_CL_Two="2";

    /**
     *TFtdcCheckLevelType是一个复核级别类型
     *@see #THOST_FTDC_CL_Zero
     *@see #THOST_FTDC_CL_One
     *@see #THOST_FTDC_CL_Two
     */
    public static final int SizeOf_TThostFtdcCheckLevelType=1;

    /**
     *TFtdcCheckNoType是一个操作次数类型
     */
    public static final int SizeOf_TThostFtdcCheckNoType=4;

    /**
     *未复核 {@value}
     *@see #SizeOf_TThostFtdcCheckStatusType
     */
    public static final char THOST_FTDC_CHS_Init='0';

    /**
     *未复核 {@value}
     *@see #SizeOf_TThostFtdcCheckStatusType
     */
    public static final String STRING_THOST_FTDC_CHS_Init="0";

    /**
     *复核中 {@value}
     *@see #SizeOf_TThostFtdcCheckStatusType
     */
    public static final char THOST_FTDC_CHS_Checking='1';

    /**
     *复核中 {@value}
     *@see #SizeOf_TThostFtdcCheckStatusType
     */
    public static final String STRING_THOST_FTDC_CHS_Checking="1";

    /**
     *已复核 {@value}
     *@see #SizeOf_TThostFtdcCheckStatusType
     */
    public static final char THOST_FTDC_CHS_Checked='2';

    /**
     *已复核 {@value}
     *@see #SizeOf_TThostFtdcCheckStatusType
     */
    public static final String STRING_THOST_FTDC_CHS_Checked="2";

    /**
     *拒绝 {@value}
     *@see #SizeOf_TThostFtdcCheckStatusType
     */
    public static final char THOST_FTDC_CHS_Refuse='3';

    /**
     *拒绝 {@value}
     *@see #SizeOf_TThostFtdcCheckStatusType
     */
    public static final String STRING_THOST_FTDC_CHS_Refuse="3";

    /**
     *作废 {@value}
     *@see #SizeOf_TThostFtdcCheckStatusType
     */
    public static final char THOST_FTDC_CHS_Cancel='4';

    /**
     *作废 {@value}
     *@see #SizeOf_TThostFtdcCheckStatusType
     */
    public static final String STRING_THOST_FTDC_CHS_Cancel="4";

    /**
     *TFtdcCheckStatusType是一个复核级别类型
     *@see #THOST_FTDC_CHS_Init
     *@see #THOST_FTDC_CHS_Checking
     *@see #THOST_FTDC_CHS_Checked
     *@see #THOST_FTDC_CHS_Refuse
     *@see #THOST_FTDC_CHS_Cancel
     */
    public static final int SizeOf_TThostFtdcCheckStatusType=1;

    /**
     *未生效 {@value}
     *@see #SizeOf_TThostFtdcUsedStatusType
     */
    public static final char THOST_FTDC_CHU_Unused='0';

    /**
     *未生效 {@value}
     *@see #SizeOf_TThostFtdcUsedStatusType
     */
    public static final String STRING_THOST_FTDC_CHU_Unused="0";

    /**
     *已生效 {@value}
     *@see #SizeOf_TThostFtdcUsedStatusType
     */
    public static final char THOST_FTDC_CHU_Used='1';

    /**
     *已生效 {@value}
     *@see #SizeOf_TThostFtdcUsedStatusType
     */
    public static final String STRING_THOST_FTDC_CHU_Used="1";

    /**
     *生效失败 {@value}
     *@see #SizeOf_TThostFtdcUsedStatusType
     */
    public static final char THOST_FTDC_CHU_Fail='2';

    /**
     *生效失败 {@value}
     *@see #SizeOf_TThostFtdcUsedStatusType
     */
    public static final String STRING_THOST_FTDC_CHU_Fail="2";

    /**
     *TFtdcUsedStatusType是一个生效状态类型
     *@see #THOST_FTDC_CHU_Unused
     *@see #THOST_FTDC_CHU_Used
     *@see #THOST_FTDC_CHU_Fail
     */
    public static final int SizeOf_TThostFtdcUsedStatusType=1;

    /**
     *TFtdcRateTemplateNameType是一个模型名称类型
     */
    public static final int SizeOf_TThostFtdcRateTemplateNameType=61;

    /**
     *TFtdcPropertyStringType是一个用于查询的投资属性字段类型
     */
    public static final int SizeOf_TThostFtdcPropertyStringType=2049;

    /**
     *手工录入 {@value}
     *@see #SizeOf_TThostFtdcBankAcountOriginType
     */
    public static final char THOST_FTDC_BAO_ByAccProperty='0';

    /**
     *手工录入 {@value}
     *@see #SizeOf_TThostFtdcBankAcountOriginType
     */
    public static final String STRING_THOST_FTDC_BAO_ByAccProperty="0";

    /**
     *银期转账 {@value}
     *@see #SizeOf_TThostFtdcBankAcountOriginType
     */
    public static final char THOST_FTDC_BAO_ByFBTransfer='1';

    /**
     *银期转账 {@value}
     *@see #SizeOf_TThostFtdcBankAcountOriginType
     */
    public static final String STRING_THOST_FTDC_BAO_ByFBTransfer="1";

    /**
     *TFtdcBankAcountOriginType是一个账户来源类型
     *@see #THOST_FTDC_BAO_ByAccProperty
     *@see #THOST_FTDC_BAO_ByFBTransfer
     */
    public static final int SizeOf_TThostFtdcBankAcountOriginType=1;

    /**
     *同日同合约 {@value}
     *@see #SizeOf_TThostFtdcMonthBillTradeSumType
     */
    public static final char THOST_FTDC_MBTS_ByInstrument='0';

    /**
     *同日同合约 {@value}
     *@see #SizeOf_TThostFtdcMonthBillTradeSumType
     */
    public static final String STRING_THOST_FTDC_MBTS_ByInstrument="0";

    /**
     *同日同合约同价格 {@value}
     *@see #SizeOf_TThostFtdcMonthBillTradeSumType
     */
    public static final char THOST_FTDC_MBTS_ByDayInsPrc='1';

    /**
     *同日同合约同价格 {@value}
     *@see #SizeOf_TThostFtdcMonthBillTradeSumType
     */
    public static final String STRING_THOST_FTDC_MBTS_ByDayInsPrc="1";

    /**
     *同合约 {@value}
     *@see #SizeOf_TThostFtdcMonthBillTradeSumType
     */
    public static final char THOST_FTDC_MBTS_ByDayIns='2';

    /**
     *同合约 {@value}
     *@see #SizeOf_TThostFtdcMonthBillTradeSumType
     */
    public static final String STRING_THOST_FTDC_MBTS_ByDayIns="2";

    /**
     *TFtdcMonthBillTradeSumType是一个结算单月报成交汇总方式类型
     *@see #THOST_FTDC_MBTS_ByInstrument
     *@see #THOST_FTDC_MBTS_ByDayInsPrc
     *@see #THOST_FTDC_MBTS_ByDayIns
     */
    public static final int SizeOf_TThostFtdcMonthBillTradeSumType=1;

    /**
     *TFtdcRateTemplateIDType是一个模型代码类型
     */
    public static final int SizeOf_TThostFtdcRateTemplateIDType=9;

    /**
     *TFtdcRiskRateType是一个风险度类型
     */
    public static final int SizeOf_TThostFtdcRiskRateType=21;

    /**
     *TFtdcTimestampType是一个时间戳类型
     */
    public static final int SizeOf_TThostFtdcTimestampType=4;

    /**
     *TFtdcInvestorIDRuleNameType是一个号段规则名称类型
     */
    public static final int SizeOf_TThostFtdcInvestorIDRuleNameType=61;

    /**
     *TFtdcInvestorIDRuleExprType是一个号段规则表达式类型
     */
    public static final int SizeOf_TThostFtdcInvestorIDRuleExprType=513;

    /**
     *TFtdcLastDriftType是一个上次OTP漂移值类型
     */
    public static final int SizeOf_TThostFtdcLastDriftType=4;

    /**
     *TFtdcLastSuccessType是一个上次OTP成功值类型
     */
    public static final int SizeOf_TThostFtdcLastSuccessType=4;

    /**
     *TFtdcAuthKeyType是一个令牌密钥类型
     */
    public static final int SizeOf_TThostFtdcAuthKeyType=41;

    /**
     *TFtdcSerialNumberType是一个序列号类型
     */
    public static final int SizeOf_TThostFtdcSerialNumberType=17;

    /**
     *无动态令牌 {@value}
     *@see #SizeOf_TThostFtdcOTPTypeType
     */
    public static final char THOST_FTDC_OTP_NONE='0';

    /**
     *无动态令牌 {@value}
     *@see #SizeOf_TThostFtdcOTPTypeType
     */
    public static final String STRING_THOST_FTDC_OTP_NONE="0";

    /**
     *时间令牌 {@value}
     *@see #SizeOf_TThostFtdcOTPTypeType
     */
    public static final char THOST_FTDC_OTP_TOTP='1';

    /**
     *时间令牌 {@value}
     *@see #SizeOf_TThostFtdcOTPTypeType
     */
    public static final String STRING_THOST_FTDC_OTP_TOTP="1";

    /**
     *TFtdcOTPTypeType是一个动态令牌类型类型
     *@see #THOST_FTDC_OTP_NONE
     *@see #THOST_FTDC_OTP_TOTP
     */
    public static final int SizeOf_TThostFtdcOTPTypeType=1;

    /**
     *TFtdcOTPVendorsIDType是一个动态令牌提供商类型
     */
    public static final int SizeOf_TThostFtdcOTPVendorsIDType=2;

    /**
     *TFtdcOTPVendorsNameType是一个动态令牌提供商名称类型
     */
    public static final int SizeOf_TThostFtdcOTPVendorsNameType=61;

    /**
     *未使用 {@value}
     *@see #SizeOf_TThostFtdcOTPStatusType
     */
    public static final char THOST_FTDC_OTPS_Unused='0';

    /**
     *未使用 {@value}
     *@see #SizeOf_TThostFtdcOTPStatusType
     */
    public static final String STRING_THOST_FTDC_OTPS_Unused="0";

    /**
     *已使用 {@value}
     *@see #SizeOf_TThostFtdcOTPStatusType
     */
    public static final char THOST_FTDC_OTPS_Used='1';

    /**
     *已使用 {@value}
     *@see #SizeOf_TThostFtdcOTPStatusType
     */
    public static final String STRING_THOST_FTDC_OTPS_Used="1";

    /**
     *注销 {@value}
     *@see #SizeOf_TThostFtdcOTPStatusType
     */
    public static final char THOST_FTDC_OTPS_Disuse='2';

    /**
     *注销 {@value}
     *@see #SizeOf_TThostFtdcOTPStatusType
     */
    public static final String STRING_THOST_FTDC_OTPS_Disuse="2";

    /**
     *TFtdcOTPStatusType是一个动态令牌状态类型
     *@see #THOST_FTDC_OTPS_Unused
     *@see #THOST_FTDC_OTPS_Used
     *@see #THOST_FTDC_OTPS_Disuse
     */
    public static final int SizeOf_TThostFtdcOTPStatusType=1;

    /**
     *投资者 {@value}
     *@see #SizeOf_TThostFtdcBrokerUserTypeType
     */
    public static final char THOST_FTDC_BUT_Investor='1';

    /**
     *投资者 {@value}
     *@see #SizeOf_TThostFtdcBrokerUserTypeType
     */
    public static final String STRING_THOST_FTDC_BUT_Investor="1";

    /**
     *操作员 {@value}
     *@see #SizeOf_TThostFtdcBrokerUserTypeType
     */
    public static final char THOST_FTDC_BUT_BrokerUser='2';

    /**
     *操作员 {@value}
     *@see #SizeOf_TThostFtdcBrokerUserTypeType
     */
    public static final String STRING_THOST_FTDC_BUT_BrokerUser="2";

    /**
     *TFtdcBrokerUserTypeType是一个经济公司用户类型类型
     *@see #THOST_FTDC_BUT_Investor
     *@see #THOST_FTDC_BUT_BrokerUser
     */
    public static final int SizeOf_TThostFtdcBrokerUserTypeType=1;

    /**
     *商品期货 {@value}
     *@see #SizeOf_TThostFtdcFutureTypeType
     */
    public static final char THOST_FTDC_FUTT_Commodity='1';

    /**
     *商品期货 {@value}
     *@see #SizeOf_TThostFtdcFutureTypeType
     */
    public static final String STRING_THOST_FTDC_FUTT_Commodity="1";

    /**
     *金融期货 {@value}
     *@see #SizeOf_TThostFtdcFutureTypeType
     */
    public static final char THOST_FTDC_FUTT_Financial='2';

    /**
     *金融期货 {@value}
     *@see #SizeOf_TThostFtdcFutureTypeType
     */
    public static final String STRING_THOST_FTDC_FUTT_Financial="2";

    /**
     *TFtdcFutureTypeType是一个期货类型类型
     *@see #THOST_FTDC_FUTT_Commodity
     *@see #THOST_FTDC_FUTT_Financial
     */
    public static final int SizeOf_TThostFtdcFutureTypeType=1;

    /**
     *转账限额 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final char THOST_FTDC_FET_Restriction='0';

    /**
     *转账限额 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final String STRING_THOST_FTDC_FET_Restriction="0";

    /**
     *当日转账限额 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final char THOST_FTDC_FET_TodayRestriction='1';

    /**
     *当日转账限额 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final String STRING_THOST_FTDC_FET_TodayRestriction="1";

    /**
     *期商流水 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final char THOST_FTDC_FET_Transfer='2';

    /**
     *期商流水 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final String STRING_THOST_FTDC_FET_Transfer="2";

    /**
     *资金冻结 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final char THOST_FTDC_FET_Credit='3';

    /**
     *资金冻结 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final String STRING_THOST_FTDC_FET_Credit="3";

    /**
     *投资者可提资金比例 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final char THOST_FTDC_FET_InvestorWithdrawAlm='4';

    /**
     *投资者可提资金比例 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final String STRING_THOST_FTDC_FET_InvestorWithdrawAlm="4";

    /**
     *单个银行帐户转账限额 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final char THOST_FTDC_FET_BankRestriction='5';

    /**
     *单个银行帐户转账限额 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final String STRING_THOST_FTDC_FET_BankRestriction="5";

    /**
     *银期签约账户 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final char THOST_FTDC_FET_Accountregister='6';

    /**
     *银期签约账户 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final String STRING_THOST_FTDC_FET_Accountregister="6";

    /**
     *交易所出入金 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final char THOST_FTDC_FET_ExchangeFundIO='7';

    /**
     *交易所出入金 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final String STRING_THOST_FTDC_FET_ExchangeFundIO="7";

    /**
     *投资者出入金 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final char THOST_FTDC_FET_InvestorFundIO='8';

    /**
     *投资者出入金 {@value}
     *@see #SizeOf_TThostFtdcFundEventTypeType
     */
    public static final String STRING_THOST_FTDC_FET_InvestorFundIO="8";

    /**
     *TFtdcFundEventTypeType是一个资金管理操作类型类型
     *@see #THOST_FTDC_FET_Restriction
     *@see #THOST_FTDC_FET_TodayRestriction
     *@see #THOST_FTDC_FET_Transfer
     *@see #THOST_FTDC_FET_Credit
     *@see #THOST_FTDC_FET_InvestorWithdrawAlm
     *@see #THOST_FTDC_FET_BankRestriction
     *@see #THOST_FTDC_FET_Accountregister
     *@see #THOST_FTDC_FET_ExchangeFundIO
     *@see #THOST_FTDC_FET_InvestorFundIO
     */
    public static final int SizeOf_TThostFtdcFundEventTypeType=1;

    /**
     *银期同步 {@value}
     *@see #SizeOf_TThostFtdcAccountSourceTypeType
     */
    public static final char THOST_FTDC_AST_FBTransfer='0';

    /**
     *银期同步 {@value}
     *@see #SizeOf_TThostFtdcAccountSourceTypeType
     */
    public static final String STRING_THOST_FTDC_AST_FBTransfer="0";

    /**
     *手工录入 {@value}
     *@see #SizeOf_TThostFtdcAccountSourceTypeType
     */
    public static final char THOST_FTDC_AST_ManualEntry='1';

    /**
     *手工录入 {@value}
     *@see #SizeOf_TThostFtdcAccountSourceTypeType
     */
    public static final String STRING_THOST_FTDC_AST_ManualEntry="1";

    /**
     *TFtdcAccountSourceTypeType是一个资金账户来源类型
     *@see #THOST_FTDC_AST_FBTransfer
     *@see #THOST_FTDC_AST_ManualEntry
     */
    public static final int SizeOf_TThostFtdcAccountSourceTypeType=1;

    /**
     *统一开户(已规范) {@value}
     *@see #SizeOf_TThostFtdcCodeSourceTypeType
     */
    public static final char THOST_FTDC_CST_UnifyAccount='0';

    /**
     *统一开户(已规范) {@value}
     *@see #SizeOf_TThostFtdcCodeSourceTypeType
     */
    public static final String STRING_THOST_FTDC_CST_UnifyAccount="0";

    /**
     *手工录入(未规范) {@value}
     *@see #SizeOf_TThostFtdcCodeSourceTypeType
     */
    public static final char THOST_FTDC_CST_ManualEntry='1';

    /**
     *手工录入(未规范) {@value}
     *@see #SizeOf_TThostFtdcCodeSourceTypeType
     */
    public static final String STRING_THOST_FTDC_CST_ManualEntry="1";

    /**
     *TFtdcCodeSourceTypeType是一个交易编码来源类型
     *@see #THOST_FTDC_CST_UnifyAccount
     *@see #THOST_FTDC_CST_ManualEntry
     */
    public static final int SizeOf_TThostFtdcCodeSourceTypeType=1;

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcUserRangeType
     */
    public static final char THOST_FTDC_UR_All='0';

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcUserRangeType
     */
    public static final String STRING_THOST_FTDC_UR_All="0";

    /**
     *单一操作员 {@value}
     *@see #SizeOf_TThostFtdcUserRangeType
     */
    public static final char THOST_FTDC_UR_Single='1';

    /**
     *单一操作员 {@value}
     *@see #SizeOf_TThostFtdcUserRangeType
     */
    public static final String STRING_THOST_FTDC_UR_Single="1";

    /**
     *TFtdcUserRangeType是一个操作员范围类型
     *@see #THOST_FTDC_UR_All
     *@see #THOST_FTDC_UR_Single
     */
    public static final int SizeOf_TThostFtdcUserRangeType=1;

    /**
     *TFtdcTimeSpanType是一个时间跨度类型
     */
    public static final int SizeOf_TThostFtdcTimeSpanType=9;

    /**
     *TFtdcImportSequenceIDType是一个动态令牌导入批次编号类型
     */
    public static final int SizeOf_TThostFtdcImportSequenceIDType=17;

    /**
     *按投资者统计 {@value}
     *@see #SizeOf_TThostFtdcByGroupType
     */
    public static final char THOST_FTDC_BG_Investor='2';

    /**
     *按投资者统计 {@value}
     *@see #SizeOf_TThostFtdcByGroupType
     */
    public static final String STRING_THOST_FTDC_BG_Investor="2";

    /**
     *按类统计 {@value}
     *@see #SizeOf_TThostFtdcByGroupType
     */
    public static final char THOST_FTDC_BG_Group='1';

    /**
     *按类统计 {@value}
     *@see #SizeOf_TThostFtdcByGroupType
     */
    public static final String STRING_THOST_FTDC_BG_Group="1";

    /**
     *TFtdcByGroupType是一个交易统计表按客户统计方式类型
     *@see #THOST_FTDC_BG_Investor
     *@see #THOST_FTDC_BG_Group
     */
    public static final int SizeOf_TThostFtdcByGroupType=1;

    /**
     *按合约统计 {@value}
     *@see #SizeOf_TThostFtdcTradeSumStatModeType
     */
    public static final char THOST_FTDC_TSSM_Instrument='1';

    /**
     *按合约统计 {@value}
     *@see #SizeOf_TThostFtdcTradeSumStatModeType
     */
    public static final String STRING_THOST_FTDC_TSSM_Instrument="1";

    /**
     *按产品统计 {@value}
     *@see #SizeOf_TThostFtdcTradeSumStatModeType
     */
    public static final char THOST_FTDC_TSSM_Product='2';

    /**
     *按产品统计 {@value}
     *@see #SizeOf_TThostFtdcTradeSumStatModeType
     */
    public static final String STRING_THOST_FTDC_TSSM_Product="2";

    /**
     *按交易所统计 {@value}
     *@see #SizeOf_TThostFtdcTradeSumStatModeType
     */
    public static final char THOST_FTDC_TSSM_Exchange='3';

    /**
     *按交易所统计 {@value}
     *@see #SizeOf_TThostFtdcTradeSumStatModeType
     */
    public static final String STRING_THOST_FTDC_TSSM_Exchange="3";

    /**
     *TFtdcTradeSumStatModeType是一个交易统计表按范围统计方式类型
     *@see #THOST_FTDC_TSSM_Instrument
     *@see #THOST_FTDC_TSSM_Product
     *@see #THOST_FTDC_TSSM_Exchange
     */
    public static final int SizeOf_TThostFtdcTradeSumStatModeType=1;

    /**
     *TFtdcComTypeType是一个组合成交类型类型
     *@see #THOST_FTDC_TRDT_SplitCombination
     *@see #THOST_FTDC_TRDT_Common
     *@see #THOST_FTDC_TRDT_OptionsExecution
     *@see #THOST_FTDC_TRDT_OTC
     *@see #THOST_FTDC_TRDT_EFPDerived
     *@see #THOST_FTDC_TRDT_CombinationDerived
     */
    public static final int SizeOf_TThostFtdcComTypeType=4;

    /**
     *TFtdcUserProductIDType是一个产品标识类型
     */
    public static final int SizeOf_TThostFtdcUserProductIDType=33;

    /**
     *TFtdcUserProductNameType是一个产品名称类型
     */
    public static final int SizeOf_TThostFtdcUserProductNameType=65;

    /**
     *TFtdcUserProductMemoType是一个产品说明类型
     */
    public static final int SizeOf_TThostFtdcUserProductMemoType=129;

    /**
     *TFtdcCSRCCancelFlagType是一个新增或变更标志类型
     */
    public static final int SizeOf_TThostFtdcCSRCCancelFlagType=2;

    /**
     *TFtdcCSRCDateType是一个日期类型
     */
    public static final int SizeOf_TThostFtdcCSRCDateType=11;

    /**
     *TFtdcCSRCInvestorNameType是一个客户名称类型
     */
    public static final int SizeOf_TThostFtdcCSRCInvestorNameType=201;

    /**
     *TFtdcCSRCOpenInvestorNameType是一个客户名称类型
     */
    public static final int SizeOf_TThostFtdcCSRCOpenInvestorNameType=101;

    /**
     *TFtdcCSRCInvestorIDType是一个客户代码类型
     */
    public static final int SizeOf_TThostFtdcCSRCInvestorIDType=13;

    /**
     *TFtdcCSRCIdentifiedCardNoType是一个证件号码类型
     */
    public static final int SizeOf_TThostFtdcCSRCIdentifiedCardNoType=51;

    /**
     *TFtdcCSRCClientIDType是一个交易编码类型
     */
    public static final int SizeOf_TThostFtdcCSRCClientIDType=11;

    /**
     *TFtdcCSRCBankFlagType是一个银行标识类型
     */
    public static final int SizeOf_TThostFtdcCSRCBankFlagType=3;

    /**
     *TFtdcCSRCBankAccountType是一个银行账户类型
     */
    public static final int SizeOf_TThostFtdcCSRCBankAccountType=23;

    /**
     *TFtdcCSRCOpenNameType是一个开户人类型
     */
    public static final int SizeOf_TThostFtdcCSRCOpenNameType=401;

    /**
     *TFtdcCSRCMemoType是一个说明类型
     */
    public static final int SizeOf_TThostFtdcCSRCMemoType=101;

    /**
     *TFtdcCSRCTimeType是一个时间类型
     */
    public static final int SizeOf_TThostFtdcCSRCTimeType=11;

    /**
     *TFtdcCSRCTradeIDType是一个成交流水号类型
     */
    public static final int SizeOf_TThostFtdcCSRCTradeIDType=21;

    /**
     *TFtdcCSRCExchangeInstIDType是一个合约代码类型
     */
    public static final int SizeOf_TThostFtdcCSRCExchangeInstIDType=31;

    /**
     *TFtdcCSRCMortgageNameType是一个质押品名称类型
     */
    public static final int SizeOf_TThostFtdcCSRCMortgageNameType=7;

    /**
     *TFtdcCSRCReasonType是一个事由类型
     */
    public static final int SizeOf_TThostFtdcCSRCReasonType=3;

    /**
     *TFtdcIsSettlementType是一个是否为非结算会员类型
     */
    public static final int SizeOf_TThostFtdcIsSettlementType=2;

    /**
     *TFtdcCSRCMoneyType是一个资金类型
     */
    public static final int SizeOf_TThostFtdcCSRCMoneyType=8;

    /**
     *TFtdcCSRCPriceType是一个价格类型
     */
    public static final int SizeOf_TThostFtdcCSRCPriceType=8;

    /**
     *TFtdcCSRCOptionsTypeType是一个期权类型类型
     */
    public static final int SizeOf_TThostFtdcCSRCOptionsTypeType=2;

    /**
     *TFtdcCSRCStrikePriceType是一个执行价类型
     */
    public static final int SizeOf_TThostFtdcCSRCStrikePriceType=8;

    /**
     *TFtdcCSRCTargetProductIDType是一个标的品种类型
     */
    public static final int SizeOf_TThostFtdcCSRCTargetProductIDType=3;

    /**
     *TFtdcCSRCTargetInstrIDType是一个标的合约类型
     */
    public static final int SizeOf_TThostFtdcCSRCTargetInstrIDType=31;

    /**
     *TFtdcCommModelNameType是一个手续费率模板名称类型
     */
    public static final int SizeOf_TThostFtdcCommModelNameType=161;

    /**
     *TFtdcCommModelMemoType是一个手续费率模板备注类型
     */
    public static final int SizeOf_TThostFtdcCommModelMemoType=1025;

    /**
     *相对已有规则设置 {@value}
     *@see #SizeOf_TThostFtdcExprSetModeType
     */
    public static final char THOST_FTDC_ESM_Relative='1';

    /**
     *相对已有规则设置 {@value}
     *@see #SizeOf_TThostFtdcExprSetModeType
     */
    public static final String STRING_THOST_FTDC_ESM_Relative="1";

    /**
     *典型设置 {@value}
     *@see #SizeOf_TThostFtdcExprSetModeType
     */
    public static final char THOST_FTDC_ESM_Typical='2';

    /**
     *典型设置 {@value}
     *@see #SizeOf_TThostFtdcExprSetModeType
     */
    public static final String STRING_THOST_FTDC_ESM_Typical="2";

    /**
     *TFtdcExprSetModeType是一个日期表达式设置类型类型
     *@see #THOST_FTDC_ESM_Relative
     *@see #THOST_FTDC_ESM_Typical
     */
    public static final int SizeOf_TThostFtdcExprSetModeType=1;

    /**
     *公司标准 {@value}
     *@see #SizeOf_TThostFtdcRateInvestorRangeType
     */
    public static final char THOST_FTDC_RIR_All='1';

    /**
     *公司标准 {@value}
     *@see #SizeOf_TThostFtdcRateInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_RIR_All="1";

    /**
     *模板 {@value}
     *@see #SizeOf_TThostFtdcRateInvestorRangeType
     */
    public static final char THOST_FTDC_RIR_Model='2';

    /**
     *模板 {@value}
     *@see #SizeOf_TThostFtdcRateInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_RIR_Model="2";

    /**
     *单一投资者 {@value}
     *@see #SizeOf_TThostFtdcRateInvestorRangeType
     */
    public static final char THOST_FTDC_RIR_Single='3';

    /**
     *单一投资者 {@value}
     *@see #SizeOf_TThostFtdcRateInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_RIR_Single="3";

    /**
     *TFtdcRateInvestorRangeType是一个投资者范围类型
     *@see #THOST_FTDC_RIR_All
     *@see #THOST_FTDC_RIR_Model
     *@see #THOST_FTDC_RIR_Single
     */
    public static final int SizeOf_TThostFtdcRateInvestorRangeType=1;

    /**
     *TFtdcAgentBrokerIDType是一个代理经纪公司代码类型
     */
    public static final int SizeOf_TThostFtdcAgentBrokerIDType=13;

    /**
     *TFtdcDRIdentityIDType是一个交易中心代码类型
     */
    public static final int SizeOf_TThostFtdcDRIdentityIDType=4;

    /**
     *TFtdcDRIdentityNameType是一个交易中心名称类型
     */
    public static final int SizeOf_TThostFtdcDRIdentityNameType=65;

    /**
     *TFtdcDBLinkIDType是一个DBLink标识号类型
     */
    public static final int SizeOf_TThostFtdcDBLinkIDType=31;

    /**
     *未同步 {@value}
     *@see #SizeOf_TThostFtdcSyncDataStatusType
     */
    public static final char THOST_FTDC_SDS_Initialize='0';

    /**
     *未同步 {@value}
     *@see #SizeOf_TThostFtdcSyncDataStatusType
     */
    public static final String STRING_THOST_FTDC_SDS_Initialize="0";

    /**
     *同步中 {@value}
     *@see #SizeOf_TThostFtdcSyncDataStatusType
     */
    public static final char THOST_FTDC_SDS_Settlementing='1';

    /**
     *同步中 {@value}
     *@see #SizeOf_TThostFtdcSyncDataStatusType
     */
    public static final String STRING_THOST_FTDC_SDS_Settlementing="1";

    /**
     *已同步 {@value}
     *@see #SizeOf_TThostFtdcSyncDataStatusType
     */
    public static final char THOST_FTDC_SDS_Settlemented='2';

    /**
     *已同步 {@value}
     *@see #SizeOf_TThostFtdcSyncDataStatusType
     */
    public static final String STRING_THOST_FTDC_SDS_Settlemented="2";

    /**
     *TFtdcSyncDataStatusType是一个主次用系统数据同步状态类型
     *@see #THOST_FTDC_SDS_Initialize
     *@see #THOST_FTDC_SDS_Settlementing
     *@see #THOST_FTDC_SDS_Settlemented
     */
    public static final int SizeOf_TThostFtdcSyncDataStatusType=1;

    /**
     *来自交易所普通回报 {@value}
     *@see #SizeOf_TThostFtdcTradeSourceType
     */
    public static final char THOST_FTDC_TSRC_NORMAL='0';

    /**
     *来自交易所普通回报 {@value}
     *@see #SizeOf_TThostFtdcTradeSourceType
     */
    public static final String STRING_THOST_FTDC_TSRC_NORMAL="0";

    /**
     *来自查询 {@value}
     *@see #SizeOf_TThostFtdcTradeSourceType
     */
    public static final char THOST_FTDC_TSRC_QUERY='1';

    /**
     *来自查询 {@value}
     *@see #SizeOf_TThostFtdcTradeSourceType
     */
    public static final String STRING_THOST_FTDC_TSRC_QUERY="1";

    /**
     *TFtdcTradeSourceType是一个成交来源类型
     *@see #THOST_FTDC_TSRC_NORMAL
     *@see #THOST_FTDC_TSRC_QUERY
     */
    public static final int SizeOf_TThostFtdcTradeSourceType=1;

    /**
     *产品统计 {@value}
     *@see #SizeOf_TThostFtdcFlexStatModeType
     */
    public static final char THOST_FTDC_FSM_Product='1';

    /**
     *产品统计 {@value}
     *@see #SizeOf_TThostFtdcFlexStatModeType
     */
    public static final String STRING_THOST_FTDC_FSM_Product="1";

    /**
     *交易所统计 {@value}
     *@see #SizeOf_TThostFtdcFlexStatModeType
     */
    public static final char THOST_FTDC_FSM_Exchange='2';

    /**
     *交易所统计 {@value}
     *@see #SizeOf_TThostFtdcFlexStatModeType
     */
    public static final String STRING_THOST_FTDC_FSM_Exchange="2";

    /**
     *统计所有 {@value}
     *@see #SizeOf_TThostFtdcFlexStatModeType
     */
    public static final char THOST_FTDC_FSM_All='3';

    /**
     *统计所有 {@value}
     *@see #SizeOf_TThostFtdcFlexStatModeType
     */
    public static final String STRING_THOST_FTDC_FSM_All="3";

    /**
     *TFtdcFlexStatModeType是一个产品合约统计方式类型
     *@see #THOST_FTDC_FSM_Product
     *@see #THOST_FTDC_FSM_Exchange
     *@see #THOST_FTDC_FSM_All
     */
    public static final int SizeOf_TThostFtdcFlexStatModeType=1;

    /**
     *属性统计 {@value}
     *@see #SizeOf_TThostFtdcByInvestorRangeType
     */
    public static final char THOST_FTDC_BIR_Property='1';

    /**
     *属性统计 {@value}
     *@see #SizeOf_TThostFtdcByInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_BIR_Property="1";

    /**
     *统计所有 {@value}
     *@see #SizeOf_TThostFtdcByInvestorRangeType
     */
    public static final char THOST_FTDC_BIR_All='2';

    /**
     *统计所有 {@value}
     *@see #SizeOf_TThostFtdcByInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_BIR_All="2";

    /**
     *TFtdcByInvestorRangeType是一个投资者范围统计方式类型
     *@see #THOST_FTDC_BIR_Property
     *@see #THOST_FTDC_BIR_All
     */
    public static final int SizeOf_TThostFtdcByInvestorRangeType=1;

    /**
     *TFtdcSRiskRateType是一个风险度类型
     */
    public static final int SizeOf_TThostFtdcSRiskRateType=21;

    /**
     *TFtdcSequenceNo12Type是一个序号类型
     */
    public static final int SizeOf_TThostFtdcSequenceNo12Type=4;

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcPropertyInvestorRangeType
     */
    public static final char THOST_FTDC_PIR_All='1';

    /**
     *所有 {@value}
     *@see #SizeOf_TThostFtdcPropertyInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_PIR_All="1";

    /**
     *投资者属性 {@value}
     *@see #SizeOf_TThostFtdcPropertyInvestorRangeType
     */
    public static final char THOST_FTDC_PIR_Property='2';

    /**
     *投资者属性 {@value}
     *@see #SizeOf_TThostFtdcPropertyInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_PIR_Property="2";

    /**
     *单一投资者 {@value}
     *@see #SizeOf_TThostFtdcPropertyInvestorRangeType
     */
    public static final char THOST_FTDC_PIR_Single='3';

    /**
     *单一投资者 {@value}
     *@see #SizeOf_TThostFtdcPropertyInvestorRangeType
     */
    public static final String STRING_THOST_FTDC_PIR_Single="3";

    /**
     *TFtdcPropertyInvestorRangeType是一个投资者范围类型
     *@see #THOST_FTDC_PIR_All
     *@see #THOST_FTDC_PIR_Property
     *@see #THOST_FTDC_PIR_Single
     */
    public static final int SizeOf_TThostFtdcPropertyInvestorRangeType=1;

    /**
     *未生成 {@value}
     *@see #SizeOf_TThostFtdcFileStatusType
     */
    public static final char THOST_FTDC_FIS_NoCreate='0';

    /**
     *未生成 {@value}
     *@see #SizeOf_TThostFtdcFileStatusType
     */
    public static final String STRING_THOST_FTDC_FIS_NoCreate="0";

    /**
     *已生成 {@value}
     *@see #SizeOf_TThostFtdcFileStatusType
     */
    public static final char THOST_FTDC_FIS_Created='1';

    /**
     *已生成 {@value}
     *@see #SizeOf_TThostFtdcFileStatusType
     */
    public static final String STRING_THOST_FTDC_FIS_Created="1";

    /**
     *生成失败 {@value}
     *@see #SizeOf_TThostFtdcFileStatusType
     */
    public static final char THOST_FTDC_FIS_Failed='2';

    /**
     *生成失败 {@value}
     *@see #SizeOf_TThostFtdcFileStatusType
     */
    public static final String STRING_THOST_FTDC_FIS_Failed="2";

    /**
     *TFtdcFileStatusType是一个文件状态类型
     *@see #THOST_FTDC_FIS_NoCreate
     *@see #THOST_FTDC_FIS_Created
     *@see #THOST_FTDC_FIS_Failed
     */
    public static final int SizeOf_TThostFtdcFileStatusType=1;

    /**
     *下发 {@value}
     *@see #SizeOf_TThostFtdcFileGenStyleType
     */
    public static final char THOST_FTDC_FGS_FileTransmit='0';

    /**
     *下发 {@value}
     *@see #SizeOf_TThostFtdcFileGenStyleType
     */
    public static final String STRING_THOST_FTDC_FGS_FileTransmit="0";

    /**
     *生成 {@value}
     *@see #SizeOf_TThostFtdcFileGenStyleType
     */
    public static final char THOST_FTDC_FGS_FileGen='1';

    /**
     *生成 {@value}
     *@see #SizeOf_TThostFtdcFileGenStyleType
     */
    public static final String STRING_THOST_FTDC_FGS_FileGen="1";

    /**
     *TFtdcFileGenStyleType是一个文件生成方式类型
     *@see #THOST_FTDC_FGS_FileTransmit
     *@see #THOST_FTDC_FGS_FileGen
     */
    public static final int SizeOf_TThostFtdcFileGenStyleType=1;

    /**
     *增加 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final char THOST_FTDC_SoM_Add='1';

    /**
     *增加 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final String STRING_THOST_FTDC_SoM_Add="1";

    /**
     *修改 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final char THOST_FTDC_SoM_Update='2';

    /**
     *修改 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final String STRING_THOST_FTDC_SoM_Update="2";

    /**
     *删除 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final char THOST_FTDC_SoM_Delete='3';

    /**
     *删除 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final String STRING_THOST_FTDC_SoM_Delete="3";

    /**
     *复制 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final char THOST_FTDC_SoM_Copy='4';

    /**
     *复制 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final String STRING_THOST_FTDC_SoM_Copy="4";

    /**
     *激活 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final char THOST_FTDC_SoM_AcTive='5';

    /**
     *激活 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final String STRING_THOST_FTDC_SoM_AcTive="5";

    /**
     *注销 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final char THOST_FTDC_SoM_CanCel='6';

    /**
     *注销 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final String STRING_THOST_FTDC_SoM_CanCel="6";

    /**
     *重置 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final char THOST_FTDC_SoM_ReSet='7';

    /**
     *重置 {@value}
     *@see #SizeOf_TThostFtdcSysOperModeType
     */
    public static final String STRING_THOST_FTDC_SoM_ReSet="7";

    /**
     *TFtdcSysOperModeType是一个系统日志操作方法类型
     *@see #THOST_FTDC_SoM_Add
     *@see #THOST_FTDC_SoM_Update
     *@see #THOST_FTDC_SoM_Delete
     *@see #THOST_FTDC_SoM_Copy
     *@see #THOST_FTDC_SoM_AcTive
     *@see #THOST_FTDC_SoM_CanCel
     *@see #THOST_FTDC_SoM_ReSet
     */
    public static final int SizeOf_TThostFtdcSysOperModeType=1;

    /**
     *修改操作员密码 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_UpdatePassword='0';

    /**
     *修改操作员密码 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_UpdatePassword="0";

    /**
     *操作员组织架构关系 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_UserDepartment='1';

    /**
     *操作员组织架构关系 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_UserDepartment="1";

    /**
     *角色管理 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_RoleManager='2';

    /**
     *角色管理 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_RoleManager="2";

    /**
     *角色功能设置 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_RoleFunction='3';

    /**
     *角色功能设置 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_RoleFunction="3";

    /**
     *基础参数设置 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_BaseParam='4';

    /**
     *基础参数设置 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_BaseParam="4";

    /**
     *设置操作员 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_SetUserID='5';

    /**
     *设置操作员 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_SetUserID="5";

    /**
     *用户角色设置 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_SetUserRole='6';

    /**
     *用户角色设置 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_SetUserRole="6";

    /**
     *用户IP限制 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_UserIpRestriction='7';

    /**
     *用户IP限制 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_UserIpRestriction="7";

    /**
     *组织架构管理 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_DepartmentManager='8';

    /**
     *组织架构管理 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_DepartmentManager="8";

    /**
     *组织架构向查询分类复制 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_DepartmentCopy='9';

    /**
     *组织架构向查询分类复制 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_DepartmentCopy="9";

    /**
     *交易编码管理 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_Tradingcode='A';

    /**
     *交易编码管理 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_Tradingcode="A";

    /**
     *投资者状态维护 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_InvestorStatus='B';

    /**
     *投资者状态维护 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_InvestorStatus="B";

    /**
     *投资者权限管理 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_InvestorAuthority='C';

    /**
     *投资者权限管理 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_InvestorAuthority="C";

    /**
     *属性设置 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_PropertySet='D';

    /**
     *属性设置 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_PropertySet="D";

    /**
     *重置投资者密码 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_ReSetInvestorPasswd='E';

    /**
     *重置投资者密码 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_ReSetInvestorPasswd="E";

    /**
     *投资者个性信息维护 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final char THOST_FTDC_SoT_InvestorPersonalityInfo='F';

    /**
     *投资者个性信息维护 {@value}
     *@see #SizeOf_TThostFtdcSysOperTypeType
     */
    public static final String STRING_THOST_FTDC_SoT_InvestorPersonalityInfo="F";

    /**
     *TFtdcSysOperTypeType是一个系统日志操作类型类型
     *@see #THOST_FTDC_SoT_UpdatePassword
     *@see #THOST_FTDC_SoT_UserDepartment
     *@see #THOST_FTDC_SoT_RoleManager
     *@see #THOST_FTDC_SoT_RoleFunction
     *@see #THOST_FTDC_SoT_BaseParam
     *@see #THOST_FTDC_SoT_SetUserID
     *@see #THOST_FTDC_SoT_SetUserRole
     *@see #THOST_FTDC_SoT_UserIpRestriction
     *@see #THOST_FTDC_SoT_DepartmentManager
     *@see #THOST_FTDC_SoT_DepartmentCopy
     *@see #THOST_FTDC_SoT_Tradingcode
     *@see #THOST_FTDC_SoT_InvestorStatus
     *@see #THOST_FTDC_SoT_InvestorAuthority
     *@see #THOST_FTDC_SoT_PropertySet
     *@see #THOST_FTDC_SoT_ReSetInvestorPasswd
     *@see #THOST_FTDC_SoT_InvestorPersonalityInfo
     */
    public static final int SizeOf_TThostFtdcSysOperTypeType=1;

    /**
     *查询当前交易日报送的数据 {@value}
     *@see #SizeOf_TThostFtdcCSRCDataQueyTypeType
     */
    public static final char THOST_FTDC_CSRCQ_Current='0';

    /**
     *查询当前交易日报送的数据 {@value}
     *@see #SizeOf_TThostFtdcCSRCDataQueyTypeType
     */
    public static final String STRING_THOST_FTDC_CSRCQ_Current="0";

    /**
     *查询历史报送的代理经纪公司的数据 {@value}
     *@see #SizeOf_TThostFtdcCSRCDataQueyTypeType
     */
    public static final char THOST_FTDC_CSRCQ_History='1';

    /**
     *查询历史报送的代理经纪公司的数据 {@value}
     *@see #SizeOf_TThostFtdcCSRCDataQueyTypeType
     */
    public static final String STRING_THOST_FTDC_CSRCQ_History="1";

    /**
     *TFtdcCSRCDataQueyTypeType是一个上报数据查询类型类型
     *@see #THOST_FTDC_CSRCQ_Current
     *@see #THOST_FTDC_CSRCQ_History
     */
    public static final int SizeOf_TThostFtdcCSRCDataQueyTypeType=1;

    /**
     *活跃 {@value}
     *@see #SizeOf_TThostFtdcFreezeStatusType
     */
    public static final char THOST_FTDC_FRS_Normal='1';

    /**
     *活跃 {@value}
     *@see #SizeOf_TThostFtdcFreezeStatusType
     */
    public static final String STRING_THOST_FTDC_FRS_Normal="1";

    /**
     *休眠 {@value}
     *@see #SizeOf_TThostFtdcFreezeStatusType
     */
    public static final char THOST_FTDC_FRS_Freeze='0';

    /**
     *休眠 {@value}
     *@see #SizeOf_TThostFtdcFreezeStatusType
     */
    public static final String STRING_THOST_FTDC_FRS_Freeze="0";

    /**
     *TFtdcFreezeStatusType是一个休眠状态类型
     *@see #THOST_FTDC_FRS_Normal
     *@see #THOST_FTDC_FRS_Freeze
     */
    public static final int SizeOf_TThostFtdcFreezeStatusType=1;

    /**
     *已规范 {@value}
     *@see #SizeOf_TThostFtdcStandardStatusType
     */
    public static final char THOST_FTDC_STST_Standard='0';

    /**
     *已规范 {@value}
     *@see #SizeOf_TThostFtdcStandardStatusType
     */
    public static final String STRING_THOST_FTDC_STST_Standard="0";

    /**
     *未规范 {@value}
     *@see #SizeOf_TThostFtdcStandardStatusType
     */
    public static final char THOST_FTDC_STST_NonStandard='1';

    /**
     *未规范 {@value}
     *@see #SizeOf_TThostFtdcStandardStatusType
     */
    public static final String STRING_THOST_FTDC_STST_NonStandard="1";

    /**
     *TFtdcStandardStatusType是一个规范状态类型
     *@see #THOST_FTDC_STST_Standard
     *@see #THOST_FTDC_STST_NonStandard
     */
    public static final int SizeOf_TThostFtdcStandardStatusType=1;

    /**
     *TFtdcCSRCFreezeStatusType是一个休眠状态类型
     */
    public static final int SizeOf_TThostFtdcCSRCFreezeStatusType=2;

    /**
     *休眠户 {@value}
     *@see #SizeOf_TThostFtdcRightParamTypeType
     */
    public static final char THOST_FTDC_RPT_Freeze='1';

    /**
     *休眠户 {@value}
     *@see #SizeOf_TThostFtdcRightParamTypeType
     */
    public static final String STRING_THOST_FTDC_RPT_Freeze="1";

    /**
     *激活休眠户 {@value}
     *@see #SizeOf_TThostFtdcRightParamTypeType
     */
    public static final char THOST_FTDC_RPT_FreezeActive='2';

    /**
     *激活休眠户 {@value}
     *@see #SizeOf_TThostFtdcRightParamTypeType
     */
    public static final String STRING_THOST_FTDC_RPT_FreezeActive="2";

    /**
     *开仓权限限制 {@value}
     *@see #SizeOf_TThostFtdcRightParamTypeType
     */
    public static final char THOST_FTDC_RPT_OpenLimit='3';

    /**
     *开仓权限限制 {@value}
     *@see #SizeOf_TThostFtdcRightParamTypeType
     */
    public static final String STRING_THOST_FTDC_RPT_OpenLimit="3";

    /**
     *解除开仓权限限制 {@value}
     *@see #SizeOf_TThostFtdcRightParamTypeType
     */
    public static final char THOST_FTDC_RPT_RelieveOpenLimit='4';

    /**
     *解除开仓权限限制 {@value}
     *@see #SizeOf_TThostFtdcRightParamTypeType
     */
    public static final String STRING_THOST_FTDC_RPT_RelieveOpenLimit="4";

    /**
     *TFtdcRightParamTypeType是一个配置类型类型
     *@see #THOST_FTDC_RPT_Freeze
     *@see #THOST_FTDC_RPT_FreezeActive
     *@see #THOST_FTDC_RPT_OpenLimit
     *@see #THOST_FTDC_RPT_RelieveOpenLimit
     */
    public static final int SizeOf_TThostFtdcRightParamTypeType=1;

    /**
     *TFtdcRightTemplateIDType是一个模板代码类型
     */
    public static final int SizeOf_TThostFtdcRightTemplateIDType=9;

    /**
     *TFtdcRightTemplateNameType是一个模板名称类型
     */
    public static final int SizeOf_TThostFtdcRightTemplateNameType=61;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcDataStatusType
     */
    public static final char THOST_FTDC_AMLDS_Normal='0';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcDataStatusType
     */
    public static final String STRING_THOST_FTDC_AMLDS_Normal="0";

    /**
     *已删除 {@value}
     *@see #SizeOf_TThostFtdcDataStatusType
     */
    public static final char THOST_FTDC_AMLDS_Deleted='1';

    /**
     *已删除 {@value}
     *@see #SizeOf_TThostFtdcDataStatusType
     */
    public static final String STRING_THOST_FTDC_AMLDS_Deleted="1";

    /**
     *TFtdcDataStatusType是一个反洗钱审核表数据状态类型
     *@see #THOST_FTDC_AMLDS_Normal
     *@see #THOST_FTDC_AMLDS_Deleted
     */
    public static final int SizeOf_TThostFtdcDataStatusType=1;

    /**
     *未复核 {@value}
     *@see #SizeOf_TThostFtdcAMLCheckStatusType
     */
    public static final char THOST_FTDC_AMLCHS_Init='0';

    /**
     *未复核 {@value}
     *@see #SizeOf_TThostFtdcAMLCheckStatusType
     */
    public static final String STRING_THOST_FTDC_AMLCHS_Init="0";

    /**
     *复核中 {@value}
     *@see #SizeOf_TThostFtdcAMLCheckStatusType
     */
    public static final char THOST_FTDC_AMLCHS_Checking='1';

    /**
     *复核中 {@value}
     *@see #SizeOf_TThostFtdcAMLCheckStatusType
     */
    public static final String STRING_THOST_FTDC_AMLCHS_Checking="1";

    /**
     *已复核 {@value}
     *@see #SizeOf_TThostFtdcAMLCheckStatusType
     */
    public static final char THOST_FTDC_AMLCHS_Checked='2';

    /**
     *已复核 {@value}
     *@see #SizeOf_TThostFtdcAMLCheckStatusType
     */
    public static final String STRING_THOST_FTDC_AMLCHS_Checked="2";

    /**
     *拒绝上报 {@value}
     *@see #SizeOf_TThostFtdcAMLCheckStatusType
     */
    public static final char THOST_FTDC_AMLCHS_RefuseReport='3';

    /**
     *拒绝上报 {@value}
     *@see #SizeOf_TThostFtdcAMLCheckStatusType
     */
    public static final String STRING_THOST_FTDC_AMLCHS_RefuseReport="3";

    /**
     *TFtdcAMLCheckStatusType是一个审核状态类型
     *@see #THOST_FTDC_AMLCHS_Init
     *@see #THOST_FTDC_AMLCHS_Checking
     *@see #THOST_FTDC_AMLCHS_Checked
     *@see #THOST_FTDC_AMLCHS_RefuseReport
     */
    public static final int SizeOf_TThostFtdcAMLCheckStatusType=1;

    /**
     *检查日期 {@value}
     *@see #SizeOf_TThostFtdcAmlDateTypeType
     */
    public static final char THOST_FTDC_AMLDT_DrawDay='0';

    /**
     *检查日期 {@value}
     *@see #SizeOf_TThostFtdcAmlDateTypeType
     */
    public static final String STRING_THOST_FTDC_AMLDT_DrawDay="0";

    /**
     *发生日期 {@value}
     *@see #SizeOf_TThostFtdcAmlDateTypeType
     */
    public static final char THOST_FTDC_AMLDT_TouchDay='1';

    /**
     *发生日期 {@value}
     *@see #SizeOf_TThostFtdcAmlDateTypeType
     */
    public static final String STRING_THOST_FTDC_AMLDT_TouchDay="1";

    /**
     *TFtdcAmlDateTypeType是一个日期类型类型
     *@see #THOST_FTDC_AMLDT_DrawDay
     *@see #THOST_FTDC_AMLDT_TouchDay
     */
    public static final int SizeOf_TThostFtdcAmlDateTypeType=1;

    /**
     *零级审核 {@value}
     *@see #SizeOf_TThostFtdcAmlCheckLevelType
     */
    public static final char THOST_FTDC_AMLCL_CheckLevel0='0';

    /**
     *零级审核 {@value}
     *@see #SizeOf_TThostFtdcAmlCheckLevelType
     */
    public static final String STRING_THOST_FTDC_AMLCL_CheckLevel0="0";

    /**
     *一级审核 {@value}
     *@see #SizeOf_TThostFtdcAmlCheckLevelType
     */
    public static final char THOST_FTDC_AMLCL_CheckLevel1='1';

    /**
     *一级审核 {@value}
     *@see #SizeOf_TThostFtdcAmlCheckLevelType
     */
    public static final String STRING_THOST_FTDC_AMLCL_CheckLevel1="1";

    /**
     *二级审核 {@value}
     *@see #SizeOf_TThostFtdcAmlCheckLevelType
     */
    public static final char THOST_FTDC_AMLCL_CheckLevel2='2';

    /**
     *二级审核 {@value}
     *@see #SizeOf_TThostFtdcAmlCheckLevelType
     */
    public static final String STRING_THOST_FTDC_AMLCL_CheckLevel2="2";

    /**
     *三级审核 {@value}
     *@see #SizeOf_TThostFtdcAmlCheckLevelType
     */
    public static final char THOST_FTDC_AMLCL_CheckLevel3='3';

    /**
     *三级审核 {@value}
     *@see #SizeOf_TThostFtdcAmlCheckLevelType
     */
    public static final String STRING_THOST_FTDC_AMLCL_CheckLevel3="3";

    /**
     *TFtdcAmlCheckLevelType是一个审核级别类型
     *@see #THOST_FTDC_AMLCL_CheckLevel0
     *@see #THOST_FTDC_AMLCL_CheckLevel1
     *@see #THOST_FTDC_AMLCL_CheckLevel2
     *@see #THOST_FTDC_AMLCL_CheckLevel3
     */
    public static final int SizeOf_TThostFtdcAmlCheckLevelType=1;

    /**
     *TFtdcAmlCheckFlowType是一个反洗钱数据抽取审核流程类型
     */
    public static final int SizeOf_TThostFtdcAmlCheckFlowType=2;

    /**
     *TFtdcDataTypeType是一个数据类型类型
     */
    public static final int SizeOf_TThostFtdcDataTypeType=129;

    /**
     *CSV {@value}
     *@see #SizeOf_TThostFtdcExportFileTypeType
     */
    public static final char THOST_FTDC_EFT_CSV='0';

    /**
     *CSV {@value}
     *@see #SizeOf_TThostFtdcExportFileTypeType
     */
    public static final String STRING_THOST_FTDC_EFT_CSV="0";

    /**
     *Excel {@value}
     *@see #SizeOf_TThostFtdcExportFileTypeType
     */
    public static final char THOST_FTDC_EFT_EXCEL='1';

    /**
     *Excel {@value}
     *@see #SizeOf_TThostFtdcExportFileTypeType
     */
    public static final String STRING_THOST_FTDC_EFT_EXCEL="1";

    /**
     *DBF {@value}
     *@see #SizeOf_TThostFtdcExportFileTypeType
     */
    public static final char THOST_FTDC_EFT_DBF='2';

    /**
     *DBF {@value}
     *@see #SizeOf_TThostFtdcExportFileTypeType
     */
    public static final String STRING_THOST_FTDC_EFT_DBF="2";

    /**
     *TFtdcExportFileTypeType是一个导出文件类型类型
     *@see #THOST_FTDC_EFT_CSV
     *@see #THOST_FTDC_EFT_EXCEL
     *@see #THOST_FTDC_EFT_DBF
     */
    public static final int SizeOf_TThostFtdcExportFileTypeType=1;

    /**
     *结算前准备 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerTypeType
     */
    public static final char THOST_FTDC_SMT_Before='1';

    /**
     *结算前准备 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerTypeType
     */
    public static final String STRING_THOST_FTDC_SMT_Before="1";

    /**
     *结算 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerTypeType
     */
    public static final char THOST_FTDC_SMT_Settlement='2';

    /**
     *结算 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerTypeType
     */
    public static final String STRING_THOST_FTDC_SMT_Settlement="2";

    /**
     *结算后核对 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerTypeType
     */
    public static final char THOST_FTDC_SMT_After='3';

    /**
     *结算后核对 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerTypeType
     */
    public static final String STRING_THOST_FTDC_SMT_After="3";

    /**
     *结算后处理 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerTypeType
     */
    public static final char THOST_FTDC_SMT_Settlemented='4';

    /**
     *结算后处理 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerTypeType
     */
    public static final String STRING_THOST_FTDC_SMT_Settlemented="4";

    /**
     *TFtdcSettleManagerTypeType是一个结算配置类型类型
     *@see #THOST_FTDC_SMT_Before
     *@see #THOST_FTDC_SMT_Settlement
     *@see #THOST_FTDC_SMT_After
     *@see #THOST_FTDC_SMT_Settlemented
     */
    public static final int SizeOf_TThostFtdcSettleManagerTypeType=1;

    /**
     *TFtdcSettleManagerIDType是一个结算配置代码类型
     */
    public static final int SizeOf_TThostFtdcSettleManagerIDType=33;

    /**
     *TFtdcSettleManagerNameType是一个结算配置名称类型
     */
    public static final int SizeOf_TThostFtdcSettleManagerNameType=129;

    /**
     *必要 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerLevelType
     */
    public static final char THOST_FTDC_SML_Must='1';

    /**
     *必要 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerLevelType
     */
    public static final String STRING_THOST_FTDC_SML_Must="1";

    /**
     *警告 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerLevelType
     */
    public static final char THOST_FTDC_SML_Alarm='2';

    /**
     *警告 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerLevelType
     */
    public static final String STRING_THOST_FTDC_SML_Alarm="2";

    /**
     *提示 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerLevelType
     */
    public static final char THOST_FTDC_SML_Prompt='3';

    /**
     *提示 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerLevelType
     */
    public static final String STRING_THOST_FTDC_SML_Prompt="3";

    /**
     *不检查 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerLevelType
     */
    public static final char THOST_FTDC_SML_Ignore='4';

    /**
     *不检查 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerLevelType
     */
    public static final String STRING_THOST_FTDC_SML_Ignore="4";

    /**
     *TFtdcSettleManagerLevelType是一个结算配置等级类型
     *@see #THOST_FTDC_SML_Must
     *@see #THOST_FTDC_SML_Alarm
     *@see #THOST_FTDC_SML_Prompt
     *@see #THOST_FTDC_SML_Ignore
     */
    public static final int SizeOf_TThostFtdcSettleManagerLevelType=1;

    /**
     *交易所核对 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerGroupType
     */
    public static final char THOST_FTDC_SMG_Exhcange='1';

    /**
     *交易所核对 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerGroupType
     */
    public static final String STRING_THOST_FTDC_SMG_Exhcange="1";

    /**
     *内部核对 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerGroupType
     */
    public static final char THOST_FTDC_SMG_ASP='2';

    /**
     *内部核对 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerGroupType
     */
    public static final String STRING_THOST_FTDC_SMG_ASP="2";

    /**
     *上报数据核对 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerGroupType
     */
    public static final char THOST_FTDC_SMG_CSRC='3';

    /**
     *上报数据核对 {@value}
     *@see #SizeOf_TThostFtdcSettleManagerGroupType
     */
    public static final String STRING_THOST_FTDC_SMG_CSRC="3";

    /**
     *TFtdcSettleManagerGroupType是一个模块分组类型
     *@see #THOST_FTDC_SMG_Exhcange
     *@see #THOST_FTDC_SMG_ASP
     *@see #THOST_FTDC_SMG_CSRC
     */
    public static final int SizeOf_TThostFtdcSettleManagerGroupType=1;

    /**
     *TFtdcCheckResultMemoType是一个核对结果说明类型
     */
    public static final int SizeOf_TThostFtdcCheckResultMemoType=1025;

    /**
     *TFtdcFunctionUrlType是一个功能链接类型
     */
    public static final int SizeOf_TThostFtdcFunctionUrlType=1025;

    /**
     *TFtdcAuthInfoType是一个客户端认证信息类型
     */
    public static final int SizeOf_TThostFtdcAuthInfoType=129;

    /**
     *TFtdcAuthCodeType是一个客户端认证码类型
     */
    public static final int SizeOf_TThostFtdcAuthCodeType=17;

    /**
     *可重复使用 {@value}
     *@see #SizeOf_TThostFtdcLimitUseTypeType
     */
    public static final char THOST_FTDC_LUT_Repeatable='1';

    /**
     *可重复使用 {@value}
     *@see #SizeOf_TThostFtdcLimitUseTypeType
     */
    public static final String STRING_THOST_FTDC_LUT_Repeatable="1";

    /**
     *不可重复使用 {@value}
     *@see #SizeOf_TThostFtdcLimitUseTypeType
     */
    public static final char THOST_FTDC_LUT_Unrepeatable='2';

    /**
     *不可重复使用 {@value}
     *@see #SizeOf_TThostFtdcLimitUseTypeType
     */
    public static final String STRING_THOST_FTDC_LUT_Unrepeatable="2";

    /**
     *TFtdcLimitUseTypeType是一个保值额度使用类型类型
     *@see #THOST_FTDC_LUT_Repeatable
     *@see #THOST_FTDC_LUT_Unrepeatable
     */
    public static final int SizeOf_TThostFtdcLimitUseTypeType=1;

    /**
     *本系统 {@value}
     *@see #SizeOf_TThostFtdcDataResourceType
     */
    public static final char THOST_FTDC_DAR_Settle='1';

    /**
     *本系统 {@value}
     *@see #SizeOf_TThostFtdcDataResourceType
     */
    public static final String STRING_THOST_FTDC_DAR_Settle="1";

    /**
     *交易所 {@value}
     *@see #SizeOf_TThostFtdcDataResourceType
     */
    public static final char THOST_FTDC_DAR_Exchange='2';

    /**
     *交易所 {@value}
     *@see #SizeOf_TThostFtdcDataResourceType
     */
    public static final String STRING_THOST_FTDC_DAR_Exchange="2";

    /**
     *报送数据 {@value}
     *@see #SizeOf_TThostFtdcDataResourceType
     */
    public static final char THOST_FTDC_DAR_CSRC='3';

    /**
     *报送数据 {@value}
     *@see #SizeOf_TThostFtdcDataResourceType
     */
    public static final String STRING_THOST_FTDC_DAR_CSRC="3";

    /**
     *TFtdcDataResourceType是一个数据来源类型
     *@see #THOST_FTDC_DAR_Settle
     *@see #THOST_FTDC_DAR_Exchange
     *@see #THOST_FTDC_DAR_CSRC
     */
    public static final int SizeOf_TThostFtdcDataResourceType=1;

    /**
     *交易所保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginTypeType
     */
    public static final char THOST_FTDC_MGT_ExchMarginRate='0';

    /**
     *交易所保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginTypeType
     */
    public static final String STRING_THOST_FTDC_MGT_ExchMarginRate="0";

    /**
     *投资者保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginTypeType
     */
    public static final char THOST_FTDC_MGT_InstrMarginRate='1';

    /**
     *投资者保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginTypeType
     */
    public static final String STRING_THOST_FTDC_MGT_InstrMarginRate="1";

    /**
     *投资者交易保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginTypeType
     */
    public static final char THOST_FTDC_MGT_InstrMarginRateTrade='2';

    /**
     *投资者交易保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginTypeType
     */
    public static final String STRING_THOST_FTDC_MGT_InstrMarginRateTrade="2";

    /**
     *TFtdcMarginTypeType是一个保证金类型类型
     *@see #THOST_FTDC_MGT_ExchMarginRate
     *@see #THOST_FTDC_MGT_InstrMarginRate
     *@see #THOST_FTDC_MGT_InstrMarginRateTrade
     */
    public static final int SizeOf_TThostFtdcMarginTypeType=1;

    /**
     *仅当日生效 {@value}
     *@see #SizeOf_TThostFtdcActiveTypeType
     */
    public static final char THOST_FTDC_ACT_Intraday='1';

    /**
     *仅当日生效 {@value}
     *@see #SizeOf_TThostFtdcActiveTypeType
     */
    public static final String STRING_THOST_FTDC_ACT_Intraday="1";

    /**
     *长期生效 {@value}
     *@see #SizeOf_TThostFtdcActiveTypeType
     */
    public static final char THOST_FTDC_ACT_Long='2';

    /**
     *长期生效 {@value}
     *@see #SizeOf_TThostFtdcActiveTypeType
     */
    public static final String STRING_THOST_FTDC_ACT_Long="2";

    /**
     *TFtdcActiveTypeType是一个生效类型类型
     *@see #THOST_FTDC_ACT_Intraday
     *@see #THOST_FTDC_ACT_Long
     */
    public static final int SizeOf_TThostFtdcActiveTypeType=1;

    /**
     *交易所保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginRateTypeType
     */
    public static final char THOST_FTDC_MRT_Exchange='1';

    /**
     *交易所保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginRateTypeType
     */
    public static final String STRING_THOST_FTDC_MRT_Exchange="1";

    /**
     *投资者保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginRateTypeType
     */
    public static final char THOST_FTDC_MRT_Investor='2';

    /**
     *投资者保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginRateTypeType
     */
    public static final String STRING_THOST_FTDC_MRT_Investor="2";

    /**
     *投资者交易保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginRateTypeType
     */
    public static final char THOST_FTDC_MRT_InvestorTrade='3';

    /**
     *投资者交易保证金率 {@value}
     *@see #SizeOf_TThostFtdcMarginRateTypeType
     */
    public static final String STRING_THOST_FTDC_MRT_InvestorTrade="3";

    /**
     *TFtdcMarginRateTypeType是一个冲突保证金率类型类型
     *@see #THOST_FTDC_MRT_Exchange
     *@see #THOST_FTDC_MRT_Investor
     *@see #THOST_FTDC_MRT_InvestorTrade
     */
    public static final int SizeOf_TThostFtdcMarginRateTypeType=1;

    /**
     *未生成备份数据 {@value}
     *@see #SizeOf_TThostFtdcBackUpStatusType
     */
    public static final char THOST_FTDC_BUS_UnBak='0';

    /**
     *未生成备份数据 {@value}
     *@see #SizeOf_TThostFtdcBackUpStatusType
     */
    public static final String STRING_THOST_FTDC_BUS_UnBak="0";

    /**
     *备份数据生成中 {@value}
     *@see #SizeOf_TThostFtdcBackUpStatusType
     */
    public static final char THOST_FTDC_BUS_BakUp='1';

    /**
     *备份数据生成中 {@value}
     *@see #SizeOf_TThostFtdcBackUpStatusType
     */
    public static final String STRING_THOST_FTDC_BUS_BakUp="1";

    /**
     *已生成备份数据 {@value}
     *@see #SizeOf_TThostFtdcBackUpStatusType
     */
    public static final char THOST_FTDC_BUS_BakUped='2';

    /**
     *已生成备份数据 {@value}
     *@see #SizeOf_TThostFtdcBackUpStatusType
     */
    public static final String STRING_THOST_FTDC_BUS_BakUped="2";

    /**
     *备份数据失败 {@value}
     *@see #SizeOf_TThostFtdcBackUpStatusType
     */
    public static final char THOST_FTDC_BUS_BakFail='3';

    /**
     *备份数据失败 {@value}
     *@see #SizeOf_TThostFtdcBackUpStatusType
     */
    public static final String STRING_THOST_FTDC_BUS_BakFail="3";

    /**
     *TFtdcBackUpStatusType是一个备份数据状态类型
     *@see #THOST_FTDC_BUS_UnBak
     *@see #THOST_FTDC_BUS_BakUp
     *@see #THOST_FTDC_BUS_BakUped
     *@see #THOST_FTDC_BUS_BakFail
     */
    public static final int SizeOf_TThostFtdcBackUpStatusType=1;

    /**
     *结算初始化未开始 {@value}
     *@see #SizeOf_TThostFtdcInitSettlementType
     */
    public static final char THOST_FTDC_SIS_UnInitialize='0';

    /**
     *结算初始化未开始 {@value}
     *@see #SizeOf_TThostFtdcInitSettlementType
     */
    public static final String STRING_THOST_FTDC_SIS_UnInitialize="0";

    /**
     *结算初始化中 {@value}
     *@see #SizeOf_TThostFtdcInitSettlementType
     */
    public static final char THOST_FTDC_SIS_Initialize='1';

    /**
     *结算初始化中 {@value}
     *@see #SizeOf_TThostFtdcInitSettlementType
     */
    public static final String STRING_THOST_FTDC_SIS_Initialize="1";

    /**
     *结算初始化完成 {@value}
     *@see #SizeOf_TThostFtdcInitSettlementType
     */
    public static final char THOST_FTDC_SIS_Initialized='2';

    /**
     *结算初始化完成 {@value}
     *@see #SizeOf_TThostFtdcInitSettlementType
     */
    public static final String STRING_THOST_FTDC_SIS_Initialized="2";

    /**
     *TFtdcInitSettlementType是一个结算初始化状态类型
     *@see #THOST_FTDC_SIS_UnInitialize
     *@see #THOST_FTDC_SIS_Initialize
     *@see #THOST_FTDC_SIS_Initialized
     */
    public static final int SizeOf_TThostFtdcInitSettlementType=1;

    /**
     *未生成报表数据 {@value}
     *@see #SizeOf_TThostFtdcReportStatusType
     */
    public static final char THOST_FTDC_SRS_NoCreate='0';

    /**
     *未生成报表数据 {@value}
     *@see #SizeOf_TThostFtdcReportStatusType
     */
    public static final String STRING_THOST_FTDC_SRS_NoCreate="0";

    /**
     *报表数据生成中 {@value}
     *@see #SizeOf_TThostFtdcReportStatusType
     */
    public static final char THOST_FTDC_SRS_Create='1';

    /**
     *报表数据生成中 {@value}
     *@see #SizeOf_TThostFtdcReportStatusType
     */
    public static final String STRING_THOST_FTDC_SRS_Create="1";

    /**
     *已生成报表数据 {@value}
     *@see #SizeOf_TThostFtdcReportStatusType
     */
    public static final char THOST_FTDC_SRS_Created='2';

    /**
     *已生成报表数据 {@value}
     *@see #SizeOf_TThostFtdcReportStatusType
     */
    public static final String STRING_THOST_FTDC_SRS_Created="2";

    /**
     *生成报表数据失败 {@value}
     *@see #SizeOf_TThostFtdcReportStatusType
     */
    public static final char THOST_FTDC_SRS_CreateFail='3';

    /**
     *生成报表数据失败 {@value}
     *@see #SizeOf_TThostFtdcReportStatusType
     */
    public static final String STRING_THOST_FTDC_SRS_CreateFail="3";

    /**
     *TFtdcReportStatusType是一个报表数据生成状态类型
     *@see #THOST_FTDC_SRS_NoCreate
     *@see #THOST_FTDC_SRS_Create
     *@see #THOST_FTDC_SRS_Created
     *@see #THOST_FTDC_SRS_CreateFail
     */
    public static final int SizeOf_TThostFtdcReportStatusType=1;

    /**
     *归档未完成 {@value}
     *@see #SizeOf_TThostFtdcSaveStatusType
     */
    public static final char THOST_FTDC_SSS_UnSaveData='0';

    /**
     *归档未完成 {@value}
     *@see #SizeOf_TThostFtdcSaveStatusType
     */
    public static final String STRING_THOST_FTDC_SSS_UnSaveData="0";

    /**
     *归档完成 {@value}
     *@see #SizeOf_TThostFtdcSaveStatusType
     */
    public static final char THOST_FTDC_SSS_SaveDatad='1';

    /**
     *归档完成 {@value}
     *@see #SizeOf_TThostFtdcSaveStatusType
     */
    public static final String STRING_THOST_FTDC_SSS_SaveDatad="1";

    /**
     *TFtdcSaveStatusType是一个数据归档状态类型
     *@see #THOST_FTDC_SSS_UnSaveData
     *@see #THOST_FTDC_SSS_SaveDatad
     */
    public static final int SizeOf_TThostFtdcSaveStatusType=1;

    /**
     *未归档数据 {@value}
     *@see #SizeOf_TThostFtdcSettArchiveStatusType
     */
    public static final char THOST_FTDC_SAS_UnArchived='0';

    /**
     *未归档数据 {@value}
     *@see #SizeOf_TThostFtdcSettArchiveStatusType
     */
    public static final String STRING_THOST_FTDC_SAS_UnArchived="0";

    /**
     *数据归档中 {@value}
     *@see #SizeOf_TThostFtdcSettArchiveStatusType
     */
    public static final char THOST_FTDC_SAS_Archiving='1';

    /**
     *数据归档中 {@value}
     *@see #SizeOf_TThostFtdcSettArchiveStatusType
     */
    public static final String STRING_THOST_FTDC_SAS_Archiving="1";

    /**
     *已归档数据 {@value}
     *@see #SizeOf_TThostFtdcSettArchiveStatusType
     */
    public static final char THOST_FTDC_SAS_Archived='2';

    /**
     *已归档数据 {@value}
     *@see #SizeOf_TThostFtdcSettArchiveStatusType
     */
    public static final String STRING_THOST_FTDC_SAS_Archived="2";

    /**
     *归档数据失败 {@value}
     *@see #SizeOf_TThostFtdcSettArchiveStatusType
     */
    public static final char THOST_FTDC_SAS_ArchiveFail='3';

    /**
     *归档数据失败 {@value}
     *@see #SizeOf_TThostFtdcSettArchiveStatusType
     */
    public static final String STRING_THOST_FTDC_SAS_ArchiveFail="3";

    /**
     *TFtdcSettArchiveStatusType是一个结算确认数据归档状态类型
     *@see #THOST_FTDC_SAS_UnArchived
     *@see #THOST_FTDC_SAS_Archiving
     *@see #THOST_FTDC_SAS_Archived
     *@see #THOST_FTDC_SAS_ArchiveFail
     */
    public static final int SizeOf_TThostFtdcSettArchiveStatusType=1;

    /**
     *未知类型 {@value}
     *@see #SizeOf_TThostFtdcCTPTypeType
     */
    public static final char THOST_FTDC_CTPT_Unkown='0';

    /**
     *未知类型 {@value}
     *@see #SizeOf_TThostFtdcCTPTypeType
     */
    public static final String STRING_THOST_FTDC_CTPT_Unkown="0";

    /**
     *主中心 {@value}
     *@see #SizeOf_TThostFtdcCTPTypeType
     */
    public static final char THOST_FTDC_CTPT_MainCenter='1';

    /**
     *主中心 {@value}
     *@see #SizeOf_TThostFtdcCTPTypeType
     */
    public static final String STRING_THOST_FTDC_CTPT_MainCenter="1";

    /**
     *备中心 {@value}
     *@see #SizeOf_TThostFtdcCTPTypeType
     */
    public static final char THOST_FTDC_CTPT_BackUp='2';

    /**
     *备中心 {@value}
     *@see #SizeOf_TThostFtdcCTPTypeType
     */
    public static final String STRING_THOST_FTDC_CTPT_BackUp="2";

    /**
     *TFtdcCTPTypeType是一个CTP交易系统类型类型
     *@see #THOST_FTDC_CTPT_Unkown
     *@see #THOST_FTDC_CTPT_MainCenter
     *@see #THOST_FTDC_CTPT_BackUp
     */
    public static final int SizeOf_TThostFtdcCTPTypeType=1;

    /**
     *TFtdcToolIDType是一个工具代码类型
     */
    public static final int SizeOf_TThostFtdcToolIDType=9;

    /**
     *TFtdcToolNameType是一个工具名称类型
     */
    public static final int SizeOf_TThostFtdcToolNameType=81;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcCloseDealTypeType
     */
    public static final char THOST_FTDC_CDT_Normal='0';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcCloseDealTypeType
     */
    public static final String STRING_THOST_FTDC_CDT_Normal="0";

    /**
     *投机平仓优先 {@value}
     *@see #SizeOf_TThostFtdcCloseDealTypeType
     */
    public static final char THOST_FTDC_CDT_SpecFirst='1';

    /**
     *投机平仓优先 {@value}
     *@see #SizeOf_TThostFtdcCloseDealTypeType
     */
    public static final String STRING_THOST_FTDC_CDT_SpecFirst="1";

    /**
     *TFtdcCloseDealTypeType是一个平仓处理类型类型
     *@see #THOST_FTDC_CDT_Normal
     *@see #THOST_FTDC_CDT_SpecFirst
     */
    public static final int SizeOf_TThostFtdcCloseDealTypeType=1;

    /**
     *不能使用 {@value}
     *@see #SizeOf_TThostFtdcMortgageFundUseRangeType
     */
    public static final char THOST_FTDC_MFUR_None='0';

    /**
     *不能使用 {@value}
     *@see #SizeOf_TThostFtdcMortgageFundUseRangeType
     */
    public static final String STRING_THOST_FTDC_MFUR_None="0";

    /**
     *用于保证金 {@value}
     *@see #SizeOf_TThostFtdcMortgageFundUseRangeType
     */
    public static final char THOST_FTDC_MFUR_Margin='1';

    /**
     *用于保证金 {@value}
     *@see #SizeOf_TThostFtdcMortgageFundUseRangeType
     */
    public static final String STRING_THOST_FTDC_MFUR_Margin="1";

    /**
     *用于手续费、盈亏、保证金 {@value}
     *@see #SizeOf_TThostFtdcMortgageFundUseRangeType
     */
    public static final char THOST_FTDC_MFUR_All='2';

    /**
     *用于手续费、盈亏、保证金 {@value}
     *@see #SizeOf_TThostFtdcMortgageFundUseRangeType
     */
    public static final String STRING_THOST_FTDC_MFUR_All="2";

    /**
     *TFtdcMortgageFundUseRangeType是一个货币质押资金可用范围类型
     *@see #THOST_FTDC_MFUR_None
     *@see #THOST_FTDC_MFUR_Margin
     *@see #THOST_FTDC_MFUR_All
     */
    public static final int SizeOf_TThostFtdcMortgageFundUseRangeType=1;

    /**
     *TFtdcCurrencyUnitType是一个币种单位数量类型
     */
    public static final int SizeOf_TThostFtdcCurrencyUnitType=8;

    /**
     *TFtdcExchangeRateType是一个汇率类型
     */
    public static final int SizeOf_TThostFtdcExchangeRateType=8;

    /**
     *郑商所套保产品 {@value}
     *@see #SizeOf_TThostFtdcSpecProductTypeType
     */
    public static final char THOST_FTDC_SPT_CzceHedge='1';

    /**
     *郑商所套保产品 {@value}
     *@see #SizeOf_TThostFtdcSpecProductTypeType
     */
    public static final String STRING_THOST_FTDC_SPT_CzceHedge="1";

    /**
     *货币质押产品 {@value}
     *@see #SizeOf_TThostFtdcSpecProductTypeType
     */
    public static final char THOST_FTDC_SPT_IneForeignCurrency='2';

    /**
     *货币质押产品 {@value}
     *@see #SizeOf_TThostFtdcSpecProductTypeType
     */
    public static final String STRING_THOST_FTDC_SPT_IneForeignCurrency="2";

    /**
     *大连短线开平仓产品 {@value}
     *@see #SizeOf_TThostFtdcSpecProductTypeType
     */
    public static final char THOST_FTDC_SPT_DceOpenClose='3';

    /**
     *大连短线开平仓产品 {@value}
     *@see #SizeOf_TThostFtdcSpecProductTypeType
     */
    public static final String STRING_THOST_FTDC_SPT_DceOpenClose="3";

    /**
     *TFtdcSpecProductTypeType是一个特殊产品类型类型
     *@see #THOST_FTDC_SPT_CzceHedge
     *@see #THOST_FTDC_SPT_IneForeignCurrency
     *@see #THOST_FTDC_SPT_DceOpenClose
     */
    public static final int SizeOf_TThostFtdcSpecProductTypeType=1;

    /**
     *质押 {@value}
     *@see #SizeOf_TThostFtdcFundMortgageTypeType
     */
    public static final char THOST_FTDC_FMT_Mortgage='1';

    /**
     *质押 {@value}
     *@see #SizeOf_TThostFtdcFundMortgageTypeType
     */
    public static final String STRING_THOST_FTDC_FMT_Mortgage="1";

    /**
     *解质 {@value}
     *@see #SizeOf_TThostFtdcFundMortgageTypeType
     */
    public static final char THOST_FTDC_FMT_Redemption='2';

    /**
     *解质 {@value}
     *@see #SizeOf_TThostFtdcFundMortgageTypeType
     */
    public static final String STRING_THOST_FTDC_FMT_Redemption="2";

    /**
     *TFtdcFundMortgageTypeType是一个货币质押类型类型
     *@see #THOST_FTDC_FMT_Mortgage
     *@see #THOST_FTDC_FMT_Redemption
     */
    public static final int SizeOf_TThostFtdcFundMortgageTypeType=1;

    /**
     *基础保证金 {@value}
     *@see #SizeOf_TThostFtdcAccountSettlementParamIDType
     */
    public static final char THOST_FTDC_ASPI_BaseMargin='1';

    /**
     *基础保证金 {@value}
     *@see #SizeOf_TThostFtdcAccountSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ASPI_BaseMargin="1";

    /**
     *最低权益标准 {@value}
     *@see #SizeOf_TThostFtdcAccountSettlementParamIDType
     */
    public static final char THOST_FTDC_ASPI_LowestInterest='2';

    /**
     *最低权益标准 {@value}
     *@see #SizeOf_TThostFtdcAccountSettlementParamIDType
     */
    public static final String STRING_THOST_FTDC_ASPI_LowestInterest="2";

    /**
     *TFtdcAccountSettlementParamIDType是一个投资者账户结算参数代码类型
     *@see #THOST_FTDC_ASPI_BaseMargin
     *@see #THOST_FTDC_ASPI_LowestInterest
     */
    public static final int SizeOf_TThostFtdcAccountSettlementParamIDType=1;

    /**
     *TFtdcCurrencyNameType是一个币种名称类型
     */
    public static final int SizeOf_TThostFtdcCurrencyNameType=31;

    /**
     *TFtdcCurrencySignType是一个币种符号类型
     */
    public static final int SizeOf_TThostFtdcCurrencySignType=4;

    /**
     *货币质入 {@value}
     *@see #SizeOf_TThostFtdcFundMortDirectionType
     */
    public static final char THOST_FTDC_FMD_In='1';

    /**
     *货币质入 {@value}
     *@see #SizeOf_TThostFtdcFundMortDirectionType
     */
    public static final String STRING_THOST_FTDC_FMD_In="1";

    /**
     *货币质出 {@value}
     *@see #SizeOf_TThostFtdcFundMortDirectionType
     */
    public static final char THOST_FTDC_FMD_Out='2';

    /**
     *货币质出 {@value}
     *@see #SizeOf_TThostFtdcFundMortDirectionType
     */
    public static final String STRING_THOST_FTDC_FMD_Out="2";

    /**
     *TFtdcFundMortDirectionType是一个货币质押方向类型
     *@see #THOST_FTDC_FMD_In
     *@see #THOST_FTDC_FMD_Out
     */
    public static final int SizeOf_TThostFtdcFundMortDirectionType=1;

    /**
     *盈利 {@value}
     *@see #SizeOf_TThostFtdcBusinessClassType
     */
    public static final char THOST_FTDC_BT_Profit='0';

    /**
     *盈利 {@value}
     *@see #SizeOf_TThostFtdcBusinessClassType
     */
    public static final String STRING_THOST_FTDC_BT_Profit="0";

    /**
     *亏损 {@value}
     *@see #SizeOf_TThostFtdcBusinessClassType
     */
    public static final char THOST_FTDC_BT_Loss='1';

    /**
     *亏损 {@value}
     *@see #SizeOf_TThostFtdcBusinessClassType
     */
    public static final String STRING_THOST_FTDC_BT_Loss="1";

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcBusinessClassType
     */
    public static final char THOST_FTDC_BT_Other='Z';

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcBusinessClassType
     */
    public static final String STRING_THOST_FTDC_BT_Other="Z";

    /**
     *TFtdcBusinessClassType是一个换汇类别类型
     *@see #THOST_FTDC_BT_Profit
     *@see #THOST_FTDC_BT_Loss
     *@see #THOST_FTDC_BT_Other
     */
    public static final int SizeOf_TThostFtdcBusinessClassType=1;

    /**
     *手工 {@value}
     *@see #SizeOf_TThostFtdcSwapSourceTypeType
     */
    public static final char THOST_FTDC_SST_Manual='0';

    /**
     *手工 {@value}
     *@see #SizeOf_TThostFtdcSwapSourceTypeType
     */
    public static final String STRING_THOST_FTDC_SST_Manual="0";

    /**
     *自动生成 {@value}
     *@see #SizeOf_TThostFtdcSwapSourceTypeType
     */
    public static final char THOST_FTDC_SST_Automatic='1';

    /**
     *自动生成 {@value}
     *@see #SizeOf_TThostFtdcSwapSourceTypeType
     */
    public static final String STRING_THOST_FTDC_SST_Automatic="1";

    /**
     *TFtdcSwapSourceTypeType是一个换汇数据来源类型
     *@see #THOST_FTDC_SST_Manual
     *@see #THOST_FTDC_SST_Automatic
     */
    public static final int SizeOf_TThostFtdcSwapSourceTypeType=1;

    /**
     *结汇 {@value}
     *@see #SizeOf_TThostFtdcCurrExDirectionType
     */
    public static final char THOST_FTDC_CED_Settlement='0';

    /**
     *结汇 {@value}
     *@see #SizeOf_TThostFtdcCurrExDirectionType
     */
    public static final String STRING_THOST_FTDC_CED_Settlement="0";

    /**
     *售汇 {@value}
     *@see #SizeOf_TThostFtdcCurrExDirectionType
     */
    public static final char THOST_FTDC_CED_Sale='1';

    /**
     *售汇 {@value}
     *@see #SizeOf_TThostFtdcCurrExDirectionType
     */
    public static final String STRING_THOST_FTDC_CED_Sale="1";

    /**
     *TFtdcCurrExDirectionType是一个换汇类型类型
     *@see #THOST_FTDC_CED_Settlement
     *@see #THOST_FTDC_CED_Sale
     */
    public static final int SizeOf_TThostFtdcCurrExDirectionType=1;

    /**
     *已录入 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final char THOST_FTDC_CSS_Entry='1';

    /**
     *已录入 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final String STRING_THOST_FTDC_CSS_Entry="1";

    /**
     *已审核 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final char THOST_FTDC_CSS_Approve='2';

    /**
     *已审核 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final String STRING_THOST_FTDC_CSS_Approve="2";

    /**
     *已拒绝 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final char THOST_FTDC_CSS_Refuse='3';

    /**
     *已拒绝 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final String STRING_THOST_FTDC_CSS_Refuse="3";

    /**
     *已撤销 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final char THOST_FTDC_CSS_Revoke='4';

    /**
     *已撤销 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final String STRING_THOST_FTDC_CSS_Revoke="4";

    /**
     *已发送 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final char THOST_FTDC_CSS_Send='5';

    /**
     *已发送 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final String STRING_THOST_FTDC_CSS_Send="5";

    /**
     *换汇成功 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final char THOST_FTDC_CSS_Success='6';

    /**
     *换汇成功 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final String STRING_THOST_FTDC_CSS_Success="6";

    /**
     *换汇失败 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final char THOST_FTDC_CSS_Failure='7';

    /**
     *换汇失败 {@value}
     *@see #SizeOf_TThostFtdcCurrencySwapStatusType
     */
    public static final String STRING_THOST_FTDC_CSS_Failure="7";

    /**
     *TFtdcCurrencySwapStatusType是一个申请状态类型
     *@see #THOST_FTDC_CSS_Entry
     *@see #THOST_FTDC_CSS_Approve
     *@see #THOST_FTDC_CSS_Refuse
     *@see #THOST_FTDC_CSS_Revoke
     *@see #THOST_FTDC_CSS_Send
     *@see #THOST_FTDC_CSS_Success
     *@see #THOST_FTDC_CSS_Failure
     */
    public static final int SizeOf_TThostFtdcCurrencySwapStatusType=1;

    /**
     *TFtdcCurrExchCertNoType是一个凭证号类型
     */
    public static final int SizeOf_TThostFtdcCurrExchCertNoType=13;

    /**
     *TFtdcBatchSerialNoType是一个批次号类型
     */
    public static final int SizeOf_TThostFtdcBatchSerialNoType=21;

    /**
     *未发送 {@value}
     *@see #SizeOf_TThostFtdcReqFlagType
     */
    public static final char THOST_FTDC_REQF_NoSend='0';

    /**
     *未发送 {@value}
     *@see #SizeOf_TThostFtdcReqFlagType
     */
    public static final String STRING_THOST_FTDC_REQF_NoSend="0";

    /**
     *发送成功 {@value}
     *@see #SizeOf_TThostFtdcReqFlagType
     */
    public static final char THOST_FTDC_REQF_SendSuccess='1';

    /**
     *发送成功 {@value}
     *@see #SizeOf_TThostFtdcReqFlagType
     */
    public static final String STRING_THOST_FTDC_REQF_SendSuccess="1";

    /**
     *发送失败 {@value}
     *@see #SizeOf_TThostFtdcReqFlagType
     */
    public static final char THOST_FTDC_REQF_SendFailed='2';

    /**
     *发送失败 {@value}
     *@see #SizeOf_TThostFtdcReqFlagType
     */
    public static final String STRING_THOST_FTDC_REQF_SendFailed="2";

    /**
     *等待重发 {@value}
     *@see #SizeOf_TThostFtdcReqFlagType
     */
    public static final char THOST_FTDC_REQF_WaitReSend='3';

    /**
     *等待重发 {@value}
     *@see #SizeOf_TThostFtdcReqFlagType
     */
    public static final String STRING_THOST_FTDC_REQF_WaitReSend="3";

    /**
     *TFtdcReqFlagType是一个换汇发送标志类型
     *@see #THOST_FTDC_REQF_NoSend
     *@see #THOST_FTDC_REQF_SendSuccess
     *@see #THOST_FTDC_REQF_SendFailed
     *@see #THOST_FTDC_REQF_WaitReSend
     */
    public static final int SizeOf_TThostFtdcReqFlagType=1;

    /**
     *成功 {@value}
     *@see #SizeOf_TThostFtdcResFlagType
     */
    public static final char THOST_FTDC_RESF_Success='0';

    /**
     *成功 {@value}
     *@see #SizeOf_TThostFtdcResFlagType
     */
    public static final String STRING_THOST_FTDC_RESF_Success="0";

    /**
     *账户余额不足 {@value}
     *@see #SizeOf_TThostFtdcResFlagType
     */
    public static final char THOST_FTDC_RESF_InsuffiCient='1';

    /**
     *账户余额不足 {@value}
     *@see #SizeOf_TThostFtdcResFlagType
     */
    public static final String STRING_THOST_FTDC_RESF_InsuffiCient="1";

    /**
     *交易结果未知 {@value}
     *@see #SizeOf_TThostFtdcResFlagType
     */
    public static final char THOST_FTDC_RESF_UnKnown='8';

    /**
     *交易结果未知 {@value}
     *@see #SizeOf_TThostFtdcResFlagType
     */
    public static final String STRING_THOST_FTDC_RESF_UnKnown="8";

    /**
     *TFtdcResFlagType是一个换汇返回成功标志类型
     *@see #THOST_FTDC_RESF_Success
     *@see #THOST_FTDC_RESF_InsuffiCient
     *@see #THOST_FTDC_RESF_UnKnown
     */
    public static final int SizeOf_TThostFtdcResFlagType=1;

    /**
     *TFtdcPageControlType是一个换汇页面控制类型
     */
    public static final int SizeOf_TThostFtdcPageControlType=2;

    /**
     *TFtdcRecordCountType是一个记录数类型
     */
    public static final int SizeOf_TThostFtdcRecordCountType=4;

    /**
     *TFtdcCurrencySwapMemoType是一个换汇需确认信息类型
     */
    public static final int SizeOf_TThostFtdcCurrencySwapMemoType=101;

    /**
     *修改前 {@value}
     *@see #SizeOf_TThostFtdcExStatusType
     */
    public static final char THOST_FTDC_EXS_Before='0';

    /**
     *修改前 {@value}
     *@see #SizeOf_TThostFtdcExStatusType
     */
    public static final String STRING_THOST_FTDC_EXS_Before="0";

    /**
     *修改后 {@value}
     *@see #SizeOf_TThostFtdcExStatusType
     */
    public static final char THOST_FTDC_EXS_After='1';

    /**
     *修改后 {@value}
     *@see #SizeOf_TThostFtdcExStatusType
     */
    public static final String STRING_THOST_FTDC_EXS_After="1";

    /**
     *TFtdcExStatusType是一个修改状态类型
     *@see #THOST_FTDC_EXS_Before
     *@see #THOST_FTDC_EXS_After
     */
    public static final int SizeOf_TThostFtdcExStatusType=1;

    /**
     *国内客户 {@value}
     *@see #SizeOf_TThostFtdcClientRegionType
     */
    public static final char THOST_FTDC_CR_Domestic='1';

    /**
     *国内客户 {@value}
     *@see #SizeOf_TThostFtdcClientRegionType
     */
    public static final String STRING_THOST_FTDC_CR_Domestic="1";

    /**
     *港澳台客户 {@value}
     *@see #SizeOf_TThostFtdcClientRegionType
     */
    public static final char THOST_FTDC_CR_GMT='2';

    /**
     *港澳台客户 {@value}
     *@see #SizeOf_TThostFtdcClientRegionType
     */
    public static final String STRING_THOST_FTDC_CR_GMT="2";

    /**
     *国外客户 {@value}
     *@see #SizeOf_TThostFtdcClientRegionType
     */
    public static final char THOST_FTDC_CR_Foreign='3';

    /**
     *国外客户 {@value}
     *@see #SizeOf_TThostFtdcClientRegionType
     */
    public static final String STRING_THOST_FTDC_CR_Foreign="3";

    /**
     *TFtdcClientRegionType是一个开户客户地域类型
     *@see #THOST_FTDC_CR_Domestic
     *@see #THOST_FTDC_CR_GMT
     *@see #THOST_FTDC_CR_Foreign
     */
    public static final int SizeOf_TThostFtdcClientRegionType=1;

    /**
     *TFtdcWorkPlaceType是一个工作单位类型
     */
    public static final int SizeOf_TThostFtdcWorkPlaceType=101;

    /**
     *TFtdcBusinessPeriodType是一个经营期限类型
     */
    public static final int SizeOf_TThostFtdcBusinessPeriodType=21;

    /**
     *TFtdcWebSiteType是一个网址类型
     */
    public static final int SizeOf_TThostFtdcWebSiteType=101;

    /**
     *TFtdcUOAIdCardTypeType是一个统一开户证件类型类型
     */
    public static final int SizeOf_TThostFtdcUOAIdCardTypeType=3;

    /**
     *TFtdcClientModeType是一个开户模式类型
     */
    public static final int SizeOf_TThostFtdcClientModeType=3;

    /**
     *TFtdcInvestorFullNameType是一个投资者全称类型
     */
    public static final int SizeOf_TThostFtdcInvestorFullNameType=101;

    /**
     *TFtdcUOABrokerIDType是一个境外中介机构ID类型
     */
    public static final int SizeOf_TThostFtdcUOABrokerIDType=11;

    /**
     *TFtdcUOAZipCodeType是一个邮政编码类型
     */
    public static final int SizeOf_TThostFtdcUOAZipCodeType=11;

    /**
     *TFtdcUOAEMailType是一个电子邮箱类型
     */
    public static final int SizeOf_TThostFtdcUOAEMailType=101;

    /**
     *TFtdcOldCityType是一个城市类型
     */
    public static final int SizeOf_TThostFtdcOldCityType=41;

    /**
     *TFtdcCorporateIdentifiedCardNoType是一个法人代表证件号码类型
     */
    public static final int SizeOf_TThostFtdcCorporateIdentifiedCardNoType=101;

    /**
     *没有 {@value}
     *@see #SizeOf_TThostFtdcHasBoardType
     */
    public static final char THOST_FTDC_HB_No='0';

    /**
     *没有 {@value}
     *@see #SizeOf_TThostFtdcHasBoardType
     */
    public static final String STRING_THOST_FTDC_HB_No="0";

    /**
     *有 {@value}
     *@see #SizeOf_TThostFtdcHasBoardType
     */
    public static final char THOST_FTDC_HB_Yes='1';

    /**
     *有 {@value}
     *@see #SizeOf_TThostFtdcHasBoardType
     */
    public static final String STRING_THOST_FTDC_HB_Yes="1";

    /**
     *TFtdcHasBoardType是一个是否有董事会类型
     *@see #THOST_FTDC_HB_No
     *@see #THOST_FTDC_HB_Yes
     */
    public static final int SizeOf_TThostFtdcHasBoardType=1;

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcStartModeType
     */
    public static final char THOST_FTDC_SM_Normal='1';

    /**
     *正常 {@value}
     *@see #SizeOf_TThostFtdcStartModeType
     */
    public static final String STRING_THOST_FTDC_SM_Normal="1";

    /**
     *应急 {@value}
     *@see #SizeOf_TThostFtdcStartModeType
     */
    public static final char THOST_FTDC_SM_Emerge='2';

    /**
     *应急 {@value}
     *@see #SizeOf_TThostFtdcStartModeType
     */
    public static final String STRING_THOST_FTDC_SM_Emerge="2";

    /**
     *恢复 {@value}
     *@see #SizeOf_TThostFtdcStartModeType
     */
    public static final char THOST_FTDC_SM_Restore='3';

    /**
     *恢复 {@value}
     *@see #SizeOf_TThostFtdcStartModeType
     */
    public static final String STRING_THOST_FTDC_SM_Restore="3";

    /**
     *TFtdcStartModeType是一个启动模式类型
     *@see #THOST_FTDC_SM_Normal
     *@see #THOST_FTDC_SM_Emerge
     *@see #THOST_FTDC_SM_Restore
     */
    public static final int SizeOf_TThostFtdcStartModeType=1;

    /**
     *全量 {@value}
     *@see #SizeOf_TThostFtdcTemplateTypeType
     */
    public static final char THOST_FTDC_TPT_Full='1';

    /**
     *全量 {@value}
     *@see #SizeOf_TThostFtdcTemplateTypeType
     */
    public static final String STRING_THOST_FTDC_TPT_Full="1";

    /**
     *增量 {@value}
     *@see #SizeOf_TThostFtdcTemplateTypeType
     */
    public static final char THOST_FTDC_TPT_Increment='2';

    /**
     *增量 {@value}
     *@see #SizeOf_TThostFtdcTemplateTypeType
     */
    public static final String STRING_THOST_FTDC_TPT_Increment="2";

    /**
     *备份 {@value}
     *@see #SizeOf_TThostFtdcTemplateTypeType
     */
    public static final char THOST_FTDC_TPT_BackUp='3';

    /**
     *备份 {@value}
     *@see #SizeOf_TThostFtdcTemplateTypeType
     */
    public static final String STRING_THOST_FTDC_TPT_BackUp="3";

    /**
     *TFtdcTemplateTypeType是一个模型类型类型
     *@see #THOST_FTDC_TPT_Full
     *@see #THOST_FTDC_TPT_Increment
     *@see #THOST_FTDC_TPT_BackUp
     */
    public static final int SizeOf_TThostFtdcTemplateTypeType=1;

    /**
     *交易 {@value}
     *@see #SizeOf_TThostFtdcLoginModeType
     */
    public static final char THOST_FTDC_LM_Trade='0';

    /**
     *交易 {@value}
     *@see #SizeOf_TThostFtdcLoginModeType
     */
    public static final String STRING_THOST_FTDC_LM_Trade="0";

    /**
     *转账 {@value}
     *@see #SizeOf_TThostFtdcLoginModeType
     */
    public static final char THOST_FTDC_LM_Transfer='1';

    /**
     *转账 {@value}
     *@see #SizeOf_TThostFtdcLoginModeType
     */
    public static final String STRING_THOST_FTDC_LM_Transfer="1";

    /**
     *TFtdcLoginModeType是一个登录模式类型
     *@see #THOST_FTDC_LM_Trade
     *@see #THOST_FTDC_LM_Transfer
     */
    public static final int SizeOf_TThostFtdcLoginModeType=1;

    /**
     *合约上下市 {@value}
     *@see #SizeOf_TThostFtdcPromptTypeType
     */
    public static final char THOST_FTDC_CPT_Instrument='1';

    /**
     *合约上下市 {@value}
     *@see #SizeOf_TThostFtdcPromptTypeType
     */
    public static final String STRING_THOST_FTDC_CPT_Instrument="1";

    /**
     *保证金分段生效 {@value}
     *@see #SizeOf_TThostFtdcPromptTypeType
     */
    public static final char THOST_FTDC_CPT_Margin='2';

    /**
     *保证金分段生效 {@value}
     *@see #SizeOf_TThostFtdcPromptTypeType
     */
    public static final String STRING_THOST_FTDC_CPT_Margin="2";

    /**
     *TFtdcPromptTypeType是一个日历提示类型类型
     *@see #THOST_FTDC_CPT_Instrument
     *@see #THOST_FTDC_CPT_Margin
     */
    public static final int SizeOf_TThostFtdcPromptTypeType=1;

    /**
     *TFtdcLedgerManageIDType是一个分户管理资产编码类型
     */
    public static final int SizeOf_TThostFtdcLedgerManageIDType=51;

    /**
     *TFtdcInvestVarietyType是一个投资品种类型
     */
    public static final int SizeOf_TThostFtdcInvestVarietyType=101;

    /**
     *TFtdcBankAccountTypeType是一个账户类别类型
     */
    public static final int SizeOf_TThostFtdcBankAccountTypeType=2;

    /**
     *TFtdcLedgerManageBankType是一个开户银行类型
     */
    public static final int SizeOf_TThostFtdcLedgerManageBankType=101;

    /**
     *TFtdcCffexDepartmentNameType是一个开户营业部类型
     */
    public static final int SizeOf_TThostFtdcCffexDepartmentNameType=101;

    /**
     *TFtdcCffexDepartmentCodeType是一个营业部代码类型
     */
    public static final int SizeOf_TThostFtdcCffexDepartmentCodeType=9;

    /**
     *有 {@value}
     *@see #SizeOf_TThostFtdcHasTrusteeType
     */
    public static final char THOST_FTDC_HT_Yes='1';

    /**
     *有 {@value}
     *@see #SizeOf_TThostFtdcHasTrusteeType
     */
    public static final String STRING_THOST_FTDC_HT_Yes="1";

    /**
     *没有 {@value}
     *@see #SizeOf_TThostFtdcHasTrusteeType
     */
    public static final char THOST_FTDC_HT_No='0';

    /**
     *没有 {@value}
     *@see #SizeOf_TThostFtdcHasTrusteeType
     */
    public static final String STRING_THOST_FTDC_HT_No="0";

    /**
     *TFtdcHasTrusteeType是一个是否有托管人类型
     *@see #THOST_FTDC_HT_Yes
     *@see #THOST_FTDC_HT_No
     */
    public static final int SizeOf_TThostFtdcHasTrusteeType=1;

    /**
     *TFtdcCSRCMemo1Type是一个说明类型
     */
    public static final int SizeOf_TThostFtdcCSRCMemo1Type=41;

    /**
     *TFtdcAssetmgrCFullNameType是一个代理资产管理业务的期货公司全称类型
     */
    public static final int SizeOf_TThostFtdcAssetmgrCFullNameType=101;

    /**
     *TFtdcAssetmgrApprovalNOType是一个资产管理业务批文号类型
     */
    public static final int SizeOf_TThostFtdcAssetmgrApprovalNOType=51;

    /**
     *TFtdcAssetmgrMgrNameType是一个资产管理业务负责人姓名类型
     */
    public static final int SizeOf_TThostFtdcAssetmgrMgrNameType=401;

    /**
     *银行 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final char THOST_FTDC_AMT_Bank='1';

    /**
     *银行 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final String STRING_THOST_FTDC_AMT_Bank="1";

    /**
     *证券公司 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final char THOST_FTDC_AMT_Securities='2';

    /**
     *证券公司 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final String STRING_THOST_FTDC_AMT_Securities="2";

    /**
     *基金公司 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final char THOST_FTDC_AMT_Fund='3';

    /**
     *基金公司 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final String STRING_THOST_FTDC_AMT_Fund="3";

    /**
     *保险公司 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final char THOST_FTDC_AMT_Insurance='4';

    /**
     *保险公司 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final String STRING_THOST_FTDC_AMT_Insurance="4";

    /**
     *信托公司 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final char THOST_FTDC_AMT_Trust='5';

    /**
     *信托公司 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final String STRING_THOST_FTDC_AMT_Trust="5";

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final char THOST_FTDC_AMT_Other='9';

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcAmTypeType
     */
    public static final String STRING_THOST_FTDC_AMT_Other="9";

    /**
     *TFtdcAmTypeType是一个机构类型类型
     *@see #THOST_FTDC_AMT_Bank
     *@see #THOST_FTDC_AMT_Securities
     *@see #THOST_FTDC_AMT_Fund
     *@see #THOST_FTDC_AMT_Insurance
     *@see #THOST_FTDC_AMT_Trust
     *@see #THOST_FTDC_AMT_Other
     */
    public static final int SizeOf_TThostFtdcAmTypeType=1;

    /**
     *TFtdcCSRCAmTypeType是一个机构类型类型
     */
    public static final int SizeOf_TThostFtdcCSRCAmTypeType=5;

    /**
     *出入金 {@value}
     *@see #SizeOf_TThostFtdcCSRCFundIOTypeType
     */
    public static final char THOST_FTDC_CFIOT_FundIO='0';

    /**
     *出入金 {@value}
     *@see #SizeOf_TThostFtdcCSRCFundIOTypeType
     */
    public static final String STRING_THOST_FTDC_CFIOT_FundIO="0";

    /**
     *银期换汇 {@value}
     *@see #SizeOf_TThostFtdcCSRCFundIOTypeType
     */
    public static final char THOST_FTDC_CFIOT_SwapCurrency='1';

    /**
     *银期换汇 {@value}
     *@see #SizeOf_TThostFtdcCSRCFundIOTypeType
     */
    public static final String STRING_THOST_FTDC_CFIOT_SwapCurrency="1";

    /**
     *TFtdcCSRCFundIOTypeType是一个出入金类型类型
     *@see #THOST_FTDC_CFIOT_FundIO
     *@see #THOST_FTDC_CFIOT_SwapCurrency
     */
    public static final int SizeOf_TThostFtdcCSRCFundIOTypeType=1;

    /**
     *期货结算账户 {@value}
     *@see #SizeOf_TThostFtdcCusAccountTypeType
     */
    public static final char THOST_FTDC_CAT_Futures='1';

    /**
     *期货结算账户 {@value}
     *@see #SizeOf_TThostFtdcCusAccountTypeType
     */
    public static final String STRING_THOST_FTDC_CAT_Futures="1";

    /**
     *纯期货资管业务下的资管结算账户 {@value}
     *@see #SizeOf_TThostFtdcCusAccountTypeType
     */
    public static final char THOST_FTDC_CAT_AssetmgrFuture='2';

    /**
     *纯期货资管业务下的资管结算账户 {@value}
     *@see #SizeOf_TThostFtdcCusAccountTypeType
     */
    public static final String STRING_THOST_FTDC_CAT_AssetmgrFuture="2";

    /**
     *综合类资管业务下的期货资管托管账户 {@value}
     *@see #SizeOf_TThostFtdcCusAccountTypeType
     */
    public static final char THOST_FTDC_CAT_AssetmgrTrustee='3';

    /**
     *综合类资管业务下的期货资管托管账户 {@value}
     *@see #SizeOf_TThostFtdcCusAccountTypeType
     */
    public static final String STRING_THOST_FTDC_CAT_AssetmgrTrustee="3";

    /**
     *综合类资管业务下的资金中转账户 {@value}
     *@see #SizeOf_TThostFtdcCusAccountTypeType
     */
    public static final char THOST_FTDC_CAT_AssetmgrTransfer='4';

    /**
     *综合类资管业务下的资金中转账户 {@value}
     *@see #SizeOf_TThostFtdcCusAccountTypeType
     */
    public static final String STRING_THOST_FTDC_CAT_AssetmgrTransfer="4";

    /**
     *TFtdcCusAccountTypeType是一个结算账户类型类型
     *@see #THOST_FTDC_CAT_Futures
     *@see #THOST_FTDC_CAT_AssetmgrFuture
     *@see #THOST_FTDC_CAT_AssetmgrTrustee
     *@see #THOST_FTDC_CAT_AssetmgrTransfer
     */
    public static final int SizeOf_TThostFtdcCusAccountTypeType=1;

    /**
     *TFtdcCSRCNationalType是一个国籍类型
     */
    public static final int SizeOf_TThostFtdcCSRCNationalType=4;

    /**
     *TFtdcCSRCSecAgentIDType是一个二级代理ID类型
     */
    public static final int SizeOf_TThostFtdcCSRCSecAgentIDType=11;

    /**
     *中文 {@value}
     *@see #SizeOf_TThostFtdcLanguageTypeType
     */
    public static final char THOST_FTDC_LT_Chinese='1';

    /**
     *中文 {@value}
     *@see #SizeOf_TThostFtdcLanguageTypeType
     */
    public static final String STRING_THOST_FTDC_LT_Chinese="1";

    /**
     *英文 {@value}
     *@see #SizeOf_TThostFtdcLanguageTypeType
     */
    public static final char THOST_FTDC_LT_English='2';

    /**
     *英文 {@value}
     *@see #SizeOf_TThostFtdcLanguageTypeType
     */
    public static final String STRING_THOST_FTDC_LT_English="2";

    /**
     *TFtdcLanguageTypeType是一个通知语言类型类型
     *@see #THOST_FTDC_LT_Chinese
     *@see #THOST_FTDC_LT_English
     */
    public static final int SizeOf_TThostFtdcLanguageTypeType=1;

    /**
     *TFtdcAmAccountType是一个投资账户类型
     */
    public static final int SizeOf_TThostFtdcAmAccountType=23;

    /**
     *个人资管客户 {@value}
     *@see #SizeOf_TThostFtdcAssetmgrClientTypeType
     */
    public static final char THOST_FTDC_AMCT_Person='1';

    /**
     *个人资管客户 {@value}
     *@see #SizeOf_TThostFtdcAssetmgrClientTypeType
     */
    public static final String STRING_THOST_FTDC_AMCT_Person="1";

    /**
     *单位资管客户 {@value}
     *@see #SizeOf_TThostFtdcAssetmgrClientTypeType
     */
    public static final char THOST_FTDC_AMCT_Organ='2';

    /**
     *单位资管客户 {@value}
     *@see #SizeOf_TThostFtdcAssetmgrClientTypeType
     */
    public static final String STRING_THOST_FTDC_AMCT_Organ="2";

    /**
     *特殊单位资管客户 {@value}
     *@see #SizeOf_TThostFtdcAssetmgrClientTypeType
     */
    public static final char THOST_FTDC_AMCT_SpecialOrgan='4';

    /**
     *特殊单位资管客户 {@value}
     *@see #SizeOf_TThostFtdcAssetmgrClientTypeType
     */
    public static final String STRING_THOST_FTDC_AMCT_SpecialOrgan="4";

    /**
     *TFtdcAssetmgrClientTypeType是一个资产管理客户类型类型
     *@see #THOST_FTDC_AMCT_Person
     *@see #THOST_FTDC_AMCT_Organ
     *@see #THOST_FTDC_AMCT_SpecialOrgan
     */
    public static final int SizeOf_TThostFtdcAssetmgrClientTypeType=1;

    /**
     *期货类 {@value}
     *@see #SizeOf_TThostFtdcAssetmgrTypeType
     */
    public static final char THOST_FTDC_ASST_Futures='3';

    /**
     *期货类 {@value}
     *@see #SizeOf_TThostFtdcAssetmgrTypeType
     */
    public static final String STRING_THOST_FTDC_ASST_Futures="3";

    /**
     *综合类 {@value}
     *@see #SizeOf_TThostFtdcAssetmgrTypeType
     */
    public static final char THOST_FTDC_ASST_SpecialOrgan='4';

    /**
     *综合类 {@value}
     *@see #SizeOf_TThostFtdcAssetmgrTypeType
     */
    public static final String STRING_THOST_FTDC_ASST_SpecialOrgan="4";

    /**
     *TFtdcAssetmgrTypeType是一个投资类型类型
     *@see #THOST_FTDC_ASST_Futures
     *@see #THOST_FTDC_ASST_SpecialOrgan
     */
    public static final int SizeOf_TThostFtdcAssetmgrTypeType=1;

    /**
     *TFtdcUOMType是一个计量单位类型
     */
    public static final int SizeOf_TThostFtdcUOMType=11;

    /**
     *TFtdcSHFEInstLifePhaseType是一个上期所合约生命周期状态类型
     */
    public static final int SizeOf_TThostFtdcSHFEInstLifePhaseType=3;

    /**
     *TFtdcSHFEProductClassType是一个产品类型类型
     */
    public static final int SizeOf_TThostFtdcSHFEProductClassType=11;

    /**
     *TFtdcPriceDecimalType是一个价格小数位类型
     */
    public static final int SizeOf_TThostFtdcPriceDecimalType=2;

    /**
     *TFtdcInTheMoneyFlagType是一个平值期权标志类型
     */
    public static final int SizeOf_TThostFtdcInTheMoneyFlagType=2;

    /**
     *合约交易所不存在 {@value}
     *@see #SizeOf_TThostFtdcCheckInstrTypeType
     */
    public static final char THOST_FTDC_CIT_HasExch='0';

    /**
     *合约交易所不存在 {@value}
     *@see #SizeOf_TThostFtdcCheckInstrTypeType
     */
    public static final String STRING_THOST_FTDC_CIT_HasExch="0";

    /**
     *合约本系统不存在 {@value}
     *@see #SizeOf_TThostFtdcCheckInstrTypeType
     */
    public static final char THOST_FTDC_CIT_HasATP='1';

    /**
     *合约本系统不存在 {@value}
     *@see #SizeOf_TThostFtdcCheckInstrTypeType
     */
    public static final String STRING_THOST_FTDC_CIT_HasATP="1";

    /**
     *合约比较不一致 {@value}
     *@see #SizeOf_TThostFtdcCheckInstrTypeType
     */
    public static final char THOST_FTDC_CIT_HasDiff='2';

    /**
     *合约比较不一致 {@value}
     *@see #SizeOf_TThostFtdcCheckInstrTypeType
     */
    public static final String STRING_THOST_FTDC_CIT_HasDiff="2";

    /**
     *TFtdcCheckInstrTypeType是一个合约比较类型类型
     *@see #THOST_FTDC_CIT_HasExch
     *@see #THOST_FTDC_CIT_HasATP
     *@see #THOST_FTDC_CIT_HasDiff
     */
    public static final int SizeOf_TThostFtdcCheckInstrTypeType=1;

    /**
     *手工交割 {@value}
     *@see #SizeOf_TThostFtdcDeliveryTypeType
     */
    public static final char THOST_FTDC_DT_HandDeliv='1';

    /**
     *手工交割 {@value}
     *@see #SizeOf_TThostFtdcDeliveryTypeType
     */
    public static final String STRING_THOST_FTDC_DT_HandDeliv="1";

    /**
     *到期交割 {@value}
     *@see #SizeOf_TThostFtdcDeliveryTypeType
     */
    public static final char THOST_FTDC_DT_PersonDeliv='2';

    /**
     *到期交割 {@value}
     *@see #SizeOf_TThostFtdcDeliveryTypeType
     */
    public static final String STRING_THOST_FTDC_DT_PersonDeliv="2";

    /**
     *TFtdcDeliveryTypeType是一个交割类型类型
     *@see #THOST_FTDC_DT_HandDeliv
     *@see #THOST_FTDC_DT_PersonDeliv
     */
    public static final int SizeOf_TThostFtdcDeliveryTypeType=1;

    /**
     *TFtdcBigMoneyType是一个资金类型
     */
    public static final int SizeOf_TThostFtdcBigMoneyType=8;

    /**
     *不使用大额单边保证金算法 {@value}
     *@see #SizeOf_TThostFtdcMaxMarginSideAlgorithmType
     */
    public static final char THOST_FTDC_MMSA_NO='0';

    /**
     *不使用大额单边保证金算法 {@value}
     *@see #SizeOf_TThostFtdcMaxMarginSideAlgorithmType
     */
    public static final String STRING_THOST_FTDC_MMSA_NO="0";

    /**
     *使用大额单边保证金算法 {@value}
     *@see #SizeOf_TThostFtdcMaxMarginSideAlgorithmType
     */
    public static final char THOST_FTDC_MMSA_YES='1';

    /**
     *使用大额单边保证金算法 {@value}
     *@see #SizeOf_TThostFtdcMaxMarginSideAlgorithmType
     */
    public static final String STRING_THOST_FTDC_MMSA_YES="1";

    /**
     *TFtdcMaxMarginSideAlgorithmType是一个大额单边保证金算法类型
     *@see #THOST_FTDC_MMSA_NO
     *@see #THOST_FTDC_MMSA_YES
     */
    public static final int SizeOf_TThostFtdcMaxMarginSideAlgorithmType=1;

    /**
     *自然人 {@value}
     *@see #SizeOf_TThostFtdcDAClientTypeType
     */
    public static final char THOST_FTDC_CACT_Person='0';

    /**
     *自然人 {@value}
     *@see #SizeOf_TThostFtdcDAClientTypeType
     */
    public static final String STRING_THOST_FTDC_CACT_Person="0";

    /**
     *法人 {@value}
     *@see #SizeOf_TThostFtdcDAClientTypeType
     */
    public static final char THOST_FTDC_CACT_Company='1';

    /**
     *法人 {@value}
     *@see #SizeOf_TThostFtdcDAClientTypeType
     */
    public static final String STRING_THOST_FTDC_CACT_Company="1";

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcDAClientTypeType
     */
    public static final char THOST_FTDC_CACT_Other='2';

    /**
     *其他 {@value}
     *@see #SizeOf_TThostFtdcDAClientTypeType
     */
    public static final String STRING_THOST_FTDC_CACT_Other="2";

    /**
     *TFtdcDAClientTypeType是一个资产管理客户类型类型
     *@see #THOST_FTDC_CACT_Person
     *@see #THOST_FTDC_CACT_Company
     *@see #THOST_FTDC_CACT_Other
     */
    public static final int SizeOf_TThostFtdcDAClientTypeType=1;

    /**
     *TFtdcCombinInstrIDType是一个套利合约代码类型
     */
    public static final int SizeOf_TThostFtdcCombinInstrIDType=61;

    /**
     *TFtdcCombinSettlePriceType是一个各腿结算价类型
     */
    public static final int SizeOf_TThostFtdcCombinSettlePriceType=61;

    /**
     *TFtdcDCEPriorityType是一个优先级类型
     */
    public static final int SizeOf_TThostFtdcDCEPriorityType=4;

    /**
     *TFtdcTradeGroupIDType是一个成交组号类型
     */
    public static final int SizeOf_TThostFtdcTradeGroupIDType=4;

    /**
     *TFtdcIsCheckPrepaType是一个是否校验开户可用资金类型
     */
    public static final int SizeOf_TThostFtdcIsCheckPrepaType=4;

    /**
     *期货类 {@value}
     *@see #SizeOf_TThostFtdcUOAAssetmgrTypeType
     */
    public static final char THOST_FTDC_UOAAT_Futures='1';

    /**
     *期货类 {@value}
     *@see #SizeOf_TThostFtdcUOAAssetmgrTypeType
     */
    public static final String STRING_THOST_FTDC_UOAAT_Futures="1";

    /**
     *综合类 {@value}
     *@see #SizeOf_TThostFtdcUOAAssetmgrTypeType
     */
    public static final char THOST_FTDC_UOAAT_SpecialOrgan='2';

    /**
     *综合类 {@value}
     *@see #SizeOf_TThostFtdcUOAAssetmgrTypeType
     */
    public static final String STRING_THOST_FTDC_UOAAT_SpecialOrgan="2";

    /**
     *TFtdcUOAAssetmgrTypeType是一个投资类型类型
     *@see #THOST_FTDC_UOAAT_Futures
     *@see #THOST_FTDC_UOAAT_SpecialOrgan
     */
    public static final int SizeOf_TThostFtdcUOAAssetmgrTypeType=1;

    /**
     *Buy {@value}
     *@see #SizeOf_TThostFtdcDirectionEnType
     */
    public static final char THOST_FTDC_DEN_Buy='0';

    /**
     *Buy {@value}
     *@see #SizeOf_TThostFtdcDirectionEnType
     */
    public static final String STRING_THOST_FTDC_DEN_Buy="0";

    /**
     *Sell {@value}
     *@see #SizeOf_TThostFtdcDirectionEnType
     */
    public static final char THOST_FTDC_DEN_Sell='1';

    /**
     *Sell {@value}
     *@see #SizeOf_TThostFtdcDirectionEnType
     */
    public static final String STRING_THOST_FTDC_DEN_Sell="1";

    /**
     *TFtdcDirectionEnType是一个买卖方向类型
     *@see #THOST_FTDC_DEN_Buy
     *@see #THOST_FTDC_DEN_Sell
     */
    public static final int SizeOf_TThostFtdcDirectionEnType=1;

    /**
     *Position Opening {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final char THOST_FTDC_OFEN_Open='0';

    /**
     *Position Opening {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final String STRING_THOST_FTDC_OFEN_Open="0";

    /**
     *Position Close {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final char THOST_FTDC_OFEN_Close='1';

    /**
     *Position Close {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final String STRING_THOST_FTDC_OFEN_Close="1";

    /**
     *Forced Liquidation {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final char THOST_FTDC_OFEN_ForceClose='2';

    /**
     *Forced Liquidation {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final String STRING_THOST_FTDC_OFEN_ForceClose="2";

    /**
     *Close Today {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final char THOST_FTDC_OFEN_CloseToday='3';

    /**
     *Close Today {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final String STRING_THOST_FTDC_OFEN_CloseToday="3";

    /**
     *Close Prev. {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final char THOST_FTDC_OFEN_CloseYesterday='4';

    /**
     *Close Prev. {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final String STRING_THOST_FTDC_OFEN_CloseYesterday="4";

    /**
     *Forced Reduction {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final char THOST_FTDC_OFEN_ForceOff='5';

    /**
     *Forced Reduction {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final String STRING_THOST_FTDC_OFEN_ForceOff="5";

    /**
     *Local Forced Liquidation {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final char THOST_FTDC_OFEN_LocalForceClose='6';

    /**
     *Local Forced Liquidation {@value}
     *@see #SizeOf_TThostFtdcOffsetFlagEnType
     */
    public static final String STRING_THOST_FTDC_OFEN_LocalForceClose="6";

    /**
     *TFtdcOffsetFlagEnType是一个开平标志类型
     *@see #THOST_FTDC_OFEN_Open
     *@see #THOST_FTDC_OFEN_Close
     *@see #THOST_FTDC_OFEN_ForceClose
     *@see #THOST_FTDC_OFEN_CloseToday
     *@see #THOST_FTDC_OFEN_CloseYesterday
     *@see #THOST_FTDC_OFEN_ForceOff
     *@see #THOST_FTDC_OFEN_LocalForceClose
     */
    public static final int SizeOf_TThostFtdcOffsetFlagEnType=1;

    /**
     *Speculation {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagEnType
     */
    public static final char THOST_FTDC_HFEN_Speculation='1';

    /**
     *Speculation {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagEnType
     */
    public static final String STRING_THOST_FTDC_HFEN_Speculation="1";

    /**
     *Arbitrage {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagEnType
     */
    public static final char THOST_FTDC_HFEN_Arbitrage='2';

    /**
     *Arbitrage {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagEnType
     */
    public static final String STRING_THOST_FTDC_HFEN_Arbitrage="2";

    /**
     *Hedge {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagEnType
     */
    public static final char THOST_FTDC_HFEN_Hedge='3';

    /**
     *Hedge {@value}
     *@see #SizeOf_TThostFtdcHedgeFlagEnType
     */
    public static final String STRING_THOST_FTDC_HFEN_Hedge="3";

    /**
     *TFtdcHedgeFlagEnType是一个投机套保标志类型
     *@see #THOST_FTDC_HFEN_Speculation
     *@see #THOST_FTDC_HFEN_Arbitrage
     *@see #THOST_FTDC_HFEN_Hedge
     */
    public static final int SizeOf_TThostFtdcHedgeFlagEnType=1;

    /**
     *Deposit/Withdrawal {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeEnType
     */
    public static final char THOST_FTDC_FIOTEN_FundIO='1';

    /**
     *Deposit/Withdrawal {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeEnType
     */
    public static final String STRING_THOST_FTDC_FIOTEN_FundIO="1";

    /**
     *Bank-Futures Transfer {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeEnType
     */
    public static final char THOST_FTDC_FIOTEN_Transfer='2';

    /**
     *Bank-Futures Transfer {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeEnType
     */
    public static final String STRING_THOST_FTDC_FIOTEN_Transfer="2";

    /**
     *Bank-Futures FX Exchange {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeEnType
     */
    public static final char THOST_FTDC_FIOTEN_SwapCurrency='3';

    /**
     *Bank-Futures FX Exchange {@value}
     *@see #SizeOf_TThostFtdcFundIOTypeEnType
     */
    public static final String STRING_THOST_FTDC_FIOTEN_SwapCurrency="3";

    /**
     *TFtdcFundIOTypeEnType是一个出入金类型类型
     *@see #THOST_FTDC_FIOTEN_FundIO
     *@see #THOST_FTDC_FIOTEN_Transfer
     *@see #THOST_FTDC_FIOTEN_SwapCurrency
     */
    public static final int SizeOf_TThostFtdcFundIOTypeEnType=1;

    /**
     *Bank Deposit {@value}
     *@see #SizeOf_TThostFtdcFundTypeEnType
     */
    public static final char THOST_FTDC_FTEN_Deposite='1';

    /**
     *Bank Deposit {@value}
     *@see #SizeOf_TThostFtdcFundTypeEnType
     */
    public static final String STRING_THOST_FTDC_FTEN_Deposite="1";

    /**
     *Payment/Fee {@value}
     *@see #SizeOf_TThostFtdcFundTypeEnType
     */
    public static final char THOST_FTDC_FTEN_ItemFund='2';

    /**
     *Payment/Fee {@value}
     *@see #SizeOf_TThostFtdcFundTypeEnType
     */
    public static final String STRING_THOST_FTDC_FTEN_ItemFund="2";

    /**
     *Brokerage Adj {@value}
     *@see #SizeOf_TThostFtdcFundTypeEnType
     */
    public static final char THOST_FTDC_FTEN_Company='3';

    /**
     *Brokerage Adj {@value}
     *@see #SizeOf_TThostFtdcFundTypeEnType
     */
    public static final String STRING_THOST_FTDC_FTEN_Company="3";

    /**
     *Internal Transfer {@value}
     *@see #SizeOf_TThostFtdcFundTypeEnType
     */
    public static final char THOST_FTDC_FTEN_InnerTransfer='4';

    /**
     *Internal Transfer {@value}
     *@see #SizeOf_TThostFtdcFundTypeEnType
     */
    public static final String STRING_THOST_FTDC_FTEN_InnerTransfer="4";

    /**
     *TFtdcFundTypeEnType是一个资金类型类型
     *@see #THOST_FTDC_FTEN_Deposite
     *@see #THOST_FTDC_FTEN_ItemFund
     *@see #THOST_FTDC_FTEN_Company
     *@see #THOST_FTDC_FTEN_InnerTransfer
     */
    public static final int SizeOf_TThostFtdcFundTypeEnType=1;

    /**
     *Deposit {@value}
     *@see #SizeOf_TThostFtdcFundDirectionEnType
     */
    public static final char THOST_FTDC_FDEN_In='1';

    /**
     *Deposit {@value}
     *@see #SizeOf_TThostFtdcFundDirectionEnType
     */
    public static final String STRING_THOST_FTDC_FDEN_In="1";

    /**
     *Withdrawal {@value}
     *@see #SizeOf_TThostFtdcFundDirectionEnType
     */
    public static final char THOST_FTDC_FDEN_Out='2';

    /**
     *Withdrawal {@value}
     *@see #SizeOf_TThostFtdcFundDirectionEnType
     */
    public static final String STRING_THOST_FTDC_FDEN_Out="2";

    /**
     *TFtdcFundDirectionEnType是一个出入金方向类型
     *@see #THOST_FTDC_FDEN_In
     *@see #THOST_FTDC_FDEN_Out
     */
    public static final int SizeOf_TThostFtdcFundDirectionEnType=1;

    /**
     *Pledge {@value}
     *@see #SizeOf_TThostFtdcFundMortDirectionEnType
     */
    public static final char THOST_FTDC_FMDEN_In='1';

    /**
     *Pledge {@value}
     *@see #SizeOf_TThostFtdcFundMortDirectionEnType
     */
    public static final String STRING_THOST_FTDC_FMDEN_In="1";

    /**
     *Redemption {@value}
     *@see #SizeOf_TThostFtdcFundMortDirectionEnType
     */
    public static final char THOST_FTDC_FMDEN_Out='2';

    /**
     *Redemption {@value}
     *@see #SizeOf_TThostFtdcFundMortDirectionEnType
     */
    public static final String STRING_THOST_FTDC_FMDEN_Out="2";

    /**
     *TFtdcFundMortDirectionEnType是一个货币质押方向类型
     *@see #THOST_FTDC_FMDEN_In
     *@see #THOST_FTDC_FMDEN_Out
     */
    public static final int SizeOf_TThostFtdcFundMortDirectionEnType=1;

    /**
     *TFtdcSwapBusinessTypeType是一个换汇业务种类类型
     */
    public static final int SizeOf_TThostFtdcSwapBusinessTypeType=3;

    /**
     *看涨 {@value}
     *@see #SizeOf_TThostFtdcOptionsTypeType
     */
    public static final char THOST_FTDC_CP_CallOptions='1';

    /**
     *看涨 {@value}
     *@see #SizeOf_TThostFtdcOptionsTypeType
     */
    public static final String STRING_THOST_FTDC_CP_CallOptions="1";

    /**
     *看跌 {@value}
     *@see #SizeOf_TThostFtdcOptionsTypeType
     */
    public static final char THOST_FTDC_CP_PutOptions='2';

    /**
     *看跌 {@value}
     *@see #SizeOf_TThostFtdcOptionsTypeType
     */
    public static final String STRING_THOST_FTDC_CP_PutOptions="2";

    /**
     *TFtdcOptionsTypeType是一个期权类型类型
     *@see #THOST_FTDC_CP_CallOptions
     *@see #THOST_FTDC_CP_PutOptions
     */
    public static final int SizeOf_TThostFtdcOptionsTypeType=1;

    /**
     *欧式 {@value}
     *@see #SizeOf_TThostFtdcStrikeModeType
     */
    public static final char THOST_FTDC_STM_Continental='0';

    /**
     *欧式 {@value}
     *@see #SizeOf_TThostFtdcStrikeModeType
     */
    public static final String STRING_THOST_FTDC_STM_Continental="0";

    /**
     *美式 {@value}
     *@see #SizeOf_TThostFtdcStrikeModeType
     */
    public static final char THOST_FTDC_STM_American='1';

    /**
     *美式 {@value}
     *@see #SizeOf_TThostFtdcStrikeModeType
     */
    public static final String STRING_THOST_FTDC_STM_American="1";

    /**
     *百慕大 {@value}
     *@see #SizeOf_TThostFtdcStrikeModeType
     */
    public static final char THOST_FTDC_STM_Bermuda='2';

    /**
     *百慕大 {@value}
     *@see #SizeOf_TThostFtdcStrikeModeType
     */
    public static final String STRING_THOST_FTDC_STM_Bermuda="2";

    /**
     *TFtdcStrikeModeType是一个执行方式类型
     *@see #THOST_FTDC_STM_Continental
     *@see #THOST_FTDC_STM_American
     *@see #THOST_FTDC_STM_Bermuda
     */
    public static final int SizeOf_TThostFtdcStrikeModeType=1;

    /**
     *自身对冲 {@value}
     *@see #SizeOf_TThostFtdcStrikeTypeType
     */
    public static final char THOST_FTDC_STT_Hedge='0';

    /**
     *自身对冲 {@value}
     *@see #SizeOf_TThostFtdcStrikeTypeType
     */
    public static final String STRING_THOST_FTDC_STT_Hedge="0";

    /**
     *匹配执行 {@value}
     *@see #SizeOf_TThostFtdcStrikeTypeType
     */
    public static final char THOST_FTDC_STT_Match='1';

    /**
     *匹配执行 {@value}
     *@see #SizeOf_TThostFtdcStrikeTypeType
     */
    public static final String STRING_THOST_FTDC_STT_Match="1";

    /**
     *TFtdcStrikeTypeType是一个执行类型类型
     *@see #THOST_FTDC_STT_Hedge
     *@see #THOST_FTDC_STT_Match
     */
    public static final int SizeOf_TThostFtdcStrikeTypeType=1;

    /**
     *不执行数量 {@value}
     *@see #SizeOf_TThostFtdcApplyTypeType
     */
    public static final char THOST_FTDC_APPT_NotStrikeNum='4';

    /**
     *不执行数量 {@value}
     *@see #SizeOf_TThostFtdcApplyTypeType
     */
    public static final String STRING_THOST_FTDC_APPT_NotStrikeNum="4";

    /**
     *TFtdcApplyTypeType是一个中金所期权放弃执行申请类型类型
     *@see #THOST_FTDC_APPT_NotStrikeNum
     */
    public static final int SizeOf_TThostFtdcApplyTypeType=1;

    /**
     *系统生成 {@value}
     *@see #SizeOf_TThostFtdcGiveUpDataSourceType
     */
    public static final char THOST_FTDC_GUDS_Gen='0';

    /**
     *系统生成 {@value}
     *@see #SizeOf_TThostFtdcGiveUpDataSourceType
     */
    public static final String STRING_THOST_FTDC_GUDS_Gen="0";

    /**
     *手工添加 {@value}
     *@see #SizeOf_TThostFtdcGiveUpDataSourceType
     */
    public static final char THOST_FTDC_GUDS_Hand='1';

    /**
     *手工添加 {@value}
     *@see #SizeOf_TThostFtdcGiveUpDataSourceType
     */
    public static final String STRING_THOST_FTDC_GUDS_Hand="1";

    /**
     *TFtdcGiveUpDataSourceType是一个放弃执行申请数据来源类型
     *@see #THOST_FTDC_GUDS_Gen
     *@see #THOST_FTDC_GUDS_Hand
     */
    public static final int SizeOf_TThostFtdcGiveUpDataSourceType=1;

    /**
     *TFtdcExecOrderSysIDType是一个执行宣告系统编号类型
     */
    public static final int SizeOf_TThostFtdcExecOrderSysIDType=21;

    /**
     *没有执行 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_NoExec='n';

    /**
     *没有执行 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_NoExec="n";

    /**
     *已经取消 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_Canceled='c';

    /**
     *已经取消 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_Canceled="c";

    /**
     *执行成功 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_OK='0';

    /**
     *执行成功 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_OK="0";

    /**
     *期权持仓不够 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_NoPosition='1';

    /**
     *期权持仓不够 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_NoPosition="1";

    /**
     *资金不够 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_NoDeposit='2';

    /**
     *资金不够 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_NoDeposit="2";

    /**
     *会员不存在 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_NoParticipant='3';

    /**
     *会员不存在 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_NoParticipant="3";

    /**
     *客户不存在 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_NoClient='4';

    /**
     *客户不存在 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_NoClient="4";

    /**
     *合约不存在 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_NoInstrument='6';

    /**
     *合约不存在 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_NoInstrument="6";

    /**
     *没有执行权限 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_NoRight='7';

    /**
     *没有执行权限 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_NoRight="7";

    /**
     *不合理的数量 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_InvalidVolume='8';

    /**
     *不合理的数量 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_InvalidVolume="8";

    /**
     *没有足够的历史成交 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_NoEnoughHistoryTrade='9';

    /**
     *没有足够的历史成交 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_NoEnoughHistoryTrade="9";

    /**
     *未知 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final char THOST_FTDC_OER_Unknown='a';

    /**
     *未知 {@value}
     *@see #SizeOf_TThostFtdcExecResultType
     */
    public static final String STRING_THOST_FTDC_OER_Unknown="a";

    /**
     *TFtdcExecResultType是一个执行结果类型
     *@see #THOST_FTDC_OER_NoExec
     *@see #THOST_FTDC_OER_Canceled
     *@see #THOST_FTDC_OER_OK
     *@see #THOST_FTDC_OER_NoPosition
     *@see #THOST_FTDC_OER_NoDeposit
     *@see #THOST_FTDC_OER_NoParticipant
     *@see #THOST_FTDC_OER_NoClient
     *@see #THOST_FTDC_OER_NoInstrument
     *@see #THOST_FTDC_OER_NoRight
     *@see #THOST_FTDC_OER_InvalidVolume
     *@see #THOST_FTDC_OER_NoEnoughHistoryTrade
     *@see #THOST_FTDC_OER_Unknown
     */
    public static final int SizeOf_TThostFtdcExecResultType=1;

    /**
     *TFtdcStrikeSequenceType是一个执行序号类型
     */
    public static final int SizeOf_TThostFtdcStrikeSequenceType=4;

    /**
     *TFtdcStrikeTimeType是一个执行时间类型
     */
    public static final int SizeOf_TThostFtdcStrikeTimeType=13;

    /**
     *期货组合 {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final char THOST_FTDC_COMBT_Future='0';

    /**
     *期货组合 {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final String STRING_THOST_FTDC_COMBT_Future="0";

    /**
     *垂直价差BUL {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final char THOST_FTDC_COMBT_BUL='1';

    /**
     *垂直价差BUL {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final String STRING_THOST_FTDC_COMBT_BUL="1";

    /**
     *垂直价差BER {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final char THOST_FTDC_COMBT_BER='2';

    /**
     *垂直价差BER {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final String STRING_THOST_FTDC_COMBT_BER="2";

    /**
     *跨式组合 {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final char THOST_FTDC_COMBT_STD='3';

    /**
     *跨式组合 {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final String STRING_THOST_FTDC_COMBT_STD="3";

    /**
     *宽跨式组合 {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final char THOST_FTDC_COMBT_STG='4';

    /**
     *宽跨式组合 {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final String STRING_THOST_FTDC_COMBT_STG="4";

    /**
     *备兑组合 {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final char THOST_FTDC_COMBT_PRT='5';

    /**
     *备兑组合 {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final String STRING_THOST_FTDC_COMBT_PRT="5";

    /**
     *时间价差组合 {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final char THOST_FTDC_COMBT_CLD='6';

    /**
     *时间价差组合 {@value}
     *@see #SizeOf_TThostFtdcCombinationTypeType
     */
    public static final String STRING_THOST_FTDC_COMBT_CLD="6";

    /**
     *TFtdcCombinationTypeType是一个组合类型类型
     *@see #THOST_FTDC_COMBT_Future
     *@see #THOST_FTDC_COMBT_BUL
     *@see #THOST_FTDC_COMBT_BER
     *@see #THOST_FTDC_COMBT_STD
     *@see #THOST_FTDC_COMBT_STG
     *@see #THOST_FTDC_COMBT_PRT
     *@see #THOST_FTDC_COMBT_CLD
     */
    public static final int SizeOf_TThostFtdcCombinationTypeType=1;

    /**
     *昨结算价 {@value}
     *@see #SizeOf_TThostFtdcOptionRoyaltyPriceTypeType
     */
    public static final char THOST_FTDC_ORPT_PreSettlementPrice='1';

    /**
     *昨结算价 {@value}
     *@see #SizeOf_TThostFtdcOptionRoyaltyPriceTypeType
     */
    public static final String STRING_THOST_FTDC_ORPT_PreSettlementPrice="1";

    /**
     *开仓价 {@value}
     *@see #SizeOf_TThostFtdcOptionRoyaltyPriceTypeType
     */
    public static final char THOST_FTDC_ORPT_OpenPrice='4';

    /**
     *开仓价 {@value}
     *@see #SizeOf_TThostFtdcOptionRoyaltyPriceTypeType
     */
    public static final String STRING_THOST_FTDC_ORPT_OpenPrice="4";

    /**
     *TFtdcOptionRoyaltyPriceTypeType是一个期权权利金价格类型类型
     *@see #THOST_FTDC_ORPT_PreSettlementPrice
     *@see #THOST_FTDC_ORPT_OpenPrice
     */
    public static final int SizeOf_TThostFtdcOptionRoyaltyPriceTypeType=1;

    /**
     *不计算期权市值盈亏 {@value}
     *@see #SizeOf_TThostFtdcBalanceAlgorithmType
     */
    public static final char THOST_FTDC_BLAG_Default='1';

    /**
     *不计算期权市值盈亏 {@value}
     *@see #SizeOf_TThostFtdcBalanceAlgorithmType
     */
    public static final String STRING_THOST_FTDC_BLAG_Default="1";

    /**
     *计算期权市值亏损 {@value}
     *@see #SizeOf_TThostFtdcBalanceAlgorithmType
     */
    public static final char THOST_FTDC_BLAG_IncludeOptValLost='2';

    /**
     *计算期权市值亏损 {@value}
     *@see #SizeOf_TThostFtdcBalanceAlgorithmType
     */
    public static final String STRING_THOST_FTDC_BLAG_IncludeOptValLost="2";

    /**
     *TFtdcBalanceAlgorithmType是一个权益算法类型
     *@see #THOST_FTDC_BLAG_Default
     *@see #THOST_FTDC_BLAG_IncludeOptValLost
     */
    public static final int SizeOf_TThostFtdcBalanceAlgorithmType=1;

    /**
     *执行 {@value}
     *@see #SizeOf_TThostFtdcActionTypeType
     */
    public static final char THOST_FTDC_ACTP_Exec='1';

    /**
     *执行 {@value}
     *@see #SizeOf_TThostFtdcActionTypeType
     */
    public static final String STRING_THOST_FTDC_ACTP_Exec="1";

    /**
     *放弃 {@value}
     *@see #SizeOf_TThostFtdcActionTypeType
     */
    public static final char THOST_FTDC_ACTP_Abandon='2';

    /**
     *放弃 {@value}
     *@see #SizeOf_TThostFtdcActionTypeType
     */
    public static final String STRING_THOST_FTDC_ACTP_Abandon="2";

    /**
     *TFtdcActionTypeType是一个执行类型类型
     *@see #THOST_FTDC_ACTP_Exec
     *@see #THOST_FTDC_ACTP_Abandon
     */
    public static final int SizeOf_TThostFtdcActionTypeType=1;

    /**
     *已经提交 {@value}
     *@see #SizeOf_TThostFtdcForQuoteStatusType
     */
    public static final char THOST_FTDC_FQST_Submitted='a';

    /**
     *已经提交 {@value}
     *@see #SizeOf_TThostFtdcForQuoteStatusType
     */
    public static final String STRING_THOST_FTDC_FQST_Submitted="a";

    /**
     *已经接受 {@value}
     *@see #SizeOf_TThostFtdcForQuoteStatusType
     */
    public static final char THOST_FTDC_FQST_Accepted='b';

    /**
     *已经接受 {@value}
     *@see #SizeOf_TThostFtdcForQuoteStatusType
     */
    public static final String STRING_THOST_FTDC_FQST_Accepted="b";

    /**
     *已经被拒绝 {@value}
     *@see #SizeOf_TThostFtdcForQuoteStatusType
     */
    public static final char THOST_FTDC_FQST_Rejected='c';

    /**
     *已经被拒绝 {@value}
     *@see #SizeOf_TThostFtdcForQuoteStatusType
     */
    public static final String STRING_THOST_FTDC_FQST_Rejected="c";

    /**
     *TFtdcForQuoteStatusType是一个询价状态类型
     *@see #THOST_FTDC_FQST_Submitted
     *@see #THOST_FTDC_FQST_Accepted
     *@see #THOST_FTDC_FQST_Rejected
     */
    public static final int SizeOf_TThostFtdcForQuoteStatusType=1;

    /**
     *按绝对值 {@value}
     *@see #SizeOf_TThostFtdcValueMethodType
     */
    public static final char THOST_FTDC_VM_Absolute='0';

    /**
     *按绝对值 {@value}
     *@see #SizeOf_TThostFtdcValueMethodType
     */
    public static final String STRING_THOST_FTDC_VM_Absolute="0";

    /**
     *按比率 {@value}
     *@see #SizeOf_TThostFtdcValueMethodType
     */
    public static final char THOST_FTDC_VM_Ratio='1';

    /**
     *按比率 {@value}
     *@see #SizeOf_TThostFtdcValueMethodType
     */
    public static final String STRING_THOST_FTDC_VM_Ratio="1";

    /**
     *TFtdcValueMethodType是一个取值方式类型
     *@see #THOST_FTDC_VM_Absolute
     *@see #THOST_FTDC_VM_Ratio
     */
    public static final int SizeOf_TThostFtdcValueMethodType=1;

    /**
     *保留 {@value}
     *@see #SizeOf_TThostFtdcExecOrderPositionFlagType
     */
    public static final char THOST_FTDC_EOPF_Reserve='0';

    /**
     *保留 {@value}
     *@see #SizeOf_TThostFtdcExecOrderPositionFlagType
     */
    public static final String STRING_THOST_FTDC_EOPF_Reserve="0";

    /**
     *不保留 {@value}
     *@see #SizeOf_TThostFtdcExecOrderPositionFlagType
     */
    public static final char THOST_FTDC_EOPF_UnReserve='1';

    /**
     *不保留 {@value}
     *@see #SizeOf_TThostFtdcExecOrderPositionFlagType
     */
    public static final String STRING_THOST_FTDC_EOPF_UnReserve="1";

    /**
     *TFtdcExecOrderPositionFlagType是一个期权行权后是否保留期货头寸的标记类型
     *@see #THOST_FTDC_EOPF_Reserve
     *@see #THOST_FTDC_EOPF_UnReserve
     */
    public static final int SizeOf_TThostFtdcExecOrderPositionFlagType=1;

    /**
     *自动平仓 {@value}
     *@see #SizeOf_TThostFtdcExecOrderCloseFlagType
     */
    public static final char THOST_FTDC_EOCF_AutoClose='0';

    /**
     *自动平仓 {@value}
     *@see #SizeOf_TThostFtdcExecOrderCloseFlagType
     */
    public static final String STRING_THOST_FTDC_EOCF_AutoClose="0";

    /**
     *免于自动平仓 {@value}
     *@see #SizeOf_TThostFtdcExecOrderCloseFlagType
     */
    public static final char THOST_FTDC_EOCF_NotToClose='1';

    /**
     *免于自动平仓 {@value}
     *@see #SizeOf_TThostFtdcExecOrderCloseFlagType
     */
    public static final String STRING_THOST_FTDC_EOCF_NotToClose="1";

    /**
     *TFtdcExecOrderCloseFlagType是一个期权行权后生成的头寸是否自动平仓类型
     *@see #THOST_FTDC_EOCF_AutoClose
     *@see #THOST_FTDC_EOCF_NotToClose
     */
    public static final int SizeOf_TThostFtdcExecOrderCloseFlagType=1;

    /**
     *期货 {@value}
     *@see #SizeOf_TThostFtdcProductTypeType
     */
    public static final char THOST_FTDC_PTE_Futures='1';

    /**
     *期货 {@value}
     *@see #SizeOf_TThostFtdcProductTypeType
     */
    public static final String STRING_THOST_FTDC_PTE_Futures="1";

    /**
     *期权 {@value}
     *@see #SizeOf_TThostFtdcProductTypeType
     */
    public static final char THOST_FTDC_PTE_Options='2';

    /**
     *期权 {@value}
     *@see #SizeOf_TThostFtdcProductTypeType
     */
    public static final String STRING_THOST_FTDC_PTE_Options="2";

    /**
     *TFtdcProductTypeType是一个产品类型类型
     *@see #THOST_FTDC_PTE_Futures
     *@see #THOST_FTDC_PTE_Options
     */
    public static final int SizeOf_TThostFtdcProductTypeType=1;

    public static final char THOST_FTDC_CUFN_CUFN_O='O';

    public static final String STRING_THOST_FTDC_CUFN_CUFN_O="O";

    /**
     *成交表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final char THOST_FTDC_CUFN_CUFN_T='T';

    /**
     *成交表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_CUFN_CUFN_T="T";

    /**
     *单腿持仓表new {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final char THOST_FTDC_CUFN_CUFN_P='P';

    /**
     *单腿持仓表new {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_CUFN_CUFN_P="P";

    /**
     *非平仓了结表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final char THOST_FTDC_CUFN_CUFN_N='N';

    /**
     *非平仓了结表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_CUFN_CUFN_N="N";

    /**
     *平仓表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final char THOST_FTDC_CUFN_CUFN_L='L';

    /**
     *平仓表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_CUFN_CUFN_L="L";

    /**
     *资金表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final char THOST_FTDC_CUFN_CUFN_F='F';

    /**
     *资金表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_CUFN_CUFN_F="F";

    /**
     *组合持仓表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final char THOST_FTDC_CUFN_CUFN_C='C';

    /**
     *组合持仓表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_CUFN_CUFN_C="C";

    /**
     *保证金参数表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final char THOST_FTDC_CUFN_CUFN_M='M';

    /**
     *保证金参数表 {@value}
     *@see #SizeOf_TThostFtdcCZCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_CUFN_CUFN_M="M";

    /**
     *TFtdcCZCEUploadFileNameType是一个郑商所结算文件名类型
     *@see #THOST_FTDC_CUFN_CUFN_O
     *@see #THOST_FTDC_CUFN_CUFN_T
     *@see #THOST_FTDC_CUFN_CUFN_P
     *@see #THOST_FTDC_CUFN_CUFN_N
     *@see #THOST_FTDC_CUFN_CUFN_L
     *@see #THOST_FTDC_CUFN_CUFN_F
     *@see #THOST_FTDC_CUFN_CUFN_C
     *@see #THOST_FTDC_CUFN_CUFN_M
     */
    public static final int SizeOf_TThostFtdcCZCEUploadFileNameType=1;

    public static final char THOST_FTDC_DUFN_DUFN_O='O';

    public static final String STRING_THOST_FTDC_DUFN_DUFN_O="O";

    /**
     *成交表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final char THOST_FTDC_DUFN_DUFN_T='T';

    /**
     *成交表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_DUFN_DUFN_T="T";

    /**
     *持仓表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final char THOST_FTDC_DUFN_DUFN_P='P';

    /**
     *持仓表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_DUFN_DUFN_P="P";

    /**
     *资金结算表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final char THOST_FTDC_DUFN_DUFN_F='F';

    /**
     *资金结算表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_DUFN_DUFN_F="F";

    /**
     *优惠组合持仓明细表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final char THOST_FTDC_DUFN_DUFN_C='C';

    /**
     *优惠组合持仓明细表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_DUFN_DUFN_C="C";

    /**
     *持仓明细表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final char THOST_FTDC_DUFN_DUFN_D='D';

    /**
     *持仓明细表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_DUFN_DUFN_D="D";

    /**
     *保证金参数表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final char THOST_FTDC_DUFN_DUFN_M='M';

    /**
     *保证金参数表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_DUFN_DUFN_M="M";

    /**
     *期权执行表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final char THOST_FTDC_DUFN_DUFN_S='S';

    /**
     *期权执行表 {@value}
     *@see #SizeOf_TThostFtdcDCEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_DUFN_DUFN_S="S";

    /**
     *TFtdcDCEUploadFileNameType是一个大商所结算文件名类型
     *@see #THOST_FTDC_DUFN_DUFN_O
     *@see #THOST_FTDC_DUFN_DUFN_T
     *@see #THOST_FTDC_DUFN_DUFN_P
     *@see #THOST_FTDC_DUFN_DUFN_F
     *@see #THOST_FTDC_DUFN_DUFN_C
     *@see #THOST_FTDC_DUFN_DUFN_D
     *@see #THOST_FTDC_DUFN_DUFN_M
     *@see #THOST_FTDC_DUFN_DUFN_S
     */
    public static final int SizeOf_TThostFtdcDCEUploadFileNameType=1;

    /**
     *DailyFundChg {@value}
     *@see #SizeOf_TThostFtdcSHFEUploadFileNameType
     */
    public static final char THOST_FTDC_SUFN_SUFN_O='O';

    /**
     *DailyFundChg {@value}
     *@see #SizeOf_TThostFtdcSHFEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_SUFN_SUFN_O="O";

    /**
     *Trade {@value}
     *@see #SizeOf_TThostFtdcSHFEUploadFileNameType
     */
    public static final char THOST_FTDC_SUFN_SUFN_T='T';

    /**
     *Trade {@value}
     *@see #SizeOf_TThostFtdcSHFEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_SUFN_SUFN_T="T";

    /**
     *SettlementDetail {@value}
     *@see #SizeOf_TThostFtdcSHFEUploadFileNameType
     */
    public static final char THOST_FTDC_SUFN_SUFN_P='P';

    /**
     *SettlementDetail {@value}
     *@see #SizeOf_TThostFtdcSHFEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_SUFN_SUFN_P="P";

    /**
     *Capital {@value}
     *@see #SizeOf_TThostFtdcSHFEUploadFileNameType
     */
    public static final char THOST_FTDC_SUFN_SUFN_F='F';

    /**
     *Capital {@value}
     *@see #SizeOf_TThostFtdcSHFEUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_SUFN_SUFN_F="F";

    /**
     *TFtdcSHFEUploadFileNameType是一个上期所结算文件名类型
     *@see #THOST_FTDC_SUFN_SUFN_O
     *@see #THOST_FTDC_SUFN_SUFN_T
     *@see #THOST_FTDC_SUFN_SUFN_P
     *@see #THOST_FTDC_SUFN_SUFN_F
     */
    public static final int SizeOf_TThostFtdcSHFEUploadFileNameType=1;

    /**
     *Trade {@value}
     *@see #SizeOf_TThostFtdcCFFEXUploadFileNameType
     */
    public static final char THOST_FTDC_CFUFN_SUFN_T='T';

    /**
     *Trade {@value}
     *@see #SizeOf_TThostFtdcCFFEXUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_CFUFN_SUFN_T="T";

    /**
     *SettlementDetail {@value}
     *@see #SizeOf_TThostFtdcCFFEXUploadFileNameType
     */
    public static final char THOST_FTDC_CFUFN_SUFN_P='P';

    /**
     *SettlementDetail {@value}
     *@see #SizeOf_TThostFtdcCFFEXUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_CFUFN_SUFN_P="P";

    /**
     *Capital {@value}
     *@see #SizeOf_TThostFtdcCFFEXUploadFileNameType
     */
    public static final char THOST_FTDC_CFUFN_SUFN_F='F';

    /**
     *Capital {@value}
     *@see #SizeOf_TThostFtdcCFFEXUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_CFUFN_SUFN_F="F";

    /**
     *OptionExec {@value}
     *@see #SizeOf_TThostFtdcCFFEXUploadFileNameType
     */
    public static final char THOST_FTDC_CFUFN_SUFN_S='S';

    /**
     *OptionExec {@value}
     *@see #SizeOf_TThostFtdcCFFEXUploadFileNameType
     */
    public static final String STRING_THOST_FTDC_CFUFN_SUFN_S="S";

    /**
     *TFtdcCFFEXUploadFileNameType是一个中金所结算文件名类型
     *@see #THOST_FTDC_CFUFN_SUFN_T
     *@see #THOST_FTDC_CFUFN_SUFN_P
     *@see #THOST_FTDC_CFUFN_SUFN_F
     *@see #THOST_FTDC_CFUFN_SUFN_S
     */
    public static final int SizeOf_TThostFtdcCFFEXUploadFileNameType=1;

    /**
     *申请组合 {@value}
     *@see #SizeOf_TThostFtdcCombDirectionType
     */
    public static final char THOST_FTDC_CMDR_Comb='0';

    /**
     *申请组合 {@value}
     *@see #SizeOf_TThostFtdcCombDirectionType
     */
    public static final String STRING_THOST_FTDC_CMDR_Comb="0";

    /**
     *申请拆分 {@value}
     *@see #SizeOf_TThostFtdcCombDirectionType
     */
    public static final char THOST_FTDC_CMDR_UnComb='1';

    /**
     *申请拆分 {@value}
     *@see #SizeOf_TThostFtdcCombDirectionType
     */
    public static final String STRING_THOST_FTDC_CMDR_UnComb="1";

    /**
     *TFtdcCombDirectionType是一个组合指令方向类型
     *@see #THOST_FTDC_CMDR_Comb
     *@see #THOST_FTDC_CMDR_UnComb
     */
    public static final int SizeOf_TThostFtdcCombDirectionType=1;

    /** 信息分发 */
    static final int SizeOf_CThostFtdcDisseminationField=8;
    /** 序列系列号 */
    static final int Offset_CThostFtdcDisseminationField_SequenceSeries=0;
    /** 序列号 */
    static final int Offset_CThostFtdcDisseminationField_SequenceNo=4;

    /** 用户登录请求 */
    static final int SizeOf_CThostFtdcReqUserLoginField=188;
    /** 交易日 */
    static final int Offset_CThostFtdcReqUserLoginField_TradingDay=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcReqUserLoginField_BrokerID=9;
    /** 用户代码 */
    static final int Offset_CThostFtdcReqUserLoginField_UserID=20;
    /** 密码 */
    static final int Offset_CThostFtdcReqUserLoginField_Password=36;
    /** 用户端产品信息 */
    static final int Offset_CThostFtdcReqUserLoginField_UserProductInfo=77;
    /** 接口端产品信息 */
    static final int Offset_CThostFtdcReqUserLoginField_InterfaceProductInfo=88;
    /** 协议信息 */
    static final int Offset_CThostFtdcReqUserLoginField_ProtocolInfo=99;
    /** Mac地址 */
    static final int Offset_CThostFtdcReqUserLoginField_MacAddress=110;
    /** 动态密码 */
    static final int Offset_CThostFtdcReqUserLoginField_OneTimePassword=131;
    /** 终端IP地址 */
    static final int Offset_CThostFtdcReqUserLoginField_ClientIPAddress=172;

    /** 用户登录应答 */
    static final int SizeOf_CThostFtdcRspUserLoginField=156;
    /** 交易日 */
    static final int Offset_CThostFtdcRspUserLoginField_TradingDay=0;
    /** 登录成功时间 */
    static final int Offset_CThostFtdcRspUserLoginField_LoginTime=9;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcRspUserLoginField_BrokerID=18;
    /** 用户代码 */
    static final int Offset_CThostFtdcRspUserLoginField_UserID=29;
    /** 交易系统名称 */
    static final int Offset_CThostFtdcRspUserLoginField_SystemName=45;
    /** 前置编号 */
    static final int Offset_CThostFtdcRspUserLoginField_FrontID=88;
    /** 会话编号 */
    static final int Offset_CThostFtdcRspUserLoginField_SessionID=92;
    /** 最大报单引用 */
    static final int Offset_CThostFtdcRspUserLoginField_MaxOrderRef=96;
    /** 上期所时间 */
    static final int Offset_CThostFtdcRspUserLoginField_SHFETime=109;
    /** 大商所时间 */
    static final int Offset_CThostFtdcRspUserLoginField_DCETime=118;
    /** 郑商所时间 */
    static final int Offset_CThostFtdcRspUserLoginField_CZCETime=127;
    /** 中金所时间 */
    static final int Offset_CThostFtdcRspUserLoginField_FFEXTime=136;
    /** 能源中心时间 */
    static final int Offset_CThostFtdcRspUserLoginField_INETime=145;

    /** 用户登出请求 */
    static final int SizeOf_CThostFtdcUserLogoutField=27;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcUserLogoutField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcUserLogoutField_UserID=11;

    /** 强制交易员退出 */
    static final int SizeOf_CThostFtdcForceUserLogoutField=27;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcForceUserLogoutField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcForceUserLogoutField_UserID=11;

    /** 客户端认证请求 */
    static final int SizeOf_CThostFtdcReqAuthenticateField=55;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcReqAuthenticateField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcReqAuthenticateField_UserID=11;
    /** 用户端产品信息 */
    static final int Offset_CThostFtdcReqAuthenticateField_UserProductInfo=27;
    /** 认证码 */
    static final int Offset_CThostFtdcReqAuthenticateField_AuthCode=38;

    /** 客户端认证响应 */
    static final int SizeOf_CThostFtdcRspAuthenticateField=38;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcRspAuthenticateField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcRspAuthenticateField_UserID=11;
    /** 用户端产品信息 */
    static final int Offset_CThostFtdcRspAuthenticateField_UserProductInfo=27;

    /** 客户端认证信息 */
    static final int SizeOf_CThostFtdcAuthenticationInfoField=172;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcAuthenticationInfoField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcAuthenticationInfoField_UserID=11;
    /** 用户端产品信息 */
    static final int Offset_CThostFtdcAuthenticationInfoField_UserProductInfo=27;
    /** 认证信息 */
    static final int Offset_CThostFtdcAuthenticationInfoField_AuthInfo=38;
    /** 是否为认证结果 */
    static final int Offset_CThostFtdcAuthenticationInfoField_IsResult=168;

    /** 银期转帐报文头 */
    static final int SizeOf_CThostFtdcTransferHeaderField=96;
    /** 版本号，常量，1.0 */
    static final int Offset_CThostFtdcTransferHeaderField_Version=0;
    /** 交易代码，必填 */
    static final int Offset_CThostFtdcTransferHeaderField_TradeCode=4;
    /** 交易日期，必填，格式：yyyymmdd */
    static final int Offset_CThostFtdcTransferHeaderField_TradeDate=11;
    /** 交易时间，必填，格式：hhmmss */
    static final int Offset_CThostFtdcTransferHeaderField_TradeTime=20;
    /** 发起方流水号，N/A */
    static final int Offset_CThostFtdcTransferHeaderField_TradeSerial=29;
    /** 期货公司代码，必填 */
    static final int Offset_CThostFtdcTransferHeaderField_FutureID=38;
    /** 银行代码，根据查询银行得到，必填 */
    static final int Offset_CThostFtdcTransferHeaderField_BankID=49;
    /** 银行分中心代码，根据查询银行得到，必填 */
    static final int Offset_CThostFtdcTransferHeaderField_BankBrchID=53;
    /** 操作员，N/A */
    static final int Offset_CThostFtdcTransferHeaderField_OperNo=58;
    /** 交易设备类型，N/A */
    static final int Offset_CThostFtdcTransferHeaderField_DeviceID=75;
    /** 记录数，N/A */
    static final int Offset_CThostFtdcTransferHeaderField_RecordNum=78;
    /** 会话编号，N/A */
    static final int Offset_CThostFtdcTransferHeaderField_SessionID=88;
    /** 请求编号，N/A */
    static final int Offset_CThostFtdcTransferHeaderField_RequestID=92;

    /** 银行资金转期货请求，TradeCode=202001 */
    static final int SizeOf_CThostFtdcTransferBankToFutureReqField=56;
    /** 期货资金账户 */
    static final int Offset_CThostFtdcTransferBankToFutureReqField_FutureAccount=0;
    /** 密码标志 */
    static final int Offset_CThostFtdcTransferBankToFutureReqField_FuturePwdFlag=13;
    /** 密码 */
    static final int Offset_CThostFtdcTransferBankToFutureReqField_FutureAccPwd=14;
    /** 转账金额 */
    static final int Offset_CThostFtdcTransferBankToFutureReqField_TradeAmt=32;
    /** 客户手续费 */
    static final int Offset_CThostFtdcTransferBankToFutureReqField_CustFee=40;
    /** 币种：RMB-人民币 USD-美圆 HKD-港元 */
    static final int Offset_CThostFtdcTransferBankToFutureReqField_CurrencyCode=48;

    /** 银行资金转期货请求响应 */
    static final int SizeOf_CThostFtdcTransferBankToFutureRspField=176;
    /** 响应代码 */
    static final int Offset_CThostFtdcTransferBankToFutureRspField_RetCode=0;
    /** 响应信息 */
    static final int Offset_CThostFtdcTransferBankToFutureRspField_RetInfo=5;
    /** 资金账户 */
    static final int Offset_CThostFtdcTransferBankToFutureRspField_FutureAccount=134;
    /** 转帐金额 */
    static final int Offset_CThostFtdcTransferBankToFutureRspField_TradeAmt=152;
    /** 应收客户手续费 */
    static final int Offset_CThostFtdcTransferBankToFutureRspField_CustFee=160;
    /** 币种 */
    static final int Offset_CThostFtdcTransferBankToFutureRspField_CurrencyCode=168;

    /** 期货资金转银行请求，TradeCode=202002 */
    static final int SizeOf_CThostFtdcTransferFutureToBankReqField=56;
    /** 期货资金账户 */
    static final int Offset_CThostFtdcTransferFutureToBankReqField_FutureAccount=0;
    /** 密码标志 */
    static final int Offset_CThostFtdcTransferFutureToBankReqField_FuturePwdFlag=13;
    /** 密码 */
    static final int Offset_CThostFtdcTransferFutureToBankReqField_FutureAccPwd=14;
    /** 转账金额 */
    static final int Offset_CThostFtdcTransferFutureToBankReqField_TradeAmt=32;
    /** 客户手续费 */
    static final int Offset_CThostFtdcTransferFutureToBankReqField_CustFee=40;
    /** 币种：RMB-人民币 USD-美圆 HKD-港元 */
    static final int Offset_CThostFtdcTransferFutureToBankReqField_CurrencyCode=48;

    /** 期货资金转银行请求响应 */
    static final int SizeOf_CThostFtdcTransferFutureToBankRspField=176;
    /** 响应代码 */
    static final int Offset_CThostFtdcTransferFutureToBankRspField_RetCode=0;
    /** 响应信息 */
    static final int Offset_CThostFtdcTransferFutureToBankRspField_RetInfo=5;
    /** 资金账户 */
    static final int Offset_CThostFtdcTransferFutureToBankRspField_FutureAccount=134;
    /** 转帐金额 */
    static final int Offset_CThostFtdcTransferFutureToBankRspField_TradeAmt=152;
    /** 应收客户手续费 */
    static final int Offset_CThostFtdcTransferFutureToBankRspField_CustFee=160;
    /** 币种 */
    static final int Offset_CThostFtdcTransferFutureToBankRspField_CurrencyCode=168;

    /** 查询银行资金请求，TradeCode=204002 */
    static final int SizeOf_CThostFtdcTransferQryBankReqField=35;
    /** 期货资金账户 */
    static final int Offset_CThostFtdcTransferQryBankReqField_FutureAccount=0;
    /** 密码标志 */
    static final int Offset_CThostFtdcTransferQryBankReqField_FuturePwdFlag=13;
    /** 密码 */
    static final int Offset_CThostFtdcTransferQryBankReqField_FutureAccPwd=14;
    /** 币种：RMB-人民币 USD-美圆 HKD-港元 */
    static final int Offset_CThostFtdcTransferQryBankReqField_CurrencyCode=31;

    /** 查询银行资金请求响应 */
    static final int SizeOf_CThostFtdcTransferQryBankRspField=184;
    /** 响应代码 */
    static final int Offset_CThostFtdcTransferQryBankRspField_RetCode=0;
    /** 响应信息 */
    static final int Offset_CThostFtdcTransferQryBankRspField_RetInfo=5;
    /** 资金账户 */
    static final int Offset_CThostFtdcTransferQryBankRspField_FutureAccount=134;
    /** 银行余额 */
    static final int Offset_CThostFtdcTransferQryBankRspField_TradeAmt=152;
    /** 银行可用余额 */
    static final int Offset_CThostFtdcTransferQryBankRspField_UseAmt=160;
    /** 银行可取余额 */
    static final int Offset_CThostFtdcTransferQryBankRspField_FetchAmt=168;
    /** 币种 */
    static final int Offset_CThostFtdcTransferQryBankRspField_CurrencyCode=176;

    /** 查询银行交易明细请求，TradeCode=204999 */
    static final int SizeOf_CThostFtdcTransferQryDetailReqField=13;
    /** 期货资金账户 */
    static final int Offset_CThostFtdcTransferQryDetailReqField_FutureAccount=0;

    /** 查询银行交易明细请求响应 */
    static final int SizeOf_CThostFtdcTransferQryDetailRspField=168;
    /** 交易日期 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_TradeDate=0;
    /** 交易时间 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_TradeTime=9;
    /** 交易代码 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_TradeCode=18;
    /** 期货流水号 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_FutureSerial=28;
    /** 期货公司代码 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_FutureID=32;
    /** 资金帐号 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_FutureAccount=43;
    /** 银行流水号 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_BankSerial=68;
    /** 银行代码 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_BankID=72;
    /** 银行分中心代码 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_BankBrchID=76;
    /** 银行账号 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_BankAccount=81;
    /** 证件号码 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_CertCode=122;
    /** 货币代码 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_CurrencyCode=143;
    /** 发生金额 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_TxAmount=152;
    /** 有效标志 */
    static final int Offset_CThostFtdcTransferQryDetailRspField_Flag=160;

    /** 响应信息 */
    static final int SizeOf_CThostFtdcRspInfoField=88;
    /** 错误代码 */
    static final int Offset_CThostFtdcRspInfoField_ErrorID=0;
    /** 错误信息 */
    static final int Offset_CThostFtdcRspInfoField_ErrorMsg=4;

    /** 交易所 */
    static final int SizeOf_CThostFtdcExchangeField=71;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeField_ExchangeID=0;
    /** 交易所名称 */
    static final int Offset_CThostFtdcExchangeField_ExchangeName=9;
    /** 交易所属性 */
    static final int Offset_CThostFtdcExchangeField_ExchangeProperty=70;

    /** 产品 */
    static final int SizeOf_CThostFtdcProductField=144;
    /** 产品代码 */
    static final int Offset_CThostFtdcProductField_ProductID=0;
    /** 产品名称 */
    static final int Offset_CThostFtdcProductField_ProductName=31;
    /** 交易所代码 */
    static final int Offset_CThostFtdcProductField_ExchangeID=52;
    /** 产品类型 */
    static final int Offset_CThostFtdcProductField_ProductClass=61;
    /** 合约数量乘数 */
    static final int Offset_CThostFtdcProductField_VolumeMultiple=64;
    /** 最小变动价位 */
    static final int Offset_CThostFtdcProductField_PriceTick=72;
    /** 市价单最大下单量 */
    static final int Offset_CThostFtdcProductField_MaxMarketOrderVolume=80;
    /** 市价单最小下单量 */
    static final int Offset_CThostFtdcProductField_MinMarketOrderVolume=84;
    /** 限价单最大下单量 */
    static final int Offset_CThostFtdcProductField_MaxLimitOrderVolume=88;
    /** 限价单最小下单量 */
    static final int Offset_CThostFtdcProductField_MinLimitOrderVolume=92;
    /** 持仓类型 */
    static final int Offset_CThostFtdcProductField_PositionType=96;
    /** 持仓日期类型 */
    static final int Offset_CThostFtdcProductField_PositionDateType=97;
    /** 平仓处理类型 */
    static final int Offset_CThostFtdcProductField_CloseDealType=98;
    /** 交易币种类型 */
    static final int Offset_CThostFtdcProductField_TradeCurrencyID=99;
    /** 质押资金可用范围 */
    static final int Offset_CThostFtdcProductField_MortgageFundUseRange=103;
    /** 交易所产品代码 */
    static final int Offset_CThostFtdcProductField_ExchangeProductID=104;
    /** 合约基础商品乘数 */
    static final int Offset_CThostFtdcProductField_UnderlyingMultiple=136;

    /** 合约 */
    static final int SizeOf_CThostFtdcInstrumentField=296;
    /** 合约代码 */
    static final int Offset_CThostFtdcInstrumentField_InstrumentID=0;
    /** 交易所代码 */
    static final int Offset_CThostFtdcInstrumentField_ExchangeID=31;
    /** 合约名称 */
    static final int Offset_CThostFtdcInstrumentField_InstrumentName=40;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcInstrumentField_ExchangeInstID=61;
    /** 产品代码 */
    static final int Offset_CThostFtdcInstrumentField_ProductID=92;
    /** 产品类型 */
    static final int Offset_CThostFtdcInstrumentField_ProductClass=123;
    /** 交割年份 */
    static final int Offset_CThostFtdcInstrumentField_DeliveryYear=124;
    /** 交割月 */
    static final int Offset_CThostFtdcInstrumentField_DeliveryMonth=128;
    /** 市价单最大下单量 */
    static final int Offset_CThostFtdcInstrumentField_MaxMarketOrderVolume=132;
    /** 市价单最小下单量 */
    static final int Offset_CThostFtdcInstrumentField_MinMarketOrderVolume=136;
    /** 限价单最大下单量 */
    static final int Offset_CThostFtdcInstrumentField_MaxLimitOrderVolume=140;
    /** 限价单最小下单量 */
    static final int Offset_CThostFtdcInstrumentField_MinLimitOrderVolume=144;
    /** 合约数量乘数 */
    static final int Offset_CThostFtdcInstrumentField_VolumeMultiple=148;
    /** 最小变动价位 */
    static final int Offset_CThostFtdcInstrumentField_PriceTick=152;
    /** 创建日 */
    static final int Offset_CThostFtdcInstrumentField_CreateDate=160;
    /** 上市日 */
    static final int Offset_CThostFtdcInstrumentField_OpenDate=169;
    /** 到期日 */
    static final int Offset_CThostFtdcInstrumentField_ExpireDate=178;
    /** 开始交割日 */
    static final int Offset_CThostFtdcInstrumentField_StartDelivDate=187;
    /** 结束交割日 */
    static final int Offset_CThostFtdcInstrumentField_EndDelivDate=196;
    /** 合约生命周期状态 */
    static final int Offset_CThostFtdcInstrumentField_InstLifePhase=205;
    /** 当前是否交易 */
    static final int Offset_CThostFtdcInstrumentField_IsTrading=208;
    /** 持仓类型 */
    static final int Offset_CThostFtdcInstrumentField_PositionType=212;
    /** 持仓日期类型 */
    static final int Offset_CThostFtdcInstrumentField_PositionDateType=213;
    /** 多头保证金率 */
    static final int Offset_CThostFtdcInstrumentField_LongMarginRatio=216;
    /** 空头保证金率 */
    static final int Offset_CThostFtdcInstrumentField_ShortMarginRatio=224;
    /** 是否使用大额单边保证金算法 */
    static final int Offset_CThostFtdcInstrumentField_MaxMarginSideAlgorithm=232;
    /** 基础商品代码 */
    static final int Offset_CThostFtdcInstrumentField_UnderlyingInstrID=233;
    /** 执行价 */
    static final int Offset_CThostFtdcInstrumentField_StrikePrice=264;
    /** 期权类型 */
    static final int Offset_CThostFtdcInstrumentField_OptionsType=272;
    /** 合约基础商品乘数 */
    static final int Offset_CThostFtdcInstrumentField_UnderlyingMultiple=280;
    /** 组合类型 */
    static final int Offset_CThostFtdcInstrumentField_CombinationType=288;

    /** 经纪公司 */
    static final int SizeOf_CThostFtdcBrokerField=108;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcBrokerField_BrokerID=0;
    /** 经纪公司简称 */
    static final int Offset_CThostFtdcBrokerField_BrokerAbbr=11;
    /** 经纪公司名称 */
    static final int Offset_CThostFtdcBrokerField_BrokerName=20;
    /** 是否活跃 */
    static final int Offset_CThostFtdcBrokerField_IsActive=104;

    /** 交易所交易员 */
    static final int SizeOf_CThostFtdcTraderField=100;
    /** 交易所代码 */
    static final int Offset_CThostFtdcTraderField_ExchangeID=0;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcTraderField_TraderID=9;
    /** 会员代码 */
    static final int Offset_CThostFtdcTraderField_ParticipantID=30;
    /** 密码 */
    static final int Offset_CThostFtdcTraderField_Password=41;
    /** 安装数量 */
    static final int Offset_CThostFtdcTraderField_InstallCount=84;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcTraderField_BrokerID=88;

    /** 投资者 */
    static final int SizeOf_CThostFtdcInvestorField=396;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInvestorField_InvestorID=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInvestorField_BrokerID=13;
    /** 投资者分组代码 */
    static final int Offset_CThostFtdcInvestorField_InvestorGroupID=24;
    /** 投资者名称 */
    static final int Offset_CThostFtdcInvestorField_InvestorName=37;
    /** 证件类型 */
    static final int Offset_CThostFtdcInvestorField_IdentifiedCardType=118;
    /** 证件号码 */
    static final int Offset_CThostFtdcInvestorField_IdentifiedCardNo=119;
    /** 是否活跃 */
    static final int Offset_CThostFtdcInvestorField_IsActive=172;
    /** 联系电话 */
    static final int Offset_CThostFtdcInvestorField_Telephone=176;
    /** 通讯地址 */
    static final int Offset_CThostFtdcInvestorField_Address=217;
    /** 开户日期 */
    static final int Offset_CThostFtdcInvestorField_OpenDate=318;
    /** 手机 */
    static final int Offset_CThostFtdcInvestorField_Mobile=327;
    /** 手续费率模板代码 */
    static final int Offset_CThostFtdcInvestorField_CommModelID=368;
    /** 保证金率模板代码 */
    static final int Offset_CThostFtdcInvestorField_MarginModelID=381;

    /** 交易编码 */
    static final int SizeOf_CThostFtdcTradingCodeField=52;
    /** 投资者代码 */
    static final int Offset_CThostFtdcTradingCodeField_InvestorID=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcTradingCodeField_BrokerID=13;
    /** 交易所代码 */
    static final int Offset_CThostFtdcTradingCodeField_ExchangeID=24;
    /** 客户代码 */
    static final int Offset_CThostFtdcTradingCodeField_ClientID=33;
    /** 是否活跃 */
    static final int Offset_CThostFtdcTradingCodeField_IsActive=44;
    /** 交易编码类型 */
    static final int Offset_CThostFtdcTradingCodeField_ClientIDType=48;

    /** 会员编码和经纪公司编码对照表 */
    static final int SizeOf_CThostFtdcPartBrokerField=36;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcPartBrokerField_BrokerID=0;
    /** 交易所代码 */
    static final int Offset_CThostFtdcPartBrokerField_ExchangeID=11;
    /** 会员代码 */
    static final int Offset_CThostFtdcPartBrokerField_ParticipantID=20;
    /** 是否活跃 */
    static final int Offset_CThostFtdcPartBrokerField_IsActive=32;

    /** 管理用户 */
    static final int SizeOf_CThostFtdcSuperUserField=144;
    /** 用户代码 */
    static final int Offset_CThostFtdcSuperUserField_UserID=0;
    /** 用户名称 */
    static final int Offset_CThostFtdcSuperUserField_UserName=16;
    /** 密码 */
    static final int Offset_CThostFtdcSuperUserField_Password=97;
    /** 是否活跃 */
    static final int Offset_CThostFtdcSuperUserField_IsActive=140;

    /** 管理用户功能权限 */
    static final int SizeOf_CThostFtdcSuperUserFunctionField=17;
    /** 用户代码 */
    static final int Offset_CThostFtdcSuperUserFunctionField_UserID=0;
    /** 功能代码 */
    static final int Offset_CThostFtdcSuperUserFunctionField_FunctionCode=16;

    /** 投资者组 */
    static final int SizeOf_CThostFtdcInvestorGroupField=65;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInvestorGroupField_BrokerID=0;
    /** 投资者分组代码 */
    static final int Offset_CThostFtdcInvestorGroupField_InvestorGroupID=11;
    /** 投资者分组名称 */
    static final int Offset_CThostFtdcInvestorGroupField_InvestorGroupName=24;

    /** 资金账户 */
    static final int SizeOf_CThostFtdcTradingAccountField=376;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcTradingAccountField_BrokerID=0;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcTradingAccountField_AccountID=11;
    /** 上次质押金额 */
    static final int Offset_CThostFtdcTradingAccountField_PreMortgage=24;
    /** 上次信用额度 */
    static final int Offset_CThostFtdcTradingAccountField_PreCredit=32;
    /** 上次存款额 */
    static final int Offset_CThostFtdcTradingAccountField_PreDeposit=40;
    /** 上次结算准备金 */
    static final int Offset_CThostFtdcTradingAccountField_PreBalance=48;
    /** 上次占用的保证金 */
    static final int Offset_CThostFtdcTradingAccountField_PreMargin=56;
    /** 利息基数 */
    static final int Offset_CThostFtdcTradingAccountField_InterestBase=64;
    /** 利息收入 */
    static final int Offset_CThostFtdcTradingAccountField_Interest=72;
    /** 入金金额 */
    static final int Offset_CThostFtdcTradingAccountField_Deposit=80;
    /** 出金金额 */
    static final int Offset_CThostFtdcTradingAccountField_Withdraw=88;
    /** 冻结的保证金 */
    static final int Offset_CThostFtdcTradingAccountField_FrozenMargin=96;
    /** 冻结的资金 */
    static final int Offset_CThostFtdcTradingAccountField_FrozenCash=104;
    /** 冻结的手续费 */
    static final int Offset_CThostFtdcTradingAccountField_FrozenCommission=112;
    /** 当前保证金总额 */
    static final int Offset_CThostFtdcTradingAccountField_CurrMargin=120;
    /** 资金差额 */
    static final int Offset_CThostFtdcTradingAccountField_CashIn=128;
    /** 手续费 */
    static final int Offset_CThostFtdcTradingAccountField_Commission=136;
    /** 平仓盈亏 */
    static final int Offset_CThostFtdcTradingAccountField_CloseProfit=144;
    /** 持仓盈亏 */
    static final int Offset_CThostFtdcTradingAccountField_PositionProfit=152;
    /** 期货结算准备金 */
    static final int Offset_CThostFtdcTradingAccountField_Balance=160;
    /** 可用资金 */
    static final int Offset_CThostFtdcTradingAccountField_Available=168;
    /** 可取资金 */
    static final int Offset_CThostFtdcTradingAccountField_WithdrawQuota=176;
    /** 基本准备金 */
    static final int Offset_CThostFtdcTradingAccountField_Reserve=184;
    /** 交易日 */
    static final int Offset_CThostFtdcTradingAccountField_TradingDay=192;
    /** 结算编号 */
    static final int Offset_CThostFtdcTradingAccountField_SettlementID=204;
    /** 信用额度 */
    static final int Offset_CThostFtdcTradingAccountField_Credit=208;
    /** 质押金额 */
    static final int Offset_CThostFtdcTradingAccountField_Mortgage=216;
    /** 交易所保证金 */
    static final int Offset_CThostFtdcTradingAccountField_ExchangeMargin=224;
    /** 投资者交割保证金 */
    static final int Offset_CThostFtdcTradingAccountField_DeliveryMargin=232;
    /** 交易所交割保证金 */
    static final int Offset_CThostFtdcTradingAccountField_ExchangeDeliveryMargin=240;
    /** 保底期货结算准备金 */
    static final int Offset_CThostFtdcTradingAccountField_ReserveBalance=248;
    /** 币种代码 */
    static final int Offset_CThostFtdcTradingAccountField_CurrencyID=256;
    /** 上次货币质入金额 */
    static final int Offset_CThostFtdcTradingAccountField_PreFundMortgageIn=264;
    /** 上次货币质出金额 */
    static final int Offset_CThostFtdcTradingAccountField_PreFundMortgageOut=272;
    /** 货币质入金额 */
    static final int Offset_CThostFtdcTradingAccountField_FundMortgageIn=280;
    /** 货币质出金额 */
    static final int Offset_CThostFtdcTradingAccountField_FundMortgageOut=288;
    /** 货币质押余额 */
    static final int Offset_CThostFtdcTradingAccountField_FundMortgageAvailable=296;
    /** 可质押货币金额 */
    static final int Offset_CThostFtdcTradingAccountField_MortgageableFund=304;
    /** 特殊产品占用保证金 */
    static final int Offset_CThostFtdcTradingAccountField_SpecProductMargin=312;
    /** 特殊产品冻结保证金 */
    static final int Offset_CThostFtdcTradingAccountField_SpecProductFrozenMargin=320;
    /** 特殊产品手续费 */
    static final int Offset_CThostFtdcTradingAccountField_SpecProductCommission=328;
    /** 特殊产品冻结手续费 */
    static final int Offset_CThostFtdcTradingAccountField_SpecProductFrozenCommission=336;
    /** 特殊产品持仓盈亏 */
    static final int Offset_CThostFtdcTradingAccountField_SpecProductPositionProfit=344;
    /** 特殊产品平仓盈亏 */
    static final int Offset_CThostFtdcTradingAccountField_SpecProductCloseProfit=352;
    /** 根据持仓盈亏算法计算的特殊产品持仓盈亏 */
    static final int Offset_CThostFtdcTradingAccountField_SpecProductPositionProfitByAlg=360;
    /** 特殊产品交易所保证金 */
    static final int Offset_CThostFtdcTradingAccountField_SpecProductExchangeMargin=368;

    /** 投资者持仓 */
    static final int SizeOf_CThostFtdcInvestorPositionField=328;
    /** 合约代码 */
    static final int Offset_CThostFtdcInvestorPositionField_InstrumentID=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInvestorPositionField_BrokerID=31;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInvestorPositionField_InvestorID=42;
    /** 持仓多空方向 */
    static final int Offset_CThostFtdcInvestorPositionField_PosiDirection=55;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcInvestorPositionField_HedgeFlag=56;
    /** 持仓日期 */
    static final int Offset_CThostFtdcInvestorPositionField_PositionDate=57;
    /** 上日持仓 */
    static final int Offset_CThostFtdcInvestorPositionField_YdPosition=60;
    /** 今日持仓 */
    static final int Offset_CThostFtdcInvestorPositionField_Position=64;
    /** 多头冻结 */
    static final int Offset_CThostFtdcInvestorPositionField_LongFrozen=68;
    /** 空头冻结 */
    static final int Offset_CThostFtdcInvestorPositionField_ShortFrozen=72;
    /** 开仓冻结金额 */
    static final int Offset_CThostFtdcInvestorPositionField_LongFrozenAmount=80;
    /** 开仓冻结金额 */
    static final int Offset_CThostFtdcInvestorPositionField_ShortFrozenAmount=88;
    /** 开仓量 */
    static final int Offset_CThostFtdcInvestorPositionField_OpenVolume=96;
    /** 平仓量 */
    static final int Offset_CThostFtdcInvestorPositionField_CloseVolume=100;
    /** 开仓金额 */
    static final int Offset_CThostFtdcInvestorPositionField_OpenAmount=104;
    /** 平仓金额 */
    static final int Offset_CThostFtdcInvestorPositionField_CloseAmount=112;
    /** 持仓成本 */
    static final int Offset_CThostFtdcInvestorPositionField_PositionCost=120;
    /** 上次占用的保证金 */
    static final int Offset_CThostFtdcInvestorPositionField_PreMargin=128;
    /** 占用的保证金 */
    static final int Offset_CThostFtdcInvestorPositionField_UseMargin=136;
    /** 冻结的保证金 */
    static final int Offset_CThostFtdcInvestorPositionField_FrozenMargin=144;
    /** 冻结的资金 */
    static final int Offset_CThostFtdcInvestorPositionField_FrozenCash=152;
    /** 冻结的手续费 */
    static final int Offset_CThostFtdcInvestorPositionField_FrozenCommission=160;
    /** 资金差额 */
    static final int Offset_CThostFtdcInvestorPositionField_CashIn=168;
    /** 手续费 */
    static final int Offset_CThostFtdcInvestorPositionField_Commission=176;
    /** 平仓盈亏 */
    static final int Offset_CThostFtdcInvestorPositionField_CloseProfit=184;
    /** 持仓盈亏 */
    static final int Offset_CThostFtdcInvestorPositionField_PositionProfit=192;
    /** 上次结算价 */
    static final int Offset_CThostFtdcInvestorPositionField_PreSettlementPrice=200;
    /** 本次结算价 */
    static final int Offset_CThostFtdcInvestorPositionField_SettlementPrice=208;
    /** 交易日 */
    static final int Offset_CThostFtdcInvestorPositionField_TradingDay=216;
    /** 结算编号 */
    static final int Offset_CThostFtdcInvestorPositionField_SettlementID=228;
    /** 开仓成本 */
    static final int Offset_CThostFtdcInvestorPositionField_OpenCost=232;
    /** 交易所保证金 */
    static final int Offset_CThostFtdcInvestorPositionField_ExchangeMargin=240;
    /** 组合成交形成的持仓 */
    static final int Offset_CThostFtdcInvestorPositionField_CombPosition=248;
    /** 组合多头冻结 */
    static final int Offset_CThostFtdcInvestorPositionField_CombLongFrozen=252;
    /** 组合空头冻结 */
    static final int Offset_CThostFtdcInvestorPositionField_CombShortFrozen=256;
    /** 逐日盯市平仓盈亏 */
    static final int Offset_CThostFtdcInvestorPositionField_CloseProfitByDate=264;
    /** 逐笔对冲平仓盈亏 */
    static final int Offset_CThostFtdcInvestorPositionField_CloseProfitByTrade=272;
    /** 今日持仓 */
    static final int Offset_CThostFtdcInvestorPositionField_TodayPosition=280;
    /** 保证金率 */
    static final int Offset_CThostFtdcInvestorPositionField_MarginRateByMoney=288;
    /** 保证金率(按手数) */
    static final int Offset_CThostFtdcInvestorPositionField_MarginRateByVolume=296;
    /** 执行冻结 */
    static final int Offset_CThostFtdcInvestorPositionField_StrikeFrozen=304;
    /** 执行冻结金额 */
    static final int Offset_CThostFtdcInvestorPositionField_StrikeFrozenAmount=312;
    /** 放弃执行冻结 */
    static final int Offset_CThostFtdcInvestorPositionField_AbandonFrozen=320;

    /** 合约保证金率 */
    static final int SizeOf_CThostFtdcInstrumentMarginRateField=104;
    /** 合约代码 */
    static final int Offset_CThostFtdcInstrumentMarginRateField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcInstrumentMarginRateField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInstrumentMarginRateField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInstrumentMarginRateField_InvestorID=43;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcInstrumentMarginRateField_HedgeFlag=56;
    /** 多头保证金率 */
    static final int Offset_CThostFtdcInstrumentMarginRateField_LongMarginRatioByMoney=64;
    /** 多头保证金费 */
    static final int Offset_CThostFtdcInstrumentMarginRateField_LongMarginRatioByVolume=72;
    /** 空头保证金率 */
    static final int Offset_CThostFtdcInstrumentMarginRateField_ShortMarginRatioByMoney=80;
    /** 空头保证金费 */
    static final int Offset_CThostFtdcInstrumentMarginRateField_ShortMarginRatioByVolume=88;
    /** 是否相对交易所收取 */
    static final int Offset_CThostFtdcInstrumentMarginRateField_IsRelative=96;

    /** 合约手续费率 */
    static final int SizeOf_CThostFtdcInstrumentCommissionRateField=104;
    /** 合约代码 */
    static final int Offset_CThostFtdcInstrumentCommissionRateField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcInstrumentCommissionRateField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInstrumentCommissionRateField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInstrumentCommissionRateField_InvestorID=43;
    /** 开仓手续费率 */
    static final int Offset_CThostFtdcInstrumentCommissionRateField_OpenRatioByMoney=56;
    /** 开仓手续费 */
    static final int Offset_CThostFtdcInstrumentCommissionRateField_OpenRatioByVolume=64;
    /** 平仓手续费率 */
    static final int Offset_CThostFtdcInstrumentCommissionRateField_CloseRatioByMoney=72;
    /** 平仓手续费 */
    static final int Offset_CThostFtdcInstrumentCommissionRateField_CloseRatioByVolume=80;
    /** 平今手续费率 */
    static final int Offset_CThostFtdcInstrumentCommissionRateField_CloseTodayRatioByMoney=88;
    /** 平今手续费 */
    static final int Offset_CThostFtdcInstrumentCommissionRateField_CloseTodayRatioByVolume=96;

    /** 深度行情 */
    static final int SizeOf_CThostFtdcDepthMarketDataField=408;
    /** 交易日 */
    static final int Offset_CThostFtdcDepthMarketDataField_TradingDay=0;
    /** 合约代码 */
    static final int Offset_CThostFtdcDepthMarketDataField_InstrumentID=9;
    /** 交易所代码 */
    static final int Offset_CThostFtdcDepthMarketDataField_ExchangeID=40;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcDepthMarketDataField_ExchangeInstID=49;
    /** 最新价 */
    static final int Offset_CThostFtdcDepthMarketDataField_LastPrice=80;
    /** 上次结算价 */
    static final int Offset_CThostFtdcDepthMarketDataField_PreSettlementPrice=88;
    /** 昨收盘 */
    static final int Offset_CThostFtdcDepthMarketDataField_PreClosePrice=96;
    /** 昨持仓量 */
    static final int Offset_CThostFtdcDepthMarketDataField_PreOpenInterest=104;
    /** 今开盘 */
    static final int Offset_CThostFtdcDepthMarketDataField_OpenPrice=112;
    /** 最高价 */
    static final int Offset_CThostFtdcDepthMarketDataField_HighestPrice=120;
    /** 最低价 */
    static final int Offset_CThostFtdcDepthMarketDataField_LowestPrice=128;
    /** 数量 */
    static final int Offset_CThostFtdcDepthMarketDataField_Volume=136;
    /** 成交金额 */
    static final int Offset_CThostFtdcDepthMarketDataField_Turnover=144;
    /** 持仓量 */
    static final int Offset_CThostFtdcDepthMarketDataField_OpenInterest=152;
    /** 今收盘 */
    static final int Offset_CThostFtdcDepthMarketDataField_ClosePrice=160;
    /** 本次结算价 */
    static final int Offset_CThostFtdcDepthMarketDataField_SettlementPrice=168;
    /** 涨停板价 */
    static final int Offset_CThostFtdcDepthMarketDataField_UpperLimitPrice=176;
    /** 跌停板价 */
    static final int Offset_CThostFtdcDepthMarketDataField_LowerLimitPrice=184;
    /** 昨虚实度 */
    static final int Offset_CThostFtdcDepthMarketDataField_PreDelta=192;
    /** 今虚实度 */
    static final int Offset_CThostFtdcDepthMarketDataField_CurrDelta=200;
    /** 最后修改时间 */
    static final int Offset_CThostFtdcDepthMarketDataField_UpdateTime=208;
    /** 最后修改毫秒 */
    static final int Offset_CThostFtdcDepthMarketDataField_UpdateMillisec=220;
    /** 申买价一 */
    static final int Offset_CThostFtdcDepthMarketDataField_BidPrice1=224;
    /** 申买量一 */
    static final int Offset_CThostFtdcDepthMarketDataField_BidVolume1=232;
    /** 申卖价一 */
    static final int Offset_CThostFtdcDepthMarketDataField_AskPrice1=240;
    /** 申卖量一 */
    static final int Offset_CThostFtdcDepthMarketDataField_AskVolume1=248;
    /** 申买价二 */
    static final int Offset_CThostFtdcDepthMarketDataField_BidPrice2=256;
    /** 申买量二 */
    static final int Offset_CThostFtdcDepthMarketDataField_BidVolume2=264;
    /** 申卖价二 */
    static final int Offset_CThostFtdcDepthMarketDataField_AskPrice2=272;
    /** 申卖量二 */
    static final int Offset_CThostFtdcDepthMarketDataField_AskVolume2=280;
    /** 申买价三 */
    static final int Offset_CThostFtdcDepthMarketDataField_BidPrice3=288;
    /** 申买量三 */
    static final int Offset_CThostFtdcDepthMarketDataField_BidVolume3=296;
    /** 申卖价三 */
    static final int Offset_CThostFtdcDepthMarketDataField_AskPrice3=304;
    /** 申卖量三 */
    static final int Offset_CThostFtdcDepthMarketDataField_AskVolume3=312;
    /** 申买价四 */
    static final int Offset_CThostFtdcDepthMarketDataField_BidPrice4=320;
    /** 申买量四 */
    static final int Offset_CThostFtdcDepthMarketDataField_BidVolume4=328;
    /** 申卖价四 */
    static final int Offset_CThostFtdcDepthMarketDataField_AskPrice4=336;
    /** 申卖量四 */
    static final int Offset_CThostFtdcDepthMarketDataField_AskVolume4=344;
    /** 申买价五 */
    static final int Offset_CThostFtdcDepthMarketDataField_BidPrice5=352;
    /** 申买量五 */
    static final int Offset_CThostFtdcDepthMarketDataField_BidVolume5=360;
    /** 申卖价五 */
    static final int Offset_CThostFtdcDepthMarketDataField_AskPrice5=368;
    /** 申卖量五 */
    static final int Offset_CThostFtdcDepthMarketDataField_AskVolume5=376;
    /** 当日均价 */
    static final int Offset_CThostFtdcDepthMarketDataField_AveragePrice=384;
    /** 业务日期 */
    static final int Offset_CThostFtdcDepthMarketDataField_ActionDay=392;

    /** 投资者合约交易权限 */
    static final int SizeOf_CThostFtdcInstrumentTradingRightField=57;
    /** 合约代码 */
    static final int Offset_CThostFtdcInstrumentTradingRightField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcInstrumentTradingRightField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInstrumentTradingRightField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInstrumentTradingRightField_InvestorID=43;
    /** 交易权限 */
    static final int Offset_CThostFtdcInstrumentTradingRightField_TradingRight=56;

    /** 经纪公司用户 */
    static final int SizeOf_CThostFtdcBrokerUserField=120;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcBrokerUserField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcBrokerUserField_UserID=11;
    /** 用户名称 */
    static final int Offset_CThostFtdcBrokerUserField_UserName=27;
    /** 用户类型 */
    static final int Offset_CThostFtdcBrokerUserField_UserType=108;
    /** 是否活跃 */
    static final int Offset_CThostFtdcBrokerUserField_IsActive=112;
    /** 是否使用令牌 */
    static final int Offset_CThostFtdcBrokerUserField_IsUsingOTP=116;

    /** 经纪公司用户口令 */
    static final int SizeOf_CThostFtdcBrokerUserPasswordField=68;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcBrokerUserPasswordField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcBrokerUserPasswordField_UserID=11;
    /** 密码 */
    static final int Offset_CThostFtdcBrokerUserPasswordField_Password=27;

    /** 经纪公司用户功能权限 */
    static final int SizeOf_CThostFtdcBrokerUserFunctionField=28;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcBrokerUserFunctionField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcBrokerUserFunctionField_UserID=11;
    /** 经纪公司功能代码 */
    static final int Offset_CThostFtdcBrokerUserFunctionField_BrokerFunctionCode=27;

    /** 交易所交易员报盘机 */
    static final int SizeOf_CThostFtdcTraderOfferField=224;
    /** 交易所代码 */
    static final int Offset_CThostFtdcTraderOfferField_ExchangeID=0;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcTraderOfferField_TraderID=9;
    /** 会员代码 */
    static final int Offset_CThostFtdcTraderOfferField_ParticipantID=30;
    /** 密码 */
    static final int Offset_CThostFtdcTraderOfferField_Password=41;
    /** 安装编号 */
    static final int Offset_CThostFtdcTraderOfferField_InstallID=84;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcTraderOfferField_OrderLocalID=88;
    /** 交易所交易员连接状态 */
    static final int Offset_CThostFtdcTraderOfferField_TraderConnectStatus=101;
    /** 发出连接请求的日期 */
    static final int Offset_CThostFtdcTraderOfferField_ConnectRequestDate=102;
    /** 发出连接请求的时间 */
    static final int Offset_CThostFtdcTraderOfferField_ConnectRequestTime=111;
    /** 上次报告日期 */
    static final int Offset_CThostFtdcTraderOfferField_LastReportDate=120;
    /** 上次报告时间 */
    static final int Offset_CThostFtdcTraderOfferField_LastReportTime=129;
    /** 完成连接日期 */
    static final int Offset_CThostFtdcTraderOfferField_ConnectDate=138;
    /** 完成连接时间 */
    static final int Offset_CThostFtdcTraderOfferField_ConnectTime=147;
    /** 启动日期 */
    static final int Offset_CThostFtdcTraderOfferField_StartDate=156;
    /** 启动时间 */
    static final int Offset_CThostFtdcTraderOfferField_StartTime=165;
    /** 交易日 */
    static final int Offset_CThostFtdcTraderOfferField_TradingDay=174;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcTraderOfferField_BrokerID=183;
    /** 本席位最大成交编号 */
    static final int Offset_CThostFtdcTraderOfferField_MaxTradeID=194;
    /** 本席位最大报单备拷 */
    static final int Offset_CThostFtdcTraderOfferField_MaxOrderMessageReference=215;

    /** 投资者结算结果 */
    static final int SizeOf_CThostFtdcSettlementInfoField=548;
    /** 交易日 */
    static final int Offset_CThostFtdcSettlementInfoField_TradingDay=0;
    /** 结算编号 */
    static final int Offset_CThostFtdcSettlementInfoField_SettlementID=12;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSettlementInfoField_BrokerID=16;
    /** 投资者代码 */
    static final int Offset_CThostFtdcSettlementInfoField_InvestorID=27;
    /** 序号 */
    static final int Offset_CThostFtdcSettlementInfoField_SequenceNo=40;
    /** 消息正文 */
    static final int Offset_CThostFtdcSettlementInfoField_Content=44;

    /** 合约保证金率调整 */
    static final int SizeOf_CThostFtdcInstrumentMarginRateAdjustField=104;
    /** 合约代码 */
    static final int Offset_CThostFtdcInstrumentMarginRateAdjustField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcInstrumentMarginRateAdjustField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInstrumentMarginRateAdjustField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInstrumentMarginRateAdjustField_InvestorID=43;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcInstrumentMarginRateAdjustField_HedgeFlag=56;
    /** 多头保证金率 */
    static final int Offset_CThostFtdcInstrumentMarginRateAdjustField_LongMarginRatioByMoney=64;
    /** 多头保证金费 */
    static final int Offset_CThostFtdcInstrumentMarginRateAdjustField_LongMarginRatioByVolume=72;
    /** 空头保证金率 */
    static final int Offset_CThostFtdcInstrumentMarginRateAdjustField_ShortMarginRatioByMoney=80;
    /** 空头保证金费 */
    static final int Offset_CThostFtdcInstrumentMarginRateAdjustField_ShortMarginRatioByVolume=88;
    /** 是否相对交易所收取 */
    static final int Offset_CThostFtdcInstrumentMarginRateAdjustField_IsRelative=96;

    /** 交易所保证金率 */
    static final int SizeOf_CThostFtdcExchangeMarginRateField=80;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcExchangeMarginRateField_BrokerID=0;
    /** 合约代码 */
    static final int Offset_CThostFtdcExchangeMarginRateField_InstrumentID=11;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcExchangeMarginRateField_HedgeFlag=42;
    /** 多头保证金率 */
    static final int Offset_CThostFtdcExchangeMarginRateField_LongMarginRatioByMoney=48;
    /** 多头保证金费 */
    static final int Offset_CThostFtdcExchangeMarginRateField_LongMarginRatioByVolume=56;
    /** 空头保证金率 */
    static final int Offset_CThostFtdcExchangeMarginRateField_ShortMarginRatioByMoney=64;
    /** 空头保证金费 */
    static final int Offset_CThostFtdcExchangeMarginRateField_ShortMarginRatioByVolume=72;

    /** 交易所保证金率调整 */
    static final int SizeOf_CThostFtdcExchangeMarginRateAdjustField=144;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_BrokerID=0;
    /** 合约代码 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_InstrumentID=11;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_HedgeFlag=42;
    /** 跟随交易所投资者多头保证金率 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByMoney=48;
    /** 跟随交易所投资者多头保证金费 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByVolume=56;
    /** 跟随交易所投资者空头保证金率 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByMoney=64;
    /** 跟随交易所投资者空头保证金费 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByVolume=72;
    /** 交易所多头保证金率 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByMoney=80;
    /** 交易所多头保证金费 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByVolume=88;
    /** 交易所空头保证金率 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByMoney=96;
    /** 交易所空头保证金费 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByVolume=104;
    /** 不跟随交易所投资者多头保证金率 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByMoney=112;
    /** 不跟随交易所投资者多头保证金费 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByVolume=120;
    /** 不跟随交易所投资者空头保证金率 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByMoney=128;
    /** 不跟随交易所投资者空头保证金费 */
    static final int Offset_CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByVolume=136;

    /** 汇率 */
    static final int SizeOf_CThostFtdcExchangeRateField=40;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcExchangeRateField_BrokerID=0;
    /** 源币种 */
    static final int Offset_CThostFtdcExchangeRateField_FromCurrencyID=11;
    /** 源币种单位数量 */
    static final int Offset_CThostFtdcExchangeRateField_FromCurrencyUnit=16;
    /** 目标币种 */
    static final int Offset_CThostFtdcExchangeRateField_ToCurrencyID=24;
    /** 汇率 */
    static final int Offset_CThostFtdcExchangeRateField_ExchangeRate=32;

    /** 结算引用 */
    static final int SizeOf_CThostFtdcSettlementRefField=16;
    /** 交易日 */
    static final int Offset_CThostFtdcSettlementRefField_TradingDay=0;
    /** 结算编号 */
    static final int Offset_CThostFtdcSettlementRefField_SettlementID=12;

    /** 当前时间 */
    static final int SizeOf_CThostFtdcCurrentTimeField=36;
    /** 当前日期 */
    static final int Offset_CThostFtdcCurrentTimeField_CurrDate=0;
    /** 当前时间 */
    static final int Offset_CThostFtdcCurrentTimeField_CurrTime=9;
    /** 当前时间（毫秒） */
    static final int Offset_CThostFtdcCurrentTimeField_CurrMillisec=20;
    /** 业务日期 */
    static final int Offset_CThostFtdcCurrentTimeField_ActionDay=24;

    /** 通讯阶段 */
    static final int SizeOf_CThostFtdcCommPhaseField=34;
    /** 交易日 */
    static final int Offset_CThostFtdcCommPhaseField_TradingDay=0;
    /** 通讯时段编号 */
    static final int Offset_CThostFtdcCommPhaseField_CommPhaseNo=10;
    /** 系统编号 */
    static final int Offset_CThostFtdcCommPhaseField_SystemID=12;

    /** 登录信息 */
    static final int SizeOf_CThostFtdcLoginInfoField=304;
    /** 前置编号 */
    static final int Offset_CThostFtdcLoginInfoField_FrontID=0;
    /** 会话编号 */
    static final int Offset_CThostFtdcLoginInfoField_SessionID=4;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcLoginInfoField_BrokerID=8;
    /** 用户代码 */
    static final int Offset_CThostFtdcLoginInfoField_UserID=19;
    /** 登录日期 */
    static final int Offset_CThostFtdcLoginInfoField_LoginDate=35;
    /** 登录时间 */
    static final int Offset_CThostFtdcLoginInfoField_LoginTime=44;
    /** IP地址 */
    static final int Offset_CThostFtdcLoginInfoField_IPAddress=53;
    /** 用户端产品信息 */
    static final int Offset_CThostFtdcLoginInfoField_UserProductInfo=69;
    /** 接口端产品信息 */
    static final int Offset_CThostFtdcLoginInfoField_InterfaceProductInfo=80;
    /** 协议信息 */
    static final int Offset_CThostFtdcLoginInfoField_ProtocolInfo=91;
    /** 系统名称 */
    static final int Offset_CThostFtdcLoginInfoField_SystemName=102;
    /** 密码 */
    static final int Offset_CThostFtdcLoginInfoField_Password=143;
    /** 最大报单引用 */
    static final int Offset_CThostFtdcLoginInfoField_MaxOrderRef=184;
    /** 上期所时间 */
    static final int Offset_CThostFtdcLoginInfoField_SHFETime=197;
    /** 大商所时间 */
    static final int Offset_CThostFtdcLoginInfoField_DCETime=206;
    /** 郑商所时间 */
    static final int Offset_CThostFtdcLoginInfoField_CZCETime=215;
    /** 中金所时间 */
    static final int Offset_CThostFtdcLoginInfoField_FFEXTime=224;
    /** Mac地址 */
    static final int Offset_CThostFtdcLoginInfoField_MacAddress=233;
    /** 动态密码 */
    static final int Offset_CThostFtdcLoginInfoField_OneTimePassword=254;
    /** 能源中心时间 */
    static final int Offset_CThostFtdcLoginInfoField_INETime=295;

    /** 登录信息 */
    static final int SizeOf_CThostFtdcLogoutAllField=52;
    /** 前置编号 */
    static final int Offset_CThostFtdcLogoutAllField_FrontID=0;
    /** 会话编号 */
    static final int Offset_CThostFtdcLogoutAllField_SessionID=4;
    /** 系统名称 */
    static final int Offset_CThostFtdcLogoutAllField_SystemName=8;

    /** 前置状态 */
    static final int SizeOf_CThostFtdcFrontStatusField=28;
    /** 前置编号 */
    static final int Offset_CThostFtdcFrontStatusField_FrontID=0;
    /** 上次报告日期 */
    static final int Offset_CThostFtdcFrontStatusField_LastReportDate=4;
    /** 上次报告时间 */
    static final int Offset_CThostFtdcFrontStatusField_LastReportTime=13;
    /** 是否活跃 */
    static final int Offset_CThostFtdcFrontStatusField_IsActive=24;

    /** 用户口令变更 */
    static final int SizeOf_CThostFtdcUserPasswordUpdateField=109;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcUserPasswordUpdateField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcUserPasswordUpdateField_UserID=11;
    /** 原来的口令 */
    static final int Offset_CThostFtdcUserPasswordUpdateField_OldPassword=27;
    /** 新的口令 */
    static final int Offset_CThostFtdcUserPasswordUpdateField_NewPassword=68;

    /** 输入报单 */
    static final int SizeOf_CThostFtdcInputOrderField=184;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInputOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInputOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcInputOrderField_InstrumentID=24;
    /** 报单引用 */
    static final int Offset_CThostFtdcInputOrderField_OrderRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcInputOrderField_UserID=68;
    /** 报单价格条件 */
    static final int Offset_CThostFtdcInputOrderField_OrderPriceType=84;
    /** 买卖方向 */
    static final int Offset_CThostFtdcInputOrderField_Direction=85;
    /** 组合开平标志 */
    static final int Offset_CThostFtdcInputOrderField_CombOffsetFlag=86;
    /** 组合投机套保标志 */
    static final int Offset_CThostFtdcInputOrderField_CombHedgeFlag=91;
    /** 价格 */
    static final int Offset_CThostFtdcInputOrderField_LimitPrice=96;
    /** 数量 */
    static final int Offset_CThostFtdcInputOrderField_VolumeTotalOriginal=104;
    /** 有效期类型 */
    static final int Offset_CThostFtdcInputOrderField_TimeCondition=108;
    /** GTD日期 */
    static final int Offset_CThostFtdcInputOrderField_GTDDate=109;
    /** 成交量类型 */
    static final int Offset_CThostFtdcInputOrderField_VolumeCondition=118;
    /** 最小成交量 */
    static final int Offset_CThostFtdcInputOrderField_MinVolume=120;
    /** 触发条件 */
    static final int Offset_CThostFtdcInputOrderField_ContingentCondition=124;
    /** 止损价 */
    static final int Offset_CThostFtdcInputOrderField_StopPrice=128;
    /** 强平原因 */
    static final int Offset_CThostFtdcInputOrderField_ForceCloseReason=136;
    /** 自动挂起标志 */
    static final int Offset_CThostFtdcInputOrderField_IsAutoSuspend=140;
    /** 业务单元 */
    static final int Offset_CThostFtdcInputOrderField_BusinessUnit=144;
    /** 请求编号 */
    static final int Offset_CThostFtdcInputOrderField_RequestID=168;
    /** 用户强评标志 */
    static final int Offset_CThostFtdcInputOrderField_UserForceClose=172;
    /** 互换单标志 */
    static final int Offset_CThostFtdcInputOrderField_IsSwapOrder=176;

    /** 报单 */
    static final int SizeOf_CThostFtdcOrderField=576;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcOrderField_InstrumentID=24;
    /** 报单引用 */
    static final int Offset_CThostFtdcOrderField_OrderRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcOrderField_UserID=68;
    /** 报单价格条件 */
    static final int Offset_CThostFtdcOrderField_OrderPriceType=84;
    /** 买卖方向 */
    static final int Offset_CThostFtdcOrderField_Direction=85;
    /** 组合开平标志 */
    static final int Offset_CThostFtdcOrderField_CombOffsetFlag=86;
    /** 组合投机套保标志 */
    static final int Offset_CThostFtdcOrderField_CombHedgeFlag=91;
    /** 价格 */
    static final int Offset_CThostFtdcOrderField_LimitPrice=96;
    /** 数量 */
    static final int Offset_CThostFtdcOrderField_VolumeTotalOriginal=104;
    /** 有效期类型 */
    static final int Offset_CThostFtdcOrderField_TimeCondition=108;
    /** GTD日期 */
    static final int Offset_CThostFtdcOrderField_GTDDate=109;
    /** 成交量类型 */
    static final int Offset_CThostFtdcOrderField_VolumeCondition=118;
    /** 最小成交量 */
    static final int Offset_CThostFtdcOrderField_MinVolume=120;
    /** 触发条件 */
    static final int Offset_CThostFtdcOrderField_ContingentCondition=124;
    /** 止损价 */
    static final int Offset_CThostFtdcOrderField_StopPrice=128;
    /** 强平原因 */
    static final int Offset_CThostFtdcOrderField_ForceCloseReason=136;
    /** 自动挂起标志 */
    static final int Offset_CThostFtdcOrderField_IsAutoSuspend=140;
    /** 业务单元 */
    static final int Offset_CThostFtdcOrderField_BusinessUnit=144;
    /** 请求编号 */
    static final int Offset_CThostFtdcOrderField_RequestID=168;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcOrderField_OrderLocalID=172;
    /** 交易所代码 */
    static final int Offset_CThostFtdcOrderField_ExchangeID=185;
    /** 会员代码 */
    static final int Offset_CThostFtdcOrderField_ParticipantID=194;
    /** 客户代码 */
    static final int Offset_CThostFtdcOrderField_ClientID=205;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcOrderField_ExchangeInstID=216;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcOrderField_TraderID=247;
    /** 安装编号 */
    static final int Offset_CThostFtdcOrderField_InstallID=268;
    /** 报单提交状态 */
    static final int Offset_CThostFtdcOrderField_OrderSubmitStatus=272;
    /** 报单提示序号 */
    static final int Offset_CThostFtdcOrderField_NotifySequence=276;
    /** 交易日 */
    static final int Offset_CThostFtdcOrderField_TradingDay=280;
    /** 结算编号 */
    static final int Offset_CThostFtdcOrderField_SettlementID=292;
    /** 报单编号 */
    static final int Offset_CThostFtdcOrderField_OrderSysID=296;
    /** 报单来源 */
    static final int Offset_CThostFtdcOrderField_OrderSource=317;
    /** 报单状态 */
    static final int Offset_CThostFtdcOrderField_OrderStatus=318;
    /** 报单类型 */
    static final int Offset_CThostFtdcOrderField_OrderType=319;
    /** 今成交数量 */
    static final int Offset_CThostFtdcOrderField_VolumeTraded=320;
    /** 剩余数量 */
    static final int Offset_CThostFtdcOrderField_VolumeTotal=324;
    /** 报单日期 */
    static final int Offset_CThostFtdcOrderField_InsertDate=328;
    /** 委托时间 */
    static final int Offset_CThostFtdcOrderField_InsertTime=337;
    /** 激活时间 */
    static final int Offset_CThostFtdcOrderField_ActiveTime=346;
    /** 挂起时间 */
    static final int Offset_CThostFtdcOrderField_SuspendTime=355;
    /** 最后修改时间 */
    static final int Offset_CThostFtdcOrderField_UpdateTime=364;
    /** 撤销时间 */
    static final int Offset_CThostFtdcOrderField_CancelTime=373;
    /** 最后修改交易所交易员代码 */
    static final int Offset_CThostFtdcOrderField_ActiveTraderID=382;
    /** 结算会员编号 */
    static final int Offset_CThostFtdcOrderField_ClearingPartID=403;
    /** 序号 */
    static final int Offset_CThostFtdcOrderField_SequenceNo=416;
    /** 前置编号 */
    static final int Offset_CThostFtdcOrderField_FrontID=420;
    /** 会话编号 */
    static final int Offset_CThostFtdcOrderField_SessionID=424;
    /** 用户端产品信息 */
    static final int Offset_CThostFtdcOrderField_UserProductInfo=428;
    /** 状态信息 */
    static final int Offset_CThostFtdcOrderField_StatusMsg=439;
    /** 用户强评标志 */
    static final int Offset_CThostFtdcOrderField_UserForceClose=520;
    /** 操作用户代码 */
    static final int Offset_CThostFtdcOrderField_ActiveUserID=524;
    /** 经纪公司报单编号 */
    static final int Offset_CThostFtdcOrderField_BrokerOrderSeq=540;
    /** 相关报单 */
    static final int Offset_CThostFtdcOrderField_RelativeOrderSysID=544;
    /** 郑商所成交数量 */
    static final int Offset_CThostFtdcOrderField_ZCETotalTradedVolume=568;
    /** 互换单标志 */
    static final int Offset_CThostFtdcOrderField_IsSwapOrder=572;

    /** 交易所报单 */
    static final int SizeOf_CThostFtdcExchangeOrderField=344;
    /** 报单价格条件 */
    static final int Offset_CThostFtdcExchangeOrderField_OrderPriceType=0;
    /** 买卖方向 */
    static final int Offset_CThostFtdcExchangeOrderField_Direction=1;
    /** 组合开平标志 */
    static final int Offset_CThostFtdcExchangeOrderField_CombOffsetFlag=2;
    /** 组合投机套保标志 */
    static final int Offset_CThostFtdcExchangeOrderField_CombHedgeFlag=7;
    /** 价格 */
    static final int Offset_CThostFtdcExchangeOrderField_LimitPrice=16;
    /** 数量 */
    static final int Offset_CThostFtdcExchangeOrderField_VolumeTotalOriginal=24;
    /** 有效期类型 */
    static final int Offset_CThostFtdcExchangeOrderField_TimeCondition=28;
    /** GTD日期 */
    static final int Offset_CThostFtdcExchangeOrderField_GTDDate=29;
    /** 成交量类型 */
    static final int Offset_CThostFtdcExchangeOrderField_VolumeCondition=38;
    /** 最小成交量 */
    static final int Offset_CThostFtdcExchangeOrderField_MinVolume=40;
    /** 触发条件 */
    static final int Offset_CThostFtdcExchangeOrderField_ContingentCondition=44;
    /** 止损价 */
    static final int Offset_CThostFtdcExchangeOrderField_StopPrice=48;
    /** 强平原因 */
    static final int Offset_CThostFtdcExchangeOrderField_ForceCloseReason=56;
    /** 自动挂起标志 */
    static final int Offset_CThostFtdcExchangeOrderField_IsAutoSuspend=60;
    /** 业务单元 */
    static final int Offset_CThostFtdcExchangeOrderField_BusinessUnit=64;
    /** 请求编号 */
    static final int Offset_CThostFtdcExchangeOrderField_RequestID=88;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcExchangeOrderField_OrderLocalID=92;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeOrderField_ExchangeID=105;
    /** 会员代码 */
    static final int Offset_CThostFtdcExchangeOrderField_ParticipantID=114;
    /** 客户代码 */
    static final int Offset_CThostFtdcExchangeOrderField_ClientID=125;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcExchangeOrderField_ExchangeInstID=136;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeOrderField_TraderID=167;
    /** 安装编号 */
    static final int Offset_CThostFtdcExchangeOrderField_InstallID=188;
    /** 报单提交状态 */
    static final int Offset_CThostFtdcExchangeOrderField_OrderSubmitStatus=192;
    /** 报单提示序号 */
    static final int Offset_CThostFtdcExchangeOrderField_NotifySequence=196;
    /** 交易日 */
    static final int Offset_CThostFtdcExchangeOrderField_TradingDay=200;
    /** 结算编号 */
    static final int Offset_CThostFtdcExchangeOrderField_SettlementID=212;
    /** 报单编号 */
    static final int Offset_CThostFtdcExchangeOrderField_OrderSysID=216;
    /** 报单来源 */
    static final int Offset_CThostFtdcExchangeOrderField_OrderSource=237;
    /** 报单状态 */
    static final int Offset_CThostFtdcExchangeOrderField_OrderStatus=238;
    /** 报单类型 */
    static final int Offset_CThostFtdcExchangeOrderField_OrderType=239;
    /** 今成交数量 */
    static final int Offset_CThostFtdcExchangeOrderField_VolumeTraded=240;
    /** 剩余数量 */
    static final int Offset_CThostFtdcExchangeOrderField_VolumeTotal=244;
    /** 报单日期 */
    static final int Offset_CThostFtdcExchangeOrderField_InsertDate=248;
    /** 委托时间 */
    static final int Offset_CThostFtdcExchangeOrderField_InsertTime=257;
    /** 激活时间 */
    static final int Offset_CThostFtdcExchangeOrderField_ActiveTime=266;
    /** 挂起时间 */
    static final int Offset_CThostFtdcExchangeOrderField_SuspendTime=275;
    /** 最后修改时间 */
    static final int Offset_CThostFtdcExchangeOrderField_UpdateTime=284;
    /** 撤销时间 */
    static final int Offset_CThostFtdcExchangeOrderField_CancelTime=293;
    /** 最后修改交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeOrderField_ActiveTraderID=302;
    /** 结算会员编号 */
    static final int Offset_CThostFtdcExchangeOrderField_ClearingPartID=323;
    /** 序号 */
    static final int Offset_CThostFtdcExchangeOrderField_SequenceNo=336;

    /** 交易所报单插入失败 */
    static final int SizeOf_CThostFtdcExchangeOrderInsertErrorField=152;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeOrderInsertErrorField_ExchangeID=0;
    /** 会员代码 */
    static final int Offset_CThostFtdcExchangeOrderInsertErrorField_ParticipantID=9;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeOrderInsertErrorField_TraderID=20;
    /** 安装编号 */
    static final int Offset_CThostFtdcExchangeOrderInsertErrorField_InstallID=44;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcExchangeOrderInsertErrorField_OrderLocalID=48;
    /** 错误代码 */
    static final int Offset_CThostFtdcExchangeOrderInsertErrorField_ErrorID=64;
    /** 错误信息 */
    static final int Offset_CThostFtdcExchangeOrderInsertErrorField_ErrorMsg=68;

    /** 输入报单操作 */
    static final int SizeOf_CThostFtdcInputOrderActionField=152;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInputOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInputOrderActionField_InvestorID=11;
    /** 报单操作引用 */
    static final int Offset_CThostFtdcInputOrderActionField_OrderActionRef=24;
    /** 报单引用 */
    static final int Offset_CThostFtdcInputOrderActionField_OrderRef=28;
    /** 请求编号 */
    static final int Offset_CThostFtdcInputOrderActionField_RequestID=44;
    /** 前置编号 */
    static final int Offset_CThostFtdcInputOrderActionField_FrontID=48;
    /** 会话编号 */
    static final int Offset_CThostFtdcInputOrderActionField_SessionID=52;
    /** 交易所代码 */
    static final int Offset_CThostFtdcInputOrderActionField_ExchangeID=56;
    /** 报单编号 */
    static final int Offset_CThostFtdcInputOrderActionField_OrderSysID=65;
    /** 操作标志 */
    static final int Offset_CThostFtdcInputOrderActionField_ActionFlag=86;
    /** 价格 */
    static final int Offset_CThostFtdcInputOrderActionField_LimitPrice=88;
    /** 数量变化 */
    static final int Offset_CThostFtdcInputOrderActionField_VolumeChange=96;
    /** 用户代码 */
    static final int Offset_CThostFtdcInputOrderActionField_UserID=100;
    /** 合约代码 */
    static final int Offset_CThostFtdcInputOrderActionField_InstrumentID=116;

    /** 报单操作 */
    static final int SizeOf_CThostFtdcOrderActionField=344;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcOrderActionField_InvestorID=11;
    /** 报单操作引用 */
    static final int Offset_CThostFtdcOrderActionField_OrderActionRef=24;
    /** 报单引用 */
    static final int Offset_CThostFtdcOrderActionField_OrderRef=28;
    /** 请求编号 */
    static final int Offset_CThostFtdcOrderActionField_RequestID=44;
    /** 前置编号 */
    static final int Offset_CThostFtdcOrderActionField_FrontID=48;
    /** 会话编号 */
    static final int Offset_CThostFtdcOrderActionField_SessionID=52;
    /** 交易所代码 */
    static final int Offset_CThostFtdcOrderActionField_ExchangeID=56;
    /** 报单编号 */
    static final int Offset_CThostFtdcOrderActionField_OrderSysID=65;
    /** 操作标志 */
    static final int Offset_CThostFtdcOrderActionField_ActionFlag=86;
    /** 价格 */
    static final int Offset_CThostFtdcOrderActionField_LimitPrice=88;
    /** 数量变化 */
    static final int Offset_CThostFtdcOrderActionField_VolumeChange=96;
    /** 操作日期 */
    static final int Offset_CThostFtdcOrderActionField_ActionDate=100;
    /** 操作时间 */
    static final int Offset_CThostFtdcOrderActionField_ActionTime=109;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcOrderActionField_TraderID=118;
    /** 安装编号 */
    static final int Offset_CThostFtdcOrderActionField_InstallID=140;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcOrderActionField_OrderLocalID=144;
    /** 操作本地编号 */
    static final int Offset_CThostFtdcOrderActionField_ActionLocalID=157;
    /** 会员代码 */
    static final int Offset_CThostFtdcOrderActionField_ParticipantID=170;
    /** 客户代码 */
    static final int Offset_CThostFtdcOrderActionField_ClientID=181;
    /** 业务单元 */
    static final int Offset_CThostFtdcOrderActionField_BusinessUnit=192;
    /** 报单操作状态 */
    static final int Offset_CThostFtdcOrderActionField_OrderActionStatus=213;
    /** 用户代码 */
    static final int Offset_CThostFtdcOrderActionField_UserID=214;
    /** 状态信息 */
    static final int Offset_CThostFtdcOrderActionField_StatusMsg=230;
    /** 合约代码 */
    static final int Offset_CThostFtdcOrderActionField_InstrumentID=311;

    /** 交易所报单操作 */
    static final int SizeOf_CThostFtdcExchangeOrderActionField=176;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeOrderActionField_ExchangeID=0;
    /** 报单编号 */
    static final int Offset_CThostFtdcExchangeOrderActionField_OrderSysID=9;
    /** 操作标志 */
    static final int Offset_CThostFtdcExchangeOrderActionField_ActionFlag=30;
    /** 价格 */
    static final int Offset_CThostFtdcExchangeOrderActionField_LimitPrice=32;
    /** 数量变化 */
    static final int Offset_CThostFtdcExchangeOrderActionField_VolumeChange=40;
    /** 操作日期 */
    static final int Offset_CThostFtdcExchangeOrderActionField_ActionDate=44;
    /** 操作时间 */
    static final int Offset_CThostFtdcExchangeOrderActionField_ActionTime=53;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeOrderActionField_TraderID=62;
    /** 安装编号 */
    static final int Offset_CThostFtdcExchangeOrderActionField_InstallID=84;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcExchangeOrderActionField_OrderLocalID=88;
    /** 操作本地编号 */
    static final int Offset_CThostFtdcExchangeOrderActionField_ActionLocalID=101;
    /** 会员代码 */
    static final int Offset_CThostFtdcExchangeOrderActionField_ParticipantID=114;
    /** 客户代码 */
    static final int Offset_CThostFtdcExchangeOrderActionField_ClientID=125;
    /** 业务单元 */
    static final int Offset_CThostFtdcExchangeOrderActionField_BusinessUnit=136;
    /** 报单操作状态 */
    static final int Offset_CThostFtdcExchangeOrderActionField_OrderActionStatus=157;
    /** 用户代码 */
    static final int Offset_CThostFtdcExchangeOrderActionField_UserID=158;

    /** 交易所报单操作失败 */
    static final int SizeOf_CThostFtdcExchangeOrderActionErrorField=172;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeOrderActionErrorField_ExchangeID=0;
    /** 报单编号 */
    static final int Offset_CThostFtdcExchangeOrderActionErrorField_OrderSysID=9;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeOrderActionErrorField_TraderID=30;
    /** 安装编号 */
    static final int Offset_CThostFtdcExchangeOrderActionErrorField_InstallID=52;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcExchangeOrderActionErrorField_OrderLocalID=56;
    /** 操作本地编号 */
    static final int Offset_CThostFtdcExchangeOrderActionErrorField_ActionLocalID=69;
    /** 错误代码 */
    static final int Offset_CThostFtdcExchangeOrderActionErrorField_ErrorID=84;
    /** 错误信息 */
    static final int Offset_CThostFtdcExchangeOrderActionErrorField_ErrorMsg=88;

    /** 交易所成交 */
    static final int SizeOf_CThostFtdcExchangeTradeField=224;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeTradeField_ExchangeID=0;
    /** 成交编号 */
    static final int Offset_CThostFtdcExchangeTradeField_TradeID=9;
    /** 买卖方向 */
    static final int Offset_CThostFtdcExchangeTradeField_Direction=30;
    /** 报单编号 */
    static final int Offset_CThostFtdcExchangeTradeField_OrderSysID=31;
    /** 会员代码 */
    static final int Offset_CThostFtdcExchangeTradeField_ParticipantID=52;
    /** 客户代码 */
    static final int Offset_CThostFtdcExchangeTradeField_ClientID=63;
    /** 交易角色 */
    static final int Offset_CThostFtdcExchangeTradeField_TradingRole=74;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcExchangeTradeField_ExchangeInstID=75;
    /** 开平标志 */
    static final int Offset_CThostFtdcExchangeTradeField_OffsetFlag=106;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcExchangeTradeField_HedgeFlag=107;
    /** 价格 */
    static final int Offset_CThostFtdcExchangeTradeField_Price=112;
    /** 数量 */
    static final int Offset_CThostFtdcExchangeTradeField_Volume=120;
    /** 成交时期 */
    static final int Offset_CThostFtdcExchangeTradeField_TradeDate=124;
    /** 成交时间 */
    static final int Offset_CThostFtdcExchangeTradeField_TradeTime=133;
    /** 成交类型 */
    static final int Offset_CThostFtdcExchangeTradeField_TradeType=142;
    /** 成交价来源 */
    static final int Offset_CThostFtdcExchangeTradeField_PriceSource=143;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeTradeField_TraderID=144;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcExchangeTradeField_OrderLocalID=165;
    /** 结算会员编号 */
    static final int Offset_CThostFtdcExchangeTradeField_ClearingPartID=178;
    /** 业务单元 */
    static final int Offset_CThostFtdcExchangeTradeField_BusinessUnit=189;
    /** 序号 */
    static final int Offset_CThostFtdcExchangeTradeField_SequenceNo=212;
    /** 成交来源 */
    static final int Offset_CThostFtdcExchangeTradeField_TradeSource=216;

    /** 成交 */
    static final int SizeOf_CThostFtdcTradeField=320;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcTradeField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcTradeField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcTradeField_InstrumentID=24;
    /** 报单引用 */
    static final int Offset_CThostFtdcTradeField_OrderRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcTradeField_UserID=68;
    /** 交易所代码 */
    static final int Offset_CThostFtdcTradeField_ExchangeID=84;
    /** 成交编号 */
    static final int Offset_CThostFtdcTradeField_TradeID=93;
    /** 买卖方向 */
    static final int Offset_CThostFtdcTradeField_Direction=114;
    /** 报单编号 */
    static final int Offset_CThostFtdcTradeField_OrderSysID=115;
    /** 会员代码 */
    static final int Offset_CThostFtdcTradeField_ParticipantID=136;
    /** 客户代码 */
    static final int Offset_CThostFtdcTradeField_ClientID=147;
    /** 交易角色 */
    static final int Offset_CThostFtdcTradeField_TradingRole=158;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcTradeField_ExchangeInstID=159;
    /** 开平标志 */
    static final int Offset_CThostFtdcTradeField_OffsetFlag=190;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcTradeField_HedgeFlag=191;
    /** 价格 */
    static final int Offset_CThostFtdcTradeField_Price=192;
    /** 数量 */
    static final int Offset_CThostFtdcTradeField_Volume=200;
    /** 成交时期 */
    static final int Offset_CThostFtdcTradeField_TradeDate=204;
    /** 成交时间 */
    static final int Offset_CThostFtdcTradeField_TradeTime=213;
    /** 成交类型 */
    static final int Offset_CThostFtdcTradeField_TradeType=222;
    /** 成交价来源 */
    static final int Offset_CThostFtdcTradeField_PriceSource=223;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcTradeField_TraderID=224;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcTradeField_OrderLocalID=245;
    /** 结算会员编号 */
    static final int Offset_CThostFtdcTradeField_ClearingPartID=258;
    /** 业务单元 */
    static final int Offset_CThostFtdcTradeField_BusinessUnit=269;
    /** 序号 */
    static final int Offset_CThostFtdcTradeField_SequenceNo=292;
    /** 交易日 */
    static final int Offset_CThostFtdcTradeField_TradingDay=296;
    /** 结算编号 */
    static final int Offset_CThostFtdcTradeField_SettlementID=308;
    /** 经纪公司报单编号 */
    static final int Offset_CThostFtdcTradeField_BrokerOrderSeq=312;
    /** 成交来源 */
    static final int Offset_CThostFtdcTradeField_TradeSource=316;

    /** 用户会话 */
    static final int SizeOf_CThostFtdcUserSessionField=124;
    /** 前置编号 */
    static final int Offset_CThostFtdcUserSessionField_FrontID=0;
    /** 会话编号 */
    static final int Offset_CThostFtdcUserSessionField_SessionID=4;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcUserSessionField_BrokerID=8;
    /** 用户代码 */
    static final int Offset_CThostFtdcUserSessionField_UserID=19;
    /** 登录日期 */
    static final int Offset_CThostFtdcUserSessionField_LoginDate=35;
    /** 登录时间 */
    static final int Offset_CThostFtdcUserSessionField_LoginTime=44;
    /** IP地址 */
    static final int Offset_CThostFtdcUserSessionField_IPAddress=53;
    /** 用户端产品信息 */
    static final int Offset_CThostFtdcUserSessionField_UserProductInfo=69;
    /** 接口端产品信息 */
    static final int Offset_CThostFtdcUserSessionField_InterfaceProductInfo=80;
    /** 协议信息 */
    static final int Offset_CThostFtdcUserSessionField_ProtocolInfo=91;
    /** Mac地址 */
    static final int Offset_CThostFtdcUserSessionField_MacAddress=102;

    /** 查询最大报单数量 */
    static final int SizeOf_CThostFtdcQueryMaxOrderVolumeField=64;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeField_InstrumentID=24;
    /** 买卖方向 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeField_Direction=55;
    /** 开平标志 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeField_OffsetFlag=56;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeField_HedgeFlag=57;
    /** 最大允许报单数量 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeField_MaxVolume=60;

    /** 投资者结算结果确认信息 */
    static final int SizeOf_CThostFtdcSettlementInfoConfirmField=42;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSettlementInfoConfirmField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcSettlementInfoConfirmField_InvestorID=11;
    /** 确认日期 */
    static final int Offset_CThostFtdcSettlementInfoConfirmField_ConfirmDate=24;
    /** 确认时间 */
    static final int Offset_CThostFtdcSettlementInfoConfirmField_ConfirmTime=33;

    /** 出入金同步 */
    static final int SizeOf_CThostFtdcSyncDepositField=56;
    /** 出入金流水号 */
    static final int Offset_CThostFtdcSyncDepositField_DepositSeqNo=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSyncDepositField_BrokerID=15;
    /** 投资者代码 */
    static final int Offset_CThostFtdcSyncDepositField_InvestorID=26;
    /** 入金金额 */
    static final int Offset_CThostFtdcSyncDepositField_Deposit=40;
    /** 是否强制进行 */
    static final int Offset_CThostFtdcSyncDepositField_IsForce=48;
    /** 币种代码 */
    static final int Offset_CThostFtdcSyncDepositField_CurrencyID=52;

    /** 货币质押同步 */
    static final int SizeOf_CThostFtdcSyncFundMortgageField=64;
    /** 货币质押流水号 */
    static final int Offset_CThostFtdcSyncFundMortgageField_MortgageSeqNo=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSyncFundMortgageField_BrokerID=15;
    /** 投资者代码 */
    static final int Offset_CThostFtdcSyncFundMortgageField_InvestorID=26;
    /** 源币种 */
    static final int Offset_CThostFtdcSyncFundMortgageField_FromCurrencyID=39;
    /** 质押金额 */
    static final int Offset_CThostFtdcSyncFundMortgageField_MortgageAmount=48;
    /** 目标币种 */
    static final int Offset_CThostFtdcSyncFundMortgageField_ToCurrencyID=56;

    /** 经纪公司同步 */
    static final int SizeOf_CThostFtdcBrokerSyncField=11;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcBrokerSyncField_BrokerID=0;

    /** 正在同步中的投资者 */
    static final int SizeOf_CThostFtdcSyncingInvestorField=396;
    /** 投资者代码 */
    static final int Offset_CThostFtdcSyncingInvestorField_InvestorID=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSyncingInvestorField_BrokerID=13;
    /** 投资者分组代码 */
    static final int Offset_CThostFtdcSyncingInvestorField_InvestorGroupID=24;
    /** 投资者名称 */
    static final int Offset_CThostFtdcSyncingInvestorField_InvestorName=37;
    /** 证件类型 */
    static final int Offset_CThostFtdcSyncingInvestorField_IdentifiedCardType=118;
    /** 证件号码 */
    static final int Offset_CThostFtdcSyncingInvestorField_IdentifiedCardNo=119;
    /** 是否活跃 */
    static final int Offset_CThostFtdcSyncingInvestorField_IsActive=172;
    /** 联系电话 */
    static final int Offset_CThostFtdcSyncingInvestorField_Telephone=176;
    /** 通讯地址 */
    static final int Offset_CThostFtdcSyncingInvestorField_Address=217;
    /** 开户日期 */
    static final int Offset_CThostFtdcSyncingInvestorField_OpenDate=318;
    /** 手机 */
    static final int Offset_CThostFtdcSyncingInvestorField_Mobile=327;
    /** 手续费率模板代码 */
    static final int Offset_CThostFtdcSyncingInvestorField_CommModelID=368;
    /** 保证金率模板代码 */
    static final int Offset_CThostFtdcSyncingInvestorField_MarginModelID=381;

    /** 正在同步中的交易代码 */
    static final int SizeOf_CThostFtdcSyncingTradingCodeField=52;
    /** 投资者代码 */
    static final int Offset_CThostFtdcSyncingTradingCodeField_InvestorID=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSyncingTradingCodeField_BrokerID=13;
    /** 交易所代码 */
    static final int Offset_CThostFtdcSyncingTradingCodeField_ExchangeID=24;
    /** 客户代码 */
    static final int Offset_CThostFtdcSyncingTradingCodeField_ClientID=33;
    /** 是否活跃 */
    static final int Offset_CThostFtdcSyncingTradingCodeField_IsActive=44;
    /** 交易编码类型 */
    static final int Offset_CThostFtdcSyncingTradingCodeField_ClientIDType=48;

    /** 正在同步中的投资者分组 */
    static final int SizeOf_CThostFtdcSyncingInvestorGroupField=65;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSyncingInvestorGroupField_BrokerID=0;
    /** 投资者分组代码 */
    static final int Offset_CThostFtdcSyncingInvestorGroupField_InvestorGroupID=11;
    /** 投资者分组名称 */
    static final int Offset_CThostFtdcSyncingInvestorGroupField_InvestorGroupName=24;

    /** 正在同步中的交易账号 */
    static final int SizeOf_CThostFtdcSyncingTradingAccountField=376;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_BrokerID=0;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_AccountID=11;
    /** 上次质押金额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_PreMortgage=24;
    /** 上次信用额度 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_PreCredit=32;
    /** 上次存款额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_PreDeposit=40;
    /** 上次结算准备金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_PreBalance=48;
    /** 上次占用的保证金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_PreMargin=56;
    /** 利息基数 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_InterestBase=64;
    /** 利息收入 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_Interest=72;
    /** 入金金额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_Deposit=80;
    /** 出金金额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_Withdraw=88;
    /** 冻结的保证金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_FrozenMargin=96;
    /** 冻结的资金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_FrozenCash=104;
    /** 冻结的手续费 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_FrozenCommission=112;
    /** 当前保证金总额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_CurrMargin=120;
    /** 资金差额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_CashIn=128;
    /** 手续费 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_Commission=136;
    /** 平仓盈亏 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_CloseProfit=144;
    /** 持仓盈亏 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_PositionProfit=152;
    /** 期货结算准备金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_Balance=160;
    /** 可用资金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_Available=168;
    /** 可取资金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_WithdrawQuota=176;
    /** 基本准备金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_Reserve=184;
    /** 交易日 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_TradingDay=192;
    /** 结算编号 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_SettlementID=204;
    /** 信用额度 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_Credit=208;
    /** 质押金额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_Mortgage=216;
    /** 交易所保证金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_ExchangeMargin=224;
    /** 投资者交割保证金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_DeliveryMargin=232;
    /** 交易所交割保证金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_ExchangeDeliveryMargin=240;
    /** 保底期货结算准备金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_ReserveBalance=248;
    /** 币种代码 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_CurrencyID=256;
    /** 上次货币质入金额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_PreFundMortgageIn=264;
    /** 上次货币质出金额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_PreFundMortgageOut=272;
    /** 货币质入金额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_FundMortgageIn=280;
    /** 货币质出金额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_FundMortgageOut=288;
    /** 货币质押余额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_FundMortgageAvailable=296;
    /** 可质押货币金额 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_MortgageableFund=304;
    /** 特殊产品占用保证金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_SpecProductMargin=312;
    /** 特殊产品冻结保证金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_SpecProductFrozenMargin=320;
    /** 特殊产品手续费 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_SpecProductCommission=328;
    /** 特殊产品冻结手续费 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_SpecProductFrozenCommission=336;
    /** 特殊产品持仓盈亏 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_SpecProductPositionProfit=344;
    /** 特殊产品平仓盈亏 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_SpecProductCloseProfit=352;
    /** 根据持仓盈亏算法计算的特殊产品持仓盈亏 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_SpecProductPositionProfitByAlg=360;
    /** 特殊产品交易所保证金 */
    static final int Offset_CThostFtdcSyncingTradingAccountField_SpecProductExchangeMargin=368;

    /** 正在同步中的投资者持仓 */
    static final int SizeOf_CThostFtdcSyncingInvestorPositionField=328;
    /** 合约代码 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_InstrumentID=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_BrokerID=31;
    /** 投资者代码 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_InvestorID=42;
    /** 持仓多空方向 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_PosiDirection=55;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_HedgeFlag=56;
    /** 持仓日期 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_PositionDate=57;
    /** 上日持仓 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_YdPosition=60;
    /** 今日持仓 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_Position=64;
    /** 多头冻结 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_LongFrozen=68;
    /** 空头冻结 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_ShortFrozen=72;
    /** 开仓冻结金额 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_LongFrozenAmount=80;
    /** 开仓冻结金额 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_ShortFrozenAmount=88;
    /** 开仓量 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_OpenVolume=96;
    /** 平仓量 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_CloseVolume=100;
    /** 开仓金额 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_OpenAmount=104;
    /** 平仓金额 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_CloseAmount=112;
    /** 持仓成本 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_PositionCost=120;
    /** 上次占用的保证金 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_PreMargin=128;
    /** 占用的保证金 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_UseMargin=136;
    /** 冻结的保证金 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_FrozenMargin=144;
    /** 冻结的资金 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_FrozenCash=152;
    /** 冻结的手续费 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_FrozenCommission=160;
    /** 资金差额 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_CashIn=168;
    /** 手续费 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_Commission=176;
    /** 平仓盈亏 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_CloseProfit=184;
    /** 持仓盈亏 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_PositionProfit=192;
    /** 上次结算价 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_PreSettlementPrice=200;
    /** 本次结算价 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_SettlementPrice=208;
    /** 交易日 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_TradingDay=216;
    /** 结算编号 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_SettlementID=228;
    /** 开仓成本 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_OpenCost=232;
    /** 交易所保证金 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_ExchangeMargin=240;
    /** 组合成交形成的持仓 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_CombPosition=248;
    /** 组合多头冻结 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_CombLongFrozen=252;
    /** 组合空头冻结 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_CombShortFrozen=256;
    /** 逐日盯市平仓盈亏 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_CloseProfitByDate=264;
    /** 逐笔对冲平仓盈亏 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_CloseProfitByTrade=272;
    /** 今日持仓 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_TodayPosition=280;
    /** 保证金率 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_MarginRateByMoney=288;
    /** 保证金率(按手数) */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_MarginRateByVolume=296;
    /** 执行冻结 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_StrikeFrozen=304;
    /** 执行冻结金额 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_StrikeFrozenAmount=312;
    /** 放弃执行冻结 */
    static final int Offset_CThostFtdcSyncingInvestorPositionField_AbandonFrozen=320;

    /** 正在同步中的合约保证金率 */
    static final int SizeOf_CThostFtdcSyncingInstrumentMarginRateField=104;
    /** 合约代码 */
    static final int Offset_CThostFtdcSyncingInstrumentMarginRateField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcSyncingInstrumentMarginRateField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSyncingInstrumentMarginRateField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcSyncingInstrumentMarginRateField_InvestorID=43;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcSyncingInstrumentMarginRateField_HedgeFlag=56;
    /** 多头保证金率 */
    static final int Offset_CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByMoney=64;
    /** 多头保证金费 */
    static final int Offset_CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByVolume=72;
    /** 空头保证金率 */
    static final int Offset_CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByMoney=80;
    /** 空头保证金费 */
    static final int Offset_CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByVolume=88;
    /** 是否相对交易所收取 */
    static final int Offset_CThostFtdcSyncingInstrumentMarginRateField_IsRelative=96;

    /** 正在同步中的合约手续费率 */
    static final int SizeOf_CThostFtdcSyncingInstrumentCommissionRateField=104;
    /** 合约代码 */
    static final int Offset_CThostFtdcSyncingInstrumentCommissionRateField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcSyncingInstrumentCommissionRateField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSyncingInstrumentCommissionRateField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcSyncingInstrumentCommissionRateField_InvestorID=43;
    /** 开仓手续费率 */
    static final int Offset_CThostFtdcSyncingInstrumentCommissionRateField_OpenRatioByMoney=56;
    /** 开仓手续费 */
    static final int Offset_CThostFtdcSyncingInstrumentCommissionRateField_OpenRatioByVolume=64;
    /** 平仓手续费率 */
    static final int Offset_CThostFtdcSyncingInstrumentCommissionRateField_CloseRatioByMoney=72;
    /** 平仓手续费 */
    static final int Offset_CThostFtdcSyncingInstrumentCommissionRateField_CloseRatioByVolume=80;
    /** 平今手续费率 */
    static final int Offset_CThostFtdcSyncingInstrumentCommissionRateField_CloseTodayRatioByMoney=88;
    /** 平今手续费 */
    static final int Offset_CThostFtdcSyncingInstrumentCommissionRateField_CloseTodayRatioByVolume=96;

    /** 正在同步中的合约交易权限 */
    static final int SizeOf_CThostFtdcSyncingInstrumentTradingRightField=57;
    /** 合约代码 */
    static final int Offset_CThostFtdcSyncingInstrumentTradingRightField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcSyncingInstrumentTradingRightField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSyncingInstrumentTradingRightField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcSyncingInstrumentTradingRightField_InvestorID=43;
    /** 交易权限 */
    static final int Offset_CThostFtdcSyncingInstrumentTradingRightField_TradingRight=56;

    /** 查询报单 */
    static final int SizeOf_CThostFtdcQryOrderField=103;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryOrderField_InstrumentID=24;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryOrderField_ExchangeID=55;
    /** 报单编号 */
    static final int Offset_CThostFtdcQryOrderField_OrderSysID=64;
    /** 开始时间 */
    static final int Offset_CThostFtdcQryOrderField_InsertTimeStart=85;
    /** 结束时间 */
    static final int Offset_CThostFtdcQryOrderField_InsertTimeEnd=94;

    /** 查询成交 */
    static final int SizeOf_CThostFtdcQryTradeField=103;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryTradeField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryTradeField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryTradeField_InstrumentID=24;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryTradeField_ExchangeID=55;
    /** 成交编号 */
    static final int Offset_CThostFtdcQryTradeField_TradeID=64;
    /** 开始时间 */
    static final int Offset_CThostFtdcQryTradeField_TradeTimeStart=85;
    /** 结束时间 */
    static final int Offset_CThostFtdcQryTradeField_TradeTimeEnd=94;

    /** 查询投资者持仓 */
    static final int SizeOf_CThostFtdcQryInvestorPositionField=55;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryInvestorPositionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryInvestorPositionField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryInvestorPositionField_InstrumentID=24;

    /** 查询资金账户 */
    static final int SizeOf_CThostFtdcQryTradingAccountField=28;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryTradingAccountField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryTradingAccountField_InvestorID=11;
    /** 币种代码 */
    static final int Offset_CThostFtdcQryTradingAccountField_CurrencyID=24;

    /** 查询投资者 */
    static final int SizeOf_CThostFtdcQryInvestorField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryInvestorField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryInvestorField_InvestorID=11;

    /** 查询交易编码 */
    static final int SizeOf_CThostFtdcQryTradingCodeField=45;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryTradingCodeField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryTradingCodeField_InvestorID=11;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryTradingCodeField_ExchangeID=24;
    /** 客户代码 */
    static final int Offset_CThostFtdcQryTradingCodeField_ClientID=33;
    /** 交易编码类型 */
    static final int Offset_CThostFtdcQryTradingCodeField_ClientIDType=44;

    /** 查询投资者组 */
    static final int SizeOf_CThostFtdcQryInvestorGroupField=11;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryInvestorGroupField_BrokerID=0;

    /** 查询合约保证金率 */
    static final int SizeOf_CThostFtdcQryInstrumentMarginRateField=56;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryInstrumentMarginRateField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryInstrumentMarginRateField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryInstrumentMarginRateField_InstrumentID=24;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcQryInstrumentMarginRateField_HedgeFlag=55;

    /** 查询手续费率 */
    static final int SizeOf_CThostFtdcQryInstrumentCommissionRateField=55;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryInstrumentCommissionRateField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryInstrumentCommissionRateField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryInstrumentCommissionRateField_InstrumentID=24;

    /** 查询合约交易权限 */
    static final int SizeOf_CThostFtdcQryInstrumentTradingRightField=55;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryInstrumentTradingRightField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryInstrumentTradingRightField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryInstrumentTradingRightField_InstrumentID=24;

    /** 查询经纪公司 */
    static final int SizeOf_CThostFtdcQryBrokerField=11;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryBrokerField_BrokerID=0;

    /** 查询交易员 */
    static final int SizeOf_CThostFtdcQryTraderField=41;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryTraderField_ExchangeID=0;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryTraderField_ParticipantID=9;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQryTraderField_TraderID=20;

    /** 查询管理用户功能权限 */
    static final int SizeOf_CThostFtdcQrySuperUserFunctionField=16;
    /** 用户代码 */
    static final int Offset_CThostFtdcQrySuperUserFunctionField_UserID=0;

    /** 查询用户会话 */
    static final int SizeOf_CThostFtdcQryUserSessionField=36;
    /** 前置编号 */
    static final int Offset_CThostFtdcQryUserSessionField_FrontID=0;
    /** 会话编号 */
    static final int Offset_CThostFtdcQryUserSessionField_SessionID=4;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryUserSessionField_BrokerID=8;
    /** 用户代码 */
    static final int Offset_CThostFtdcQryUserSessionField_UserID=19;

    /** 查询经纪公司会员代码 */
    static final int SizeOf_CThostFtdcQryPartBrokerField=31;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryPartBrokerField_ExchangeID=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryPartBrokerField_BrokerID=9;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryPartBrokerField_ParticipantID=20;

    /** 查询前置状态 */
    static final int SizeOf_CThostFtdcQryFrontStatusField=4;
    /** 前置编号 */
    static final int Offset_CThostFtdcQryFrontStatusField_FrontID=0;

    /** 查询交易所报单 */
    static final int SizeOf_CThostFtdcQryExchangeOrderField=83;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryExchangeOrderField_ParticipantID=0;
    /** 客户代码 */
    static final int Offset_CThostFtdcQryExchangeOrderField_ClientID=11;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcQryExchangeOrderField_ExchangeInstID=22;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExchangeOrderField_ExchangeID=53;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQryExchangeOrderField_TraderID=62;

    /** 查询报单操作 */
    static final int SizeOf_CThostFtdcQryOrderActionField=33;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryOrderActionField_InvestorID=11;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryOrderActionField_ExchangeID=24;

    /** 查询交易所报单操作 */
    static final int SizeOf_CThostFtdcQryExchangeOrderActionField=52;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryExchangeOrderActionField_ParticipantID=0;
    /** 客户代码 */
    static final int Offset_CThostFtdcQryExchangeOrderActionField_ClientID=11;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExchangeOrderActionField_ExchangeID=22;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQryExchangeOrderActionField_TraderID=31;

    /** 查询管理用户 */
    static final int SizeOf_CThostFtdcQrySuperUserField=16;
    /** 用户代码 */
    static final int Offset_CThostFtdcQrySuperUserField_UserID=0;

    /** 查询交易所 */
    static final int SizeOf_CThostFtdcQryExchangeField=9;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExchangeField_ExchangeID=0;

    /** 查询产品 */
    static final int SizeOf_CThostFtdcQryProductField=32;
    /** 产品代码 */
    static final int Offset_CThostFtdcQryProductField_ProductID=0;
    /** 产品类型 */
    static final int Offset_CThostFtdcQryProductField_ProductClass=31;

    /** 查询合约 */
    static final int SizeOf_CThostFtdcQryInstrumentField=102;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryInstrumentField_InstrumentID=0;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryInstrumentField_ExchangeID=31;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcQryInstrumentField_ExchangeInstID=40;
    /** 产品代码 */
    static final int Offset_CThostFtdcQryInstrumentField_ProductID=71;

    /** 查询行情 */
    static final int SizeOf_CThostFtdcQryDepthMarketDataField=31;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryDepthMarketDataField_InstrumentID=0;

    /** 查询经纪公司用户 */
    static final int SizeOf_CThostFtdcQryBrokerUserField=27;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryBrokerUserField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcQryBrokerUserField_UserID=11;

    /** 查询经纪公司用户权限 */
    static final int SizeOf_CThostFtdcQryBrokerUserFunctionField=27;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryBrokerUserFunctionField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcQryBrokerUserFunctionField_UserID=11;

    /** 查询交易员报盘机 */
    static final int SizeOf_CThostFtdcQryTraderOfferField=41;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryTraderOfferField_ExchangeID=0;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryTraderOfferField_ParticipantID=9;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQryTraderOfferField_TraderID=20;

    /** 查询出入金流水 */
    static final int SizeOf_CThostFtdcQrySyncDepositField=26;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQrySyncDepositField_BrokerID=0;
    /** 出入金流水号 */
    static final int Offset_CThostFtdcQrySyncDepositField_DepositSeqNo=11;

    /** 查询投资者结算结果 */
    static final int SizeOf_CThostFtdcQrySettlementInfoField=33;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQrySettlementInfoField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQrySettlementInfoField_InvestorID=11;
    /** 交易日 */
    static final int Offset_CThostFtdcQrySettlementInfoField_TradingDay=24;

    /** 查询交易所保证金率 */
    static final int SizeOf_CThostFtdcQryExchangeMarginRateField=43;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryExchangeMarginRateField_BrokerID=0;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryExchangeMarginRateField_InstrumentID=11;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcQryExchangeMarginRateField_HedgeFlag=42;

    /** 查询交易所调整保证金率 */
    static final int SizeOf_CThostFtdcQryExchangeMarginRateAdjustField=43;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryExchangeMarginRateAdjustField_BrokerID=0;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryExchangeMarginRateAdjustField_InstrumentID=11;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcQryExchangeMarginRateAdjustField_HedgeFlag=42;

    /** 查询汇率 */
    static final int SizeOf_CThostFtdcQryExchangeRateField=19;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryExchangeRateField_BrokerID=0;
    /** 源币种 */
    static final int Offset_CThostFtdcQryExchangeRateField_FromCurrencyID=11;
    /** 目标币种 */
    static final int Offset_CThostFtdcQryExchangeRateField_ToCurrencyID=15;

    /** 查询货币质押流水 */
    static final int SizeOf_CThostFtdcQrySyncFundMortgageField=26;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQrySyncFundMortgageField_BrokerID=0;
    /** 货币质押流水号 */
    static final int Offset_CThostFtdcQrySyncFundMortgageField_MortgageSeqNo=11;

    /** 查询报单 */
    static final int SizeOf_CThostFtdcQryHisOrderField=116;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryHisOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryHisOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryHisOrderField_InstrumentID=24;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryHisOrderField_ExchangeID=55;
    /** 报单编号 */
    static final int Offset_CThostFtdcQryHisOrderField_OrderSysID=64;
    /** 开始时间 */
    static final int Offset_CThostFtdcQryHisOrderField_InsertTimeStart=85;
    /** 结束时间 */
    static final int Offset_CThostFtdcQryHisOrderField_InsertTimeEnd=94;
    /** 交易日 */
    static final int Offset_CThostFtdcQryHisOrderField_TradingDay=103;
    /** 结算编号 */
    static final int Offset_CThostFtdcQryHisOrderField_SettlementID=112;

    /** 当前期权合约最小保证金 */
    static final int SizeOf_CThostFtdcOptionInstrMiniMarginField=72;
    /** 合约代码 */
    static final int Offset_CThostFtdcOptionInstrMiniMarginField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcOptionInstrMiniMarginField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcOptionInstrMiniMarginField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcOptionInstrMiniMarginField_InvestorID=43;
    /** 单位（手）期权合约最小保证金 */
    static final int Offset_CThostFtdcOptionInstrMiniMarginField_MinMargin=56;
    /** 取值方式 */
    static final int Offset_CThostFtdcOptionInstrMiniMarginField_ValueMethod=64;
    /** 是否跟随交易所收取 */
    static final int Offset_CThostFtdcOptionInstrMiniMarginField_IsRelative=68;

    /** 当前期权合约保证金调整系数 */
    static final int SizeOf_CThostFtdcOptionInstrMarginAdjustField=112;
    /** 合约代码 */
    static final int Offset_CThostFtdcOptionInstrMarginAdjustField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcOptionInstrMarginAdjustField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcOptionInstrMarginAdjustField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcOptionInstrMarginAdjustField_InvestorID=43;
    /** 投机空头保证金调整系数 */
    static final int Offset_CThostFtdcOptionInstrMarginAdjustField_SShortMarginRatioByMoney=56;
    /** 投机空头保证金调整系数 */
    static final int Offset_CThostFtdcOptionInstrMarginAdjustField_SShortMarginRatioByVolume=64;
    /** 保值空头保证金调整系数 */
    static final int Offset_CThostFtdcOptionInstrMarginAdjustField_HShortMarginRatioByMoney=72;
    /** 保值空头保证金调整系数 */
    static final int Offset_CThostFtdcOptionInstrMarginAdjustField_HShortMarginRatioByVolume=80;
    /** 套利空头保证金调整系数 */
    static final int Offset_CThostFtdcOptionInstrMarginAdjustField_AShortMarginRatioByMoney=88;
    /** 套利空头保证金调整系数 */
    static final int Offset_CThostFtdcOptionInstrMarginAdjustField_AShortMarginRatioByVolume=96;
    /** 是否跟随交易所收取 */
    static final int Offset_CThostFtdcOptionInstrMarginAdjustField_IsRelative=104;

    /** 当前期权合约手续费的详细内容 */
    static final int SizeOf_CThostFtdcOptionInstrCommRateField=120;
    /** 合约代码 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_InvestorID=43;
    /** 开仓手续费率 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_OpenRatioByMoney=56;
    /** 开仓手续费 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_OpenRatioByVolume=64;
    /** 平仓手续费率 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_CloseRatioByMoney=72;
    /** 平仓手续费 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_CloseRatioByVolume=80;
    /** 平今手续费率 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_CloseTodayRatioByMoney=88;
    /** 平今手续费 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_CloseTodayRatioByVolume=96;
    /** 执行手续费率 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_StrikeRatioByMoney=104;
    /** 执行手续费 */
    static final int Offset_CThostFtdcOptionInstrCommRateField_StrikeRatioByVolume=112;

    /** 期权交易成本 */
    static final int SizeOf_CThostFtdcOptionInstrTradeCostField=96;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcOptionInstrTradeCostField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcOptionInstrTradeCostField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcOptionInstrTradeCostField_InstrumentID=24;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcOptionInstrTradeCostField_HedgeFlag=55;
    /** 期权合约保证金不变部分 */
    static final int Offset_CThostFtdcOptionInstrTradeCostField_FixedMargin=56;
    /** 期权合约最小保证金 */
    static final int Offset_CThostFtdcOptionInstrTradeCostField_MiniMargin=64;
    /** 期权合约权利金 */
    static final int Offset_CThostFtdcOptionInstrTradeCostField_Royalty=72;
    /** 交易所期权合约保证金不变部分 */
    static final int Offset_CThostFtdcOptionInstrTradeCostField_ExchFixedMargin=80;
    /** 交易所期权合约最小保证金 */
    static final int Offset_CThostFtdcOptionInstrTradeCostField_ExchMiniMargin=88;

    /** 期权交易成本查询 */
    static final int SizeOf_CThostFtdcQryOptionInstrTradeCostField=72;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryOptionInstrTradeCostField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryOptionInstrTradeCostField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryOptionInstrTradeCostField_InstrumentID=24;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcQryOptionInstrTradeCostField_HedgeFlag=55;
    /** 期权合约报价 */
    static final int Offset_CThostFtdcQryOptionInstrTradeCostField_InputPrice=56;
    /** 标的价格,填0则用昨结算价 */
    static final int Offset_CThostFtdcQryOptionInstrTradeCostField_UnderlyingPrice=64;

    /** 期权手续费率查询 */
    static final int SizeOf_CThostFtdcQryOptionInstrCommRateField=55;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryOptionInstrCommRateField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryOptionInstrCommRateField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryOptionInstrCommRateField_InstrumentID=24;

    /** 股指现货指数 */
    static final int SizeOf_CThostFtdcIndexPriceField=56;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcIndexPriceField_BrokerID=0;
    /** 合约代码 */
    static final int Offset_CThostFtdcIndexPriceField_InstrumentID=11;
    /** 指数现货收盘价 */
    static final int Offset_CThostFtdcIndexPriceField_ClosePrice=48;

    /** 输入的执行宣告 */
    static final int SizeOf_CThostFtdcInputExecOrderField=120;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInputExecOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInputExecOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcInputExecOrderField_InstrumentID=24;
    /** 执行宣告引用 */
    static final int Offset_CThostFtdcInputExecOrderField_ExecOrderRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcInputExecOrderField_UserID=68;
    /** 数量 */
    static final int Offset_CThostFtdcInputExecOrderField_Volume=84;
    /** 请求编号 */
    static final int Offset_CThostFtdcInputExecOrderField_RequestID=88;
    /** 业务单元 */
    static final int Offset_CThostFtdcInputExecOrderField_BusinessUnit=92;
    /** 开平标志 */
    static final int Offset_CThostFtdcInputExecOrderField_OffsetFlag=113;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcInputExecOrderField_HedgeFlag=114;
    /** 执行类型 */
    static final int Offset_CThostFtdcInputExecOrderField_ActionType=115;
    /** 保留头寸申请的持仓方向 */
    static final int Offset_CThostFtdcInputExecOrderField_PosiDirection=116;
    /** 期权行权后是否保留期货头寸的标记 */
    static final int Offset_CThostFtdcInputExecOrderField_ReservePositionFlag=117;
    /** 期权行权后生成的头寸是否自动平仓 */
    static final int Offset_CThostFtdcInputExecOrderField_CloseFlag=118;

    /** 输入执行宣告操作 */
    static final int SizeOf_CThostFtdcInputExecOrderActionField=136;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInputExecOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInputExecOrderActionField_InvestorID=11;
    /** 执行宣告操作引用 */
    static final int Offset_CThostFtdcInputExecOrderActionField_ExecOrderActionRef=24;
    /** 执行宣告引用 */
    static final int Offset_CThostFtdcInputExecOrderActionField_ExecOrderRef=28;
    /** 请求编号 */
    static final int Offset_CThostFtdcInputExecOrderActionField_RequestID=44;
    /** 前置编号 */
    static final int Offset_CThostFtdcInputExecOrderActionField_FrontID=48;
    /** 会话编号 */
    static final int Offset_CThostFtdcInputExecOrderActionField_SessionID=52;
    /** 交易所代码 */
    static final int Offset_CThostFtdcInputExecOrderActionField_ExchangeID=56;
    /** 执行宣告操作编号 */
    static final int Offset_CThostFtdcInputExecOrderActionField_ExecOrderSysID=65;
    /** 操作标志 */
    static final int Offset_CThostFtdcInputExecOrderActionField_ActionFlag=86;
    /** 用户代码 */
    static final int Offset_CThostFtdcInputExecOrderActionField_UserID=87;
    /** 合约代码 */
    static final int Offset_CThostFtdcInputExecOrderActionField_InstrumentID=103;

    /** 执行宣告 */
    static final int SizeOf_CThostFtdcExecOrderField=428;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcExecOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcExecOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcExecOrderField_InstrumentID=24;
    /** 执行宣告引用 */
    static final int Offset_CThostFtdcExecOrderField_ExecOrderRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcExecOrderField_UserID=68;
    /** 数量 */
    static final int Offset_CThostFtdcExecOrderField_Volume=84;
    /** 请求编号 */
    static final int Offset_CThostFtdcExecOrderField_RequestID=88;
    /** 业务单元 */
    static final int Offset_CThostFtdcExecOrderField_BusinessUnit=92;
    /** 开平标志 */
    static final int Offset_CThostFtdcExecOrderField_OffsetFlag=113;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcExecOrderField_HedgeFlag=114;
    /** 执行类型 */
    static final int Offset_CThostFtdcExecOrderField_ActionType=115;
    /** 保留头寸申请的持仓方向 */
    static final int Offset_CThostFtdcExecOrderField_PosiDirection=116;
    /** 期权行权后是否保留期货头寸的标记 */
    static final int Offset_CThostFtdcExecOrderField_ReservePositionFlag=117;
    /** 期权行权后生成的头寸是否自动平仓 */
    static final int Offset_CThostFtdcExecOrderField_CloseFlag=118;
    /** 本地执行宣告编号 */
    static final int Offset_CThostFtdcExecOrderField_ExecOrderLocalID=119;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExecOrderField_ExchangeID=132;
    /** 会员代码 */
    static final int Offset_CThostFtdcExecOrderField_ParticipantID=141;
    /** 客户代码 */
    static final int Offset_CThostFtdcExecOrderField_ClientID=152;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcExecOrderField_ExchangeInstID=163;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExecOrderField_TraderID=194;
    /** 安装编号 */
    static final int Offset_CThostFtdcExecOrderField_InstallID=216;
    /** 执行宣告提交状态 */
    static final int Offset_CThostFtdcExecOrderField_OrderSubmitStatus=220;
    /** 报单提示序号 */
    static final int Offset_CThostFtdcExecOrderField_NotifySequence=224;
    /** 交易日 */
    static final int Offset_CThostFtdcExecOrderField_TradingDay=228;
    /** 结算编号 */
    static final int Offset_CThostFtdcExecOrderField_SettlementID=240;
    /** 执行宣告编号 */
    static final int Offset_CThostFtdcExecOrderField_ExecOrderSysID=244;
    /** 报单日期 */
    static final int Offset_CThostFtdcExecOrderField_InsertDate=265;
    /** 插入时间 */
    static final int Offset_CThostFtdcExecOrderField_InsertTime=274;
    /** 撤销时间 */
    static final int Offset_CThostFtdcExecOrderField_CancelTime=283;
    /** 执行结果 */
    static final int Offset_CThostFtdcExecOrderField_ExecResult=292;
    /** 结算会员编号 */
    static final int Offset_CThostFtdcExecOrderField_ClearingPartID=293;
    /** 序号 */
    static final int Offset_CThostFtdcExecOrderField_SequenceNo=304;
    /** 前置编号 */
    static final int Offset_CThostFtdcExecOrderField_FrontID=308;
    /** 会话编号 */
    static final int Offset_CThostFtdcExecOrderField_SessionID=312;
    /** 用户端产品信息 */
    static final int Offset_CThostFtdcExecOrderField_UserProductInfo=316;
    /** 状态信息 */
    static final int Offset_CThostFtdcExecOrderField_StatusMsg=327;
    /** 操作用户代码 */
    static final int Offset_CThostFtdcExecOrderField_ActiveUserID=408;
    /** 经纪公司报单编号 */
    static final int Offset_CThostFtdcExecOrderField_BrokerExecOrderSeq=424;

    /** 执行宣告操作 */
    static final int SizeOf_CThostFtdcExecOrderActionField=332;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcExecOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcExecOrderActionField_InvestorID=11;
    /** 执行宣告操作引用 */
    static final int Offset_CThostFtdcExecOrderActionField_ExecOrderActionRef=24;
    /** 执行宣告引用 */
    static final int Offset_CThostFtdcExecOrderActionField_ExecOrderRef=28;
    /** 请求编号 */
    static final int Offset_CThostFtdcExecOrderActionField_RequestID=44;
    /** 前置编号 */
    static final int Offset_CThostFtdcExecOrderActionField_FrontID=48;
    /** 会话编号 */
    static final int Offset_CThostFtdcExecOrderActionField_SessionID=52;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExecOrderActionField_ExchangeID=56;
    /** 执行宣告操作编号 */
    static final int Offset_CThostFtdcExecOrderActionField_ExecOrderSysID=65;
    /** 操作标志 */
    static final int Offset_CThostFtdcExecOrderActionField_ActionFlag=86;
    /** 操作日期 */
    static final int Offset_CThostFtdcExecOrderActionField_ActionDate=87;
    /** 操作时间 */
    static final int Offset_CThostFtdcExecOrderActionField_ActionTime=96;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExecOrderActionField_TraderID=105;
    /** 安装编号 */
    static final int Offset_CThostFtdcExecOrderActionField_InstallID=128;
    /** 本地执行宣告编号 */
    static final int Offset_CThostFtdcExecOrderActionField_ExecOrderLocalID=132;
    /** 操作本地编号 */
    static final int Offset_CThostFtdcExecOrderActionField_ActionLocalID=145;
    /** 会员代码 */
    static final int Offset_CThostFtdcExecOrderActionField_ParticipantID=158;
    /** 客户代码 */
    static final int Offset_CThostFtdcExecOrderActionField_ClientID=169;
    /** 业务单元 */
    static final int Offset_CThostFtdcExecOrderActionField_BusinessUnit=180;
    /** 报单操作状态 */
    static final int Offset_CThostFtdcExecOrderActionField_OrderActionStatus=201;
    /** 用户代码 */
    static final int Offset_CThostFtdcExecOrderActionField_UserID=202;
    /** 执行类型 */
    static final int Offset_CThostFtdcExecOrderActionField_ActionType=218;
    /** 状态信息 */
    static final int Offset_CThostFtdcExecOrderActionField_StatusMsg=219;
    /** 合约代码 */
    static final int Offset_CThostFtdcExecOrderActionField_InstrumentID=300;

    /** 执行宣告查询 */
    static final int SizeOf_CThostFtdcQryExecOrderField=103;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryExecOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryExecOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryExecOrderField_InstrumentID=24;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExecOrderField_ExchangeID=55;
    /** 执行宣告编号 */
    static final int Offset_CThostFtdcQryExecOrderField_ExecOrderSysID=64;
    /** 开始时间 */
    static final int Offset_CThostFtdcQryExecOrderField_InsertTimeStart=85;
    /** 结束时间 */
    static final int Offset_CThostFtdcQryExecOrderField_InsertTimeEnd=94;

    /** 交易所执行宣告信息 */
    static final int SizeOf_CThostFtdcExchangeExecOrderField=224;
    /** 数量 */
    static final int Offset_CThostFtdcExchangeExecOrderField_Volume=0;
    /** 请求编号 */
    static final int Offset_CThostFtdcExchangeExecOrderField_RequestID=4;
    /** 业务单元 */
    static final int Offset_CThostFtdcExchangeExecOrderField_BusinessUnit=8;
    /** 开平标志 */
    static final int Offset_CThostFtdcExchangeExecOrderField_OffsetFlag=29;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcExchangeExecOrderField_HedgeFlag=30;
    /** 执行类型 */
    static final int Offset_CThostFtdcExchangeExecOrderField_ActionType=31;
    /** 保留头寸申请的持仓方向 */
    static final int Offset_CThostFtdcExchangeExecOrderField_PosiDirection=32;
    /** 期权行权后是否保留期货头寸的标记 */
    static final int Offset_CThostFtdcExchangeExecOrderField_ReservePositionFlag=33;
    /** 期权行权后生成的头寸是否自动平仓 */
    static final int Offset_CThostFtdcExchangeExecOrderField_CloseFlag=34;
    /** 本地执行宣告编号 */
    static final int Offset_CThostFtdcExchangeExecOrderField_ExecOrderLocalID=35;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeExecOrderField_ExchangeID=48;
    /** 会员代码 */
    static final int Offset_CThostFtdcExchangeExecOrderField_ParticipantID=57;
    /** 客户代码 */
    static final int Offset_CThostFtdcExchangeExecOrderField_ClientID=68;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcExchangeExecOrderField_ExchangeInstID=79;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeExecOrderField_TraderID=110;
    /** 安装编号 */
    static final int Offset_CThostFtdcExchangeExecOrderField_InstallID=132;
    /** 执行宣告提交状态 */
    static final int Offset_CThostFtdcExchangeExecOrderField_OrderSubmitStatus=136;
    /** 报单提示序号 */
    static final int Offset_CThostFtdcExchangeExecOrderField_NotifySequence=140;
    /** 交易日 */
    static final int Offset_CThostFtdcExchangeExecOrderField_TradingDay=144;
    /** 结算编号 */
    static final int Offset_CThostFtdcExchangeExecOrderField_SettlementID=156;
    /** 执行宣告编号 */
    static final int Offset_CThostFtdcExchangeExecOrderField_ExecOrderSysID=160;
    /** 报单日期 */
    static final int Offset_CThostFtdcExchangeExecOrderField_InsertDate=181;
    /** 插入时间 */
    static final int Offset_CThostFtdcExchangeExecOrderField_InsertTime=190;
    /** 撤销时间 */
    static final int Offset_CThostFtdcExchangeExecOrderField_CancelTime=199;
    /** 执行结果 */
    static final int Offset_CThostFtdcExchangeExecOrderField_ExecResult=208;
    /** 结算会员编号 */
    static final int Offset_CThostFtdcExchangeExecOrderField_ClearingPartID=209;
    /** 序号 */
    static final int Offset_CThostFtdcExchangeExecOrderField_SequenceNo=220;

    /** 交易所执行宣告查询 */
    static final int SizeOf_CThostFtdcQryExchangeExecOrderField=83;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryExchangeExecOrderField_ParticipantID=0;
    /** 客户代码 */
    static final int Offset_CThostFtdcQryExchangeExecOrderField_ClientID=11;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcQryExchangeExecOrderField_ExchangeInstID=22;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExchangeExecOrderField_ExchangeID=53;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQryExchangeExecOrderField_TraderID=62;

    /** 执行宣告操作查询 */
    static final int SizeOf_CThostFtdcQryExecOrderActionField=33;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryExecOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryExecOrderActionField_InvestorID=11;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExecOrderActionField_ExchangeID=24;

    /** 交易所执行宣告操作 */
    static final int SizeOf_CThostFtdcExchangeExecOrderActionField=164;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_ExchangeID=0;
    /** 执行宣告操作编号 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_ExecOrderSysID=9;
    /** 操作标志 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_ActionFlag=30;
    /** 操作日期 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_ActionDate=31;
    /** 操作时间 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_ActionTime=40;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_TraderID=49;
    /** 安装编号 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_InstallID=72;
    /** 本地执行宣告编号 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_ExecOrderLocalID=76;
    /** 操作本地编号 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_ActionLocalID=89;
    /** 会员代码 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_ParticipantID=102;
    /** 客户代码 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_ClientID=113;
    /** 业务单元 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_BusinessUnit=124;
    /** 报单操作状态 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_OrderActionStatus=145;
    /** 用户代码 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_UserID=146;
    /** 执行类型 */
    static final int Offset_CThostFtdcExchangeExecOrderActionField_ActionType=162;

    /** 交易所执行宣告操作查询 */
    static final int SizeOf_CThostFtdcQryExchangeExecOrderActionField=52;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryExchangeExecOrderActionField_ParticipantID=0;
    /** 客户代码 */
    static final int Offset_CThostFtdcQryExchangeExecOrderActionField_ClientID=11;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExchangeExecOrderActionField_ExchangeID=22;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQryExchangeExecOrderActionField_TraderID=31;

    /** 错误执行宣告 */
    static final int SizeOf_CThostFtdcErrExecOrderField=208;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcErrExecOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcErrExecOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcErrExecOrderField_InstrumentID=24;
    /** 执行宣告引用 */
    static final int Offset_CThostFtdcErrExecOrderField_ExecOrderRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcErrExecOrderField_UserID=68;
    /** 数量 */
    static final int Offset_CThostFtdcErrExecOrderField_Volume=84;
    /** 请求编号 */
    static final int Offset_CThostFtdcErrExecOrderField_RequestID=88;
    /** 业务单元 */
    static final int Offset_CThostFtdcErrExecOrderField_BusinessUnit=92;
    /** 开平标志 */
    static final int Offset_CThostFtdcErrExecOrderField_OffsetFlag=113;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcErrExecOrderField_HedgeFlag=114;
    /** 执行类型 */
    static final int Offset_CThostFtdcErrExecOrderField_ActionType=115;
    /** 保留头寸申请的持仓方向 */
    static final int Offset_CThostFtdcErrExecOrderField_PosiDirection=116;
    /** 期权行权后是否保留期货头寸的标记 */
    static final int Offset_CThostFtdcErrExecOrderField_ReservePositionFlag=117;
    /** 期权行权后生成的头寸是否自动平仓 */
    static final int Offset_CThostFtdcErrExecOrderField_CloseFlag=118;
    /** 错误代码 */
    static final int Offset_CThostFtdcErrExecOrderField_ErrorID=120;
    /** 错误信息 */
    static final int Offset_CThostFtdcErrExecOrderField_ErrorMsg=124;

    /** 查询错误执行宣告 */
    static final int SizeOf_CThostFtdcQryErrExecOrderField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryErrExecOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryErrExecOrderField_InvestorID=11;

    /** 错误执行宣告操作 */
    static final int SizeOf_CThostFtdcErrExecOrderActionField=224;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcErrExecOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcErrExecOrderActionField_InvestorID=11;
    /** 执行宣告操作引用 */
    static final int Offset_CThostFtdcErrExecOrderActionField_ExecOrderActionRef=24;
    /** 执行宣告引用 */
    static final int Offset_CThostFtdcErrExecOrderActionField_ExecOrderRef=28;
    /** 请求编号 */
    static final int Offset_CThostFtdcErrExecOrderActionField_RequestID=44;
    /** 前置编号 */
    static final int Offset_CThostFtdcErrExecOrderActionField_FrontID=48;
    /** 会话编号 */
    static final int Offset_CThostFtdcErrExecOrderActionField_SessionID=52;
    /** 交易所代码 */
    static final int Offset_CThostFtdcErrExecOrderActionField_ExchangeID=56;
    /** 执行宣告操作编号 */
    static final int Offset_CThostFtdcErrExecOrderActionField_ExecOrderSysID=65;
    /** 操作标志 */
    static final int Offset_CThostFtdcErrExecOrderActionField_ActionFlag=86;
    /** 用户代码 */
    static final int Offset_CThostFtdcErrExecOrderActionField_UserID=87;
    /** 合约代码 */
    static final int Offset_CThostFtdcErrExecOrderActionField_InstrumentID=103;
    /** 错误代码 */
    static final int Offset_CThostFtdcErrExecOrderActionField_ErrorID=136;
    /** 错误信息 */
    static final int Offset_CThostFtdcErrExecOrderActionField_ErrorMsg=140;

    /** 查询错误执行宣告操作 */
    static final int SizeOf_CThostFtdcQryErrExecOrderActionField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryErrExecOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryErrExecOrderActionField_InvestorID=11;

    /** 投资者期权合约交易权限 */
    static final int SizeOf_CThostFtdcOptionInstrTradingRightField=58;
    /** 合约代码 */
    static final int Offset_CThostFtdcOptionInstrTradingRightField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcOptionInstrTradingRightField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcOptionInstrTradingRightField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcOptionInstrTradingRightField_InvestorID=43;
    /** 买卖方向 */
    static final int Offset_CThostFtdcOptionInstrTradingRightField_Direction=56;
    /** 交易权限 */
    static final int Offset_CThostFtdcOptionInstrTradingRightField_TradingRight=57;

    /** 查询期权合约交易权限 */
    static final int SizeOf_CThostFtdcQryOptionInstrTradingRightField=56;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryOptionInstrTradingRightField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryOptionInstrTradingRightField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryOptionInstrTradingRightField_InstrumentID=24;
    /** 买卖方向 */
    static final int Offset_CThostFtdcQryOptionInstrTradingRightField_Direction=55;

    /** 输入的询价 */
    static final int SizeOf_CThostFtdcInputForQuoteField=84;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInputForQuoteField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInputForQuoteField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcInputForQuoteField_InstrumentID=24;
    /** 询价引用 */
    static final int Offset_CThostFtdcInputForQuoteField_ForQuoteRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcInputForQuoteField_UserID=68;

    /** 询价 */
    static final int SizeOf_CThostFtdcForQuoteField=316;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcForQuoteField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcForQuoteField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcForQuoteField_InstrumentID=24;
    /** 询价引用 */
    static final int Offset_CThostFtdcForQuoteField_ForQuoteRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcForQuoteField_UserID=68;
    /** 本地询价编号 */
    static final int Offset_CThostFtdcForQuoteField_ForQuoteLocalID=84;
    /** 交易所代码 */
    static final int Offset_CThostFtdcForQuoteField_ExchangeID=97;
    /** 会员代码 */
    static final int Offset_CThostFtdcForQuoteField_ParticipantID=106;
    /** 客户代码 */
    static final int Offset_CThostFtdcForQuoteField_ClientID=117;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcForQuoteField_ExchangeInstID=128;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcForQuoteField_TraderID=159;
    /** 安装编号 */
    static final int Offset_CThostFtdcForQuoteField_InstallID=180;
    /** 报单日期 */
    static final int Offset_CThostFtdcForQuoteField_InsertDate=184;
    /** 插入时间 */
    static final int Offset_CThostFtdcForQuoteField_InsertTime=193;
    /** 询价状态 */
    static final int Offset_CThostFtdcForQuoteField_ForQuoteStatus=202;
    /** 前置编号 */
    static final int Offset_CThostFtdcForQuoteField_FrontID=204;
    /** 会话编号 */
    static final int Offset_CThostFtdcForQuoteField_SessionID=208;
    /** 状态信息 */
    static final int Offset_CThostFtdcForQuoteField_StatusMsg=212;
    /** 操作用户代码 */
    static final int Offset_CThostFtdcForQuoteField_ActiveUserID=293;
    /** 经纪公司询价编号 */
    static final int Offset_CThostFtdcForQuoteField_BrokerForQutoSeq=312;

    /** 询价查询 */
    static final int SizeOf_CThostFtdcQryForQuoteField=82;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryForQuoteField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryForQuoteField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryForQuoteField_InstrumentID=24;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryForQuoteField_ExchangeID=55;
    /** 开始时间 */
    static final int Offset_CThostFtdcQryForQuoteField_InsertTimeStart=64;
    /** 结束时间 */
    static final int Offset_CThostFtdcQryForQuoteField_InsertTimeEnd=73;

    /** 交易所询价信息 */
    static final int SizeOf_CThostFtdcExchangeForQuoteField=120;
    /** 本地询价编号 */
    static final int Offset_CThostFtdcExchangeForQuoteField_ForQuoteLocalID=0;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeForQuoteField_ExchangeID=13;
    /** 会员代码 */
    static final int Offset_CThostFtdcExchangeForQuoteField_ParticipantID=22;
    /** 客户代码 */
    static final int Offset_CThostFtdcExchangeForQuoteField_ClientID=33;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcExchangeForQuoteField_ExchangeInstID=44;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeForQuoteField_TraderID=75;
    /** 安装编号 */
    static final int Offset_CThostFtdcExchangeForQuoteField_InstallID=96;
    /** 报单日期 */
    static final int Offset_CThostFtdcExchangeForQuoteField_InsertDate=100;
    /** 插入时间 */
    static final int Offset_CThostFtdcExchangeForQuoteField_InsertTime=109;
    /** 询价状态 */
    static final int Offset_CThostFtdcExchangeForQuoteField_ForQuoteStatus=118;

    /** 交易所询价查询 */
    static final int SizeOf_CThostFtdcQryExchangeForQuoteField=83;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryExchangeForQuoteField_ParticipantID=0;
    /** 客户代码 */
    static final int Offset_CThostFtdcQryExchangeForQuoteField_ClientID=11;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcQryExchangeForQuoteField_ExchangeInstID=22;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExchangeForQuoteField_ExchangeID=53;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQryExchangeForQuoteField_TraderID=62;

    /** 输入的报价 */
    static final int SizeOf_CThostFtdcInputQuoteField=192;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInputQuoteField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInputQuoteField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcInputQuoteField_InstrumentID=24;
    /** 报价引用 */
    static final int Offset_CThostFtdcInputQuoteField_QuoteRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcInputQuoteField_UserID=68;
    /** 卖价格 */
    static final int Offset_CThostFtdcInputQuoteField_AskPrice=88;
    /** 买价格 */
    static final int Offset_CThostFtdcInputQuoteField_BidPrice=96;
    /** 卖数量 */
    static final int Offset_CThostFtdcInputQuoteField_AskVolume=104;
    /** 买数量 */
    static final int Offset_CThostFtdcInputQuoteField_BidVolume=108;
    /** 请求编号 */
    static final int Offset_CThostFtdcInputQuoteField_RequestID=112;
    /** 业务单元 */
    static final int Offset_CThostFtdcInputQuoteField_BusinessUnit=116;
    /** 卖开平标志 */
    static final int Offset_CThostFtdcInputQuoteField_AskOffsetFlag=137;
    /** 买开平标志 */
    static final int Offset_CThostFtdcInputQuoteField_BidOffsetFlag=138;
    /** 卖投机套保标志 */
    static final int Offset_CThostFtdcInputQuoteField_AskHedgeFlag=139;
    /** 买投机套保标志 */
    static final int Offset_CThostFtdcInputQuoteField_BidHedgeFlag=140;
    /** 衍生卖报单引用 */
    static final int Offset_CThostFtdcInputQuoteField_AskOrderRef=141;
    /** 衍生买报单引用 */
    static final int Offset_CThostFtdcInputQuoteField_BidOrderRef=154;
    /** 应价编号 */
    static final int Offset_CThostFtdcInputQuoteField_ForQuoteSysID=167;

    /** 输入报价操作 */
    static final int SizeOf_CThostFtdcInputQuoteActionField=136;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInputQuoteActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInputQuoteActionField_InvestorID=11;
    /** 报价操作引用 */
    static final int Offset_CThostFtdcInputQuoteActionField_QuoteActionRef=24;
    /** 报价引用 */
    static final int Offset_CThostFtdcInputQuoteActionField_QuoteRef=28;
    /** 请求编号 */
    static final int Offset_CThostFtdcInputQuoteActionField_RequestID=44;
    /** 前置编号 */
    static final int Offset_CThostFtdcInputQuoteActionField_FrontID=48;
    /** 会话编号 */
    static final int Offset_CThostFtdcInputQuoteActionField_SessionID=52;
    /** 交易所代码 */
    static final int Offset_CThostFtdcInputQuoteActionField_ExchangeID=56;
    /** 报价操作编号 */
    static final int Offset_CThostFtdcInputQuoteActionField_QuoteSysID=65;
    /** 操作标志 */
    static final int Offset_CThostFtdcInputQuoteActionField_ActionFlag=86;
    /** 用户代码 */
    static final int Offset_CThostFtdcInputQuoteActionField_UserID=87;
    /** 合约代码 */
    static final int Offset_CThostFtdcInputQuoteActionField_InstrumentID=103;

    /** 报价 */
    static final int SizeOf_CThostFtdcQuoteField=544;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQuoteField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQuoteField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQuoteField_InstrumentID=24;
    /** 报价引用 */
    static final int Offset_CThostFtdcQuoteField_QuoteRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcQuoteField_UserID=68;
    /** 卖价格 */
    static final int Offset_CThostFtdcQuoteField_AskPrice=88;
    /** 买价格 */
    static final int Offset_CThostFtdcQuoteField_BidPrice=96;
    /** 卖数量 */
    static final int Offset_CThostFtdcQuoteField_AskVolume=104;
    /** 买数量 */
    static final int Offset_CThostFtdcQuoteField_BidVolume=108;
    /** 请求编号 */
    static final int Offset_CThostFtdcQuoteField_RequestID=112;
    /** 业务单元 */
    static final int Offset_CThostFtdcQuoteField_BusinessUnit=116;
    /** 卖开平标志 */
    static final int Offset_CThostFtdcQuoteField_AskOffsetFlag=137;
    /** 买开平标志 */
    static final int Offset_CThostFtdcQuoteField_BidOffsetFlag=138;
    /** 卖投机套保标志 */
    static final int Offset_CThostFtdcQuoteField_AskHedgeFlag=139;
    /** 买投机套保标志 */
    static final int Offset_CThostFtdcQuoteField_BidHedgeFlag=140;
    /** 本地报价编号 */
    static final int Offset_CThostFtdcQuoteField_QuoteLocalID=141;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQuoteField_ExchangeID=154;
    /** 会员代码 */
    static final int Offset_CThostFtdcQuoteField_ParticipantID=163;
    /** 客户代码 */
    static final int Offset_CThostFtdcQuoteField_ClientID=174;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcQuoteField_ExchangeInstID=185;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQuoteField_TraderID=216;
    /** 安装编号 */
    static final int Offset_CThostFtdcQuoteField_InstallID=240;
    /** 报价提示序号 */
    static final int Offset_CThostFtdcQuoteField_NotifySequence=244;
    /** 报价提交状态 */
    static final int Offset_CThostFtdcQuoteField_OrderSubmitStatus=248;
    /** 交易日 */
    static final int Offset_CThostFtdcQuoteField_TradingDay=249;
    /** 结算编号 */
    static final int Offset_CThostFtdcQuoteField_SettlementID=260;
    /** 报价编号 */
    static final int Offset_CThostFtdcQuoteField_QuoteSysID=264;
    /** 报单日期 */
    static final int Offset_CThostFtdcQuoteField_InsertDate=285;
    /** 插入时间 */
    static final int Offset_CThostFtdcQuoteField_InsertTime=294;
    /** 撤销时间 */
    static final int Offset_CThostFtdcQuoteField_CancelTime=303;
    /** 报价状态 */
    static final int Offset_CThostFtdcQuoteField_QuoteStatus=312;
    /** 结算会员编号 */
    static final int Offset_CThostFtdcQuoteField_ClearingPartID=313;
    /** 序号 */
    static final int Offset_CThostFtdcQuoteField_SequenceNo=324;
    /** 卖方报单编号 */
    static final int Offset_CThostFtdcQuoteField_AskOrderSysID=328;
    /** 买方报单编号 */
    static final int Offset_CThostFtdcQuoteField_BidOrderSysID=349;
    /** 前置编号 */
    static final int Offset_CThostFtdcQuoteField_FrontID=372;
    /** 会话编号 */
    static final int Offset_CThostFtdcQuoteField_SessionID=376;
    /** 用户端产品信息 */
    static final int Offset_CThostFtdcQuoteField_UserProductInfo=380;
    /** 状态信息 */
    static final int Offset_CThostFtdcQuoteField_StatusMsg=391;
    /** 操作用户代码 */
    static final int Offset_CThostFtdcQuoteField_ActiveUserID=472;
    /** 经纪公司报价编号 */
    static final int Offset_CThostFtdcQuoteField_BrokerQuoteSeq=488;
    /** 衍生卖报单引用 */
    static final int Offset_CThostFtdcQuoteField_AskOrderRef=492;
    /** 衍生买报单引用 */
    static final int Offset_CThostFtdcQuoteField_BidOrderRef=505;
    /** 应价编号 */
    static final int Offset_CThostFtdcQuoteField_ForQuoteSysID=518;

    /** 报价操作 */
    static final int SizeOf_CThostFtdcQuoteActionField=332;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQuoteActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQuoteActionField_InvestorID=11;
    /** 报价操作引用 */
    static final int Offset_CThostFtdcQuoteActionField_QuoteActionRef=24;
    /** 报价引用 */
    static final int Offset_CThostFtdcQuoteActionField_QuoteRef=28;
    /** 请求编号 */
    static final int Offset_CThostFtdcQuoteActionField_RequestID=44;
    /** 前置编号 */
    static final int Offset_CThostFtdcQuoteActionField_FrontID=48;
    /** 会话编号 */
    static final int Offset_CThostFtdcQuoteActionField_SessionID=52;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQuoteActionField_ExchangeID=56;
    /** 报价操作编号 */
    static final int Offset_CThostFtdcQuoteActionField_QuoteSysID=65;
    /** 操作标志 */
    static final int Offset_CThostFtdcQuoteActionField_ActionFlag=86;
    /** 操作日期 */
    static final int Offset_CThostFtdcQuoteActionField_ActionDate=87;
    /** 操作时间 */
    static final int Offset_CThostFtdcQuoteActionField_ActionTime=96;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQuoteActionField_TraderID=105;
    /** 安装编号 */
    static final int Offset_CThostFtdcQuoteActionField_InstallID=128;
    /** 本地报价编号 */
    static final int Offset_CThostFtdcQuoteActionField_QuoteLocalID=132;
    /** 操作本地编号 */
    static final int Offset_CThostFtdcQuoteActionField_ActionLocalID=145;
    /** 会员代码 */
    static final int Offset_CThostFtdcQuoteActionField_ParticipantID=158;
    /** 客户代码 */
    static final int Offset_CThostFtdcQuoteActionField_ClientID=169;
    /** 业务单元 */
    static final int Offset_CThostFtdcQuoteActionField_BusinessUnit=180;
    /** 报单操作状态 */
    static final int Offset_CThostFtdcQuoteActionField_OrderActionStatus=201;
    /** 用户代码 */
    static final int Offset_CThostFtdcQuoteActionField_UserID=202;
    /** 状态信息 */
    static final int Offset_CThostFtdcQuoteActionField_StatusMsg=218;
    /** 合约代码 */
    static final int Offset_CThostFtdcQuoteActionField_InstrumentID=299;

    /** 报价查询 */
    static final int SizeOf_CThostFtdcQryQuoteField=103;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryQuoteField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryQuoteField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryQuoteField_InstrumentID=24;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryQuoteField_ExchangeID=55;
    /** 报价编号 */
    static final int Offset_CThostFtdcQryQuoteField_QuoteSysID=64;
    /** 开始时间 */
    static final int Offset_CThostFtdcQryQuoteField_InsertTimeStart=85;
    /** 结束时间 */
    static final int Offset_CThostFtdcQryQuoteField_InsertTimeEnd=94;

    /** 交易所报价信息 */
    static final int SizeOf_CThostFtdcExchangeQuoteField=304;
    /** 卖价格 */
    static final int Offset_CThostFtdcExchangeQuoteField_AskPrice=0;
    /** 买价格 */
    static final int Offset_CThostFtdcExchangeQuoteField_BidPrice=8;
    /** 卖数量 */
    static final int Offset_CThostFtdcExchangeQuoteField_AskVolume=16;
    /** 买数量 */
    static final int Offset_CThostFtdcExchangeQuoteField_BidVolume=20;
    /** 请求编号 */
    static final int Offset_CThostFtdcExchangeQuoteField_RequestID=24;
    /** 业务单元 */
    static final int Offset_CThostFtdcExchangeQuoteField_BusinessUnit=28;
    /** 卖开平标志 */
    static final int Offset_CThostFtdcExchangeQuoteField_AskOffsetFlag=49;
    /** 买开平标志 */
    static final int Offset_CThostFtdcExchangeQuoteField_BidOffsetFlag=50;
    /** 卖投机套保标志 */
    static final int Offset_CThostFtdcExchangeQuoteField_AskHedgeFlag=51;
    /** 买投机套保标志 */
    static final int Offset_CThostFtdcExchangeQuoteField_BidHedgeFlag=52;
    /** 本地报价编号 */
    static final int Offset_CThostFtdcExchangeQuoteField_QuoteLocalID=53;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeQuoteField_ExchangeID=66;
    /** 会员代码 */
    static final int Offset_CThostFtdcExchangeQuoteField_ParticipantID=75;
    /** 客户代码 */
    static final int Offset_CThostFtdcExchangeQuoteField_ClientID=86;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcExchangeQuoteField_ExchangeInstID=97;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeQuoteField_TraderID=128;
    /** 安装编号 */
    static final int Offset_CThostFtdcExchangeQuoteField_InstallID=152;
    /** 报价提示序号 */
    static final int Offset_CThostFtdcExchangeQuoteField_NotifySequence=156;
    /** 报价提交状态 */
    static final int Offset_CThostFtdcExchangeQuoteField_OrderSubmitStatus=160;
    /** 交易日 */
    static final int Offset_CThostFtdcExchangeQuoteField_TradingDay=161;
    /** 结算编号 */
    static final int Offset_CThostFtdcExchangeQuoteField_SettlementID=172;
    /** 报价编号 */
    static final int Offset_CThostFtdcExchangeQuoteField_QuoteSysID=176;
    /** 报单日期 */
    static final int Offset_CThostFtdcExchangeQuoteField_InsertDate=197;
    /** 插入时间 */
    static final int Offset_CThostFtdcExchangeQuoteField_InsertTime=206;
    /** 撤销时间 */
    static final int Offset_CThostFtdcExchangeQuoteField_CancelTime=215;
    /** 报价状态 */
    static final int Offset_CThostFtdcExchangeQuoteField_QuoteStatus=224;
    /** 结算会员编号 */
    static final int Offset_CThostFtdcExchangeQuoteField_ClearingPartID=225;
    /** 序号 */
    static final int Offset_CThostFtdcExchangeQuoteField_SequenceNo=236;
    /** 卖方报单编号 */
    static final int Offset_CThostFtdcExchangeQuoteField_AskOrderSysID=240;
    /** 买方报单编号 */
    static final int Offset_CThostFtdcExchangeQuoteField_BidOrderSysID=261;
    /** 应价编号 */
    static final int Offset_CThostFtdcExchangeQuoteField_ForQuoteSysID=282;

    /** 交易所报价查询 */
    static final int SizeOf_CThostFtdcQryExchangeQuoteField=83;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryExchangeQuoteField_ParticipantID=0;
    /** 客户代码 */
    static final int Offset_CThostFtdcQryExchangeQuoteField_ClientID=11;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcQryExchangeQuoteField_ExchangeInstID=22;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExchangeQuoteField_ExchangeID=53;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQryExchangeQuoteField_TraderID=62;

    /** 报价操作查询 */
    static final int SizeOf_CThostFtdcQryQuoteActionField=33;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryQuoteActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryQuoteActionField_InvestorID=11;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryQuoteActionField_ExchangeID=24;

    /** 交易所报价操作 */
    static final int SizeOf_CThostFtdcExchangeQuoteActionField=164;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_ExchangeID=0;
    /** 报价操作编号 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_QuoteSysID=9;
    /** 操作标志 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_ActionFlag=30;
    /** 操作日期 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_ActionDate=31;
    /** 操作时间 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_ActionTime=40;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_TraderID=49;
    /** 安装编号 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_InstallID=72;
    /** 本地报价编号 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_QuoteLocalID=76;
    /** 操作本地编号 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_ActionLocalID=89;
    /** 会员代码 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_ParticipantID=102;
    /** 客户代码 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_ClientID=113;
    /** 业务单元 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_BusinessUnit=124;
    /** 报单操作状态 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_OrderActionStatus=145;
    /** 用户代码 */
    static final int Offset_CThostFtdcExchangeQuoteActionField_UserID=146;

    /** 交易所报价操作查询 */
    static final int SizeOf_CThostFtdcQryExchangeQuoteActionField=52;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryExchangeQuoteActionField_ParticipantID=0;
    /** 客户代码 */
    static final int Offset_CThostFtdcQryExchangeQuoteActionField_ClientID=11;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExchangeQuoteActionField_ExchangeID=22;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQryExchangeQuoteActionField_TraderID=31;

    /** 期权合约delta值 */
    static final int SizeOf_CThostFtdcOptionInstrDeltaField=64;
    /** 合约代码 */
    static final int Offset_CThostFtdcOptionInstrDeltaField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcOptionInstrDeltaField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcOptionInstrDeltaField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcOptionInstrDeltaField_InvestorID=43;
    /** Delta值 */
    static final int Offset_CThostFtdcOptionInstrDeltaField_Delta=56;

    /** 发给做市商的询价请求 */
    static final int SizeOf_CThostFtdcForQuoteRspField=88;
    /** 交易日 */
    static final int Offset_CThostFtdcForQuoteRspField_TradingDay=0;
    /** 合约代码 */
    static final int Offset_CThostFtdcForQuoteRspField_InstrumentID=9;
    /** 询价编号 */
    static final int Offset_CThostFtdcForQuoteRspField_ForQuoteSysID=40;
    /** 询价时间 */
    static final int Offset_CThostFtdcForQuoteRspField_ForQuoteTime=61;
    /** 业务日期 */
    static final int Offset_CThostFtdcForQuoteRspField_ActionDay=70;
    /** 交易所代码 */
    static final int Offset_CThostFtdcForQuoteRspField_ExchangeID=79;

    /** 当前期权合约执行偏移值的详细内容 */
    static final int SizeOf_CThostFtdcStrikeOffsetField=64;
    /** 合约代码 */
    static final int Offset_CThostFtdcStrikeOffsetField_InstrumentID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcStrikeOffsetField_InvestorRange=31;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcStrikeOffsetField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcStrikeOffsetField_InvestorID=43;
    /** 执行偏移值 */
    static final int Offset_CThostFtdcStrikeOffsetField_Offset=56;

    /** 期权执行偏移值查询 */
    static final int SizeOf_CThostFtdcQryStrikeOffsetField=55;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryStrikeOffsetField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryStrikeOffsetField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryStrikeOffsetField_InstrumentID=24;

    /** 组合合约安全系数 */
    static final int SizeOf_CThostFtdcCombInstrumentGuardField=56;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcCombInstrumentGuardField_BrokerID=0;
    /** 合约代码 */
    static final int Offset_CThostFtdcCombInstrumentGuardField_InstrumentID=11;
    /** /// */
    static final int Offset_CThostFtdcCombInstrumentGuardField_GuarantRatio=48;

    /** 组合合约安全系数查询 */
    static final int SizeOf_CThostFtdcQryCombInstrumentGuardField=42;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryCombInstrumentGuardField_BrokerID=0;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryCombInstrumentGuardField_InstrumentID=11;

    /** 输入的申请组合 */
    static final int SizeOf_CThostFtdcInputCombActionField=96;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInputCombActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInputCombActionField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcInputCombActionField_InstrumentID=24;
    /** 组合引用 */
    static final int Offset_CThostFtdcInputCombActionField_CombActionRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcInputCombActionField_UserID=68;
    /** 买卖方向 */
    static final int Offset_CThostFtdcInputCombActionField_Direction=84;
    /** 数量 */
    static final int Offset_CThostFtdcInputCombActionField_Volume=88;
    /** 组合指令方向 */
    static final int Offset_CThostFtdcInputCombActionField_CombDirection=92;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcInputCombActionField_HedgeFlag=93;

    /** 申请组合 */
    static final int SizeOf_CThostFtdcCombActionField=324;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcCombActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcCombActionField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcCombActionField_InstrumentID=24;
    /** 组合引用 */
    static final int Offset_CThostFtdcCombActionField_CombActionRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcCombActionField_UserID=68;
    /** 买卖方向 */
    static final int Offset_CThostFtdcCombActionField_Direction=84;
    /** 数量 */
    static final int Offset_CThostFtdcCombActionField_Volume=88;
    /** 组合指令方向 */
    static final int Offset_CThostFtdcCombActionField_CombDirection=92;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcCombActionField_HedgeFlag=93;
    /** 本地申请组合编号 */
    static final int Offset_CThostFtdcCombActionField_ActionLocalID=94;
    /** 交易所代码 */
    static final int Offset_CThostFtdcCombActionField_ExchangeID=107;
    /** 会员代码 */
    static final int Offset_CThostFtdcCombActionField_ParticipantID=116;
    /** 客户代码 */
    static final int Offset_CThostFtdcCombActionField_ClientID=127;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcCombActionField_ExchangeInstID=138;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcCombActionField_TraderID=169;
    /** 安装编号 */
    static final int Offset_CThostFtdcCombActionField_InstallID=192;
    /** 组合状态 */
    static final int Offset_CThostFtdcCombActionField_ActionStatus=196;
    /** 报单提示序号 */
    static final int Offset_CThostFtdcCombActionField_NotifySequence=200;
    /** 交易日 */
    static final int Offset_CThostFtdcCombActionField_TradingDay=204;
    /** 结算编号 */
    static final int Offset_CThostFtdcCombActionField_SettlementID=216;
    /** 序号 */
    static final int Offset_CThostFtdcCombActionField_SequenceNo=220;
    /** 前置编号 */
    static final int Offset_CThostFtdcCombActionField_FrontID=224;
    /** 会话编号 */
    static final int Offset_CThostFtdcCombActionField_SessionID=228;
    /** 用户端产品信息 */
    static final int Offset_CThostFtdcCombActionField_UserProductInfo=232;
    /** 状态信息 */
    static final int Offset_CThostFtdcCombActionField_StatusMsg=243;

    /** 申请组合查询 */
    static final int SizeOf_CThostFtdcQryCombActionField=64;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryCombActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryCombActionField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryCombActionField_InstrumentID=24;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryCombActionField_ExchangeID=55;

    /** 交易所申请组合信息 */
    static final int SizeOf_CThostFtdcExchangeCombActionField=140;
    /** 买卖方向 */
    static final int Offset_CThostFtdcExchangeCombActionField_Direction=0;
    /** 数量 */
    static final int Offset_CThostFtdcExchangeCombActionField_Volume=4;
    /** 组合指令方向 */
    static final int Offset_CThostFtdcExchangeCombActionField_CombDirection=8;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcExchangeCombActionField_HedgeFlag=9;
    /** 本地申请组合编号 */
    static final int Offset_CThostFtdcExchangeCombActionField_ActionLocalID=10;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeCombActionField_ExchangeID=23;
    /** 会员代码 */
    static final int Offset_CThostFtdcExchangeCombActionField_ParticipantID=32;
    /** 客户代码 */
    static final int Offset_CThostFtdcExchangeCombActionField_ClientID=43;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcExchangeCombActionField_ExchangeInstID=54;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcExchangeCombActionField_TraderID=85;
    /** 安装编号 */
    static final int Offset_CThostFtdcExchangeCombActionField_InstallID=108;
    /** 组合状态 */
    static final int Offset_CThostFtdcExchangeCombActionField_ActionStatus=112;
    /** 报单提示序号 */
    static final int Offset_CThostFtdcExchangeCombActionField_NotifySequence=116;
    /** 交易日 */
    static final int Offset_CThostFtdcExchangeCombActionField_TradingDay=120;
    /** 结算编号 */
    static final int Offset_CThostFtdcExchangeCombActionField_SettlementID=132;
    /** 序号 */
    static final int Offset_CThostFtdcExchangeCombActionField_SequenceNo=136;

    /** 交易所申请组合查询 */
    static final int SizeOf_CThostFtdcQryExchangeCombActionField=83;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryExchangeCombActionField_ParticipantID=0;
    /** 客户代码 */
    static final int Offset_CThostFtdcQryExchangeCombActionField_ClientID=11;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcQryExchangeCombActionField_ExchangeInstID=22;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExchangeCombActionField_ExchangeID=53;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQryExchangeCombActionField_TraderID=62;

    /** 产品报价汇率 */
    static final int SizeOf_CThostFtdcProductExchRateField=48;
    /** 产品代码 */
    static final int Offset_CThostFtdcProductExchRateField_ProductID=0;
    /** 报价币种类型 */
    static final int Offset_CThostFtdcProductExchRateField_QuoteCurrencyID=31;
    /** 汇率 */
    static final int Offset_CThostFtdcProductExchRateField_ExchangeRate=40;

    /** 产品报价汇率查询 */
    static final int SizeOf_CThostFtdcQryProductExchRateField=31;
    /** 产品代码 */
    static final int Offset_CThostFtdcQryProductExchRateField_ProductID=0;

    /** 市场行情 */
    static final int SizeOf_CThostFtdcMarketDataField=240;
    /** 交易日 */
    static final int Offset_CThostFtdcMarketDataField_TradingDay=0;
    /** 合约代码 */
    static final int Offset_CThostFtdcMarketDataField_InstrumentID=9;
    /** 交易所代码 */
    static final int Offset_CThostFtdcMarketDataField_ExchangeID=40;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcMarketDataField_ExchangeInstID=49;
    /** 最新价 */
    static final int Offset_CThostFtdcMarketDataField_LastPrice=80;
    /** 上次结算价 */
    static final int Offset_CThostFtdcMarketDataField_PreSettlementPrice=88;
    /** 昨收盘 */
    static final int Offset_CThostFtdcMarketDataField_PreClosePrice=96;
    /** 昨持仓量 */
    static final int Offset_CThostFtdcMarketDataField_PreOpenInterest=104;
    /** 今开盘 */
    static final int Offset_CThostFtdcMarketDataField_OpenPrice=112;
    /** 最高价 */
    static final int Offset_CThostFtdcMarketDataField_HighestPrice=120;
    /** 最低价 */
    static final int Offset_CThostFtdcMarketDataField_LowestPrice=128;
    /** 数量 */
    static final int Offset_CThostFtdcMarketDataField_Volume=136;
    /** 成交金额 */
    static final int Offset_CThostFtdcMarketDataField_Turnover=144;
    /** 持仓量 */
    static final int Offset_CThostFtdcMarketDataField_OpenInterest=152;
    /** 今收盘 */
    static final int Offset_CThostFtdcMarketDataField_ClosePrice=160;
    /** 本次结算价 */
    static final int Offset_CThostFtdcMarketDataField_SettlementPrice=168;
    /** 涨停板价 */
    static final int Offset_CThostFtdcMarketDataField_UpperLimitPrice=176;
    /** 跌停板价 */
    static final int Offset_CThostFtdcMarketDataField_LowerLimitPrice=184;
    /** 昨虚实度 */
    static final int Offset_CThostFtdcMarketDataField_PreDelta=192;
    /** 今虚实度 */
    static final int Offset_CThostFtdcMarketDataField_CurrDelta=200;
    /** 最后修改时间 */
    static final int Offset_CThostFtdcMarketDataField_UpdateTime=208;
    /** 最后修改毫秒 */
    static final int Offset_CThostFtdcMarketDataField_UpdateMillisec=220;
    /** 业务日期 */
    static final int Offset_CThostFtdcMarketDataField_ActionDay=224;

    /** 行情基础属性 */
    static final int SizeOf_CThostFtdcMarketDataBaseField=48;
    /** 交易日 */
    static final int Offset_CThostFtdcMarketDataBaseField_TradingDay=0;
    /** 上次结算价 */
    static final int Offset_CThostFtdcMarketDataBaseField_PreSettlementPrice=16;
    /** 昨收盘 */
    static final int Offset_CThostFtdcMarketDataBaseField_PreClosePrice=24;
    /** 昨持仓量 */
    static final int Offset_CThostFtdcMarketDataBaseField_PreOpenInterest=32;
    /** 昨虚实度 */
    static final int Offset_CThostFtdcMarketDataBaseField_PreDelta=40;

    /** 行情静态属性 */
    static final int SizeOf_CThostFtdcMarketDataStaticField=64;
    /** 今开盘 */
    static final int Offset_CThostFtdcMarketDataStaticField_OpenPrice=0;
    /** 最高价 */
    static final int Offset_CThostFtdcMarketDataStaticField_HighestPrice=8;
    /** 最低价 */
    static final int Offset_CThostFtdcMarketDataStaticField_LowestPrice=16;
    /** 今收盘 */
    static final int Offset_CThostFtdcMarketDataStaticField_ClosePrice=24;
    /** 涨停板价 */
    static final int Offset_CThostFtdcMarketDataStaticField_UpperLimitPrice=32;
    /** 跌停板价 */
    static final int Offset_CThostFtdcMarketDataStaticField_LowerLimitPrice=40;
    /** 本次结算价 */
    static final int Offset_CThostFtdcMarketDataStaticField_SettlementPrice=48;
    /** 今虚实度 */
    static final int Offset_CThostFtdcMarketDataStaticField_CurrDelta=56;

    /** 行情最新成交属性 */
    static final int SizeOf_CThostFtdcMarketDataLastMatchField=32;
    /** 最新价 */
    static final int Offset_CThostFtdcMarketDataLastMatchField_LastPrice=0;
    /** 数量 */
    static final int Offset_CThostFtdcMarketDataLastMatchField_Volume=8;
    /** 成交金额 */
    static final int Offset_CThostFtdcMarketDataLastMatchField_Turnover=16;
    /** 持仓量 */
    static final int Offset_CThostFtdcMarketDataLastMatchField_OpenInterest=24;

    /** 行情最优价属性 */
    static final int SizeOf_CThostFtdcMarketDataBestPriceField=32;
    /** 申买价一 */
    static final int Offset_CThostFtdcMarketDataBestPriceField_BidPrice1=0;
    /** 申买量一 */
    static final int Offset_CThostFtdcMarketDataBestPriceField_BidVolume1=8;
    /** 申卖价一 */
    static final int Offset_CThostFtdcMarketDataBestPriceField_AskPrice1=16;
    /** 申卖量一 */
    static final int Offset_CThostFtdcMarketDataBestPriceField_AskVolume1=24;

    /** 行情申买二、三属性 */
    static final int SizeOf_CThostFtdcMarketDataBid23Field=32;
    /** 申买价二 */
    static final int Offset_CThostFtdcMarketDataBid23Field_BidPrice2=0;
    /** 申买量二 */
    static final int Offset_CThostFtdcMarketDataBid23Field_BidVolume2=8;
    /** 申买价三 */
    static final int Offset_CThostFtdcMarketDataBid23Field_BidPrice3=16;
    /** 申买量三 */
    static final int Offset_CThostFtdcMarketDataBid23Field_BidVolume3=24;

    /** 行情申卖二、三属性 */
    static final int SizeOf_CThostFtdcMarketDataAsk23Field=32;
    /** 申卖价二 */
    static final int Offset_CThostFtdcMarketDataAsk23Field_AskPrice2=0;
    /** 申卖量二 */
    static final int Offset_CThostFtdcMarketDataAsk23Field_AskVolume2=8;
    /** 申卖价三 */
    static final int Offset_CThostFtdcMarketDataAsk23Field_AskPrice3=16;
    /** 申卖量三 */
    static final int Offset_CThostFtdcMarketDataAsk23Field_AskVolume3=24;

    /** 行情申买四、五属性 */
    static final int SizeOf_CThostFtdcMarketDataBid45Field=32;
    /** 申买价四 */
    static final int Offset_CThostFtdcMarketDataBid45Field_BidPrice4=0;
    /** 申买量四 */
    static final int Offset_CThostFtdcMarketDataBid45Field_BidVolume4=8;
    /** 申买价五 */
    static final int Offset_CThostFtdcMarketDataBid45Field_BidPrice5=16;
    /** 申买量五 */
    static final int Offset_CThostFtdcMarketDataBid45Field_BidVolume5=24;

    /** 行情申卖四、五属性 */
    static final int SizeOf_CThostFtdcMarketDataAsk45Field=32;
    /** 申卖价四 */
    static final int Offset_CThostFtdcMarketDataAsk45Field_AskPrice4=0;
    /** 申卖量四 */
    static final int Offset_CThostFtdcMarketDataAsk45Field_AskVolume4=8;
    /** 申卖价五 */
    static final int Offset_CThostFtdcMarketDataAsk45Field_AskPrice5=16;
    /** 申卖量五 */
    static final int Offset_CThostFtdcMarketDataAsk45Field_AskVolume5=24;

    /** 行情更新时间属性 */
    static final int SizeOf_CThostFtdcMarketDataUpdateTimeField=56;
    /** 合约代码 */
    static final int Offset_CThostFtdcMarketDataUpdateTimeField_InstrumentID=0;
    /** 最后修改时间 */
    static final int Offset_CThostFtdcMarketDataUpdateTimeField_UpdateTime=31;
    /** 最后修改毫秒 */
    static final int Offset_CThostFtdcMarketDataUpdateTimeField_UpdateMillisec=40;
    /** 业务日期 */
    static final int Offset_CThostFtdcMarketDataUpdateTimeField_ActionDay=44;

    /** 行情交易所代码属性 */
    static final int SizeOf_CThostFtdcMarketDataExchangeField=9;
    /** 交易所代码 */
    static final int Offset_CThostFtdcMarketDataExchangeField_ExchangeID=0;

    /** 指定的合约 */
    static final int SizeOf_CThostFtdcSpecificInstrumentField=31;
    /** 合约代码 */
    static final int Offset_CThostFtdcSpecificInstrumentField_InstrumentID=0;

    /** 合约状态 */
    static final int SizeOf_CThostFtdcInstrumentStatusField=100;
    /** 交易所代码 */
    static final int Offset_CThostFtdcInstrumentStatusField_ExchangeID=0;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcInstrumentStatusField_ExchangeInstID=9;
    /** 结算组代码 */
    static final int Offset_CThostFtdcInstrumentStatusField_SettlementGroupID=40;
    /** 合约代码 */
    static final int Offset_CThostFtdcInstrumentStatusField_InstrumentID=49;
    /** 合约交易状态 */
    static final int Offset_CThostFtdcInstrumentStatusField_InstrumentStatus=80;
    /** 交易阶段编号 */
    static final int Offset_CThostFtdcInstrumentStatusField_TradingSegmentSN=84;
    /** 进入本状态时间 */
    static final int Offset_CThostFtdcInstrumentStatusField_EnterTime=88;
    /** 进入本状态原因 */
    static final int Offset_CThostFtdcInstrumentStatusField_EnterReason=97;

    /** 查询合约状态 */
    static final int SizeOf_CThostFtdcQryInstrumentStatusField=40;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryInstrumentStatusField_ExchangeID=0;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcQryInstrumentStatusField_ExchangeInstID=9;

    /** 投资者账户 */
    static final int SizeOf_CThostFtdcInvestorAccountField=41;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInvestorAccountField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInvestorAccountField_InvestorID=11;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcInvestorAccountField_AccountID=24;
    /** 币种代码 */
    static final int Offset_CThostFtdcInvestorAccountField_CurrencyID=37;

    /** 浮动盈亏算法 */
    static final int SizeOf_CThostFtdcPositionProfitAlgorithmField=190;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcPositionProfitAlgorithmField_BrokerID=0;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcPositionProfitAlgorithmField_AccountID=11;
    /** 盈亏算法 */
    static final int Offset_CThostFtdcPositionProfitAlgorithmField_Algorithm=24;
    /** 备注 */
    static final int Offset_CThostFtdcPositionProfitAlgorithmField_Memo=25;
    /** 币种代码 */
    static final int Offset_CThostFtdcPositionProfitAlgorithmField_CurrencyID=186;

    /** 会员资金折扣 */
    static final int SizeOf_CThostFtdcDiscountField=40;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcDiscountField_BrokerID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcDiscountField_InvestorRange=11;
    /** 投资者代码 */
    static final int Offset_CThostFtdcDiscountField_InvestorID=12;
    /** 资金折扣比例 */
    static final int Offset_CThostFtdcDiscountField_Discount=32;

    /** 查询转帐银行 */
    static final int SizeOf_CThostFtdcQryTransferBankField=9;
    /** 银行代码 */
    static final int Offset_CThostFtdcQryTransferBankField_BankID=0;
    /** 银行分中心代码 */
    static final int Offset_CThostFtdcQryTransferBankField_BankBrchID=4;

    /** 转帐银行 */
    static final int SizeOf_CThostFtdcTransferBankField=116;
    /** 银行代码 */
    static final int Offset_CThostFtdcTransferBankField_BankID=0;
    /** 银行分中心代码 */
    static final int Offset_CThostFtdcTransferBankField_BankBrchID=4;
    /** 银行名称 */
    static final int Offset_CThostFtdcTransferBankField_BankName=9;
    /** 是否活跃 */
    static final int Offset_CThostFtdcTransferBankField_IsActive=112;

    /** 查询投资者持仓明细 */
    static final int SizeOf_CThostFtdcQryInvestorPositionDetailField=55;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryInvestorPositionDetailField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryInvestorPositionDetailField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryInvestorPositionDetailField_InstrumentID=24;

    /** 投资者持仓明细 */
    static final int SizeOf_CThostFtdcInvestorPositionDetailField=264;
    /** 合约代码 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_InstrumentID=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_BrokerID=31;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_InvestorID=42;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_HedgeFlag=55;
    /** 买卖 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_Direction=56;
    /** 开仓日期 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_OpenDate=57;
    /** 成交编号 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_TradeID=66;
    /** 数量 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_Volume=88;
    /** 开仓价 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_OpenPrice=96;
    /** 交易日 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_TradingDay=104;
    /** 结算编号 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_SettlementID=116;
    /** 成交类型 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_TradeType=120;
    /** 组合合约代码 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_CombInstrumentID=121;
    /** 交易所代码 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_ExchangeID=152;
    /** 逐日盯市平仓盈亏 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_CloseProfitByDate=168;
    /** 逐笔对冲平仓盈亏 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_CloseProfitByTrade=176;
    /** 逐日盯市持仓盈亏 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_PositionProfitByDate=184;
    /** 逐笔对冲持仓盈亏 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_PositionProfitByTrade=192;
    /** 投资者保证金 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_Margin=200;
    /** 交易所保证金 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_ExchMargin=208;
    /** 保证金率 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_MarginRateByMoney=216;
    /** 保证金率(按手数) */
    static final int Offset_CThostFtdcInvestorPositionDetailField_MarginRateByVolume=224;
    /** 昨结算价 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_LastSettlementPrice=232;
    /** 结算价 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_SettlementPrice=240;
    /** 平仓量 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_CloseVolume=248;
    /** 平仓金额 */
    static final int Offset_CThostFtdcInvestorPositionDetailField_CloseAmount=256;

    /** 资金账户口令域 */
    static final int SizeOf_CThostFtdcTradingAccountPasswordField=69;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcTradingAccountPasswordField_BrokerID=0;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcTradingAccountPasswordField_AccountID=11;
    /** 密码 */
    static final int Offset_CThostFtdcTradingAccountPasswordField_Password=24;
    /** 币种代码 */
    static final int Offset_CThostFtdcTradingAccountPasswordField_CurrencyID=65;

    /** 交易所行情报盘机 */
    static final int SizeOf_CThostFtdcMDTraderOfferField=224;
    /** 交易所代码 */
    static final int Offset_CThostFtdcMDTraderOfferField_ExchangeID=0;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcMDTraderOfferField_TraderID=9;
    /** 会员代码 */
    static final int Offset_CThostFtdcMDTraderOfferField_ParticipantID=30;
    /** 密码 */
    static final int Offset_CThostFtdcMDTraderOfferField_Password=41;
    /** 安装编号 */
    static final int Offset_CThostFtdcMDTraderOfferField_InstallID=84;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcMDTraderOfferField_OrderLocalID=88;
    /** 交易所交易员连接状态 */
    static final int Offset_CThostFtdcMDTraderOfferField_TraderConnectStatus=101;
    /** 发出连接请求的日期 */
    static final int Offset_CThostFtdcMDTraderOfferField_ConnectRequestDate=102;
    /** 发出连接请求的时间 */
    static final int Offset_CThostFtdcMDTraderOfferField_ConnectRequestTime=111;
    /** 上次报告日期 */
    static final int Offset_CThostFtdcMDTraderOfferField_LastReportDate=120;
    /** 上次报告时间 */
    static final int Offset_CThostFtdcMDTraderOfferField_LastReportTime=129;
    /** 完成连接日期 */
    static final int Offset_CThostFtdcMDTraderOfferField_ConnectDate=138;
    /** 完成连接时间 */
    static final int Offset_CThostFtdcMDTraderOfferField_ConnectTime=147;
    /** 启动日期 */
    static final int Offset_CThostFtdcMDTraderOfferField_StartDate=156;
    /** 启动时间 */
    static final int Offset_CThostFtdcMDTraderOfferField_StartTime=165;
    /** 交易日 */
    static final int Offset_CThostFtdcMDTraderOfferField_TradingDay=174;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcMDTraderOfferField_BrokerID=183;
    /** 本席位最大成交编号 */
    static final int Offset_CThostFtdcMDTraderOfferField_MaxTradeID=194;
    /** 本席位最大报单备拷 */
    static final int Offset_CThostFtdcMDTraderOfferField_MaxOrderMessageReference=215;

    /** 查询行情报盘机 */
    static final int SizeOf_CThostFtdcQryMDTraderOfferField=41;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryMDTraderOfferField_ExchangeID=0;
    /** 会员代码 */
    static final int Offset_CThostFtdcQryMDTraderOfferField_ParticipantID=9;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcQryMDTraderOfferField_TraderID=20;

    /** 查询客户通知 */
    static final int SizeOf_CThostFtdcQryNoticeField=11;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryNoticeField_BrokerID=0;

    /** 客户通知 */
    static final int SizeOf_CThostFtdcNoticeField=514;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcNoticeField_BrokerID=0;
    /** 消息正文 */
    static final int Offset_CThostFtdcNoticeField_Content=11;
    /** 经纪公司通知内容序列号 */
    static final int Offset_CThostFtdcNoticeField_SequenceLabel=512;

    /** 用户权限 */
    static final int SizeOf_CThostFtdcUserRightField=32;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcUserRightField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcUserRightField_UserID=11;
    /** 客户权限类型 */
    static final int Offset_CThostFtdcUserRightField_UserRightType=27;
    /** 是否禁止 */
    static final int Offset_CThostFtdcUserRightField_IsForbidden=28;

    /** 查询结算信息确认域 */
    static final int SizeOf_CThostFtdcQrySettlementInfoConfirmField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQrySettlementInfoConfirmField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQrySettlementInfoConfirmField_InvestorID=11;

    /** 装载结算信息 */
    static final int SizeOf_CThostFtdcLoadSettlementInfoField=11;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcLoadSettlementInfoField_BrokerID=0;

    /** 经纪公司可提资金算法表 */
    static final int SizeOf_CThostFtdcBrokerWithdrawAlgorithmField=56;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcBrokerWithdrawAlgorithmField_BrokerID=0;
    /** 可提资金算法 */
    static final int Offset_CThostFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm=11;
    /** 资金使用率 */
    static final int Offset_CThostFtdcBrokerWithdrawAlgorithmField_UsingRatio=16;
    /** 可提是否包含平仓盈利 */
    static final int Offset_CThostFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit=24;
    /** 本日无仓且无成交客户是否受可提比例限制 */
    static final int Offset_CThostFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade=25;
    /** 可用是否包含平仓盈利 */
    static final int Offset_CThostFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit=26;
    /** 是否启用用户事件 */
    static final int Offset_CThostFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent=28;
    /** 币种代码 */
    static final int Offset_CThostFtdcBrokerWithdrawAlgorithmField_CurrencyID=32;
    /** 货币质押比率 */
    static final int Offset_CThostFtdcBrokerWithdrawAlgorithmField_FundMortgageRatio=40;
    /** 权益算法 */
    static final int Offset_CThostFtdcBrokerWithdrawAlgorithmField_BalanceAlgorithm=48;

    /** 资金账户口令变更域 */
    static final int SizeOf_CThostFtdcTradingAccountPasswordUpdateV1Field=106;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcTradingAccountPasswordUpdateV1Field_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcTradingAccountPasswordUpdateV1Field_InvestorID=11;
    /** 原来的口令 */
    static final int Offset_CThostFtdcTradingAccountPasswordUpdateV1Field_OldPassword=24;
    /** 新的口令 */
    static final int Offset_CThostFtdcTradingAccountPasswordUpdateV1Field_NewPassword=65;

    /** 资金账户口令变更域 */
    static final int SizeOf_CThostFtdcTradingAccountPasswordUpdateField=110;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcTradingAccountPasswordUpdateField_BrokerID=0;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcTradingAccountPasswordUpdateField_AccountID=11;
    /** 原来的口令 */
    static final int Offset_CThostFtdcTradingAccountPasswordUpdateField_OldPassword=24;
    /** 新的口令 */
    static final int Offset_CThostFtdcTradingAccountPasswordUpdateField_NewPassword=65;
    /** 币种代码 */
    static final int Offset_CThostFtdcTradingAccountPasswordUpdateField_CurrencyID=106;

    /** 查询组合合约分腿 */
    static final int SizeOf_CThostFtdcQryCombinationLegField=68;
    /** 组合合约代码 */
    static final int Offset_CThostFtdcQryCombinationLegField_CombInstrumentID=0;
    /** 单腿编号 */
    static final int Offset_CThostFtdcQryCombinationLegField_LegID=32;
    /** 单腿合约代码 */
    static final int Offset_CThostFtdcQryCombinationLegField_LegInstrumentID=36;

    /** 查询组合合约分腿 */
    static final int SizeOf_CThostFtdcQrySyncStatusField=9;
    /** 交易日 */
    static final int Offset_CThostFtdcQrySyncStatusField_TradingDay=0;

    /** 组合交易合约的单腿 */
    static final int SizeOf_CThostFtdcCombinationLegField=76;
    /** 组合合约代码 */
    static final int Offset_CThostFtdcCombinationLegField_CombInstrumentID=0;
    /** 单腿编号 */
    static final int Offset_CThostFtdcCombinationLegField_LegID=32;
    /** 单腿合约代码 */
    static final int Offset_CThostFtdcCombinationLegField_LegInstrumentID=36;
    /** 买卖方向 */
    static final int Offset_CThostFtdcCombinationLegField_Direction=67;
    /** 单腿乘数 */
    static final int Offset_CThostFtdcCombinationLegField_LegMultiple=68;
    /** 派生层数 */
    static final int Offset_CThostFtdcCombinationLegField_ImplyLevel=72;

    /** 数据同步状态 */
    static final int SizeOf_CThostFtdcSyncStatusField=10;
    /** 交易日 */
    static final int Offset_CThostFtdcSyncStatusField_TradingDay=0;
    /** 数据同步状态 */
    static final int Offset_CThostFtdcSyncStatusField_DataSyncStatus=9;

    /** 查询联系人 */
    static final int SizeOf_CThostFtdcQryLinkManField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryLinkManField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryLinkManField_InvestorID=11;

    /** 联系人 */
    static final int SizeOf_CThostFtdcLinkManField=424;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcLinkManField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcLinkManField_InvestorID=11;
    /** 联系人类型 */
    static final int Offset_CThostFtdcLinkManField_PersonType=24;
    /** 证件类型 */
    static final int Offset_CThostFtdcLinkManField_IdentifiedCardType=25;
    /** 证件号码 */
    static final int Offset_CThostFtdcLinkManField_IdentifiedCardNo=26;
    /** 名称 */
    static final int Offset_CThostFtdcLinkManField_PersonName=77;
    /** 联系电话 */
    static final int Offset_CThostFtdcLinkManField_Telephone=158;
    /** 通讯地址 */
    static final int Offset_CThostFtdcLinkManField_Address=199;
    /** 邮政编码 */
    static final int Offset_CThostFtdcLinkManField_ZipCode=300;
    /** 优先级 */
    static final int Offset_CThostFtdcLinkManField_Priority=308;
    /** 开户邮政编码 */
    static final int Offset_CThostFtdcLinkManField_UOAZipCode=312;
    /** 全称 */
    static final int Offset_CThostFtdcLinkManField_PersonFullName=323;

    /** 查询经纪公司用户事件 */
    static final int SizeOf_CThostFtdcQryBrokerUserEventField=28;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryBrokerUserEventField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcQryBrokerUserEventField_UserID=11;
    /** 用户事件类型 */
    static final int Offset_CThostFtdcQryBrokerUserEventField_UserEventType=27;

    /** 查询经纪公司用户事件 */
    static final int SizeOf_CThostFtdcBrokerUserEventField=1120;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcBrokerUserEventField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcBrokerUserEventField_UserID=11;
    /** 用户事件类型 */
    static final int Offset_CThostFtdcBrokerUserEventField_UserEventType=27;
    /** 用户事件序号 */
    static final int Offset_CThostFtdcBrokerUserEventField_EventSequenceNo=28;
    /** 事件发生日期 */
    static final int Offset_CThostFtdcBrokerUserEventField_EventDate=32;
    /** 事件发生时间 */
    static final int Offset_CThostFtdcBrokerUserEventField_EventTime=41;
    /** 用户事件信息 */
    static final int Offset_CThostFtdcBrokerUserEventField_UserEventInfo=50;
    /** 投资者代码 */
    static final int Offset_CThostFtdcBrokerUserEventField_InvestorID=1075;
    /** 合约代码 */
    static final int Offset_CThostFtdcBrokerUserEventField_InstrumentID=1088;

    /** 查询签约银行请求 */
    static final int SizeOf_CThostFtdcQryContractBankField=20;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryContractBankField_BrokerID=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcQryContractBankField_BankID=11;
    /** 银行分中心代码 */
    static final int Offset_CThostFtdcQryContractBankField_BankBrchID=15;

    /** 查询签约银行响应 */
    static final int SizeOf_CThostFtdcContractBankField=121;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcContractBankField_BrokerID=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcContractBankField_BankID=11;
    /** 银行分中心代码 */
    static final int Offset_CThostFtdcContractBankField_BankBrchID=15;
    /** 银行名称 */
    static final int Offset_CThostFtdcContractBankField_BankName=20;

    /** 投资者组合持仓明细 */
    static final int SizeOf_CThostFtdcInvestorPositionCombineDetailField=216;
    /** 交易日 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_TradingDay=0;
    /** 开仓日期 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_OpenDate=9;
    /** 交易所代码 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_ExchangeID=18;
    /** 结算编号 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_SettlementID=28;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_BrokerID=32;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_InvestorID=43;
    /** 组合编号 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_ComTradeID=56;
    /** 撮合编号 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_TradeID=77;
    /** 合约代码 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_InstrumentID=98;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_HedgeFlag=129;
    /** 买卖 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_Direction=130;
    /** 持仓量 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_TotalAmt=132;
    /** 投资者保证金 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_Margin=136;
    /** 交易所保证金 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_ExchMargin=144;
    /** 保证金率 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_MarginRateByMoney=152;
    /** 保证金率(按手数) */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_MarginRateByVolume=160;
    /** 单腿编号 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_LegID=168;
    /** 单腿乘数 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_LegMultiple=172;
    /** 组合持仓合约编码 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_CombInstrumentID=176;
    /** 成交组号 */
    static final int Offset_CThostFtdcInvestorPositionCombineDetailField_TradeGroupID=208;

    /** 预埋单 */
    static final int SizeOf_CThostFtdcParkedOrderField=296;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcParkedOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcParkedOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcParkedOrderField_InstrumentID=24;
    /** 报单引用 */
    static final int Offset_CThostFtdcParkedOrderField_OrderRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcParkedOrderField_UserID=68;
    /** 报单价格条件 */
    static final int Offset_CThostFtdcParkedOrderField_OrderPriceType=84;
    /** 买卖方向 */
    static final int Offset_CThostFtdcParkedOrderField_Direction=85;
    /** 组合开平标志 */
    static final int Offset_CThostFtdcParkedOrderField_CombOffsetFlag=86;
    /** 组合投机套保标志 */
    static final int Offset_CThostFtdcParkedOrderField_CombHedgeFlag=91;
    /** 价格 */
    static final int Offset_CThostFtdcParkedOrderField_LimitPrice=96;
    /** 数量 */
    static final int Offset_CThostFtdcParkedOrderField_VolumeTotalOriginal=104;
    /** 有效期类型 */
    static final int Offset_CThostFtdcParkedOrderField_TimeCondition=108;
    /** GTD日期 */
    static final int Offset_CThostFtdcParkedOrderField_GTDDate=109;
    /** 成交量类型 */
    static final int Offset_CThostFtdcParkedOrderField_VolumeCondition=118;
    /** 最小成交量 */
    static final int Offset_CThostFtdcParkedOrderField_MinVolume=120;
    /** 触发条件 */
    static final int Offset_CThostFtdcParkedOrderField_ContingentCondition=124;
    /** 止损价 */
    static final int Offset_CThostFtdcParkedOrderField_StopPrice=128;
    /** 强平原因 */
    static final int Offset_CThostFtdcParkedOrderField_ForceCloseReason=136;
    /** 自动挂起标志 */
    static final int Offset_CThostFtdcParkedOrderField_IsAutoSuspend=140;
    /** 业务单元 */
    static final int Offset_CThostFtdcParkedOrderField_BusinessUnit=144;
    /** 请求编号 */
    static final int Offset_CThostFtdcParkedOrderField_RequestID=168;
    /** 用户强评标志 */
    static final int Offset_CThostFtdcParkedOrderField_UserForceClose=172;
    /** 交易所代码 */
    static final int Offset_CThostFtdcParkedOrderField_ExchangeID=176;
    /** 预埋报单编号 */
    static final int Offset_CThostFtdcParkedOrderField_ParkedOrderID=185;
    /** 用户类型 */
    static final int Offset_CThostFtdcParkedOrderField_UserType=198;
    /** 预埋单状态 */
    static final int Offset_CThostFtdcParkedOrderField_Status=199;
    /** 错误代码 */
    static final int Offset_CThostFtdcParkedOrderField_ErrorID=200;
    /** 错误信息 */
    static final int Offset_CThostFtdcParkedOrderField_ErrorMsg=204;
    /** 互换单标志 */
    static final int Offset_CThostFtdcParkedOrderField_IsSwapOrder=288;

    /** 输入预埋单操作 */
    static final int SizeOf_CThostFtdcParkedOrderActionField=256;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcParkedOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcParkedOrderActionField_InvestorID=11;
    /** 报单操作引用 */
    static final int Offset_CThostFtdcParkedOrderActionField_OrderActionRef=24;
    /** 报单引用 */
    static final int Offset_CThostFtdcParkedOrderActionField_OrderRef=28;
    /** 请求编号 */
    static final int Offset_CThostFtdcParkedOrderActionField_RequestID=44;
    /** 前置编号 */
    static final int Offset_CThostFtdcParkedOrderActionField_FrontID=48;
    /** 会话编号 */
    static final int Offset_CThostFtdcParkedOrderActionField_SessionID=52;
    /** 交易所代码 */
    static final int Offset_CThostFtdcParkedOrderActionField_ExchangeID=56;
    /** 报单编号 */
    static final int Offset_CThostFtdcParkedOrderActionField_OrderSysID=65;
    /** 操作标志 */
    static final int Offset_CThostFtdcParkedOrderActionField_ActionFlag=86;
    /** 价格 */
    static final int Offset_CThostFtdcParkedOrderActionField_LimitPrice=88;
    /** 数量变化 */
    static final int Offset_CThostFtdcParkedOrderActionField_VolumeChange=96;
    /** 用户代码 */
    static final int Offset_CThostFtdcParkedOrderActionField_UserID=100;
    /** 合约代码 */
    static final int Offset_CThostFtdcParkedOrderActionField_InstrumentID=116;
    /** 预埋撤单单编号 */
    static final int Offset_CThostFtdcParkedOrderActionField_ParkedOrderActionID=147;
    /** 用户类型 */
    static final int Offset_CThostFtdcParkedOrderActionField_UserType=160;
    /** 预埋撤单状态 */
    static final int Offset_CThostFtdcParkedOrderActionField_Status=161;
    /** 错误代码 */
    static final int Offset_CThostFtdcParkedOrderActionField_ErrorID=164;
    /** 错误信息 */
    static final int Offset_CThostFtdcParkedOrderActionField_ErrorMsg=168;

    /** 查询预埋单 */
    static final int SizeOf_CThostFtdcQryParkedOrderField=64;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryParkedOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryParkedOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryParkedOrderField_InstrumentID=24;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryParkedOrderField_ExchangeID=55;

    /** 查询预埋撤单 */
    static final int SizeOf_CThostFtdcQryParkedOrderActionField=64;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryParkedOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryParkedOrderActionField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryParkedOrderActionField_InstrumentID=24;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryParkedOrderActionField_ExchangeID=55;

    /** 删除预埋单 */
    static final int SizeOf_CThostFtdcRemoveParkedOrderField=37;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcRemoveParkedOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcRemoveParkedOrderField_InvestorID=11;
    /** 预埋报单编号 */
    static final int Offset_CThostFtdcRemoveParkedOrderField_ParkedOrderID=24;

    /** 删除预埋撤单 */
    static final int SizeOf_CThostFtdcRemoveParkedOrderActionField=37;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcRemoveParkedOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcRemoveParkedOrderActionField_InvestorID=11;
    /** 预埋撤单编号 */
    static final int Offset_CThostFtdcRemoveParkedOrderActionField_ParkedOrderActionID=24;

    /** 经纪公司可提资金算法表 */
    static final int SizeOf_CThostFtdcInvestorWithdrawAlgorithmField=56;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInvestorWithdrawAlgorithmField_BrokerID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcInvestorWithdrawAlgorithmField_InvestorRange=11;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInvestorWithdrawAlgorithmField_InvestorID=12;
    /** 可提资金比例 */
    static final int Offset_CThostFtdcInvestorWithdrawAlgorithmField_UsingRatio=32;
    /** 币种代码 */
    static final int Offset_CThostFtdcInvestorWithdrawAlgorithmField_CurrencyID=40;
    /** 货币质押比率 */
    static final int Offset_CThostFtdcInvestorWithdrawAlgorithmField_FundMortgageRatio=48;

    /** 查询组合持仓明细 */
    static final int SizeOf_CThostFtdcQryInvestorPositionCombineDetailField=55;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryInvestorPositionCombineDetailField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryInvestorPositionCombineDetailField_InvestorID=11;
    /** 组合持仓合约编码 */
    static final int Offset_CThostFtdcQryInvestorPositionCombineDetailField_CombInstrumentID=24;

    /** 成交均价 */
    static final int SizeOf_CThostFtdcMarketDataAveragePriceField=8;
    /** 当日均价 */
    static final int Offset_CThostFtdcMarketDataAveragePriceField_AveragePrice=0;

    /** 校验投资者密码 */
    static final int SizeOf_CThostFtdcVerifyInvestorPasswordField=65;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcVerifyInvestorPasswordField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcVerifyInvestorPasswordField_InvestorID=11;
    /** 密码 */
    static final int Offset_CThostFtdcVerifyInvestorPasswordField_Password=24;

    /** 用户IP */
    static final int SizeOf_CThostFtdcUserIPField=80;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcUserIPField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcUserIPField_UserID=11;
    /** IP地址 */
    static final int Offset_CThostFtdcUserIPField_IPAddress=27;
    /** IP地址掩码 */
    static final int Offset_CThostFtdcUserIPField_IPMask=43;
    /** Mac地址 */
    static final int Offset_CThostFtdcUserIPField_MacAddress=59;

    /** 用户事件通知信息 */
    static final int SizeOf_CThostFtdcTradingNoticeInfoField=540;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcTradingNoticeInfoField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcTradingNoticeInfoField_InvestorID=11;
    /** 发送时间 */
    static final int Offset_CThostFtdcTradingNoticeInfoField_SendTime=24;
    /** 消息正文 */
    static final int Offset_CThostFtdcTradingNoticeInfoField_FieldContent=33;
    /** 序列系列号 */
    static final int Offset_CThostFtdcTradingNoticeInfoField_SequenceSeries=534;
    /** 序列号 */
    static final int Offset_CThostFtdcTradingNoticeInfoField_SequenceNo=536;

    /** 用户事件通知 */
    static final int SizeOf_CThostFtdcTradingNoticeField=564;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcTradingNoticeField_BrokerID=0;
    /** 投资者范围 */
    static final int Offset_CThostFtdcTradingNoticeField_InvestorRange=11;
    /** 投资者代码 */
    static final int Offset_CThostFtdcTradingNoticeField_InvestorID=12;
    /** 序列系列号 */
    static final int Offset_CThostFtdcTradingNoticeField_SequenceSeries=26;
    /** 用户代码 */
    static final int Offset_CThostFtdcTradingNoticeField_UserID=28;
    /** 发送时间 */
    static final int Offset_CThostFtdcTradingNoticeField_SendTime=44;
    /** 序列号 */
    static final int Offset_CThostFtdcTradingNoticeField_SequenceNo=56;
    /** 消息正文 */
    static final int Offset_CThostFtdcTradingNoticeField_FieldContent=60;

    /** 查询交易事件通知 */
    static final int SizeOf_CThostFtdcQryTradingNoticeField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryTradingNoticeField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryTradingNoticeField_InvestorID=11;

    /** 查询错误报单 */
    static final int SizeOf_CThostFtdcQryErrOrderField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryErrOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryErrOrderField_InvestorID=11;

    /** 错误报单 */
    static final int SizeOf_CThostFtdcErrOrderField=272;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcErrOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcErrOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcErrOrderField_InstrumentID=24;
    /** 报单引用 */
    static final int Offset_CThostFtdcErrOrderField_OrderRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcErrOrderField_UserID=68;
    /** 报单价格条件 */
    static final int Offset_CThostFtdcErrOrderField_OrderPriceType=84;
    /** 买卖方向 */
    static final int Offset_CThostFtdcErrOrderField_Direction=85;
    /** 组合开平标志 */
    static final int Offset_CThostFtdcErrOrderField_CombOffsetFlag=86;
    /** 组合投机套保标志 */
    static final int Offset_CThostFtdcErrOrderField_CombHedgeFlag=91;
    /** 价格 */
    static final int Offset_CThostFtdcErrOrderField_LimitPrice=96;
    /** 数量 */
    static final int Offset_CThostFtdcErrOrderField_VolumeTotalOriginal=104;
    /** 有效期类型 */
    static final int Offset_CThostFtdcErrOrderField_TimeCondition=108;
    /** GTD日期 */
    static final int Offset_CThostFtdcErrOrderField_GTDDate=109;
    /** 成交量类型 */
    static final int Offset_CThostFtdcErrOrderField_VolumeCondition=118;
    /** 最小成交量 */
    static final int Offset_CThostFtdcErrOrderField_MinVolume=120;
    /** 触发条件 */
    static final int Offset_CThostFtdcErrOrderField_ContingentCondition=124;
    /** 止损价 */
    static final int Offset_CThostFtdcErrOrderField_StopPrice=128;
    /** 强平原因 */
    static final int Offset_CThostFtdcErrOrderField_ForceCloseReason=136;
    /** 自动挂起标志 */
    static final int Offset_CThostFtdcErrOrderField_IsAutoSuspend=140;
    /** 业务单元 */
    static final int Offset_CThostFtdcErrOrderField_BusinessUnit=144;
    /** 请求编号 */
    static final int Offset_CThostFtdcErrOrderField_RequestID=168;
    /** 用户强评标志 */
    static final int Offset_CThostFtdcErrOrderField_UserForceClose=172;
    /** 错误代码 */
    static final int Offset_CThostFtdcErrOrderField_ErrorID=176;
    /** 错误信息 */
    static final int Offset_CThostFtdcErrOrderField_ErrorMsg=180;
    /** 互换单标志 */
    static final int Offset_CThostFtdcErrOrderField_IsSwapOrder=264;

    /** 查询错误报单操作 */
    static final int SizeOf_CThostFtdcErrorConditionalOrderField=664;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_InstrumentID=24;
    /** 报单引用 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_OrderRef=55;
    /** 用户代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_UserID=68;
    /** 报单价格条件 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_OrderPriceType=84;
    /** 买卖方向 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_Direction=85;
    /** 组合开平标志 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_CombOffsetFlag=86;
    /** 组合投机套保标志 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_CombHedgeFlag=91;
    /** 价格 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_LimitPrice=96;
    /** 数量 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_VolumeTotalOriginal=104;
    /** 有效期类型 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_TimeCondition=108;
    /** GTD日期 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_GTDDate=109;
    /** 成交量类型 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_VolumeCondition=118;
    /** 最小成交量 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_MinVolume=120;
    /** 触发条件 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ContingentCondition=124;
    /** 止损价 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_StopPrice=128;
    /** 强平原因 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ForceCloseReason=136;
    /** 自动挂起标志 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_IsAutoSuspend=140;
    /** 业务单元 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_BusinessUnit=144;
    /** 请求编号 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_RequestID=168;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_OrderLocalID=172;
    /** 交易所代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ExchangeID=185;
    /** 会员代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ParticipantID=194;
    /** 客户代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ClientID=205;
    /** 合约在交易所的代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ExchangeInstID=216;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_TraderID=247;
    /** 安装编号 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_InstallID=268;
    /** 报单提交状态 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_OrderSubmitStatus=272;
    /** 报单提示序号 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_NotifySequence=276;
    /** 交易日 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_TradingDay=280;
    /** 结算编号 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_SettlementID=292;
    /** 报单编号 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_OrderSysID=296;
    /** 报单来源 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_OrderSource=317;
    /** 报单状态 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_OrderStatus=318;
    /** 报单类型 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_OrderType=319;
    /** 今成交数量 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_VolumeTraded=320;
    /** 剩余数量 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_VolumeTotal=324;
    /** 报单日期 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_InsertDate=328;
    /** 委托时间 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_InsertTime=337;
    /** 激活时间 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ActiveTime=346;
    /** 挂起时间 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_SuspendTime=355;
    /** 最后修改时间 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_UpdateTime=364;
    /** 撤销时间 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_CancelTime=373;
    /** 最后修改交易所交易员代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ActiveTraderID=382;
    /** 结算会员编号 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ClearingPartID=403;
    /** 序号 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_SequenceNo=416;
    /** 前置编号 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_FrontID=420;
    /** 会话编号 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_SessionID=424;
    /** 用户端产品信息 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_UserProductInfo=428;
    /** 状态信息 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_StatusMsg=439;
    /** 用户强评标志 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_UserForceClose=520;
    /** 操作用户代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ActiveUserID=524;
    /** 经纪公司报单编号 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_BrokerOrderSeq=540;
    /** 相关报单 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_RelativeOrderSysID=544;
    /** 郑商所成交数量 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ZCETotalTradedVolume=568;
    /** 错误代码 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ErrorID=572;
    /** 错误信息 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_ErrorMsg=576;
    /** 互换单标志 */
    static final int Offset_CThostFtdcErrorConditionalOrderField_IsSwapOrder=660;

    /** 查询错误报单操作 */
    static final int SizeOf_CThostFtdcQryErrOrderActionField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryErrOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryErrOrderActionField_InvestorID=11;

    /** 错误报单操作 */
    static final int SizeOf_CThostFtdcErrOrderActionField=432;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcErrOrderActionField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcErrOrderActionField_InvestorID=11;
    /** 报单操作引用 */
    static final int Offset_CThostFtdcErrOrderActionField_OrderActionRef=24;
    /** 报单引用 */
    static final int Offset_CThostFtdcErrOrderActionField_OrderRef=28;
    /** 请求编号 */
    static final int Offset_CThostFtdcErrOrderActionField_RequestID=44;
    /** 前置编号 */
    static final int Offset_CThostFtdcErrOrderActionField_FrontID=48;
    /** 会话编号 */
    static final int Offset_CThostFtdcErrOrderActionField_SessionID=52;
    /** 交易所代码 */
    static final int Offset_CThostFtdcErrOrderActionField_ExchangeID=56;
    /** 报单编号 */
    static final int Offset_CThostFtdcErrOrderActionField_OrderSysID=65;
    /** 操作标志 */
    static final int Offset_CThostFtdcErrOrderActionField_ActionFlag=86;
    /** 价格 */
    static final int Offset_CThostFtdcErrOrderActionField_LimitPrice=88;
    /** 数量变化 */
    static final int Offset_CThostFtdcErrOrderActionField_VolumeChange=96;
    /** 操作日期 */
    static final int Offset_CThostFtdcErrOrderActionField_ActionDate=100;
    /** 操作时间 */
    static final int Offset_CThostFtdcErrOrderActionField_ActionTime=109;
    /** 交易所交易员代码 */
    static final int Offset_CThostFtdcErrOrderActionField_TraderID=118;
    /** 安装编号 */
    static final int Offset_CThostFtdcErrOrderActionField_InstallID=140;
    /** 本地报单编号 */
    static final int Offset_CThostFtdcErrOrderActionField_OrderLocalID=144;
    /** 操作本地编号 */
    static final int Offset_CThostFtdcErrOrderActionField_ActionLocalID=157;
    /** 会员代码 */
    static final int Offset_CThostFtdcErrOrderActionField_ParticipantID=170;
    /** 客户代码 */
    static final int Offset_CThostFtdcErrOrderActionField_ClientID=181;
    /** 业务单元 */
    static final int Offset_CThostFtdcErrOrderActionField_BusinessUnit=192;
    /** 报单操作状态 */
    static final int Offset_CThostFtdcErrOrderActionField_OrderActionStatus=213;
    /** 用户代码 */
    static final int Offset_CThostFtdcErrOrderActionField_UserID=214;
    /** 状态信息 */
    static final int Offset_CThostFtdcErrOrderActionField_StatusMsg=230;
    /** 合约代码 */
    static final int Offset_CThostFtdcErrOrderActionField_InstrumentID=311;
    /** 错误代码 */
    static final int Offset_CThostFtdcErrOrderActionField_ErrorID=344;
    /** 错误信息 */
    static final int Offset_CThostFtdcErrOrderActionField_ErrorMsg=348;

    /** 查询交易所状态 */
    static final int SizeOf_CThostFtdcQryExchangeSequenceField=9;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryExchangeSequenceField_ExchangeID=0;

    /** 交易所状态 */
    static final int SizeOf_CThostFtdcExchangeSequenceField=20;
    /** 交易所代码 */
    static final int Offset_CThostFtdcExchangeSequenceField_ExchangeID=0;
    /** 序号 */
    static final int Offset_CThostFtdcExchangeSequenceField_SequenceNo=12;
    /** 合约交易状态 */
    static final int Offset_CThostFtdcExchangeSequenceField_MarketStatus=16;

    /** 根据价格查询最大报单数量 */
    static final int SizeOf_CThostFtdcQueryMaxOrderVolumeWithPriceField=72;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeWithPriceField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestorID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeWithPriceField_InstrumentID=24;
    /** 买卖方向 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeWithPriceField_Direction=55;
    /** 开平标志 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeWithPriceField_OffsetFlag=56;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeWithPriceField_HedgeFlag=57;
    /** 最大允许报单数量 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeWithPriceField_MaxVolume=60;
    /** 报单价格 */
    static final int Offset_CThostFtdcQueryMaxOrderVolumeWithPriceField_Price=64;

    /** 查询经纪公司交易参数 */
    static final int SizeOf_CThostFtdcQryBrokerTradingParamsField=28;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryBrokerTradingParamsField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryBrokerTradingParamsField_InvestorID=11;
    /** 币种代码 */
    static final int Offset_CThostFtdcQryBrokerTradingParamsField_CurrencyID=24;

    /** 经纪公司交易参数 */
    static final int SizeOf_CThostFtdcBrokerTradingParamsField=32;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcBrokerTradingParamsField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcBrokerTradingParamsField_InvestorID=11;
    /** 保证金价格类型 */
    static final int Offset_CThostFtdcBrokerTradingParamsField_MarginPriceType=24;
    /** 盈亏算法 */
    static final int Offset_CThostFtdcBrokerTradingParamsField_Algorithm=25;
    /** 可用是否包含平仓盈利 */
    static final int Offset_CThostFtdcBrokerTradingParamsField_AvailIncludeCloseProfit=26;
    /** 币种代码 */
    static final int Offset_CThostFtdcBrokerTradingParamsField_CurrencyID=27;
    /** 期权权利金价格类型 */
    static final int Offset_CThostFtdcBrokerTradingParamsField_OptionRoyaltyPriceType=31;

    /** 查询经纪公司交易算法 */
    static final int SizeOf_CThostFtdcQryBrokerTradingAlgosField=51;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryBrokerTradingAlgosField_BrokerID=0;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryBrokerTradingAlgosField_ExchangeID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryBrokerTradingAlgosField_InstrumentID=20;

    /** 经纪公司交易算法 */
    static final int SizeOf_CThostFtdcBrokerTradingAlgosField=54;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcBrokerTradingAlgosField_BrokerID=0;
    /** 交易所代码 */
    static final int Offset_CThostFtdcBrokerTradingAlgosField_ExchangeID=11;
    /** 合约代码 */
    static final int Offset_CThostFtdcBrokerTradingAlgosField_InstrumentID=20;
    /** 持仓处理算法编号 */
    static final int Offset_CThostFtdcBrokerTradingAlgosField_HandlePositionAlgoID=51;
    /** 寻找保证金率算法编号 */
    static final int Offset_CThostFtdcBrokerTradingAlgosField_FindMarginRateAlgoID=52;
    /** 资金处理算法编号 */
    static final int Offset_CThostFtdcBrokerTradingAlgosField_HandleTradingAccountAlgoID=53;

    /** 查询经纪公司资金 */
    static final int SizeOf_CThostFtdcQueryBrokerDepositField=20;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQueryBrokerDepositField_BrokerID=0;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQueryBrokerDepositField_ExchangeID=11;

    /** 经纪公司资金 */
    static final int SizeOf_CThostFtdcBrokerDepositField=112;
    /** 交易日期 */
    static final int Offset_CThostFtdcBrokerDepositField_TradingDay=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcBrokerDepositField_BrokerID=9;
    /** 会员代码 */
    static final int Offset_CThostFtdcBrokerDepositField_ParticipantID=20;
    /** 交易所代码 */
    static final int Offset_CThostFtdcBrokerDepositField_ExchangeID=31;
    /** 上次结算准备金 */
    static final int Offset_CThostFtdcBrokerDepositField_PreBalance=40;
    /** 当前保证金总额 */
    static final int Offset_CThostFtdcBrokerDepositField_CurrMargin=48;
    /** 平仓盈亏 */
    static final int Offset_CThostFtdcBrokerDepositField_CloseProfit=56;
    /** 期货结算准备金 */
    static final int Offset_CThostFtdcBrokerDepositField_Balance=64;
    /** 入金金额 */
    static final int Offset_CThostFtdcBrokerDepositField_Deposit=72;
    /** 出金金额 */
    static final int Offset_CThostFtdcBrokerDepositField_Withdraw=80;
    /** 可提资金 */
    static final int Offset_CThostFtdcBrokerDepositField_Available=88;
    /** 基本准备金 */
    static final int Offset_CThostFtdcBrokerDepositField_Reserve=96;
    /** 冻结的保证金 */
    static final int Offset_CThostFtdcBrokerDepositField_FrozenMargin=104;

    /** 查询保证金监管系统经纪公司密钥 */
    static final int SizeOf_CThostFtdcQryCFMMCBrokerKeyField=11;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryCFMMCBrokerKeyField_BrokerID=0;

    /** 保证金监管系统经纪公司密钥 */
    static final int SizeOf_CThostFtdcCFMMCBrokerKeyField=68;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcCFMMCBrokerKeyField_BrokerID=0;
    /** 经纪公司统一编码 */
    static final int Offset_CThostFtdcCFMMCBrokerKeyField_ParticipantID=11;
    /** 密钥生成日期 */
    static final int Offset_CThostFtdcCFMMCBrokerKeyField_CreateDate=22;
    /** 密钥生成时间 */
    static final int Offset_CThostFtdcCFMMCBrokerKeyField_CreateTime=31;
    /** 密钥编号 */
    static final int Offset_CThostFtdcCFMMCBrokerKeyField_KeyID=40;
    /** 动态密钥 */
    static final int Offset_CThostFtdcCFMMCBrokerKeyField_CurrentKey=44;
    /** 动态密钥类型 */
    static final int Offset_CThostFtdcCFMMCBrokerKeyField_KeyKind=65;

    /** 保证金监管系统经纪公司资金账户密钥 */
    static final int SizeOf_CThostFtdcCFMMCTradingAccountKeyField=64;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcCFMMCTradingAccountKeyField_BrokerID=0;
    /** 经纪公司统一编码 */
    static final int Offset_CThostFtdcCFMMCTradingAccountKeyField_ParticipantID=11;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcCFMMCTradingAccountKeyField_AccountID=22;
    /** 密钥编号 */
    static final int Offset_CThostFtdcCFMMCTradingAccountKeyField_KeyID=36;
    /** 动态密钥 */
    static final int Offset_CThostFtdcCFMMCTradingAccountKeyField_CurrentKey=40;

    /** 请求查询保证金监管系统经纪公司资金账户密钥 */
    static final int SizeOf_CThostFtdcQryCFMMCTradingAccountKeyField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryCFMMCTradingAccountKeyField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryCFMMCTradingAccountKeyField_InvestorID=11;

    /** 用户动态令牌参数 */
    static final int SizeOf_CThostFtdcBrokerUserOTPParamField=100;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcBrokerUserOTPParamField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcBrokerUserOTPParamField_UserID=11;
    /** 动态令牌提供商 */
    static final int Offset_CThostFtdcBrokerUserOTPParamField_OTPVendorsID=27;
    /** 动态令牌序列号 */
    static final int Offset_CThostFtdcBrokerUserOTPParamField_SerialNumber=29;
    /** 令牌密钥 */
    static final int Offset_CThostFtdcBrokerUserOTPParamField_AuthKey=46;
    /** 漂移值 */
    static final int Offset_CThostFtdcBrokerUserOTPParamField_LastDrift=88;
    /** 成功值 */
    static final int Offset_CThostFtdcBrokerUserOTPParamField_LastSuccess=92;
    /** 动态令牌类型 */
    static final int Offset_CThostFtdcBrokerUserOTPParamField_OTPType=96;

    /** 手工同步用户动态令牌 */
    static final int SizeOf_CThostFtdcManualSyncBrokerUserOTPField=110;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcManualSyncBrokerUserOTPField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcManualSyncBrokerUserOTPField_UserID=11;
    /** 动态令牌类型 */
    static final int Offset_CThostFtdcManualSyncBrokerUserOTPField_OTPType=27;
    /** 第一个动态密码 */
    static final int Offset_CThostFtdcManualSyncBrokerUserOTPField_FirstOTP=28;
    /** 第二个动态密码 */
    static final int Offset_CThostFtdcManualSyncBrokerUserOTPField_SecondOTP=69;

    /** 投资者手续费率模板 */
    static final int SizeOf_CThostFtdcCommRateModelField=185;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcCommRateModelField_BrokerID=0;
    /** 手续费率模板代码 */
    static final int Offset_CThostFtdcCommRateModelField_CommModelID=11;
    /** 模板名称 */
    static final int Offset_CThostFtdcCommRateModelField_CommModelName=24;

    /** 请求查询投资者手续费率模板 */
    static final int SizeOf_CThostFtdcQryCommRateModelField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryCommRateModelField_BrokerID=0;
    /** 手续费率模板代码 */
    static final int Offset_CThostFtdcQryCommRateModelField_CommModelID=11;

    /** 投资者保证金率模板 */
    static final int SizeOf_CThostFtdcMarginModelField=185;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcMarginModelField_BrokerID=0;
    /** 保证金率模板代码 */
    static final int Offset_CThostFtdcMarginModelField_MarginModelID=11;
    /** 模板名称 */
    static final int Offset_CThostFtdcMarginModelField_MarginModelName=24;

    /** 请求查询投资者保证金率模板 */
    static final int SizeOf_CThostFtdcQryMarginModelField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryMarginModelField_BrokerID=0;
    /** 保证金率模板代码 */
    static final int Offset_CThostFtdcQryMarginModelField_MarginModelID=11;

    /** 仓单折抵信息 */
    static final int SizeOf_CThostFtdcEWarrantOffsetField=80;
    /** 交易日期 */
    static final int Offset_CThostFtdcEWarrantOffsetField_TradingDay=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcEWarrantOffsetField_BrokerID=9;
    /** 投资者代码 */
    static final int Offset_CThostFtdcEWarrantOffsetField_InvestorID=20;
    /** 交易所代码 */
    static final int Offset_CThostFtdcEWarrantOffsetField_ExchangeID=33;
    /** 合约代码 */
    static final int Offset_CThostFtdcEWarrantOffsetField_InstrumentID=42;
    /** 买卖方向 */
    static final int Offset_CThostFtdcEWarrantOffsetField_Direction=73;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcEWarrantOffsetField_HedgeFlag=74;
    /** 数量 */
    static final int Offset_CThostFtdcEWarrantOffsetField_Volume=76;

    /** 查询仓单折抵信息 */
    static final int SizeOf_CThostFtdcQryEWarrantOffsetField=64;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryEWarrantOffsetField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryEWarrantOffsetField_InvestorID=11;
    /** 交易所代码 */
    static final int Offset_CThostFtdcQryEWarrantOffsetField_ExchangeID=24;
    /** 合约代码 */
    static final int Offset_CThostFtdcQryEWarrantOffsetField_InstrumentID=33;

    /** 查询投资者品种/跨品种保证金 */
    static final int SizeOf_CThostFtdcQryInvestorProductGroupMarginField=56;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryInvestorProductGroupMarginField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQryInvestorProductGroupMarginField_InvestorID=11;
    /** 品种/跨品种标示 */
    static final int Offset_CThostFtdcQryInvestorProductGroupMarginField_ProductGroupID=24;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcQryInvestorProductGroupMarginField_HedgeFlag=55;

    /** 投资者品种/跨品种保证金 */
    static final int SizeOf_CThostFtdcInvestorProductGroupMarginField=248;
    /** 品种/跨品种标示 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_ProductGroupID=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_BrokerID=31;
    /** 投资者代码 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_InvestorID=42;
    /** 交易日 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_TradingDay=55;
    /** 结算编号 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_SettlementID=64;
    /** 冻结的保证金 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_FrozenMargin=72;
    /** 多头冻结的保证金 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_LongFrozenMargin=80;
    /** 空头冻结的保证金 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_ShortFrozenMargin=88;
    /** 占用的保证金 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_UseMargin=96;
    /** 多头保证金 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_LongUseMargin=104;
    /** 空头保证金 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_ShortUseMargin=112;
    /** 交易所保证金 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_ExchMargin=120;
    /** 交易所多头保证金 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_LongExchMargin=128;
    /** 交易所空头保证金 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_ShortExchMargin=136;
    /** 平仓盈亏 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_CloseProfit=144;
    /** 冻结的手续费 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_FrozenCommission=152;
    /** 手续费 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_Commission=160;
    /** 冻结的资金 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_FrozenCash=168;
    /** 资金差额 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_CashIn=176;
    /** 持仓盈亏 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_PositionProfit=184;
    /** 折抵总金额 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_OffsetAmount=192;
    /** 多头折抵总金额 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_LongOffsetAmount=200;
    /** 空头折抵总金额 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_ShortOffsetAmount=208;
    /** 交易所折抵总金额 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_ExchOffsetAmount=216;
    /** 交易所多头折抵总金额 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_LongExchOffsetAmount=224;
    /** 交易所空头折抵总金额 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_ShortExchOffsetAmount=232;
    /** 投机套保标志 */
    static final int Offset_CThostFtdcInvestorProductGroupMarginField_HedgeFlag=240;

    /** 查询监控中心用户令牌 */
    static final int SizeOf_CThostFtdcQueryCFMMCTradingAccountTokenField=24;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQueryCFMMCTradingAccountTokenField_BrokerID=0;
    /** 投资者代码 */
    static final int Offset_CThostFtdcQueryCFMMCTradingAccountTokenField_InvestorID=11;

    /** 监控中心用户令牌 */
    static final int SizeOf_CThostFtdcCFMMCTradingAccountTokenField=64;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcCFMMCTradingAccountTokenField_BrokerID=0;
    /** 经纪公司统一编码 */
    static final int Offset_CThostFtdcCFMMCTradingAccountTokenField_ParticipantID=11;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcCFMMCTradingAccountTokenField_AccountID=22;
    /** 密钥编号 */
    static final int Offset_CThostFtdcCFMMCTradingAccountTokenField_KeyID=36;
    /** 动态令牌 */
    static final int Offset_CThostFtdcCFMMCTradingAccountTokenField_Token=40;

    /** 转帐开户请求 */
    static final int SizeOf_CThostFtdcReqOpenAccountField=792;
    /** 业务功能码 */
    static final int Offset_CThostFtdcReqOpenAccountField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcReqOpenAccountField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcReqOpenAccountField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcReqOpenAccountField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcReqOpenAccountField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcReqOpenAccountField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcReqOpenAccountField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcReqOpenAccountField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcReqOpenAccountField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcReqOpenAccountField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcReqOpenAccountField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcReqOpenAccountField_SessionID=108;
    /** 客户姓名 */
    static final int Offset_CThostFtdcReqOpenAccountField_CustomerName=112;
    /** 证件类型 */
    static final int Offset_CThostFtdcReqOpenAccountField_IdCardType=163;
    /** 证件号码 */
    static final int Offset_CThostFtdcReqOpenAccountField_IdentifiedCardNo=164;
    /** 性别 */
    static final int Offset_CThostFtdcReqOpenAccountField_Gender=215;
    /** 国家代码 */
    static final int Offset_CThostFtdcReqOpenAccountField_CountryCode=216;
    /** 客户类型 */
    static final int Offset_CThostFtdcReqOpenAccountField_CustType=237;
    /** 地址 */
    static final int Offset_CThostFtdcReqOpenAccountField_Address=238;
    /** 邮编 */
    static final int Offset_CThostFtdcReqOpenAccountField_ZipCode=339;
    /** 电话号码 */
    static final int Offset_CThostFtdcReqOpenAccountField_Telephone=346;
    /** 手机 */
    static final int Offset_CThostFtdcReqOpenAccountField_MobilePhone=387;
    /** 传真 */
    static final int Offset_CThostFtdcReqOpenAccountField_Fax=408;
    /** 电子邮件 */
    static final int Offset_CThostFtdcReqOpenAccountField_EMail=449;
    /** 资金账户状态 */
    static final int Offset_CThostFtdcReqOpenAccountField_MoneyAccountStatus=490;
    /** 银行帐号 */
    static final int Offset_CThostFtdcReqOpenAccountField_BankAccount=491;
    /** 银行密码 */
    static final int Offset_CThostFtdcReqOpenAccountField_BankPassWord=532;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcReqOpenAccountField_AccountID=573;
    /** 期货密码 */
    static final int Offset_CThostFtdcReqOpenAccountField_Password=586;
    /** 安装编号 */
    static final int Offset_CThostFtdcReqOpenAccountField_InstallID=628;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcReqOpenAccountField_VerifyCertNoFlag=632;
    /** 币种代码 */
    static final int Offset_CThostFtdcReqOpenAccountField_CurrencyID=633;
    /** 汇钞标志 */
    static final int Offset_CThostFtdcReqOpenAccountField_CashExchangeCode=637;
    /** 摘要 */
    static final int Offset_CThostFtdcReqOpenAccountField_Digest=638;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcReqOpenAccountField_BankAccType=674;
    /** 渠道标志 */
    static final int Offset_CThostFtdcReqOpenAccountField_DeviceID=675;
    /** 期货单位帐号类型 */
    static final int Offset_CThostFtdcReqOpenAccountField_BankSecuAccType=678;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcReqOpenAccountField_BrokerIDByBank=679;
    /** 期货单位帐号 */
    static final int Offset_CThostFtdcReqOpenAccountField_BankSecuAcc=712;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcReqOpenAccountField_BankPwdFlag=753;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcReqOpenAccountField_SecuPwdFlag=754;
    /** 交易柜员 */
    static final int Offset_CThostFtdcReqOpenAccountField_OperNo=755;
    /** 交易ID */
    static final int Offset_CThostFtdcReqOpenAccountField_TID=772;
    /** 用户标识 */
    static final int Offset_CThostFtdcReqOpenAccountField_UserID=776;

    /** 转帐销户请求 */
    static final int SizeOf_CThostFtdcReqCancelAccountField=792;
    /** 业务功能码 */
    static final int Offset_CThostFtdcReqCancelAccountField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcReqCancelAccountField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcReqCancelAccountField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcReqCancelAccountField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcReqCancelAccountField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcReqCancelAccountField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcReqCancelAccountField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcReqCancelAccountField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcReqCancelAccountField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcReqCancelAccountField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcReqCancelAccountField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcReqCancelAccountField_SessionID=108;
    /** 客户姓名 */
    static final int Offset_CThostFtdcReqCancelAccountField_CustomerName=112;
    /** 证件类型 */
    static final int Offset_CThostFtdcReqCancelAccountField_IdCardType=163;
    /** 证件号码 */
    static final int Offset_CThostFtdcReqCancelAccountField_IdentifiedCardNo=164;
    /** 性别 */
    static final int Offset_CThostFtdcReqCancelAccountField_Gender=215;
    /** 国家代码 */
    static final int Offset_CThostFtdcReqCancelAccountField_CountryCode=216;
    /** 客户类型 */
    static final int Offset_CThostFtdcReqCancelAccountField_CustType=237;
    /** 地址 */
    static final int Offset_CThostFtdcReqCancelAccountField_Address=238;
    /** 邮编 */
    static final int Offset_CThostFtdcReqCancelAccountField_ZipCode=339;
    /** 电话号码 */
    static final int Offset_CThostFtdcReqCancelAccountField_Telephone=346;
    /** 手机 */
    static final int Offset_CThostFtdcReqCancelAccountField_MobilePhone=387;
    /** 传真 */
    static final int Offset_CThostFtdcReqCancelAccountField_Fax=408;
    /** 电子邮件 */
    static final int Offset_CThostFtdcReqCancelAccountField_EMail=449;
    /** 资金账户状态 */
    static final int Offset_CThostFtdcReqCancelAccountField_MoneyAccountStatus=490;
    /** 银行帐号 */
    static final int Offset_CThostFtdcReqCancelAccountField_BankAccount=491;
    /** 银行密码 */
    static final int Offset_CThostFtdcReqCancelAccountField_BankPassWord=532;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcReqCancelAccountField_AccountID=573;
    /** 期货密码 */
    static final int Offset_CThostFtdcReqCancelAccountField_Password=586;
    /** 安装编号 */
    static final int Offset_CThostFtdcReqCancelAccountField_InstallID=628;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcReqCancelAccountField_VerifyCertNoFlag=632;
    /** 币种代码 */
    static final int Offset_CThostFtdcReqCancelAccountField_CurrencyID=633;
    /** 汇钞标志 */
    static final int Offset_CThostFtdcReqCancelAccountField_CashExchangeCode=637;
    /** 摘要 */
    static final int Offset_CThostFtdcReqCancelAccountField_Digest=638;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcReqCancelAccountField_BankAccType=674;
    /** 渠道标志 */
    static final int Offset_CThostFtdcReqCancelAccountField_DeviceID=675;
    /** 期货单位帐号类型 */
    static final int Offset_CThostFtdcReqCancelAccountField_BankSecuAccType=678;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcReqCancelAccountField_BrokerIDByBank=679;
    /** 期货单位帐号 */
    static final int Offset_CThostFtdcReqCancelAccountField_BankSecuAcc=712;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcReqCancelAccountField_BankPwdFlag=753;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcReqCancelAccountField_SecuPwdFlag=754;
    /** 交易柜员 */
    static final int Offset_CThostFtdcReqCancelAccountField_OperNo=755;
    /** 交易ID */
    static final int Offset_CThostFtdcReqCancelAccountField_TID=772;
    /** 用户标识 */
    static final int Offset_CThostFtdcReqCancelAccountField_UserID=776;

    /** 变更银行账户请求 */
    static final int SizeOf_CThostFtdcReqChangeAccountField=796;
    /** 业务功能码 */
    static final int Offset_CThostFtdcReqChangeAccountField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcReqChangeAccountField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcReqChangeAccountField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcReqChangeAccountField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcReqChangeAccountField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcReqChangeAccountField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcReqChangeAccountField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcReqChangeAccountField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcReqChangeAccountField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcReqChangeAccountField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcReqChangeAccountField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcReqChangeAccountField_SessionID=108;
    /** 客户姓名 */
    static final int Offset_CThostFtdcReqChangeAccountField_CustomerName=112;
    /** 证件类型 */
    static final int Offset_CThostFtdcReqChangeAccountField_IdCardType=163;
    /** 证件号码 */
    static final int Offset_CThostFtdcReqChangeAccountField_IdentifiedCardNo=164;
    /** 性别 */
    static final int Offset_CThostFtdcReqChangeAccountField_Gender=215;
    /** 国家代码 */
    static final int Offset_CThostFtdcReqChangeAccountField_CountryCode=216;
    /** 客户类型 */
    static final int Offset_CThostFtdcReqChangeAccountField_CustType=237;
    /** 地址 */
    static final int Offset_CThostFtdcReqChangeAccountField_Address=238;
    /** 邮编 */
    static final int Offset_CThostFtdcReqChangeAccountField_ZipCode=339;
    /** 电话号码 */
    static final int Offset_CThostFtdcReqChangeAccountField_Telephone=346;
    /** 手机 */
    static final int Offset_CThostFtdcReqChangeAccountField_MobilePhone=387;
    /** 传真 */
    static final int Offset_CThostFtdcReqChangeAccountField_Fax=408;
    /** 电子邮件 */
    static final int Offset_CThostFtdcReqChangeAccountField_EMail=449;
    /** 资金账户状态 */
    static final int Offset_CThostFtdcReqChangeAccountField_MoneyAccountStatus=490;
    /** 银行帐号 */
    static final int Offset_CThostFtdcReqChangeAccountField_BankAccount=491;
    /** 银行密码 */
    static final int Offset_CThostFtdcReqChangeAccountField_BankPassWord=532;
    /** 新银行帐号 */
    static final int Offset_CThostFtdcReqChangeAccountField_NewBankAccount=573;
    /** 新银行密码 */
    static final int Offset_CThostFtdcReqChangeAccountField_NewBankPassWord=614;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcReqChangeAccountField_AccountID=655;
    /** 期货密码 */
    static final int Offset_CThostFtdcReqChangeAccountField_Password=668;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcReqChangeAccountField_BankAccType=709;
    /** 安装编号 */
    static final int Offset_CThostFtdcReqChangeAccountField_InstallID=712;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcReqChangeAccountField_VerifyCertNoFlag=716;
    /** 币种代码 */
    static final int Offset_CThostFtdcReqChangeAccountField_CurrencyID=717;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcReqChangeAccountField_BrokerIDByBank=721;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcReqChangeAccountField_BankPwdFlag=754;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcReqChangeAccountField_SecuPwdFlag=755;
    /** 交易ID */
    static final int Offset_CThostFtdcReqChangeAccountField_TID=756;
    /** 摘要 */
    static final int Offset_CThostFtdcReqChangeAccountField_Digest=760;

    /** 转账请求 */
    static final int SizeOf_CThostFtdcReqTransferField=704;
    /** 业务功能码 */
    static final int Offset_CThostFtdcReqTransferField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcReqTransferField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcReqTransferField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcReqTransferField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcReqTransferField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcReqTransferField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcReqTransferField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcReqTransferField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcReqTransferField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcReqTransferField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcReqTransferField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcReqTransferField_SessionID=108;
    /** 客户姓名 */
    static final int Offset_CThostFtdcReqTransferField_CustomerName=112;
    /** 证件类型 */
    static final int Offset_CThostFtdcReqTransferField_IdCardType=163;
    /** 证件号码 */
    static final int Offset_CThostFtdcReqTransferField_IdentifiedCardNo=164;
    /** 客户类型 */
    static final int Offset_CThostFtdcReqTransferField_CustType=215;
    /** 银行帐号 */
    static final int Offset_CThostFtdcReqTransferField_BankAccount=216;
    /** 银行密码 */
    static final int Offset_CThostFtdcReqTransferField_BankPassWord=257;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcReqTransferField_AccountID=298;
    /** 期货密码 */
    static final int Offset_CThostFtdcReqTransferField_Password=311;
    /** 安装编号 */
    static final int Offset_CThostFtdcReqTransferField_InstallID=352;
    /** 期货公司流水号 */
    static final int Offset_CThostFtdcReqTransferField_FutureSerial=356;
    /** 用户标识 */
    static final int Offset_CThostFtdcReqTransferField_UserID=360;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcReqTransferField_VerifyCertNoFlag=376;
    /** 币种代码 */
    static final int Offset_CThostFtdcReqTransferField_CurrencyID=377;
    /** 转帐金额 */
    static final int Offset_CThostFtdcReqTransferField_TradeAmount=384;
    /** 期货可取金额 */
    static final int Offset_CThostFtdcReqTransferField_FutureFetchAmount=392;
    /** 费用支付标志 */
    static final int Offset_CThostFtdcReqTransferField_FeePayFlag=400;
    /** 应收客户费用 */
    static final int Offset_CThostFtdcReqTransferField_CustFee=408;
    /** 应收期货公司费用 */
    static final int Offset_CThostFtdcReqTransferField_BrokerFee=416;
    /** 发送方给接收方的消息 */
    static final int Offset_CThostFtdcReqTransferField_Message=424;
    /** 摘要 */
    static final int Offset_CThostFtdcReqTransferField_Digest=553;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcReqTransferField_BankAccType=589;
    /** 渠道标志 */
    static final int Offset_CThostFtdcReqTransferField_DeviceID=590;
    /** 期货单位帐号类型 */
    static final int Offset_CThostFtdcReqTransferField_BankSecuAccType=593;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcReqTransferField_BrokerIDByBank=594;
    /** 期货单位帐号 */
    static final int Offset_CThostFtdcReqTransferField_BankSecuAcc=627;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcReqTransferField_BankPwdFlag=668;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcReqTransferField_SecuPwdFlag=669;
    /** 交易柜员 */
    static final int Offset_CThostFtdcReqTransferField_OperNo=670;
    /** 请求编号 */
    static final int Offset_CThostFtdcReqTransferField_RequestID=688;
    /** 交易ID */
    static final int Offset_CThostFtdcReqTransferField_TID=692;
    /** 转账交易状态 */
    static final int Offset_CThostFtdcReqTransferField_TransferStatus=696;

    /** 银行发起银行资金转期货响应 */
    static final int SizeOf_CThostFtdcRspTransferField=792;
    /** 业务功能码 */
    static final int Offset_CThostFtdcRspTransferField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcRspTransferField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcRspTransferField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcRspTransferField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcRspTransferField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcRspTransferField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcRspTransferField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcRspTransferField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcRspTransferField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcRspTransferField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcRspTransferField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcRspTransferField_SessionID=108;
    /** 客户姓名 */
    static final int Offset_CThostFtdcRspTransferField_CustomerName=112;
    /** 证件类型 */
    static final int Offset_CThostFtdcRspTransferField_IdCardType=163;
    /** 证件号码 */
    static final int Offset_CThostFtdcRspTransferField_IdentifiedCardNo=164;
    /** 客户类型 */
    static final int Offset_CThostFtdcRspTransferField_CustType=215;
    /** 银行帐号 */
    static final int Offset_CThostFtdcRspTransferField_BankAccount=216;
    /** 银行密码 */
    static final int Offset_CThostFtdcRspTransferField_BankPassWord=257;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcRspTransferField_AccountID=298;
    /** 期货密码 */
    static final int Offset_CThostFtdcRspTransferField_Password=311;
    /** 安装编号 */
    static final int Offset_CThostFtdcRspTransferField_InstallID=352;
    /** 期货公司流水号 */
    static final int Offset_CThostFtdcRspTransferField_FutureSerial=356;
    /** 用户标识 */
    static final int Offset_CThostFtdcRspTransferField_UserID=360;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcRspTransferField_VerifyCertNoFlag=376;
    /** 币种代码 */
    static final int Offset_CThostFtdcRspTransferField_CurrencyID=377;
    /** 转帐金额 */
    static final int Offset_CThostFtdcRspTransferField_TradeAmount=384;
    /** 期货可取金额 */
    static final int Offset_CThostFtdcRspTransferField_FutureFetchAmount=392;
    /** 费用支付标志 */
    static final int Offset_CThostFtdcRspTransferField_FeePayFlag=400;
    /** 应收客户费用 */
    static final int Offset_CThostFtdcRspTransferField_CustFee=408;
    /** 应收期货公司费用 */
    static final int Offset_CThostFtdcRspTransferField_BrokerFee=416;
    /** 发送方给接收方的消息 */
    static final int Offset_CThostFtdcRspTransferField_Message=424;
    /** 摘要 */
    static final int Offset_CThostFtdcRspTransferField_Digest=553;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcRspTransferField_BankAccType=589;
    /** 渠道标志 */
    static final int Offset_CThostFtdcRspTransferField_DeviceID=590;
    /** 期货单位帐号类型 */
    static final int Offset_CThostFtdcRspTransferField_BankSecuAccType=593;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcRspTransferField_BrokerIDByBank=594;
    /** 期货单位帐号 */
    static final int Offset_CThostFtdcRspTransferField_BankSecuAcc=627;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcRspTransferField_BankPwdFlag=668;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcRspTransferField_SecuPwdFlag=669;
    /** 交易柜员 */
    static final int Offset_CThostFtdcRspTransferField_OperNo=670;
    /** 请求编号 */
    static final int Offset_CThostFtdcRspTransferField_RequestID=688;
    /** 交易ID */
    static final int Offset_CThostFtdcRspTransferField_TID=692;
    /** 转账交易状态 */
    static final int Offset_CThostFtdcRspTransferField_TransferStatus=696;
    /** 错误代码 */
    static final int Offset_CThostFtdcRspTransferField_ErrorID=700;
    /** 错误信息 */
    static final int Offset_CThostFtdcRspTransferField_ErrorMsg=704;

    /** 冲正请求 */
    static final int SizeOf_CThostFtdcReqRepealField=744;
    /** 冲正时间间隔 */
    static final int Offset_CThostFtdcReqRepealField_RepealTimeInterval=0;
    /** 已经冲正次数 */
    static final int Offset_CThostFtdcReqRepealField_RepealedTimes=4;
    /** 银行冲正标志 */
    static final int Offset_CThostFtdcReqRepealField_BankRepealFlag=8;
    /** 期商冲正标志 */
    static final int Offset_CThostFtdcReqRepealField_BrokerRepealFlag=9;
    /** 被冲正平台流水号 */
    static final int Offset_CThostFtdcReqRepealField_PlateRepealSerial=12;
    /** 被冲正银行流水号 */
    static final int Offset_CThostFtdcReqRepealField_BankRepealSerial=16;
    /** 被冲正期货流水号 */
    static final int Offset_CThostFtdcReqRepealField_FutureRepealSerial=32;
    /** 业务功能码 */
    static final int Offset_CThostFtdcReqRepealField_TradeCode=36;
    /** 银行代码 */
    static final int Offset_CThostFtdcReqRepealField_BankID=43;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcReqRepealField_BankBranchID=47;
    /** 期商代码 */
    static final int Offset_CThostFtdcReqRepealField_BrokerID=52;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcReqRepealField_BrokerBranchID=63;
    /** 交易日期 */
    static final int Offset_CThostFtdcReqRepealField_TradeDate=94;
    /** 交易时间 */
    static final int Offset_CThostFtdcReqRepealField_TradeTime=103;
    /** 银行流水号 */
    static final int Offset_CThostFtdcReqRepealField_BankSerial=112;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcReqRepealField_TradingDay=125;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcReqRepealField_PlateSerial=136;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcReqRepealField_LastFragment=140;
    /** 会话号 */
    static final int Offset_CThostFtdcReqRepealField_SessionID=144;
    /** 客户姓名 */
    static final int Offset_CThostFtdcReqRepealField_CustomerName=148;
    /** 证件类型 */
    static final int Offset_CThostFtdcReqRepealField_IdCardType=199;
    /** 证件号码 */
    static final int Offset_CThostFtdcReqRepealField_IdentifiedCardNo=200;
    /** 客户类型 */
    static final int Offset_CThostFtdcReqRepealField_CustType=251;
    /** 银行帐号 */
    static final int Offset_CThostFtdcReqRepealField_BankAccount=252;
    /** 银行密码 */
    static final int Offset_CThostFtdcReqRepealField_BankPassWord=293;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcReqRepealField_AccountID=334;
    /** 期货密码 */
    static final int Offset_CThostFtdcReqRepealField_Password=347;
    /** 安装编号 */
    static final int Offset_CThostFtdcReqRepealField_InstallID=388;
    /** 期货公司流水号 */
    static final int Offset_CThostFtdcReqRepealField_FutureSerial=392;
    /** 用户标识 */
    static final int Offset_CThostFtdcReqRepealField_UserID=396;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcReqRepealField_VerifyCertNoFlag=412;
    /** 币种代码 */
    static final int Offset_CThostFtdcReqRepealField_CurrencyID=413;
    /** 转帐金额 */
    static final int Offset_CThostFtdcReqRepealField_TradeAmount=424;
    /** 期货可取金额 */
    static final int Offset_CThostFtdcReqRepealField_FutureFetchAmount=432;
    /** 费用支付标志 */
    static final int Offset_CThostFtdcReqRepealField_FeePayFlag=440;
    /** 应收客户费用 */
    static final int Offset_CThostFtdcReqRepealField_CustFee=448;
    /** 应收期货公司费用 */
    static final int Offset_CThostFtdcReqRepealField_BrokerFee=456;
    /** 发送方给接收方的消息 */
    static final int Offset_CThostFtdcReqRepealField_Message=464;
    /** 摘要 */
    static final int Offset_CThostFtdcReqRepealField_Digest=593;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcReqRepealField_BankAccType=629;
    /** 渠道标志 */
    static final int Offset_CThostFtdcReqRepealField_DeviceID=630;
    /** 期货单位帐号类型 */
    static final int Offset_CThostFtdcReqRepealField_BankSecuAccType=633;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcReqRepealField_BrokerIDByBank=634;
    /** 期货单位帐号 */
    static final int Offset_CThostFtdcReqRepealField_BankSecuAcc=667;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcReqRepealField_BankPwdFlag=708;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcReqRepealField_SecuPwdFlag=709;
    /** 交易柜员 */
    static final int Offset_CThostFtdcReqRepealField_OperNo=710;
    /** 请求编号 */
    static final int Offset_CThostFtdcReqRepealField_RequestID=728;
    /** 交易ID */
    static final int Offset_CThostFtdcReqRepealField_TID=732;
    /** 转账交易状态 */
    static final int Offset_CThostFtdcReqRepealField_TransferStatus=736;

    /** 冲正响应 */
    static final int SizeOf_CThostFtdcRspRepealField=832;
    /** 冲正时间间隔 */
    static final int Offset_CThostFtdcRspRepealField_RepealTimeInterval=0;
    /** 已经冲正次数 */
    static final int Offset_CThostFtdcRspRepealField_RepealedTimes=4;
    /** 银行冲正标志 */
    static final int Offset_CThostFtdcRspRepealField_BankRepealFlag=8;
    /** 期商冲正标志 */
    static final int Offset_CThostFtdcRspRepealField_BrokerRepealFlag=9;
    /** 被冲正平台流水号 */
    static final int Offset_CThostFtdcRspRepealField_PlateRepealSerial=12;
    /** 被冲正银行流水号 */
    static final int Offset_CThostFtdcRspRepealField_BankRepealSerial=16;
    /** 被冲正期货流水号 */
    static final int Offset_CThostFtdcRspRepealField_FutureRepealSerial=32;
    /** 业务功能码 */
    static final int Offset_CThostFtdcRspRepealField_TradeCode=36;
    /** 银行代码 */
    static final int Offset_CThostFtdcRspRepealField_BankID=43;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcRspRepealField_BankBranchID=47;
    /** 期商代码 */
    static final int Offset_CThostFtdcRspRepealField_BrokerID=52;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcRspRepealField_BrokerBranchID=63;
    /** 交易日期 */
    static final int Offset_CThostFtdcRspRepealField_TradeDate=94;
    /** 交易时间 */
    static final int Offset_CThostFtdcRspRepealField_TradeTime=103;
    /** 银行流水号 */
    static final int Offset_CThostFtdcRspRepealField_BankSerial=112;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcRspRepealField_TradingDay=125;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcRspRepealField_PlateSerial=136;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcRspRepealField_LastFragment=140;
    /** 会话号 */
    static final int Offset_CThostFtdcRspRepealField_SessionID=144;
    /** 客户姓名 */
    static final int Offset_CThostFtdcRspRepealField_CustomerName=148;
    /** 证件类型 */
    static final int Offset_CThostFtdcRspRepealField_IdCardType=199;
    /** 证件号码 */
    static final int Offset_CThostFtdcRspRepealField_IdentifiedCardNo=200;
    /** 客户类型 */
    static final int Offset_CThostFtdcRspRepealField_CustType=251;
    /** 银行帐号 */
    static final int Offset_CThostFtdcRspRepealField_BankAccount=252;
    /** 银行密码 */
    static final int Offset_CThostFtdcRspRepealField_BankPassWord=293;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcRspRepealField_AccountID=334;
    /** 期货密码 */
    static final int Offset_CThostFtdcRspRepealField_Password=347;
    /** 安装编号 */
    static final int Offset_CThostFtdcRspRepealField_InstallID=388;
    /** 期货公司流水号 */
    static final int Offset_CThostFtdcRspRepealField_FutureSerial=392;
    /** 用户标识 */
    static final int Offset_CThostFtdcRspRepealField_UserID=396;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcRspRepealField_VerifyCertNoFlag=412;
    /** 币种代码 */
    static final int Offset_CThostFtdcRspRepealField_CurrencyID=413;
    /** 转帐金额 */
    static final int Offset_CThostFtdcRspRepealField_TradeAmount=424;
    /** 期货可取金额 */
    static final int Offset_CThostFtdcRspRepealField_FutureFetchAmount=432;
    /** 费用支付标志 */
    static final int Offset_CThostFtdcRspRepealField_FeePayFlag=440;
    /** 应收客户费用 */
    static final int Offset_CThostFtdcRspRepealField_CustFee=448;
    /** 应收期货公司费用 */
    static final int Offset_CThostFtdcRspRepealField_BrokerFee=456;
    /** 发送方给接收方的消息 */
    static final int Offset_CThostFtdcRspRepealField_Message=464;
    /** 摘要 */
    static final int Offset_CThostFtdcRspRepealField_Digest=593;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcRspRepealField_BankAccType=629;
    /** 渠道标志 */
    static final int Offset_CThostFtdcRspRepealField_DeviceID=630;
    /** 期货单位帐号类型 */
    static final int Offset_CThostFtdcRspRepealField_BankSecuAccType=633;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcRspRepealField_BrokerIDByBank=634;
    /** 期货单位帐号 */
    static final int Offset_CThostFtdcRspRepealField_BankSecuAcc=667;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcRspRepealField_BankPwdFlag=708;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcRspRepealField_SecuPwdFlag=709;
    /** 交易柜员 */
    static final int Offset_CThostFtdcRspRepealField_OperNo=710;
    /** 请求编号 */
    static final int Offset_CThostFtdcRspRepealField_RequestID=728;
    /** 交易ID */
    static final int Offset_CThostFtdcRspRepealField_TID=732;
    /** 转账交易状态 */
    static final int Offset_CThostFtdcRspRepealField_TransferStatus=736;
    /** 错误代码 */
    static final int Offset_CThostFtdcRspRepealField_ErrorID=740;
    /** 错误信息 */
    static final int Offset_CThostFtdcRspRepealField_ErrorMsg=744;

    /** 查询账户信息请求 */
    static final int SizeOf_CThostFtdcReqQueryAccountField=524;
    /** 业务功能码 */
    static final int Offset_CThostFtdcReqQueryAccountField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcReqQueryAccountField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcReqQueryAccountField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcReqQueryAccountField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcReqQueryAccountField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcReqQueryAccountField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcReqQueryAccountField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcReqQueryAccountField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcReqQueryAccountField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcReqQueryAccountField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcReqQueryAccountField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcReqQueryAccountField_SessionID=108;
    /** 客户姓名 */
    static final int Offset_CThostFtdcReqQueryAccountField_CustomerName=112;
    /** 证件类型 */
    static final int Offset_CThostFtdcReqQueryAccountField_IdCardType=163;
    /** 证件号码 */
    static final int Offset_CThostFtdcReqQueryAccountField_IdentifiedCardNo=164;
    /** 客户类型 */
    static final int Offset_CThostFtdcReqQueryAccountField_CustType=215;
    /** 银行帐号 */
    static final int Offset_CThostFtdcReqQueryAccountField_BankAccount=216;
    /** 银行密码 */
    static final int Offset_CThostFtdcReqQueryAccountField_BankPassWord=257;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcReqQueryAccountField_AccountID=298;
    /** 期货密码 */
    static final int Offset_CThostFtdcReqQueryAccountField_Password=311;
    /** 期货公司流水号 */
    static final int Offset_CThostFtdcReqQueryAccountField_FutureSerial=352;
    /** 安装编号 */
    static final int Offset_CThostFtdcReqQueryAccountField_InstallID=356;
    /** 用户标识 */
    static final int Offset_CThostFtdcReqQueryAccountField_UserID=360;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcReqQueryAccountField_VerifyCertNoFlag=376;
    /** 币种代码 */
    static final int Offset_CThostFtdcReqQueryAccountField_CurrencyID=377;
    /** 摘要 */
    static final int Offset_CThostFtdcReqQueryAccountField_Digest=381;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcReqQueryAccountField_BankAccType=417;
    /** 渠道标志 */
    static final int Offset_CThostFtdcReqQueryAccountField_DeviceID=418;
    /** 期货单位帐号类型 */
    static final int Offset_CThostFtdcReqQueryAccountField_BankSecuAccType=421;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcReqQueryAccountField_BrokerIDByBank=422;
    /** 期货单位帐号 */
    static final int Offset_CThostFtdcReqQueryAccountField_BankSecuAcc=455;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcReqQueryAccountField_BankPwdFlag=496;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcReqQueryAccountField_SecuPwdFlag=497;
    /** 交易柜员 */
    static final int Offset_CThostFtdcReqQueryAccountField_OperNo=498;
    /** 请求编号 */
    static final int Offset_CThostFtdcReqQueryAccountField_RequestID=516;
    /** 交易ID */
    static final int Offset_CThostFtdcReqQueryAccountField_TID=520;

    /** 查询账户信息响应 */
    static final int SizeOf_CThostFtdcRspQueryAccountField=544;
    /** 业务功能码 */
    static final int Offset_CThostFtdcRspQueryAccountField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcRspQueryAccountField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcRspQueryAccountField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcRspQueryAccountField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcRspQueryAccountField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcRspQueryAccountField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcRspQueryAccountField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcRspQueryAccountField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcRspQueryAccountField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcRspQueryAccountField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcRspQueryAccountField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcRspQueryAccountField_SessionID=108;
    /** 客户姓名 */
    static final int Offset_CThostFtdcRspQueryAccountField_CustomerName=112;
    /** 证件类型 */
    static final int Offset_CThostFtdcRspQueryAccountField_IdCardType=163;
    /** 证件号码 */
    static final int Offset_CThostFtdcRspQueryAccountField_IdentifiedCardNo=164;
    /** 客户类型 */
    static final int Offset_CThostFtdcRspQueryAccountField_CustType=215;
    /** 银行帐号 */
    static final int Offset_CThostFtdcRspQueryAccountField_BankAccount=216;
    /** 银行密码 */
    static final int Offset_CThostFtdcRspQueryAccountField_BankPassWord=257;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcRspQueryAccountField_AccountID=298;
    /** 期货密码 */
    static final int Offset_CThostFtdcRspQueryAccountField_Password=311;
    /** 期货公司流水号 */
    static final int Offset_CThostFtdcRspQueryAccountField_FutureSerial=352;
    /** 安装编号 */
    static final int Offset_CThostFtdcRspQueryAccountField_InstallID=356;
    /** 用户标识 */
    static final int Offset_CThostFtdcRspQueryAccountField_UserID=360;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcRspQueryAccountField_VerifyCertNoFlag=376;
    /** 币种代码 */
    static final int Offset_CThostFtdcRspQueryAccountField_CurrencyID=377;
    /** 摘要 */
    static final int Offset_CThostFtdcRspQueryAccountField_Digest=381;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcRspQueryAccountField_BankAccType=417;
    /** 渠道标志 */
    static final int Offset_CThostFtdcRspQueryAccountField_DeviceID=418;
    /** 期货单位帐号类型 */
    static final int Offset_CThostFtdcRspQueryAccountField_BankSecuAccType=421;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcRspQueryAccountField_BrokerIDByBank=422;
    /** 期货单位帐号 */
    static final int Offset_CThostFtdcRspQueryAccountField_BankSecuAcc=455;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcRspQueryAccountField_BankPwdFlag=496;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcRspQueryAccountField_SecuPwdFlag=497;
    /** 交易柜员 */
    static final int Offset_CThostFtdcRspQueryAccountField_OperNo=498;
    /** 请求编号 */
    static final int Offset_CThostFtdcRspQueryAccountField_RequestID=516;
    /** 交易ID */
    static final int Offset_CThostFtdcRspQueryAccountField_TID=520;
    /** 银行可用金额 */
    static final int Offset_CThostFtdcRspQueryAccountField_BankUseAmount=528;
    /** 银行可取金额 */
    static final int Offset_CThostFtdcRspQueryAccountField_BankFetchAmount=536;

    /** 期商签到签退 */
    static final int SizeOf_CThostFtdcFutureSignIOField=236;
    /** 业务功能码 */
    static final int Offset_CThostFtdcFutureSignIOField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcFutureSignIOField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcFutureSignIOField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcFutureSignIOField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcFutureSignIOField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcFutureSignIOField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcFutureSignIOField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcFutureSignIOField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcFutureSignIOField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcFutureSignIOField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcFutureSignIOField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcFutureSignIOField_SessionID=108;
    /** 安装编号 */
    static final int Offset_CThostFtdcFutureSignIOField_InstallID=112;
    /** 用户标识 */
    static final int Offset_CThostFtdcFutureSignIOField_UserID=116;
    /** 摘要 */
    static final int Offset_CThostFtdcFutureSignIOField_Digest=132;
    /** 币种代码 */
    static final int Offset_CThostFtdcFutureSignIOField_CurrencyID=168;
    /** 渠道标志 */
    static final int Offset_CThostFtdcFutureSignIOField_DeviceID=172;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcFutureSignIOField_BrokerIDByBank=175;
    /** 交易柜员 */
    static final int Offset_CThostFtdcFutureSignIOField_OperNo=208;
    /** 请求编号 */
    static final int Offset_CThostFtdcFutureSignIOField_RequestID=228;
    /** 交易ID */
    static final int Offset_CThostFtdcFutureSignIOField_TID=232;

    /** 期商签到响应 */
    static final int SizeOf_CThostFtdcRspFutureSignInField=580;
    /** 业务功能码 */
    static final int Offset_CThostFtdcRspFutureSignInField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcRspFutureSignInField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcRspFutureSignInField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcRspFutureSignInField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcRspFutureSignInField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcRspFutureSignInField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcRspFutureSignInField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcRspFutureSignInField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcRspFutureSignInField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcRspFutureSignInField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcRspFutureSignInField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcRspFutureSignInField_SessionID=108;
    /** 安装编号 */
    static final int Offset_CThostFtdcRspFutureSignInField_InstallID=112;
    /** 用户标识 */
    static final int Offset_CThostFtdcRspFutureSignInField_UserID=116;
    /** 摘要 */
    static final int Offset_CThostFtdcRspFutureSignInField_Digest=132;
    /** 币种代码 */
    static final int Offset_CThostFtdcRspFutureSignInField_CurrencyID=168;
    /** 渠道标志 */
    static final int Offset_CThostFtdcRspFutureSignInField_DeviceID=172;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcRspFutureSignInField_BrokerIDByBank=175;
    /** 交易柜员 */
    static final int Offset_CThostFtdcRspFutureSignInField_OperNo=208;
    /** 请求编号 */
    static final int Offset_CThostFtdcRspFutureSignInField_RequestID=228;
    /** 交易ID */
    static final int Offset_CThostFtdcRspFutureSignInField_TID=232;
    /** 错误代码 */
    static final int Offset_CThostFtdcRspFutureSignInField_ErrorID=236;
    /** 错误信息 */
    static final int Offset_CThostFtdcRspFutureSignInField_ErrorMsg=240;
    /** PIN密钥 */
    static final int Offset_CThostFtdcRspFutureSignInField_PinKey=321;
    /** MAC密钥 */
    static final int Offset_CThostFtdcRspFutureSignInField_MacKey=450;

    /** 期商签退请求 */
    static final int SizeOf_CThostFtdcReqFutureSignOutField=236;
    /** 业务功能码 */
    static final int Offset_CThostFtdcReqFutureSignOutField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcReqFutureSignOutField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcReqFutureSignOutField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcReqFutureSignOutField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcReqFutureSignOutField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcReqFutureSignOutField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcReqFutureSignOutField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcReqFutureSignOutField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcReqFutureSignOutField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcReqFutureSignOutField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcReqFutureSignOutField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcReqFutureSignOutField_SessionID=108;
    /** 安装编号 */
    static final int Offset_CThostFtdcReqFutureSignOutField_InstallID=112;
    /** 用户标识 */
    static final int Offset_CThostFtdcReqFutureSignOutField_UserID=116;
    /** 摘要 */
    static final int Offset_CThostFtdcReqFutureSignOutField_Digest=132;
    /** 币种代码 */
    static final int Offset_CThostFtdcReqFutureSignOutField_CurrencyID=168;
    /** 渠道标志 */
    static final int Offset_CThostFtdcReqFutureSignOutField_DeviceID=172;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcReqFutureSignOutField_BrokerIDByBank=175;
    /** 交易柜员 */
    static final int Offset_CThostFtdcReqFutureSignOutField_OperNo=208;
    /** 请求编号 */
    static final int Offset_CThostFtdcReqFutureSignOutField_RequestID=228;
    /** 交易ID */
    static final int Offset_CThostFtdcReqFutureSignOutField_TID=232;

    /** 期商签退响应 */
    static final int SizeOf_CThostFtdcRspFutureSignOutField=324;
    /** 业务功能码 */
    static final int Offset_CThostFtdcRspFutureSignOutField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcRspFutureSignOutField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcRspFutureSignOutField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcRspFutureSignOutField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcRspFutureSignOutField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcRspFutureSignOutField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcRspFutureSignOutField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcRspFutureSignOutField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcRspFutureSignOutField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcRspFutureSignOutField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcRspFutureSignOutField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcRspFutureSignOutField_SessionID=108;
    /** 安装编号 */
    static final int Offset_CThostFtdcRspFutureSignOutField_InstallID=112;
    /** 用户标识 */
    static final int Offset_CThostFtdcRspFutureSignOutField_UserID=116;
    /** 摘要 */
    static final int Offset_CThostFtdcRspFutureSignOutField_Digest=132;
    /** 币种代码 */
    static final int Offset_CThostFtdcRspFutureSignOutField_CurrencyID=168;
    /** 渠道标志 */
    static final int Offset_CThostFtdcRspFutureSignOutField_DeviceID=172;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcRspFutureSignOutField_BrokerIDByBank=175;
    /** 交易柜员 */
    static final int Offset_CThostFtdcRspFutureSignOutField_OperNo=208;
    /** 请求编号 */
    static final int Offset_CThostFtdcRspFutureSignOutField_RequestID=228;
    /** 交易ID */
    static final int Offset_CThostFtdcRspFutureSignOutField_TID=232;
    /** 错误代码 */
    static final int Offset_CThostFtdcRspFutureSignOutField_ErrorID=236;
    /** 错误信息 */
    static final int Offset_CThostFtdcRspFutureSignOutField_ErrorMsg=240;

    /** 查询指定流水号的交易结果请求 */
    static final int SizeOf_CThostFtdcReqQueryTradeResultBySerialField=448;
    /** 业务功能码 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_SessionID=108;
    /** 流水号 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_Reference=112;
    /** 本流水号发布者的机构类型 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssureType=116;
    /** 本流水号发布者机构编码 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssure=117;
    /** 客户姓名 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_CustomerName=153;
    /** 证件类型 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_IdCardType=204;
    /** 证件号码 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_IdentifiedCardNo=205;
    /** 客户类型 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_CustType=256;
    /** 银行帐号 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_BankAccount=257;
    /** 银行密码 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_BankPassWord=298;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_AccountID=339;
    /** 期货密码 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_Password=352;
    /** 币种代码 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_CurrencyID=393;
    /** 转帐金额 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_TradeAmount=400;
    /** 摘要 */
    static final int Offset_CThostFtdcReqQueryTradeResultBySerialField_Digest=408;

    /** 查询指定流水号的交易结果响应 */
    static final int SizeOf_CThostFtdcRspQueryTradeResultBySerialField=568;
    /** 业务功能码 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_SessionID=108;
    /** 错误代码 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_ErrorID=112;
    /** 错误信息 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_ErrorMsg=116;
    /** 流水号 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_Reference=200;
    /** 本流水号发布者的机构类型 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssureType=204;
    /** 本流水号发布者机构编码 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssure=205;
    /** 原始返回代码 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_OriginReturnCode=241;
    /** 原始返回码描述 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_OriginDescrInfoForReturnCode=248;
    /** 银行帐号 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_BankAccount=377;
    /** 银行密码 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_BankPassWord=418;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_AccountID=459;
    /** 期货密码 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_Password=472;
    /** 币种代码 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_CurrencyID=513;
    /** 转帐金额 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_TradeAmount=520;
    /** 摘要 */
    static final int Offset_CThostFtdcRspQueryTradeResultBySerialField_Digest=528;

    /** 日终文件就绪请求 */
    static final int SizeOf_CThostFtdcReqDayEndFileReadyField=152;
    /** 业务功能码 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_SessionID=108;
    /** 文件业务功能 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_FileBusinessCode=112;
    /** 摘要 */
    static final int Offset_CThostFtdcReqDayEndFileReadyField_Digest=113;

    /** 返回结果 */
    static final int SizeOf_CThostFtdcReturnResultField=136;
    /** 返回代码 */
    static final int Offset_CThostFtdcReturnResultField_ReturnCode=0;
    /** 返回码描述 */
    static final int Offset_CThostFtdcReturnResultField_DescrInfoForReturnCode=7;

    /** 验证期货资金密码 */
    static final int SizeOf_CThostFtdcVerifyFuturePasswordField=260;
    /** 业务功能码 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_SessionID=108;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_AccountID=112;
    /** 期货密码 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_Password=125;
    /** 银行帐号 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_BankAccount=166;
    /** 银行密码 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_BankPassWord=207;
    /** 安装编号 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_InstallID=248;
    /** 交易ID */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_TID=252;
    /** 币种代码 */
    static final int Offset_CThostFtdcVerifyFuturePasswordField_CurrencyID=256;

    /** 验证客户信息 */
    static final int SizeOf_CThostFtdcVerifyCustInfoField=104;
    /** 客户姓名 */
    static final int Offset_CThostFtdcVerifyCustInfoField_CustomerName=0;
    /** 证件类型 */
    static final int Offset_CThostFtdcVerifyCustInfoField_IdCardType=51;
    /** 证件号码 */
    static final int Offset_CThostFtdcVerifyCustInfoField_IdentifiedCardNo=52;
    /** 客户类型 */
    static final int Offset_CThostFtdcVerifyCustInfoField_CustType=103;

    /** 验证期货资金密码和客户信息 */
    static final int SizeOf_CThostFtdcVerifyFuturePasswordAndCustInfoField=162;
    /** 客户姓名 */
    static final int Offset_CThostFtdcVerifyFuturePasswordAndCustInfoField_CustomerName=0;
    /** 证件类型 */
    static final int Offset_CThostFtdcVerifyFuturePasswordAndCustInfoField_IdCardType=51;
    /** 证件号码 */
    static final int Offset_CThostFtdcVerifyFuturePasswordAndCustInfoField_IdentifiedCardNo=52;
    /** 客户类型 */
    static final int Offset_CThostFtdcVerifyFuturePasswordAndCustInfoField_CustType=103;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcVerifyFuturePasswordAndCustInfoField_AccountID=104;
    /** 期货密码 */
    static final int Offset_CThostFtdcVerifyFuturePasswordAndCustInfoField_Password=117;
    /** 币种代码 */
    static final int Offset_CThostFtdcVerifyFuturePasswordAndCustInfoField_CurrencyID=158;

    /** 验证期货资金密码和客户信息 */
    static final int SizeOf_CThostFtdcDepositResultInformField=192;
    /** 出入金流水号，该流水号为银期报盘返回的流水号 */
    static final int Offset_CThostFtdcDepositResultInformField_DepositSeqNo=0;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcDepositResultInformField_BrokerID=15;
    /** 投资者代码 */
    static final int Offset_CThostFtdcDepositResultInformField_InvestorID=26;
    /** 入金金额 */
    static final int Offset_CThostFtdcDepositResultInformField_Deposit=40;
    /** 请求编号 */
    static final int Offset_CThostFtdcDepositResultInformField_RequestID=48;
    /** 返回代码 */
    static final int Offset_CThostFtdcDepositResultInformField_ReturnCode=52;
    /** 返回码描述 */
    static final int Offset_CThostFtdcDepositResultInformField_DescrInfoForReturnCode=59;

    /** 交易核心向银期报盘发出密钥同步请求 */
    static final int SizeOf_CThostFtdcReqSyncKeyField=324;
    /** 业务功能码 */
    static final int Offset_CThostFtdcReqSyncKeyField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcReqSyncKeyField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcReqSyncKeyField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcReqSyncKeyField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcReqSyncKeyField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcReqSyncKeyField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcReqSyncKeyField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcReqSyncKeyField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcReqSyncKeyField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcReqSyncKeyField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcReqSyncKeyField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcReqSyncKeyField_SessionID=108;
    /** 安装编号 */
    static final int Offset_CThostFtdcReqSyncKeyField_InstallID=112;
    /** 用户标识 */
    static final int Offset_CThostFtdcReqSyncKeyField_UserID=116;
    /** 交易核心给银期报盘的消息 */
    static final int Offset_CThostFtdcReqSyncKeyField_Message=132;
    /** 渠道标志 */
    static final int Offset_CThostFtdcReqSyncKeyField_DeviceID=261;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcReqSyncKeyField_BrokerIDByBank=264;
    /** 交易柜员 */
    static final int Offset_CThostFtdcReqSyncKeyField_OperNo=297;
    /** 请求编号 */
    static final int Offset_CThostFtdcReqSyncKeyField_RequestID=316;
    /** 交易ID */
    static final int Offset_CThostFtdcReqSyncKeyField_TID=320;

    /** 交易核心向银期报盘发出密钥同步响应 */
    static final int SizeOf_CThostFtdcRspSyncKeyField=412;
    /** 业务功能码 */
    static final int Offset_CThostFtdcRspSyncKeyField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcRspSyncKeyField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcRspSyncKeyField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcRspSyncKeyField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcRspSyncKeyField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcRspSyncKeyField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcRspSyncKeyField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcRspSyncKeyField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcRspSyncKeyField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcRspSyncKeyField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcRspSyncKeyField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcRspSyncKeyField_SessionID=108;
    /** 安装编号 */
    static final int Offset_CThostFtdcRspSyncKeyField_InstallID=112;
    /** 用户标识 */
    static final int Offset_CThostFtdcRspSyncKeyField_UserID=116;
    /** 交易核心给银期报盘的消息 */
    static final int Offset_CThostFtdcRspSyncKeyField_Message=132;
    /** 渠道标志 */
    static final int Offset_CThostFtdcRspSyncKeyField_DeviceID=261;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcRspSyncKeyField_BrokerIDByBank=264;
    /** 交易柜员 */
    static final int Offset_CThostFtdcRspSyncKeyField_OperNo=297;
    /** 请求编号 */
    static final int Offset_CThostFtdcRspSyncKeyField_RequestID=316;
    /** 交易ID */
    static final int Offset_CThostFtdcRspSyncKeyField_TID=320;
    /** 错误代码 */
    static final int Offset_CThostFtdcRspSyncKeyField_ErrorID=324;
    /** 错误信息 */
    static final int Offset_CThostFtdcRspSyncKeyField_ErrorMsg=328;

    /** 查询账户信息通知 */
    static final int SizeOf_CThostFtdcNotifyQueryAccountField=632;
    /** 业务功能码 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_SessionID=108;
    /** 客户姓名 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_CustomerName=112;
    /** 证件类型 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_IdCardType=163;
    /** 证件号码 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_IdentifiedCardNo=164;
    /** 客户类型 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_CustType=215;
    /** 银行帐号 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BankAccount=216;
    /** 银行密码 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BankPassWord=257;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_AccountID=298;
    /** 期货密码 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_Password=311;
    /** 期货公司流水号 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_FutureSerial=352;
    /** 安装编号 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_InstallID=356;
    /** 用户标识 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_UserID=360;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_VerifyCertNoFlag=376;
    /** 币种代码 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_CurrencyID=377;
    /** 摘要 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_Digest=381;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BankAccType=417;
    /** 渠道标志 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_DeviceID=418;
    /** 期货单位帐号类型 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BankSecuAccType=421;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BrokerIDByBank=422;
    /** 期货单位帐号 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BankSecuAcc=455;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BankPwdFlag=496;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_SecuPwdFlag=497;
    /** 交易柜员 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_OperNo=498;
    /** 请求编号 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_RequestID=516;
    /** 交易ID */
    static final int Offset_CThostFtdcNotifyQueryAccountField_TID=520;
    /** 银行可用金额 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BankUseAmount=528;
    /** 银行可取金额 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_BankFetchAmount=536;
    /** 错误代码 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_ErrorID=544;
    /** 错误信息 */
    static final int Offset_CThostFtdcNotifyQueryAccountField_ErrorMsg=548;

    /** 银期转账交易流水表 */
    static final int SizeOf_CThostFtdcTransferSerialField=416;
    /** 平台流水号 */
    static final int Offset_CThostFtdcTransferSerialField_PlateSerial=0;
    /** 交易发起方日期 */
    static final int Offset_CThostFtdcTransferSerialField_TradeDate=4;
    /** 交易日期 */
    static final int Offset_CThostFtdcTransferSerialField_TradingDay=13;
    /** 交易时间 */
    static final int Offset_CThostFtdcTransferSerialField_TradeTime=22;
    /** 交易代码 */
    static final int Offset_CThostFtdcTransferSerialField_TradeCode=31;
    /** 会话编号 */
    static final int Offset_CThostFtdcTransferSerialField_SessionID=40;
    /** 银行编码 */
    static final int Offset_CThostFtdcTransferSerialField_BankID=44;
    /** 银行分支机构编码 */
    static final int Offset_CThostFtdcTransferSerialField_BankBranchID=48;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcTransferSerialField_BankAccType=53;
    /** 银行帐号 */
    static final int Offset_CThostFtdcTransferSerialField_BankAccount=54;
    /** 银行流水号 */
    static final int Offset_CThostFtdcTransferSerialField_BankSerial=95;
    /** 期货公司编码 */
    static final int Offset_CThostFtdcTransferSerialField_BrokerID=108;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcTransferSerialField_BrokerBranchID=119;
    /** 期货公司帐号类型 */
    static final int Offset_CThostFtdcTransferSerialField_FutureAccType=150;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcTransferSerialField_AccountID=151;
    /** 投资者代码 */
    static final int Offset_CThostFtdcTransferSerialField_InvestorID=164;
    /** 期货公司流水号 */
    static final int Offset_CThostFtdcTransferSerialField_FutureSerial=180;
    /** 证件类型 */
    static final int Offset_CThostFtdcTransferSerialField_IdCardType=184;
    /** 证件号码 */
    static final int Offset_CThostFtdcTransferSerialField_IdentifiedCardNo=185;
    /** 币种代码 */
    static final int Offset_CThostFtdcTransferSerialField_CurrencyID=236;
    /** 交易金额 */
    static final int Offset_CThostFtdcTransferSerialField_TradeAmount=240;
    /** 应收客户费用 */
    static final int Offset_CThostFtdcTransferSerialField_CustFee=248;
    /** 应收期货公司费用 */
    static final int Offset_CThostFtdcTransferSerialField_BrokerFee=256;
    /** 有效标志 */
    static final int Offset_CThostFtdcTransferSerialField_AvailabilityFlag=264;
    /** 操作员 */
    static final int Offset_CThostFtdcTransferSerialField_OperatorCode=265;
    /** 新银行帐号 */
    static final int Offset_CThostFtdcTransferSerialField_BankNewAccount=282;
    /** 错误代码 */
    static final int Offset_CThostFtdcTransferSerialField_ErrorID=324;
    /** 错误信息 */
    static final int Offset_CThostFtdcTransferSerialField_ErrorMsg=328;

    /** 请求查询转帐流水 */
    static final int SizeOf_CThostFtdcQryTransferSerialField=32;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryTransferSerialField_BrokerID=0;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcQryTransferSerialField_AccountID=11;
    /** 银行编码 */
    static final int Offset_CThostFtdcQryTransferSerialField_BankID=24;
    /** 币种代码 */
    static final int Offset_CThostFtdcQryTransferSerialField_CurrencyID=28;

    /** 期商签到通知 */
    static final int SizeOf_CThostFtdcNotifyFutureSignInField=580;
    /** 业务功能码 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_SessionID=108;
    /** 安装编号 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_InstallID=112;
    /** 用户标识 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_UserID=116;
    /** 摘要 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_Digest=132;
    /** 币种代码 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_CurrencyID=168;
    /** 渠道标志 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_DeviceID=172;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_BrokerIDByBank=175;
    /** 交易柜员 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_OperNo=208;
    /** 请求编号 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_RequestID=228;
    /** 交易ID */
    static final int Offset_CThostFtdcNotifyFutureSignInField_TID=232;
    /** 错误代码 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_ErrorID=236;
    /** 错误信息 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_ErrorMsg=240;
    /** PIN密钥 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_PinKey=321;
    /** MAC密钥 */
    static final int Offset_CThostFtdcNotifyFutureSignInField_MacKey=450;

    /** 期商签退通知 */
    static final int SizeOf_CThostFtdcNotifyFutureSignOutField=324;
    /** 业务功能码 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_SessionID=108;
    /** 安装编号 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_InstallID=112;
    /** 用户标识 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_UserID=116;
    /** 摘要 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_Digest=132;
    /** 币种代码 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_CurrencyID=168;
    /** 渠道标志 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_DeviceID=172;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_BrokerIDByBank=175;
    /** 交易柜员 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_OperNo=208;
    /** 请求编号 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_RequestID=228;
    /** 交易ID */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_TID=232;
    /** 错误代码 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_ErrorID=236;
    /** 错误信息 */
    static final int Offset_CThostFtdcNotifyFutureSignOutField_ErrorMsg=240;

    /** 交易核心向银期报盘发出密钥同步处理结果的通知 */
    static final int SizeOf_CThostFtdcNotifySyncKeyField=412;
    /** 业务功能码 */
    static final int Offset_CThostFtdcNotifySyncKeyField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcNotifySyncKeyField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcNotifySyncKeyField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcNotifySyncKeyField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcNotifySyncKeyField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcNotifySyncKeyField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcNotifySyncKeyField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcNotifySyncKeyField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcNotifySyncKeyField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcNotifySyncKeyField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcNotifySyncKeyField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcNotifySyncKeyField_SessionID=108;
    /** 安装编号 */
    static final int Offset_CThostFtdcNotifySyncKeyField_InstallID=112;
    /** 用户标识 */
    static final int Offset_CThostFtdcNotifySyncKeyField_UserID=116;
    /** 交易核心给银期报盘的消息 */
    static final int Offset_CThostFtdcNotifySyncKeyField_Message=132;
    /** 渠道标志 */
    static final int Offset_CThostFtdcNotifySyncKeyField_DeviceID=261;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcNotifySyncKeyField_BrokerIDByBank=264;
    /** 交易柜员 */
    static final int Offset_CThostFtdcNotifySyncKeyField_OperNo=297;
    /** 请求编号 */
    static final int Offset_CThostFtdcNotifySyncKeyField_RequestID=316;
    /** 交易ID */
    static final int Offset_CThostFtdcNotifySyncKeyField_TID=320;
    /** 错误代码 */
    static final int Offset_CThostFtdcNotifySyncKeyField_ErrorID=324;
    /** 错误信息 */
    static final int Offset_CThostFtdcNotifySyncKeyField_ErrorMsg=328;

    /** 请求查询银期签约关系 */
    static final int SizeOf_CThostFtdcQryAccountregisterField=37;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryAccountregisterField_BrokerID=0;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcQryAccountregisterField_AccountID=11;
    /** 银行编码 */
    static final int Offset_CThostFtdcQryAccountregisterField_BankID=24;
    /** 银行分支机构编码 */
    static final int Offset_CThostFtdcQryAccountregisterField_BankBranchID=28;
    /** 币种代码 */
    static final int Offset_CThostFtdcQryAccountregisterField_CurrencyID=33;

    /** 客户开销户信息表 */
    static final int SizeOf_CThostFtdcAccountregisterField=248;
    /** 交易日期 */
    static final int Offset_CThostFtdcAccountregisterField_TradeDay=0;
    /** 银行编码 */
    static final int Offset_CThostFtdcAccountregisterField_BankID=9;
    /** 银行分支机构编码 */
    static final int Offset_CThostFtdcAccountregisterField_BankBranchID=13;
    /** 银行帐号 */
    static final int Offset_CThostFtdcAccountregisterField_BankAccount=18;
    /** 期货公司编码 */
    static final int Offset_CThostFtdcAccountregisterField_BrokerID=59;
    /** 期货公司分支机构编码 */
    static final int Offset_CThostFtdcAccountregisterField_BrokerBranchID=70;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcAccountregisterField_AccountID=101;
    /** 证件类型 */
    static final int Offset_CThostFtdcAccountregisterField_IdCardType=114;
    /** 证件号码 */
    static final int Offset_CThostFtdcAccountregisterField_IdentifiedCardNo=115;
    /** 客户姓名 */
    static final int Offset_CThostFtdcAccountregisterField_CustomerName=166;
    /** 币种代码 */
    static final int Offset_CThostFtdcAccountregisterField_CurrencyID=217;
    /** 开销户类别 */
    static final int Offset_CThostFtdcAccountregisterField_OpenOrDestroy=221;
    /** 签约日期 */
    static final int Offset_CThostFtdcAccountregisterField_RegDate=222;
    /** 解约日期 */
    static final int Offset_CThostFtdcAccountregisterField_OutDate=231;
    /** 交易ID */
    static final int Offset_CThostFtdcAccountregisterField_TID=240;
    /** 客户类型 */
    static final int Offset_CThostFtdcAccountregisterField_CustType=244;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcAccountregisterField_BankAccType=245;

    /** 银期开户信息 */
    static final int SizeOf_CThostFtdcOpenAccountField=880;
    /** 业务功能码 */
    static final int Offset_CThostFtdcOpenAccountField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcOpenAccountField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcOpenAccountField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcOpenAccountField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcOpenAccountField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcOpenAccountField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcOpenAccountField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcOpenAccountField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcOpenAccountField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcOpenAccountField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcOpenAccountField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcOpenAccountField_SessionID=108;
    /** 客户姓名 */
    static final int Offset_CThostFtdcOpenAccountField_CustomerName=112;
    /** 证件类型 */
    static final int Offset_CThostFtdcOpenAccountField_IdCardType=163;
    /** 证件号码 */
    static final int Offset_CThostFtdcOpenAccountField_IdentifiedCardNo=164;
    /** 性别 */
    static final int Offset_CThostFtdcOpenAccountField_Gender=215;
    /** 国家代码 */
    static final int Offset_CThostFtdcOpenAccountField_CountryCode=216;
    /** 客户类型 */
    static final int Offset_CThostFtdcOpenAccountField_CustType=237;
    /** 地址 */
    static final int Offset_CThostFtdcOpenAccountField_Address=238;
    /** 邮编 */
    static final int Offset_CThostFtdcOpenAccountField_ZipCode=339;
    /** 电话号码 */
    static final int Offset_CThostFtdcOpenAccountField_Telephone=346;
    /** 手机 */
    static final int Offset_CThostFtdcOpenAccountField_MobilePhone=387;
    /** 传真 */
    static final int Offset_CThostFtdcOpenAccountField_Fax=408;
    /** 电子邮件 */
    static final int Offset_CThostFtdcOpenAccountField_EMail=449;
    /** 资金账户状态 */
    static final int Offset_CThostFtdcOpenAccountField_MoneyAccountStatus=490;
    /** 银行帐号 */
    static final int Offset_CThostFtdcOpenAccountField_BankAccount=491;
    /** 银行密码 */
    static final int Offset_CThostFtdcOpenAccountField_BankPassWord=532;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcOpenAccountField_AccountID=573;
    /** 期货密码 */
    static final int Offset_CThostFtdcOpenAccountField_Password=586;
    /** 安装编号 */
    static final int Offset_CThostFtdcOpenAccountField_InstallID=628;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcOpenAccountField_VerifyCertNoFlag=632;
    /** 币种代码 */
    static final int Offset_CThostFtdcOpenAccountField_CurrencyID=633;
    /** 汇钞标志 */
    static final int Offset_CThostFtdcOpenAccountField_CashExchangeCode=637;
    /** 摘要 */
    static final int Offset_CThostFtdcOpenAccountField_Digest=638;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcOpenAccountField_BankAccType=674;
    /** 渠道标志 */
    static final int Offset_CThostFtdcOpenAccountField_DeviceID=675;
    /** 期货单位帐号类型 */
    static final int Offset_CThostFtdcOpenAccountField_BankSecuAccType=678;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcOpenAccountField_BrokerIDByBank=679;
    /** 期货单位帐号 */
    static final int Offset_CThostFtdcOpenAccountField_BankSecuAcc=712;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcOpenAccountField_BankPwdFlag=753;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcOpenAccountField_SecuPwdFlag=754;
    /** 交易柜员 */
    static final int Offset_CThostFtdcOpenAccountField_OperNo=755;
    /** 交易ID */
    static final int Offset_CThostFtdcOpenAccountField_TID=772;
    /** 用户标识 */
    static final int Offset_CThostFtdcOpenAccountField_UserID=776;
    /** 错误代码 */
    static final int Offset_CThostFtdcOpenAccountField_ErrorID=792;
    /** 错误信息 */
    static final int Offset_CThostFtdcOpenAccountField_ErrorMsg=796;

    /** 银期销户信息 */
    static final int SizeOf_CThostFtdcCancelAccountField=880;
    /** 业务功能码 */
    static final int Offset_CThostFtdcCancelAccountField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcCancelAccountField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcCancelAccountField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcCancelAccountField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcCancelAccountField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcCancelAccountField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcCancelAccountField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcCancelAccountField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcCancelAccountField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcCancelAccountField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcCancelAccountField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcCancelAccountField_SessionID=108;
    /** 客户姓名 */
    static final int Offset_CThostFtdcCancelAccountField_CustomerName=112;
    /** 证件类型 */
    static final int Offset_CThostFtdcCancelAccountField_IdCardType=163;
    /** 证件号码 */
    static final int Offset_CThostFtdcCancelAccountField_IdentifiedCardNo=164;
    /** 性别 */
    static final int Offset_CThostFtdcCancelAccountField_Gender=215;
    /** 国家代码 */
    static final int Offset_CThostFtdcCancelAccountField_CountryCode=216;
    /** 客户类型 */
    static final int Offset_CThostFtdcCancelAccountField_CustType=237;
    /** 地址 */
    static final int Offset_CThostFtdcCancelAccountField_Address=238;
    /** 邮编 */
    static final int Offset_CThostFtdcCancelAccountField_ZipCode=339;
    /** 电话号码 */
    static final int Offset_CThostFtdcCancelAccountField_Telephone=346;
    /** 手机 */
    static final int Offset_CThostFtdcCancelAccountField_MobilePhone=387;
    /** 传真 */
    static final int Offset_CThostFtdcCancelAccountField_Fax=408;
    /** 电子邮件 */
    static final int Offset_CThostFtdcCancelAccountField_EMail=449;
    /** 资金账户状态 */
    static final int Offset_CThostFtdcCancelAccountField_MoneyAccountStatus=490;
    /** 银行帐号 */
    static final int Offset_CThostFtdcCancelAccountField_BankAccount=491;
    /** 银行密码 */
    static final int Offset_CThostFtdcCancelAccountField_BankPassWord=532;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcCancelAccountField_AccountID=573;
    /** 期货密码 */
    static final int Offset_CThostFtdcCancelAccountField_Password=586;
    /** 安装编号 */
    static final int Offset_CThostFtdcCancelAccountField_InstallID=628;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcCancelAccountField_VerifyCertNoFlag=632;
    /** 币种代码 */
    static final int Offset_CThostFtdcCancelAccountField_CurrencyID=633;
    /** 汇钞标志 */
    static final int Offset_CThostFtdcCancelAccountField_CashExchangeCode=637;
    /** 摘要 */
    static final int Offset_CThostFtdcCancelAccountField_Digest=638;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcCancelAccountField_BankAccType=674;
    /** 渠道标志 */
    static final int Offset_CThostFtdcCancelAccountField_DeviceID=675;
    /** 期货单位帐号类型 */
    static final int Offset_CThostFtdcCancelAccountField_BankSecuAccType=678;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcCancelAccountField_BrokerIDByBank=679;
    /** 期货单位帐号 */
    static final int Offset_CThostFtdcCancelAccountField_BankSecuAcc=712;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcCancelAccountField_BankPwdFlag=753;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcCancelAccountField_SecuPwdFlag=754;
    /** 交易柜员 */
    static final int Offset_CThostFtdcCancelAccountField_OperNo=755;
    /** 交易ID */
    static final int Offset_CThostFtdcCancelAccountField_TID=772;
    /** 用户标识 */
    static final int Offset_CThostFtdcCancelAccountField_UserID=776;
    /** 错误代码 */
    static final int Offset_CThostFtdcCancelAccountField_ErrorID=792;
    /** 错误信息 */
    static final int Offset_CThostFtdcCancelAccountField_ErrorMsg=796;

    /** 银期变更银行账号信息 */
    static final int SizeOf_CThostFtdcChangeAccountField=884;
    /** 业务功能码 */
    static final int Offset_CThostFtdcChangeAccountField_TradeCode=0;
    /** 银行代码 */
    static final int Offset_CThostFtdcChangeAccountField_BankID=7;
    /** 银行分支机构代码 */
    static final int Offset_CThostFtdcChangeAccountField_BankBranchID=11;
    /** 期商代码 */
    static final int Offset_CThostFtdcChangeAccountField_BrokerID=16;
    /** 期商分支机构代码 */
    static final int Offset_CThostFtdcChangeAccountField_BrokerBranchID=27;
    /** 交易日期 */
    static final int Offset_CThostFtdcChangeAccountField_TradeDate=58;
    /** 交易时间 */
    static final int Offset_CThostFtdcChangeAccountField_TradeTime=67;
    /** 银行流水号 */
    static final int Offset_CThostFtdcChangeAccountField_BankSerial=76;
    /** 交易系统日期 */
    static final int Offset_CThostFtdcChangeAccountField_TradingDay=89;
    /** 银期平台消息流水号 */
    static final int Offset_CThostFtdcChangeAccountField_PlateSerial=100;
    /** 最后分片标志 */
    static final int Offset_CThostFtdcChangeAccountField_LastFragment=104;
    /** 会话号 */
    static final int Offset_CThostFtdcChangeAccountField_SessionID=108;
    /** 客户姓名 */
    static final int Offset_CThostFtdcChangeAccountField_CustomerName=112;
    /** 证件类型 */
    static final int Offset_CThostFtdcChangeAccountField_IdCardType=163;
    /** 证件号码 */
    static final int Offset_CThostFtdcChangeAccountField_IdentifiedCardNo=164;
    /** 性别 */
    static final int Offset_CThostFtdcChangeAccountField_Gender=215;
    /** 国家代码 */
    static final int Offset_CThostFtdcChangeAccountField_CountryCode=216;
    /** 客户类型 */
    static final int Offset_CThostFtdcChangeAccountField_CustType=237;
    /** 地址 */
    static final int Offset_CThostFtdcChangeAccountField_Address=238;
    /** 邮编 */
    static final int Offset_CThostFtdcChangeAccountField_ZipCode=339;
    /** 电话号码 */
    static final int Offset_CThostFtdcChangeAccountField_Telephone=346;
    /** 手机 */
    static final int Offset_CThostFtdcChangeAccountField_MobilePhone=387;
    /** 传真 */
    static final int Offset_CThostFtdcChangeAccountField_Fax=408;
    /** 电子邮件 */
    static final int Offset_CThostFtdcChangeAccountField_EMail=449;
    /** 资金账户状态 */
    static final int Offset_CThostFtdcChangeAccountField_MoneyAccountStatus=490;
    /** 银行帐号 */
    static final int Offset_CThostFtdcChangeAccountField_BankAccount=491;
    /** 银行密码 */
    static final int Offset_CThostFtdcChangeAccountField_BankPassWord=532;
    /** 新银行帐号 */
    static final int Offset_CThostFtdcChangeAccountField_NewBankAccount=573;
    /** 新银行密码 */
    static final int Offset_CThostFtdcChangeAccountField_NewBankPassWord=614;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcChangeAccountField_AccountID=655;
    /** 期货密码 */
    static final int Offset_CThostFtdcChangeAccountField_Password=668;
    /** 银行帐号类型 */
    static final int Offset_CThostFtdcChangeAccountField_BankAccType=709;
    /** 安装编号 */
    static final int Offset_CThostFtdcChangeAccountField_InstallID=712;
    /** 验证客户证件号码标志 */
    static final int Offset_CThostFtdcChangeAccountField_VerifyCertNoFlag=716;
    /** 币种代码 */
    static final int Offset_CThostFtdcChangeAccountField_CurrencyID=717;
    /** 期货公司银行编码 */
    static final int Offset_CThostFtdcChangeAccountField_BrokerIDByBank=721;
    /** 银行密码标志 */
    static final int Offset_CThostFtdcChangeAccountField_BankPwdFlag=754;
    /** 期货资金密码核对标志 */
    static final int Offset_CThostFtdcChangeAccountField_SecuPwdFlag=755;
    /** 交易ID */
    static final int Offset_CThostFtdcChangeAccountField_TID=756;
    /** 摘要 */
    static final int Offset_CThostFtdcChangeAccountField_Digest=760;
    /** 错误代码 */
    static final int Offset_CThostFtdcChangeAccountField_ErrorID=796;
    /** 错误信息 */
    static final int Offset_CThostFtdcChangeAccountField_ErrorMsg=800;

    /** 二级代理操作员银期权限 */
    static final int SizeOf_CThostFtdcSecAgentACIDMapField=57;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcSecAgentACIDMapField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcSecAgentACIDMapField_UserID=11;
    /** 资金账户 */
    static final int Offset_CThostFtdcSecAgentACIDMapField_AccountID=27;
    /** 币种 */
    static final int Offset_CThostFtdcSecAgentACIDMapField_CurrencyID=40;
    /** 境外中介机构资金帐号 */
    static final int Offset_CThostFtdcSecAgentACIDMapField_BrokerSecAgentID=44;

    /** 二级代理操作员银期权限查询 */
    static final int SizeOf_CThostFtdcQrySecAgentACIDMapField=44;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQrySecAgentACIDMapField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcQrySecAgentACIDMapField_UserID=11;
    /** 资金账户 */
    static final int Offset_CThostFtdcQrySecAgentACIDMapField_AccountID=27;
    /** 币种 */
    static final int Offset_CThostFtdcQrySecAgentACIDMapField_CurrencyID=40;

    /** 灾备中心交易权限 */
    static final int SizeOf_CThostFtdcUserRightsAssignField=32;
    /** 应用单元代码 */
    static final int Offset_CThostFtdcUserRightsAssignField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcUserRightsAssignField_UserID=11;
    /** 交易中心代码 */
    static final int Offset_CThostFtdcUserRightsAssignField_DRIdentityID=28;

    /** 经济公司是否有在本标示的交易权限 */
    static final int SizeOf_CThostFtdcBrokerUserRightAssignField=20;
    /** 应用单元代码 */
    static final int Offset_CThostFtdcBrokerUserRightAssignField_BrokerID=0;
    /** 交易中心代码 */
    static final int Offset_CThostFtdcBrokerUserRightAssignField_DRIdentityID=12;
    /** 能否交易 */
    static final int Offset_CThostFtdcBrokerUserRightAssignField_Tradeable=16;

    /** 灾备交易转换报文 */
    static final int SizeOf_CThostFtdcDRTransferField=32;
    /** 原交易中心代码 */
    static final int Offset_CThostFtdcDRTransferField_OrigDRIdentityID=0;
    /** 目标交易中心代码 */
    static final int Offset_CThostFtdcDRTransferField_DestDRIdentityID=4;
    /** 原应用单元代码 */
    static final int Offset_CThostFtdcDRTransferField_OrigBrokerID=8;
    /** 目标易用单元代码 */
    static final int Offset_CThostFtdcDRTransferField_DestBrokerID=19;

    /** Fens用户信息 */
    static final int SizeOf_CThostFtdcFensUserInfoField=28;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcFensUserInfoField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcFensUserInfoField_UserID=11;
    /** 登录模式 */
    static final int Offset_CThostFtdcFensUserInfoField_LoginMode=27;

    /** 当前银期所属交易中心 */
    static final int SizeOf_CThostFtdcCurrTransferIdentityField=4;
    /** 交易中心代码 */
    static final int Offset_CThostFtdcCurrTransferIdentityField_IdentityID=0;

    /** 禁止登录用户 */
    static final int SizeOf_CThostFtdcLoginForbiddenUserField=27;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcLoginForbiddenUserField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcLoginForbiddenUserField_UserID=11;

    /** 查询禁止登录用户 */
    static final int SizeOf_CThostFtdcQryLoginForbiddenUserField=27;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcQryLoginForbiddenUserField_BrokerID=0;
    /** 用户代码 */
    static final int Offset_CThostFtdcQryLoginForbiddenUserField_UserID=11;

    /** UDP组播组信息 */
    static final int SizeOf_CThostFtdcMulticastGroupInfoField=36;
    /** 组播组IP地址 */
    static final int Offset_CThostFtdcMulticastGroupInfoField_GroupIP=0;
    /** 组播组IP端口 */
    static final int Offset_CThostFtdcMulticastGroupInfoField_GroupPort=16;
    /** 源地址 */
    static final int Offset_CThostFtdcMulticastGroupInfoField_SourceIP=20;

    /** 资金账户基本准备金 */
    static final int SizeOf_CThostFtdcTradingAccountReserveField=40;
    /** 经纪公司代码 */
    static final int Offset_CThostFtdcTradingAccountReserveField_BrokerID=0;
    /** 投资者帐号 */
    static final int Offset_CThostFtdcTradingAccountReserveField_AccountID=11;
    /** 基本准备金 */
    static final int Offset_CThostFtdcTradingAccountReserveField_Reserve=24;
    /** 币种代码 */
    static final int Offset_CThostFtdcTradingAccountReserveField_CurrencyID=32;
}
