package com.msb.hjycommunity.community.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.msb.hjycommunity.common.core.domain.BaseEntity;

import java.io.Serializable;

public class HjyCommunityDto extends BaseEntity  {
    private static final long serialVersionUID = 9081434972727076983L;
    /** 小区id */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long communityId;

    /** 小区名称 */
    private String communityName;

    /** 小区编码 */
    private String communityCode;

    /** 省区划码 */
    private String communityProvinceCode;

    /** 市区划码 */
    private String communityCityCode;

    /** 区县区划码 */
    private String communityTownCode;


    /** 详细地址 */
    private String communityDetailedAddress;

    /** 经度 */
    private String communityLongitude;

    /** 纬度 */
    private String communityLatitude;

    /** 物业id */
    private Long deptId;

    /** 排序 */
    private Long communitySort;

    private String communityProvenceName;

    private String communityCityName;

    private String communityTownName;

    public String getCommunityProvenceName() {
        return communityProvenceName;
    }

    public void setCommunityProvenceName(String communityProvenceName) {
        this.communityProvenceName = communityProvenceName;
    }

    public String getCommunityCityName() {
        return communityCityName;
    }

    public void setCommunityCityName(String communityCityName) {
        this.communityCityName = communityCityName;
    }

    public String getCommunityTownName() {
        return communityTownName;
    }

    public void setCommunityTownName(String communityTownName) {
        this.communityTownName = communityTownName;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode;
    }

    public String getCommunityProvinceCode() {
        return communityProvinceCode;
    }

    public void setCommunityProvinceCode(String communityProvinceCode) {
        this.communityProvinceCode = communityProvinceCode;
    }

    public String getCommunityCityCode() {
        return communityCityCode;
    }

    public void setCommunityCityCode(String communityCityCode) {
        this.communityCityCode = communityCityCode;
    }

    public String getCommunityTownCode() {
        return communityTownCode;
    }

    public void setCommunityTownCode(String communityTownCode) {
        this.communityTownCode = communityTownCode;
    }

    public String getCommunityDetailedAddress() {
        return communityDetailedAddress;
    }

    public void setCommunityDetailedAddress(String communityDetailedAddress) {
        this.communityDetailedAddress = communityDetailedAddress;
    }

    public String getCommunityLongitude() {
        return communityLongitude;
    }

    public void setCommunityLongitude(String communityLongitude) {
        this.communityLongitude = communityLongitude;
    }

    public String getCommunityLatitude() {
        return communityLatitude;
    }

    public void setCommunityLatitude(String communityLatitude) {
        this.communityLatitude = communityLatitude;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getCommunitySort() {
        return communitySort;
    }

    public void setCommunitySort(Long communitySort) {
        this.communitySort = communitySort;
    }
}
