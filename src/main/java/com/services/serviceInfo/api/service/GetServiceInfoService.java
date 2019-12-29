/**
 * 
 */
package com.services.serviceInfo.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.serviceInfo.api.configuration.ConfigurationManager;
import com.services.serviceInfo.api.domain.Category;
import com.services.serviceInfo.api.domain.GetServiceInfoResponse;

/**
 * @author PRASADBolla
 *
 */
@Service
public class GetServiceInfoService {

	@Autowired
	public GetSubscriptionService getSubscriptionService;
	
	@Autowired
	public ConfigurationManager configurationManager;
	final String ROOT_URI = "https://management.azure.com/subscriptions?api-version=2019-06-01";

	public static List<GetServiceInfoResponse> getServiceInfoList = new ArrayList<GetServiceInfoResponse>();
	public static List<Category> categories = new ArrayList<Category>();
/*	static {
		getServiceInfoList.add(new GetServiceInfoResponse("1", "Azure Sql DB", "active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("2", "Azure  xx DB", "active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("3", "Azure xxx DB", "active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("4", "Azure xxx DB", "active", "12345"));
	}*/
	public void getAvailableResourceList() {
		
		categories.add(new Category("Compute",
		configurationManager
				.getComputelist()
				.stream()
				.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
						"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("Networking",
				configurationManager
						.getNetworkinglist()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("Storage",
				configurationManager
						.getStoragelist()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("Web+Mobile",
				configurationManager
						.getWebmobilelist()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("Containers",
				configurationManager
						.getContainerslist()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("Databases",
				configurationManager
						.getDatabaseslist()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("Data+Analytics",
				configurationManager
						.getDataAnalysticslist()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("AI+CognitiveServices",
				configurationManager
						.getAlcongintiveservicelist()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("InternetofThings",
				configurationManager
						.getInternetofThingslist()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("EnterpriseIntegration",
				configurationManager
						.getEnterpriseIntegrationlist()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("Security+Identity",
				configurationManager
						.getSecurityIdentityList()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("DeveloperTools",
				configurationManager
						.getDeveloperToolslist()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		categories.add(new Category("Monitoring+Management",
				configurationManager
						.getMonitoringmanagementlist()
						.stream()
						.map(resource -> new com.services.serviceInfo.api.domain.Service("", resource.trim(), "",
								"","NotRegistered")).collect(Collectors.toList())));
		System.out.println("hello");
	}
	
	/**
	 * @return the getServiceInfoList
	 */
	public GetServiceInfoResponse getGetServiceInfoList(String tenentId) {
		
/*		if(bearerCode == null || bearerCode.isEmpty())
			bearerCode = AuthenticationUtility.getToken();
		
		GetSubscriptionService getSubscriptionService = new GetSubscriptionService();
	    ResourceInfo info = getSubscriptionService.getSubscriptionId(bearerCode);
	    String subscriptionId = info.getValue()[0].getSubscriptionId();
	    
		//Temp code added to return auth code
	    bearerCode = AuthenticationUtility.getToken();
		
	    String uri = "https://management.azure.com/subscriptions/" + subscriptionId + "/resources?api-version=2019-08-01";
	    System.out.println(uri);
	    System.out.println("https://management.azure.com/subscriptions/543ab7b3-dbaa-4aba-8568-2fd96b773904/resources?api-version=2019-08-01");
	    RestTemplate restTemplate = new RestTemplate();
	    HttpHeaders headers = new HttpHeaders();
	    headers.set("Authorization", bearerCode);
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    ResponseEntity<ResourceInfo> result = restTemplate.exchange(uri, HttpMethod.GET, entity, ResourceInfo.class);*/
		if(categories.isEmpty())
			getAvailableResourceList();
		
		return new GetServiceInfoResponse(categories);
	}
	
/*	
	public static void main(String a[]){
		GetServiceInfoService getServiceInfoService = new GetServiceInfoService();
		getServiceInfoService.getAvailableResourceList();
	}*/
}
