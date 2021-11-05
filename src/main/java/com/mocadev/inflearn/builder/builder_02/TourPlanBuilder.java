package com.mocadev.inflearn.builder.builder_02;

import java.time.LocalDate;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-05
 **/
public interface TourPlanBuilder {

	TourPlanBuilder title(String title);

	TourPlanBuilder nightsAndDays(int nights, int days);

	TourPlanBuilder startDate(LocalDate localDate);

	TourPlanBuilder whereToStay(String whereToStay);

	TourPlanBuilder addPlan(int day, String plan);

	TourPlan getPlan();

}
