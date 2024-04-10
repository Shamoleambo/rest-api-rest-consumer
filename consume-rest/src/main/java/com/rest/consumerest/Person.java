package com.rest.consumerest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Person(Long id, String nameAndAge) {

}
