package com.ads.storageservice.dto;

import java.util.List;

public class BaseResponse<T> {

    protected List<T> result;

    protected Integer totalCount;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getObjectList() {
        return result;
    }

    public void setObjectList(List<T> objectList) {
        this.result = objectList;
    }
}
