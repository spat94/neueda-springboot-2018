package uk.ac.belfastmet.buildings.domain;

public class Floor extends Building{
	
	private String farea;
	
	public Floor() {
		super();
	}

	public Floor(String name, String country, String place, String farea, String image, String map) {
		super(name, country, place, image, map);
		this.farea = farea;
	}

	public String getFarea() {
		return farea;
	}

	public void setFarea(String farea) {
		this.farea = farea;
	}

}
