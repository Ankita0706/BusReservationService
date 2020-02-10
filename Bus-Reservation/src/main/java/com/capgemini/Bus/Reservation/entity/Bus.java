package com.capgemini.Bus.Reservation.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="Bus")
public class Bus {

	//All the fields in bus entity
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bus_Id")
	private int busId;
	
	@Column(name = "bus_Name")
	@Size(min=3,max=20,message="Name should be between 3-20 characters")
	private String busName;
	
	@Column(name = "bus_Type")
	
	@NotNull(message="Bus Type required")
	private String busType;
	
	
	@Column(name = "bus_Class")
	@NotNull(message="Bus class required")
	private String busClass;
	
	
	@Column(name = "no_of_seats")
	@NotNull(message="number of seats required")
	private int noofSeats;
	
	

	@NotNull(message="source required")
	@Column(name = "source")
	private String source;
	
	
	
	@NotNull(message="destination required")
	@Column(name = "destination")
	private String destination;
	
	
	@Column(name = "starttime")
	@NotNull(message="time validation to be done")
	private LocalTime startTime;
	
	
	@Column(name = "end_time")
	@NotNull 
	private LocalTime endTime;
	
	
	@Column(name = "cost_per_seat")
	@NotNull(message=" cost per seat required")
	private int costperSeat;

	//Constructors
	
	
	public Bus() {
		
	}

	public Bus(String busName, String busType, String busClass, int nofoSeats, String source,
			String destination, @NotNull(message = "time validation to be done") LocalTime startTime, int costperSeat, LocalTime endTime ) {
		this.busName = busName;
		this.busType = busType;
		this.busClass = busClass;
		this.noofSeats = nofoSeats;
		this.source = source;
		this.destination = destination;
		this.startTime = startTime;
		this.costperSeat = costperSeat;
		this.endTime=endTime;
	}

	//Getters and Setters
	
	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getBusClass() {
		return busClass;
	}

	public void setBusClass(String busClass) {
		this.busClass = busClass;
	}

	public int getNoofSeats() {
		return noofSeats;
	}

	public void setNoofSeats(int noofSeats) {
		this.noofSeats = noofSeats;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(@NotNull(message = "time validation to be done") LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public int getCostperSeat() {
		return costperSeat;
	}

	public void setCostperSeat(int costperSeat) {
		this.costperSeat = costperSeat;
	}

	//tostring method
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", busType=" + busType + ", busClass=" + busClass
				+ ", noofSeats=" + noofSeats + ", source=" + source + ", destination=" + destination + ", startTime="
				+ startTime + ", costperSeat=" + costperSeat + "]";
	}
	
	
	
	
	
	
}
