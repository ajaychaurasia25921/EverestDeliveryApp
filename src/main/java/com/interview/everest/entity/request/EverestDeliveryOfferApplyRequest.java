package com.interview.everest.entity.request;

import java.util.List;

import com.interview.everest.entity.common.EverestDeliveryOfferApply;

public class EverestDeliveryOfferApplyRequest extends EverestDeliveryOfferApply {
	
	private List<PackageRequest> packages;

	public List<PackageRequest> getPackages() {
		return packages;
	}

	public void setPackages(List<PackageRequest> packages) {
		this.packages = packages;
	}
	
}
