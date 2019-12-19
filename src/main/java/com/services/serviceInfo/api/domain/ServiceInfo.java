package com.services.serviceInfo.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceInfo {

	@JsonProperty("RG")
	private String rg;
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Type")
	private String type;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



}
