//function _getTheme(theme){
//    var myTheme;
//    require(["echarts", "ethemes" + theme], function(theme){ myTheme = theme;});
//    return myTheme;
//}

HTMLWidgets.widget({
  name: 'echarts',
  type: 'output',

  initialize: function(el, width, height) {
    return echarts.init(el);
  },


  renderValue: function(el, x, instance) {
    if (typeof x.BMap != 'undefined') {  //BMap: give up...
        var BMapExt = new BMapExtension(x.ElementId, BMap, require('echarts'));
        var Bmap = BMapExt.getMap();
        //Bmap.centerAndZoom(Bmap.Point(startPoint.x, startPoint.y), 5);
        Bmap.enableScrollWheelZoom(true);
        var BmapContainer = BMapExt.getEchartsContainer();
        instance = BMapExt.initEcharts(BmapContainer);
    }
    var theme = 'default';
    if (typeof(x.theme) != 'undefined') { theme = x.theme; }
    if (theme === "default" || theme === "macarons" || theme === "infographic") {
        instance.setTheme(theme);
    } else {
        if (typeof theme == "object") {instance.setTheme(theme);}
        if (theme == 'blue') {instance.setTheme(blueTheme);}
        if (theme == 'dark') {instance.setTheme(darkTheme);}
        if (theme == 'gray') {instance.setTheme(grayTheme);}
        if (theme == 'green') {instance.setTheme(greenTheme);}
        if (theme == 'helianthus') {instance.setTheme(helianthusTheme);}
        if (theme == 'macarons2') {instance.setTheme(macarons2Theme);}
        if (theme == 'mint') {instance.setTheme(mintTheme);}
        if (theme == 'red') {instance.setTheme(redTheme);}
        if (theme == 'roma') {instance.setTheme(romaTheme);}
        if (theme == 'sakura') {instance.setTheme(sakuraTheme);}
        if (theme == 'shine') {instance.setTheme(shineTheme);}
        if (theme == 'vintage') {instance.setTheme(vintageTheme);}

        //var themeObj = _getTheme(theme);
        //alert(typeof themeObj);
        //instance.setTheme(themeObj);

    }
	instance.setOption(x);
  },

  resize: function(el, width, height, instance) {
    location.reload();
  }


});

var mintTheme = {color:['#8aedd5','#93bc9e','#cef1db','#7fe579','#a6d7c2','#bef0bb','#99e2vb','#94f8a8','#7de5b8','#4dfb70'],dataRange:{color:['#93bc92','#bef0bb']},k:{itemStyle:{normal:{color:'#8aedd5',color0:'#7fe579',lineStyle:{width:1,color:'#8aedd5',color0:'#7fe579'}},emphasis:{}}},pie:{itemStyle:{normal:{borderColor:'#fff',borderWidth:1,label:{show:true,position:'outer',textStyle:{color:'#1b1b1b'},lineStyle:{color:'#1b1b1b'}},labelLine:{show:true,length:20,lineStyle:{width:1,type:'solid'}}}}},map:{mapType:'china',mapLocation:{x:'center',y:'center'},showLegendSymbol:true,itemStyle:{normal:{borderColor:'#fff',borderWidth:1,areaStyle:{color:'#ccc'},label:{show:false,textStyle:{color:'rgba(139,69,19,1)'}}},emphasis:{borderColor:'rgba(0,0,0,0)',borderWidth:1,areaStyle:{color:'#f3f39d'},label:{show:false,textStyle:{color:'rgba(139,69,19,1)'}}}}},force:{itemStyle:{normal:{label:{show:false},nodeStyle:{brushType:'both',strokeColor:'#49b485'},linkStyle:{strokeColor:'#49b485'}},emphasis:{label:{show:false},nodeStyle:{},linkStyle:{}}}},gauge:{axisLine:{show:true,lineStyle:{color:[[0.2,'#93bc9e'],[0.8,'#8aedd5'],[1,'#a6d7c2']],width:8}},axisTick:{splitNumber:10,length:12,lineStyle:{color:'auto'}},axisLabel:{textStyle:{color:'auto'}},splitLine:{length:18,lineStyle:{color:'auto'}},pointer:{length:'90%',color:'auto'},title:{textStyle:{color:'#333'}},detail:{textStyle:{color:'auto'}}}
};

var blueTheme = {color:['#1790cf','#1bb2d8','#99d2dd','#88b0bb','#1c7099','#038cc4','#75abd0','#afd6dd'],title:{textStyle:{fontWeight:'normal',color:'#1790cf'}},dataRange:{color:['#1178ad','#72bbd0']},toolbox:{color:['#1790cf','#1790cf','#1790cf','#1790cf']},tooltip:{backgroundColor:'rgba(0,0,0,0.5)',axisPointer:{type:'line',lineStyle:{color:'#1790cf',type:'dashed'},crossStyle:{color:'#1790cf'},shadowStyle:{color:'rgba(200,200,200,0.3)'}}},dataZoom:{dataBackgroundColor:'#eee',fillerColor:'rgba(144,197,237,0.2)',handleColor:'#1790cf'},grid:{borderWidth:0},categoryAxis:{axisLine:{lineStyle:{color:'#1790cf'}},splitLine:{lineStyle:{color:['#eee']}}},valueAxis:{axisLine:{lineStyle:{color:'#1790cf'}},splitArea:{show:true,areaStyle:{color:['rgba(250,250,250,0.1)','rgba(200,200,200,0.1)']}},splitLine:{lineStyle:{color:['#eee']}}},timeline:{lineStyle:{color:'#1790cf'},controlStyle:{normal:{color:'#1790cf'},emphasis:{color:'#1790cf'}}},k:{itemStyle:{normal:{color:'#1bb2d8',color0:'#99d2dd',lineStyle:{width:1,color:'#1c7099',color0:'#88b0bb'}}}},map:{itemStyle:{normal:{areaStyle:{color:'#ddd'},label:{textStyle:{color:'#c12e34'}}},emphasis:{areaStyle:{color:'#99d2dd'},label:{textStyle:{color:'#c12e34'}}}}},force:{itemStyle:{normal:{linkStyle:{color:'#1790cf'}}}},chord:{padding:4,itemStyle:{normal:{borderWidth:1,borderColor:'rgba(128,128,128,0.5)',chordStyle:{lineStyle:{color:'rgba(128,128,128,0.5)'}}},emphasis:{borderWidth:1,borderColor:'rgba(128,128,128,0.5)',chordStyle:{lineStyle:{color:'rgba(128,128,128,0.5)'}}}}},gauge:{axisLine:{show:true,lineStyle:{color:[[0.2,'#1bb2d8'],[0.8,'#1790cf'],[1,'#1c7099']],width:8}},axisTick:{splitNumber:10,length:12,lineStyle:{color:'auto'}},axisLabel:{textStyle:{color:'auto'}},splitLine:{length:18,lineStyle:{color:'auto'}},pointer:{length:'90%',color:'auto'},title:{textStyle:{color:'#333'}},detail:{textStyle:{color:'auto'}}},textStyle:{fontFamily:'微软雅黑,Arial,Verdana,sans-serif'}
};

var darkTheme = {backgroundColor:'#1b1b1b',color:['#FE8463','#9BCA63','#FAD860','#60C0DD','#0084C6','#D7504B','#C6E579','#26C0C0','#F0805A','#F4E001','#B5C334'],title:{textStyle:{fontWeight:'normal',color:'#fff'}},legend:{textStyle:{color:'#ccc'}},dataRange:{itemWidth:15,color:['#FFF808','#21BCF9'],textStyle:{color:'#ccc'}},toolbox:{color:['#fff','#fff','#fff','#fff'],effectiveColor:'#FE8463',disableColor:'#666'},tooltip:{backgroundColor:'rgba(250,250,250,0.8)',axisPointer:{type:'line',lineStyle:{color:'#aaa'},crossStyle:{color:'#aaa'},shadowStyle:{color:'rgba(200,200,200,0.2)'}},textStyle:{color:'#333'}},dataZoom:{dataBackgroundColor:'#555',fillerColor:'rgba(200,200,200,0.2)',handleColor:'#eee'},grid:{borderWidth:0},categoryAxis:{axisLine:{show:false},axisTick:{show:false},axisLabel:{textStyle:{color:'#ccc'}},splitLine:{show:false}},valueAxis:{axisLine:{show:false},axisTick:{show:false},axisLabel:{textStyle:{color:'#ccc'}},splitLine:{lineStyle:{color:['#aaa'],type:'dashed'}},splitArea:{show:false}},polar:{name:{textStyle:{color:'#ccc'}},axisLine:{lineStyle:{color:'#ddd'}},splitArea:{show:true,areaStyle:{color:['rgba(250,250,250,0.2)','rgba(200,200,200,0.2)']}},splitLine:{lineStyle:{color:'#ddd'}}},timeline:{label:{textStyle:{color:'#ccc'}},lineStyle:{color:'#aaa'},controlStyle:{normal:{color:'#fff'},emphasis:{color:'#FE8463'}},symbolSize:3},line:{smooth:true},k:{itemStyle:{normal:{color:'#FE8463',color0:'#9BCA63',lineStyle:{width:1,color:'#FE8463',color0:'#9BCA63'}}}},radar:{symbol:'emptyCircle',symbolSize:3},pie:{itemStyle:{normal:{borderWidth:1,borderColor:'rgba(255,255,255,0.5)'},emphasis:{borderWidth:1,borderColor:'rgba(255,255,255,1)'}}},map:{itemStyle:{normal:{borderColor:'rgba(255,255,255,0.5)',areaStyle:{color:'#ddd'},label:{textStyle:{}}},emphasis:{areaStyle:{color:'#FE8463'},label:{textStyle:{}}}}},force:{itemStyle:{normal:{linkStyle:{color:'#fff'}}}},chord:{itemStyle:{normal:{borderWidth:1,borderColor:'rgba(228,228,228,0.2)',chordStyle:{lineStyle:{color:'rgba(228,228,228,0.2)'}}},emphasis:{borderWidth:1,borderColor:'rgba(228,228,228,0.9)',chordStyle:{lineStyle:{color:'rgba(228,228,228,0.9)'}}}}},gauge:{axisLine:{show:true,lineStyle:{color:[[0.2,'#9BCA63'],[0.8,'#60C0DD'],[1,'#D7504B']],width:3,shadowColor:'#fff',shadowBlur:10}},axisTick:{length:15,lineStyle:{color:'auto',shadowColor:'#fff',shadowBlur:10}},axisLabel:{textStyle:{fontWeight:'bolder',color:'#fff',shadowColor:'#fff',shadowBlur:10}},splitLine:{length:25,lineStyle:{width:3,color:'#fff',shadowColor:'#fff',shadowBlur:10}},pointer:{shadowColor:'#fff',shadowBlur:5},title:{textStyle:{fontWeight:'bolder',fontSize:20,fontStyle:'italic',color:'#fff',shadowColor:'#fff',shadowBlur:10}},detail:{shadowColor:'#fff',shadowBlur:5,offsetCenter:[0,'50%'],textStyle:{fontWeight:'bolder',color:'#fff'}}},funnel:{itemStyle:{normal:{borderColor:'rgba(255,255,255,0.5)',borderWidth:1},emphasis:{borderColor:'rgba(255,255,255,1)',borderWidth:1}}},textStyle:{fontFamily:'微软雅黑,Arial,Verdana,sans-serif'}
};

var grayTheme = {color:['#757575','#c7c7c7','#dadada','#8b8b8b','#b5b5b5','#e9e9e9'],title:{textStyle:{fontWeight:'normal',color:'#757575'}},dataRange:{color:['#636363','#dcdcdc']},toolbox:{color:['#757575','#757575','#757575','#757575']},tooltip:{backgroundColor:'rgba(0,0,0,0.5)',axisPointer:{type:'line',lineStyle:{color:'#757575',type:'dashed'},crossStyle:{color:'#757575'},shadowStyle:{color:'rgba(200,200,200,0.3)'}}},dataZoom:{dataBackgroundColor:'#eee',fillerColor:'rgba(117,117,117,0.2)',handleColor:'#757575'},grid:{borderWidth:0},categoryAxis:{axisLine:{lineStyle:{color:'#757575'}},splitLine:{lineStyle:{color:['#eee']}}},valueAxis:{axisLine:{lineStyle:{color:'#757575'}},splitArea:{show:true,areaStyle:{color:['rgba(250,250,250,0.1)','rgba(200,200,200,0.1)']}},splitLine:{lineStyle:{color:['#eee']}}},timeline:{lineStyle:{color:'#757575'},controlStyle:{normal:{color:'#757575'},emphasis:{color:'#757575'}}},k:{itemStyle:{normal:{color:'#8b8b8b',color0:'#dadada',lineStyle:{width:1,color:'#757575',color0:'#c7c7c7'}}}},map:{itemStyle:{normal:{areaStyle:{color:'#ddd'},label:{textStyle:{color:'#c12e34'}}},emphasis:{areaStyle:{color:'#99d2dd'},label:{textStyle:{color:'#c12e34'}}}}},force:{itemStyle:{normal:{linkStyle:{color:'#757575'}}}},chord:{padding:4,itemStyle:{normal:{borderWidth:1,borderColor:'rgba(128,128,128,0.5)',chordStyle:{lineStyle:{color:'rgba(128,128,128,0.5)'}}},emphasis:{borderWidth:1,borderColor:'rgba(128,128,128,0.5)',chordStyle:{lineStyle:{color:'rgba(128,128,128,0.5)'}}}}},gauge:{axisLine:{show:true,lineStyle:{color:[[0.2,'#b5b5b5'],[0.8,'#757575'],[1,'#5c5c5c']],width:8}},axisTick:{splitNumber:10,length:12,lineStyle:{color:'auto'}},axisLabel:{textStyle:{color:'auto'}},splitLine:{length:18,lineStyle:{color:'auto'}},pointer:{length:'90%',color:'auto'},title:{textStyle:{color:'#333'}},detail:{textStyle:{color:'auto'}}},textStyle:{fontFamily:'微软雅黑,Arial,Verdana,sans-serif'}
};

var greenTheme = {color:['#408829','#68a54a','#a9cba2','#86b379','#397b29','#8abb6f','#759c6a','#bfd3b7'],title:{textStyle:{fontWeight:'normal',color:'#408829'}},dataRange:{color:['#1f610a','#97b58d']},toolbox:{color:['#408829','#408829','#408829','#408829']},tooltip:{backgroundColor:'rgba(0,0,0,0.5)',axisPointer:{type:'line',lineStyle:{color:'#408829',type:'dashed'},crossStyle:{color:'#408829'},shadowStyle:{color:'rgba(200,200,200,0.3)'}}},dataZoom:{dataBackgroundColor:'#eee',fillerColor:'rgba(64,136,41,0.2)',handleColor:'#408829'},grid:{borderWidth:0},categoryAxis:{axisLine:{lineStyle:{color:'#408829'}},splitLine:{lineStyle:{color:['#eee']}}},valueAxis:{axisLine:{lineStyle:{color:'#408829'}},splitArea:{show:true,areaStyle:{color:['rgba(250,250,250,0.1)','rgba(200,200,200,0.1)']}},splitLine:{lineStyle:{color:['#eee']}}},timeline:{lineStyle:{color:'#408829'},controlStyle:{normal:{color:'#408829'},emphasis:{color:'#408829'}}},k:{itemStyle:{normal:{color:'#68a54a',color0:'#a9cba2',lineStyle:{width:1,color:'#408829',color0:'#86b379'}}}},map:{itemStyle:{normal:{areaStyle:{color:'#ddd'},label:{textStyle:{color:'#c12e34'}}},emphasis:{areaStyle:{color:'#99d2dd'},label:{textStyle:{color:'#c12e34'}}}}},force:{itemStyle:{normal:{linkStyle:{color:'#408829'}}}},chord:{padding:4,itemStyle:{normal:{borderWidth:1,borderColor:'rgba(128,128,128,0.5)',chordStyle:{lineStyle:{color:'rgba(128,128,128,0.5)'}}},emphasis:{borderWidth:1,borderColor:'rgba(128,128,128,0.5)',chordStyle:{lineStyle:{color:'rgba(128,128,128,0.5)'}}}}},gauge:{axisLine:{show:true,lineStyle:{color:[[0.2,'#86b379'],[0.8,'#68a54a'],[1,'#408829']],width:8}},axisTick:{splitNumber:10,length:12,lineStyle:{color:'auto'}},axisLabel:{textStyle:{color:'auto'}},splitLine:{length:18,lineStyle:{color:'auto'}},pointer:{length:'90%',color:'auto'},title:{textStyle:{color:'#333'}},detail:{textStyle:{color:'auto'}}},textStyle:{fontFamily:'微软雅黑,Arial,Verdana,sans-serif'}
};

var helianthusTheme = {backgroundColor:'#F2F2E6',color:['#44B7D3','#E42B6D','#F4E24E','#FE9616','#8AED35','#ff69b4','#ba55d3','#cd5c5c','#ffa500','#40e0d0','#E95569','#ff6347','#7b68ee','#00fa9a','#ffd700','#6699FF','#ff6666','#3cb371','#b8860b','#30e0e0'],title:{backgroundColor:'#F2F2E6',itemGap:10,textStyle:{color:'#8A826D'},subtextStyle:{color:'#E877A3'}},dataRange:{x:'right',y:'center',itemWidth:5,itemHeight:25,color:['#E42B6D','#F9AD96'],text:['高','低'],textStyle:{color:'#8A826D'}},toolbox:{color:['#E95569','#E95569','#E95569','#E95569'],effectiveColor:'#ff4500',itemGap:8},tooltip:{backgroundColor:'rgba(138,130,109,0.7)',axisPointer:{type:'line',lineStyle:{color:'#6B6455',type:'dashed'},crossStyle:{color:'#A6A299'},shadowStyle:{color:'rgba(200,200,200,0.3)'}}},dataZoom:{dataBackgroundColor:'rgba(130,197,209,0.6)',fillerColor:'rgba(233,84,105,0.1)',handleColor:'rgba(107,99,84,0.8)'},grid:{borderWidth:0},categoryAxis:{axisLine:{lineStyle:{color:'#6B6455'}},splitLine:{show:false}},valueAxis:{axisLine:{show:false},splitArea:{show:false},splitLine:{lineStyle:{color:['#FFF'],type:'dashed'}}},polar:{axisLine:{lineStyle:{color:'#ddd'}},splitArea:{show:true,areaStyle:{color:['rgba(250,250,250,0.2)','rgba(200,200,200,0.2)']}},splitLine:{lineStyle:{color:'#ddd'}}},timeline:{lineStyle:{color:'#6B6455'},controlStyle:{normal:{color:'#6B6455'},emphasis:{color:'#6B6455'}},symbol:'emptyCircle',symbolSize:3},bar:{itemStyle:{normal:{barBorderRadius:0},emphasis:{barBorderRadius:0}}},line:{smooth:true,symbol:'emptyCircle',symbolSize:3},k:{itemStyle:{normal:{color:'#E42B6D',color0:'#44B7D3',lineStyle:{width:1,color:'#E42B6D',color0:'#44B7D3'}}}},scatter:{itemStyle:{normal:{borderWidth:1,borderColor:'rgba(200,200,200,0.5)'},emphasis:{borderWidth:0}},symbol:'circle',symbolSize:4},radar:{symbol:'emptyCircle',symbolSize:3},map:{itemStyle:{normal:{areaStyle:{color:'#ddd'},label:{textStyle:{color:'#E42B6D'}}},emphasis:{areaStyle:{color:'#fe994e'},label:{textStyle:{color:'rgb(100,0,0)'}}}}},force:{itemStyle:{normal:{nodeStyle:{borderColor:'rgba(0,0,0,0)'},linkStyle:{color:'#6B6455'}}}},chord:{itemStyle:{normal:{chordStyle:{lineStyle:{width:0,color:'rgba(128,128,128,0.5)'}}},emphasis:{chordStyle:{lineStyle:{width:1,color:'rgba(128,128,128,0.5)'}}}}},gauge:{center:['50%','80%'],radius:'100%',startAngle:180,endAngle:0,axisLine:{show:true,lineStyle:{color:[[0.2,'#44B7D3'],[0.8,'#6B6455'],[1,'#E42B6D']],width:'40%'}},axisTick:{splitNumber:2,length:5,lineStyle:{color:'#fff'}},axisLabel:{textStyle:{color:'#fff',fontWeight:'bolder'}},splitLine:{length:'5%',lineStyle:{color:'#fff'}},pointer:{width:'40%',length:'80%',color:'#fff'},title:{offsetCenter:[0,-20],textStyle:{color:'auto',fontSize:20}},detail:{offsetCenter:[0,0],textStyle:{color:'auto',fontSize:40}}},textStyle:{fontFamily:'微软雅黑,Arial,Verdana,sans-serif'}
};

var macarons2Theme = {color:['#ed9678','#e7dac9','#cb8e85','#f3f39d','#c8e49c','#f16d7a','#f3d999','#d3758f','#dcc392','#2e4783','#82b6e9','#ff6347','#a092f1','#0a915d','#eaf889','#6699FF','#ff6666','#3cb371','#d5b158','#38b6b6'],dataRange:{color:['#cb8e85','#e7dac9'],textStyle:{color:'#333'}},bar:{barMinHeight:0,barGap:'30%',barCategoryGap:'20%',itemStyle:{normal:{barBorderColor:'#fff',barBorderRadius:0,barBorderWidth:1,label:{show:false}},emphasis:{barBorderColor:'rgba(0,0,0,0)',barBorderRadius:0,barBorderWidth:1,label:{show:false}}}},line:{itemStyle:{normal:{label:{show:false},lineStyle:{width:2,type:'solid',shadowColor:'rgba(0,0,0,0)',shadowBlur:5,shadowOffsetX:3,shadowOffsetY:3}},emphasis:{label:{show:false}}},symbolSize:2,showAllSymbol:false},k:{itemStyle:{normal:{color:'#fe9778',color0:'#e7dac9',lineStyle:{width:1,color:'#f78766',color0:'#f1ccb8'}},emphasis:{}}},pie:{center:['50%','50%'],radius:[0,'75%'],clockWise:false,startAngle:90,minAngle:0,selectedOffset:10,itemStyle:{normal:{borderColor:'#fff',borderWidth:1,label:{show:true,position:'outer',textStyle:{color:'#1b1b1b'},lineStyle:{color:'#1b1b1b'}},labelLine:{show:true,length:20,lineStyle:{width:1,type:'solid'}}}}},map:{mapType:'china',mapLocation:{x:'center',y:'center'},showLegendSymbol:true,itemStyle:{normal:{borderColor:'#fff',borderWidth:1,areaStyle:{color:'#ccc'},label:{show:false,textStyle:{color:'rgba(139,69,19,1)'}}},emphasis:{borderColor:'rgba(0,0,0,0)',borderWidth:1,areaStyle:{color:'#f3f39d'},label:{show:false,textStyle:{color:'rgba(139,69,19,1)'}}}}},force:{itemStyle:{normal:{label:{show:false},nodeStyle:{brushType:'both',strokeColor:'#a17e6e'},linkStyle:{strokeColor:'#a17e6e'}},emphasis:{label:{show:false},nodeStyle:{},linkStyle:{}}}},gauge:{axisLine:{show:true,lineStyle:{color:[[0.2,'#ed9678'],[0.8,'#e7dac9'],[1,'#cb8e85']],width:8}},axisTick:{splitNumber:10,length:12,lineStyle:{color:'auto'}},axisLabel:{textStyle:{color:'auto'}},splitLine:{length:18,lineStyle:{color:'auto'}},pointer:{length:'90%',color:'auto'},title:{textStyle:{color:'#333'}},detail:{textStyle:{color:'auto'}}}
};

var redTheme = {color:['#d8361b','#f16b4c','#f7b4a9','#d26666','#99311c','#c42703','#d07e75'],title:{textStyle:{fontWeight:'normal',color:'#d8361b'}},dataRange:{color:['#bd0707','#ffd2d2']},toolbox:{color:['#d8361b','#d8361b','#d8361b','#d8361b']},tooltip:{backgroundColor:'rgba(0,0,0,0.5)',axisPointer:{type:'line',lineStyle:{color:'#d8361b',type:'dashed'},crossStyle:{color:'#d8361b'},shadowStyle:{color:'rgba(200,200,200,0.3)'}}},dataZoom:{dataBackgroundColor:'#eee',fillerColor:'rgba(216,54,27,0.2)',handleColor:'#d8361b'},grid:{borderWidth:0},categoryAxis:{axisLine:{lineStyle:{color:'#d8361b'}},splitLine:{lineStyle:{color:['#eee']}}},valueAxis:{axisLine:{lineStyle:{color:'#d8361b'}},splitArea:{show:true,areaStyle:{color:['rgba(250,250,250,0.1)','rgba(200,200,200,0.1)']}},splitLine:{lineStyle:{color:['#eee']}}},timeline:{lineStyle:{color:'#d8361b'},controlStyle:{normal:{color:'#d8361b'},emphasis:{color:'#d8361b'}}},k:{itemStyle:{normal:{color:'#f16b4c',color0:'#f7b4a9',lineStyle:{width:1,color:'#d8361b',color0:'#d26666'}}}},map:{itemStyle:{normal:{areaStyle:{color:'#ddd'},label:{textStyle:{color:'#c12e34'}}},emphasis:{areaStyle:{color:'#99d2dd'},label:{textStyle:{color:'#c12e34'}}}}},force:{itemStyle:{normal:{linkStyle:{color:'#d8361b'}}}},chord:{padding:4,itemStyle:{normal:{borderWidth:1,borderColor:'rgba(128,128,128,0.5)',chordStyle:{lineStyle:{color:'rgba(128,128,128,0.5)'}}},emphasis:{borderWidth:1,borderColor:'rgba(128,128,128,0.5)',chordStyle:{lineStyle:{color:'rgba(128,128,128,0.5)'}}}}},gauge:{axisLine:{show:true,lineStyle:{color:[[0.2,'#f16b4c'],[0.8,'#d8361b'],[1,'#99311c']],width:8}},axisTick:{splitNumber:10,length:12,lineStyle:{color:'auto'}},axisLabel:{textStyle:{color:'auto'}},splitLine:{length:18,lineStyle:{color:'auto'}},pointer:{length:'90%',color:'auto'},title:{textStyle:{color:'#333'}},detail:{textStyle:{color:'auto'}}},textStyle:{fontFamily:'微软雅黑,Arial,Verdana,sans-serif'}
};

var romaTheme = {color:['#E01F54','#b8d2c7','#f5e8c8','#001852','#c6b38e','#a4d8c2','#f3d999','#d3758f','#dcc392','#2e4783','#82b6e9','#ff6347','#a092f1','#0a915d','#eaf889','#6699FF','#ff6666','#3cb371','#d5b158','#38b6b6'],dataRange:{color:['#e01f54','#e7dbc3'],textStyle:{color:'#333'}},k:{itemStyle:{normal:{color:'#e01f54',color0:'#001852',lineStyle:{width:1,color:'#f5e8c8',color0:'#b8d2c7'}}}},pie:{itemStyle:{normal:{borderColor:'#fff',borderWidth:1,label:{show:true,position:'outer',textStyle:{color:'#1b1b1b'},lineStyle:{color:'#1b1b1b'}},labelLine:{show:true,length:20,lineStyle:{width:1,type:'solid'}}},emphasis:{borderColor:'rgba(0,0,0,0)',borderWidth:1,label:{show:false},labelLine:{show:false,length:20,lineStyle:{width:1,type:'solid'}}}}},map:{itemStyle:{normal:{borderColor:'#fff',borderWidth:1,areaStyle:{color:'#ccc'},label:{show:false,textStyle:{color:'rgba(139,69,19,1)'}}},emphasis:{borderColor:'rgba(0,0,0,0)',borderWidth:1,areaStyle:{color:'#f3d999'},label:{show:false,textStyle:{color:'rgba(139,69,19,1)'}}}}},force:{itemStyle:{normal:{label:{show:false},nodeStyle:{brushType:'both',strokeColor:'#5182ab'},linkStyle:{strokeColor:'#5182ab'}},emphasis:{label:{show:false},nodeStyle:{},linkStyle:{}}}},gauge:{axisLine:{show:true,lineStyle:{color:[[0.2,'#E01F54'],[0.8,'#b8d2c7'],[1,'#001852']],width:8}},axisTick:{splitNumber:10,length:12,lineStyle:{color:'auto'}},axisLabel:{textStyle:{color:'auto'}},splitLine:{length:18,lineStyle:{color:'auto'}},pointer:{length:'90%',color:'auto'},title:{textStyle:{color:'#333'}},detail:{textStyle:{color:'auto'}}}
};

var sakuraTheme = {color:['#e52c3c','#f7b1ab','#fa506c','#f59288','#f8c4d8','#e54f5c','#f06d5c','#e54f80','#f29c9f','#eeb5b7'],dataRange:{color:['#e52c3c','#f7b1ab']},k:{itemStyle:{normal:{color:'#e52c3c',color0:'#f59288',lineStyle:{width:1,color:'#e52c3c',color0:'#f59288'}},emphasis:{}}},pie:{itemStyle:{normal:{borderColor:'#fff',borderWidth:1,label:{show:true,position:'outer',textStyle:{color:'black'}},labelLine:{show:true,length:20,lineStyle:{width:1,type:'solid'}}}}},map:{mapType:'china',mapLocation:{x:'center',y:'center'},showLegendSymbol:true,itemStyle:{normal:{borderColor:'#fff',borderWidth:1,areaStyle:{color:'#ccc'},label:{show:false,textStyle:{color:'rgba(139,69,19,1)'}}},emphasis:{borderColor:'rgba(0,0,0,0)',borderWidth:1,areaStyle:{color:'#f3f39d'},label:{show:false,textStyle:{color:'rgba(139,69,19,1)'}}}}},force:{itemStyle:{normal:{label:{show:false},nodeStyle:{brushType:'both',strokeColor:'#e54f5c'},linkStyle:{strokeColor:'#e54f5c'}},emphasis:{label:{show:false},nodeStyle:{},linkStyle:{}}}},gauge:{axisLine:{show:true,lineStyle:{color:[[0.2,'#e52c3c'],[0.8,'#f7b1ab'],[1,'#fa506c']],width:8}},axisTick:{splitNumber:10,length:12,lineStyle:{color:'auto'}},axisLabel:{textStyle:{color:'auto'}},splitLine:{length:18,lineStyle:{color:'auto'}},pointer:{length:'90%',color:'auto'},title:{textStyle:{color:'#333'}},detail:{textStyle:{color:'auto'}}}
};

var shineTheme = {color:['#c12e34','#e6b600','#0098d9','#2b821d','#005eaa','#339ca8','#cda819','#32a487'],title:{textStyle:{fontWeight:'normal'}},dataRange:{itemWidth:15,color:['#1790cf','#a2d4e6']},toolbox:{color:['#06467c','#00613c','#872d2f','#c47630']},tooltip:{backgroundColor:'rgba(0,0,0,0.6)'},dataZoom:{dataBackgroundColor:'#dedede',fillerColor:'rgba(154,217,247,0.2)',handleColor:'#005eaa'},grid:{borderWidth:0},categoryAxis:{axisLine:{show:false},axisTick:{show:false}},valueAxis:{axisLine:{show:false},axisTick:{show:false},splitArea:{show:true,areaStyle:{color:['rgba(250,250,250,0.2)','rgba(200,200,200,0.2)']}}},timeline:{lineStyle:{color:'#005eaa'},controlStyle:{normal:{color:'#005eaa'},emphasis:{color:'#005eaa'}}},k:{itemStyle:{normal:{color:'#c12e34',color0:'#2b821d',lineStyle:{width:1,color:'#c12e34',color0:'#2b821d'}}}},map:{itemStyle:{normal:{areaStyle:{color:'#ddd'},label:{textStyle:{color:'#c12e34'}}},emphasis:{areaStyle:{color:'#e6b600'},label:{textStyle:{color:'#c12e34'}}}}},force:{itemStyle:{normal:{linkStyle:{color:'#005eaa'}}}},chord:{itemStyle:{normal:{borderWidth:1,borderColor:'rgba(128,128,128,0.5)',chordStyle:{lineStyle:{color:'rgba(128,128,128,0.5)'}}},emphasis:{borderWidth:1,borderColor:'rgba(128,128,128,0.5)',chordStyle:{lineStyle:{color:'rgba(128,128,128,0.5)'}}}}},gauge:{axisLine:{show:true,lineStyle:{color:[[0.2,'#2b821d'],[0.8,'#005eaa'],[1,'#c12e34']],width:5}},axisTick:{splitNumber:10,length:8,lineStyle:{color:'auto'}},axisLabel:{textStyle:{color:'auto'}},splitLine:{length:12,lineStyle:{color:'auto'}},pointer:{length:'90%',width:3,color:'auto'},title:{textStyle:{color:'#333'}},detail:{textStyle:{color:'auto'}}},textStyle:{fontFamily:'微软雅黑,Arial,Verdana,sans-serif'}
};

var vintageTheme = {color:['#d87c7c','#919e8b', '#d7ab82',  '#6e7074','#61a0a8','#efa18d', '#787464', '#cc7e63', '#724e58', '#4b565b'],backgroundColor: '#fef8ef'
};
