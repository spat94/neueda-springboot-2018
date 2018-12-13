package uk.ac.belfastmet.events.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Event {
	
	private Integer identifier;
	private String url;
	private String title;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private String startDate;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private String endDate;
	private String venue;
	private String venueUrl;
	private String image;
	private String audience;
	private String theme;
	private Float cost;
	private String content;

	public String toString()
	{
		String event = this.identifier + ", "
					 + this.url + ", "
					 + this.title + ", "
					 + this.startDate + ", "
					 + this.endDate + ", "
					 + this.venue + ", "
					 + this.venueUrl + ", "
					 + this.image + ", "
					 + this.audience + ", "
					 + this.theme + ", "
					 + this.cost + ", "
					 + this.content + ", ";
		return event;
	}
}
