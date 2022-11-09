package com.ads.storageservice.storage.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AdsFilter {

    private BigDecimal minPrice;
    private BigDecimal maxPrice;
    private String Location;
    private Double minSquare;
    private Double maxSquare;
    private Integer minRoomNumber;
    private Integer maxRoomNumber;
    private LocalDateTime minPublicationTime;
    private LocalDateTime maxPublicationTime;

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Double getMinSquare() {
        return minSquare;
    }

    public void setMinSquare(Double minSquare) {
        this.minSquare = minSquare;
    }

    public Double getMaxSquare() {
        return maxSquare;
    }

    public void setMaxSquare(Double maxSquare) {
        this.maxSquare = maxSquare;
    }

    public Integer getMinRoomNumber() {
        return minRoomNumber;
    }

    public void setMinRoomNumber(Integer minRoomNumber) {
        this.minRoomNumber = minRoomNumber;
    }

    public Integer getMaxRoomNumber() {
        return maxRoomNumber;
    }

    public void setMaxRoomNumber(Integer maxRoomNumber) {
        this.maxRoomNumber = maxRoomNumber;
    }

    public LocalDateTime getMinPublicationTime() {
        return minPublicationTime;
    }

    public void setMinPublicationTime(LocalDateTime minPublicationTime) {
        this.minPublicationTime = minPublicationTime;
    }

    public LocalDateTime getMaxPublicationTime() {
        return maxPublicationTime;
    }

    public void setMaxPublicationTime(LocalDateTime maxPublicationTime) {
        this.maxPublicationTime = maxPublicationTime;
    }
}
