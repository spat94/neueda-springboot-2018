package uk.ac.belfastmet.mla.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersAPI {

	@JsonProperty("AllMembersList")
	AllMembersList allMembersList;
	
	public String toString()
	{
		String allMembersList = this.allMembersList.toString();
		
		return allMembersList;
	}
}
