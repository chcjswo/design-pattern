package com.mocadev.fastcampus.singleton;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-07
 **/
public class ConnectionPool {

	private static ConnectionPool instance = new ConnectionPool();

	private ConnectionPool() {
	}

	public static ConnectionPool getInstance() {
		if (instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}

}
