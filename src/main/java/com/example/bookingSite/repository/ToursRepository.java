package com.example.bookingSite.repository;

import com.example.bookingSite.model.ToursEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface ToursRepository extends  JpaRepository<ToursEntity,Integer> {

    //    Missing @Modifying: Without this, Spring will try to execute the query as a SELECT and throw an InvalidDataAccessApiUsageException.
//
//    Missing @Transactional: Update operations must run within a transaction. While you can put this on your Service, putting it on the Repository method is safer for testing.
//    @Modifying
    @Transactional
    @Query(value ="UPDATE tours SET price=:price,duration_days=:durationDays,max_slots=:maxSlots WHERE id=:id",nativeQuery = true)
    int updateTourDetails(@Param("price") float price,@Param("durationDays") int durationDays,@Param("maxSlots")  int maxSlots,@Param("id") int id);

}


