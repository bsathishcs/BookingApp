package com.example.bookingSite.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class BookingDto {

    @NotNull
    private int id;
    private int userId;
    private java.time.LocalDateTime bookingDate;
    private int totalPrice;
    private int numberOfPeople;
    private String status;
    private int tourId;
}
