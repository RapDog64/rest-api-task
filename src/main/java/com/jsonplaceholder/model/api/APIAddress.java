package com.jsonplaceholder.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class APIAddress {

	@JsonProperty("zipcode")
	private String zipcode;

	@JsonProperty("geo")
	private APIGeo geo;

	@JsonProperty("suite")
	private String suite;

	@JsonProperty("city")
	private String city;

	@JsonProperty("street")
	private String street;
}