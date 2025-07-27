package com.msb.hjycommunity.system.service.impl;

import com.msb.hjycommunity.system.domain.SysArea;
import com.msb.hjycommunity.system.domain.dto.SysAreaDto;
import com.msb.hjycommunity.system.mapper.SysAreaMapper;
import com.msb.hjycommunity.system.service.SysAreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class SysAreaServiceImpl  implements SysAreaService {
	@Resource
	SysAreaMapper sysAreaMapper;
	@Override
	public List<SysAreaDto> findAreaAsTree() {
		List<SysArea> list=sysAreaMapper.findAll();
		if(list!=null && !list.isEmpty()){
			return list.stream()
					.filter(area -> area.getParentCode().equals(0))
					.map(area -> {
						SysAreaDto sysAreaDto = new SysAreaDto();
						sysAreaDto.setCode(area.getCode());
						sysAreaDto.setName(area.getName());
						sysAreaDto.setChildren(getAreaChildren(sysAreaDto, list));
						return sysAreaDto;
					}).collect(Collectors.toList());
			
		}
		return null;
	}
	private List<SysAreaDto> getAreaChildren(SysAreaDto parent, List<SysArea> list) {
		return list.stream()
				.filter(area -> area.getParentCode().equals(parent.getCode()))
				.map(area -> {
					SysAreaDto sysAreaDto = new SysAreaDto();
					sysAreaDto.setCode(area.getCode());
					sysAreaDto.setName(area.getName());
					sysAreaDto.setChildren(getAreaChildren(sysAreaDto, list));
					return sysAreaDto;
				}).collect(Collectors.toList());
	}
	
}
