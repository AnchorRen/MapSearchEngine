<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="itemList" title="MapService服务列表" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/mapservice/list',method:'get',pageSize:30,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'id',width:60,align:'center'">ID</th>
            <th data-options="field:'mapserviceurl',width:130,align:'center'">URL</th>
            <th data-options="field:'currentversion',width:50,align:'center'">Version</th>
            <th data-options="field:'mapname',width:120,align:'center'">Name</th>
            <th data-options="field:'initialextend',width:100,align:'center'">InitialExtend</th>
            <th data-options="field:'fullextend',width:100,align:'center'">FullExtend</th>
            <th data-options="field:'servicedescription',width:150,align:'center'">Description</th>
            <th data-options="field:'copyrighttext',width:120,align:'center'">CopyRight</th>
            <th data-options="field:'layers',width:130,align:'center'">Layers</th>
            <th data-options="field:'documentinfo',width:120,align:'center'">DocumentInfo</th>
        </tr>
    </thead>
</table>
<div id="itemEditWindow" class="easyui-window" title="MapService服务编辑" data-options="modal:true,closed:true,iconCls:'icon-save',href:'/mapservice/mapserviceEdit'" style="width:80%;height:80%;padding:10px;">
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
    
    var toolbar = [{
        text:'编辑',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一个服务才能编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一个服务!');
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
        		$.messager.alert('提示','未选中服务!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除ID为 '+ids+' 的服务吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("/mapservice/delete",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除服务成功!并成功删除其缓存和其所有图层信息！',undefined,function(){
            					$("#itemList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    },'-',{
        text:'弃用服务',
        iconCls:'icon-remove',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中服务!');
        		return ;
        	}
        	$.messager.confirm('确认','确定弃用ID为 '+ids+' 的服务吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("/rest/item/instock",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','服务弃用成功!',undefined,function(){
            					$("#itemList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    },{
        text:'启用服务',
        iconCls:'icon-remove',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中服务!');
        		return ;
        	}
        	$.messager.confirm('确认','确定启用ID为 '+ids+' 的服务吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("/rest/item/reshelf",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','启用服务成功!',undefined,function(){
            					$("#itemList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>