package com.example.bookingSite.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


public class ToursDto {

    private Integer id;
    private String title;
    private String description;
    private String destination;
    private float price;
    private int durationDays;
    private int maxSlots;
    private int availableSlots;
    private String imageUrl ;
    private Boolean isActive ;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getDurationDays() {
		return durationDays;
	}
	public void setDurationDays(int durationDays) {
		this.durationDays = durationDays;
	}
	public int getMaxSlots() {
		return maxSlots;
	}
	public void setMaxSlots(int maxSlots) {
		this.maxSlots = maxSlots;
	}
	public int getAvailableSlots() {
		return availableSlots;
	}
	public void setAvailableSlots(int availableSlots) {
		this.availableSlots = availableSlots;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
