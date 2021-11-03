package com.mocadev.inflearn.singleton;

import java.io.Serializable;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-03
 **/
public class Settings implements Serializable {

	private Settings() {

	}

	private static class SettingsHolder {
		private static final Settings INSTANCE = new Settings();
	}

	public static Settings getInstance() {
		return SettingsHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}

}
