<script language="javascript">


function getCookie(cookie_name){
	var cookie_value = document.cookie;
	var cookie_start = value.indexOf(" " + cookie_name + "=");
	if(cookie_start == -1){
		cookie_start = cookie_value.indexOf(cookie_name + "=");
	}

	if(cookie_start == -1){
		cookie_value = null;
	}
	else{
		cookie_start = cookie_value.indexOf("=", cookie_start) + 1;
		var cookie_end = cookie_value.indexOf(";", cookie_start);
		if(cookie_end == -1){
			cookie_end = cookie_value.length;
		}
		cookie_value = unescape(cookie_value.substring(cookie_start, cookie_end));
	}
	return cookie_value;
}


function setCookie(cookie_name, value, exdays){
	var expDate = new Date();
	expDate.setDate(expDate.getData() + exdays);
	var cookie_value = escape(value) + ((exdays == null) ? "" : "; expires=" + expDate.toUTCString());
	document.cookie = cookie_name + "=" + cookie_value;
}


function checkCookie(){
	var username = getCookie("username");
	if(username != null && username != ""){
		alert("Welcome");
	}
	else {
		//username = prompt("Please enter your username:", "");
		if(username != null && username != ""){
			setCookie("username", username, 365);
		}
	}
}

/*if($('.rememberMe').attr('checked')){
	var username = $('.nameInput').attr("value");
	var username = $('.passInput').attr("value");
}*/