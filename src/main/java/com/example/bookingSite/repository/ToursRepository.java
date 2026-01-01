package com.example.bookingSite.repository;

import com.example.bookingSite.model.ToursEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToursRepository extends  JpaRepository<ToursEntity,Integer> {

}


