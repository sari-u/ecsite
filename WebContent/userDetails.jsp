<%@ page language="java" contentType="text/html; charset=UTF-8"

pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<head>

	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>ユーザー情報詳細画面</title>
	<style type="text/css">
	/* ========TAG LAYOUT======== */
	body {
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana, Helvetica, sans-serif;
	font-size:12px;
	color:#333;
	background:#ddd;
	}
	table{
	text-align:center;
	margin:0 auto;

	}

	table td{
	text-align:left;
	margin:0 auto;

	}

	/* ========ID LAYOUT======== */
	#top {
	width:70%;
	margin:30px auto;
	border:1px solid #333;
	text-align:center;
	}
	#header {
	width: 100%;
	height: 80px;
	background-color: black;
	}
	#main {
	width: 100%;
	height: 500px;
	text-align: center;
	}
	#footer {
	width: 100%;
	height: 80px;
	background-color: black;
	clear:both;

	}
	#text-right {
	display: inline-block;
	text-align: right;

	}
	</style>

	</head>
	<body>
		<div id="header">
			<div id="pr">
			</div>
		</div>
		<div id="main">
			<div id="top">
				<p>UserDetails</p>
			</div>
			<div>
				<s:if test="userDetailsDTO == null">
					<h3>商品の詳細情報はありません。</h3>
				</s:if>
				<s:elseif test="message == null">
					<h3>商品情報は以下になります。</h3>
					<table border="1">
						<tr>
							<th>ＩＤ</th>
							<td><s:property value="userDetailsDTO.id" /></td>
						</tr>
						<tr>
							<th>ログインＩＤ</th>
							<td><s:property value="userDetailsDTO.login_id" /></td>
						</tr>
						<tr>
							<th>ログインパスワード</th>
							<td><s:property value="userDetailsDTO.login_pass" /></td>
						</tr>
						<tr>
							<th>ユーザー名</th>
							<td><s:property value="userDetailsDTO.user_name" /></td>
						</tr>
						<tr>
							<th>登録日</th>
							<td><s:property value="userDetailsDTO.insert_date" /></td>
						</tr>
						<tr>
							<th>更新日</th>
							<td><s:property value="userDetailsDTO.updated_date" /></td>
						</tr>
					</table>
					<s:form action="UserDeleteConfirmAction">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="削除" />
					</s:form>
				</s:elseif>
				<div id="text-right">
					<p>ユーザー一覧は<a href='<s:url action="UserListAction" />'>こちら</a></p>
				</div>
			</div>
		</div>
		<div id="footer">
			<div id="pr">
			</div>
		</div>
	</body>
</html>
