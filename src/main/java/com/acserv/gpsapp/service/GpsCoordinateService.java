package com.acserv.gpsapp.service;

import java.util.List;

import com.acserv.gpsapp.model.GpsCoordinate;

public interface GpsCoordinateService {
	
	GpsCoordinate save(GpsCoordinate gpsCoordinate);
	
	List<GpsCoordinate> getAllCoordinates();

}
