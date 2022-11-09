package com.ads.storageservice.storage;

import com.ads.storageservice.dto.model.AdsToPresent;
import com.ads.storageservice.dto.model.AdsToSave;
import com.ads.storageservice.storage.model.AdsFilter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BigQueryStorageService implements StorageService {

    List<AdsToPresent> adsList = new ArrayList<>();

    @Override
    public void save(AdsToSave newAds) {
        adsList.add(new AdsToPresent(newAds, String.valueOf(adsList.size() + 1)));
    }

    @Override
    public void saveAll(List<AdsToSave> newAdsList) {
        newAdsList.forEach(this::save);
    }

    @Override
    public List<AdsToPresent> getAll() {
        return adsList;
    }

    @Override
    public List<AdsToPresent> getAllByFilter(AdsFilter filter) {
        return adsList;
    }

    @Override
    public AdsToPresent getFirstByFilter(AdsFilter filter) {
        return adsList.get(0);
    }
}
