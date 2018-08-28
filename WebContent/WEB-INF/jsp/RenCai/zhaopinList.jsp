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
<title>Insert title here</title>
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
		<li class="active"><a href="zhaopinList">招聘信息列表</a></li>
		<li><a href="updateZhaoPin">招聘信息添加</a></li>
	</ul>
	<form id="searchForm" class="breadcrumb form-search" action="#" method="post">
		<input id="pageNo" name="pageNo" type="hidden" value="1">
		<input id="pageSize" name="pageSize" type="hidden" value="10">
		<ul class="ul-form">
			<li><label>需求名称：</label>
				<input id="jobname" name="jobname" class="input-medium" type="text" value="" maxlength="100">
			</li>
			<li><label>需求职位：</label>
				<input id="jobtype" name="jobtype" class="input-medium" type="text" value="" maxlength="2">
			</li>
			<li><label>所属行业：</label>
				<select name="industry" htmlescape="false" maxlength="2" class="input-xlarge  select2-offscreen" tabindex="-1">
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
			</li>
			<li><label>发布公司：</label>
				<select name="companyid" style="width:180px;" tabindex="-1" class="select2-offscreen">
					<option value="">智递科技</option>
				</select>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"></li>
			<li class="clearfix"></li>
		</ul>
	</form>

<script type="text/javascript">top.$.jBox.closeTip();</script>

	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>编号</th>
				<th>需求名称</th>
				<th>需求职位</th>
				<th>所属行业</th>
				<th>需求人数</th>
				<th>支付方式</th>
				<th>需求单价</th>
				<th>发布公司</th>
				<th>开始日期</th>
				<th>结束日期</th>
				<th>工作地点</th>
				<th>需求状态</th>
				<th>信息类型</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list }" var="u">
			<tr>
				<td><a href="updateZhaoPinunEdit?id=${u.id }">
					${u.id }
				</a></td>
				<td>
					${u.jobname }
				</td>
				<td>
					${u.jobtype }
				</td>
				<td>
					  <c:if test="${u.industry==0}">
	                   软件互联网
	             </c:if>
            	 <c:if test="${u.industry==1 }">
	                    建筑房地产
	             </c:if>
	              <c:if test="${u.industry==2}">
	                    商业服务业
	             </c:if>
	              <c:if test="${u.industry==3}">
	                    金融业
	             </c:if>
	             <c:if test="${u.industry==4}">
	                   贸易批发零售
	             </c:if>
	              <c:if test="${u.industry==5}">
	                    文体教育传媒
	             </c:if>
	              <c:if test="${u.industry==6}">
	                    加工制造
	             </c:if>
	              <c:if test="${u.industry==7}">
	                  农林牧副渔
	             </c:if>
	              <c:if test="${u.industry==8}">
	                    其他
	             </c:if>
	             
				</td>
				<td>
					${u.needperson }
				</td>
				<td>
				  <c:if test="${u.paytype==0}">
	                    月结
	             </c:if>
	               <c:if test="${u.paytype==1}">
	                    日结
	             </c:if>
	               <c:if test="${u.paytype==2}">
	                    其他
	             </c:if>
				</td>
				<td>
				${u.price }
					
				</td>
				<td>
						${u.tb_companys.name }
				</td>
				<td>
				${u.starttime }
				</td>
				<td>
				${u.endtime }
				</td>
				<td>
					${u.address }
				</td>
				<td>
					<c:if test="${u.status==0}">
		                    有效
		             </c:if>
		             <c:if test="${u.status==1}">
		                    无效
		             </c:if>
				</td>
				<td>
					  <c:if test="${u.infotype==0}">
		                   本公司招聘
		             </c:if>
						<c:if test="${u.infotype==1}">
		                   合作公司招聘
		             </c:if>
				</td>
				<td>
    				<a href="updateZhaoPin?id=${u.id }">修改</a>
					<a href="deleterencai?id=${u.id }">删除</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination"><ul>
<li class="disabled"><a href="javascript:">« 上一页</a></li>
<li class="active"><a href="javascript:">1</a></li>
<li class="disabled"><a href="javascript:">下一页 »</a></li>
<li class="disabled controls"><a href="javascript:">当前 <input type="text" value="1" onkeypress="var e=window.event||event;var c=e.keyCode||e.which;if(c==13)page(this.value,10,&#39;&#39;);" onclick="this.select();"> / <input type="text" value="10" onkeypress="var e=window.event||event;var c=e.keyCode||e.which;if(c==13)page(1,this.value,&#39;&#39;);" onclick="this.select();"> 条，共 1 条</a></li>
</ul>
<div style="clear:both;"></div></div>

	<script type="text/javascript">//<!-- 无框架时，左上角显示菜单图标按钮。
		if(!(self.frameElement && self.frameElement.tagName=="IFRAME")){
			$("body").prepend("<i id=\"btnMenu\" class=\"icon-th-list\" style=\"cursor:pointer;float:right;margin:10px;\"></i><div id=\"menuContent\"></div>");
			$("#btnMenu").click(function(){
				top.$.jBox('get:/jeesite/a/sys/menu/treeselect;JSESSIONID=3baf732ded45486a8f110d13601a4c9b', {title:'选择菜单', buttons:{'关闭':true}, width:300, height: 350, top:10});
				//if ($("#menuContent").html()==""){$.get("/jeesite/a/sys/menu/treeselect", function(data){$("#menuContent").html(data);});}else{$("#menuContent").toggle(100);}
			});
		}//-->
	</script>

</body>
</html>