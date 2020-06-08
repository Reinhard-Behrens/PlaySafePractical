package com.playsafe.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.playsafe.api.kelvin.KelvinToCelcuis;
import com.playsafe.api.miles.MilesToKilometers;
import com.playsafe.api.pounds.PoundsToKilograms;


@SpringBootApplication
@ComponentScan(basePackageClasses = {KelvinToCelcuis.class, MilesToKilometers.class,PoundsToKilograms.class})
public class PlaysafedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaysafedemoApplication.class, args);
	}

}
