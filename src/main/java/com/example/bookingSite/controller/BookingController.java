package com.example.bookingSite.controller;

import com.example.bookingSite.model.BookingDto;
import com.example.bookingSite.model.BookingEntity;
import com.example.bookingSite.model.ToursDto;
import com.example.bookingSite.model.ToursEntity;
import com.example.bookingSite.service.BookingService;
import com.example.bookingSite.service.TourDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.HttpsURLConnection;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingController {
    @Autowired
    public TourDetails tousObj;

    @Autowired
    public BookingService bookingService;

    @GetMapping("/tours")
    public ResponseEntity<List<ToursDto>> getAllToursDetails(){
        return ResponseEntity.ok(tousObj.getAllTourDetails());
    }

    @GetMapping ("/tours/{id}")
    public ResponseEntity<ToursEntity> getTourDetailsById(@PathVariable Integer id){
        return ResponseEntity.ok(tousObj.getToursById(id));
    }

    @PostMapping ("/admin/tours")
    public ResponseEntity<String> createTour(@RequestBody ToursEntity toursEntity){
        return ResponseEntity.ok(tousObj.saveNewTours(toursEntity));
    }

    @PutMapping("/admin/tours/{id}")
    public ResponseEntity<String> updateTour(@RequestBody ToursEntity toursEntity){
        return ResponseEntity.ok(tousObj.UpdateToursDetails(toursEntity)+"");
    }

    @DeleteMapping("/admin/tours/{id}")
    public ResponseEntity<String> deleteTour(@PathVariable Integer id){
        tousObj.deleteToursDetails(id);
        return ResponseEntity.ok("Value is deleted successfully");
    }

    @PostMapping("/booking")
    public ResponseEntity<String> newBookingRequest(@RequestBody BookingEntity bookingObj){

        bookingService.createNewBookingRequest(bookingObj);
        return ResponseEntity.ok("New booking request is successfully");
    }

    @GetMapping("/booking/users/{id}")
    public List<BookingDto> getUserBookings(@PathVariable int id){
        return bookingService.getUserBookingDetails(id);
    }


}
