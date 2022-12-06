package com.example.AutoSched;

import com.example.AutoSched.HttpBodies.AccountCredentials;
import com.example.AutoSched.User.User;
import com.example.AutoSched.User.UserRepository;
import org.mockito.Mockito.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.security.NoSuchAlgorithmException;


@SpringBootApplication
public class AutoSchedApplication {


	public static void main(String[] args) throws NoSuchAlgorithmException {
		SpringApplication.run(AutoSchedApplication.class, args);
	}

	@Bean
	CommandLineRunner initUser(UserRepository userRepository) {
		return args -> {
			AccountCredentials liam_credentials = new AccountCredentials("liam_admin", "liam_password");
			User liam_admin = new User(liam_credentials.getName(), liam_credentials.passwordHash());
			liam_admin.setPrivilege(User.Privilege.ADMIN);
			userRepository.save(liam_admin);
		};
	}




}
