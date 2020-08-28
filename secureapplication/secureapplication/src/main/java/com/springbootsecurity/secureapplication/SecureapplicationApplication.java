package com.springbootsecurity.secureapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

import com.springbootsecurity.secureapplication.service.UserService;

@EnableAuthorizationServer
@SpringBootApplication
public class SecureapplicationApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    
	public static void main(String[] args) {
		SpringApplication.run(SecureapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Inside the commandLine Runner! Feeling awesome !");
		userService.createUser("admin@email.com", "admin");
		//un-comment it for first time
		log.info("the admin is Created");
	}

}
