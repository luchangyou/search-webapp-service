/* 客服代码 */
$("#onlineOpen").mouseover(function(){
	var onService_panel=$("#onService_panel");
	onService_panel.animate({right:0},function(){});
	$(this).hide();
});

$("#onlineClose").click(function(){
	var onService_panel=$("#onService_panel");
	onService_panel.animate({right:-132});

	$("#onlineOpen").show();
});


$(".online_icon").click(function(){

});



/* 限制文字字数 */
function checkLen(obj,maxs){
	var maxChars = maxs;//最多字符数 
	if (obj.value.length > maxChars){
		obj.value = obj.value.substring(0,maxChars);
	}
	var curr = maxChars - obj.value.length; 
	$(obj).parents("dl").find(".text_length b").text(curr.toString());
} 