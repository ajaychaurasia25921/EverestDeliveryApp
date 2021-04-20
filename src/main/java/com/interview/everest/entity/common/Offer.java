package com.interview.everest.entity.common;

public class Offer {

	private final Distance distance;
	
	private final Weight weight;
	
	private final double discount;

	public Offer(long startRange, long endRange, long startLimit, long endLimit, double discount) {
		this.distance = new Distance(startRange, endRange);
		this.weight = new Weight(startLimit, endLimit);
		this.discount = discount;
	}
	
	public Distance getDistance() {
		return distance;
	}

	public Weight getWeight() {
		return weight;
	}

	public double getDiscount() {
		return discount;
	}
}
