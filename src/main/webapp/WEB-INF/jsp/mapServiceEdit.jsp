<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="itemeEditForm" class="itemForm" method="post">
		<input type="hidden" name="currentid"/>
		<input type="hidden" name="parentid"/>
	    <table cellpadding="5">
	        <tr>
	            <td>ID:</td>
	            <td>
	            	<input type="text" name="id" style="width: 280px;" readonly="readonly"></input>	
	            </td>
	        </tr>
	       
	         <tr>
	            <td>Version:</td>
	            <td>
	            	<input type="text"  name="currentversion" style="width: 280px;" readonly="readonly"/>
	            </td>
	        </tr>
	         <tr>
	            <td>URL:</td>
	            <td><input  type="text" name="mapserviceurl"  style="width: 800px;" readonly="readonly"></input></td>
	        </tr>
	        <tr>
	            <td>InitialExtend:</td>
	            <td>
	                <input  type="text" name="initialextend" style="width: 800px;" readonly="readonly"/>
	            </td>
	        </tr>
	         <tr>
	            <td>FullExtend:</td>
	            <td>
	                <input  type="text" name="fullextend" style="width: 800px;" readonly="readonly"/>
	            </td>
	        </tr>
	       
	        <tr>
	            <td>MapName:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="mapname"  style="width: 800px;"/>
	            </td>
	        </tr>
	        <tr>
	            <td>Description:</td>
	            <td>
	            	<textarea  style="width:800px;height:200px" name="servicedescription"></textarea>
	            </td>
	        </tr>
	        
	        <tr>
	            <td>CopyRight:</td>
	            <td>
	            	<textarea  style="width:800px;height:100px" name="copyrighttext"></textarea>
	            </td>
	        </tr>
	        <tr>
	            <td>Layers:</td>
	            <td>
	            	<textarea  style="width:800px;height:200px" name="layers"></textarea>
	            </td>
	        </tr>
	         <tr>
	            <td>DocumentInfo:</td>
	            <td>
	            	<textarea  style="width:800px;height:200px" name="documentinfo"></textarea>
	            </td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	</div>
</div>
<script type="text/javascript">
	var itemEditEditor ;
	$(function(){
		//实例化编辑器
		itemEditEditor = TAOTAO.createEditor("#itemeEditForm [name=desc]");
	});
	
	function submitForm(){
		if(!$('#itemeEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		
		$.post("/mapservice/update",$("#itemeEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改服务成功!并成功删除Redis中缓存！','info',function(){
					$("#itemEditWindow").window('close');
					$("#itemList").datagrid("reload");
				});
			}
		});
	}
</script>
