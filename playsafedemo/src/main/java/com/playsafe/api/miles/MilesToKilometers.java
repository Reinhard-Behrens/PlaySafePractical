package com.playsafe.api.miles;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/miles")
public class MilesToKilometers {

	@GetMapping(path ="{totalmiles}" )
	public @ResponseBody double getKilometers(@PathVariable("totalmiles") double totalmiles)
	{
		return totalmiles * 1.609344;
	}
}
