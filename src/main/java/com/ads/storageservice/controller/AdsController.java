package com.ads.storageservice.controller;

import com.ads.storageservice.dto.GetAdsResponse;
import com.ads.storageservice.dto.model.AdsToSave;
import com.ads.storageservice.storage.StorageService;
import com.ads.storageservice.storage.model.AdsFilter;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/v1/ads")
public class AdsController {

    private final StorageService storageService;


    public AdsController(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping
    public void addNewAds(@RequestBody AdsToSave newAds) {
        storageService.save(newAds);
    }

    @GetMapping
    public GetAdsResponse getAdsByFilter(@RequestParam @Nullable String filter) {
        AdsFilter adsFilter = parseFilterFromQueryParam(filter);
        return new GetAdsResponse(storageService.getAllByFilter(adsFilter));
    }

    private AdsFilter parseFilterFromQueryParam(String queryFilter) {
        AdsFilter adsFilter = new AdsFilter();
        //TODO: add filter parsing
        return adsFilter;
    }

}
