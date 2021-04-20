package com.interview.everest.entity.response;

import java.util.List;

import com.interview.everest.entity.common.EverestDeliveryOfferApply;

public class EverestDeliveryEstResponse extends EverestDeliveryOfferApply {
	
	private List<PackageResponse> packages;

	public List<PackageResponse> getPackages() {
		return packages;
	}

	public void setPackages(List<PackageResponse> packages) {
		this.packages = packages;
	}

}
