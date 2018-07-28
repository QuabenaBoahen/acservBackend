package com.acserv.gpsapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.acserv.gpsapp.model.GpsCoordinate;
import com.acserv.gpsapp.repository.GpsCoordinatesRepository;

@Service
public class GpsCoordinateServiceImpl implements GpsCoordinateService{
	
	@Autowired
	private GpsCoordinatesRepository gpsCoordinatesRepository;

	@Override
	public GpsCoordinate save(GpsCoordinate gpsCoordinate) {
		return gpsCoordinatesRepository.save(gpsCoordinate);
	}

	@Override
	public List<GpsCoordinate> getAllCoordinates() {
		return gpsCoordinatesRepository.findAll();
	}

}
