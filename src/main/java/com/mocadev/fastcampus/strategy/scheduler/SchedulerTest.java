package com.mocadev.fastcampus.strategy.scheduler;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-15
 **/
public class SchedulerTest {

	public static void main(String[] args) {
		Scheduler scheduler = null;

		for (int i = 1; i <= 3; i++) {
			if (i == 1) {
				scheduler = new RoundRobin();
			} else if (i == 2) {
				scheduler = new LeastJob();
			} else if (i == 3) {
				scheduler = new PriorityAllocation();
			}

			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
	}

}
