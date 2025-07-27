package com.msb.hjycommunity.common.core.controller;

import com.github.pagehelper.PageInfo;
import com.msb.hjycommunity.common.constant.HttpStatus;
import com.msb.hjycommunity.common.core.domain.BaseResponse;
import com.msb.hjycommunity.common.core.page.PageDomain;
import com.msb.hjycommunity.common.core.page.PageResult;
import com.msb.hjycommunity.common.utils.ServletUtils;

import java.util.List;

public class BaseController {
	public static final String PAGE_NUM = "pageNum";
	public static final String PAGE_SIZE = "pageSize";
	
	/**
	 * 分装分页数据
	 */
	public static PageDomain getPageDomain() {
		PageDomain pageDomain = new PageDomain();
		pageDomain.setPageNum(ServletUtils.getParameterToInt(PAGE_NUM));
		pageDomain.setPageSize(ServletUtils.getParameterToInt(PAGE_SIZE));
		return pageDomain;
	}
	
	
	/**
	 * 封装调用PageHelper的startPage方法
	 */
	protected void startPage() {
		PageDomain pageDomain = getPageDomain();
		Integer pageNum = pageDomain.getPageNum();
		Integer pageSize = pageDomain.getPageSize();

		if (pageNum != null && pageSize != null) {
			com.github.pagehelper.PageHelper.startPage(pageNum, pageSize);
		}
	}
	
	/**
	 * 响应分页数据
	 * @param list
	 * @return: com.msb.hjycommunity.common.core.page.PageResult
	 */
	protected PageResult getData(List<?> list) {
		PageResult pageResult = new PageResult();
		pageResult.setCode(HttpStatus.SUCCESS);
		pageResult.setMsg("查询成功");
		pageResult.setRows(list);
		pageResult.setTotal(new PageInfo(list).getTotal());
		return pageResult;
	}
	
	/**
	 * 响应返回结果 （针对增删改 操作）
	 * @param rows  受影响的行数
	 * @return: com.msb.hjycommunity.common.core.domain.BaseResponse
	 */
	protected BaseResponse toAjax(int rows){
		
		return rows > 0 ? BaseResponse.success(rows) : BaseResponse.fail("操作失败");
	}

}
