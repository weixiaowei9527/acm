<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.0.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#ceshi").click(function() {
		
		$(this).css("color","yellow")
	})
})
function requestByJson(){
	alert('开始')
	$.ajax({
		type:'post',
		url:'${pageContext.request.contextPath }/myjson/hello.do',
		success:function(data){
			alert(data)
		}
	})
}
</script>
</head>
<body>
<input type="button" value="json" onclick="requestByJson()" id="bian">
${pageContext.request.contextPath }
<button id="ceshi">测试jquery</button>
</body>
</html>