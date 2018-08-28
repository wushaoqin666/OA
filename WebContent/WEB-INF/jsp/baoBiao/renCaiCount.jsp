<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人才外包费用统计 - Powered By JeeSite</title>
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
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>

</head>
<body>
	
	<ul class="nav nav-tabs">
		<li class="active"><a href="saved_resource.html">人才外包费用统计</a></li>

	</ul>
	<form id="searchForm" class="breadcrumb form-search" action="#" method="post">
		<input id="pageNo" name="pageNo" type="hidden" value="">
		<input id="pageSize" name="pageSize" type="hidden" value="">
		<ul class="ul-form">
			<li><label>客户名称：</label>
				<input type="text" name="name" htmlescape="false" maxlength="50" class="input-medium" style="width:150px">
			</li>
			<li><label>身份证号：</label>
				<input type="text" name="idcard" htmlescape="false" maxlength="20" class="input-medium" style="width:150px">
			</li>
			<li><label>手机号码：</label>
				<input type="text" name="sdcard" htmlescape="false" maxlength="50" class="input-medium" style="width:100px">
			</li>
			<li><label>合作公司：</label>
				<select name="companyId" style="width:150px" tabindex="-1" class="select2-offscreen">
					<option value=""></option>
					<option value="">智递科技有限公司</option>
				</select>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="统计"></li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="导出"></li>
			<li class="clearfix"></li>
		</ul>
	</form>
	














<script type="text/javascript">top.$.jBox.closeTip();</script>

	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>客户名称</th>
				<th>身份证号</th>
				<th>手机号码</th>
				<th>合作公司</th>
				<th>合作月数</th>
				<th>公司付款总额</th>
				<th>支付员工总额</th>
				<th>利润总额</th>
				<th>状态</th>
			</tr>
		</thead>
		<tbody>

			<tr>
				<td>
					智递哥
				</td>
				<td>
					412724180000001511
				</td>
				<td>
					15800008888
				</td>
				<td>
					智递科技
				</td>
				<td>
					18
				</td>
				<td>
					200000
				</td>
				<td>
					150000
				</td>
				<td>
					50000
				</td>
				<td>
					合作结束
				</td>
			</tr>
			<tr>
				<td>
					智递2哥
				</td>
				<td>
					412724180000001511
				</td>
				<td>
					15800008888
				</td>
				<td>
					智递科技
				</td>
				<td>
					18
				</td>
				<td>
					200000
				</td>
				<td>
					150000
				</td>
				<td>
					50000
				</td>
				<td>
					正在合作
				</td>
			</tr>

		</tbody>
	</table>
	<div class="pagination"></div>

	<script type="text/javascript">//<!-- 无框架时，左上角显示菜单图标按钮。
		if(!(self.frameElement && self.frameElement.tagName=="IFRAME")){
			$("body").prepend("<i id=\"btnMenu\" class=\"icon-th-list\" style=\"cursor:pointer;float:right;margin:10px;\"></i><div id=\"menuContent\"></div>");
			$("#btnMenu").click(function(){
				top.$.jBox('get:/jeesite/a/sys/menu/treeselect;JSESSIONID=3baf732ded45486a8f110d13601a4c9b', {title:'选择菜单', buttons:{'关闭':true}, width:300, height: 350, top:10});
				//if ($("#menuContent").html()==""){$.get("/jeesite/a/sys/menu/treeselect", function(data){$("#menuContent").html(data);});}else{$("#menuContent").toggle(100);}
			});
		}//-->
	</script>

</body></html>