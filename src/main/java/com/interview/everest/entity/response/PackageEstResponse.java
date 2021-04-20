package com.interview.everest.entity.response;

import com.interview.everest.entity.request.PackageRequest;

public class PackageEstResponse extends PackageRequest {

	private double discount;

	private double totalCost;
	
	private double estDeliveryTime;
	
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
