
$(function() {
	if("总公司" == $("#sourcecategory").val()){
		goSelectBondPage(1, "highlevel");
		goSelectBondPage(1, "fgs");
		goSelectBondPage(1, "yyb");
	}else{
		goSelectBondPage(1, "employee");
	}
});

/**
* @param pageNo
*            当前页码
* @param totalPage
*            页码总数
* @returns {String}
*/
function genBondPageHTML(pageNo, totalPage, channel) {
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
			pageStr += '<span class="nextPage" onclick="goSelectBondPage(' + (pageNo - 1) + ', \'' + channel + '\');"><上一页</span> ';
		}
		for ( var i = 0; i < totalPage; i++) {
			if (Math.abs(i + 1 - pageNo) > range) {
				continue;
			}
			pageStr += '<span onclick="goSelectBondPage('
					+ (i + 1) + ', \'' + channel + '\');"'
					+ (pageNo == (i + 1) ? ' class="curr"' : '') + '>' + (i + 1)
					+ '</span> ';
		}
		if (pageNo < totalPage) {
			pageStr += '<span class="nextPage" onclick="goSelectBondPage(' + (pageNo + 1) + ', \'' + channel + '\');">下一页></span>';
		}
	}

	return pageStr;
}

function goSelectBondPage(pageNo, channel) {
	var subPath = (channel == "highlevel" || channel == "employee") ? "highlevel" : "childcom";
	var subDiv = (channel == "highlevel" || channel == "employee") ? "highlevel" : "child_"+channel;
	$.get("/search/detail/" + subPath,{
		orgType : "bond",
		type : channel,
		pg : pageNo,
		id : $("#comuid").val(),
		com : $("#combranch").val(),
		ct : $("#pct").val(),
		keyword : $("#pkeyword").val(),
		r : Math.random()
	},function(html){
		$("#org_bond_"+subDiv+"_div").html(html);
		var totalPage = $("#org_bond_"+subDiv+"_tp").val();// alert(pageNo+":"+totalPage);
		$("#org_bond_"+subDiv+"_pageButton").html(genBondPageHTML(pageNo, totalPage, channel));
		if(subPath == "highlevel"){
			//为详情页中的人物添加链接
			$("span[id^='person_field_']").each(function(){
				var personObj = $(this);
				var name1 = $.trim(personObj.text());
				$("#org_bond_highlevel_div a").each(function(){
					var name2 = $.trim($(this).text());
					var url1 = $.trim($(this).attr("href"));
					if(name1 && name2 && name1 == name2){
						personObj.html("<a href='"+url1+"' style='font-size:14px;color:#3e3e3e;'>"+name1+"</a>");
						return false;
					}
				});
			});
		}
	});
}




