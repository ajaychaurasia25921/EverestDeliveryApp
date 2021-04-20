package com.interview.everest.entity.request;

public class EverestDeliveryTimeEstRequest {
	
	private EverestDeliveryOfferApplyRequest basicInfo;
	
	private long numberOfVehicles;
	
	private double maxSpeed;
	
	private double capacity;

	public EverestDeliveryOfferApplyRequest getBasicInfo() {
		return basicInfo;
	}

	public void setBasicInfo(EverestDeliveryOfferApplyRequest basicInfo) {
		this.basicInfo = basicInfo;
	}

	public long getNumberOfVehicles() {
		return numberOfVehicles;
	}

	public void setNumberOfVehicles(long numberOfVehicles) {
		this.numberOfVehicles = numberOfVehicles;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

}
