package com.example.bookingSite.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table( name = "bookings")
@NoArgsConstructor @Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="user_id")
    private int userId;
    @Column (name = "booking_date")
    private java.time.LocalDateTime bookingDate;
    @Column (name = "total_price")
    @NotNull
    private int totalPrice;
    @Column(name ="number_of_people")
    @NotNull
    private int numberOfPeople;

    @Column(name="status")
    private String status;
    @Column ( name  = "tour_id")
    private int tourId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public java.time.LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(java.time.LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTourId() {
		return tourId;
	}
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

    


}


