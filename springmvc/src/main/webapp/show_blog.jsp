<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ page isELIgnored="false" %> --%>
<!-- 解决EL表达式不起作用 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>浏览博客</title>
<script src="js/jquery-3.4.0.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="js/jquery.hotkeys.js" type="text/javascript"
	charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap-wysiwyg.js" type="text/javascript"
	charset="utf-8"></script>
<script src="js/editor.js" type="text/javascript" charset="utf-8"></script>


<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-combined.no-icons.min.css" />
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" type="text/css" href="css/font-awesome.css" />
<link rel="stylesheet" type="text/css" href="css/editor.css" />

<style type="text/css">
.navbar-nav>li>a {
	line-height: 30px;
}

#search_input {
	height: 30px;
}
</style>
<script type="text/javascript" src="js/myjs/show-blog.js"></script>
<link rel="stylesheet" type="text/css" href="css/mycss/show-blog.css" />
</head>
<body>

		<jsp:include page="header.jsp"></jsp:include>
		

		

	
	<div>
		<input type="button" value="json" onclick="requestByJson()"> <a
			href="${pageContext.request.contextPath }/blog/select">dianwo</a>
		<div>
			<ul id="blog_list">
			</ul>
		</div>
		<div class="fenye">
			<span>上一页</span> <span>下一页</span>
		</div>
	</div>
</body>
</html>