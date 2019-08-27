<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text.html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<title>商品一覧削除完了</title>

	<style type="text/css">
	/*========TAG LAYOUT========*/
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

	/*========ID LAYOUT========-*/
	#top{
	width:780px;
	margin:30px auto;
	border:1px solid #333;
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

	</style>

</head>
<body>
	<div id="header">
		<div id ="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品一覧削除完了</p>
		</div>
		<div>
			<s:if test="message !=null">
				<h2><s:property value="message"/></h2>
			</s:if>
		</div>
		<div>
			<a href='<s:url action="AdminAction"/>'>管理者ＴＯＰへ</a>
		</div>

	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>