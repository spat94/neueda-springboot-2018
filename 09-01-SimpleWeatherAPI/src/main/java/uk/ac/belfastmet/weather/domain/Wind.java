package uk.ac.belfastmet.weather.domain;

import lombok.Data;

@Data
public class Wind {

	private Integer speed;
	private String direction;
	
	public String toString()
	{
		String wind = this.getSpeed() + ", "
					+ this.getDirection() + ", ";
		
		return wind;
	}
}
