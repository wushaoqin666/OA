<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>短信模板管理 - Powered By JeeSite</title>
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

<link rel="stylesheet" type="text/css" href="statis/libs/font-awesome.css" />
<link rel="stylesheet" type="text/css" href="statis/css/mystyle.css" />
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
		<li class="active"><a href="duanXinList">短信模板列表</a></li>
		<li><a href="addDuanXin">短信模板添加</a></li>
	</ul>
	<form id="searchForm" class="breadcrumb form-search" action="duanXinList" method="post">
		<input id="pageNo" name="pageNo" type="hidden" value="1">
		<input id="pageSize" name="pageSize" type="hidden" value="10">
		<ul class="ul-form">
			<li><label>模板编码：</label>
				<input id="templateCode" name=subject class="input-medium" type="text" value="${subject }" maxlength="10">
			</li>
			<li><label>主题：</label>
				<input id="subject" name="template_code" class="input-medium" type="text" value="${template_code }" maxlength="256">
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
				<th>模板编码</th>
				<th>主题</th>
				<th>内容</th>
				<th>顺序号</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${duanXinPage.list }" var="duan">
			<tr>
				<td>${duan.id }</td>
				<td>${duan.template_code }</td>
				<td>${duan.subject }</td>
				<td>${duan.content }</td>
				<td>${duan.order_id }</td>
				<td>
    				<a href="upDuanXin?id=${duan.id }">修改</a>
					<a href="delDuanXin?id=${duan.id }" onclick="return confirmx(&#39;确认要删除该短信模板吗？&#39;, this.href)">删除</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<ul class="pager">
        <li>
            <c:if test="${duanXinPage.pageNow==1}">
                <a href="javaScript:void(0)" style="color: #999">首页</a>
            </c:if>
            <c:if test="${duanXinPage.pageNow!=1}">
                <a href="duanXinList?now=1&subject=${subject }&template_code=${template_code}">首页</a>
            </c:if>

        </li>
        <li>
            <c:if test="${duanXinPage.pageNow>1}">
                <a href="duanXinList?now=${duanXinPage.pageNow-1}&subject=${subject }&template_code=${template_code}">上一页</a>
            </c:if>
            <c:if test="${duanXinPage.pageNow<=1 }">
                <a href="javaScript:void(0)" style="color: #999">上一页</a>
            </c:if>
        </li>
        <li><span>当前第${duanXinPage.pageNow}/共${duanXinPage.pageCount}页</span></li>
        <li>
            <c:if test="${duanXinPage.pageNow<duanXinPage.pageCount}">
                <a href="duanXinList?now=${duanXinPage.pageNow+1}&subject=${subject }&template_code=${template_code}">下一页</a>
            </c:if>
            <c:if test="${duanXinPage.pageNow>=duanXinPage.pageCount }">
                <a href="javaScript:void(0)" style="color: #999">下一页</a>
            </c:if>
        </li>
        <li>
            <c:if test="${duanXinPage.pageNow==duanXinPage.pageCount || duanXinPage.pageCount==0}">
                <a href="javaScript:void(0)" style="color: #999">尾页</a>
            </c:if>
            <c:if test="${duanXinPage.pageNow!=duanXinPage.pageCount && duanXinPage.pageCount!=0}">
                <a href="duanXinList?now=${duanXinPage.pageCount}&subject=${subject }&template_code=${template_code}">尾页</a>
            </c:if>
        </li>
    </ul>
<div style="clear:both;"></div>

	<script type="text/javascript">//<!-- 无框架时，左上角显示菜单图标按钮。
		if(!(self.frameElement && self.frameElement.tagName=="IFRAME")){
			$("body").prepend("<i id=\"btnMenu\" class=\"icon-th-list\" style=\"cursor:pointer;float:right;margin:10px;\"></i><div id=\"menuContent\"></div>");
			$("#btnMenu").click(function(){
				top.$.jBox('get:/jeesite/a/sys/menu/treeselect;JSESSIONID=ff9a71c594b14065828ca71d9cf465d6', {title:'选择菜单', buttons:{'关闭':true}, width:300, height: 350, top:10});
				//if ($("#menuContent").html()==""){$.get("/jeesite/a/sys/menu/treeselect", function(data){$("#menuContent").html(data);});}else{$("#menuContent").toggle(100);}
			});
		}//-->
	</script>

</body></html>