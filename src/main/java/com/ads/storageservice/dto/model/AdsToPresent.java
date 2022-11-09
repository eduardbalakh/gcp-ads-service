package com.ads.storageservice.dto.model;

public class AdsToPresent extends AdsToSave {

    private String id;

    public AdsToPresent(AdsToSave adsToSave, String id) {
        this.id = id;
        this.setCity(adsToSave.getCity());
        this.setDescription(adsToSave.getDescription());
        this.setFloor(adsToSave.getFloor());
        this.setLinkToAds(adsToSave.getLinkToAds());
        this.setFurnished(adsToSave.getFurnished());
        this.setRegion(adsToSave.getRegion());
        this.setRoomNumber(adsToSave.getRoomNumber());
        this.setSquare(adsToSave.getSquare());
        this.setSource(adsToSave.getSource());
        this.setSourceId(adsToSave.getSourceId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
