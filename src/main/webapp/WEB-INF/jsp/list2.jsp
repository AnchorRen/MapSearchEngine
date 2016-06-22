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
	src="http://cdn.bootcss.com/jquery/2.0.1/jquery.min.js"></script>
<script type="text/javascript"
	src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../js/jquery.twbsPagination.js" charset="gb2312">
	
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
						style="margin-left: 20px;">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="Search" name="keyword" aria-describedby="btn-search" id="key" value="${query}">
							 <span class="input-group-btn" id="btn-search">
							     <button type="submit" class="btn btn-default" onclick="search('key');return false;">搜索</button>
							 </span>
						</div>
					</form>
					<div class="result" style="margin-top:20px">
					
						<span style="color:red">"${query}"&nbsp;的搜索结果共有&nbsp;
						<span id="recordCount">${recordCount }</span>&nbsp;条，共&nbsp;<span id="totalPages">${totalPages }</span>&nbsp;页，
						当前为第&nbsp;<span id="page">${page }</span>&nbsp;页</span>
					
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="col-md-9">
		<div class="row">
			<div class="main">
				<ul class="article-list">
					<c:forEach items="${itemList}" var="item">
						<li class="have-img">
							<p class="images">
									<c:choose>
										<c:when test="${fn:startsWith(item.serviceId,'1') }">
											<a href="../../images/wms/${item.id}/${item.id}_3.png" target="_blank" class="wrap-img"> <img src="../../images/wms/${item.id}/${item.id}_3.png"></a>
											<a href="../../images/wms/${item.id}/${item.id}_2.png" target="_blank" class="wrap-img"> <img src="../../images/wms/${item.id}/${item.id}_2.png"></a> 
											<a href="../../images/wms/${item.id}/${item.id}_1.png" target="_blank" class="wrap-img"> <img src="../../images/wms/${item.id}/${item.id}_1.png"></a>
										</c:when>
										<c:otherwise>
											<a href="../../images/arcgis/${item.id}/${item.id}_3.png" target="_blank" class="wrap-img"> <img src="../../images/arcgis/${item.id}/${item.id}_3.png"></a>
											<a href="../../images/arcgis/${item.id}/${item.id}_2.png" target="_blank" class="wrap-img"> <img src="../../images/arcgis/${item.id}/${item.id}_2.png"></a> 
											<a href="../../images/arcgis/${item.id}/${item.id}_1.png" target="_blank" class="wrap-img"> <img src="../../images/arcgis/${item.id}/${item.id}_1.png"></a>
										</c:otherwise>
									</c:choose>
									
							</p>
							<div>
								<h3 class="title" >
									<a href="/service/${item.serviceId}#${item.mapName}" target="_blank" >${item.mapTitle}</a>	
									<%-- <c:choose>
										<c:when test="${fn:startsWith(item.serviceId,'1') }">
											<a href="/service/${item.serviceId}#${item.mapName}" target="_blank" >${item.mapTitle}</a>										</c:when>
										<c:otherwise>
											<a href="/service/${item.serviceId}#${item.mapName}" target="_blank" >${item.mapTitle}</a>
										</c:otherwise>
									</c:choose> --%>
									
								</h3>
								<p class="des">${item.mapDesc}</p>
							</div>
							<div class="list-footer">
									<%-- <span>ServiceId：${item.serviceId}</span><br> --%>
									<c:choose>
										<c:when test="${fn:startsWith(item.serviceId,'1') }">
											<span>服务类型：</span>
											<em class="serviceType">WMS</em>
										</c:when>
										<c:otherwise>
											<span>服务类型：</span>
											<em class="ServiceType">ArcGIS MapService</em>
										</c:otherwise>
									</c:choose>
							</div>
						</li>
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
						<ul id="visible-pages-example" style="border-radius: 0px;"></ul>
						<p id="page-content"></p>
					</div>
				</section>

			</div>
		</div>
	</div>
	<script type="text/javascript">
		function search(a) {
			var b = "http://202.114.118.95:8080/q?keywords="
					+ encodeURIComponent(document.getElementById(a).value);
			return window.location.href = b;//重定向
		}
	</script>
</body>
</html>