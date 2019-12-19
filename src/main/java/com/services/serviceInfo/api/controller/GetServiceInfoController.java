/**
 * 
 */
package com.services.serviceInfo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.services.serviceInfo.api.domain.GetServiceInfoResponse;
import com.services.serviceInfo.api.service.GetServiceInfoService;

/**
 * @author PRASADBolla
 *
 */
@RestController
public class GetServiceInfoController {
	@Autowired
	public GetServiceInfoService getServiceInfoService;

	@GetMapping(value = "/services/{tenentId}/{serviceType}")
	public ResponseEntity<List<GetServiceInfoResponse>> getServiceInfo(
			@PathVariable String tenentId, @PathVariable String serviceType) {
		return ResponseEntity.ok(getServiceInfoService.getGetServiceInfoList());
		
	}
	

}
