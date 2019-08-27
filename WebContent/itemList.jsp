<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text.html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
<title>商品一覧</title>

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

#text-center{
	display:inline-block;
	text-align:center;
}
</style>
</head>
<body>
	<div>
		<div id="header">
		<div id="pr"></div>
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品一覧</p>
		</div>
		<div>

			<table border="1">
			<tr>
				<th>ＩＤ</th>
				<th>商品名</th>
				<th>値段</th>
				<th>在庫</th>
				<th>詳細</th>
			</tr>
			<s:iterator value="itemList">
				<tr>
					<td><s:property value="id"/></td>
					<td><s:property value="item_name"/></td>
					<td><s:property value="item_price"/><span>円</span></td>
					<td><s:property value="item_stock"/><span>個</span></td>
					<td>
					<a href='<s:url action="ItemDetailsAction"><s:param name="id" value="%{id}"/></s:url>'>詳細</a>
					</td>
				</tr>
			</s:iterator>
			</table>
			<s:if test="message !=null">
				<h3><s:property value="message"/></h3>
			</s:if>
			<br>
			<s:form action="ItemListDeleteConfirmAction">
				<s:submit value="削除"/>
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