package com.msb.hjycommunity.system.service;

import com.msb.hjycommunity.system.domain.dto.SysAreaDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SysAreaService {
	/**
	 * 获取区域数据的完整树
	 * @return: java.util.List<com.msb.hjycommunity.system.domain.dto.SysAreaDto>
	 */
	List<SysAreaDto> findAreaAsTree();
}
