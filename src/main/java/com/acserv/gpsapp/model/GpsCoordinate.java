package com.acserv.gpsapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class GpsCoordinate {
	
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private String id;
	private String latitude;
	private String longitude;
	private String date;
	
	public GpsCoordinate(String latitude, String longitude, String date) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.date =  date;
	}

}
