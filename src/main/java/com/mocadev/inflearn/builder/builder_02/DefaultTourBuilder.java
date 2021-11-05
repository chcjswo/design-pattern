package com.mocadev.inflearn.builder.builder_02;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-05
 **/
public class DefaultTourBuilder implements TourPlanBuilder {

	private TourPlan tourPlan;

	public TourPlanBuilder newInstance() {
		this.tourPlan = new TourPlan();
		return this;
	}

	@Override
	public TourPlanBuilder title(String title) {
		this.tourPlan.setTitle(title);
		return this;
	}

	@Override
	public TourPlanBuilder nightsAndDays(int nights, int days) {
		this.tourPlan.setNights(nights);
		this.tourPlan.setDays(days);
		return this;
	}

	@Override
	public TourPlanBuilder startDate(LocalDate startDate) {
		this.tourPlan.setStartDate(startDate);
		return this;
	}

	@Override
	public TourPlanBuilder whereToStay(String whereToStay) {
		this.tourPlan.setWhereToStay(whereToStay);
		return this;
	}

	@Override
	public TourPlanBuilder addPlan(int day, String plan) {
		if (this.tourPlan.getPlans() == null) {
			this.tourPlan.setPlans(new ArrayList<>());
		}
		this.tourPlan.setTitle(this.tourPlan.getTitle());
		this.tourPlan.getPlans().add(new DetailPlan(day, plan));
		return this;
	}

	@Override
	public TourPlan getPlan() {
		return new TourPlan(this.tourPlan.getTitle(), this.tourPlan.getNights(),
			this.tourPlan.getDays(), this.tourPlan.getStartDate(), this.tourPlan.getWhereToStay(),
			this.tourPlan.getPlans());
	}

	@Override
	public String toString() {
		return "DefaultTourBuilder{" +
			"tourPlan=" + tourPlan +
			'}';
	}
}
