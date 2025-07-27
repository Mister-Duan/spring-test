package com.msb.hjycommunity.system.mapper;

import com.msb.hjycommunity.system.domain.SysArea;

import java.util.List;

public interface SysAreaMapper {
	/**
	 * 查询所有地区
	 * @return List<SysArea>
	 */
	List<SysArea> findAll();
}
