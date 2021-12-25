
function initTab(onTabChange){
	
	 var oDiv = document.getElementById("tab");
	    var oLi = $("#tabList ul li");;
	    var aCon =  $("#tabCon >div");
	    var timer = null;
	    for (var i = 0; i < oLi.length; i++) {
	        oLi[i].index = i;
	        oLi[i].onclick = function() {
	        	
	        		show(this.index);
	 	            if(onTabChange){
	 	            	  onTabChange.call(this,this.index);
	 	            }
	        }
	    }
	    
	    
	    function show(index) {
	        var alpha = 0;
	        for (var j = 0; j < oLi.length; j++) {
	            oLi[j].className = "";
	            aCon[j].className = "";
//	            aCon[j].style.opacity = 0;
//	            aCon[j].style.filter = "alpha(opacity=0)";
	            aCon[j].style.display='none';
	        }
	        oLi[index].className = "cur";
	        aCon[index].style.display='block';
	        aCon[index].style.opacity=1;
//	        clearInterval(timer);
//	        timer = setInterval(function() {
//	            alpha += 2;
//	            alpha > 100 && (alpha = 100);
//	            aCon[index].style.opacity = alpha / 100;
//	            aCon[index].style.filter = "alpha(opacity=" + alpha + ")";
//	            alpha == 100 && clearInterval(timer);
//	        },
//	        5)
	    }
	    
	    
}


