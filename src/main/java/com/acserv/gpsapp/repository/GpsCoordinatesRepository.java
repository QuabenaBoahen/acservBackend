package com.acserv.gpsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.acserv.gpsapp.model.GpsCoordinate;

@Repository
public interface GpsCoordinatesRepository extends JpaRepository<GpsCoordinate, String>{

}
