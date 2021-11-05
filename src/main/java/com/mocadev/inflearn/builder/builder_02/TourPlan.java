package com.mocadev.inflearn.builder.builder_02;

import java.time.LocalDate;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-05
 **/
public class TourPlan {

	private String title;
	private int nights;
	private int days;
	private LocalDate startDate;
	private String whereToStay;
	private List<DetailPlan> plans;

	public TourPlan(String title, int nights, int days, LocalDate startDate, String whereToStay,
					List<DetailPlan> plans) {
		this.title = title;
		this.nights = nights;
		this.days = days;
		this.startDate = startDate;
		this.whereToStay = whereToStay;
		this.plans = plans;
	}

	@Override
	public String toString() {
		return "TourPlan{" +
			"title='" + title + '\'' +
			", nights=" + nights +
			", days=" + days +
			", startDate=" + startDate +
			", whereToStay='" + whereToStay + '\'' +
			", plans=" + plans +
			'}';
	}
}
