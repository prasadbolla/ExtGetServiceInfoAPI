/*
 * Bell Canada Confidential
 * Bell Canada 2018. All rights reserved.
 * Developed by IBM
 */
package com.services.serviceInfo.api.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:resourcelist.properties")
public class ConfigurationManager implements CommandLineRunner {
	@Value("#{'${resourcelist}'.split(',')}")
	private List<String> resourcelist;


	/**
	 * @return the resourcelist
	 */
	public List<String> getResourcelist() {
		return resourcelist;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
