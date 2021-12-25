
$(function() {
	var sourceCategory = $("#sourcecategory").val();
	if(sourceCategory == "US"){
		getHighlevel("US");//获取高管
		getStock("US");//获取股东
	}else{
		getHighlevel("");//获取高管
		getStock("");//获取股东
	}
	getNotice();//获取公告
	getYanbao();//获取研报
	getBusinessinfo();//获取工商基本信息
	getBusinessshareholder();//获取工商股东信息
	getBusinesschange();//获取工商变更信息
	getBusinesspeople();//获取工商人员信息
	getYearOptions();//生成年度列表
	getFinancial();//获取报表数据
});

function getHighlevel(sourceCategory) {
	var keyword = $("#pkeyword").val();
	var ct = $("#pct").val();
	var id = $("#pid").val();
	$.get("/search/detail/highlevel",{
		orgType : "common",
		type : "highlevel",
		keyword : keyword,
		ct : ct,
		id : id,
		sourceCategory : sourceCategory,
		r : Math.random()
	},function(html){
		$("#org_common_highlevel_div").html(html);
		//为详情页中的人物添加链接
		$("span[id^='person_field_']").each(function(){
			var personObj = $(this);
			var name1 = $.trim(personObj.text());
			$("#org_common_highlevel_div a").each(function(){
				var name2 = $.trim($(this).text());
				var url1 = $.trim($(this).attr("href"));
				if(name1 && name2 && name1 == name2){
					personObj.html("<a href='"+url1+"' style='font-size:14px;color:#3e3e3e;'>"+name1+"</a>");
					return false;
				}
			});
		});
	});
}

function getStock(sourceCategory) {
	var keyword = $("#pkeyword").val();
	var ct = $("#pct").val();
	var id = $("#pid").val();
	$.get("/search/detail/stock",{
		orgType : "common",
		keyword : keyword,
		ct : ct,
		id : id,
		sourceCategory : sourceCategory,
		r : Math.random()
	},function(html){
		$("#org_common_stock_div").html(html);
	});
}

function getNotice() {
	var channel="affiche";
	var keyword = $("#pkeyword").val();
	var tags = $("#ptags").val();
	var ct = $("#pct").val();
	var id = $("#pid").val();
	$.get("/search/morelist",{
		channel : channel,
		keyword : keyword,
		ct : ct,
		id : id,
		tags : tags,
		orgNoti : "orgNoti",
		r : Math.random()
	},function(html){
		$("#noti_div").html(html);
		showPublishTime("#noti_div td");
	});
}

function getYanbao() {
	var channel="inreport";
	var ct = $("#pct").val();
	var keyword = $("#pkeyword").val();
	var pg = $("#ppg").val();
	$.get("/search/yanbao",{
		channel : channel,
		ct : ct,
		pg : pg,
		report : "report",
		keyword : keyword,
		r : Math.random()
	},function(html){
		$("#yanbao_div").html(html);
		showPublishTime("#yanbao_div td");
	});
}

function getBusinessinfo() {
	var channel="businessinfo";
	var keyword = $("#pkeyword").val();
	var comname=$("#comname").val();
	var tags = $("#ptags").val();
	var ct = $("#pct").val();
	var id = $("#pid").val();
	$.get("/search/getBusinessinfo",{
		channel : channel,
		keyword : keyword,
		ct : ct,
		id : id,
		tags : tags,
		comname:comname,
		r : Math.random()
	},function(html){
		$("#Businessinfo_div").html(html);
		showPublishTime("#Businessinfo_div td");
	});
}


function getBusinessshareholder() {
	var channel="businessshareholder";
	var keyword = $("#pkeyword").val();
	var comname=$("#comname").val();
	var tags = $("#ptags").val();
	var ct = $("#pct").val();
	var id = $("#pid").val();
	$.get("/search/getBusinessinfo",{
		channel : channel,
		keyword : keyword,
		ct : ct,
		id : id,
		tags : tags,
		comname:comname,
		r : Math.random()
	},function(html){
		$("#Businessshareholder_div").html(html);
		showPublishTime("#Businessshareholder_div td");
	});
}


function getBusinesschange() {
	var channel="businesschange";
	var keyword = $("#pkeyword").val();
	var comname=$("#comname").val();
	var tags = $("#ptags").val();
	var ct = $("#pct").val();
	var id = $("#pid").val();
	$.get("/search/getBusinessinfo",{
		channel : channel,
		keyword : keyword,
		ct : ct,
		id : id,
		tags : tags,
		comname:comname,
		r : Math.random()
	},function(html){
		$("#Businesschange_div").html(html);
		showPublishTime("#Businesschange_div td");
	});
}


function getBusinesspeople() {
	var channel="businesspeople";
	var keyword = $("#pkeyword").val();
	var comname=$("#comname").val();
	var tags = $("#ptags").val();
	var ct = $("#pct").val();
	var id = $("#pid").val();
	$.get("/search/getBusinessinfo",{
		channel : channel,
		keyword : keyword,
		ct : ct,
		id : id,
		tags : tags,
		comname:comname,
		r : Math.random()
	},function(html){
		$("#Businesspeople_div").html(html);
		showPublishTime("#Businesspeople_div td");
	});
}

function getFinancial() {
	var type = $("#ftype").text();
	var date = $("#fdate").text();
	type = type == "资产负债表" ? 1 : type == "利润表" ? 2 : 3;
	date = date == "一季" ? 1 : date == "中期" ? 2 : date == "三季" ? 3 : 4;
	var ct = $("#ct").val();
	var year = $("#fyear").text();
	$.get("/search/detail/financial",{
		ct : ct,
		year : year,
		date : date,
		type : type,
		r : Math.random()
	},function(html){
		$(".orgReport tbody").html(html);
		$("#exportExcel").attr("href", "/search/detail/financial/excel?ct="+ct+"&year="+year+"&date="+date+"&type="+type+"&fileName="+$("#comname").val()+"("+year+$("#fdate").text()+")"+$("#ftype").text());
	});
}

function getYearOptions(){
	var now = new Date();
	var year = now.getFullYear();
	var month = now.getMonth() + 1;
//	alert("year:" + year + " month:" + month);
	if(month < 4){
		year--;
	}
	$("#fyear").text(year);
	var options = "";
	while(year > 2004){
		options += "<li><a href='javascript:void(0)'>" + (year--) + "</a></li>";
	}
	$("ul[cname='year']").html(options);
	var quarter = month < 4 ? "年度" : month < 7 ? "一季" : month < 10 ? "中期" : "三季";
	$("#fdate").text(quarter);
}



