/**
 * 
 */
package com.services.serviceInfo.api.domain;

/**
 * @author PRASADBolla
 *
 */
public class Value {
	public String id;
	public String authorizationSource;
	public String subscriptionId;
	public String tenantId;
	public String displayName;
	public String state;
	public String name;
	public String type;
	public String location;
	public SKU sku;
	// "managedByTenants": [],
	// subscriptionPolicies
	//tags
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the authorizationSource
	 */
	public String getAuthorizationSource() {
		return authorizationSource;
	}

	/**
	 * @param authorizationSource
	 *            the authorizationSource to set
	 */
	public void setAuthorizationSource(String authorizationSource) {
		this.authorizationSource = authorizationSource;
	}

	/**
	 * @return the subscriptionId
	 */
	public String getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * @param subscriptionId
	 *            the subscriptionId to set
	 */
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	/**
	 * @return the tenantId
	 */
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * @param tenantId
	 *            the tenantId to set
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName
	 *            the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the sku
	 */
	public SKU getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(SKU sku) {
		this.sku = sku;
	}
	
}
