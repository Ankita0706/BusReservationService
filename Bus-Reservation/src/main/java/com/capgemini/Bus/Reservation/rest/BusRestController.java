package com.capgemini.Bus.Reservation.rest;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Bus.Reservation.dao.BusOperationsDao;
import com.capgemini.Bus.Reservation.entity.Bus;
import com.capgemini.Bus.Reservation.entity.User;
import com.capgemini.Bus.Reservation.service.IBusReservationService;

@CrossOrigin(origins = "*", value = "*")
@RestController
@RequestMapping("/api")
public class BusRestController {


	@Autowired
	IBusReservationService service;



	@GetMapping("/buses")
	public List<Bus> ShowBuses(){

		return service.ShowBuses();
		//return busdao.ShowBuses();

	}

	@GetMapping("/users")
	public List<User> ShowUsers(){

		return service.ShowUsers();
	}


	@GetMapping("/buses/{busId}")
	public Bus findById(@PathVariable int busId) {

		Bus theBus = service.findById(busId);

		if(theBus == null)
		{
			throw new RuntimeException("Bus id not found"+ theBus);
		}
		return theBus;

	}

	@PostMapping("/addBus")
	public Bus addBus(@RequestBody Bus theBus) {
		return service.AddBus(theBus);	
	}




	@DeleteMapping("/buses/{busId}")

	public String deleteBus(@PathVariable int busId)
	{
		Bus tempBus = service.findById(busId);
		if(tempBus == null) {
			throw new RuntimeException("bus not found");
		}

		return "Delete bus "+busId;
	}



}
