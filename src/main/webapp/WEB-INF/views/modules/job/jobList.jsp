<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>工作管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);sex
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/job/job/">工作列表</a></li>
		<shiro:hasPermission name="job:job:edit"><li><a href="${ctx}/job/job/form">工作添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="job" action="${ctx}/job/job/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>标题：</label>
				<form:input path="title" htmlEscape="false" maxlength="128" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>ID</th>
				<th>标题</th>
				<th>兼职类型</th>
				<th>报名开始时间</th>
				<th>报名结束时间</th>
				<th>工作开始时间</th>
				<th>工作结束时间</th>
				<th>创建时间</th>
				<th>状态</th>
				<shiro:hasPermission name="job:job:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="job">
			<tr>
				<td>${job.id}</td>
				<td><a href="${ctx}/job/job/form?id=${job.id}">${job.title}</a></td>
				<td>${job.type}</td>
				<td><fmt:formatDate value="${job.enrollBeginDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><fmt:formatDate value="${job.enrollEndDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><fmt:formatDate value="${job.jobBeginDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><fmt:formatDate value="${job.jobEndDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><fmt:formatDate value="${job.createDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td>${job.status}</td>
				<shiro:hasPermission name="job:job:edit"><td>
    				<a href="${ctx}/job/job/form?id=${job.id}">修改</a>
					<a href="">查看</a>
					<a href="${ctx}/job/job/delete?id=${job.id}" onclick="return confirmx('确认要删除该工作吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>