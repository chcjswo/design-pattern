package com.mocadev.inflearn.adapter;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-06
 **/
public class PersonAdapter implements Student {

	private final Person person;

	public PersonAdapter(Person person) {
		this.person = person;
	}

	@Override
	public String showName() {
		return person.getName();
	}

	@Override
	public int showAge() {
		return person.getAge();
	}

}
