package com.example.booking.Service;

import com.example.booking.Entity.User;
import com.example.booking.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;


    public void saveUserData(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public User findUser(String name ){
        return userRepository.findByName(name);

    }


}
