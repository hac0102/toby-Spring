<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
</head>
<body>
	<div style="border: 1px solid red; width: 30%">
		<a href = "javascript:menuClick('/ttest/test/def.do');">aaaaaaaaa</a>
		<br>
		<a href = "javascript:menuClick('/ttest/test/ghi.do');">bbbbbbbbb</a>
		
	</div>
</body>

<script type="text/javascript">
	var menuClick = function(url){
		if(url == '/') {
			location.reload(rue);
			return;
		}
		
		$.ajax({
			type : "POST",
			url : url,
			async : false,
			data : "",
			contentType:"application/x-www-form-urlencoded; charset=UTF-8"
		}).done(function (result){
			$("#contents").html(result);
// 			if(isMenuHide) menuOff();

		})
		
		
	
	}
	
	
</script>

</html>