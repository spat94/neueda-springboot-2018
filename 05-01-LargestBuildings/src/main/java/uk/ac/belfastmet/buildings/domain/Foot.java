package uk.ac.belfastmet.buildings.domain;

public class Foot extends Building{
	
	private String fprint;
	private String lxw;
	private String description;
	
	public Foot() {
		super();
	}

	public Foot(String name, String country, String place, String image, String map, String fprint, String lxw,
			String description) {
		super(name, country, place, image, map);
		this.fprint = fprint;
		this.lxw = lxw;
		this.description = description;
	}

	public String getFprint() {
		return fprint;
	}

	public void setFprint(String fprint) {
		this.fprint = fprint;
	}

	public String getLxw() {
		return lxw;
	}

	public void setLxw(String lxw) {
		this.lxw = lxw;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

}
