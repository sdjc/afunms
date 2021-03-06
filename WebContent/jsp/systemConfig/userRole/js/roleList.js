﻿var grid = null;
var basePath = null;

$(function() {
			basePath = $("#basePath").attr("value");
			$.ligerDefaults.Filter.operators['string'] = $.ligerDefaults.Filter.operators['text'] = [
					"like", "equal", "notequal", "greater", "less", "startwith", "endwith"];
			// grid
			grid = $("#roleGrid").ligerGrid({
				columns : [{
							name : 'roleId',
							hide : true
						}, {
							display : '角色名',
							name : 'role',
							Width : 50
						}],
				pageSize : 30,
				checkbox : true,
				data : listRole(),
				allowHideColumn : false,
				rownumbers : true,
				colDraggable : true,
				rowDraggable : true,
				sortName : 'id',
				width : '99.8%',
				height : '100%',
				heightDiff :-4,
				onReload : function() {
					grid.set({
								data : listRole()
							});
				},
				// 工具栏
				toolbar : {
					items : [{
								text : '高级自定义查询',
								click : sItemclick,
								icon : 'search2'
							}, {
								text : '增加',
								click : itemclick,
								href : basePath + 'jsp/systemConfig/userRole/roleAdd.jsp',
								icon : 'add'
							}, {
								line : true
							}, {
								text : '删除',
								click : itemclick,
								icon : 'delete'
							}]
				},
				// 双击
				onDblClickRow : function(data, rowindex, rowobj) {
					openDlgWindow(basePath + "jsp/systemConfig/userRole/roleEdit.jsp?id="
									+ data.roleId, 240, 400, "角色修改");
				}
			});
		});

function sItemclick() {
	grid.options.data = $.extend(true, {}, listRole());
	grid.showFilter();
}

// 打开新的窗口方法
function openWindows(href, h, w, t) {
	var win = $.ligerDialog.open({
				title : t,
				height : h,
				url : href,
				width : w,
				showMax : true,
				showToggle : true,
				showMin : true,
				isResize : true,
				slide : false
			});
}
function itemclick(item) {
	if (item.text == "增加") {
		openDlgWindow(item.href, 240, 400, item.text + "角色");
	} else if (item.text == "删除") {
		var rows = grid.getSelectedRows();
		var idString = "";
		if (rows.length == 0) {
			$.ligerDialog.error("请选择删除项");
		} else {
			$(rows).each(function() {
						idString += this.roleId + ";";
					});
			$.ligerDialog.success(f_deleteNodes(idString));
		}
	}
}

function f_deleteNodes(string) {
	var rs = "删除错误";
	$.ajax({
				type : "POST",
				async : false,
				url : basePath + "userAjaxManager.ajax?action=deleteRole",
				// 参数
				data : {
					string : string
				},
				dataType : "text",
				success : function(array) {
					// 成功删除则更新表格行
					grid.deleteSelectedRow();
					rs = array;
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert(errorThrown);
				}
			});
	return rs;
}

function listRole() {
	var rs = null;
	$.ajax({
				type : "POST",
				async : false,
				url : basePath + "userAjaxManager.ajax?action=getRole",
				dataType : "json",
				success : function(array) {
					rs = array;
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert(errorThrown);
				}
			});
	return rs;
}
// 刷新列表
function refresh() {
	grid.set({
				data : listRole()
			});
}
