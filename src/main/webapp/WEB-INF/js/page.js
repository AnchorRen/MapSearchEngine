$(document).ready(function () {
	
	function getUrlParam(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]); return null; //返回参数值
    }
	
	var keywords = escape(getUrlParam("keywords"));//编码转换
	var page = getUrlParam("page")==null?1:getUrlParam("page");
	var totlePages = $("#totalPages").html();
	var curPage = $("#page").html();
	//alert(page);
    $('#visible-pages-example').twbsPagination({
        totalPages: totlePages,
        startPage : 1,
        page:curPage,
        visiblePages: 10,
        initiateStartPageClick :false,
        href: '?keywords='+keywords+'&page={{pageNumber}}',
        hrefVariable: '{{pageNumber}}',
        first: '首页',
        prev: '上一页',
        next: '下一页',
        last: '尾页',
        loop :true,
        onPageClick: function (event, page) {
        }
    });
});

