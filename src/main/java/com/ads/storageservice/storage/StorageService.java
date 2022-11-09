package com.ads.storageservice.storage;

import com.ads.storageservice.dto.model.AdsToPresent;
import com.ads.storageservice.dto.model.AdsToSave;
import com.ads.storageservice.storage.model.AdsFilter;

import java.util.List;

public interface StorageService {

    void save(AdsToSave newAds);
    void saveAll(List<AdsToSave> newAds);
    List<AdsToPresent> getAll();
    List<AdsToPresent> getAllByFilter(AdsFilter filter);
    AdsToPresent getFirstByFilter(AdsFilter filter);

}
