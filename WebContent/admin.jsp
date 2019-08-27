<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text.html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
<title>管理者画面</title>

<style type="text/css">
body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana,Helvetica,sans-serif;
	font-size:12px;
	color:#333;
	background:#ddd;
}

table{
	text-align:center;
	margin:0 auto;
}

#top{
	width:70%;
	margin:30px auto;
	border:1px solid #333;
	text-align:center;
}

#header{
	width:100%;
	height:80px;
	background-color:black;
}

#main{
	width:100%;
	height:500px;
	text-align:center;
}

#footer{
	width:100%;
	height:80px;
	background-color:black;
	clear:both;
}

#text-center{
	display:inline-block;
	text-align:center;
}
</style>
</head>
<body>
<div id="header">
	<div id ="pr"></div>
</div>
<div id="main">
		<div id="top">
			<p>管理者画面</p>
		</div>
	<table>
		<tr>
			<td>商品</td><td>ユーザー</td>
		</tr>
		<tr>
			<td>
				<s:form action="ItemCreateAction">
					<s:submit value="新規登録" style="width:80px" />
				</s:form>
			</td>
			<td>
				<s:form action="UserCreateAction">
					<s:submit value="新規登録" style="width:80px"/>
				</s:form>
			</td>
		</tr>
		<tr>
			<td>
				<s:form action="ItemListAction">
					<s:submit value="一覧" style="width:80px" />
				</s:form>
			</td>
			<td>
				<s:form action="UserListAction">
					<s:submit value="一覧" style="width:80px"/>
				</s:form>
			</td>
		</tr>
	</table>
</div>
<div id="footer">
	<div id="pr"></div>
</div>
</body>
</html>