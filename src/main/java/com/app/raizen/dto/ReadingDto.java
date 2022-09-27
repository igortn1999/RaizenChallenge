package com.app.raizen.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.raizen.repositories.ReadingRepository;

public class ReadingDto {
	
	private int id;
	private int device_id;
	private double reading_value;
	private Date time_of_reading;
	
	@Autowired 
	ReadingRepository rr;
	
	public ReadingDto() {
		
	}
	
	public ReadingDto(int id, int device_id, double reading_value){
		this.id = id;
		this.device_id=device_id;
		this.reading_value=reading_value;
//		this.time_of_reading = new Date();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	public double getReading_value() {
		return reading_value;
	}

	public void setReading_value(double reading_value) {
		this.reading_value = reading_value;
	}

	public Date getTime_of_reading() {
		return time_of_reading;
	}

	public void setTime_of_reading(Date time_of_reading) {
		this.time_of_reading = time_of_reading;
	}
	
	
}
