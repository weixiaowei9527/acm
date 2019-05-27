$(function() {
	function initToolbarBootstrapBindings() {
		var fonts = ['Serif', 'Sans', 'Arial', 'Arial Black', 'Courier',
				'Courier New', 'Comic Sans MS', 'Helvetica', 'Impact', 'Lucida Grande', 'Lucida Sans', 'Tahoma', 'Times',
				'Times New Roman', 'Verdana'
			],
			fontTarget = $('[title=Font]').siblings('.dropdown-menu');
		$.each(fonts, function(idx, fontName) {
			fontTarget.append($('<li><a data-edit="fontName ' + fontName + '" style="font-family:\'' + fontName + '\'">' +
				fontName + '</a></li>'));
		});
		$('a[title]').tooltip({
			container: 'body'
		});
		$('.dropdown-menu input').click(function() {
				return false;
			})
			.change(function() {
				$(this).parent('.dropdown-menu').siblings('.dropdown-toggle').dropdown('toggle');
			})
			.keydown('esc', function() {
				this.value = '';
				$(this).change();
			});

		$('[data-role=magic-overlay]').each(function() {
			var overlay = $(this),
				target = $(overlay.data('target'));
			overlay.css('opacity', 0).css('position', 'absolute').offset(target.offset()).width(target.outerWidth()).height(
				target.outerHeight());
		});
		$('#voiceBtn').hide();
		// if ("onwebkitspeechchange"  in document.createElement("input")) {
		//   var editorOffset = $('#editor').offset();
		//   $('#voiceBtn').css('position','absolute').offset({top: editorOffset.top, left: editorOffset.left+$('#editor').innerWidth()-35});
		// } else {
		//   $('#voiceBtn').hide();
		// }
	};
	initToolbarBootstrapBindings();
	$('#editor').wysiwyg();
	window.prettyPrint && prettyPrint();
});
function checkForm(){
	var html_text = $('#editor').html()
	if(html_text==''){
		alert('博文不能为空')
		return false
	}
	$("#show_code").append(html_text)
	var title = $("input[name='title']").val()
	if(title==''){
		alert('标题不能为空')
		return false
	}
	/*var params = JSON.stringify({"post_title":title, "post_content":html_text})*/
	var params = {"post_title":title, "post_content":html_text}
	console.log(params)
	var title = params.post_title;
	var content = params.post_content
	console.log(title + 'jldfj' + content)
	$("input[name='post_title']").val(title);
	$("input[name='post_content']").val(content);
	return true;
}
function getHtml() {
	var html_text = $('#editor').html()
	if(html_text==''){
		alert('博文不能为空')
	}
	$("#show_code").append(html_text)
	var title = $("input[name='title']").val()
	if(title==''){
		alert('标题不能为空')
	}
	var params = JSON.stringify({"post_title":title, "post_content":html_text})
	$.ajax({
		type:'post',
		url:'/springmvc/myblog/putblog.do',
		contentType:'application/json;charset=utf-8',
		data:params,
		/*dataType:'string',//后台返回数据
*/		success:function(data){
			/*data是一个网页*/
			console.log('返回成功')
			alert(data)
			alert('success')
			/*window.location.href = "/springmvc/success.jsp";*/
			window.location.href = data
		},
		error:function(textStatus,errorThrown){
			console.log('出错了')
			console.log(textStatus)
		}
	})
}

