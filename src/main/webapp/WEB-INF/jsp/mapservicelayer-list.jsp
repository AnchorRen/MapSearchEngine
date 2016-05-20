<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="itemList" title="MapService图层管理" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/mapservice/layer/list',method:'get',pageSize:30,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'id',width:60">ID</th>
            <th data-options="field:'mapserviceid',width:80">MapServiceId</th>
            <th data-options="field:'layername',width:200">Name</th>
            <th data-options="field:'layerid',width:60">图层ID</th>
            <th data-options="field:'layerurl',width:180">URL</th>
            <th data-options="field:'description',width:300">Description</th>
            <th data-options="field:'images',width:180">Images</th>
        </tr>
    </thead>
</table>
<div id="itemEditWindow" class="easyui-window" title="编辑图层" data-options="modal:true,closed:true,iconCls:'icon-save',href:'/mapservice/layer/layerEdit'" style="width:80%;height:80%;padding:10px;">
</div>
<script>

    function getSelectionsIds(){
    	var itemList = $("#itemList");
    	var sels = itemList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].id);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [
        {
        text:'编辑',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一个图层才能编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一个图层!');
        		return ;
        	}
        	
        	$("#itemEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#itemList").datagrid("getSelections")[0];
        			data.priceView = TAOTAO.formatPrice(data.price);
        			$("#itemeEditForm").form("load",data);
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中图层!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除ID为 '+ids+' 的图层吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("/mapservice/layer/delete",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除图层成功!并删除图层索引！',undefined,function(){
            					$("#itemList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>