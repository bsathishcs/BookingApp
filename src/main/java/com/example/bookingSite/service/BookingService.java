package com.example.bookingSite.service;

import com.example.bookingSite.model.BookingDto;
import com.example.bookingSite.model.BookingEntity;
import com.example.bookingSite.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//Either @component or @service is used.
@Component
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public void createNewBookingRequest(BookingEntity bookingObj){
        try{
            bookingRepository.save(bookingObj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<BookingDto> getUserBookingDetails(int id){
        try{
            List<BookingDto> bookingList = new ArrayList<BookingDto>();
            List<BookingEntity> bookingEntityList = bookingRepository.findByUserId(id);

            for(BookingEntity bookingEntityObj : bookingEntityList){
                BookingDto bookingDto = new BookingDto();
                bookingDto.setId(bookingEntityObj.getId());
                bookingDto.setBookingDate(bookingEntityObj.getBookingDate());
                bookingDto.setStatus(bookingEntityObj.getStatus());
                bookingDto.setUserId(bookingEntityObj.getUserId());
                bookingDto.setTourId(bookingEntityObj.getTourId());
                bookingDto.setTotalPrice(bookingEntityObj.getTotalPrice());
                bookingDto.setNumberOfPeople(bookingEntityObj.getNumberOfPeople());
                bookingList.add(bookingDto);
            }
            return bookingList;
         }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
