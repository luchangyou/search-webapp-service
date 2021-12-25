$(function(){
	$("#mkeyword").live("keydown",function(event){
		if(event.keyCode == 13){
			goSearchMoreList();
		}
	});
	
	//切换组织详情董监高选项卡
    $('.orgDetailPerTags span').live('click',function(){
        var self = $(this);
        var tag = self.attr('tag');
        var parent = self.parent();
        parent.find('.orgDetailPerTagCurr').removeClass('orgDetailPerTagCurr').addClass('orgDetailPerTag');
        self.removeClass('orgDetailPerTag').addClass('orgDetailPerTagCurr');
        parent.parent().find('.selectedType').hide();
        parent.parent().find('.selectedType[tag="'+ tag +'"]').show();
    });
    
	showDiffDays("span");
    showPublishTime("span");
});

function showDiffDays(selector){
	$(selector+"[name='day']").each(function(){$(this).text(getDiffDays($.trim($(this).text())));});
}

function showPublishTime(selector){
	$(selector+"[name='date']").each(function(){$(this).text(getPublishTime($.trim($(this).text())));});
}

//计算发布时间在多久之前
function getDiffDays(publishTime){
	if(publishTime){
//		var fromms = moment(publishTime, "YYYY-MM-DD HH:mm:ss").format("X")*1000;
		var now = new Date();
		var nowms = now.getTime();
		var diff = nowms - publishTime;
		var days = diff / (24 * 60 * 60 * 1000);
		days = Math.floor(days);
		if(days < 8){
			if(days > 0){
				return days + "天前";
			}else if(days == 0){
				var hours = Math.floor(diff / (60 * 60 * 1000));
				var mins = Math.floor(diff / (60 * 1000) - hours * 60);
				return (hours > 0 ? hours + "小时" : "") + (mins > 0 ? mins + "分" : "") + "前";
			}
		}
	}
	return "";
}

function getPublishTime(publishTime){
	if(publishTime == "未知"){
		return "未知";
	}
	if(isNaN(publishTime) && publishTime){
		return publishTime.replace(" 00:00:00", "").replace("None", "未知").replace(/-(\d)\b/g, "-0$1");
	}
	if(publishTime && publishTime != "未知"){
		var now = new Date(parseFloat(publishTime));
		now = now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+now.getHours()+":"+now.getMinutes();
		var date = moment(now, "YYYY-MM-DD H:m:s").format("YYYY-MM-DD");
		return date;
	}
	
}

//计算年龄
function getPerAge(){
	var birthday = $.trim($("#perBirthday").text());
	if(birthday){
		var year1 = moment(birthday, "YYYY-MM-DD").format("YYYY");
		var year2 = new Date().getFullYear();
		var age = year2 -year1;
		$("#perAge").text(age + "岁");
	}
}

function showFirstTag(divName){
	$("div[name='"+divName+"']").each(function(){
		var tag = $(this).find("span[name='tagOption']").eq(0).text();
		if(divName.indexOf("per") != -1){
			var name = $(this).find(".userNames").eq(0).text();
			if(tag == name){
				tag = $(this).find("span[name='tagOption']").eq(1).text();
			}
		}
		$(this).find("*[name='rTag']").eq(0).text(tag).attr("title",tag);
	});
}

//点击频道
function searchChannel(channel){
	var comticker_select = "";
	var did = "";
	var keyword = $.trim($("#keyword").val());
	if((channel == "org" || channel == "affiche")){
		comticker_select = getComticker(keyword, channel)[0];
		did = getComticker(keyword, channel)[1];
	}
	document.location.href = "/search-webapp-service/list?channel="+channel + "&pg=1" + "&keyword=" + keyword + "&comticker_select=" + comticker_select + "&did=" + did + "&r=" + Math.random();
	if($('#keyword').val()){
	}
}

//搜索
function searchDataList(channel){
	var keyword = $.trim($("#keyword").val());
	var matchedObjArray = getComticker(keyword, channel);
	var comticker_select = matchedObjArray[0];
	var did = matchedObjArray[1];
	
	var action = "/search-webapp-service/list?channel="+channel + "&keyword=" + keyword + "&pg=1&ctime=" + $.trim($("#ctime").text()) + "&cmethod=" + $.trim($("#cmethod").attr("value")) +"&cfaxing=" + $.trim($("#cfaxing").attr("value")) +"&ctouzi=" + $.trim($("#ctouzi").attr("value")) + "&cprice=" + $.trim($("#cprice").text());
	document.location.href = action + "&r=" + Math.random();
}

function getComticker(keyword, channel){
	var comticker_select = $.trim($("#comticker_select").val());
	var did = $.trim($("#did").val());
	if(!comticker_select && !did && $("#result div").size() > 0){
		var matchTimes = 0;
		$("#result div").each(function(){
			if($(this).attr("comname").toLowerCase() == keyword.toLowerCase() || keyword.toLowerCase() == $(this).attr("cid").toLowerCase() || keyword.toLowerCase() == $(this).attr("shortname").toLowerCase() || keyword.toLowerCase() == $(this).attr("stoname").toLowerCase()){
				comticker_select = $(this).attr("cid");
				did = $(this).attr("id");
				if(channel == "affiche"){
					return false;//break each;
				}
				matchTimes++;
				if(matchTimes > 1){
					return false;//break each;
				}
			}
		});
		if(matchTimes > 1){
			comticker_select = "";
			did = "";
		}
	}
	return [comticker_select, did];
}

//查询知识栏目的不同频道
function searchDataListByCsc(cscValue){
	$("#csc").val(cscValue);
	searchDataList('knowledge');
}

//渲染分页
$(function() {
	var pageNo = $("#ppg").val();
	var totalPage = $("#tp").val();
	//alert(pageNo+":"+totalPage);
	$("#pageButton").html(genPageHTML(pageNo, totalPage));
});

/**
 * @param pageNo
 *            当前页码
 * @param totalPage
 *            页码总数
 * @returns {String}
 */
function genPageHTML(pageNo, totalPage) {
	pageNo = parseInt(pageNo);
	var groupSize = 9;//每页下面显示的页码数的最大值
	var range = Math.floor((pageNo >= (groupSize + 1) / 2
			&& pageNo <= (totalPage - (groupSize - 1) / 2) ? groupSize
			: pageNo < (groupSize + 1) / 2 ? groupSize + 2
					* ((groupSize + 1) / 2 - pageNo) : groupSize + 2
					* (pageNo - (totalPage - (groupSize - 1) / 2))) / 2);
	var pageStr = '';
	if (totalPage > 1) {
		if (pageNo > 1) {
			pageStr += '<span class="nextPage" onclick="goSelectPage(' + (pageNo - 1) + ');">上一页</span>';
		}
		for ( var i = 0; i < totalPage; i++) {
			if (Math.abs(i + 1 - pageNo) > range) {
				continue;
			}
			pageStr += '<span onclick="goSelectPage('
					+ (i + 1) + ');"'
					+ (pageNo == (i + 1) ? ' class="curr"' : '') + '>' + (i + 1)
					+ '</span>';
		}
		if (pageNo < totalPage) {
			pageStr += '<span class="nextPage" onclick="goSelectPage(' + (pageNo + 1) + ');">下一页</span>';
		}
	}

	return pageStr;
}

function goSelectPage(pageNo) {
	var sourcetype = $("#psourcetype").val();
	var channel = $("#pchannel").val();
	var id = $("#pid").val();
	var mt = $("#pmt").val();
	var scores = $("#pscores").val();
	var ct = $("#pct").val();
	var tags = $("#ptags").val();
	var tname = $("#ptname").val();
	var keyword = $("#pkeyword").val();
	var ctime = $("#pctime").val();
	var csource = $("#pcsource").val();
	var cindustry = $("#pcindustry").val();
	var ctype = $("#pctype").val();
	var cggtype = $("#pcggtype").val();
	var csex = $("#pcsex").val();
	var cprop = $("#pcprop").val();
	var cyan = $("#pcyan").val();
	var gstype = $("#pgstype").val();
	var cmethod = $("#pcmethod").val();
	var cprice = $("#pcprice").val();
	var carea = $("#pcarea").val();
	var cpertype = $("#pcpertype").val();
	var csourcecategory = $("#pcsourcecategory").val();
	var csc = $("#pcsc").val();
	var comticker_select = $("#pcomticker_select").val();
	var did = $("#pdid").val();
	
	var action = "/search-webapp-service/list?channel="+channel + "&keyword=" + keyword + "&pg=" + pageNo + "&did=" + did;
	if(sourcetype == "morelist"){
		var mctime = $("#pmctime").val();
		var mctype = $("#pmctype").val();
		var mcarea = $("#pmcarea").val();
		var mcindustry = $("#pmcindustry").val();
		var mkeyword = $("#pmkeyword").val();
		action += "&mctime=" + mctime + "&mctype=" + mctype + "&mcarea=" + mcarea + "&mcindustry=" + mcindustry + "&mkeyword=" + mkeyword;
	}
	document.location.href = action + "&r=" + Math.random();
}

function goSearchMoreList() {
	var channel = $("#pchannel").val();
	var id = $("#pid").val();
	var mt = $("#pmt").val();
	var scores = $("#pscores").val();
	var ct = $("#pct").val();
	var tags = $("#ptags").val();
	var tname = $("#ptname").val();
	var keyword = $("#pkeyword").val();
	var ctime = $("#pctime").val();
	var csource = $("#pcsource").val();
	var cindustry = $("#pcindustry").val();
	var ctype = $("#pctype").val();
	var csex = $("#pcsex").val();
	var cprop = $("#pcprop").val();
	var cyan = $("#pcyan").val();
	var gstype = $("#pgstype").val();
	var cmethod = $("#pcmethod").val();
	var cprice = $("#pcprice").val();
	var carea = $("#pcarea").val();
	var cpertype = $("#pcpertype").val();
	var csourcecategory = $("#pcsourcecategory").val();
	var csc = $("#pcsc").val();
	var mctime = $("#mctime").text();
	var mctype = $("#mctype").text();
	var mcarea = $("#mcarea").text();
	var mcindustry = $("#mcindustry").text();
	var mkeyword = $.trim($("#mkeyword").val());
	
	var action = "/search/morelist?channel="+channel + "&id=" + id + "&mt=" + mt + "&keyword=" + keyword + "&pg=1&ctime=" + ctime + "&csc=" + csc
	+ "&csex=" + csex + "&csource=" + csource + "&cindustry=" + cindustry + "&ctype=" + ctype + "&cprop=" + cprop + "&cyan=" + cyan+ "&gstype=" + gstype + "&cmethod=" + cmethod
	+ "&cprice=" + cprice + "&carea=" + carea + "&cpertype=" + cpertype + "&csourcecategory=" + csourcecategory + "&scores=" + "" + "&ct=" + ct + "&tags=" + tags + "&tname=" + tname
	+ "&mctime=" + mctime + "&mctype=" + mctype + "&mcarea=" + mcarea + "&mcindustry=" + mcindustry + "&mkeyword=" + (mkeyword=="输入关键词"?"":mkeyword);
	document.location.href = action + "&r=" + Math.random();
}

function lookGraph(mt, id, ct, name, tags){
	window.open('/search/detail/graph?mt='+mt+'&id='+id+'&ct='+ct+'&name='+encodeURIComponent(name)+'&tags='+encodeURIComponent(tags),'_blank');
}

function lookOrgEventGraph(uuid){
	window.open('/search-webapp-service/lookGraph/'+uuid+'/event/index.html');
}
function lookOrgImgGraph(uuid){
	window.open('/search-webapp-service/lookGraph/'+uuid+'/image/index.html');
}

function orgImgGraph(uuid){
	window.open('/search-webapp-service/tupu/tupuPage?uuid='+uuid);
}

function openInfo(url){
	window.open(url);
}

function exportExcel(url, uuid) {

	console.log(url);
	console.log(uuid);
	$.ajax({
		type: "GET",
		url: url,
		data: {uuid:uuid},
		dataType: "json",
		success: function (data) {
			alert(data);
			//window.open(data);
		}
	});
}




function gotoOtherSearchEngine(engineName, keyword){
	var url = "";
	if("baidu" == engineName){
		url = "http://baike.baidu.com/search?word="+encodeURIComponent(keyword)+"&pn=0&rn=0&enc=utf8";
	} else if("wiki" == engineName){
		url = "http://zh.wikipedia.org/zh-cn/"+encodeURIComponent(keyword);
	} else if("sogou" == engineName){
		url = "http://baike.sogou.com/Search.e?sp=S"+encodeURIComponent(keyword)+"&sp=0";
	} else if("haosou" == engineName){
		url = "http://baike.haosou.com/search/?q="+encodeURIComponent(keyword);
	}
	window.open(url,'_blank');
}


