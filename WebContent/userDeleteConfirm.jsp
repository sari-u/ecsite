<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text.html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>ユーザー情報削除確認</title>

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

	<script type="text/javascript">
		function submitAction(url){
			$('form').attr('action',url);
			$('form').submit();
		}
	</script>
</head>
<body>
	<div>
		<div id="header">
		<div id="pr"></div>
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserDeleteConfirm</p>
		</div>
		<div>
			<h2>ログインＩＤ[<s:property value="#session.id"/>]のユーザーを削除します。よろしいですか？</h2>
			<s:form>
			<tr>
				<td><input type="button" value="ＯＫ" onclick="submitAction('UserDeleteCompleteAction')"/></td>
				<td>
				<s:form>
					<input type="button" value="キャンセル"onclick="submitAction('UserDetailsAction')"/>
					<s:hidden name="id" value="%{id}" />
				</s:form>
				</td>
			</tr>
			</s:form>

			<div id="text-right">
				<p>管理者ＴＯＰ画面に戻る場合は<a href='<s:url action="AdminAction"/>'>こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>