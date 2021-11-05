package com.mocadev.inflearn.builder.builder_02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-05
 **/
public class DefaultTourBuilder implements TourPlanBuilder {

	private String title;
	private int nights;
	private int days;
	private LocalDate startDate;
	private String whereToStay;
	private List<DetailPlan> plans;

	@Override
	public TourPlanBuilder title(String title) {
		this.title = title;
		return this;
	}

	@Override
	public TourPlanBuilder nightsAndDays(int nights, int days) {
		this.nights = nights;
		this.days = days;
		return this;
	}

	@Override
	public TourPlanBuilder startDate(LocalDate startDate) {
		this.startDate = startDate;
		return this;
	}

	@Override
	public TourPlanBuilder whereToStay(String whereToStay) {
		this.whereToStay = whereToStay;
		return this;
	}

	@Override
	public TourPlanBuilder addPlan(int day, String plan) {
		if (this.plans == null) {
			this.plans = new ArrayList<>();
		}
		this.plans.add(new DetailPlan(day, plan));
		return this;
	}

	@Override
	public TourPlan getPlan() {
		return new TourPlan(title, nights, days, startDate, whereToStay, plans);
	}

	@Override
	public String toString() {
		return "DefaultTourBuilder{" +
			"title='" + title + '\'' +
			", nights=" + nights +
			", days=" + days +
			", startDate=" + startDate +
			", whereToStay='" + whereToStay + '\'' +
			", plans=" + plans +
			'}';
	}
}
