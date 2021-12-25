$(function(){
    //搜索条件
    $('.selectStyle').live('click',function(){
        var self = $(this);
        var parent = self.parent();
        parent.children('.searchDetail').css({'width':self.width()});
        parent.children('.searchDetail').slideDown("slow");
    });
    //显示时间搜索
    $('#customLi').live('hover',function(){
        $('.dateSearch').show().animate({'opacity':'1','width':'300px','left':'105px'},600);
    });
    //显示子级列表
    $('.parentul').live('hover',function(){
    	$(this).children('.subul').show().css({"top":$(this).position().top, "left":$(this).width()});
    	$(this).css("background", "#e1e1e1");
    }).live('mouseleave',function(){
    	$(this).find('.subul').hide();
    	$(this).css("background", "");
    });
    $('.searchDetail:not(.subul)').live('mouseleave',function(){
        $(this).fadeOut("slow");
        $('.dateSearch').animate({'opacity':'0'},1000);
    });

    //选择条件点击事件
    $('.searchDetail li:not(".dateSearch")').live('click',function(){
        var self = $(this);
        var parent = self.parent().parent();
        parent.find('.selectVal').text(self.children('a').text());
        parent.find('.selectVal').attr("value",self.children('a').attr("value"));
//        $("#"+self.parent().attr("cname")).val(self.find('a').text());//add by lxq
        if(self.text() != '自定义时间'){
            self.parent().hide();
        }
        //$('.filterDiv').css({'height': $('.selectDiv').height()});
        var widthSelf = parent.parent().find('.selectStyle').width();
        parent.parent().find('.searchDetail').css({'width':widthSelf});
    });
    
    //子级选择条件点击事件
    $('.subul li').live('click',function(event){
    	var self = $(this);
    	var parent = self.parentsUntil($(".w98"), ".pos");
    	parent.find('.selectVal').text(self.children('a').text());
    	parent.find('.selectVal').attr("value",self.children('a').attr("value"));
    	parent.find('.selectStyle').siblings("ul").hide();
    	var widthSelf = parent.parent().find('.selectStyle').width();
    	parent.parent().find('.searchDetail').css({'width':widthSelf});
    	event.stopPropagation();
    });

    //切换右侧选项卡
    $('.chooseTypeH span').live('click',function(){
        var self = $(this);
        var tag = self.attr('tag');
        var parent = self.parent();
        parent.find('.hTitle').removeClass('hTitle').addClass('hTitleS');
        self.removeClass('hTitleS').addClass('hTitle');
        parent.parent().find('.selectedType').hide();
        parent.parent().find('.selectedType[tag="'+ tag +'"]').show();
    });

    //首页切换
    $('.chooseClass a').live('click',function(){
        $('.chooseClass').find('.curr').removeClass('curr');
        $(this).addClass('curr');
        var channel = $(this).attr('value');
        $('#channel').val(channel);//add by lxq
        if(channel == "org" || channel == "affiche"){
        	$("#resultHide").attr("id","result");
        }else{
        	$("#comticker_select").val("");//清空选择的公司的股票代码
        	$("#did").val("");//清空选择的公司的id
        	$("#result").attr("id","resultHide");
        }
    });

    $('.pos').live('mouseleave',function(){
        $(this).find('.searchDetail').hide();
    });

    //右侧列表显示详细信息（悬浮）
    showDetailTagInfo();
    
    
    var textObj = $("#keyword"),keyword="";  
    //文本框按键后触发的事件  
    textObj.keydown(function(event){  
        if(event.keyCode==13){
        	$('.searchBtn,.searchButton').click();
        	if(keyword != '' && textObj.val()) {
        		$("#keyword").val(this.innerHTML);
        		getData();
        	}
		}else if(event.keyCode==38){//up 
            //按上键后改变上一行的背景颜色  
            changeColor(true);  
        }else if(event.keyCode==40){//down 
            //按下键后改变下一行的背景颜色  
            changeColor(false);  
        }  
    }).keyup(function(){  //文本框按键松开后触发的事件 
        //如果文本框被清空，隐藏显示的提示框  
        if($.trim(textObj.val()).length==0){  
            hideResult();  
            $("#result").html("");
        }  
    }).blur(function(){
		hideResult();
	});
    //文本框被点击后触发的事件,调用getData, 传入参数0  
    textObj.click(0, getData);  
      
    //textObj.change(500, getData);  
    //文本框的值被改变后触发的事件,调用getData,传入参数500,不知道为什么上一行代码不能起到相同的作用  
    textObj.bind("input propertychange", 500, getData);
});

//右侧列表显示详细信息（悬浮）
function showDetailTagInfo(){
	$('.showTag').live('hover',function(){
        var self = $(this);
        var showDiv = self.find('.figureAndOrg');
        showDiv.css({'left':-(showDiv.width()+25)});
        showDiv.show();
    });
    $('.showTag').live('mouseleave',function(){
        $(this).find('.figureAndOrg').hide();
    });
}

//搜索框获取焦点事件
function searchInputFocus(obj,strV){
    var str = $(obj);
//    if(str.val() == strV){
//        $(obj).val('');
//    }
    $(obj).removeClass('defaultFont').addClass('fontStyle');
}
//搜索框失焦
function searchInputBlur(obj,strV){
    var str = $(obj);
    if((str.val() == '') || (str.val() == null) ){
//        $(obj).val(strV);
        $(obj).removeClass('fontStyle').addClass('defaultFont');
    }
}

//有展开收起的功能时，数据index大于4时，添加 .dataInfo
//展开收起
function openOrClose(obj){
    var text = $(obj).text();
    var parent = $(obj).parent().parent();
    if(text == '展开'){
        parent.find(".dataInfo,.moreHref").slideDown("slow");
        $(obj).text('收起');
    }else{
        parent.find(".dataInfo,.moreHref").slideUp("slow");
        $(obj).text('展开');
    }
}

//筛选条件
function filterFun(obj){
    var tag = $(obj).attr('tag');
    var parent = $(obj).parent().parent();
    if(tag == 1){
        parent.find('.infoCounts').hide().animate({ left: 0, bottom:30 ,opacity: '0'},250);
        parent.find('.selectDiv').show().animate({  left: 0, opacity: '1'},500);
        $(obj).attr('tag','2');
    }else{
        parent.find('.infoCounts').show().animate({  left: 0,  bottom:11 ,opacity: '1'},500);
        parent.find('.selectDiv').hide().animate({  left: 0, opacity: '0'},250);
        $(obj).attr('tag','1');
    }
}

//以下为自动补全效果====================================
var timeoutObj;  
var index = -1; //记录按上下键后得到的行数  
  
var isFirst = true; //标记是否选中的是文本框  
var defaultValue; //文本框的输入值  
function changeColor(isUpKey){
	var channel = $('#channel').val();//add by lxq
    if(channel != "org" && channel != "affiche"){
    	return;
    }
    if(isFirst){ //第一次按上下键  
        isFirst = false;  
        defaultValue = $("#keyword").val();  
    }  
    //根据class获取提示框所有的行  
    var rows = $(".span");  
    var len = rows.length;  
    if(index>=0)  
    {  
        //如果当前行大于等于0，就把当前行的背景颜色恢复  
        rows[index].style.backgroundColor="#fff";  
    }  
    if(isUpKey)  
    {  
        //按了上键后，如果当前选中的是文本框，移动后应该是最后一行  
        //否则选择行往上移动一格，如果当前是第一行，移动后选中的是文本框  
        index = index==-1 ? len-1 : index-1;  
    }  
    else  
    {  
        //按了下键后，如果当前是最后一行，移动后应该到文本框，即index=-1，  
        //否则选择行往下移动一格  
        index = index==len-1 ? -1 : index+1;  
    }  
    if(index>=0)  
    {  
        //移动后的选中行不是文本框，就将选中行背景颜色改变  
        //并将文本框的值设置为当前行的值  
        rows[index].style.backgroundColor="#ccc";  
        $("#keyword").val(rows.eq(index).attr("comname"));
        $("#comticker_select").val(rows.eq(index).attr("cid"));
        $("#did").val(rows.eq(index).attr("id"));
    }  
    else  
    {  
        //移动后到文本框了，就将文本框的原来值恢复  
        //并将选中文本框标记设置为true  
        $("#keyword").val(defaultValue);  
        isFirst = true;  
        $("#comticker_select").val("");//清空选择的公司的股票代码
        $("#did").val("");//清空选择的公司的id
    }  
}  
  
function getData(event){
	var channel = $('#channel').val();//add by lxq
    if(channel != "org" && channel != "affiche"){
    	return;
    }
    var textObj = $("#keyword");  
    //如果timeoutObj已经存在，就清除，为了实现在文本框连续按键，在间隔时间较短只发一次请求，不用每输入一个文本就发一次清除  
    if(timeoutObj){  
        clearTimeout(timeoutObj);  
    }  
    timeoutObj = setTimeout(function(){  
        if($.trim(textObj.val()).length>0){  
            //获取数据，传入文本框的值作参数  
			$.ajax({
				url : "/search/complete",
				data : {
					kw : $.trim(textObj.val()),
					r : Math.random()
				},
				success : function(data){
					showResult(data); 
				}
			});
        }  
    });//在event.data时间后执行请求，就是事件绑定函数时传入的参数，点击文本框立即加载，输入文本则在500毫秒后加载  
}  
  
function showResult(jsonData){
	$("#comticker_select").val("");//清空选择的公司的股票代码
	$("#did").val("");//清空选择的公司的id
	var resultObj = $("#result");  
	if(typeof(jsonData) == 'undefined' || jsonData.length == 0){
		hideResult();
		resultObj.html("");//清空提示框里面之前的内容  
		return;
	}
    index = -1;//设置提示框选中值，即选中了文本框  
    resultObj.css({"border":"1px solid #f39800","background":"#fff","position":"absolute","top":$("#keyword").position().top+$("#keyword").height()+1,"left":$(".searchPosition").position().left});                
    resultObj.html("");//清空提示框里面之前的内容  
    var rows = eval(jsonData);//获取json数据  
    for(var i=0; i<rows.length; i++){  
        var divObj = $("<div>");//创建提示框里一行数据  
        divObj.addClass("span").css({'color':'#3e3e3e','line-height':'26px','text-indent':'8px'});//设置class，方便后面获取提示框里的行  
        var comname = rows[i].comname ? rows[i].comname : rows[i].nameen;
        var cid = rows[i].comticker === null ? "" : rows[i].comticker;
        var shortname = rows[i].shortname === null ? "" : rows[i].shortname;
        var stoname = rows[i].stoname === null ? "" : rows[i].stoname;
        divObj.attr({'id':rows[i].id,'comname':comname,'cid':cid,'shortname':shortname,'stoname':stoname}).html(comname+(rows[i].comticker?"<i style='float:right;margin-right:10px;'>["+rows[i].comticker+"]</i>":"")).appendTo(resultObj);//将这一行添加到提示框里面  
        divObj.hover(function(){//设置这一行的hover事件，即进入行改变背景颜色为#ccc，离开行改变背景颜色#fff  
            this.style.backgroundColor="#f2f2f2";  
        }, function(){  
            this.style.backgroundColor="#fff";  
        });  
        divObj.click(function(event){//设置这一行的click事件，将文本框的值设置当前行的值  
            $("#keyword").val($(this).attr("comname"));  
            $("#comticker_select").val($(this).attr("cid"));  
            $("#did").val($(this).attr("id"));  
            $('.searchBtn,.searchButton').click();
        });  
    }
    resultObj.show(300);//将提示框div显示出来  
}  
//隐藏提示框  
function hideResult(){  
    index=-1;  
    var resultObj = $("#result");  
    setTimeout("$('#result,#resultHide').hide(300)",100);
}

//以上为自动补全效果====================================


//搜索
function searchForIndexPage(){
	var channel = $("#channel").val();
	var keyword = $.trim($("#keyword").val());
	var comticker_select = $.trim($("#comticker_select").val());
	var did = $.trim($("#did").val());
	if((channel == "org" || channel == "affiche") && !comticker_select && !did && $("#result div").size() > 0){
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
	var action = "/search-webapp-service/list?channel="+channel + "&keyword=" + keyword + "&pg=1" + "&comticker_select=" + comticker_select + "&did=" + did;
	document.location.href = action + "&r=" + Math.random();
}

