
$(function() {
	getHighlevel(1, "highlevel");//获取高管
	getStock(1, "stock");//获取股东
	$('#org_little_stock_div').css("left", $('body').width()/2-500);
});

function getHighlevel(pageNo, channel) {
	var keyword = $("#pkeyword").val();
	var ct = $("#pct").val();
	var id = $("#pid").val();
	$.get("/search/detail/highlevel",{
		orgType : "little",
		type : "highlevel",
		keyword : keyword,
		pg : pageNo,
		ct : ct,
		id : id,
		r : Math.random()
	},function(html){
		$("#org_little_highlevel_div").html(html);
		var totalPage = $("#org_little_highlevel_tp").val();
		$("#org_little_highlevel_pageButton").html(genLittlePageHTML(pageNo, totalPage, channel));
		//为详情页中的人物添加链接
		$("span[id^='person_field_']").each(function(){
			var personObj = $(this);
			var name1 = $.trim(personObj.text());
			$("#org_little_highlevel_div a").each(function(){
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

function getStock(pageNo, channel) {
	var keyword = $("#pkeyword").val();
	var id = $("#pid").val();
	$.get("/search/detail/stock",{
		orgType : "little",
		keyword : keyword,
		pg : pageNo,
		id : id,
		r : Math.random()
	},function(html){
		$("#org_little_stock_div").html(html);
		var totalPage = $("#org_little_stock_tp").val();
		$("#org_little_stock_pageButton").html(genLittlePageHTML(pageNo, totalPage, channel));
	});
}

function getStockDetail(pageNo, channel) {
	var keyword = $("#pkeyword").val();
	var id = $("#pid").val();
	$.get("/search/detail/stock",{
		orgType : "littleDetail",
		keyword : keyword,
		pg : pageNo,
		id : id,
		r : Math.random()
	},function(html){
		$("#org_little_stock_detail_div #dataContent").html(html);
		$("#org_little_stock_detail_div").show();
		$("#org_little_stock_detail_div #dataContent").scrollTop(0);
		//var totalPage = $("#org_little_stock_tp").val();// alert(pageNo+":"+totalPage);
		//$("#org_little_stock_pageButton").html(genLittlePageHTML(pageNo, totalPage, channel));
	});
}

function genLittlePageHTML(pageNo, totalPage, channel) {
	pageNo = parseInt(pageNo);
	var funcName = channel == "highlevel" ? "getHighlevel" : channel == "stock" ? "getStock" : "";
	var groupSize = 3;
	var range = Math.floor((pageNo >= (groupSize + 1) / 2
			&& pageNo <= (totalPage - (groupSize - 1) / 2) ? groupSize
			: pageNo < (groupSize + 1) / 2 ? groupSize + 2
					* ((groupSize + 1) / 2 - pageNo) : groupSize + 2
					* (pageNo - (totalPage - (groupSize - 1) / 2))) / 2);
	var pageStr = '';
	if (totalPage > 1) {
		if (pageNo > 1) {
			pageStr += '<span class="nextPage" onclick="'+funcName+'(' + (pageNo - 1) + ', \'' + channel + '\');"><上一页</span> ';
		}
		for ( var i = 0; i < totalPage; i++) {
			if (Math.abs(i + 1 - pageNo) > range) {
				continue;
			}
			pageStr += '<span onclick="'+funcName+'('
					+ (i + 1) + ', \'' + channel + '\');"'
					+ (pageNo == (i + 1) ? ' class="curr"' : '') + '>' + (i + 1)
					+ '</span> ';
		}
		if (pageNo < totalPage) {
			pageStr += '<span class="nextPage" onclick="'+funcName+'(' + (pageNo + 1) + ', \'' + channel + '\');">下一页></span>';
		}
	}

	return pageStr;
}
