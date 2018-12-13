package uk.ac.belfastmet.mla.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Member {
	
	@JsonProperty("PersonId")
	private Integer personId;
	@JsonProperty("AffiliationId")
	private Integer affiliation;
	@JsonProperty("MemberName")
	private String name;
	@JsonProperty("MemberLastName")
	private String lastName;
	@JsonProperty("MemberFirstName")
	private String firstName;
	@JsonProperty("MemberFullDisplayName")
	private String fullName;
	@JsonProperty("MemberSortName")
	private String sortName;
	@JsonProperty("MemberTitle")
	private String title;
	@JsonProperty("PartyName")
	private String party;
	@JsonProperty("PartyOrganisationId")
	private Integer partyOrgId;
	@JsonProperty("ConstituencyName")
	private String constituency;
	@JsonProperty("ConstituencyName")
	private Integer cId;
	@JsonProperty("MemberImgUrl")
	private String imgUrl;
	@JsonProperty("MemberPrefix")
	private String memberPrefix;
	
	public String toString()
	{
		String member = this.personId + ", "
				   	  + this.affiliation + ", "
				   	  + this.name + ", "
				   	  + this.lastName + ", "
				   	  + this.firstName + ", "
				   	  + this.fullName + ", "
				   	  + this.sortName + ", "
				   	  + this.title + ", "
				   	  + this.party + ", "
				   	  + this.partyOrgId + ", "
				   	  + this.constituency + ", "
				   	  + this.cId + ", "
				   	  + this.imgUrl + ", "
				   	  + this.memberPrefix + ", ";
		
		return member;
	}

}
