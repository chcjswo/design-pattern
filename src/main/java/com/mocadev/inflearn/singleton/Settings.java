package com.mocadev.inflearn.singleton;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-03
 **/
public class Settings {

	private static final Settings INSTANCE = new Settings();

	private Settings() {

	}

	public static Settings getInstance() {
		return INSTANCE;
	}
}
