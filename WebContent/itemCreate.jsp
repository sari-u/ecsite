<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text.html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
<title>商品登録</title>

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
			<p>商品登録</p>
		</div>
		<s:if test="errorMessage !=''">
			<s:property value="errorMessage" escape="false"/>
		</s:if>
		<s:form action="ItemCreateConfirmAction">
			<s:textfield name="itemName" label="商品名" />
			<s:textfield name="itemPrice" label="値段" />
			<s:textfield name="itemStock" label="個数" />
			<s:submit value="登録"/>
		</s:form>

		<div id="text-right">
				<p>管理者ＴＯＰ画面に戻る場合は<a href='<s:url action="AdminAction"/>'>こちら</a></p>
		</div>

</div>
<div id="footer">
	<div id="pr"></div>
</div>

</body>
</html>