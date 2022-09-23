package com.example.demo;

import com.example.demo.contacttracing.ContactTracing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<ContactTracing> message() {
		return List.of(
				new ContactTracing(
						1,
						"rom",
						"romwil.pilapil@gmail.com",
						"09919428612",
						LocalDate.of(2022, Month.SEPTEMBER, 23),
						LocalTime.now()
				)
		);
	}
}
