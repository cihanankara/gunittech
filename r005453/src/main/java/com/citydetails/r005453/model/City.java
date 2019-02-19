package com.citydetails.r005453.model;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class City {

	public static String name;

	public City() {
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		City.name = name;
	}

	public static ResponseEntity<String> getCitiesJSON(String name) {
		final String uri = "http://api.geonames.org/searchJSON?name=" + name
				+ "&cities=cities500&maxRows=100&username=blackjesus";

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);

		System.out.println(result);
		return result;
	}

	public static ResponseEntity<String> getCitiesXML(String name) {
		final String uri = "http://api.geonames.org/search?name=" + name
				+ "&cities=cities500&maxRows=100&username=blackjesus";

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.TEXT_XML));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);

		System.out.println(result);
		return result;
	}

}
