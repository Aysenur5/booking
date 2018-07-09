package com.example.booking;

import com.example.booking.Entity.User;
import com.example.booking.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BookingApplication implements CommandLineRunner {

@Autowired
	UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}

	@Override

	public void run (String... strings) throws Exception {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		if(userRepository.count()==0)
		{
			User user = new User();
			user.setName("admin");
			user.setPassword(encoder.encode("admin"));
			userRepository.save(user);
		}
	}

}
