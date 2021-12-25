function goSourceList(){
	//location.href="/dm/";
	clickTreeNode();
}

function gotoModule(module){
	if(module == 'data'){
		location.href = "/dm/home";
	}else if(module == 'user'){
		location.href = "/dm/user";
	}
}
