<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text.html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
<title>商品登録確認</title>

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
			<p>商品登録確認</p>
		</div>
		<h3>登録する内容は以下でよろしいですか。</h3>
		<div>
			<s:form action="ItemCreateCompleteAction">
			<table>
			<tr>
				<td>商品名</td>
				<td><s:property value="itemName"/></td>
			</tr>
			<tr>
				<td>値段</td>
				<td><s:property value="itemPrice"/><span>円</span></td>

			</tr>
			<tr>
				<td>個数</td>
				<td><s:property value="itemStock"/><span>個</span></td>
			</tr>
			<tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td><s:submit value="完了"/></td>
			</table>
			</s:form>
		</div>

</div>
<div id="footer">
	<div id="pr"></div>
</div>

</body>
</html>