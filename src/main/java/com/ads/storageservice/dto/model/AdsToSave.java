package com.ads.storageservice.dto.model;

import java.util.List;

public class AdsToSave {
    private String sourceId;
    private String description;
    private String city;
    private String region;
    private Double roomNumber;
    private Double square;
    private Integer floor;
    private Boolean furnished;
    private String linkToAds;
    private List<String> linkToImages;
    private String source;

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Double roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Boolean getFurnished() {
        return furnished;
    }

    public void setFurnished(Boolean furnished) {
        this.furnished = furnished;
    }

    public String getLinkToAds() {
        return linkToAds;
    }

    public void setLinkToAds(String linkToAds) {
        this.linkToAds = linkToAds;
    }

    public List<String> getLinkToImages() {
        return linkToImages;
    }

    public void setLinkToImages(List<String> linkToImages) {
        this.linkToImages = linkToImages;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
