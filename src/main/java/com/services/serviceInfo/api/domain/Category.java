/**
 * 
 */
package com.services.serviceInfo.api.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PRASADBolla
 *
 */
public class Category {
	public String categoryName;
	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Service> services;

	/**
	 * @return the service
	 */
	public List<Service> getServices() {
		if (services == null)
			services = new ArrayList();
		return services;
	}

	/**
	 * @param categoryName
	 * @param service
	 */
	public Category(String categoryName, List<Service> services) {
		super();
		this.categoryName = categoryName;
		this.services = services;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
}
