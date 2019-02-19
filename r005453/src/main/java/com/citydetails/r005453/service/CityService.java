package com.citydetails.r005453.service;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citydetails.r005453.model.City;

@RestController
public class CityService {

	@RequestMapping(value = "/city/getcityJSON/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getCityJSON(@PathVariable String name) {
		return City.getCitiesJSON(name);
	}

	@RequestMapping(value = "/city/getcityXML/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<String> getCityXML(@PathVariable String name) {
		return City.getCitiesXML(name);
	}

}
