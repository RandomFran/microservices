package com.example.user_service.feingnclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.example.user_service.model.Bike;

@FeignClient(name = "bike-service")
//@RequestMapping("/car")
public interface BikeFeignClient {

	@PostMapping
	Bike save(@RequestBody Bike bike);

	@GetMapping("/byuser/{userId}")
	List<Bike> getBikes(@PathVariable("userId") int userId);

}
