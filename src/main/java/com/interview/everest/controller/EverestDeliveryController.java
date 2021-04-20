package com.interview.everest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.everest.entity.request.EverestDeliveryOfferApplyRequest;
import com.interview.everest.entity.request.EverestDeliveryTimeEstRequest;
import com.interview.everest.entity.response.EverestDeliveryOfferApplyResponse;
import com.interview.everest.service.EverestDeliveryService;

@RestController
@RequestMapping("/everest/delivery")
public class EverestDeliveryController {

	@Autowired
	private EverestDeliveryService service;

	@PostMapping("/package/offer")
	public ResponseEntity<EverestDeliveryOfferApplyResponse> offerApplyDiscountOnPackages(
			@RequestBody EverestDeliveryOfferApplyRequest request) {
		return new ResponseEntity<>(service.offerApplyDiscountOnPackages(request), HttpStatus.OK);
	}

	@PostMapping("/package/estimate")
	public ResponseEntity<EverestDeliveryOfferApplyResponse> deliveryAndPackageDetails(
			@RequestBody EverestDeliveryTimeEstRequest request) {
		return new ResponseEntity<>(service.deliveryAndPackageDetails(request), HttpStatus.OK);
	}
}
