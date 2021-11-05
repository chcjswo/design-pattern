package com.mocadev.inflearn.builder.builder_02;

import java.time.LocalDate;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-06
 **/
public class TourDirector {

	private final TourPlanBuilder tourPlanBuilder;

	public TourDirector(TourPlanBuilder tourPlanBuilder) {
		this.tourPlanBuilder = tourPlanBuilder;
	}

	public TourPlan GuamTrip() {
		return tourPlanBuilder.title("괌 여행")
			.startDate(LocalDate.of(2022, 1, 1))
			.getPlan();
	}
}
