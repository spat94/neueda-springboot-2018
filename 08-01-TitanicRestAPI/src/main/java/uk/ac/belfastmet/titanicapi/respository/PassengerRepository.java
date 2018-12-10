package uk.ac.belfastmet.titanicapi.respository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanicapi.domain.Passenger;

public interface PassengerRepository extends CrudRepository <Passenger, Integer> {

	Passenger findByPassengerId(Integer passengerId);

	Passenger deleteByPassengerId(Integer passengerId);
	
	

}
