<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>Test</title>
<link type="image/x-icon" href="<web:img/>layout/marketing/favicon.png"
	rel="icon" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<tiles:useAttribute id="list" name="default-css"
	classname="java.util.List" />
<c:forEach var="item" items="${list}">
	<link rel="stylesheet" href="<c:url value='${item}'/>" type="text/css"
		media="screen" />
</c:forEach>

<%-- Addition CSS --%>
<tiles:useAttribute id="list" name="css" classname="java.util.List" />
<c:forEach var="item" items="${list}">
	<link rel="stylesheet" href="<c:url value='${item}'/>" type="text/css"
		media="screen" />
</c:forEach>

<%-- Default JS --%>
<tiles:useAttribute id="list" name="default-js"
	classname="java.util.List" />
<c:forEach var="item" items="${list}">
	<script src="<c:url value='${item}'/>" type="text/javascript"></script>
</c:forEach>

<%-- Addition JS --%>
<tiles:useAttribute id="list" name="js" classname="java.util.List" />
<c:forEach var="item" items="${list}">
	<script src="<c:url value='${item}'/>" type="text/javascript"></script>
</c:forEach>


</head>
<body>
	<div id="mdg-dialog"></div>
	<div id="web_formAways" style="display: none;"></div>
	<div id="progress_loading_img"></div>
	<s:hidden name="GMTLocal" id="GMTLocal" />
	<div id="wrapper">
		<!--start login-->
		<tiles:insertAttribute name="header" />
		<!--end login-->
		<div id="container">
			<tiles:insertAttribute name="body" />
		</div>
		<div id="footer">
			<!--start banner-->
			<tiles:insertAttribute name="footer" />
			<!--end footer-->
		</div>
		<a href="#scrolltop" class="scrollTopAll"></a>
	</div>
</body>
</html>
