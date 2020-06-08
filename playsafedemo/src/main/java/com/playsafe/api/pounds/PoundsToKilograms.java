package com.playsafe.api.pounds;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/pounds")
public class PoundsToKilograms {
//   X/2.2046 = Y KG 
	
	@GetMapping(path ="{totalpounds}" )
	public @ResponseBody double getKilograms(@PathVariable("totalpounds") double totalpounds)
	{
		return totalpounds / 2.2046;
	}
}
