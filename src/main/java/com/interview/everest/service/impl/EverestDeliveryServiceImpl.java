package com.interview.everest.service.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.interview.everest.constant.OfferCriteria;
import com.interview.everest.entity.common.Distance;
import com.interview.everest.entity.common.Offer;
import com.interview.everest.entity.common.Weight;
import com.interview.everest.entity.request.EverestDeliveryOfferApplyRequest;
import com.interview.everest.entity.request.EverestDeliveryTimeEstRequest;
import com.interview.everest.entity.response.EverestDeliveryOfferApplyResponse;
import com.interview.everest.entity.response.PackageResponse;
import com.interview.everest.service.EverestDeliveryService;

@Service
public class EverestDeliveryServiceImpl implements EverestDeliveryService {

	@Override
	public EverestDeliveryOfferApplyResponse offerApplyDiscountOnPackages(EverestDeliveryOfferApplyRequest request) {
		EverestDeliveryOfferApplyResponse response = new EverestDeliveryOfferApplyResponse();
		response.setBaseDeliveryCost(request.getBaseDeliveryCost());
		response.setNoOfPackage(request.getNoOfPackage());
		List<PackageResponse> pack = new LinkedList<>();
		request.getPackages().stream().forEach(pkg -> {
			PackageResponse packResponse = new PackageResponse();
			packResponse.setDeliveryDistance(pkg.getDeliveryDistance());
			packResponse.setPkgId(pkg.getPkgId());
			packResponse.setOfferCode(pkg.getOfferCode());
			packResponse.setDiscount(0.0);
			packResponse.setPkgWeight(pkg.getPkgWeight());
			Offer criteria = OfferCriteria.getOFFER_CRITERIA().get(pkg.getOfferCode());
			double total = response.getBaseDeliveryCost()
					+ ((pkg.getPkgWeight() * 10) + (pkg.getDeliveryDistance() * 5));
			packResponse.setTotalCost(total);
			if (checkDistance(criteria.getDistance(), pkg.getDeliveryDistance())) {
				if (checkWeight(criteria.getWeight(), pkg.getPkgWeight())) {
					packResponse.setDiscount((total * criteria.getDiscount()) / 100);
					packResponse.setTotalCost(total - ((total * criteria.getDiscount()) / 100));
				}
			}
			pack.add(packResponse);
		});
		response.setPackages(pack);
		return response;
	}

	private boolean checkDistance(Distance criteriaDistance, double pkgDeliveryDistance) {
		return (criteriaDistance.getStartRange() <= pkgDeliveryDistance
				&& pkgDeliveryDistance <= criteriaDistance.getEndRange());
	}

	private boolean checkWeight(Weight criteriaWeight, double pkgWeight) {
		return (criteriaWeight.getStartLimit() <= pkgWeight && pkgWeight <= criteriaWeight.getEndLimit());
	}

	@Override
	public EverestDeliveryOfferApplyResponse deliveryAndPackageDetails(EverestDeliveryTimeEstRequest request) {
		EverestDeliveryOfferApplyResponse response = new EverestDeliveryOfferApplyResponse();
		EverestDeliveryOfferApplyResponse offerResponse = offerApplyDiscountOnPackages(request.getBasicInfo());
		response = offerResponse;
		double totalWeight = 0;
		Map<Long, Double> vMap = new HashMap<>();
		for(long itr = 1L; itr <= request.getNumberOfVehicles(); itr++) {
			vMap.put(itr, 0.0);
		}
		long flag = 1L;
		for (PackageResponse pkg : offerResponse.getPackages()) {
			totalWeight = totalWeight + pkg.getPkgWeight();
			if(totalWeight > request.getCapacity()) {
				if(flag >= request.getNumberOfVehicles()) {
					flag = 1L;
				}else {
					flag++;
				}
				totalWeight = 0;
			}
			if(totalWeight <= request.getCapacity()) {
				double temp = pkg.getDeliveryDistance() / request.getMaxSpeed();
				pkg.setEstDeliveryTime((2*Collections.min(vMap.values()))+temp);
				vMap.put(flag, pkg.getEstDeliveryTime());
				pkg.setVehicalNumber(flag);
			}
		}
		return response;
	}
}
