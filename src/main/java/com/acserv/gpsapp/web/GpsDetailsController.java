package com.acserv.gpsapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acserv.gpsapp.model.GpsCoordinate;
import com.acserv.gpsapp.service.GpsCoordinateService;

@Controller
@RequestMapping("/api")
public class GpsDetailsController {
	
	@Autowired
	private GpsCoordinateService gpsCoordinateService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("gpsCoordinates", gpsCoordinateService.getAllCoordinates());
		return "index";
	}
	
	@ResponseBody
	@PostMapping("/gpscoordinates")
	public GpsCoordinate saveCoordinates(@RequestBody GpsCoordinate gpsCoordinate) {
		return gpsCoordinateService.save(gpsCoordinate);
	}

}
