package com.mocadev.inflearn.builder.builder_01;

import com.mocadev.inflearn.builder.builder_01.Text.Builder;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-03
 **/
public class Main {

	public static void main(String[] args) {
		Text text = new Builder()
			.setTitle("title")
			.setContent("내용이다")
			.setItems("item1", "item2", "item3")
			.build();

		System.out.println("text = " + text);
	}

}
