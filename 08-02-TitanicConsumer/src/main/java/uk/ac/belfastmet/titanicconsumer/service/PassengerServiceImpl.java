package uk.ac.belfastmet.titanicconsumer.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Value("${api.passenger.url}")
	private String apiUrl;
	
	private RestTemplate restTemplate;

	public PassengerServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	//Display All Passengers
	public ArrayList<Passenger> list()
	{
		String listPassengerUrl = this.apiUrl + "/passengers";
		
		AllPassengers allPassengers =this.restTemplate.getForObject(listPassengerUrl, AllPassengers.class);
		
		return allPassengers.getAllPassengers();
		
	}
	
	//Get Passenger (by ID)
	public Passenger get(Integer passengerId)
	{
		String getPassengerUrl
			= apiUrl + "/passengers/" + passengerId;
		
		Passenger passenger = this.restTemplate.getForObject(getPassengerUrl, Passenger.class);
		
		return passenger;
	}
	
	
	public Passenger add(Passenger passenger)
	{
		String addPassengerUrl = this.apiUrl + "/passengers";
		
		this.restTemplate.postForObject(addPassengerUrl, passenger, Passenger.class);
		
		return passenger;
	}
	
	//Update Passenger
	public Passenger update(Passenger passenger)
	{
		String updatePassengerUrl = this.apiUrl + "/passengers";
		
		this.restTemplate.put(updatePassengerUrl, passenger, Passenger.class);
		
		return passenger;
	}
	
	//Delete passenger
	public void delete(Integer passengerId)
	{
		String deletePassengerUrl = this.apiUrl + "/passengers/" + passengerId;
		
		this.restTemplate.delete(deletePassengerUrl);
	}
	
}
