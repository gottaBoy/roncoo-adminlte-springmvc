<#include "/macro/base.ftl" /> 
	<!-- Main content -->
	<div class="row">
		<div class="col-md-12">
			<div class="box box-primary" >
				<div class="box-header with-border">
					<h3 class="box-title">数据字典明细表</h3>
					<div class="box-tools pull-right">
						<!-- Button trigger modal -->
						<button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal">添加</button>
					</div>
				</div>
				<div class="box-body">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th>序号</th>
								<th>关键词</th>
								<th>默认值</th>
								<th>排序</th>
								<th>备注</th>
								<th>创建时间</th>
								<th style="width: 20%">操作</th>
							</tr>
						</thead>
						<tbody>
							<#list page.list as data>
								<tr>
									<th>${data_index+1}</th>
									<th>${data.fieldKey}</th>
									<th>${data.fieldValue}</th>
									<td>${data.sort}</td>
									<td>${data.remark}</td>
									<td>${data.createTime?string('yyyy-MM-dd HH:mm:ss')}</td>
									<td>
										<a class="btn btn-primary btn-xs"  target="modal" modal="lg"   href="${ctx}/admin/dataDictionaryList/view?id=${data.id}">查看</a>
										<a class="btn btn-info btn-xs" target="modal" modal="lg"  href="${ctx}/admin/dataDictionaryList/edit?id=${data.id}&dId=${id}">修改</a>
										<a class="btn btn-danger btn-xs"   data-body="确认要删除吗？" target="ajaxTodo"  href ="${ctx}/admin/dataDictionaryList/delete?id=${data.id}&dId=${id}&fieldCode=${data.fieldCode}">删除</a>
									</td>
								</tr>
							</#list>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	
<#include "add.ftl" />
