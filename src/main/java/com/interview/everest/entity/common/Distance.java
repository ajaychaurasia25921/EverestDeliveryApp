package com.interview.everest.entity.common;

public class Distance {

	private final long startRange;
	
	private final long endRange;

	public Distance(long startRange, long endRange) {
		this.startRange = startRange;
		this.endRange = endRange;
	}

	public long getStartRange() {
		return startRange;
	}

	public long getEndRange() {
		return endRange;
	}

}
