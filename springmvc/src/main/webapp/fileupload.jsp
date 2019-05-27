<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="fileupload" enctype="multipart/form-data" method="post">
		<table>
			<tr>
				<th>Column 1 Heading</th>
				<th>Column 2 Heading</th>
			</tr>
			<tr>
				<td>上传者</td>
				<td><input type="text" value="name"></td>
			</tr>
			<tr>
				<td>上传文件</td>
				<td><input type="file" name="myfile"></td>
			</tr>
			<tr colspan=2>
				<input type="submit" value="上传" />
			</tr>
		</table>
	</form>
</body>
</html>