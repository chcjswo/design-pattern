package com.mocadev.fastcampus.strategy.scheduler;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-15
 **/
public interface Scheduler {

	void getNextCall();
	void sendCallToAgent();

}
