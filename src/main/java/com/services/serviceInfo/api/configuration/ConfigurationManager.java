package com.services.serviceInfo.api.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:resourcelist.properties")
@PropertySource("classpath:services.properties")
public class ConfigurationManager implements CommandLineRunner {
	@Value("#{'${resourcelist}'.split(',')}")
	private List<String> resourcelist;
	@Value("#{'${Compute}'.split(',')}")
	private List<String> computelist;
	@Value("#{'${Networking}'.split(',')}")
	private List<String> networkinglist;
	@Value("#{'${Storage}'.split(',')}")
	private List<String> storagelist;
	@Value("#{'${Web+Mobile}'.split(',')}")
	private List<String> webmobilelist;
	/**
	 * @return the computelist
	 */
	public List<String> getComputelist() {
		return computelist;
	}


	/**
	 * @return the networkinglist
	 */
	public List<String> getNetworkinglist() {
		return networkinglist;
	}


	/**
	 * @return the storagelist
	 */
	public List<String> getStoragelist() {
		return storagelist;
	}


	/**
	 * @return the webmobilelist
	 */
	public List<String> getWebmobilelist() {
		return webmobilelist;
	}


	/**
	 * @return the containerslist
	 */
	public List<String> getContainerslist() {
		return containerslist;
	}


	/**
	 * @return the databaseslist
	 */
	public List<String> getDatabaseslist() {
		return databaseslist;
	}


	/**
	 * @return the dataAnalysticslist
	 */
	public List<String> getDataAnalysticslist() {
		return dataAnalysticslist;
	}


	/**
	 * @return the alcongintiveservicelist
	 */
	public List<String> getAlcongintiveservicelist() {
		return alcongintiveservicelist;
	}


	/**
	 * @return the internetofThingslist
	 */
	public List<String> getInternetofThingslist() {
		return internetofThingslist;
	}


	/**
	 * @return the enterpriseIntegrationlist
	 */
	public List<String> getEnterpriseIntegrationlist() {
		return enterpriseIntegrationlist;
	}


	/**
	 * @return the securityIdentityList
	 */
	public List<String> getSecurityIdentityList() {
		return securityIdentityList;
	}


	/**
	 * @return the developerToolslist
	 */
	public List<String> getDeveloperToolslist() {
		return developerToolslist;
	}


	/**
	 * @return the monitoringmanagementlist
	 */
	public List<String> getMonitoringmanagementlist() {
		return monitoringmanagementlist;
	}


	@Value("#{'${Containers}'.split(',')}")
	private List<String> containerslist;
	@Value("#{'${Databases}'.split(',')}")
	private List<String> databaseslist;
	@Value("#{'${Data+Analytics}'.split(',')}")
	private List<String> dataAnalysticslist;
	@Value("#{'${AI+CognitiveServices}'.split(',')}")
	private List<String> alcongintiveservicelist;
	@Value("#{'${InternetofThings}'.split(',')}")
	private List<String> internetofThingslist;
	@Value("#{'${EnterpriseIntegration}'.split(',')}")
	private List<String> enterpriseIntegrationlist;
	@Value("#{'${Security+Identity}'.split(',')}")
	private List<String> securityIdentityList;
	@Value("#{'${DeveloperTools}'.split(',')}")
	private List<String> developerToolslist;
	@Value("#{'${Monitoring+Management}'.split(',')}")
	private List<String> monitoringmanagementlist;

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
