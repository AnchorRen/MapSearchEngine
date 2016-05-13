$(document).ready(function () {
	
	function getUrlParam(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]); return null; //返回参数值
    }
	
	var keywords = getUrlParam('keywords');
	
    $('#visible-pages-example').twbsPagination({
        totalPages: 20,
        visiblePages: 10,
        version: '1.1',
        href: '?keywords='+keywords+'&page={{pageNumber}}',
        hrefVariable: '{{pageNumber}}',
        first: '第一页',
        prev: '上一页',
        next: '下一页',
        last: '最后一页',
        onPageClick: function (event, page) {
            $('#page-content').text('Page ' + page);
        }
    });

});

