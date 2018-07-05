package com.example.booking.Repository;

import com.example.booking.Entity.Musteri;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MusteriRepository extends CrudRepository<Musteri,Long> {

    List<Musteri> findAll();

    Musteri findMusterisByMusteriId(@Param("musteriId") Long musteriId);



}
