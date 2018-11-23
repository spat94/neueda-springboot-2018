package uk.ac.belfastmet.buildings.domain;

public class Vol extends Building {
	
	private String farea;
	private String volume;
	private String desc;

	public Vol() {
		super();
	}

	public Vol(String name, String country, String place, String farea, String volume,
			String desc, String image, String map) {
		super(name, country, place, image, map);
		this.farea = farea;
		this.volume = volume;
		this.desc = desc;
	}


	public String getFarea() {
		return farea;
	}


	public void setFarea(String farea) {
		this.farea = farea;
	}


	public String getVolume() {
		return volume;
	}


	public void setVolume(String volume) {
		this.volume = volume;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}
}
