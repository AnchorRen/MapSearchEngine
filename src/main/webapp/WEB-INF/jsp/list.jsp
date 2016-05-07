<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="m psearch " id="plist">
		<ul class="list-h clearfix" tpl="2">
			<c:forEach items="${itemList}" var="item">
				<li class="item-book" bookid="11078102">
					
					<div class="map-name">
						<a target="_blank" href="/item/${item.id }.html">
							${item.mapName} </a>
					</div>
					<div class="map-desc">
						<a target="_blank" href="/item/${item.id }.html">
							${item.mapDesc} </a>
					</div>
					<div class="p-img">
						<a target="_blank" href="/item/${item.id }.html"> <img
							width="160" height="160" data-img="1"
							data-lazyload="${item.images}" />
						</a>
					</div>
				</li>
			</c:forEach>
		</ul>
	</div>

</body>
</html>