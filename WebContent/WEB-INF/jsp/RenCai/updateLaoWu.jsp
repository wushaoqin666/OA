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
<title>劳务合作管理 - Powered By JeeSite</title>
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8" /><meta name="author" content="http://jeesite.com/"/>
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
		<li><a href="laowuList">劳务合作列表</a></li>
		<li class="active"><a href="saved_resource.html">劳务合作修改</a></li>
	</ul><br>
	<form id="inputForm" class="form-horizontal" action="personjobIorU" method="post" novalidate="novalidate">
		<input id="id" name="person_job.id_a" type="hidden" value="${personjob.id_a }">
		














<script type="text/javascript">top.$.jBox.closeTip();</script>
	
		<table class="table table-bordered table-condensed">
			<tbody><tr>
				<td><label class="control-label">客户名称：</label></td>
				<td>
				<select name="person_job.customer.id" class="input-xlarge  select2-offscreen"
					tabindex="-1">
					<c:forEach items="${customerList }" var="customer">
						<option  value="${customer.id }" ${customer.id ==person_job.customer.id ?"selected":"" } >${customer.name }</option>
					</c:forEach>
				</select> 
					
				</td>
				<td><label class="control-label">身份证号：</label></td>
				<td>
					<input id="idcard" name="person_job.idcard" class="input-xlarge required" type="text" value="${personjob.idcard }" maxlength="20">
					<span class="help-inline"><font color="red">*</font> </span>
				</td>
			</tr>
		
			<tr>
				<td><label class="control-label">合作公司：</label></td>
				<td>
				<select name="person_job.tb_companys.id" class="input-xlarge" style="width:270px" >
						<c:forEach items="${tb_companylist }" var="company">
						<option  value="${company.id }" ${customer.id ==need_job.tb_companys.id ?"selected":"" } >${company.name }</option>
					</c:forEach>
					</select>
					
				</td>
				<td>
					<label class="control-label">工作类型：</label>
				</td><td>
					<select name="person_job.jobtype" style="width:280px;"  class="select2-offscreen">
						<option value="0">兼职</option>
						<option value="1">全职</option>
						<option value="2">外派</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><label class="control-label">公司单价：</label></td>
				<td>
					<input id="companyprice" name="person_job.companyprice" class="input-xlarge " type="text" value="${personjob.companyprice }">
				</td>
				<td><label class="control-label">个人单价：</label></td>
				<td>
					<input id="personprice" name="person_job.personprice" class="input-xlarge " type="text" value="${personjob.personprice }">
				</td>
			</tr>
			<tr>
				<td><label class="control-label">开始时间：</label></td>
				<td>
					<input name="person_job.starttime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate " value="${personjob.starttime }" onclick="WdatePicker({dateFmt:&#39;yyyy-MM-dd HH:mm:ss&#39;,isShowClear:false});" style="width:270px;">
				</td>
				<td><label class="control-label">结束时间：</label></td>
				<td>
					<input name="person_job.endtime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate " value="${personjob.endtime }" onclick="WdatePicker({dateFmt:&#39;yyyy-MM-dd HH:mm:ss&#39;,isShowClear:false});" style="width:270px;">
				</td>
			</tr>
			<tr>
				<td><label class="control-label">合同上传：</label></td>
				<td>
					<input id="contracturl" name="person_job.contracturl" maxlength="256" class="input-xlarge" type="hidden" value="${personjob.contracturl }">
					



















<ol id="contracturlPreview"><li style="list-style:none;padding-top:5px;">无</li></ol><a href="javascript:" onclick="contracturlFinderOpen();" class="btn">添加</a>&nbsp;<a href="javascript:" onclick="contracturlDelAll();" class="btn">清除</a>
<script type="text/javascript">
	function contracturlFinderOpen(){//
		var date = new Date(), year = date.getFullYear(), month = (date.getMonth()+1)>9?date.getMonth()+1:"0"+(date.getMonth()+1);
		var url = "/jeesite-master/static/ckfinder/ckfinder.html?type=files&start=files:/company/personJob/"+year+"/"+month+
			"/&action=js&func=contracturlSelectAction&thumbFunc=contracturlThumbSelectAction&cb=contracturlCallback&dts=0&sm=1";
		windowOpen(url,"文件管理",1000,700);
		//top.$.jBox("iframe:"+url+"&pwMf=1", {title: "文件管理", width: 1000, height: 500, buttons:{'关闭': true}});
	}
	function contracturlSelectAction(fileUrl, data, allFiles){
		var url="", files=ckfinderAPI.getSelectedFiles();
		for(var i=0; i<files.length; i++){//
			url += files[i].getUrl();//
			if (i<files.length-1) url+="|";
		}//
		$("#contracturl").val($("#contracturl").val()+($("#contracturl").val(url)==""?url:"|"+url));//
		contracturlPreview();
		//top.$.jBox.close();
	}
	function contracturlThumbSelectAction(fileUrl, data, allFiles){
		var url="", files=ckfinderAPI.getSelectedFiles();
		for(var i=0; i<files.length; i++){
			url += files[i].getThumbnailUrl();
			if (i<files.length-1) url+="|";
		}//
		$("#contracturl").val($("#contracturl").val()+($("#contracturl").val(url)==""?url:"|"+url));//
		contracturlPreview();
		//top.$.jBox.close();
	}
	function contracturlCallback(api){
		ckfinderAPI = api;
	}
	function contracturlDel(obj){
		var url = $(obj).prev().attr("url");
		$("#contracturl").val($("#contracturl").val().replace("|"+url,"","").replace(url+"|","","").replace(url,"",""));
		contracturlPreview();
	}
	function contracturlDelAll(){
		$("#contracturl").val("");
		contracturlPreview();
	}
	function contracturlPreview(){
		var li, urls = $("#contracturl").val().split("|");
		$("#contracturlPreview").children().remove();
		for (var i=0; i<urls.length; i++){
			if (urls[i]!=""){//
				li = "<li><a href=\""+urls[i]+"\" url=\""+urls[i]+"\" target=\"_blank\">"+decodeURIComponent(urls[i].substring(urls[i].lastIndexOf("/")+1))+"</a>";//
				li += "&nbsp;&nbsp;<a href=\"javascript:\" onclick=\"contracturlDel(this);\">×</a></li>";
				$("#contracturlPreview").append(li);
			}
		}
		if ($("#contracturlPreview").text() == ""){
			$("#contracturlPreview").html("<li style='list-style:none;padding-top:5px;'>无</li>");
		}
	}
	contracturlPreview();
</script>
				</td>
				<td><label class="control-label">合作状态：</label></td>
				<td>
					<select name="person_job.status" style="width:280px;"  class="select2-offscreen">
						<option value="0">正常</option>
						<option value="1">停止</option>
						<option value="2">结束</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><label class="control-label">工作内容：</label></td>
				<td colspan="3"><textarea id="jobcontent" name="person_job.jobcontent" maxlength="256" class="input-xxlarge " rows="2">${personjob.jobcontent }</textarea></td>
			</tr>
			<tr>
				<td><label class="control-label">备注信息：</label></td>
				<td colspan="3">
					<textarea id="remark" name="person_job.remark" maxlength="256" class="input-xxlarge " rows="2">${personjob.remark }</textarea>
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
</html>