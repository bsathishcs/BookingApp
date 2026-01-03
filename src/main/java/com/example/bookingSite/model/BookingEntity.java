package com.example.bookingSite.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table( name = "bookings")
@NoArgsConstructor @Getter @Setter
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




}


