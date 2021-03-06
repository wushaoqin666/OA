<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息管理 - Powered By JeeSite</title>
	<meta name="renderer" content="webkit"><meta http-equiv="X-UA-Compatible" content="IE=8,IE=9,IE=10" />
<meta http-equiv="Expires" content="0"><meta http-equiv="Cache-Control" content="no-cache"><meta http-equiv="Cache-Control" content="no-store">
<script src="static/jquery/jquery-1.8.3.min.js" type="text/javascript"></script>
<link href="static/bootstrap/2.3.1/css_cerulean/bootstrap.min.css" type="text/css" rel="stylesheet" />
<script src="static/bootstrap/2.3.1/js/bootstrap.min.js" type="text/javascript"></script>
<link href="static/bootstrap/2.3.1/awesome/font-awesome.min.css" type="text/css" rel="stylesheet" />
<link href="static/jquery-select2/3.4/select2.min.css" rel="stylesheet" />
<script src="static/jquery-select2/3.4/select2.min.js" type="text/javascript"></script>
<link href="static/jquery-validation/1.11.0/jquery.validate.min.css" type="text/css" rel="stylesheet" />
<script src="static/jquery-validation/1.11.0/jquery.validate.min.js" type="text/javascript"></script>
<link href="static/jquery-jbox/2.3/Skins/Bootstrap/jbox.min.css" rel="stylesheet" />
<script src="static/jquery-jbox/2.3/jquery.jBox-2.3.min.js" type="text/javascript"></script>
<script src="static/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
<script src="static/common/mustache.min.js" type="text/javascript"></script>
<link href="static/common/jeesite.css" type="text/css" rel="stylesheet" />
<script src="static/common/jeesite.js" type="text/javascript"></script>
<script type="text/javascript">var ctx = 'a', ctxStatic='static';</script>
	<!-- Baidu tongji analytics --><script>var _hmt=_hmt||[];(function(){var hm=document.createElement("script");hm.src="//hm.baidu.com/hm.js?82116c626a8d504a5c0675073362ef6f";var s=document.getElementsByTagName("script")[0];s.parentNode.insertBefore(hm,s);})();</script>
	
	
	<meta name="decorator" content="default">
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
		
		
		function susers(){
			var name=$("#name").val();
			var phone=$("#phone").val();
			var status=$("#status").val();
			
			$.ajax({
				url:"chauser",
				type:"post",
				data:{"name":name,"phone":phone,"status":status},
				dataType:"json",
				success:function(data){
					$("#tb").empty();
					for(var i=0;i<data.length;i++){
						var $tr=$("<tr><td><a href='userUp?id="+data[i].id+"'>"+data[i].id+"</a></td><td>"+data[i].username+"</td><td>"+data[i].password+"</td><td>"+data[i].email+"</td><td>"+data[i].phone+"</td><td>"+data[i].sortnum+"</td><td>"+(data[i].status==0?'正常':'删除')+"</td><td><a href='userUp?id="+data[i].id+"'>修改</a><a href='#' onclick='return confirmx(&#39;确认要删除该用户信息吗？&#39;, this.href)'>删除</a></td></tr>");
						
						$("#tb").append($tr);
					} 
					
				}
				
			})
		}
	</script>
	
	

</head>
<body>
	
	<ul class="nav nav-tabs">
		<li class="active"><a href="index.html">用户信息列表</a></li>
		<li><a href="addUser/saved_resource.html">用户信息添加</a></li>
	</ul>
	<form id="searchForm" class="breadcrumb form-search" action="" >
		<input id="pageNo" name="pageNo" type="hidden" value="1">
		<input id="pageSize" name="pageSize" type="hidden" value="10">
		<ul class="ul-form">
			<li><label>用户名称：</label>
				<input id="name" name="name" class="input-medium" type="text" value="" maxlength="50">
			</li>
			<li><label>手机号码：</label>
				<input id="phone" name="phone" class="input-medium" type="text" value="" maxlength="13">
			</li>
			<li><label>状态：</label>
				<select id="status" name="status" class="input-medium">
					<option value="" selected="selected"></option>
					<option value="0">正常</option><option value="1">删除</option>
				</select>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="button" onclick="susers()" value="查询"></li>
			<li class="clearfix"></li>
		</ul>
	</form>
	














<script type="text/javascript">top.$.jBox.closeTip();</script>

	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>编号</th>
				<th>用户名称</th>
				<th>用户密码</th>
				<th>电子邮件</th>
				<th>手机号码</th>
				<th>排序</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody id="tb">
			<c:forEach items="${list }" var="li">
				<tr>
				<td><a href="userUp?id="+${li.id }>
					${li.id }
				</a></td>
				<td>
					${li.username }
				</td>
				<td>
					${li.password }
				</td>
				<td>
					${li.email }
				</td>
				<td>
					${li.phone }
				</td>
				<td>
					${li.sortnum }
				</td>
				<td>
					${li.status==0?"正常":"删除" }
				</td>
				<td>
    				<a href="userUp?id="+${li.id }>修改</a>
					<a href="#" onclick="return confirmx(&#39;确认要删除该用户信息吗？&#39;, this.href)">删除</a>
				</td>
			</tr>
			</c:forEach>
		
		</tbody>
	</table>
	<div class="pagination"><ul>
<li class="disabled"><a href="javascript:">« 上一页</a></li>
<li class="active"><a href="javascript:">1</a></li>
<li class="disabled"><a href="javascript:">下一页 »</a></li>
<li class="disabled controls"><a href="javascript:">当前 <input type="text" value="1" onkeypress="var e=window.event||event;var c=e.keyCode||e.which;if(c==13)page(this.value,10,&#39;&#39;);" onclick="this.select();"> / <input type="text" value="10" onkeypress="var e=window.event||event;var c=e.keyCode||e.which;if(c==13)page(1,this.value,&#39;&#39;);" onclick="this.select();"> 条，共 2 条</a></li>
</ul>
<div style="clear:both;"></div></div>

	<script type="text/javascript">//<!-- 无框架时，左上角显示菜单图标按钮。
		if(!(self.frameElement && self.frameElement.tagName=="IFRAME")){
			$("body").prepend("<i id=\"btnMenu\" class=\"icon-th-list\" style=\"cursor:pointer;float:right;margin:10px;\"></i><div id=\"menuContent\"></div>");
			$("#btnMenu").click(function(){
				top.$.jBox('get:/jeesite/a/sys/menu/treeselect;JSESSIONID=29c6dc47ff794aa086b874d4089adcb7', {title:'选择菜单', buttons:{'关闭':true}, width:300, height: 350, top:10});
				//if ($("#menuContent").html()==""){$.get("/jeesite/a/sys/menu/treeselect", function(data){$("#menuContent").html(data);});}else{$("#menuContent").toggle(100);}
			});
		}//-->
	</script>

</body>
</html>