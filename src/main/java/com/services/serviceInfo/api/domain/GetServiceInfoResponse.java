/**
 * 
 */
package com.services.serviceInfo.api.domain;

/**
 * @author PRASADBolla
 *
 */
public class GetServiceInfoResponse {
public String serviceId;
public String serviceName;
public String active;
/**
 * @return the serviceId
 */
public String getServiceId() {
	return serviceId;
}
/**
 * @param serviceId
 * @param serviceName
 * @param active
 * @param serviceProviderId
 */
public GetServiceInfoResponse(String serviceId, String serviceName,
		String active, String serviceProviderId) {
	super();
	this.serviceId = serviceId;
	this.serviceName = serviceName;
	this.active = active;
	this.serviceProviderId = serviceProviderId;
}
/**
 * @param serviceId the serviceId to set
 */
public void setServiceId(String serviceId) {
	this.serviceId = serviceId;
}
/**
 * @return the serviceName
 */
public String getServiceName() {
	return serviceName;
}
/**
 * @param serviceName the serviceName to set
 */
public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}
/**
 * @return the active
 */
public String getActive() {
	return active;
}
/**
 * @param active the active to set
 */
public void setActive(String active) {
	this.active = active;
}
/**
 * @return the serviceProviderId
 */
public String getServiceProviderId() {
	return serviceProviderId;
}
/**
 * @param serviceProviderId the serviceProviderId to set
 */
public void setServiceProviderId(String serviceProviderId) {
	this.serviceProviderId = serviceProviderId;
}
public String serviceProviderId;

}
