package com.msb.hjycommunity.web.controller.community;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msb.hjycommunity.common.constant.HttpStatus;
import com.msb.hjycommunity.common.core.controller.BaseController;
import com.msb.hjycommunity.common.core.domain.BaseResponse;
import com.msb.hjycommunity.common.core.page.PageResult;
import com.msb.hjycommunity.common.utils.ServletUtils;
import com.msb.hjycommunity.community.domain.HjyCommunity;
import com.msb.hjycommunity.community.domain.dto.HjyCommunityDto;
import com.msb.hjycommunity.community.service.HjyCommunityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/community")
public class HjyCommunityController extends BaseController {
    @Resource
    private HjyCommunityService hjyCommunityService;
    @GetMapping("/list")
    public PageResult list(HjyCommunity hjyCommunity){
        //        Integer pageNum = ServletUtils.getParameterToInt("pageNum");
        //        Integer pageSize = ServletUtils.getParameterToInt("pageSize");
        //        //使用PageHelper
        //        PageHelper.startPage(pageNum, pageSize);
        startPage();
        List<HjyCommunityDto> list = hjyCommunityService.queryList(hjyCommunity);
        PageInfo<HjyCommunityDto> pageInfo = new PageInfo<>(list);
        //
        //        //封装数据
        //        PageResult pageResult = new PageResult();
        //
        //        pageResult.setCode(HttpStatus.SUCCESS);
        //        pageResult.setMsg("查询成功");
        //        pageResult.setRows(list);
        //        pageResult.setTotal(pageInfo.getTotal());
        //响应数据
        return   getData(list);
    }
    
    @PostMapping
    public BaseResponse add(@RequestBody HjyCommunity hjyCommunity) {
        return toAjax(hjyCommunityService.insertHjyCommunity(hjyCommunity));
    }
    @GetMapping("/{communityId}")
    public BaseResponse getInfo(@PathVariable("communityId") Long communityId) {
        return BaseResponse.success(hjyCommunityService.selectHjyCommunityById(communityId));
    }
    
    @PutMapping
    public BaseResponse edit(@RequestBody HjyCommunity hjyCommunity) {
        return toAjax(hjyCommunityService.updateHjyCommunity(hjyCommunity));
    }
    
    @DeleteMapping("/{communityIds}")
    public BaseResponse delete(@PathVariable("communityIds") Long[] communityIds) {
        return toAjax(hjyCommunityService.deleteHjyCommunity(communityIds));
    }
    
}