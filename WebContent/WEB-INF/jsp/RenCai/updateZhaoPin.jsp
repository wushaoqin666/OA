<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>招聘信息管理 - Powered By JeeSite</title>
	<meta name="renderer" content="webkit"><meta http-equiv="X-UA-Compatible" content="IE=8,IE=9,IE=10" />
<meta http-equiv="Expires" content="0"><meta http-equiv="Cache-Control" content="no-cache"><meta http-equiv="Cache-Control" content="no-store">
<script src="static/jquery/jquery-1.8.3.min.js" type="text/javascript"></script>
<link href="static/bootstrap/2.3.1/css_cerulean/bootstrap.min.css" type="text/css" rel="stylesheet" />
<script src="static/bootstrap/2.3.1/js/bootstrap.min.js" type="text/javascript"></script>
<link href="static/bootstrap/2.3.1/awesome/font-awesome.min.css" type="text/css" rel="stylesheet" />
<!--[if lte IE 7]><link href="static/bootstrap/2.3.1/awesome/font-awesome-ie7.min.css" type="text/css" rel="stylesheet" /><![endif]-->
<!--[if lte IE 6]><link href="static/bootstrap/bsie/css/bootstrap-ie6.min.css" type="text/css" rel="stylesheet" />
<script src="static/bootstrap/bsie/js/bootstrap-ie.min.js" type="text/javascript"></script><![endif]-->
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
<script type="text/javascript">var ctx = '../a', ctxStatic='static';</script>
	<!-- Baidu tongji analytics --><script>var _hmt=_hmt||[];(function(){var hm=document.createElement("script");hm.src="//hm.baidu.com/hm.js?82116c626a8d504a5c0675073362ef6f";var s=document.getElementsByTagName("script")[0];s.parentNode.insertBefore(hm,s);})();</script>
	
	
	<meta name="decorator" content="default">
	<script type="text/javascript">
		$(document).ready(function() {
			//$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
			
	<ul class="nav nav-tabs">
		<li><a href="zhaopinList">招聘信息列表</a></li>
		<li class="active"><a href="saved_resource.html">招聘信息修改</a></li>
	</ul><br>
	<form id="inputForm" class="form-horizontal" action="updatezpxx" method="post" novalidate="novalidate">
		<input id="id" name="need_job.id" type="hidden" value="${tb_need.id }">
		

<script type="text/javascript">top.$.jBox.closeTip();</script>
	
		
		<table class="table table-bordered table-condensed">
			<tbody><tr>
				<td><label class="control-label">需求名称：</label></td>
				<td>
					<input id="jobname" name="need_job.jobname" class="input-xlarge required" type="text" value="${tb_need.jobname }" maxlength="100">
					<span class="help-inline"><font color="red">*</font> </span>
				</td>
				<td><label class="control-label">需求职位：</label></td>
				<td><input id="jobtype" name="need_job.jobtype" class="input-xlarge " type="text" value="${tb_need.jobtype }" maxlength="100">
				</td>
			</tr>
		
			<tr>
				<td><label class="control-label">所属行业：</label></td>
				<td>
					<select name="need_job.industry" htmlescape="false" maxlength="2" class="input-xlarge">
						<option value="0">软件互联网</option>
						<option value="1">建筑房地产</option>
						<option value="2">商业服务业</option>
						<option value="3">金融业</option>
						<option value="4">贸易批发零售</option>
						<option value="5">文体教育传媒</option>
						<option value="6">加工制造</option>
						<option value="7">农林牧副渔</option>
						<option value="8">其他</option>
					</select>
				</td>
				<td>
					<label class="control-label">发布公司：</label>
				</td><td>
					<select name="need_job.tb_companys.id" class="input-xlarge" style="width:270px" >
						<c:forEach items="${tb_companylist }" var="company">
						<option  value="${company.id }" ${customer.id ==need_job.tb_companys.id ?"selected":"" } >${company.name }</option>
					</c:forEach>
					</select>
				</td>
				
			</tr>
			<tr>
				<td><label class="control-label">需求人数：</label></td>
				<td><input id="needperson" name="need_job.needperson" class="input-xlarge " type="text" value="${tb_need.needperson }" maxlength="11"></td>
				<td><label class="control-label">结算方式：</label></td>
				<td>
					<select name="need_job.paytype" class="input-xlarge" style="width:270px" >
						<option value="0">月结</option>
						<option value="1">日结</option>
						<option value="2">其他</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><label class="control-label">需求单价：</label></td>
				<td><input id="price" name="need_job.price" class="input-xlarge " type="text" value="${tb_need.needperson }"></td>
				<td><label class="control-label">工作地点：</label></td>
				<td><input id="address" name="need_job.address" class="input-xlarge " type="text" value="${tb_need.address }" maxlength="2"></td>
			</tr>
			<tr>
				<td><label class="control-label">开始日期：</label></td>
				<td>
					<input name="need_job.starttime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate " value="${tb_need.starttime }" onclick="WdatePicker({dateFmt:&#39;yyyy-MM-dd HH:mm:ss&#39;,isShowClear:false});">
				</td>
				<td><label class="control-label">结束日期</label></td>
				<td><input name="need_job.endtime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate " value="${tb_need.endtime }" onclick="WdatePicker({dateFmt:&#39;yyyy-MM-dd HH:mm:ss&#39;,isShowClear:false});"></td>
			</tr>
						
			<tr>
				<td><label class="control-label">信息类型：</label></td>
				<td>
					<select name="need_job.infotype" style="width:270px;" class="select2-offscreen">
						<option value="1">合作公司招聘</option>
						<option value="0">本公司招聘</option>
					</select>
				</td>
				<td><label class="control-label">需求状态：</label></td>
				<td>
					<select name="need_job.status" style="width:270px;" class="select2-offscreen">
						<option value="0">有效</option>
						<option value="1">无效</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td><label class="control-label">需求详细：</label></td>
				<td>

					<textarea id="jobcontent" name="need_job.jobcontent" class="input-xlarge " rows="4" cols="30">${tb_need.jobcontent }</textarea>
				</td>
				<td><label class="control-label">备注信息：</label></td>
				<td>

					<textarea id="remark" name="need_job.remark" class="input-xlarge " rows="4" cols="30">${tb_need.remark }</textarea>
				</td>
			</tr>
		</tbody></table>		
		
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存">&nbsp;
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)">
		</div>
	</form>

	<script type="text/javascript">//<!-- 无框架时，左上角显示菜单图标按钮。
		if(!(self.frameElement && self.frameElement.tagName=="IFRAME")){
			$("body").prepend("<i id=\"btnMenu\" class=\"icon-th-list\" style=\"cursor:pointer;float:right;margin:10px;\"></i><div id=\"menuContent\"></div>");
			$("#btnMenu").click(function(){
				top.$.jBox('get:/jeesite-master/a/sys/menu/treeselect;JSESSIONID=b30d2fa0f4264f6288e0788088ab4b22', {title:'选择菜单', buttons:{'关闭':true}, width:300, height: 350, top:10});
				//if ($("#menuContent").html()==""){$.get("/jeesite-master/a/sys/menu/treeselect", function(data){$("#menuContent").html(data);});}else{$("#menuContent").toggle(100);}
			});
		}//-->
	</script>

</body>
</body>
</html>