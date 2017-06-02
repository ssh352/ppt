

google.load("visualization", "1.1", { packages: ["table", "corechart", "bar", "annotationchart", "motionchart", "annotatedtimeline", "line"] });
google.setOnLoadCallback(googlefinish);

var G_STRING_UNICODE_KEYS = new Array();
G_STRING_UNICODE_KEYS.push("IndustryName");
G_STRING_UNICODE_KEYS.push("FirstIndustryName");
G_STRING_UNICODE_KEYS.push("securityname");
G_STRING_UNICODE_KEYS.push("sec_name");


var G_STRING_KEYS = new Array();
G_STRING_KEYS.push("limit");
G_STRING_KEYS.push("bOpenDate");
G_STRING_KEYS.push("bcode");
G_STRING_KEYS.push("code");
G_STRING_KEYS.push("sname");
G_STRING_KEYS.push("FirstIndustryName");
G_STRING_KEYS.push("scode");
G_STRING_KEYS.push("securityname");
G_STRING_KEYS.push("Industry");
G_STRING_KEYS.push("Industry");
G_STRING_KEYS.push("call_code");
G_STRING_KEYS.push("put_code");
G_STRING_KEYS.push("entryname");
G_STRING_KEYS.push("startdatetime");
G_STRING_KEYS.push("enddatetime");
G_STRING_KEYS.push("result");
G_STRING_KEYS.push("remark");
G_STRING_KEYS.push("sdate");
G_STRING_KEYS.push("SecurityName");
G_STRING_KEYS.push("incode");
G_STRING_KEYS.push("theme");
G_STRING_KEYS.push("industrycode");
G_STRING_KEYS.push("name");
G_STRING_KEYS.push("wind_code");
G_STRING_KEYS.push("sec_name");
G_STRING_KEYS.push("SEC_NAME");
G_STRING_KEYS.push("CODE");
G_STRING_KEYS.push("indexname");
G_STRING_KEYS.push("period");
G_STRING_KEYS.push("objname");
G_STRING_KEYS.push("MDDStartDate");
G_STRING_KEYS.push("MDDEndDate");
G_STRING_KEYS.push("updatedate");
G_STRING_KEYS.push("Strategy");
G_STRING_KEYS.push("RT_DATE");
G_STRING_KEYS.push("TRADE_dt");
G_STRING_KEYS.push("S_INFO_WINDCODE");
G_STRING_KEYS.push("s_info_windcode");
G_STRING_KEYS.push("s_info_name");
G_STRING_KEYS.push("change_Dt");
G_STRING_KEYS.push("S_TYPNAME");
G_STRING_KEYS.push("ANN_DT");
G_STRING_KEYS.push("TRADE_DT");
G_STRING_KEYS.push("5MDDStartDate");
G_STRING_KEYS.push("10MDDStartDate");
G_STRING_KEYS.push("5MDDEndDate");
G_STRING_KEYS.push("10MDDEndDate");
G_STRING_KEYS.push("type");
G_STRING_KEYS.push("portsname");
G_STRING_KEYS.push("YYYYMM");
G_STRING_KEYS.push("TRANSACT_STARTDATE");
G_STRING_KEYS.push("TRANSACT_ENDDATE");
G_STRING_KEYS.push("tdate");
G_STRING_KEYS.push("BM");
G_STRING_KEYS.push("FUND_TRACKINDEXCODE");
G_STRING_KEYS.push("FUND_BENCHMARK");
G_STRING_KEYS.push("FUND_BENCHINDEXCODE");
G_STRING_KEYS.push("FUND_FUNDMANAGER");
G_STRING_KEYS.push("FUND_MGRCOMP");
G_STRING_KEYS.push("IPO_DATE");
G_STRING_KEYS.push("TradeDate");





// G_STRING_KEYS.push("RT_TRADE_STATUS");
// G_STRING_KEYS.push("RT_TIME");

var G_LOGIN = true;
var G_WARN_MSG = "please login first";
var STRATEGY_HEDGE_INDEX = {
	DY01: 		'000905.SH',
	DY02: 		'000905.SH',
	DZ01: 		'000905.SH',
	DZ02: 		'000905.SH',
	ZC01: 		'000905.SH',
	ZC02: 		'000905.SH',
	DYAlpha01: 	'000905.SH',
	GX01: 		'000016.SH',
	JX01: 		'000905.SH',
	JX02: 		'000300.SH',
	JX03: 		'000905.SH',
	YH01: 		'000300.SH',
	YH02: 		'000905.SH',
	YH03: 		'000300.SH',
	YH04: 		'000016.SH',
	YH05: 		'000016.SH',	
	YH06: 		'000016.SH',
	YH07: 		'000300.SH',
	IndL01: 	'000905.SH',
	NECON01: 	'000905.SH',
	MIX02: 		'000905.SH',
	JL02: 		'000905.SH',
	LZ02: 		'000905.SH',
	GSZ02: 		'000905.SH',
	CXG01:		'000905.SH',
	CXG02:		'000905.SH'
}

var G_KEY_NAMES = {
	tradeamt:				"tradeamt(万)",
	amt30:					"amt30(万)",
	total_unit:				"total_unit(亿)",
	FUND_TRACKINDEXCODE: 	"TraceIndexCode",
	FUND_BENCHMARK: 		"BenckMark",
	FUND_BENCHINDEXCODE: 	"BenckMarkID",
	FUND_FUNDMANAGER: 		"FundManager",
	FUND_MGRCOMP: 			"FundMComp",
	wt1:					"WT1(%)",
	wt2:					"WT2(%)",
	MDDSince4M:				"MDDSince4M(%)",
	SinceFund:				"MDDSinceFund(%)",
	limit:					"MDD Limit(%)",
	TRANSACT_STARTDATE:		"TRSCT SD",
	TRANSACT_ENDDATE:		"TRSCT ED",
	TRANSACT_QUANTITY:		"TRSCT QUANTITY(10k)",
	TRANSACT_AMOUNT:		"TRSCT AMT(10k)",
	portsname:				"ProdName",
	StockTradeAmount:		"S TAMT",
	FutureTradeAmount:		"F TAMT",
	YTDStockTradeAmt:		"YTD STAMT",
	YTDStockTurnOver:		"YTD STO",
	YTDFutureTradeAmt:		"YTD FTAMT",
	YTDFutureTurnOver:		"YTD FTO",
	type:					"Type",
	turnover:				"TO(%)",
	TurnOver:				"TO(%)",
	StockTurnover:			"STO(%)",
	MeanStockTurnOver:		"M STO(%)",
	FutureTurnover:			"FTO(%)",
	MeanFutureTurnOver:		"M FTO(%)",
	lastnav:				"L NAV",
	TRADE_DT:				"Date",
	holding:				"Holdings",
	SEC_NAME:				"SecName",
	clearprice:				"ClearPrice",				
	Actual:					"Actual",
	zuhegongxian:			"Port CB(%)",
	ANN_DT:					"ANN DT",
	CHG_Since_Change:		"CHG_Since_Change(%)",
	S_INFO_WINDCODE:		"SecCode",
	s_info_windcode:		"SecCode",
	s_info_name:			"SecName",
	TRADE_dt:				"Date",
	change_Dt:				"CHG DT",
	CHANGE_VOLUME:			"CHG VOL(10k)",
	CHANGE_amount:			"CHG AMT(10k)",
	TRADE_AVG_PRICE:		"AVG PRICE",
	TRADE_AVG_ADJPRICE:		"AVG ADJPRICE",
	S_TYPNAME:				"TypeName",
	RT_TRADE_STATUS:		"TradeStatus",
	bOpenDate:              "bOpenDT",
	bcode:                  "BCode",
	code:                   "SecCode",
	CODE:					"SecCode",
	sname:                  "SName",
	remark:                 "Remark",
	FirstIndustryName:      "FirstIndustry",
	scode:                  "SCode",
	securityname:           "SecName",
	name:           		"SecName",
	weight:                 "WT(%)",
	TraceErr:               "T Err",
	Nsecurity:              "Stock Num",
	style: 					"Style",
	size: 					"Size",
	value1: 				"Value1",
	value2: 				"Value2",
	reversal: 				"Reversal",
	quality: 				"Quality",
	momentum: 				"Momentum",
	growth: 				"Growth",
	analyst: 				"Analyst",
	basis: 					"Bas",
	nihezhishu: 			"拟合指数",
	nihejicha: "拟合基差",
	entryname: 'EntryName',
	startdatetime: 'S DT',
	enddatetime : 'E DT',
	result: 'Result',
	remark: 'Remark',
	sdate: 'Sdate',
	updatedate: 'UP Date',
	date:	'Date',	
	stockcount:	'Stock Num',
	SecurityName: 'SecName',
	shares: 'Holdings',
	Costpx: 'Cost',
	RT_PRE_CLOSE: 'PreClose',
	RT_LAST: 'L Price',
	wt: 'WT(%)',
	tdate: 'Date',
	mkv: 'MKV',
	dret: 'dret(%)',
	incode: 'InCode',
	theme:  'Theme',
	count:  'Stock Num',
	PCT_CHG:		'dret(%)',	
	RT_PCT_CHG:		'dret(%)',
	RT_PCT_CHG_5D:	'5d ret(%)',
	RT_PCT_CHG_10D:	'10d ret(%)',
	RT_PCT_CHG_20D:	'20d ret(%)',
	RT_PCT_CHG_60D: '60d ret(%)',
	RT_PCT_CHG_YTD: 'YTD(%)',
	industrycode:	'IndustryCode',
	RT_DATE:		'QDate',
	RT_TIME:		'QTime',
	wind_code:		'SecCode',
	sec_name:       'SecName',
	RT_PE_TTM:		'PE TTM',
	indexname:		'IndexName',
	period:			'Period',
	objname:		'PName',
	X5Dret:			'5d ret(%)',
	MTD:			'MTD(%)',
	YTD:			'YTD(%)',	
	MDD:			'MDD(%)',
	YMDD:			'YTD MDD(%)',
	MDDStartDate:	'MDD SD',
	MDDEndDate:		'MDD ED',
	Strategy:		'Strategy',
	YYYYMM:			'Month'
	
};


G_KEY_NAMES["MMDD"] 		= "MTD MDD(%)";
G_KEY_NAMES["Current DD"] 	= "Current DD(%)";
G_KEY_NAMES["5MDD"] 		= "5d MDD(%)";
G_KEY_NAMES["10MDD"] 		= "10d MDD(%)";
G_KEY_NAMES["5MDDStartDate"] 	= "5d MDD SD";
G_KEY_NAMES["10MDDStartDate"] 	= "10d MDD SD";
G_KEY_NAMES["5MDDEndDate"] 		= "5d MDD ED";
G_KEY_NAMES["10MDDEndDate"] 	= "10d MDD ED";

G_KEY_NAMES["1MTD"] 		= "1M ret(%)";
G_KEY_NAMES["2MTD"] 		= "2M ret(%)";
G_KEY_NAMES["3MTD"] 		= "3M ret(%)";

G_KEY_NAMES["annret(%)"] 	= "Ann ret(%)";
G_KEY_NAMES["ex_annret(%)"] = "EX Ann ret(%)";
G_KEY_NAMES["vol(%)"] 		= "Ann Vol(%)";
G_KEY_NAMES["ex_vol(%)"] 	= "EX Ann Vol(%)";
G_KEY_NAMES["SR"] 			= "SR";
G_KEY_NAMES["ex_SR"] 		= "EX SR";
G_KEY_NAMES["MDD(%)"] 		= "MDD(%)";
G_KEY_NAMES["ex_MDD(%)"] 	= "EX MDD(%)";
G_KEY_NAMES["1dret"]      	= "1dret(%)";
G_KEY_NAMES["3dret"]     	= "3dret(%)";
G_KEY_NAMES["5dret"]     	= "5dret(%)";
G_KEY_NAMES["10dret"]     	= "10dret(%)";
G_KEY_NAMES["20dret"]     	= "20dret(%)";
G_KEY_NAMES["1dER"]      	= "1dExRet(%)";
G_KEY_NAMES["3dER"]      	= "3dExRet(%)";
G_KEY_NAMES["5dER"]      	= "5dExRet(%)";
G_KEY_NAMES["20dER"]      	= "20dExRet(%)";
G_KEY_NAMES["strike_price"]	= "SPrice";
G_KEY_NAMES["month"]		= "Month";
G_KEY_NAMES["call_code"]	= "Call Code";
G_KEY_NAMES["put_code"]		= "Put Code";
G_KEY_NAMES["index"]		= "IndexName";
G_KEY_NAMES["c_RT_BID1"]	= "c_BID1";
G_KEY_NAMES["c_RT_ASK1"]	= "c_ASK1";
G_KEY_NAMES["p_RT_BID1"]	= "p_BID1";
G_KEY_NAMES["p_RT_ASK1"]	= "p_ASK1";
G_KEY_NAMES["IH"]			= "IH";
G_KEY_NAMES["5Dret"]		= '5dret(%)';


// 指数名称
G_KEY_NAMES["SZ50"]			= "SZ50";
G_KEY_NAMES["HS300"]		= "HS300";
G_KEY_NAMES["ZZ500"]		= "ZZ500";
G_KEY_NAMES["GEM"]			= "GEM";
G_KEY_NAMES["SME"]			= "SME";

G_KEY_NAMES["rSZ50"]		= "SZ50(%)";
G_KEY_NAMES["rHS300"]		= "HS300(%)";
G_KEY_NAMES["rZZ500"]		= "ZZ500(%)";
G_KEY_NAMES["rGEM"]			= "GEM(%)";
G_KEY_NAMES["rSME"]			= "SME(%)";

// 组合名称
// G_KEY_NAMES["DY01"] 		= "调研组合1号";
G_KEY_NAMES["DY01"] 		= "事件驱动1号";
G_KEY_NAMES["CXG01"] 		= "次新股1号";
G_KEY_NAMES["CXG02"] 		= "次新股2号";
// G_KEY_NAMES["DYAlpha01"] 	= "调研组合alpha 1号";
G_KEY_NAMES["DYAlpha01"] 	= "事件驱动alpha 1号";
G_KEY_NAMES["GX01"] 		= "股息组合1号";
G_KEY_NAMES["IndL01"] 		= "行业龙头";
G_KEY_NAMES["JX01"] 		= "精选组合1号";
G_KEY_NAMES["JX02"] 		= "精选组合2号(HS300内)";
G_KEY_NAMES["JX03"] 		= "精选组合3号(ZZ500内)";

G_KEY_NAMES["NECON01"] 		= "新经济";
G_KEY_NAMES["YH01"] 		= "优化组合1号(HS300为基准)";
G_KEY_NAMES["YH02"] 		= "优化组合2号(ZZ500为基准)";
G_KEY_NAMES["YH03"] 		= "优化组合3号(HS300内优化组合)";
G_KEY_NAMES["YH04"] 		= "优化组合4号(SZ50为基准)"
G_KEY_NAMES["YH05"] 		= "优化组合5号(SZ50行业配置)";
G_KEY_NAMES["YH06"] 		= "优化组合6号(SZ50 2级行业配置)";
G_KEY_NAMES["YH07"] 		= "优化组合7号(HS300为基准 新配置)";

G_KEY_NAMES["CS9Z01"] = "中信自营";                                               
G_KEY_NAMES["CS1D01"] = "中信精选01";                                             
G_KEY_NAMES["CM1B01"] = "招商主动01";                                             
G_KEY_NAMES["CS2B02"] = "中信主动02";                                             
G_KEY_NAMES["CM1A01"] = "招商对冲01";
G_KEY_NAMES["CM1H01"] = "行业精选01"; 
G_KEY_NAMES["CS1E02"] = "中信增强02"; 

// 策略名称
G_KEY_NAMES["zcnum"] = "高管增持家数"
G_KEY_NAMES["jcnum"] = "高管减持家数"
G_KEY_NAMES["ggzcAmount"] = "高管增持金额(万)"
G_KEY_NAMES["ggjcAmount"] = "高管减持金额(万)"


G_KEY_NAMES["dgdzcnum"] = "大股东增持家数"
G_KEY_NAMES["dgdjcnum"] = "大股东减持家数"

G_KEY_NAMES["dgdzcAMOUNT"] = "大股东增持金额(万)"
G_KEY_NAMES["dgdjcAMOUNT"] = "大股东减持金额(万)"

G_KEY_NAMES["nav"] 			= "Product";
G_KEY_NAMES["BMnav"] 		= "BenchMark";
G_KEY_NAMES["CD_PnL"] 		= "CD PnL";
G_KEY_NAMES["RCD_PnL"] 		= "CD PnL(%)";
G_KEY_NAMES["PnL"] 			= "PnL";
G_KEY_NAMES["RPnL"] 		= "PnL(%)";




var G_PORT = {};
G_PORT["000905.SH"] 		= "中证500";
G_PORT["000016.SH"] 		= "上证50";
G_PORT["000300.SH"] 		= "沪深300";



String.format = function() {
	var s = arguments[0];
	for (var i = 0; i < arguments.length - 1; i++) {       
		var reg = new RegExp("\\{" + i + "\\}", "gm");             
		s = s.replace(reg, arguments[i + 1]);
	}

	return s;
}



// http://127.0.0.1:8081/Rfunc?cmd=getprocessdetails.main()&filename=
$(function(){
	$('.date').each(function(){
		$(this).ionDatePicker({
			lang: 'zh-cn',
			format: 'YYYYMMDD',
			onReady: function(date){
				//$('#result').html(date);
				url = String.format("/Rfunc?cmd=getprocessdetails.main('{0}')&filename=", date);
				$.get(url, function (ret, status) {
					var data = new google.visualization.DataTable();
					data = JSONtoDatatable(ret);
					var table = new google.visualization.Table(document.getElementById('process_event_div'));
					table.draw(data, { showRowNumber: false});
				})
				
				url = String.format("/Rfunc?cmd=GetPortID.GetPortList(\"{0}\",\"portlist\")&filename=", $("#s_1").val());
				$.get(url, function (ret, status) {
					$("#s_2").empty();
					var jsonRet = JSON.parse(ret["res"]);
					var jsonPort = jsonRet["data"];
					var arrscode = jsonPort["scode"];
					var arrsname = jsonPort["sname"];
					var executerDiv = $("#port_select");  
					executerDiv.innerHTML = "";  
					var ul = document.createElement("ul"); 
					for (var j = 0; j < arrscode.length; j++) {
						G_PORT[arrscode[j]] = arrsname[j];
						$('#s_2')
						   .append($("<option></option>")
						   .attr("value", arrscode[j])
						   .text(arrsname[j]));
						   
						// 加入复选框  
						var checkBox = document.createElement("input");  
						checkBox.setAttribute("type",	"checkbox");  
						checkBox.setAttribute("id", 	arrscode[j]);  
						checkBox.setAttribute("name", 	arrsname[j]);  
						checkBox.setAttribute("value",  "portselect");  
						  
						var li=document.createElement("li");  
						li.appendChild(checkBox);  
						li.appendChild(document.createTextNode(arrsname[j]));  
						  
						ul.appendChild(li);  
					}
					executerDiv.append(ul);
					$("#s_3").val(STRATEGY_HEDGE_INDEX[$("#s_2").val()]);
				});				
				
			}
		});
		
	});
});


function GenerateDate(sdate) {
	var yyyy = parseInt(sdate.substring(0, 4));
	var mm = parseInt(sdate.substring(4, 6))-1;
	var dd = parseInt(sdate.substring(6, 8));
	var date = new Date(yyyy, mm, dd);
	return date;
}

function googlefinish() {
	alert("Google API has loaded!");
}

function JsontoEchartDataNoChangeRC(ret){
	var jsonRes = JSON.parse(ret["res"])
	jsonRes 	= jsonRes["data"]
	var itemarr = new Array();
	var dataarr = new Array();
	
	for (var item in jsonRes) {
		itemarr.push(item);
		dataarr.push(jsonRes[item]);
	}
	return dataarr;
}

function JsontoEchartData(ret){
	var jsonRes = JSON.parse(ret["res"])
	jsonRes 	= jsonRes["data"]
	var itemarr = new Array();
	var dataarr = new Array();
	
	for (var item in jsonRes) {
		itemarr.push(item);
	}
	dataarr.push(itemarr);
	
	for (var i = 0; i < jsonRes[itemarr[0]].length; i++) {
		var row 	= new Array();
		for(var j=0; j < itemarr.length; j++){
			item = itemarr[j]
			row.push(jsonRes[item][i])
		}
		dataarr.push(row)
	}
	return dataarr;
}


function RUnicodeChange(str){
	str = str.replace(/\\/g, "\\")
	return eval("'" + str + "'");
}

function JSONtoEChartsPython(ret){
	var data = JSON.parse(ret["res"])
	data = data["data"]
	return data;
}

function  JSONtoDatatable(ret)
{
	var jsonRes 	= JSON.parse(ret["res"])
	jsonRes 		= jsonRes["data"]
	var data 		= new google.visualization.DataTable();
	var itemarr 	= new Array();
	
	if("date" in jsonRes) {
		data.addColumn('date', G_KEY_NAMES[item]);
		itemarr.push('date');
	}
	for (var item in jsonRes) {
		if ($.inArray(item, G_STRING_KEYS) >= 0) {
			if(G_KEY_NAMES[item] == undefined){		
				data.addColumn('string', item);
			}else{
				data.addColumn('string', G_KEY_NAMES[item]);
			}
		}
		else if (item == "date") {
			continue;
		}
		else if (item == '__portfolio') {
			data.addColumn('number', $("#s_2").find("option:selected").text());
		}
		else if (item == '__benchmark') {
			data.addColumn('number', "沪深300");
		}
		else {
			if(G_KEY_NAMES[item] == undefined){
				data.addColumn("number", item);
			}
			else{
				data.addColumn("number", G_KEY_NAMES[item]);
			}
		}

		itemarr.push(item);
	}

	//alert(typeof (jsonRes[itemarr[0]]))
	if (typeof (jsonRes[itemarr[0]]) == "object") {
		data.addRows(jsonRes[itemarr[0]].length);
	} else {
		data.addRows(1);
	}

	//alert("format data")
	for (var i = 0; i < itemarr.length; i++) {
		var arr = jsonRes[itemarr[i]];
		if (typeof (arr) == "object") {
			if (itemarr[i] == 'date') {
				for (var j = 0; j < arr.length; j++) {
					data.setValue(j, i, GenerateDate(arr[j]))
				}
			}
			else if (itemarr[i] == 'scode') {
				for (var j = 0; j < arr.length; j++) {
					data.setValue(j, i, G_PORT[arr[j]])
				}
			}
			else if($.inArray(itemarr[i], G_STRING_UNICODE_KEYS) >= 0 ){
				for (var j = 0; j < arr.length; j++) {
					data.setValue(j, i, RUnicodeChange(arr[j]))
				}
			}
			else {
				for (var j = 0; j < arr.length; j++) {
					if(arr[j] == 'NA' || arr[j] == -999999){
						data.setValue(j, i, undefined);
					}else{
						data.setValue(j, i, arr[j])
					}
				}
			}
		}
		else {
			if (itemarr[i] == 'scode') {
				data.setValue(0, i, G_PORT[arr]);
			}
			else if (itemarr[i] == 'date') {
				data.setValue(0, i, GenerateDate(arr));
			}
			else {
				if(arr == 'NA'){
					data.setValue(0, i, undefined);
				}
				data.setValue(0, i, arr);
			}

		}
	}

	return data;

}

function getChartOption(s_title){
	var materialOptions = {
		chart: {
			title: s_title
		},
		width: 730,
		height: 350,
		series: {
			// Gives each series an axis name that matches the Y-axis below.
			0: {axis: 'HS300'},
			1: {axis: 'INC Holding'}
		},
		axes: {
			// Adds labels to each axis; they don't have to match the axis names.
			y: {
				HS300: {label: 'HS300'},
				Holding: {label: 'INC Holding'}
			}
		},
	};
	return materialOptions;
}

function getCommonChartOption(s_title, axis1, axis2){
	var materialOptions = {
		chart: {
			title: s_title
		},
		width: 730,
		height: 350,
		series: {
			// Gives each series an axis name that matches the Y-axis below.
			0: {axis: axis1},
			1: {axis: axis2}
		},
		axes: {
			// Adds labels to each axis; they don't have to match the axis names.
			y: {
				HS300: {label: axis1},
				Holding: {label: axis2}
			}
		},
	};
	return materialOptions;
}


function getCommonChartOptionWithSize(s_title, axis1, axis2, w, h){
	var materialOptions = {
		chart: {
			title: s_title
		},
		width: w,
		height: h,
		series: {
			// Gives each series an axis name that matches the Y-axis below.
			0: {axis: axis1},
			1: {axis: axis2}
		},
		axes: {
			// Adds labels to each axis; they don't have to match the axis names.
			y: {
				HS300: {label: axis1},
				Holding: {label: axis2}
			}
		},
	};
	return materialOptions;
}

function getCommonChartOptionWithSize2(s_title, w, h){
	var materialOptions = {
		chart: {
			title: s_title
		},
		width: w,
		height: h,
		series: {
			// Gives each series an axis name that matches the Y-axis below.
			0: {axis: axis1},
			1: {axis: axis2}
		},
		axes: {
			// Adds labels to each axis; they don't have to match the axis names.
			y: {
				HS300: {label: axis1},
				Holding: {label: axis2}
			}
		},
	};
	return materialOptions;
}
	
$(document).ready(function () {
	
	$("#Portfolio_Minitor").click(function () {
		$("#Portfolio_Minitor_div").show();//显示div  
		$("#Portfolio_analyze_div").hide();//隐藏div  
		$("#Market_Minitor_div").hide();//隐藏div  
		$("#Process_Minitor_div").hide();
		$("#Product_Monitor_div").hide();
		$("#Theme_Minitor_div").hide();
		$("#Wind_Theme_Minitor_div").hide();
		$("#Product_S_Monitor_div").hide();
		$("#Strategy_Event_div").hide();
		$("#Strategy_Event_Dgdzjc_div").hide();
		$("#Macro_Minitor_Div").hide();
		$("#Strategy_ETF_DIV").hide();
	})
	
	$("#Portfolio_analyze").click(function () {
		$("#Portfolio_Minitor_div").hide();//显示div  
		$("#Portfolio_analyze_div").show();//隐藏div  
		$("#Market_Minitor_div").hide();//隐藏div  
		$("#Process_Minitor_div").hide();
		$("#Product_Monitor_div").hide();
		$("#Theme_Minitor_div").hide();
		$("#Wind_Theme_Minitor_div").hide();
		$("#Product_S_Monitor_div").hide();
		$("#Strategy_Event_div").hide();
		$("#Strategy_Event_Dgdzjc_div").hide();
		$("#Macro_Minitor_Div").hide();
		$("#Strategy_ETF_DIV").hide();
	})
	
	$("#Market_Minitor").click(function () {
		$("#Portfolio_Minitor_div").hide();//显示div  
		$("#Portfolio_analyze_div").hide();//隐藏div  
		$("#Market_Minitor_div").show();//隐藏div  
		$("#Product_Monitor_div").hide();
		$("#Process_Minitor_div").hide();
		$("#Theme_Minitor_div").hide();
		$("#Wind_Theme_Minitor_div").hide();
		$("#Product_S_Monitor_div").hide();
		$("#Strategy_Event_div").hide();
		$("#Strategy_Event_Dgdzjc_div").hide();
		$("#Macro_Minitor_Div").hide();
		$("#Strategy_ETF_DIV").hide();
	})
	
	$("#Process_Minitor").click(function () {
		$("#Portfolio_Minitor_div").hide();
		$("#Portfolio_analyze_div").hide();
		$("#Market_Minitor_div").hide();
		$("#Process_Minitor_div").show();
		$("#Product_Monitor_div").hide();
		$("#Theme_Minitor_div").hide();
		$("#Wind_Theme_Minitor_div").hide();
		$("#Product_S_Monitor_div").hide();
		$("#Strategy_Event_div").hide();
		$("#Strategy_Event_Dgdzjc_div").hide();
		$("#Macro_Minitor_Div").hide();
		$("#Strategy_ETF_DIV").hide();
	})
	
	$("#Product_Monitor").click(function () {
		$("#Portfolio_Minitor_div").hide();
		$("#Portfolio_analyze_div").hide();
		$("#Market_Minitor_div").hide();
		$("#Process_Minitor_div").hide();
		$("#Product_Monitor_div").show();
		$("#Theme_Minitor_div").hide();
		$("#Wind_Theme_Minitor_div").hide();
		$("#Product_S_Monitor_div").hide();
		$("#Strategy_Event_div").hide();
		$("#Strategy_Event_Dgdzjc_div").hide();
		$("#Macro_Minitor_Div").hide();
		$("#Strategy_ETF_DIV").hide();
	})	
	$("#Theme_Minitor").click(function () {
		$("#Portfolio_Minitor_div").hide();
		$("#Portfolio_analyze_div").hide();
		$("#Market_Minitor_div").hide();
		$("#Process_Minitor_div").hide();
		$("#Product_Monitor_div").hide();
		$("#Theme_Minitor_div").show();
		$("#Wind_Theme_Minitor_div").hide();
		$("#Product_S_Monitor_div").hide();
		$("#Strategy_Event_div").hide();
		$("#Strategy_Event_Dgdzjc_div").hide();
		$("#Macro_Minitor_Div").hide();
		$("#Strategy_ETF_DIV").hide();
	})	
	$("#Wind_Theme_Minitor").click(function () {
		$("#Portfolio_Minitor_div").hide();
		$("#Portfolio_analyze_div").hide();
		$("#Market_Minitor_div").hide();
		$("#Process_Minitor_div").hide();
		$("#Product_Monitor_div").hide();
		$("#Theme_Minitor_div").hide();
		$("#Wind_Theme_Minitor_div").show();
		$("#Product_S_Monitor_div").hide();
		$("#Strategy_Event_div").hide();
		$("#Strategy_Event_Dgdzjc_div").hide();
		$("#Macro_Minitor_Div").hide();
		$("#Strategy_ETF_DIV").hide();
	})	
	
	$("#Product_Summary").click(function () {
		$("#Portfolio_Minitor_div").hide();
		$("#Portfolio_analyze_div").hide();
		$("#Market_Minitor_div").hide();
		$("#Process_Minitor_div").hide();
		$("#Product_Monitor_div").hide();
		$("#Theme_Minitor_div").hide();
		$("#Wind_Theme_Minitor_div").hide();
		$("#Product_S_Monitor_div").show();
		$("#Strategy_Event_div").hide();
		$("#Strategy_Event_Dgdzjc_div").hide();
		$("#Macro_Minitor_Div").hide();
		$("#Strategy_ETF_DIV").hide();
	})	
	
	$("#Strategy_Event").click(function() {
		$("#Portfolio_Minitor_div").hide();
		$("#Portfolio_analyze_div").hide();
		$("#Market_Minitor_div").hide();
		$("#Process_Minitor_div").hide();
		$("#Product_Monitor_div").hide();
		$("#Theme_Minitor_div").hide();
		$("#Wind_Theme_Minitor_div").hide();
		$("#Product_S_Monitor_div").hide();
		$("#Strategy_Event_div").show();
		$("#Strategy_Event_Dgdzjc_div").hide();
		$("#Macro_Minitor_Div").hide();
		$("#Strategy_ETF_DIV").hide();
	})
	
	$("#Strategy_Event_DGDZJC").click(function() {
		$("#Portfolio_Minitor_div").hide();
		$("#Portfolio_analyze_div").hide();
		$("#Market_Minitor_div").hide();
		$("#Process_Minitor_div").hide();
		$("#Product_Monitor_div").hide();
		$("#Theme_Minitor_div").hide();
		$("#Wind_Theme_Minitor_div").hide();
		$("#Product_S_Monitor_div").hide();
		$("#Strategy_Event_div").hide();
		$("#Strategy_Event_Dgdzjc_div").show();
		$("#Macro_Minitor_Div").hide();
		$("#Strategy_ETF_DIV").hide();
	})

	$("#Strategy_ETF").click(function() {
		$("#Portfolio_Minitor_div").hide();
		$("#Portfolio_analyze_div").hide();
		$("#Market_Minitor_div").hide();
		$("#Process_Minitor_div").hide();
		$("#Product_Monitor_div").hide();
		$("#Theme_Minitor_div").hide();
		$("#Wind_Theme_Minitor_div").hide();
		$("#Product_S_Monitor_div").hide();
		$("#Strategy_Event_div").hide();
		$("#Strategy_Event_Dgdzjc_div").hide();
		$("#Macro_Minitor_Div").hide();
		$("#Strategy_ETF_DIV").show();
	})
	
	
	$("#Macro_Minitor").click(function() {
		$("#Portfolio_Minitor_div").hide();
		$("#Portfolio_analyze_div").hide();
		$("#Market_Minitor_div").hide();
		$("#Process_Minitor_div").hide();
		$("#Product_Monitor_div").hide();
		$("#Theme_Minitor_div").hide();
		$("#Wind_Theme_Minitor_div").hide();
		$("#Product_S_Monitor_div").hide();
		$("#Strategy_Event_div").hide();
		$("#Strategy_Event_Dgdzjc_div").hide();
		$("#Macro_Minitor_Div").show();
		$("#Strategy_ETF_DIV").hide();
	})
	
	
	//http://127.0.0.1:8081/Rfunc?cmd=CalcPerformance.main("YH01", '000300.SH', "portdetails")&filename=
	$("#b01").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		url = String.format("/Rfunc?cmd=CalcPerformance.main('{0}', '{1}', 'portdetails')&filename=", $("#s_2").val(), $("#s_3").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('table_div'));
			table.draw(data, { showRowNumber: false, width:'100%'});
		})
	})
	
	$("#s_2").change(function () {
		$("#s_3").val(STRATEGY_HEDGE_INDEX[$("#s_2").val()]);
	})
	
	/* http://127.0.0.1:8081/Rfunc?cmd=GetPortID.GetPortList("STOCK","portlist")&filename= */
	$("#s_1").change(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		url = String.format("/Rfunc?cmd=GetPortID.GetPortList(\"{0}\",\"portlist\")&filename=", $("#s_1").val());
		$.get(url, function (ret, status) {
			$("#s_2").empty();
			var jsonRet = JSON.parse(ret["res"]);
			var jsonPort = jsonRet["data"];
			var arrscode = jsonPort["scode"];
			var arrsname = jsonPort["sname"];
			var executerDiv = $("#port_select");  
			executerDiv.innerHTML = "";  
			var ul = document.createElement("ul"); 
			for (var j = 0; j < arrscode.length; j++) {
				G_PORT[arrscode[j]] = arrsname[j];
				$('#s_2')
				   .append($("<option></option>")
				   .attr("value", arrscode[j])
				   .text(arrsname[j]));
				   
				// 加入复选框  
				var checkBox = document.createElement("input");  
				checkBox.setAttribute("type",	"checkbox");  
				checkBox.setAttribute("id", 	arrscode[j]);  
				checkBox.setAttribute("name", 	arrsname[j]);  
				checkBox.setAttribute("value",  "portselect");  
				  
				var li=document.createElement("li");  
				li.appendChild(checkBox);  
				li.appendChild(document.createTextNode(arrsname[j]));  
				  
				ul.appendChild(li);  
			}
			executerDiv.append(ul);
			$("#s_3").val(STRATEGY_HEDGE_INDEX[$("#s_2").val()]);
		});
	})

	//http://127.0.0.1:8081/Rfunc?cmd=statisticportindustry.industryweight(%22YH01%22,%22diffindustry%22)&filename=
	$("#Button1").click(function() {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		var url = String.format("/Rfunc?cmd=statisticportindustry.industryweight(\"{0}\", \"{1}\", \"industryweight\")&filename=", $("#s_2").val(), $("#s_3").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);

			var options = {
				chart: {
					title: 'Industry of portfolio',
					subtitle: 'Based on recent basket'
				},
				hAxis: {
					title: 'Industry Weight(%)',
					minValue: 0,
				},
				vAxis: {
					title: 'Industry'
				},
				//bars: 'horizontal',
				bars: 'vertical',
				bar: {groupWidth: "45%"}
			};
			var material = new google.charts.Bar(document.getElementById('chart_div1'));
			material.draw(data, options);
			
			var table = new google.visualization.Table(document.getElementById('industry_diff_details_div'));
			table.draw(data, { showRowNumber: true, width:'100%'});
			google.visualization.events.addListener(table, 'select', selectHandler);

			function selectHandler() {
				var selection = table.getSelection();
				var industry = selection[0].row;

				url = String.format("/Rfunc?cmd=statisticportindustry.getposdetails('{0}', {1})&filename=", $("#s_2").val(), industry);
				// 行业持仓明细
				$.get(url, function (ret, status) {
					
					var data = new google.visualization.DataTable();
					data = JSONtoDatatable(ret);
					var table = new google.visualization.Table(document.getElementById('industry_pos_details_div'));
					table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
				})
			}
		 })
	   })
	  
	//http://127.0.0.1:8081/Rfunc?cmd=calcfundnav.main("YH01", "nav")&filename=
	$("#Button2").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		var url = String.format('Rfunc?cmd=calcfundnav.main("{0}", "{1}", "nav")&filename=', $("#s_2").val(), $("#s_3").val());
		$.get(url, function (ret, status) {
			//alert(ret["res"]);
			data = JSONtoDatatable(ret);
			//alert(data.toJSON());

			var chart = new google.visualization.AnnotatedTimeLine(document.getElementById('nav_div'));
			var options = {
			   scaleType : 'maximized'
			};

			chart.draw(data, options);
		  
		})
	})

	//http://127.0.0.1:8081/Rfunc?cmd=MaxTenWeight.MaxTopWeight(%22YH01%22,%2010,%20%22maxweight%22)&filename=
	$("#Button3").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		var url = String.format('Rfunc?cmd=MaxTenWeight.MaxTopWeight("{0}", 10, "maxweight")&filename=', $("#s_2").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('max_weight_div'));
			table.draw(data, { showRowNumber: true, width: '100%'});
		})
	})

	//http://127.0.0.1:8081/Rfunc?cmd=calcrisk.main(%27YH01%27,%20%27risk%27)&filename=
	$("#Button4").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		var url = String.format("Rfunc?cmd=calcrisk.main('{0}', '{1}', 'risk')&filename=", $("#s_2").val(), $("#s_3").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('risk_div'));
			table.draw(data, { showRowNumber: false, width:'100%'});
		})
	})

	$("#Button4_Beta").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		var url = String.format("Rfunc?cmd=CalcBeta.main('{0}', '{1}')&filename=", $("#s_2").val(), $("#s_3").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('beta_div'));
			table.draw(data, { showRowNumber: false, width:'100%'});
		})
	})
	
	
	$("#Button4_Beta_2").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		var url = String.format("Rfunc?cmd=CalcBeta.BetaByDret('{0}', '{1}')&filename=", $("#s_2").val(), $("#s_3").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('beta_div2'));
			table.draw(data, { showRowNumber: false, width:'100%'});
		})
	})
	
	
	
	$("#Button6_style").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		var url = String.format("Rfunc?cmd=getportstyle.singlePortStyle('{0}','{1}')&filename=", $("#s_2").val(), $("#s_3").val());
		$.get(url, function (ret, status) {
			
			// Google Chart 
			var data 		= new google.visualization.DataTable();
			data 			= JSONtoDatatable(ret);
			var table 		= new google.visualization.Table(document.getElementById('style_table_div'));
			table.draw(data, { showRowNumber: false, width:'100%'});
			
			// Baidu Echart
			dataarr 		= JsontoEchartData(ret)
			
			var myChart = echarts.init(document.getElementById('style_div'));
			var portStyle = [
				dataarr[1].slice(2, 9)
			];
			var IndxStyle = [
				dataarr[2].slice(2, 9)
			];
			
			var lineStyle = {
				normal: {
					width: 1,
					opacity: 0.8
				}
			}
			
			option = {
				backgroundColor: '#161627',
				title: {
					text: '',
					left: 'center',
					textStyle: {
						color: '#eee'
					}
				},
				legend: {
					bottom: 3,
					data: ['portfolio', 'BenchMark'],
					itemGap: 20,
					textStyle: {
						color: '#fff',
						fontSize: 8
					}
				},
			
				radar: {
					indicator: [
						{name: dataarr[0][2]},
						{name: dataarr[0][3]},
						{name: dataarr[0][4]},
						{name: dataarr[0][5]},
						{name: dataarr[0][6]},
						{name: dataarr[0][7]},
						{name: dataarr[0][8]},
						{name: dataarr[0][9]}
					],
					shape: 'circle',
					splitNumber: 5,
					name: {
						textStyle: {
							color: 'rgb(238, 197, 102)'
						}
					},
					splitLine: {
						lineStyle: {
							color: [
								'rgba(238, 197, 102, 0.1)', 'rgba(238, 197, 102, 0.2)',
								'rgba(238, 197, 102, 0.4)', 'rgba(238, 197, 102, 0.6)',
								'rgba(238, 197, 102, 0.8)', 'rgba(238, 197, 102, 1)'
							].reverse()
						}
					},
					splitArea: {
						show: false
					},
					axisLine: {
						lineStyle: {
							color: 'rgba(238, 197, 102, 0.5)'
						}
					}
				},
				series: [
					{
						name: 'portfolio',
						type: 'radar',
						lineStyle: lineStyle,
						data: portStyle,
						symbol: 'none',
						itemStyle: {
							normal: {
								color: '#F9713C'
							}
						},
						areaStyle: {
							normal: {
								opacity: 0.5
							}
						}
					},
					{
						name: 'BenchMark',
						type: 'radar',
						lineStyle: lineStyle,
						data: IndxStyle,
						symbol: 'none',
						itemStyle: {
							normal: {
								color: '#B3E4A1'
							}
						},
						areaStyle: {
							normal: {
								opacity: 0.5
							}
						}
					}
				]
			};
			
			// 使用刚指定的配置项和数据显示图表。
			myChart.setOption(option);	
			
		})
	})

	
	$("#Button6").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		var url = String.format("Rfunc?cmd=getcomponentmkv.main('{0}','')&filename=", $("#s_2").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var options = {
				title: '市值分布',
				legend: { position: 'none' },
				colors: ['#e7711c'],
				histogram: { lastBucketPercentile: 5 },
				width:'100%'
			};

			var chart = new google.visualization.Histogram(document.getElementById('mkv_div'));
			chart.draw(data, options);
		})
	})
	
	
	// http://127.0.0.1:8081/Rfunc?cmd=industrychange.main(%27JX01%27,%20%27%27)&filename=
	$("#Button7").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		var url = String.format("Rfunc?cmd=industrychange.main('{0}','')&filename=", $("#s_2").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			
			var chart = new google.visualization.MotionChart(document.getElementById('weight_change_div'));


			chart.draw(data, { 	width: '100%', 
								height: '100%'});
			// state: '{"yZoomedDataMin":0,"xZoomedDataMax":25,"orderedByX":true,"orderedByY":false,"uniColorForNonSelected":false,"showTrails":false,"nonSelectedAlpha":0.4,"duration":{"timeUnit":"D","multiplier":1},"yAxisOption":"2","yZoomedIn":false,"xAxisOption":"2","xZoomedIn":false,"colorOption":"_UNIQUE_COLOR","yLambda":1,"sizeOption":"_UNISIZE","xZoomedDataMin":0,"xLambda":1,"playDuration":15000,"time":"2015-11-20","yZoomedDataMax":30,"iconType":"VBAR","dimensions":{"iconDimensions":["dim0"]},"iconKeySettings":[]}'
		})
	})
	// http://192.168.1.22:8081/Rfunc?cmd=getportstyle.main("YH01,YH02", '')&filename=
	$("#Button8").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		str = "";
		$("[value='portselect']:checked").each(function(){
			str+=$(this).attr('id') + ",";
		})
		str = str.substring(0, str.length - 1)
		
		var url = String.format("Rfunc?cmd=getportstyle.main('{0}','')&filename=", str);
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);

			var chart = new google.visualization.MotionChart(document.getElementById('style_div'));
			chart.draw(data, {  width: '100%',
								height: '100%'});
		})
	})
	
	// http://192.168.1.22:8081/Rfunc?cmd=getportstyle.singleperformance('YH01', '')&filename=
	$("#ButtonA1").click(function(){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		var url = String.format("Rfunc?cmd=getportstyle.singleperformance('{0}', '')&filename=", $("#s_2").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);

			var chart = new google.visualization.MotionChart(document.getElementById('single_style_div'));
			chart.draw(data, { width: '100%', 
							   height: '100%',
							   state: '{"xZoomedDataMax":1,"xZoomedDataMin":-1}'});
		})
	})
	// http://192.168.1.227:8081/Rfunc?cmd=option.monitor()&filename=
	$("#ButtonB1").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		url = String.format("/Rfunc?cmd=option.monitor()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('option_monitor_div'));
			table.draw(data, { showRowNumber: false, width:"100%"});
		})
	})

	$("#S_E_ButtonB2").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		// get holding change details
		url = String.format("/Rfunc?cmd=ExecutiveHoldingChange.main()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('ggzjc_monitor_div'));
			table.draw(data, {showRowNumber: true, width:"100%"});
		})
	})
	

	$("#S_E_ButtonB3").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
			// get holding change serials
		url = String.format("/Rfunc?cmd=ExecutiveHoldingChange.getGGZCSerial()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('ggzc_chart_div'));
			materialChart.draw(data, getChartOption('高管增持家数相对于HS300'));	
		})
		
		url = String.format("/Rfunc?cmd=ExecutiveHoldingChange.getGGZCAmountSerial()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('ggzc_amount_chart_div'));
			materialChart.draw(data, getChartOption('高管增持金额相对于HS300'));	
		})
	})
		
	$("#S_E_ButtonB4").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		// get holding change serials (decrease)
		url = String.format("/Rfunc?cmd=ExecutiveHoldingChange.getGGJCSerial()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('ggjc_chart_div'));
			materialChart.draw(data, getChartOption('高管减持家数相对于HS300'));
		})
		
		// get holding change serials (decrease)
		url = String.format("/Rfunc?cmd=ExecutiveHoldingChange.getGGJCAmountSerial()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('ggjc_amount_chart_div'));
			materialChart.draw(data, getChartOption('高管减持金额相对于HS300'));
		})
	})	
	

		

	$("#S_dgdzcj_ButtonB2").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		// get holding change details
		url = String.format("/Rfunc?cmd=Dgdzjc.main()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('dgdzjc_monitor_div'));
			table.draw(data, {showRowNumber: true, width:"100%"});
		})
		
	})
	


	$("#S_dgdzcj_ButtonB3").click(function () {
		// get holding change serials
		url = String.format("/Rfunc?cmd=Dgdzjc.getGdZCSerial()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('dgdzc_chart_div'));
			materialChart.draw(data, getChartOption("大股东增持家数相对于HS300"));	
		})
	})

	$("#S_dgdzcj_ButtonB5").click(function () {
		url = String.format("/Rfunc?cmd=Dgdzjc.getGdZCAmountSerial()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('dgdzc_amount_chart_div'));
			materialChart.draw(data, getChartOption("大股东增持金额相对于HS300"));	
		})
	})	
	
	
	$("#S_dgdzcj_ButtonB4").click(function () {
		
		// get holding change serials (decrease)
		url = String.format("/Rfunc?cmd=Dgdzjc.getGdJCSerial()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('dgdjc_chart_div'));
			materialChart.draw(data, getChartOption("大股东减持家数相对于HS300"));	
		})
	})

	$("#S_dgdzcj_ButtonB6").click(function () {
		url = String.format("/Rfunc?cmd=Dgdzjc.getGdJCAmountSerial()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('dgdjc_amount_chart_div'));
			materialChart.draw(data, getChartOption("大股东减持金额相对于HS300"));	
		})
	})	
	
	
	$("#Button9").click(function(){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		str = "";
		$("[value='portselect']:checked").each(function(){
			str+= "'" + $(this).attr('id') + "'" +",";
		})
		str = str.substring(0, str.length - 1)
		
		url = String.format("/Rfunc?cmd=s_portexdret.main(\"{0}\", \"{1}\")&filename=", $("#s_4").val(), str);
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.AnnotatedTimeLine(document.getElementById('port_exdret_div'));
			var options = {
			   scaleType : 'maximized'
			};
			table.draw(data, options);
		})
	})

	$('#Button5').click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		$("#b01").trigger("click");
		$("#Button4").trigger("click");
		$("#Button4_Beta").trigger("click");
		$("#Button4_Beta_2").trigger("click");
		$("#Button6_style").trigger("click");
		$("#Button3").trigger("click");
		$("#Button1").trigger("click");
		$("#Button2").trigger("click");
		$("#Button6").trigger("click");
		//$("#Button7").trigger("click");
		//$("#ButtonA1").trigger("click");
	})	
	
	$("#p_Button1").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		// 行业权重分布
		url = String.format("/Rfunc?cmd=p_statisticportindustry.industryweight('{0}', '{1}')&filename=", $("#p_s_3").val(), $("#p_s_4").val());
		
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);

			var options = {
				chart: {
					title: 'Industry of portfolio',
					subtitle: 'Based on last position'
				},
				hAxis: {
					title: 'Industry Weight(%)',
					minValue: 0,
				},
				vAxis: {
					title: 'Industry'
				},
				//bars: 'horizontal',
				bars: 'vertical',
				bar: {groupWidth: "45%"}
			};
			var material = new google.charts.Bar(document.getElementById('industry_table_div'));
			material.draw(data, options);
			
			var table = new google.visualization.Table(document.getElementById('industry_tabledetails_div'));
			table.draw(data, { showRowNumber: true, width:'100%'});

			
		})
		
		// 指数权重分布
		url = String.format("/Rfunc?cmd=p_statisticportindustry.indexweight(\"{0}\")&filename=", $("#p_s_3").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('index_table_div'));
			table.draw(data, { showRowNumber: false, width:'100%'});
		})

	})
	
	
	$("#p_Button2").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		
		// 持仓明细
		url = String.format("/Rfunc?cmd=p_calcperformance.main('{0}')&filename=", $("#p_s_3").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('stock_profit_details'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
			// table.draw(data, { showRowNumber: true, page: 'enbale', pageSize:40});
		})
		
		// 收益获取
		url = String.format("/Rfunc?cmd=p_calcperformance.performance('{0}', '{1}')&filename=", $("#p_s_3").val(), $("#p_s_4").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('stock_total_profit'));
			table.draw(data, { showRowNumber: false, width:'100%'});
		})
	})	
	
	$("#th_ButtonB1").click(function (){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}

		// 热点主题
		url = String.format("/Rfunc?cmd=monitorWI.th()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('theme_monitor_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
			
			google.visualization.events.addListener(table, 'select', selectHandler);
			function selectHandler() {
				var selection = table.getSelection();
				var message = '';
				var item = selection[0]; 
				var incode = data.getFormattedValue(item.row, 0);

				url = String.format("/Rfunc?cmd=monitorWI.themedetails('{0}')&filename=", incode);
				// 热点主题明细
				$.get(url, function (ret, status) {
					
					var data = new google.visualization.DataTable();
					data = JSONtoDatatable(ret);
					var table = new google.visualization.Table(document.getElementById('theme_details_monitor_div'));
					table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
				})
			}

		})
		
	})
	
	$("#p_Button3").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		// 商品期货数据
		url = String.format("/Rfunc?cmd=p_calcperformance.futurepos('{0}')&filename=", $("#p_s_3").val());
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('shangping_future_table_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
			// table.draw(data, { showRowNumber: true, page: 'enbale', pageSize:40});
		})
	})	
	
	
	$("#Macro_Button1").click(function () {
		
		// get holding change serials (decrease)
		url = String.format("/Rfunc?cmd=MacroIndicator.GetSW1_NDAYS_SD()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('sw1_sd_chart_div'));
			materialChart.draw(data, getCommonChartOption("申万一级行业偏离", "SW1_1D", "SW1_5D"));	
		})
		

	})
	
	$("#Macro_Button3").click(function () {
		
		url = String.format("/Rfunc?cmd=MacroIndicator.GetSW2_NDAYS_SD()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('sw2_sd_chart_div'));
			materialChart.draw(data, getCommonChartOption("申万二级行业偏离", "SW2_1D", "SW2_5D"));	
		})
		
	})
	


	$("#Macro_Button2").click(function () {
		url = String.format("/Rfunc?cmd=MacroIndicator.GetZZ800_SD()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('zz800_sd_chart_div'));
			materialChart.draw(data, getCommonChartOption("中证800偏离", "ZZ800_1D", "ZZ800_5D"));	
		})
	})			

	$("#Macro_Button4").click(function () {
		url = String.format("/Rfunc?cmd=MacroIndicator.VOL000300()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('hs300_vol_chart_div'));
			materialChart.draw(data, getCommonChartOptionWithSize('沪深300波动率', '30d', '250', 480, 230));	
		})
	})			
		
	$("#Macro_Button5").click(function () {
		url = String.format("/Rfunc?cmd=MacroIndicator.VOL000905()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('zz500_vol_chart_div'));
			materialChart.draw(data, getCommonChartOptionWithSize('中证500波动率', '30d', '250', 480, 230));	
		})
	})			
	
	$("#Macro_Button6").click(function () {
		url = String.format("/Rfunc?cmd=MacroIndicator.VOL000016()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('sz50_vol_chart_div'));
			materialChart.draw(data, getCommonChartOptionWithSize('上证50波动率', '30d', '250', 480, 230));	
		})
	})		
	
	$("#Macro_Button7").click(function () {
		url = String.format("/python?args=test.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('zz500/sz50_chart_div'));
			materialChart.draw(data, "中证500/上证50");
		})
	})
	
	$("#Macro_Button11").click(function () {
		url = String.format("/python?args=test3m.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('zz500/sz50_3m_chart_div'));
			materialChart.draw(data, "中证500/上证50(3m)");
		})
	})
	
	$("#Macro_Button8").click(function () { //沪深300累计换手率
		url = String.format("/python?args=accum_turnover_300.py");
		$.get(url, {},function (ret, status) {
			var data = JSONtoEChartsPython(ret)
			var myChart = echarts.init(document.getElementById('hs300_turnover_chart_div'));
			var app = {};
			option = null;
			
			option = {
				title: {
					text: '沪深300',
					x: 'left'
				},
				tooltip: {},
				legend: {
					data:['5日换手率','20日换手率','60日换手率'],
					x: 'right'
				},
				xAxis: {
					data: data['xAxis'],
					name: '日期'
				},
				yAxis: {name: '百分比%'},
				series: [
				{
					name: '5日换手率',
					type: 'line',
					data: data['series'][5]
				},
				
				{
					name: '20日换手率',
					type: 'line',
					data: data['series'][20]
				},
				{
					name: '60日换手率',
					type: 'line',
					data: data['series'][60]
				}
				
				
				]
			};;
			myChart.setOption(option);	
		})
	})
	
	$("#Macro_Button9").click(function () { //中证500累计换手率
		url = String.format("/python?args=accum_turnover_500.py");
		$.get(url, {},function (ret, status) {
			var data = JSONtoEChartsPython(ret)
			var myChart = echarts.init(document.getElementById('zz500_turnover_chart_div'));
			var app = {};
			option = null;
			
			option = {
				title: {
					text: '中证500',
					x: 'left'
				},
				tooltip: {},
				legend: {
					data:['5日换手率','20日换手率','60日换手率'],
					x: 'right'
				},
				xAxis: {
					data: data['xAxis'],
					name: '日期'
				},
				yAxis: {name: '百分比%'},
				series: [
				{
					name: '5日换手率',
					type: 'line',
					data: data['series'][5]
				},
				
				{
					name: '20日换手率',
					type: 'line',
					data: data['series'][20]
				},
				{
					name: '60日换手率',
					type: 'line',
					data: data['series'][60]
				}
				
				
				]
			};;
			myChart.setOption(option);	
		})
	})
	
	$("#Macro_Button10").click(function () { //上证50累计换手率
		url = String.format("/python?args=accum_turnover_50.py");
		$.get(url, {},function (ret, status) {
			var data = JSONtoEChartsPython(ret)
			var myChart = echarts.init(document.getElementById('sz50_turnover_chart_div'));
			var app = {};
			option = null;
			
			option = {
				title: {
					text: '上证50',
					x: 'left'
				},
				tooltip: {},
				legend: {
					data:['5日换手率','20日换手率','60日换手率'],
					x: 'right'
				},
				xAxis: {
					data: data['xAxis'],
					name: '日期'
				},
				yAxis: {name: '百分比%'},
				series: [
				{
					name: '5日换手率',
					type: 'line',
					data: data['series'][5]
				},
				
				{
					name: '20日换手率',
					type: 'line',
					data: data['series'][20]
				},
				{
					name: '60日换手率',
					type: 'line',
					data: data['series'][60]
				}
				
				
				]
			};;
			myChart.setOption(option);	
		})
	})
	
	$("#Macro_Button12").click(function () {
		url = String.format("/python?args=a50_sz50.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('A50/sz50_chart_div'));
			materialChart.draw(data, "A50/上证50");
		})
	})
	
	$("#Macro_Button13").click(function () {
		url = String.format("/python?args=a50_sz50_3m.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('A50/sz50_3m_chart_div'));
			materialChart.draw(data, "A50/上证50(3m)");
		})
	})
	
	$("#Macro_Button14").click(function () {
		url = String.format("/python?args=ah.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('AH_chart_div'));
			materialChart.draw(data, "AH溢价指数");
		})
	})
	
	$("#Macro_Button15").click(function () {
		url = String.format("/python?args=ah_3m.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('AH_3m_chart_div'));
			materialChart.draw(data, "AH溢价指数(3m)");
		})
	})
	
	$("#Macro_Button16").click(function () {
		url = String.format("/python?args=hugutong.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('hugutong_chart_div'));
			materialChart.draw(data, "沪股通资金净流入");
		})
	})
    
    $("#Macro_Button17").click(function () {
		url = String.format("/python?args=ganggutong.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('ganggutong_chart_div'));
			materialChart.draw(data, "港股通资金净流入");
		})
	})
    
    $("#Macro_Button18").click(function () {
		url = String.format("/python?args=cnycnh.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('cnycnh_chart_div'));
            
			materialChart.draw(data, {chart:{title: 'CNY/CNH'}});
		})
	})
    
    $("#Macro_Button19").click(function () {
		url = String.format("/python?args=cnycnh_3m.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var materialChart = new google.charts.Line(document.getElementById('cnycnh_3m_chart_div'));
			materialChart.draw(data, "CNY/CNH_3m");
		})
	})
    
    $("#Macro_Button20").click(function () {
		url = String.format("/python?args=shape.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
            var table = new google.visualization.Table(document.getElementById('sharpe_div'));
			table.draw(data, { showRowNumber: false, width:'100%'});
		})
	})
    
    $("#Macro_Button_shibor").click(function () {
		url = String.format("/python?args=shiboron.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
            var materialChart = new google.charts.Line(document.getElementById('shibor_chart_div'));
			materialChart.draw(data, "shibor_chart_div");
		})
	})
    
    $("#Macro_Button_GC001").click(function () {
        url = String.format("/python?args=gc001.py");
		$.get(url, {},function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
            var materialChart = new google.charts.Line(document.getElementById('gc001_chart_div'));
			materialChart.draw(data, "gc001_chart_div");
		})
	})
	
	$("#wind_th_ButtonB1").click(function (){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		url = String.format("/Rfunc?cmd=windtheme.index()&filename=");
		// 热点主题明细
		$.get(url, function (ret, status) {
			
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('wind_monitor_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
		})

		// wind热点主题
		url = String.format("/Rfunc?cmd=windtheme.main()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('wind_theme_monitor_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
			
			google.visualization.events.addListener(table, 'select', selectHandler);
			function selectHandler() {
				var selection = table.getSelection();
				var message = '';
				var item = selection[0]; 
				var incode = data.getFormattedValue(item.row, 0);

				url = String.format("/Rfunc?cmd=windtheme.themedetails('{0}')&filename=", incode);
				// wind热点主题明细
				$.get(url, function (ret, status) {
					
					var data = new google.visualization.DataTable();
					data = JSONtoDatatable(ret);
					var table = new google.visualization.Table(document.getElementById('wind_theme_details_monitor_div'));
					table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
				})
				
				
				url = String.format("/Rfunc?cmd=windtheme.indexdistribute()&filename=");
				
				// wind热点主题明细 指数分布
				$.get(url, function (ret, status) {
					
					var data = new google.visualization.DataTable();
					data = JSONtoDatatable(ret);
					var table = new google.visualization.Table(document.getElementById('wind_theme_index_monitor_div'));
					table.draw(data, { showRowNumber: false, scrollLeftStartPosition:3, width:'100%'});
				})
				
			}

		})
		
	})
	
	
	$("#ps_Button4").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		strPortid = "";
		// strBenchMark = "";
		$("[value='portfolioselect']:checked").each(function(){
			strPortid += $(this).attr('id') + ",";
			// strBenchMark += $(String.format("#{0}_select", $(this).attr('id'))).val()  + ",";
		})
		
		strPortid = strPortid.substring(0, strPortid.length - 1)
		
		
		// 换手率
		url = String.format("/Rfunc?cmd=TurnRation.LastTurnRation('{0}')&filename=", strPortid);
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('turnover_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
			// table.draw(data, { showRowNumber: true, page: 'enbale', pageSize:40});
		})
		
		
		// STOCK换手率
		url = String.format("/Rfunc?cmd=TurnRation.LastStockTurnRationdetails('{0}')&filename=", strPortid);
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('stock_turnover_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
			// table.draw(data, { showRowNumber: true, page: 'enbale', pageSize:40});
		})
		
		// FUTURE换手率
		url = String.format("/Rfunc?cmd=TurnRation.LastFutureTurnRationdetails('{0}')&filename=", strPortid);
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('future_turnover_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
			// table.draw(data, { showRowNumber: true, page: 'enbale', pageSize:40});
		})
		
		
		// 换手率（chart)
		var url = String.format("Rfunc?cmd=TurnRation.getTurnRationList('{0}')&filename=", strPortid);
		$.get(url, function (ret, status) {
		
			data = JSONtoDatatable(ret);

			var chart = new google.visualization.AnnotatedTimeLine(document.getElementById('turn_over_chart_div'));
			var options = {
				scaleType : 'maximized'
			};

			chart.draw(data, options);
		  
		})	
		
	})	
	
	$("#ps_Button3").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}

		strPortid = "";
		$("[value='portfolioselect']:checked").each(function(){
			strPortid += $(this).attr('id') + ",";
		})
		
		strPortid = strPortid.substring(0, strPortid.length - 1)
		
		
		var url = String.format("Rfunc?cmd=p_getnav.main2('{0}')&filename=", strPortid);
		$.get(url, function (ret, status) {
		
			data = JSONtoDatatable(ret);

			var chart = new google.visualization.AnnotatedTimeLine(document.getElementById('p_nav_div'));
			var options = {
			   scaleType : 'maximized'
			};

			chart.draw(data, options);
		  
		})
	})
	
	$("#S_ETF_Button1").click(function(){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		url = String.format("/Rfunc?cmd=s_etf.getEFTPerformance('INDUSTRY')&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('industry_etf_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
		})
	})

	$("#S_ETF_Button2").click(function(){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		url = String.format("/Rfunc?cmd=s_etf.getEFTPerformance('INDEXSCALE')&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('index_etf_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
		})
	})
	
	$("#S_ETF_Button3").click(function(){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		url = String.format("/Rfunc?cmd=s_etf.getEFTPerformance('STRATEGYINDEX')&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('strategy_etf_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
		})
	})

	$("#S_ETF_Button4").click(function(){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		url = String.format("/Rfunc?cmd=s_etf.getEFTPerformance('STYLEINDEX')&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('style_etf_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
		})
	})
	
	$("#S_ETF_Button5").click(function(){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		url = String.format("/Rfunc?cmd=s_etf.getEFTPerformance('THEME')&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('theme_etf_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
		})
	})


	$("#S_ETF_Button6").click(function(){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		url = String.format("/Rfunc?cmd=s_etf.getEFTPerformance('OVERSEAINDEX')&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('oversea_etf_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
		})
	})
	
	$("#S_ETF_Button7").click(function(){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		url = String.format("/Rfunc?cmd=s_etf.getEFTPerformance('DEBT')&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('bond_etf_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
		})
	})
		
	
	$("#S_ETF_Button8").click(function(){
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		url = String.format("/Rfunc?cmd=s_etf.getEFTPerformance('COMMDODITY')&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('commodity_etf_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
		})
	})
	
	
	$("#ps_Button2").click(function () {
		if(!G_LOGIN){
			alert(G_WARN_MSG)
			return
		}
		
		strPortid = "";
		strBenchMark = "";
		$("[value='portfolioselect']:checked").each(function(){
			strPortid += $(this).attr('id') + ",";
			strBenchMark += $(String.format("#{0}_select", $(this).attr('id'))).val()  + ",";
		})
		
		strPortid = strPortid.substring(0, strPortid.length - 1)
		strBenchMark = strBenchMark.substring(0, strBenchMark.length - 1)
		
		// 产品表现
		url = String.format("/Rfunc?cmd=p_getnav.performance2('{0}', '{1}')&filename=", strPortid, strBenchMark);
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('product_return'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
			// table.draw(data, { showRowNumber: true, page: 'enbale', pageSize:40});
		})
		
		// 产品每月表现
		url = String.format("/Rfunc?cmd=p_getnav.MonthlyPerformance('{0}')&filename=", strPortid);
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('product_monthly_return'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
			// table.draw(data, { showRowNumber: true, page: 'enbale', pageSize:40});
		})
		
		
		// 指数表现
		url = String.format("/Rfunc?cmd=p_getnav.getindexperformance()&filename=");
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('product_index_return'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
			// table.draw(data, { showRowNumber: true, page: 'enbale', pageSize:40});
		})
		
		
		// 最大回�?
		url = String.format("/Rfunc?cmd=p_getnav.mddperformance('{0}')&filename=", strPortid);
		$.get(url, function (ret, status) {
			var data = new google.visualization.DataTable();
			data = JSONtoDatatable(ret);
			var table = new google.visualization.Table(document.getElementById('product_mdd_div'));
			table.draw(data, { showRowNumber: true, scrollLeftStartPosition:3, width:'100%'});
			// table.draw(data, { showRowNumber: true, page: 'enbale', pageSize:40});
		})
		
	})	
	
})


jQuery(document).ready(function($){
	var $form_modal = $('.cd-user-modal'),
		$form_login = $form_modal.find('#cd-login'),
		$form_signup = $form_modal.find('#cd-signup'),
		$form_forgot_password = $form_modal.find('#cd-reset-password'),
		$form_modal_tab = $('.cd-switcher'),
		$tab_login = $form_modal_tab.children('li').eq(0).children('a'),
		$tab_signup = $form_modal_tab.children('li').eq(1).children('a'),
		$forgot_password_link = $form_login.find('.cd-form-bottom-message a'),
		$back_to_login_link = $form_forgot_password.find('.cd-form-bottom-message a'),
		$main_nav = $('.main-nav');

	//open modal
	$main_nav.click(function(event){
		// if( $(event.target).is($main_nav) ) {
			// // on mobile open the submenu
			// alert('1')
			// $(this).children('ul').toggleClass('is-visible');
		// } else {
			// // on mobile close submenu
			// alert('2')
			$main_nav.children('ul').removeClass('is-visible');
			//show modal layer
			$form_modal.addClass('is-visible');	
			//show the selected form
			( $(event.target).is('.cd-signup') ) ? signup_selected() : login_selected();
		// }

	});

	//close modal
	$('.cd-user-modal').on('click', function(event){
		if( $(event.target).is($form_modal) || $(event.target).is('.cd-close-form') ) {
			$form_modal.removeClass('is-visible');
		}	
	});
	//close modal when clicking the esc keyboard button
	$(document).keyup(function(event){
    	if(event.which=='27'){
    		$form_modal.removeClass('is-visible');
	    }
    });

	//switch from a tab to another
	$form_modal_tab.on('click', function(event) {
		event.preventDefault();
		( $(event.target).is( $tab_login ) ) ? login_selected() : signup_selected();
	});

	//hide or show password
	$('.hide-password').on('click', function(){
		var $this= $(this),
			$password_field = $this.prev('input');
		
		( 'password' == $password_field.attr('type') ) ? $password_field.attr('type', 'text') : $password_field.attr('type', 'password');
		( 'Hide' == $this.text() ) ? $this.text('Show') : $this.text('Hide');
		//focus and move cursor to the end of input field
		$password_field.putCursorAtEnd();
	});

	//show forgot-password form 
	$forgot_password_link.on('click', function(event){
		event.preventDefault();
		forgot_password_selected();
	});

	//back to login from the forgot-password form
	$back_to_login_link.on('click', function(event){
		event.preventDefault();
		login_selected();
	});

	function login_selected(){
		$form_login.addClass('is-selected');
		$form_signup.removeClass('is-selected');
		$form_forgot_password.removeClass('is-selected');
		$tab_login.addClass('selected');
		$tab_signup.removeClass('selected');
	}

	function signup_selected(){
		$form_login.removeClass('is-selected');
		$form_signup.addClass('is-selected');
		$form_forgot_password.removeClass('is-selected');
		$tab_login.removeClass('selected');
		$tab_signup.addClass('selected');
	}

	function forgot_password_selected(){
		$form_login.removeClass('is-selected');
		$form_signup.removeClass('is-selected');
		$form_forgot_password.addClass('is-selected');
	}

	//LOGIN
	$form_login.find('input[type="submit"]').on('click', function(event){
		
		var account = $("#signin-email").val()
		var pwd 	= $("#signin-password").val()
		
		var url = String.format("/Rfunc?cmd=login.main('{0}', '{1}')&filename=", account, pwd);
		$.get(url, function (ret, status) {
			data = JSONtoDatatable(ret);
			var jsonRes = JSON.parse(ret["res"]);
			jsonRes = jsonRes["data"];
			if(jsonRes["errorcode"] == 0){
				alert("login success");
				G_LOGIN = true;
				$('.cd-user-modal').trigger("click");
			}else{
				alert("Password or account is error");
			}
			
		})
		
		// event.preventDefault();
		// $form_login.find('input[type="email"]').toggleClass('has-error').next('span').toggleClass('is-visible');
	});
	$form_signup.find('input[type="submit"]').on('click', function(event){
		var name = $("#signup-username").val()
		var email = $("#signup-email").val()
		var pwd = $("#signup-password").val()
		
		url = String.format("/Rfunc?cmd=registeruser.main('{0}', '{1}', '{2}')&filename=", name, email, pwd);
		$.get(url, function (ret, status) {
			
			data = JSONtoDatatable(ret);
			var jsonRes = JSON.parse(ret["res"])
			jsonRes = jsonRes["data"]
			
			if(jsonRes["errorcode"] == 0){
				alert("register success");				
				login_selected();
			}
		})
		// event.preventDefault();
		// $form_signup.find('input[type="email"]').toggleClass('has-error').next('span').toggleClass('is-visible');
	});


	//IE9 placeholder fallback
	//credits http://www.hagenburger.net/BLOG/HTML5-Input-Placeholder-Fix-With-jQuery.html
	if(!Modernizr.input.placeholder){
		$('[placeholder]').focus(function() {
			var input = $(this);
			if (input.val() == input.attr('placeholder')) {
				input.val('');
		  	}
		}).blur(function() {
		 	var input = $(this);
		  	if (input.val() == '' || input.val() == input.attr('placeholder')) {
				input.val(input.attr('placeholder'));
		  	}
		}).blur();
		$('[placeholder]').parents('form').submit(function() {
		  	$(this).find('[placeholder]').each(function() {
				var input = $(this);
				if (input.val() == input.attr('placeholder')) {
			 		input.val('');
				}
		  	})
		});
	}
	
	// $('.main-nav').trigger("click");
	$("#Portfolio_Minitor").trigger("click");

});


//credits http://css-tricks.com/snippets/jquery/move-cursor-to-end-of-textarea-or-input/
jQuery.fn.putCursorAtEnd = function() {
	return this.each(function() {
    	// If this function exists...
    	if (this.setSelectionRange) {
      		// ... then use it (Doesn't work in IE)
      		// Double the length because Opera is inconsistent about whether a carriage return is one character or two. Sigh.
      		var len = $(this).val().length * 2;
      		this.setSelectionRange(len, len);
    	} else {
    		// ... otherwise replace the contents with itself
    		// (Doesn't work in Google Chrome)
      		$(this).val($(this).val());
    	}
	});
};
G_KEY_NAMES["JX02"] 		= "";
