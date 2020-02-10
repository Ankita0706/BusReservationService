package com.capgemini.Bus.Reservation.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Bus.Reservation.dao.BusOperationsDao;
import com.capgemini.Bus.Reservation.entity.Bus;
import com.capgemini.Bus.Reservation.entity.User;

@Transactional
@Service
public class BusReservationServiceImpl implements IBusReservationService {
	
	@Autowired
	BusOperationsDao dao;

	@Override
	public List<Bus> ShowBuses() {
		
		return dao.ShowBuses();
	}

	@Override
	public List<User> ShowUsers() {
	
		return dao.ShowUsers();
	}

	@Override
	public Bus findById(int theId) {
		return dao.findById(theId);
	}

	@Override
	public Bus AddBus(Bus theBus) {
		
		return dao.AddBus(theBus);
		
	}

	@Override
	public void DeleteBus(int theId) {
	
		dao.DeleteBus(theId);
		
	}
	

	

}
