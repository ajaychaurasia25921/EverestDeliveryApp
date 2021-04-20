package com.interview.everest.entity.request;

import com.interview.everest.constant.enums.OfferEnum;

public class PackageRequest {

	private String pkgId;

	private double pkgWeight;

	private double deliveryDistance;

	private OfferEnum offerCode;

	public String getPkgId() {
		return pkgId;
	}

	public void setPkgId(String pkgId) {
		this.pkgId = pkgId;
	}

	public double getPkgWeight() {
		return pkgWeight;
	}

	public void setPkgWeight(double pkgWeight) {
		this.pkgWeight = pkgWeight;
	}

	public double getDeliveryDistance() {
		return deliveryDistance;
	}

	public void setDeliveryDistance(double deliveryDistance) {
		this.deliveryDistance = deliveryDistance;
	}

	public OfferEnum getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(OfferEnum offerCode) {
		this.offerCode = offerCode;
	}

}
