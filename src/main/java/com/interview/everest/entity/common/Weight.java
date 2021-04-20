package com.interview.everest.entity.common;

public class Weight {

	private final long startLimit;

	private final long endLimit;

	public Weight(long startLimit, long endLimit) {
		this.startLimit = startLimit;
		this.endLimit = endLimit;
	}

	public long getStartLimit() {
		return startLimit;
	}

	public long getEndLimit() {
		return endLimit;
	}

}
