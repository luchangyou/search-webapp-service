<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/21
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    <title>游戏图谱</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/tupu_css/tupu.css">
    <link rel="stylesheet" type="text/css" href="/search-webapp-service/resources/tupu_css/atlas.css">


    <script src="/search-webapp-service/resources/tupu_css/hm.js"></script>
    <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="atlas" src="/search-webapp-service/resources/tupu_css/atlas.js"></script>
    <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="frontmain" src="/search-webapp-service/resources/tupu_css/frontmain.js"></script>
    <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="jquery" src="/search-webapp-service/resources/tupu_css/jquery-1.js"></script>
    <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="base" src="/search-webapp-service/resources/tupu_css/base.js"></script>
    <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="particles" src="/search-webapp-service/resources/tupu_css/particles.js"></script>
    <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="app/outside" src="/search-webapp-service/resources/tupu_css/outside.js"></script>
    <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="layer" src="/search-webapp-service/resources/tupu_css/layer.js"></script>
    <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="store.min" src="/search-webapp-service/resources/tupu_css/store.js"></script>
    <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="jquery.panzoom" src="/search-webapp-service/resources/tupu_css/jquery.js"></script>
    <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="front" src="/search-webapp-service/resources/tupu_css/front.js"></script>
    <script type="text/javascript" src="/search-webapp-service/resources/js/template.js" charset="utf8"></script>
    <script type="text/javascript" src="/search-webapp-service/resources/js/tupu.js" charset="utf8"></script>

    <script type="text/template" id="template">
        {{each list}}
        <div class="arc child child3 child-3-{{$index}}" id="zuzhiGudong{{$index}}">
            <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
            <b class="img-title">{{$value.oname}}</b>
            <!--组织31-->
            <div class="line" id="zuzhi_gudong{{$index}}"></div>
        </div>
        {{/each}}
   </script>

    <script>
        function MM_over(mmObj) {
            var mSubObj = mmObj.getElementsByTagName("div")[0];
            mSubObj.style.display = "block";
            mSubObj.style.backgroundColor = "#f60";
        }
        function MM_over1(mmObj) {
            var mSubObj = mmObj.getElementsByTagName("div")[4];
            mSubObj.style.display = "block";
            mSubObj.style.backgroundColor = "#f60";
        }
        function MM_over2(mmObj) {
            var mSubObj = mmObj.getElementsByTagName("div")[0];
            mSubObj.style.display = "block";
            mSubObj.style.backgroundColor = "#f60";
        }
        function MM_out(mmObj) {
            var mSubObj = mmObj.getElementsByTagName("div")[0];
            mSubObj.style.display = "none";

        }
    </script>
    <script language='javascript' type='text/javascript'>
        var offset_x;
        var offset_y;
        function Milan_StartMove(oEvent)
        {
            var whichButton;
            if(document.all&&oEvent.button==1) whichButton=true;
            else { if(oEvent.button==0)whichButton=true;}
            if(whichButton)
            {
                var oDiv=document.getElementById("Wrap");
                offset_x=parseInt(oEvent.clientX-oDiv.offsetLeft);
                offset_y=parseInt(oEvent.clientY-oDiv.offsetTop);
                document.documentElement.onmousemove=function(mEvent)
                {
                    var eEvent;
                    if(document.all) eEvent=event;
                    else{eEvent=mEvent;}
                    var oDiv=document.getElementById("Wrap");
                    var x=eEvent.clientX-offset_x;
                    var y=eEvent.clientY-offset_y;
                    oDiv.style.left=(x)+"px";
                    oDiv.style.top=(y)+"px";
                }
            }
        }
        function Milan_StopMove(oEvent){document.documentElement.onmousemove=null; }
    </script>

    <script>

    </script>

</head>
<body onload="window.scrollTo(3000,3100)"  >
<input type="hidden" id="pg" value="1"/>
<div id="Wrap" onmousedown="Milan_StartMove(event)" onmouseup="Milan_StopMove(event)" style="overflow: hidden;">
    <div id="canvas" style="transform: matrix(1, 0, 0, 1, -23, 85); backface-visibility: hidden; transform-origin: 50% 50% 0px; cursor: move; transition: none 0s ease 0s ;">
        <div id="center" class="arc" style="top: 3000px; left: 3000px; height: 120px; width: 120px;">
            <b class="img-title">${orgName}</b><img src="${logo}">
            <div class="pop" data-i="134">
                <ul class="inner-circle">
                    <li><a onclick="F_Atlas_Info._changeGame(134);">查看图谱</a></li>
                    <li><a onclick="F_Atlas_Info._goLight(134);">灯塔透视</a></li>
                </ul>
                <ul class="style-list" id="tag134">
                    <li id="gmCollect134" class="circle-tag c_img collect collectOff"
                        onclick="B_Game._setCollect(134,'gmCollect134','collect')" style="position: absolute; left: 85px; top: 168px;"></li>
                    <li class="circle-tag" style="position: absolute; left: 168px; top: 85px;">
                        <a onclick="F_Atlas_Info._search('竞技游戏')">竞技游戏</a></li>
                    <li class="circle-tag" style="position: absolute; left: 85px; top: 2px;">
                        <a onclick="F_Atlas_Info._search('MOBA')">MOBA</a></li>
                    <li class="circle-tag" style="position: absolute; left: 2px; top: 85px;">
                        <a onclick="F_Atlas_Info._search('奇幻')">奇幻</a></li>
                </ul>
            </div>
        </div>
        <!--线-->
        <!--人-->
        <div class="line" style="width: 1350px; height: 4px; transform: rotate(3.4rad); top: 3250px; left: 3050px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
        <!--事件-->
        <div class="line" style="width: 1350px; height: 4px; transform: rotate(4.85rad); top: 3700px; left: 2300px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
        <!--产品-->
        <div class="line" style="width: 1350px; height: 4px; transform: rotate(5.5rad); top: 2550px; left: 2900px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
        <!--知识-->
        <div class="line" style="width: 1350px; height: 4px; transform: rotate(3.15rad); top: 3050px; left: 1650px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
        <!--组织-->
        <div class="line" style="width: 1350px; height: 4px; transform: rotate(4.3rad); top: 2500px; left: 2150px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
        <!--线-->
        <!--组织-->
        <div  class="arc child child1 child-1-0" style="top: 1800px; left: 2500px; height: 80px; width: 80px;">

            <div  onmouseover="MM_over(this)" style="display:block;">
                <span class="game-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">组织</b>


                <div id="add" style="display:none;">
                    <div  onmouseover="MM_over1(this)" style="display:block;">
                        <div class="arc child child2 child-2-0" style="top: 360px; left: -300px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:block;">
                            <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                            <b class="img-title">对外投资</b>
                            <!--组织1-->
                            <div class="line" style="width: 450px; height: 4px; transform: rotate(2.25rad); top: -150px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                            <div id="zuzhi1" style="display:none;">
                                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织31</b>
                                    <!--组织31-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织32</b>
                                    <!--组织32-->
                                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-2" style="top: -160px; left: 200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织33</b>
                                    <!--组织33-->
                                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.4rad); top: 110px; left: -180px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>

                                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织34</b>
                                    <!--组织34-->
                                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>


                                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织35</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织36</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织37</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织38</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织39</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织30</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>

                            </div>
                        </div>

                    </div>
                    <div  onmouseover="MM_over1(this),onmouseoverSearchGudong('${uuid }')" onclick="searchNextPageGudong('${uuid }')" style="display:block;">
                        <div class="arc child child2 child-2-1" style="top: 0px; left: -950px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:block;">
                            <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                            <div  onmouseover="MM_over2(this)" style="display:block;">
                                <b class="img-title">股东</b>

                                <div class="pop" data-c="2" data-o="1" data-t="0" data-i="1192" style="display:none;">
                                    <ul class="inner-circle">
                                        <li><a onclick="F_Atlas_Info._changeGame(1192);">查看图谱</a></li>
                                        <li><a onclick="F_Atlas_Info._goLight(1192);">灯塔透视</a></li>
                                    </ul>
                                    <ul class="style-list" id="tag1192">
                                        <li id="gmCollect1192" class="circle-tag c_img collect collectOff" onclick="B_Game._setCollect(1192,'gmCollect1192','collect')" style="position: absolute; left: 85px; top: 165px;"></li>
                                        <li class="circle-tag" style="position: absolute; left: 161.085px; top: 109.721px;">
                                            <a onclick="F_Atlas_Info._search('角色扮演')">角色扮演</a></li>
                                        <li class="circle-tag" style="position: absolute; left: 132.023px; top: 20.2786px;"><a onclick="F_Atlas_Info._search('ARPG')">ARPG</a></li>
                                        <li class="circle-tag" style="position: absolute; left: 37.9772px; top: 20.2786px;"><a onclick="F_Atlas_Info._search('MMORPG')">MMORPG</a></li>
                                        <li class="circle-tag" style="position: absolute; left: 8.91548px; top: 109.721px;"><a onclick="F_Atlas_Info._search('西游')">西游</a></li>
                                    </ul>
                                </div>
                            </div>
                            <!--组织1-->
                            <div class="line" style="width: 900px; height: 4px; transform: rotate(3.15rad); top: 30px; left: 50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                            <div id="zuzhi2" style="display:none;">


                            </div>
                        </div>
                    </div>
                    <div  onmouseover="MM_over1(this)" style="display:block;">
                        <div class="arc child child2 child-2-2" style="top: -600px; left: -1400px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:block;">
                            <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                            <b class="img-title">监管机构</b>
                            <!--组织1-->
                            <div class="line" style="width: 1550px; height: 4px; transform: rotate(3.55rad); top: 330px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                            <div id="zuzhi3" style="display:none;">
                                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织31</b>
                                    <!--组织31-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织32</b>
                                    <!--组织32-->
                                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织33</b>
                                    <!--组织33-->
                                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>

                                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织34</b>
                                    <!--组织34-->
                                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>


                                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织35</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 100px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织36</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.7rad); top: -40px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织37</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织38</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织39</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织30</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div  onmouseover="MM_over1(this)" style="display:block;">
                        <div class="arc child child2 child-2-3" style="top: -800px; left: -900px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:block;">
                            <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                            <b class="img-title">董监高</b>
                            <!--组织1-->
                            <div class="line" style="width: 1200px; height: 4px; transform: rotate(3.87rad); top: 450px; left: -100px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                            <div id="zuzhi3" style="display:none;">
                                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织31</b>
                                    <!--组织31-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织32</b>
                                    <!--组织32-->
                                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织33</b>
                                    <!--组织33-->
                                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>

                                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织34</b>
                                    <!--组织34-->
                                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>


                                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织35</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织36</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织37</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织38</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织39</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织30</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div  onmouseover="MM_over1(this)" style="display:block;">
                        <div class="arc child child2 child-2-4" style="top: -1300px; left: -440px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: block;">
                            <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                            <b class="img-title">分支机构</b>
                            <!--组织2-->
                            <div class="line" style="width: 1350px; height: 4px; transform: rotate(4.4rad); top: 700px; left: -400px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                            <div id="zuzhi1" style="display:none;">
                                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织31</b>
                                    <!--组织31-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织32</b>
                                    <!--组织32-->
                                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织33</b>
                                    <!--组织33-->
                                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>

                                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织34</b>
                                    <!--组织34-->
                                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>


                                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织35</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 50px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织36</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 150px; height: 4px; transform: rotate(3.55rad); top: 0px; left: -120px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 160px; left: 160px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织37</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(3.95rad); top: -50px; left: -130px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织38</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织39</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织30</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                            </div>

                        </div>
                    </div>
                    <div  onmouseover="MM_over1(this)" style="display:block;">
                        <div class="arc child child2 child-2-5" style="top: -1000px; left: 50px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: block;">
                            <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                            <b class="img-title">客户</b>
                            <!--组织3-->
                            <div class="line" style="width: 1000px; height: 4px; transform: rotate(1.6rad); top: 500px; left: -485px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                            <div id="zuzhi1" style="display:none;">
                                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织31</b>
                                    <!--组织31-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织32</b>
                                    <!--组织32-->
                                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织33</b>
                                    <!--组织33-->
                                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>

                                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织34</b>
                                    <!--组织34-->
                                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>


                                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织35</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织36</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织37</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织38</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 100px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织39</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 170px; height: 4px; transform: rotate(5.7rad); top: -10px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 0px; left: -200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织30</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.3rad); top: 20px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div  onmouseover="MM_over1(this)" style="display:block;">
                        <div class="arc child child2 child-2-6" style="top: -1100px; left: 600px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: block;">
                            <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                            <b class="img-title">合作伙伴</b>
                            <!--组织3-->
                            <div class="line" style="width: 1300px; height: 4px; transform: rotate(2.08rad); top: 600px; left: -900px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                            <div id="zuzhi1" style="display:none;">
                                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织31</b>
                                    <!--组织31-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织32</b>
                                    <!--组织32-->
                                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织33</b>
                                    <!--组织33-->
                                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>

                                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织34</b>
                                    <!--组织34-->
                                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>


                                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织35</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织36</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织37</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织38</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 100px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织39</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 170px; height: 4px; transform: rotate(5.7rad); top: -10px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 0px; left: -200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织30</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.3rad); top: 20px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div  onmouseover="MM_over1(this)" style="display:block;">
                        <div class="arc child child2 child-2-7" style="top: -600px; left: 700px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: block;">
                            <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                            <b class="img-title">竞争对手</b>
                            <!--组织3-->
                            <div class="line" style="width: 950px; height: 4px; transform: rotate(2.42rad); top: 350px; left: -800px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                            <div id="zuzhi1" style="display:none;">
                                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织31</b>
                                    <!--组织31-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织32</b>
                                    <!--组织32-->
                                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织33</b>
                                    <!--组织33-->
                                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>

                                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织34</b>
                                    <!--组织34-->
                                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>


                                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织35</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织36</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织37</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织38</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织39</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织30</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div  onmouseover="MM_over1(this)" style="display:block;">
                        <div class="arc child child2 child-2-8" style="top: -150px; left: 600px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: block;">
                            <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                            <b class="img-title">供应商</b>
                            <!--组织3-->
                            <div class="line" style="width: 600px; height: 4px; transform: rotate(2.9rad); top: 115px; left: -550px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                            <div id="zuzhi1" style="display:none;">
                                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织31</b>
                                    <!--组织31-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织32</b>
                                    <!--组织32-->
                                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织33</b>
                                    <!--组织33-->
                                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>

                                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织34</b>
                                    <!--组织34-->
                                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>


                                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织35</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织36</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织37</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织38</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 160px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织39</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 220px; height: 4px; transform: rotate(5.6rad); top: -30px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 30px; left: -200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织30</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.15rad); top: 10px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div  onmouseover="MM_over1(this)" style="display:block;">
                        <div class="arc child child2 child-2-9" style="top: 265px; left: 500px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: block;">
                            <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                            <b class="img-title">关联</b>
                            <!--组织3-->
                            <div class="line" style="width: 580px; height: 4px; transform: rotate(3.65rad); top: -100px; left: -500px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                            <div id="zuzhi1" style="display:none;">
                                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织31</b>
                                    <!--组织31-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织32</b>
                                    <!--组织32-->
                                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织33</b>
                                    <!--组织33-->
                                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>

                                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织34</b>
                                    <!--组织34-->
                                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>


                                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织35</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织36</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织37</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织38</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织39</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                                </div>
                                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: block;">
                                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                                    <b class="img-title">组织30</b>
                                    <!--组织35-->
                                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div></div>
        </div>

        <div class="arc child child1 child-1-1" style="top: 2000px; left: 4000px; height: 80px; width: 80px;">
            <span class="game-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
            <b class="img-title">产品</b>

            <div class="arc child child2 child-2-0" style="top: 400px; left: 50px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东123</b>
                <!--组织1-->
                <div class="line" style="width: 380px; height: 4px; transform: rotate(1.5rad); top: -150px; left: -170px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -160px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.4rad); top: 110px; left: -180px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-1" style="top: 150px; left: -550px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东1</b>
                <!--组织1-->
                <div class="line" style="width: 600px; height: 4px; transform: rotate(2.9rad); top: -50px; left: 50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: 20px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(3.15rad); top: 15px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-2" style="top: -300px; left: -500px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东2</b>
                <!--组织1-->
                <div class="line" style="width: 650px; height: 4px; transform: rotate(3.7rad); top: 190px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 70px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.5rad); top: -10px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-3" style="top: -800px; left: -500px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东112</b>
                <!--组织1-->
                <div class="line" style="width: 950px; height: 4px; transform: rotate(4.15rad); top: 450px; left: -180px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -120px; left: -120px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 190px; height: 4px; transform: rotate(3.9rad); top: 100px; left: 5px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(3.65rad); top: -10px; left: -130px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 80px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: -100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(5.45rad); top: -40px; left: -10px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 20px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.2rad); top: 15px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-4" style="top: -1300px; left: -440px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">投资机构</b>
                <!--组织2-->
                <div class="line" style="width: 1350px; height: 4px; transform: rotate(4.4rad); top: 700px; left: -400px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 150px; height: 4px; transform: rotate(3.55rad); top: 0px; left: -120px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 160px; left: 160px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(3.95rad); top: -50px; left: -130px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


            </div>

            <div class="arc child child2 child-2-5" style="top: -1000px; left: 50px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构</b>
                <!--组织3-->
                <div class="line" style="width: 1000px; height: 4px; transform: rotate(1.6rad); top: 500px; left: -485px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 100px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 170px; height: 4px; transform: rotate(5.7rad); top: -10px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 0px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.3rad); top: 20px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-6" style="top: -1100px; left: 600px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构1</b>
                <!--组织3-->
                <div class="line" style="width: 1300px; height: 4px; transform: rotate(2.08rad); top: 600px; left: -900px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 100px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 170px; height: 4px; transform: rotate(5.7rad); top: -10px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 0px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.3rad); top: 20px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-7" style="top: -600px; left: 700px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构22</b>
                <!--组织3-->
                <div class="line" style="width: 950px; height: 4px; transform: rotate(2.42rad); top: 350px; left: -800px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-8" style="top: -150px; left: 600px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构23</b>
                <!--组织3-->
                <div class="line" style="width: 600px; height: 4px; transform: rotate(2.9rad); top: 115px; left: -550px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 160px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 220px; height: 4px; transform: rotate(5.6rad); top: -30px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 30px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.15rad); top: 10px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-9" style="top: 265px; left: 500px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构24</b>
                <!--组织3-->
                <div class="line" style="width: 580px; height: 4px; transform: rotate(3.65rad); top: -100px; left: -500px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>


        </div>

        <div class="arc child child1 child-1-2" style="top: 3380px; left: 4350px; height: 80px; width: 80px; display: block;">
            <span class="game-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
            <b class="img-title">人</b>
            <div class="arc child child2 child-2-0" style="top: 450px; left: -300px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东123</b>
                <!--组织1-->
                <div class="line" style="width: 550px; height: 4px; transform: rotate(2.15rad); top: -180px; left: -100px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -160px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.4rad); top: 110px; left: -180px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-1" style="top: 150px; left: -650px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东1</b>
                <!--组织1-->
                <div class="line" style="width: 650px; height: 4px; transform: rotate(2.9rad); top: -40px; left: 50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -70px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.7rad); top: 60px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-2" style="top: -500px; left: -500px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东2</b>
                <!--组织1-->
                <div class="line" style="width: 720px; height: 4px; transform: rotate(3.95rad); top: 300px; left: -65px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 100px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.7rad); top: -40px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-3" style="top: -500px; left: 0px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东111</b>
                <!--组织1-->
                <div class="line" style="width: 510px; height: 4px; transform: rotate(4.7rad); top: 260px; left: -220px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(5.2rad); top: -60px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-4" style="top: -900px; left: 600px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">投资机构</b>
                <!--组织2-->
                <div class="line" style="width: 1100px; height: 4px; transform: rotate(5.3rad); top: 520px; left: -830px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 150px; height: 4px; transform: rotate(3.55rad); top: 0px; left: -120px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 160px; left: 160px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(3.95rad); top: -50px; left: -130px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


            </div>

            <div class="arc child child2 child-2-5" style="top: -500px; left: 700px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构</b>
                <!--组织3-->
                <div class="line" style="width: 900px; height: 4px; transform: rotate(2.5rad); top: 300px; left: -780px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 160px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.2rad); top: -70px; left: -120px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 100px; left: -210px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 220px; height: 4px; transform: rotate(5.9rad); top: -25px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 0px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.3rad); top: 20px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-6" style="top: -500px; left: 1300px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构1</b>
                <!--组织3-->
                <div class="line" style="width: 1350px; height: 4px; transform: rotate(2.755rad); top: 290px; left: -1300px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 100px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 170px; height: 4px; transform: rotate(5.7rad); top: -10px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 0px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.3rad); top: 20px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-7" style="top: -80px; left: 900px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构22</b>
                <!--组织3-->
                <div class="line" style="width: 900px; height: 4px; transform: rotate(3.03rad); top: 80px; left: -880px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 70px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.0rad); top: -5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-8" style="top: 650px; left: 400px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构23</b>
                <!--组织3-->
                <div class="line" style="width: 800px; height: 4px; transform: rotate(4.15rad); top: -260px; left: -550px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 160px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 220px; height: 4px; transform: rotate(5.6rad); top: -30px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 30px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.15rad); top: 10px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-9" style="top: 465px; left: 1400px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构24</b>
                <!--组织3-->
                <div class="line" style="width: 1500px; height: 4px; transform: rotate(3.46rad); top: -190px; left: -1400px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>


        </div>
        <div class="arc child child1 child-1-3" style="top: 4300px; left: 2850px; height: 80px; width: 80px; display: block;">
            <span class="game-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
            <b class="img-title">知识</b>
            <div class="pop" data-i="134">
                <ul class="inner-circle">
                    <li><a onclick="F_Atlas_Info._changeGame(134);">查看图谱</a></li>
                    <li><a onclick="F_Atlas_Info._goLight(134);">灯塔透视</a></li>
                </ul>
                <ul class="style-list" id="tag134">
                    <li id="gmCollect134" class="circle-tag c_img collect collectOff"
                        onclick="B_Game._setCollect(134,'gmCollect134','collect')" style="position: absolute; left: 85px; top: 168px;"></li>
                    <li class="circle-tag" style="position: absolute; left: 168px; top: 85px;">
                        <a onclick="F_Atlas_Info._search('竞技游戏')">竞技游戏</a></li>
                    <li class="circle-tag" style="position: absolute; left: 85px; top: 2px;">
                        <a onclick="F_Atlas_Info._search('MOBA')">MOBA</a></li>
                    <li class="circle-tag" style="position: absolute; left: 2px; top: 85px;">
                        <a onclick="F_Atlas_Info._search('奇幻')">奇幻</a></li>
                </ul>
            </div>
            <div class="arc child child2 child-2-0" style="top: 500px; left: 300px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东</b>
                <!--组织1-->
                <div class="line" style="width: 620px; height: 4px; transform: rotate(1.06rad); top: -200px; left: -415px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -160px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.4rad); top: 110px; left: -180px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-1" style="top: 1300px; left: 0px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东1</b>
                <!--组织1-->
                <div class="line" style="width: 1300px; height: 4px; transform: rotate(1.59rad); top: -600px; left: -610px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-2" style="top: 900px; left: -400px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东2</b>
                <!--组织1-->
                <div class="line" style="width: 1000px; height: 4px; transform: rotate(2rad); top: -400px; left: -260px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 100px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.7rad); top: -40px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-3" style="top: 600px; left: -900px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东111</b>
                <!--组织1-->
                <div class="line" style="width: 1150px; height: 4px; transform: rotate(2.57rad); top: -260px; left: -100px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-4" style="top: 100px; left: -1200px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">投资机构</b>
                <!--组织2-->
                <div class="line" style="width: 1200px; height: 4px; transform: rotate(3.05rad); top: -15px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 150px; height: 4px; transform: rotate(3.55rad); top: 0px; left: -120px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 160px; left: 160px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(3.95rad); top: -50px; left: -130px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


            </div>

            <div class="arc child child2 child-2-5" style="top: -500px; left: -700px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构</b>
                <!--组织3-->
                <div class="line" style="width: 900px; height: 4px; transform: rotate(0.63rad); top: 285px; left: -70px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 100px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 170px; height: 4px; transform: rotate(5.7rad); top: -10px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 0px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.3rad); top: 20px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-6" style="top: -700px; left: 400px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构1</b>
                <!--组织3-->
                <div class="line" style="width: 800px; height: 4px; transform: rotate(2.08rad); top: 350px; left: -550px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 220px; height: 4px; transform: rotate(4.8rad); top: -80px; left: -80px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 100px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 170px; height: 4px; transform: rotate(5.7rad); top: -10px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 0px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.3rad); top: 20px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-7" style="top: -200px; left: 600px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构22</b>
                <!--组织3-->
                <div class="line" style="width: 680px; height: 4px; transform: rotate(2.85rad); top: 130px; left: -600px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-8" style="top: 100px; left: 1000px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构23</b>
                <!--组织3-->
                <div class="line" style="width: 1000px; height: 4px; transform: rotate(3.25rad); top: -30px; left: -1000px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 160px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 220px; height: 4px; transform: rotate(5.6rad); top: -30px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 30px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.15rad); top: 10px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-9" style="top: 550px; left: 1200px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构24</b>
                <!--组织3-->
                <div class="line" style="width: 1300px; height: 4px; transform: rotate(3.58rad); top: -230px; left: -1200px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>




        </div>

        <div class="arc child child1 child-1-4" style="top: 3000px; left: 1600px; height: 80px; width: 80px; display: block;">
            <span class="game-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/133.png"></span>
            <b class="img-title">事件</b>
            <div class="arc child child2 child-2-0" style="top: 300px; left: 600px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东</b>
                <!--组织1-->
                <div class="line" style="width: 650px; height: 4px; transform: rotate(0.455rad); top: -100px; left: -580px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -160px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.4rad); top: 110px; left: -180px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-1" style="top: 700px; left: 0px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东1</b>
                <!--组织1-->
                <div class="line" style="width: 700px; height: 4px; transform: rotate(1.6rad); top: -330px; left: -310px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-2" style="top: -600px; left: -1350px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东2</b>
                <!--组织1-->
                <div class="line" style="width: 1550px; height: 4px; transform: rotate(3.57rad); top: 340px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 100px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.7rad); top: -40px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-3" style="top: -800px; left: -900px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display:none;">
                <span class="game-pic child2-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">股东111</b>
                <!--组织1-->
                <div class="line" style="width: 1200px; height: 4px; transform: rotate(3.87rad); top: 450px; left: -100px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-4" style="top: -700px; left: -240px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">投资机构</b>
                <!--组织2-->
                <div class="line" style="width: 760px; height: 4px; transform: rotate(4.4rad); top: 400px; left: -220px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 150px; height: 4px; transform: rotate(3.55rad); top: 0px; left: -120px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 160px; left: 160px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(3.95rad); top: -50px; left: -130px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


            </div>

            <div class="arc child child2 child-2-5" style="top: -400px; left: 300px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构</b>
                <!--组织3-->
                <div class="line" style="width: 520px; height: 4px; transform: rotate(2.2rad); top: 220px; left: -350px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(4.9rad); top: -80px; left: -80px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 100px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 170px; height: 4px; transform: rotate(5.7rad); top: -10px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 0px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.3rad); top: 20px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-6" style="top: 500px; left: -1300px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构1</b>
                <!--组织3-->
                <div class="line" style="width: 1400px; height: 4px; transform: rotate(2.78rad); top: -220px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: 0px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(3.1rad); top: 20px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 100px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 170px; height: 4px; transform: rotate(5.7rad); top: -10px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 0px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.3rad); top: 20px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-7" style="top: -100px; left: -1350px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构22</b>
                <!--组织3-->
                <div class="line" style="width: 1400px; height: 4px; transform: rotate(3.22rad); top: 90px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-8" style="top: 1000px; left: -550px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构23</b>
                <!--组织3-->
                <div class="line" style="width: 1150px; height: 4px; transform: rotate(2.09rad); top: -470px; left: -250px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 160px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 220px; height: 4px; transform: rotate(5.6rad); top: -30px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 30px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.15rad); top: 10px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
            <div class="arc child child2 child-2-9" style="top: 900px; left: -1200px; height: 70px; width: 70px; transition: all 0.8s ease-in-out 0s; display: none;">
                <span class="game-pic child2-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                <b class="img-title">分支机构24</b>
                <!--组织3-->
                <div class="line" style="width: 1500px; height: 4px; transform: rotate(5.65rad); top: -400px; left: -125px; transition: all 0.8s ease-in-out 0s; display: block;"></div>
                <div class="arc child child3 child-3-0" style="top: -150px; left: 50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织31</b>
                    <!--组织31-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(4.95rad); top: 120px; left: -90px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-1" style="top: -180px; left: -50px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织32</b>
                    <!--组织32-->
                    <div class="line" style="width: 210px; height: 4px; transform: rotate(4.45rad); top: 140px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-2" style="top: -180px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织33</b>
                    <!--组织33-->
                    <div class="line" style="width: 230px; height: 4px; transform: rotate(2.2rad); top: 120px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>

                <div class="arc child child3 child-3-3" style="top: -140px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织34</b>
                    <!--组织34-->
                    <div class="line" style="width: 240px; height: 4px; transform: rotate(3.9rad); top: 120px; left: 0px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>


                <div class="arc child child3 child-3-4" style="top: -50px; left: 200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织35</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(2.8rad); top: 50px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 80px; left: 150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织36</b>
                    <!--组织35-->
                    <div class="line" style="width: 180px; height: 4px; transform: rotate(3.65rad); top: -30px; left: -160px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: 100px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织37</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(4.3rad); top: -60px; left: -110px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 150px; left: 0px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织38</b>
                    <!--组织35-->
                    <div class="line" style="width: 160px; height: 4px; transform: rotate(4.8rad); top: -60px; left: -50px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 200px; left: -150px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织39</b>
                    <!--组织35-->
                    <div class="line" style="width: 260px; height: 4px; transform: rotate(5.45rad); top: -80px; left: -20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
                <div class="arc child child3 child-3-4" style="top: 50px; left: -200px; height: 46px; width: 46px; display: none;">
                    <span class="game-pic child3-pic child-pic"><img src="/search-webapp-service/resources/tupu_css/149.png"></span>
                    <b class="img-title">组织30</b>
                    <!--组织35-->
                    <div class="line" style="width: 200px; height: 4px; transform: rotate(6.1rad); top: 5px; left: 20px; transition: all 0.8s ease-in-out 0s; display: block;"></div>

                </div>
            </div>
        </div>



    </div>
</div>

<script data-main="elements2.0/js/app/atlas" src="/search-webapp-service/resources/tupu_css/require.js"></script>


</body></html>
