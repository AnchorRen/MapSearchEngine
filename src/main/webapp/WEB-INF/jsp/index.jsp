<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <title>sousuo</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <link rel="stylesheet" type="text/css" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
    <script type="text/javascript" src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
	<script type="text/javascript" src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  </head>
  <body>
	<div id="wrapper">
		<div class="skin"><div class="mask"></div></div>
		<div id="head">
			<div class="top clearfix">
				<ul class="pull-right">

				</ul>
			</div>
			<div class="container">
				<div class="row">
					<div class="col-sm-12 col-md-6 center-block">
						<div class="row">
						
						</div>
						<div class="row">
							<form action="/" method="get">
								<div class="col-sm-9">
									<div class="form-group">								
									    <input type="text" autocomplete='off' name="keyword" class="form-control input-header" id="key" placeholder="input keywords to search map services">
									</div>
								</div>
								<div class="col-sm-3">
									<div class="form-group">
									   	<button type="submit" class="btn btn-default btn-outline btn-header btn-block" onclick="search('key');return false;">搜             索</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript">

	function search(a) {
    var b = "http://202.114.118.95:8080/q?keywords=" + encodeURIComponent(document.getElementById(a).value);
    return window.location.href = b;//重定向
	}

</script>
  </body>
</html>