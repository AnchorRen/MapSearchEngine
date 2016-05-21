<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<title>Map Search</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no">
<link rel="stylesheet" type="text/css"
	href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../../css/style.css">
<script type="text/javascript"
	src="http://cdn.bootcss.com/jquery/2.0.3/jquery.min.js"></script>
<script type="text/javascript"
	src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../js/jquery.twbsPagination.js">
	
</script>
<script type="text/javascript" src="../../js/page.js">
	
</script>
</head>
<body>
	<!-- <div class="left-aside hidden-sm hidden-xs">
			<div class="cover-img" style="background-image: url(../../images/bg_left.jpeg);"></div>
		</div> -->
	<!-- <div class="col-md-9 col-md-offset-3"> -->
	<div class="row">
	<div class="col-md-12">
		<div class="navbar navbar-default header">
			<div class="container-fluid">
				<!-- <div class="row"> -->
					<form class="navbar-form navbar-left" role="search" method="get"
						style="margin-left: 35px;">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="Search" name="keyword" aria-describedby="btn-search" id="key" value="${query}">
							 <span class="input-group-btn" id="btn-search">
							     <button type="submit" class="btn btn-default" onclick="search('key');return false;">搜索</button>
							 </span>
						</div>
					</form>

				</div>
			</div>
		</div>
	</div>
		<div class="row">
			<div class="col-md-7">
				<span class="label label-primary">Primary</span>
			</div>
		</div>

	<div class="col-md-9">
		<div class="row">
			<!-- <div class="navbar navbar-default header">
					<div class="container-fluid">
						<div class="row">
							<form class="navbar-form navbar-left" role="search" method="get" style="margin-left: 35px;">
								<div class="input-group">
								  	<input type="text" class="form-control" placeholder="Search" name="keyword" aria-describedby="btn-search" id="key" value="">
								  	<span class="input-group-btn" id="btn-search"><button type="submit" class="btn btn-default" onclick="search('key');return false;">搜索</button></span>
								</div>
							</form>
						
						</div>
					</div>
				</div> -->

			<div class="main">
				<ul class="article-list">
					<c:forEach items="${itemList}" var="item">

						<li class="have-img"><a href="${item.images}" target="_blank"
							class="wrap-img"> <img src="../../images/2.png">
						</a> <a href="${item.images}" target="_blank" class="wrap-img"> <img
								src="../../images/5.png">
						</a> <a href="${item.images}" target="_blank" class="wrap-img"> <img
								src="../../images/4.png">
						</a>
							<div>
								<h4 class="title">
									<a href="/service/${item.serviceId}" target="_blank">${item.mapName}</a>
								</h4>
								<p class="des">${item.mapDesc}</p>
								<div class="list-footer">
									<span>ServiceId：${item.serviceId}</span><br>
									<c:choose>
										<c:when test="${fn:startsWith(item.serviceId,'1') }">
											<span>服务类型：WMS</span>
										</c:when>
										<c:otherwise>
											<span>服务类型：ArcGIS MapService</span>
										</c:otherwise>
									</c:choose>
								</div>
							</div></li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>

	<div class="col-md-8">

		<div id="content-wrapper">
			<div class="inner clearfix">
				<section id="main-content">

					<div class="text-left">
						<ul id="visible-pages-example"></ul>
					</div>

				</section>

			</div>
		</div>
	</div>
	<script type="text/javascript">
		function search(a) {
			var b = "http://localhost:8080/q?keywords="
					+ encodeURIComponent(document.getElementById(a).value);
			return window.location.href = b;//重定向
		}
	</script>
</body>
</html>