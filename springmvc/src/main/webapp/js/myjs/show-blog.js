/**
 * 
 */

function requestByJson() {
	/* JSON.stringify将 JavaScript 对象转换为 JSON 字符串 */
	var params = JSON.stringify({
		"username" : "wei",
		"password" : "toor"
	})
	$.ajax({
		type : 'post',
		url : 'blog/select',
		contentType : 'application/json;charset=utf-8',
		data : params,
		dataType : 'json',// 后台返回数据
		success : function(data) {
			console.log(data)
			console.log(data.length)
			var ele = $("#blog_list");
			for (var i = 0; i < data.length; i++) {
				var d = $("<li></li>");
				d.append("<h3><a herf='#' class='ptitle'>" + data[i].post_title
						+ "</a></h3>");
				d.append("<div class='p_content'>" + data[i].post_content
						+ "</div>");
				d.append("<div>" + new Date(data[i].post_time) + "</div>");

				ele.append(d);
			}
		},
		error : function(textStatus, errorThrown) {
			alert(textStatus)
		}
	})

}
