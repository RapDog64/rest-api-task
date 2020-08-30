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
public class APICompany {

	@JsonProperty("bs")
	private String bs;

	@JsonProperty("catchPhrase")
	private String catchPhrase;

	@JsonProperty("name")
	private String companyName;
}