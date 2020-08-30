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
public class APIComment {

    @JsonProperty("name")
    private String name;

    @JsonProperty("postId")
    private int postId;

    @JsonProperty("id")
    private int id;

    @JsonProperty("body")
    private String body;

    @JsonProperty("email")
    private String email;

}