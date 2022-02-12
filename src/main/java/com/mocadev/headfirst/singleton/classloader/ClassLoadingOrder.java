package com.mocadev.headfirst.singleton.classloader;

/**
 * 클래스 로딩 순서
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-13
 **/
public class ClassLoadingOrder {

	public static void main(String[] args) {
		new Single();
	}

	static class Single {

		static {
			System.out.println("1. 정적 블록");
		}

		public static Temp temp = new Temp();

		public Single() {
			System.out.println("3. 생성자");
		}
	}

	static class Temp {

		public Temp() {
			System.out.println("2. 정적 변수");
		}
	}

}
