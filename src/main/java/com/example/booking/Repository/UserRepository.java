package com.example.booking.Repository;

import com.example.booking.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository extends CrudRepository<User,Long> {

    User findByName(String name);



}
