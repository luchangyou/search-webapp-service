
$(function() {
	getOtherinfoForAll(1, "orgcq");//获取抽查信息
	//$('#org_little_stock_div').css("left", $('body').width()/2-500);
});

function getOtherinfoForAll(pageNo, channel) {
	var keyword = $("#pkeyword").val();
	var ct = $("#pct").val();
	var id = $("#pid").val();
	$.get("/search/detail/otherinfo",{
		orgType : "all",
		type : channel,
		keyword : keyword,
		pg : pageNo,
		ct : ct,
		id : id,
		r : Math.random()
	},function(html){
		$("#org_all_other_"+channel+"_div").html(html);
		var totalPage = $("#org_all_other_"+channel+"_tp").val();
		$("#org_all_other_"+channel+"_pageButton").html(genAllPageHTML(pageNo, totalPage, channel));
	});
}


function genAllPageHTML(pageNo, totalPage, channel) {
	pageNo = parseInt(pageNo);
	var funcName = channel == "childcom" ? "getChildcom" : "getOtherinfoForAll";
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
