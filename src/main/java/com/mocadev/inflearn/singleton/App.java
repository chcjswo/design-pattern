package com.mocadev.inflearn.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-03
 **/
public class App {

	public static void main(String[] args)
		throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Settings settings = Settings.getInstance();
		final Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		final Settings settings1 = constructor.newInstance();
		System.out.println(settings == settings1);
	}

}
