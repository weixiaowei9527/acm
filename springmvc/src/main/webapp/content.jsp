<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>content</title>
    <style>
        #ul_paihang{
            padding: 20px;
        }
        #ul_paihang li{
            margin-top: 10px;
            text-decoration: #41fffc underline;
            width: 100%;
        }
    </style>
    <script src="js/jquery-3.4.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script>
        $(document).ready(function () {
            console.log('加载了')
            $.ajax({
                url:'${pageContext.request.contextPath}/myblog/loadblog.do',
                data:{parama:0,paramb:5},
                dataType:'json',
                success:function (data) {
                    console.log('返回了')
                    console.log(data)

                    $("#blog_article").append('<header>'+data[0].post_title+'</header>')
                    $("#blog_article").append(data[0].post_content)
                }
            })
        })
    </script>
</head>
<body>
    <div style="width: 90%; margin: 0px auto">
        <div style="float:left;width: 65%; margin: 2.5%">
            <div style="background-color: #fff;">
        		<div style="height: 300px; background-color: #0e90d2">
                    轮播图

                </div>
                <div style="height: 600px; background-color: #2b542c">
                    博客列表
                    <ul>
                        <li>
                            <article id="blog_article">
                                <header id="post_title"></header>
                                <div id="post_content"></div>
                            </article>
                        </li>
                    </ul>
                </div>
                <div style="height: 60px; background-color: #3e8f3e">
                    分页

                </div>
        	</div>
            <div>
            	<p>最新博客</p>
            	<jsp:include page="show_blog.jsp"></jsp:include>
            </div>
        </div>
        <div style="float:left;background-color: #fff;width: 25%; margin: 2.5%">
            <div id="xinxi">
                <div style="background-color: #00FFFF; height: 120px">
                    <img src="images/timg.jpg" width="80px" height="80px" style="margin-top: 20px;margin-left: 20px; border-radius: 25px">
                </div>
                <div style="height: 240px;background-color: #7FFF00">

                </div>
            </div>
            <div id="paihang" style="margin-top: 60px; background-color: #dcd6d7; padding: 20px">
                <p>排行</p>
                <hr />
                <ul id="ul_paihang" style="list-style: none">
                    <li>woddjsjf</li>
                    <li>woddjsjf</li>
                    <li>woddjsjf</li>
                    <li>woddjsjf</li>
                    <li>woddjsjf</li>
                    <li>woddjsjf</li>
                    <li>woddjsjf</li>
                </ul>
            </div>
	    <div style="margin-top: 60px;">
			
			<ul style="list-style: none;">
				<li><audio controls="controls" src="music/薛之谦-演员.mp3"></audio></li>
				<li>dfdgsege</li>
				<li>dfdgsege</li>
				<li>dfdgsege</li>
				<li>dfdgsege</li>
			</ul>
		</div>
        </div>
        <div style="clear:both"></div>
    </div>
</body>
</html>
