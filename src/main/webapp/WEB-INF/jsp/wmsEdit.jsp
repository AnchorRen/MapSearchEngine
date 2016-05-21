<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="itemeEditForm" class="itemForm" method="post">
	    <table cellpadding="5">
	        <tr>
	            <td>ID:</td>
	            <td>
	            	<input type="text" name="id" style="width: 280px;" readonly="readonly"></input>	
	            </td>
	        </tr>
	         <tr>
	            <td>URL:</td>
	            <td>
	                <input  type="text" name="url"  style="width: 800px;" readonly="readonly"/>
	            </td>
	        </tr>
	         <tr>
	            <td>version:</td>
	            <td>
	            	<input type="text"  name="version" style="width: 280px;" readonly="readonly"/>
	            </td>
	        </tr>
	        <tr>
	            <td>Title:</td>
	            <td><input class="easyui-textbox" type="text" name="title"  style="width: 280px;"></input></td>
	        </tr>
	      
	        <tr>
	            <td>Abstract:</td>
	            <td>
	            	<textarea  style="width:800px;height:100px" name="abstracts"></textarea>
	            </td>
	        </tr>
	        <tr>
	            <td>Keywords:</td>
	            <td>
	            	<textarea  style="width:800px;height:80px" name="keywords"></textarea>
	            </td>
	        </tr>
	       
	        <tr>
	            <td>Fees:</td>
	             <td>
	            	<textarea  style="width:800px;height:100px" name="fees"></textarea>
	            </td>
	        </tr>
	        <tr>
	            <td>Access:</td>
	            <td>
	            	<textarea  style="width:800px;height:100px" name="access"></textarea>
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
		
		$.post("/wms/update",$("#itemeEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','WMS服务修改成功!','info',function(){
					$("#itemEditWindow").window('close');
					$("#itemList").datagrid("reload");
				});
			}
		});
	}
</script>
