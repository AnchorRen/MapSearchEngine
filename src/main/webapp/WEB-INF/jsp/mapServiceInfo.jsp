<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
    
    <title>${mapInfo.serviceInfo.title }</title>
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="${pageContext.request.contextPath}/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    
    <script src="${pageContext.request.contextPath}/assets/js/ie-emulation-modes-warning.js"></script>
    
    <!-- Load Leaflet from CDN-->
	  <link rel="stylesheet" href="https://cdn.jsdelivr.net/leaflet/1.0.0-rc.1/leaflet.css" />
	  <script src="https://cdn.jsdelivr.net/leaflet/1.0.0-rc.1/leaflet-src.js"></script>
	  <!-- Load Esri Leaflet from CDN -->
	  <script src="https://cdn.jsdelivr.net/leaflet.esri/2.0.0/esri-leaflet.js"></script>
	  
  <!--   <link rel="stylesheet" href="http://cdn.leafletjs.com/leaflet/v0.7.7/leaflet.css" />
    <script src="http://cdn.leafletjs.com/leaflet/v0.7.7/leaflet.js"></script> -->
    <script src="http://maps.google.com/maps/api/js?v=3"></script>
    <script src="${pageContext.request.contextPath}/dist/js/Bing.js"></script>
    <script src="${pageContext.request.contextPath}/dist/js/Control.FullScreen.js"></script>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<style type="text/css">
.page-masthead {
  background-color: #5B5B5B;
  -webkit-box-shadow: inset 0 -2px 5px rgba(0,0,0,.1);
          box-shadow: inset 0 -2px 5px rgba(0,0,0,.1);
}

body {
  font-family: Georgia, "Times New Roman", Times, serif;
  color: #555;
}

h1, .h1,
h2, .h2,
h3, .h3,
h4, .h4,
h5, .h5,
h6, .h6 {
  margin-top: 0;
  font-weight: normal;
  color: #333;
}

/*
 * Override Bootstrap's default container.
 */

@media (min-width: 1200px) {
  .container {
    width: 970px;
  }
}
body a {
    color: #F99E0F;
    color:blue;
    text-decoration: none;
}
.map-contact{
  margin-top: 25px;
}
/* Nav links */
.page-nav-item {
  position: relative;
  display: inline-block;
  padding: 10px;
  font-weight: 500;
  color: #cdddeb;
}
.page-nav-item:hover,
.page-nav-item:focus {
  color: #fff;
  text-decoration: none;
}

.layer_img{
	width:120px;
	height:120px;
	border:solid 1px gray;
	text-align:center;
	margin-left:10px
}
/* Active state gets a caret at the bottom */
.page-nav .active {
  color: #fff;
}
.page-nav .active:after {
  position: absolute;
  bottom: 0;
  left: 50%;
  width: 0;
  height: 0;
  margin-left: -5px;
  vertical-align: middle;
  content: " ";
  border-right: 5px solid transparent;
  border-bottom: 5px solid;
  border-left: 5px solid transparent;
}
/*.container{
  border: 0.2px solid gray;
}*/
.map-title {
    margin-top: 30px;
    margin-bottom: 30px;
}

#layer_table_scroller {
    overflow-y: auto;
    overflow-x: hidden;
    max-height: 30em;
    border-style: solid;
    border-width: 1px;
    border-color: #DfDfDf;
    clear: left;
}

.even {
    background-color: #F0F0F0;
    margin-left: 5px;
    margin-right: 5px;
    margin-top: 5px;
    margin-bottom: 5px;
}

.odd {
    margin-left: 5px;
    margin-right: 5px;
    margin-top: 5px;
    margin-bottom: 5px;
}

.layer_title {
    font-weight: bold;
}

.layer_desc,
#service_description {
    text-indent: 2em;
    text-align: justify;
    text-justify: inter-ideograph;
}

/* #keywords{
	text-align: justify;
    text-justify: inter-ideograph;
} */
.heading {
    margin-top: 10px;
}
#map{
  margin-top: 20px;
  margin-bottom: 50px;
  width:100%; 
  height:500px;
}
.fullscreen-icon { background-image: url(../../images/icon-fullscreen.png); }
/* one selector per rule as explained here : http://www.sitepoint.com/html5-full-screen-api/ */
#map:-webkit-full-screen { width: 100% !important; height: 100% !important; z-index: 99999; }
#map:-ms-fullscreen { width: 100% !important; height: 100% !important; z-index: 99999; }
#map:full-screen { width: 100% !important; height: 100% !important; z-index: 99999; }
#map:fullscreen { width: 100% !important; height: 100% !important; z-index: 99999; }
.leaflet-pseudo-fullscreen { position: fixed !important; width: 100% !important; height: 100% !important; top: 0px !important; left: 0px !important; z-index: 99999; }
/*
 * Footer
 */

.page-footer {
  padding: 40px 0;
  color: #999;
  text-align: center;
  background-color: #f9f9f9;
  border-top: 1px solid #e5e5e5;
}
.page-footer p:last-child {
  margin-bottom: 0;
}
</style>

<body>

    <div class="page-masthead">
      <div class="container">
        <!--   <a class="navbar-brand" href="#">
            <img alt="Brand" src="../dist/image/lmars.png" style="height:50px; width:55px">
          </a> -->
        <nav class="page-nav">
          <a class="page-nav-item active" href="#">Service Infomation</a>
          <a class="page-nav-item" href="#">About</a>
        </nav>
      </div>
    </div>

    <div class="container">
        <div class="map-title">
            <h3>${mapInfo.serviceInfo.title}</h3>
            <a href="${mapInfo.serviceInfo.url}" }">${mapInfo.serviceInfo.url}</a>
        </div>
        <div class="service_description">
            <p id="service_description">${mapInfo.serviceInfo.abstracts} </p>
        </div>
        <hr>
        <div class="row" id="map-summery">
            <div class="col-md-7 map-info">
                <div id="layer-available ">
                    <h3>Available map layers&nbsp;(${mapInfo.layers.size()})</h3>
                    
                    <div id="layer_table_scroller">
                        <div id="layer_table">
                        
                           <c:forEach items="${mapInfo.layers}" var="layer">
	                            <div id="layer_offer" class="${layer.layerId%2==0?'even':'odd'}">
	                                <p class="layer_identifier">
	                                    <span id="layername" class="layer_title">${layer.title}</span>
	                                    <span class="layer_id">(${layer.layerId }) </span>
	                                </p>
	                                <p class="layer_desc">
	                                    <span id="layerdesc" >${layer.description}</span>
	                                    <!-- 图片遍历 -->
	                                </p>
	                               <div id="images">
	                               		<img class="layer_img"  src="../../images/2.png">
								        <img class="layer_img"  src="../../images/5.png">
								        <img class="layer_img"  src="../../images/4.png">
	                               </div>
	                            </div>
                            </c:forEach>
                        </div>
                    </div>
                    
                </div>
            </div>
            <div class="col-md-5 map-contact">
                <div id="service_info_container">
                    <dl class="service_info">
                        <dt class="heading">Interface</dt>
                        <dd class="serviceinfo">
                            <span >Web Service</span>,
                            <a href="http://www.esri.com/software/arcgis/arcgisserver">
                                <span>ArcGIS MapServer</span></a>
                            <span>${mapInfo.serviceInfo.version }</span>
                        </dd>
                        <dt class="heading">Keywords</dt>
                        <dd id="keywords" class="serviceinfo">
                            <span class="keyword">${mapInfo.serviceInfo.keywords==""?"None":mapInfo.serviceInfo.keywords }</span>
                        </dd>
                        <dt class="heading">Fees</dt>
                        <dd class="serviceinfo"> unknown
                        </dd>
                        <dt class="heading">Access constraints</dt>
                        <dd id="access" class="serviceinfo">
                            ${mapInfo.serviceInfo.access==''?'unknown':mapInfo.serviceInfo.access }
                        </dd>
                        <dt class="heading">Data provider</dt>
                        <dd class="provider_info">
                            <p id="provider_name">
                                <span class="provider_name" class="serviceinfo">
                					${mapInfo.documentInfo.author==''?'unknown':mapInfo.documentInfo.author}
                       			 </span>
                            </p>
                        </dd>
                    </dl>
                </div>
            </div>
        </div>
        <hr/>
        <div id="map" > </div>
    </div>
     <footer class="page-footer">
      <p>Contact us <a href="http://www.lmars.whu.edu.cn">@Lmars</a>.</p>
      <p>
        <a href="#">Back to top</a>
      </p>
    </footer>

    <script type='text/javascript'>
  //定义Google 底图
    var googleStreets = L.tileLayer('http://{s}.google.com/vt/lyrs=m&x={x}&y={y}&z={z}',{
               maxZoom: 20,
              subdomains:['mt0','mt1','mt2','mt3']
          }),
      googleHybrid = L.tileLayer('http://{s}.google.com/vt/lyrs=s,h&x={x}&y={y}&z={z}',{
               maxZoom: 20,
              subdomains:['mt0','mt1','mt2','mt3']
          }),
      googleSat = L.tileLayer('http://{s}.google.com/vt/lyrs=s&x={x}&y={y}&z={z}',{
              maxZoom: 20,
               subdomains:['mt0','mt1','mt2','mt3']
          }),
      googleTerrain = L.tileLayer('http://{s}.google.com/vt/lyrs=p&x={x}&y={y}&z={z}',{
                maxZoom: 20,
                subdomains:['mt0','mt1','mt2','mt3']
          });
    //定义Bing 底图
    var imagerySet = "Aerial"; // AerialWithLabels | Birdseye | BirdseyeWithLabels | Road
    var bingKey = "LfO3DMI9S6GnXD7d0WGs~bq2DRVkmIAzSOFdodzZLvw~Arx8dclDxmZA0Y38tHIJlJfnMbGq5GXeYmrGOUIbS2VLFzRKCK0Yv_bAl6oe-DOc";

    var bingAerial = new L.BingLayer(bingKey, {type:"Aerial"});
    var bingAerialWithLabels = new L.BingLayer(bingKey, {type: "AerialWithLabels"});
    var bingRoad = new L.BingLayer(bingKey, {type: "Road"});

    //定义MapBox底图
    var mbAttr = 'Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors, ' +
            '<a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, ' +
            'Imagery © <a href="http://mapbox.com">Mapbox</a>';
    var mbUrl = 'https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpandmbXliNDBjZWd2M2x6bDk3c2ZtOTkifQ._QA7i5Mpkd_m30IGElHziw';

    var mapboxGrayscale   = L.tileLayer(mbUrl, {id: 'mapbox.light', attribution: mbAttr});
    var mapboxStreets  = L.tileLayer(mbUrl, {id: 'mapbox.streets',   attribution: mbAttr});
    //OpenStreenMap 底图
    var osm = L.tileLayer('http://{s}.tile.osm.org/{z}/{x}/{y}.png', {
                  attribution: '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
              });


      //var map = L.map('map').setView([37.71, -99.88], 4);

     // L.esri.basemapLayer('Gray').addTo(map);

      var layer0 = L.esri.dynamicMapLayer({
        url: 'http://arcgis.sd.gov/arcgis/rest/services/DENR/SpillsSupport/MapServer',
        opacity: 1,
        useCors: false,
        layers:[0]
      });

      var layer1 = L.esri.dynamicMapLayer({
        url: 'http://arcgis.sd.gov/arcgis/rest/services/DENR/SpillsSupport/MapServer',
        opacity: 1,
        useCors: false,
        layers:[1]
      });

      var layer2 = L.esri.dynamicMapLayer({
        url: 'http://arcgis.sd.gov/arcgis/rest/services/DENR/SpillsSupport/MapServer',
        opacity: 1,
        useCors: false,
        layers:[2]
      });

      var layer3 = L.esri.dynamicMapLayer({
        url: 'http://arcgis.sd.gov/arcgis/rest/services/DENR/SpillsSupport/MapServer',
        opacity: 1,
        useCors: false,
        layers:[3]
      });

      var layer4 = L.esri.dynamicMapLayer({
        url: 'http://arcgis.sd.gov/arcgis/rest/services/DENR/SpillsSupport/MapServer',
        opacity: 1,
        useCors: false,
        layers:[4]
      });


      //图层数组
    var overlays = {
          "layer0":layer0,
          "layer1":layer1,
          "layer2":layer2,
          "layer3":layer3,
          "layer4":layer4
        };

      //底图数组
    var baseLayers = {
          "MapBox Grayscale": mapboxGrayscale,
          "MapBox Streets": mapboxStreets,
          "OpenStreetMap":osm,
        
          "Google Streets":googleStreets,
          "Google Hybrid":googleHybrid,
          "Google Satelite":googleSat,
          "Google Terrain":googleTerrain,
          "Bing Aerial":bingAerial,
          "Bing AerialWithLabels":bingAerialWithLabels,
          //"Bing Birdseye":bingBirdseye,
          "Bing Road":bingRoad


        };

        var map = L.map('map', {
          center: [39.73, -104.99],
          zoom: 5,
          layers: [osm], //初始显示的底图和图层
          fullscreenControl: true,
			fullscreenControlOptions: { // optional
				title:"Show me the fullscreen !",
				titleCancel:"Exit fullscreen mode"
			}
        });
		
        // detect fullscreen toggling
        map.on('enterFullscreen', function(){
        	if(window.console) window.console.log('enterFullscreen');
        });
        map.on('exitFullscreen', function(){
        	if(window.console) window.console.log('exitFullscreen');
        });
        
        map.addLayer(osm);
        map.addControl(new L.Control.Layers( baseLayers, overlays,{collapsed: true})); //false为右上角不折叠，true为默认折叠
    </script>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="${pageContext.request.contextPath}/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>

</html>
