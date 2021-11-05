package com.mocadev.inflearn.builder.builder_02;

import java.time.LocalDate;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-05
 **/
public class App {

	public static void main(String[] args) {
		TourPlanBuilder builder = new DefaultTourBuilder().newInstance();
		builder.title("제주도 여행")
			.nightsAndDays(3, 4)
			.startDate(LocalDate.of(2020, 6, 19))
			.whereToStay("좋은 호텔")
			.addPlan(0, "도착")
			.addPlan(1, "맛있는거 먹기")
			.getPlan();

		System.out.println("builder = " + builder);

		TourDirector director = new TourDirector(new DefaultTourBuilder().newInstance());
		final TourPlan tourPlan = director.GuamTrip();
		System.out.println("tourPlan = " + tourPlan);
	}

}
