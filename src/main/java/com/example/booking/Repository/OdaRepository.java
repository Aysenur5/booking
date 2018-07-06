package com.example.booking.Repository;

import com.example.booking.Entity.Oda;
import com.example.booking.Entity.Oda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface OdaRepository extends CrudRepository<Oda,Long> {

    List<Oda> findAll();

    Oda findOdaByOdaId(@Param("odaId") Long odaId);



}
