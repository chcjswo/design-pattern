package com.mocadev.inflearn.adapter.adapter_01;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-06
 **/
public class Main {

	public static void main(String[] args) {
		Person person = new Person("name", 12);
		PersonAdapter personAdapter = new PersonAdapter(person);

		System.out.println("personAdapter = " + personAdapter.showName());
		System.out.println("personAdapter = " + personAdapter.showAge());
	}

}
