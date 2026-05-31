package com.example.bookingSite.service;

import com.example.bookingSite.model.ToursDto;
import com.example.bookingSite.model.ToursEntity;
import com.example.bookingSite.repository.ToursRepository;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TourDetails {

    @Autowired
    public ToursRepository tourRepository;
    
    @McpTool(description = "Get all available tours")
    public List<ToursDto> getAllTourDetails() {
        System.out.println("getAllTourDetails method is printed");
        List<ToursDto> toursList = new ArrayList<ToursDto>();
        List<ToursEntity> toursEntityObj = tourRepository.findAll();
        for (ToursEntity tourEntity : toursEntityObj) {
            System.out.println(tourEntity.getDestination());
            ToursDto tourDto = new ToursDto();
            tourDto.setDescription(tourEntity.getDescription());
            tourDto.setPrice(tourEntity.getPrice());
            tourDto.setDestination(tourEntity.getDestination());
            tourDto.setAvailableSlots(tourEntity.getAvailableSlots());
            tourDto.setDurationDays(tourEntity.getDurationDays());
            tourDto.setImageUrl(tourEntity.getImageUrl());
            tourDto.setDestination(tourEntity.getDestination());
            tourDto.setImageUrl(tourEntity.getImageUrl());
            tourDto.setTitle(tourEntity.getTitle());
            tourDto.setId(tourEntity.getId());
            toursList.add(tourDto);
        }
        return toursList;
    }
    
    @McpTool(description = "Get all tours details based on tour id")
    public ToursEntity getToursById(Integer id){
        Optional<ToursEntity> entityObj = tourRepository.findById(id);
        return entityObj.orElseThrow(() -> new RuntimeException ("tour not found"));
    }

    public String saveNewTours(ToursEntity toursEntity){

        return tourRepository.save(toursEntity).getId().toString();
    }

    public int UpdateToursDetails(ToursEntity toursEntity){
        System.out.println("UpdateToursDetails method is printed");
        return tourRepository.updateTourDetails(toursEntity.getPrice(),toursEntity.getDurationDays(),toursEntity.getMaxSlots(),toursEntity.getId());
    }

    public void deleteToursDetails(Integer id){
        tourRepository.deleteById(id);
    }
}
