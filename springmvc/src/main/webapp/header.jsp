<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>header</title>
</head>
<body>
<nav class="navbar navbar-default" role="navigation" id="header_content">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">全剧组最清闲的人</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="index.jsp">首页</a></li>
            <li><a href="editor.jsp">发表博客</a></li>
            <li><a href="show_blog.jsp">浏览博客</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    Java <b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="#">jmeter</a></li>
                    <li><a href="#">EJB</a></li>
                    <li><a href="#">Jasper Report</a></li>
                    <li class="divider"></li>
                    <li><a href="#">分离的链接</a></li>
                    <li class="divider"></li>
                    <li><a href="#">另一个分离的链接</a></li>
                </ul>
            </li>
        </ul>
        <div>
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search" id="search_input">
                </div>
                <button type="submit" class="btn btn-default">搜索</button>
            </form>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
        </ul>
    </div>
</nav>
</body>
</html>
