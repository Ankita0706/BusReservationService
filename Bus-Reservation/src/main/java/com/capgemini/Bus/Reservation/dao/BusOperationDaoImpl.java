package com.capgemini.Bus.Reservation.dao;

import java.util.HashSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.EntityManagerBeanDefinitionRegistrarPostProcessor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.Bus.Reservation.entity.Bus;
import com.capgemini.Bus.Reservation.entity.User;

@Repository
public class BusOperationDaoImpl implements BusOperationsDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	

	@Override

	public List<Bus> ShowBuses() {
		TypedQuery<Bus> query=entityManager.createQuery("select bus from Bus bus",Bus.class);
		List<Bus> busList =query.getResultList();
		return busList;
		
	}
	

	public List<User> ShowUsers()
	{
		
		TypedQuery<User> query1=entityManager.createQuery("select user from User user",User.class);
		List<User> userList =query1.getResultList();
		return userList;
	}

	

	public Bus findById(int theId) {
		
		return entityManager.find(Bus.class, theId);
		
	}
	
	

	@Override


	public Bus AddBus(Bus theBus) {
		
		entityManager.persist(theBus);
		return theBus;
		
		
		
	}

	@Override


	public void DeleteBus(int theId) {
		
		Bus tempBus=entityManager.find(Bus.class, theId);
		if(tempBus==null)
		{
			System.out.println("Not found");
		}
		else
		{
//		entityManager.remove(tempBus);
			entityManager.remove(tempBus);
		}
//		 TODO Auto-generated method stub
//	TypedQuery<Bus> query2=entityManager.createQuery("delete bus from Bus bus where bus.busId =: BUS_ID",Bus.class);
//	query2.setParameter(" BUS_ID", theId);
//	query2.executeUpdate();
//		
		
		
	}
}
