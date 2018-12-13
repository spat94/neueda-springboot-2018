package uk.ac.belfastmet.mla.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersList {

	@JsonProperty("Member")
	ArrayList<Member> member;
	
	
	public String toString()
	{
		return this.member.toString();
	}
}
