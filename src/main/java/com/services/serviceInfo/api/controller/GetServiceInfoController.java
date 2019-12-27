/**
 * 
 */
package com.services.serviceInfo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.services.serviceInfo.api.domain.GetServiceInfoResponse;
import com.services.serviceInfo.api.domain.ResourceInfo;
import com.services.serviceInfo.api.service.GetServiceInfoService;
import com.services.serviceInfo.api.service.GetSubscriptionService;

/**
 * @author PRASADBolla
 *
 */
@RestController
public class GetServiceInfoController {
	@Autowired
	public GetServiceInfoService getServiceInfoService;

	@Autowired
	public GetSubscriptionService getSubscriptionService;

	@GetMapping(value = "/services/{tenentId}")
	public ResponseEntity<List<GetServiceInfoResponse>> getServiceInfo(
			@PathVariable String tenentId) {
		return ResponseEntity.ok(getServiceInfoService.getGetServiceInfoList(tenentId));

	}

	@GetMapping(value = "/services/{tenentId}/{serviceType}")
	public ResponseEntity<ResourceInfo> getSubscriptionId(
			@RequestHeader String authorizationCode) {
		return ResponseEntity.ok(getSubscriptionService
				.getSubscriptionId(authorizationCode));

	}

}
