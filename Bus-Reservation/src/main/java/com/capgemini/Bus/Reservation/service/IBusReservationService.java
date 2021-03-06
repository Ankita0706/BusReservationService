package com.capgemini.Bus.Reservation.service;

import java.util.List;

import com.capgemini.Bus.Reservation.entity.Bus;
import com.capgemini.Bus.Reservation.entity.User;

public interface IBusReservationService {
	
public List<Bus> ShowBuses();
	
	public List<User> ShowUsers();

	public Bus findById(int theId);
	
	public Bus AddBus(Bus theBus);
	
	public void DeleteBus(int theId);

}
