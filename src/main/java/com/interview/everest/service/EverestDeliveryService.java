package com.interview.everest.service;

import com.interview.everest.entity.request.EverestDeliveryOfferApplyRequest;
import com.interview.everest.entity.request.EverestDeliveryTimeEstRequest;
import com.interview.everest.entity.response.EverestDeliveryOfferApplyResponse;

public interface EverestDeliveryService {

	public EverestDeliveryOfferApplyResponse offerApplyDiscountOnPackages(EverestDeliveryOfferApplyRequest request);

	public EverestDeliveryOfferApplyResponse deliveryAndPackageDetails(EverestDeliveryTimeEstRequest request);

}
