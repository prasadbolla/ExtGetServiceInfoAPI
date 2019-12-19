/**
 * 
 */
package com.services.serviceInfo.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.services.serviceInfo.api.domain.GetServiceInfoResponse;
import com.services.serviceInfo.api.domain.ServiceInfo;

/**
 * @author PRASADBolla
 *
 */
@Service
public class GetServiceInfoService {

	final String ROOT_URI = "https://ps-mc.azurewebsites.net/api/GetServices?code=NrQCwhiHeEwsob7CPxazbxkEiBld//RLuNfNRvwNVtsYZWngBtXUbw==&tenantId=32161c04-7d4b-4c08-9016-fb826fed8909";

	public static List<GetServiceInfoResponse> getServiceInfoList = new ArrayList<GetServiceInfoResponse>();
	static {
		getServiceInfoList.add(new GetServiceInfoResponse("1", "Azure Sql DB", "active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("2", "Azure  xx DB", "active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("3", "Azure xxx DB", "active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("4", "Azure xxx DB", "active", "12345"));
	}

	/**
	 * @return the getServiceInfoList
	 */
	public List<GetServiceInfoResponse> getGetServiceInfoList() {
		final RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ServiceInfo[]> responseEntity = restTemplate.getForEntity(ROOT_URI, ServiceInfo[].class);
		ServiceInfo[] objects = responseEntity.getBody();
		List<ServiceInfo> siList = Arrays.asList(objects);
		return siList.stream().map(s -> new GetServiceInfoResponse(s.getRg(), s.getType(), "", s.getName())) .collect(Collectors.toList());

	}

}
