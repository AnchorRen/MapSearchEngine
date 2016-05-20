<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="itemList" title="WMS图层列表" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/wms/layer/list',method:'get',pageSize:30,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'id',width:40">图层ID</th>
            <th data-options="field:'wmsid',width:60">WMSID</th>
            <th data-options="field:'title',width:160">Title</th>
            <th data-options="field:'name',width:100">Name</th>
            <th data-options="field:'url',width:180">URL</th>
            <th data-options="field:'abstracts',width:150">Abstrack</th>
            <th data-options="field:'currentid',width:60">CurrentID</th>
            <th data-options="field:'images',width:130">Images</th>
            <th data-options="field:'boundingbox',width:160">BoundingBox</th>
        </tr>
    </thead>
</table>
<div id="itemEditWindow" class="easyui-window" title="编辑图层" data-options="modal:true,closed:true,iconCls:'icon-save',href:'/wms/layer/layerEdit'" style="width:80%;height:80%;padding:10px;">
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
                	$.post("/wms/layer/delete",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除图层成功!',undefined,function(){
            					$("#itemList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }
];
</script>