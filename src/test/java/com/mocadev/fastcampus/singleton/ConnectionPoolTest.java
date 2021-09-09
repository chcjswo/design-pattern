package com.mocadev.fastcampus.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-09
 **/
class ConnectionPoolTest {

	@Test
	void getInstanceTest() {
		ConnectionPool instance1 = ConnectionPool.getInstance();
		ConnectionPool instance2 = ConnectionPool.getInstance();

		assertThat(instance1).isEqualTo(instance2);
	}

}
