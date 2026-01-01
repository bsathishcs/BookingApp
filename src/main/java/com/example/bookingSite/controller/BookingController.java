package com.example.bookingSite.controller;

import com.example.bookingSite.model.ToursDto;
import com.example.bookingSite.model.ToursEntity;
import com.example.bookingSite.service.TourDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingController {
    @Autowired
    public TourDetails tousObj;

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

}
