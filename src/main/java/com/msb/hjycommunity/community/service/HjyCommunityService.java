package com.msb.hjycommunity.community.service;

import com.msb.hjycommunity.community.domain.HjyCommunity;
import com.msb.hjycommunity.community.domain.dto.HjyCommunityDto;

import java.util.List;

public interface HjyCommunityService {
    List<HjyCommunityDto> queryList(HjyCommunity hjyCommunity);
    
    int insertHjyCommunity(HjyCommunity hjyCommunity);
    
    HjyCommunity selectHjyCommunityById(Long communityId);
    
    int updateHjyCommunity(HjyCommunity hjyCommunity);
    
    int deleteHjyCommunity(Long[] communityIds);
    
//    List<HjyCommunityDto> queryPullDown(HjyCommunity hjyCommunity);
}

