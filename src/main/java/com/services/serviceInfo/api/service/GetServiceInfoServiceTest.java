/**
 * 
 */
package com.services.serviceInfo.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.services.serviceInfo.api.configuration.ConfigurationManager;
import com.services.serviceInfo.api.domain.GetServiceInfoResponse;
import com.services.serviceInfo.api.domain.ResourceInfo;
import com.services.serviceInfo.api.util.AuthenticationUtility;

/**
 * @author PRASADBolla
 *
 */
@Service
public class GetServiceInfoServiceTest {

	@Autowired
	public GetSubscriptionService getSubscriptionService;
	
	@Autowired
	public ConfigurationManager configurationManager;
	final String ROOT_URI = "https://management.azure.com/subscriptions?api-version=2019-06-01";

	public static List<GetServiceInfoResponse> getServiceInfoList = new ArrayList<GetServiceInfoResponse>();
/*	static {
		getServiceInfoList.add(new GetServiceInfoResponse("1", "Azure Sql DB", "active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("2", "Azure  xx DB", "active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("3", "Azure xxx DB", "active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("4", "Azure xxx DB", "active", "12345"));
	}*/
	public void getAvailableResourceList() {
		/*
		 * getServiceInfoList = configurationManager .getResourcelist() .stream()
		 * .map(resource -> new GetServiceInfoResponse("", resource.trim(), "",
		 * "","NotRegistered")).collect(Collectors.toList());
		 */
		System.out.println("hello");
	}
	
	/**
	 * @return the getServiceInfoList
	 */
	public List<GetServiceInfoResponse> getGetServiceInfoList(String tenentId) {
		
		String bearerCode=null;
		if(bearerCode == null || bearerCode.isEmpty())
			bearerCode = AuthenticationUtility.getTokenMilton();
		
		GetSubscriptionService getSubscriptionService = new GetSubscriptionService();
	    ResourceInfo info = getSubscriptionService.getSubscriptionId(bearerCode);
	    String subscriptionId = null;
	    if(info != null && info.getValue() != null && info.getValue().length > 0) 
	    	subscriptionId = info.getValue()[0].getSubscriptionId();
	    
		//Temp code added to return auth code
	    bearerCode = AuthenticationUtility.getTokenMilton();
		
	    String uri = "https://management.azure.com/subscriptions/" + subscriptionId + "/resources?api-version=2019-08-01";
	    System.out.println(uri);
	    System.out.println("https://management.azure.com/subscriptions/543ab7b3-dbaa-4aba-8568-2fd96b773904/resources?api-version=2019-08-01");
	    RestTemplate restTemplate = new RestTemplate();
	    HttpHeaders headers = new HttpHeaders();
	    headers.set("Authorization", bearerCode);
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    ResponseEntity<ResourceInfo> result = restTemplate.exchange(uri, HttpMethod.GET, entity, ResourceInfo.class);
		if(getServiceInfoList.isEmpty())
			getAvailableResourceList();
		
		return getServiceInfoList;
	}
	
	
	public static void main(String a[]){
		GetServiceInfoServiceTest getServiceInfoService = new GetServiceInfoServiceTest();
		getServiceInfoService.getGetServiceInfoList(null);
	}
}
