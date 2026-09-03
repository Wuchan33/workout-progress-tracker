package com.wuchan33.workout_progress_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.wuchan33.workout_progress_tracker.config.GoogleSheetsProperties;

@SpringBootApplication
@EnableConfigurationProperties(GoogleSheetsProperties.class)
public class WorkoutProgressTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutProgressTrackerApplication.class, args);
	}

}
