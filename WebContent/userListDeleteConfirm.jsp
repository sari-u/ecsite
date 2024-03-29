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
	<title>ユーザー一覧削除確認</title>

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

	</style>
	<script type="text/javascript">
		function submitAction(url){
			$('form').attr('action',url);
			$('form').submit();
		}
	</script>
</head>
<body>
	<div id="header">
		<div id ="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>ユーザー一覧削除確認</p>
		</div>
		<div>
			<h2>管理者以外のユーザーを削除します。よろしいですか？</h2>
			<s:form>
			<tr>
				<td><input type="button" value="ＯＫ" onclick="submitAction('UserListDeleteCompleteAction')"/></td>
				<td><input type="button" value="キャンセル" onclick="submitAction('UserListAction')"/></td>
			</tr>
			</s:form>
		</div>

	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>