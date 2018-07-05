package com.example.booking.Repository;

import com.example.booking.Entity.Odeme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface OdemeRepository extends CrudRepository<Odeme,Long> {

    List<Odeme> findAll();

    Odeme findOdemesByOdemeId(@Param("odemeId") Long odemeId);



}
