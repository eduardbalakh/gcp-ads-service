package com.ads.storageservice.dto;

import com.ads.storageservice.dto.model.AdsToPresent;

import java.util.List;

public class GetAdsResponse extends BaseResponse<AdsToPresent> {

    public GetAdsResponse(List<AdsToPresent> resultList) {
        this.result = resultList;
        this.totalCount = resultList.size();
    }

}
