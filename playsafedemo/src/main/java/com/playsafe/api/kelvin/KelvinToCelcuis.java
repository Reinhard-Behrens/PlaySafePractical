package com.playsafe.api.kelvin;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //Rest Controller I just cannot remember ...... :(
@RequestMapping(path="/api/v1/kelvin") //RequestMapping and path of the service
public class KelvinToCelcuis {

	@GetMapping(path="{totalkelvin}") // HTTP Get Request with paramater
	public @ResponseBody double getCelcius(@PathVariable("totalkelvin") double totalkelvin)
	{
		return totalkelvin - 273.15;
	}
}