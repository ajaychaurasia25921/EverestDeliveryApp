package com.interview.everest.constant;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.interview.everest.constant.enums.OfferEnum;
import com.interview.everest.entity.common.Offer;

public class OfferCriteria {

	private final Map<OfferEnum, Offer> OFFER_CRITERIA = new ConcurrentHashMap<>();

	private OfferCriteria() {
		OFFER_CRITERIA.put(OfferEnum.OFR001, new Offer(0L, 200L, 70L, 200L, 10.0));
		OFFER_CRITERIA.put(OfferEnum.OFR002, new Offer(50L, 150L, 100L, 250L, 7.0));
		OFFER_CRITERIA.put(OfferEnum.OFR003, new Offer(50L, 250L, 10L, 150L, 5.0));
		OFFER_CRITERIA.put(OfferEnum.NONE, new Offer(0L, 0L, 0L, 0L, 0.0));
	}

	public static Map<OfferEnum, Offer> getOFFER_CRITERIA() {
		return new OfferCriteria().OFFER_CRITERIA;
	}

}
