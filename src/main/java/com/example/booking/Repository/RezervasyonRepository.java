package com.example.booking.Repository;

import com.example.booking.Entity.Rezervasyon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface RezervasyonRepository extends CrudRepository<Rezervasyon,Long> {

    List<Rezervasyon> findAll();

    Rezervasyon findRezervasyonsByRezervasyonId(@Param("rezervasyonId") Long rezervasyonId);



}
