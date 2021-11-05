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

	public void setTitle(String title) {
		this.title = title;
	}

	public void setNights(int nights) {
		this.nights = nights;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setWhereToStay(String whereToStay) {
		this.whereToStay = whereToStay;
	}

	public void setPlans(List<DetailPlan> plans) {
		this.plans = plans;
	}

	public String getTitle() {
		return title;
	}

	public int getNights() {
		return nights;
	}

	public int getDays() {
		return days;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public String getWhereToStay() {
		return whereToStay;
	}

	public List<DetailPlan> getPlans() {
		return plans;
	}

	public TourPlan(String title, int nights, int days, LocalDate startDate, String whereToStay,
					List<DetailPlan> plans) {
		this.title = title;
		this.nights = nights;
		this.days = days;
		this.startDate = startDate;
		this.whereToStay = whereToStay;
		this.plans = plans;
	}

	public TourPlan() {

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
