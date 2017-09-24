<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<title>ddddd</title>
</head>
<body>
<%-- 	<jsp:include  page="/WEB-INF/jsp/test/leftMenu.jsp" flush="false"></jsp:include> --%>
	
	<div id="leftMenu" style="border: 2px solid blue; float: left">
		<h3>
			<div id="setting">환경설정</div>
			<div id="userFilterSetting">유저필터설정</div>
			<div id="almFilterSetting">알람조회필터설정</div>
			<div id="msgFormat">메시지 포맷</div>
		</h3>
	</div>
	
	<div id="contents" style="border: 2px solid red;"></div>
	
	

</body>
	<script type="text/javascript">
	
	$(document).ready(function(){
		hoho();	
		setting();
		
	})
	
	
	
	function hoho(){
		$.ajax({
			url : "/ttest/test/def.do"
		}).done(function(result){
			$("#contents").html(result);
		})
	}
	
	function setting(){
		$("#setting").click(function(){
			$.ajax({
				url : "/ttest/test/def.do"
			}).done(function(result){
				$("#contents").html(result);
			})
		})
		
		
		
	}
	
	
		
	
	
	
// 	$("#a").click(function(){

// 	$.ajax({
// 			url : "/ttest/test/def.do",
// 			dataType : "POST",
// 			async : false
// 	}).done(function (result){
// 		alert("sds");
// 			$("#contents").html(result);
		
// 	})
		
// 	})
	</script>

</html>