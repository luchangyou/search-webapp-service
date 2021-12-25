
//渲染分页
$(function() {
	if($("#mainDatalist").val() == "empty"){
		$(".w410").css("border", "none");
		return;
	}
	var channels = ["per", "org", "know", "event"];
	for(var i = 0; i < channels.length; i++){
		var channel = channels[i];
		if($("#" + channel + "_div").size() == 1){
			goSelectRightPage(1, channel);
		}
	}
});

/**
 * @param pageNo
 *            当前页码
 * @param totalPage
 *            页码总数
 * @returns {String}
 */
function genRightPageHTML(pageNo, totalPage, channel) {
	pageNo = parseInt(pageNo);
	var groupSize = 3;
	var range = Math.floor((pageNo >= (groupSize + 1) / 2
			&& pageNo <= (totalPage - (groupSize - 1) / 2) ? groupSize
			: pageNo < (groupSize + 1) / 2 ? groupSize + 2
					* ((groupSize + 1) / 2 - pageNo) : groupSize + 2
					* (pageNo - (totalPage - (groupSize - 1) / 2))) / 2);
	var pageStr = '';
	if (totalPage > 1) {
		if (pageNo > 1) {
			pageStr += '<span class="nextPage" onclick="goSelectRightPage(' + (pageNo - 1) + ', \'' + channel + '\');"><上一页</span> ';
		}
		for ( var i = 0; i < totalPage; i++) {
			if (Math.abs(i + 1 - pageNo) > range) {
				continue;
			}
			pageStr += '<span onclick="goSelectRightPage('
					+ (i + 1) + ', \'' + channel + '\');"'
					+ (pageNo == (i + 1) ? ' class="curr"' : '') + '>' + (i + 1)
					+ '</span> ';
		}
		if (pageNo < totalPage) {
			pageStr += '<span class="nextPage" onclick="goSelectRightPage(' + (pageNo + 1) + ', \'' + channel + '\');">下一页></span>';
		}
	}

	return pageStr;
}

function goSelectRightPage(pageNo, channel) {
	
	return;
	$.get("/search/detail/rlist",{
		channel : channel,
		mt : $("#pmt").val(),
		pg : pageNo,
//		scores : $("#pscores").val(),
		id : $("#pid").val(),
		sourcetype : $("#psourcetype").val(),
		ct : $("#pct").val(),
		tags : $("#ptags").val(),
		tname : $("#ptname").val(),
		keyword : $("#pkeyword").val(),
		r : Math.random()
	},function(html){
		$("#"+channel+"_div").html(html);
		if("know" == channel || "event" == channel){
			showPublishTime("#"+channel+"_div span");
		}else if("org" == channel){
			showFirstTag("rItem_"+channel);
		}
		var totalPage = $("#"+channel+"_tp").val();// alert(pageNo+":"+totalPage);
		$("#"+channel+"_pageButton").html(genRightPageHTML(pageNo, totalPage, channel));
		showDetailTagInfo();//右侧列表显示详细信息（悬浮）
	});
}



