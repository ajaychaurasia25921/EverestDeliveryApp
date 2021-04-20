package com.interview.everest.entity.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.interview.everest.entity.request.PackageRequest;

public class PackageResponse extends PackageRequest {

	private double discount;

	private double totalCost;
	
	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private double estDeliveryTime;
	
	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private long vehicalNumber;
	
	public long getVehicalNumber() {
		return vehicalNumber;
	}

	public void setVehicalNumber(long vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}

	public double getEstDeliveryTime() {
		return estDeliveryTime;
	}

	public void setEstDeliveryTime(double estDeliveryTime) {
		this.estDeliveryTime = estDeliveryTime;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	
}
