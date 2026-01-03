package com.example.bookingSite.repository;

import com.example.bookingSite.model.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookingEntity,Integer> {

    List<BookingEntity> findByUserId(int id);
}
