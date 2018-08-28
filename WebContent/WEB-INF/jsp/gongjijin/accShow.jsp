<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="overflow: hidden;"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公积金管理 - Powered By JeeSite</title>
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8" /><meta name="author" content="http://jeesite.com/"/>
<meta name="renderer" content="webkit"><meta http-equiv="X-UA-Compatible" content="IE=8,IE=9,IE=10" />
<meta http-equiv="Expires" content="0"><meta http-equiv="Cache-Control" content="no-cache"><meta http-equiv="Cache-Control" content="no-store">
<script src="./static/jquery/jquery-1.8.3.min.js" type="text/javascript"></script>
<link href="./static/bootstrap/2.3.1/css_cerulean/bootstrap.min.css" type="text/css" rel="stylesheet" />
<script src="./static/bootstrap/2.3.1/js/bootstrap.min.js" type="text/javascript"></script>
<link href="./static/bootstrap/2.3.1/awesome/font-awesome.min.css" type="text/css" rel="stylesheet" />
<!--[if lte IE 7]><link href="./static/bootstrap/2.3.1/awesome/font-awesome-ie7.min.css" type="text/css" rel="stylesheet" /><![endif]-->
<!--[if lte IE 6]><link href="./static/bootstrap/bsie/css/bootstrap-ie6.min.css" type="text/css" rel="stylesheet" />
<script src="./static/bootstrap/bsie/js/bootstrap-ie.min.js" type="text/javascript"></script><![endif]-->
<link href="./static/jquery-select2/3.4/select2.min.css" rel="stylesheet" />
<script src="./static/jquery-select2/3.4/select2.min.js" type="text/javascript"></script>
<link href="./static/jquery-validation/1.11.0/jquery.validate.min.css" type="text/css" rel="stylesheet" />
<script src="./static/jquery-validation/1.11.0/jquery.validate.min.js" type="text/javascript"></script>
<link href="./static/jquery-jbox/2.3/Skins/Bootstrap/jbox.min.css" rel="stylesheet" />
<script src="./static/jquery-jbox/2.3/jquery.jBox-2.3.min.js" type="text/javascript"></script>
<script src="./static/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
<script src="./static/common/mustache.min.js" type="text/javascript"></script>
<link href="./static/common/jeesite.css" type="text/css" rel="stylesheet" />
<script src="./static/common/jeesite.js" type="text/javascript"></script>
<script type="text/javascript">var ctx = '../a', ctxStatic='./static';</script>
<!-- Baidu tongji analytics -->
<script>var _hmt=_hmt||[];(function(){var hm=document.createElement("script");hm.src="//hm.baidu.com/hm.js?82116c626a8d504a5c0675073362ef6f";var s=document.getElementsByTagName("script")[0];s.parentNode.insertBefore(hm,s);})();</script>
<meta name="decorator" content="default">
<script type="text/javascript">
	/* $("#deletegjj").click(function(){
		var id = $(this).parents("tr").find("td:eq(0)").find("a").html();
		var flag = confirm("确定要删除该信息吗?")
		if(flag){
			$(this).parents("tr").empty();
			$.ajax({
				url : "deleteById",
				type : "post",
				data : {
					"id"  : aid
			},
			success : function(data){
				confirm("删除成功!");
			}
			});
		}else{
			alert("已取消删除!");
			return false;
		}
	});  */
	$(function(){
		//1. 点击 删除 时, 弹出 确定是要删除 xx 的信息吗 ? 若确定, 执行删除, 若不确定, 则取消
		$(".deletegjj").click(function(){
			var flag = confirm("确定要删除该信息吗?");
			if(flag){
			//删除，使用ajax的方式
			var url = this.href;
			$.post(url,function(data){
				//若 data 的返回值为 1, 则提示 删除成功, 且把当前行删除
				if(data == ""){
					alert("删除成功");
					$tr.remove();
				}else{
					//若 data 的返回值不是 1, 提示删除失败. 
					alert("删除失败!");
					}
				});
			}
			//取消超链接的默认行为
			return false;
		})
	});
</script>
</head>
<body>

	<ul class="nav nav-tabs">
		<li class="active"><a href="javaScript:void(0)">公积金列表</a></li>
		<li><a href="customerList">公积金缴费</a></li>
	</ul>
	<form id="searchForm" class="breadcrumb form-search" action="selectAll"
		method="post">
		<input id="pageNo" name="pageNo" type="hidden" value="1"> <input
			id="pageSize" name="pageSize" type="hidden" value="10">
		<ul class="ul-form">
			<li><label>身份证号：</label> <input id="idCard" name="idCard"
				class="input-medium" type="text" value="" maxlength="20"></li>
			<li><label>公积金号：</label> <input id="accountNo" name="accountNo"
				class="input-medium" type="text" value="" maxlength="20"></li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary"
				type="submit" value="查询"></li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary"
				type="submit" value="模板下载"></li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary"
				type="submit" value="导入"></li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary"
				type="submit" value="导出"></li>
			<li class="clearfix"></li>
		</ul>
	</form>

	<script type="text/javascript">top.$.jBox.closeTip();</script>

	<table id="contentTable"
		class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>编号</th>
				<th>客户名称</th>
				<th>身份证号</th>
				<th>公积金号</th>
				<th>缴费期间</th>
				<th>缴费金额</th>
				<th>代理费用</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${pagetb_accList.list }" var="acc">
				<tr>
					<td><a href="#"> ${acc.id } </a></td>
					<td>${acc.customer.name }</td>
					<td>${acc.idCard }</td>
					<td>${acc.accountNo }</td>
					<td>${acc.payDate }</td>
					<td>${acc.payMoney }</td>
					<td>${acc.proxyFee }</td>
					<td>${acc.status.equals("0")?"已缴":"未缴费" }</td>
					<td><a href="showAvalue?aid=${acc.id }">修改</a>|
					<a href="deleteById?aid=${acc.id }" class="deletegjj">删除</a>
						</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

		<ul class="pager">
			<li>
			<c:if test="${pagetb_accList.pageNow==1 }">
				<a href = "javaScript:void(0)" style="color: #999">首页</a>
			</c:if>
			<c:if test="${pagetb_accList.pageNow!=1 }">
				<a href= "selectAll?now=1">首页</a>
			</c:if>
			</li>
			<li>
				<c:if test="${pagetb_accList.pageNow>1 }">
					<a href= "selectAll?now=${pagetb_accList.pageNow-1 }">上一页</a>
				</c:if>
				<c:if test="${pagetb_accList.pageNow<=1 }">
					<a href="javaScript:void(0)" style="color: #999">上一页</a>
				</c:if>
			</li>
			<li>
				<span>当前第${pagetb_accList.pageNow }/共${pagetb_accList.pageCount }页</span>
			</li>
			<li>
				<c:if test="${pagetb_accList.pageNow < pagetb_accList.pageCount }">
					<a href="selectAll?now=${pagetb_accList.pageNow+1 }">下一页</a>
				</c:if>
				<c:if test="${pagetb_accList.pageNow>=pagetb_accList.pageCount }">
					 <a href="javaScript:void(0)" style="color: #999">下一页</a>
				</c:if>
			</li>
			<li>
				<c:if test="${pagetb_accList.pageNow==pagetb_accList.pageCount || pagetb_accList.pageCount==0 }">
					<a href="javaScript:void(0)" style="color: #999">尾页</a>
				</c:if>
				<c:if test="${pagetb_accList.pageNow!=pagetb_accList.pageCount && pagetb_accList.pageCount!=0 }">
					<a href="selectAll?now=${pagetb_accList.pageCount }">尾页</a>
				</c:if>
			</li>
		</ul>
		<div style="clear: both;"></div>


	<script type="text/javascript">
		//<!-- 无框架时，左上角显示菜单图标按钮。
		if(!(self.frameElement && self.frameElement.tagName=="IFRAME")){
			$("body").prepend("<i id=\"btnMenu\" class=\"icon-th-list\" style=\"cursor:pointer;float:right;margin:10px;\"></i><div id=\"menuContent\"></div>");
			$("#btnMenu").click(function(){
				top.$.jBox('get:/jeesite/a/sys/menu/treeselect;JSESSIONID=3baf732ded45486a8f110d13601a4c9b', {title:'选择菜单', buttons:{'关闭':true}, width:300, height: 350, top:10});
				//if ($("#menuContent").html()==""){$.get("/jeesite/a/sys/menu/treeselect", function(data){$("#menuContent").html(data);});}else{$("#menuContent").toggle(100);}
			});
		}
	</script>

</body>
</html>