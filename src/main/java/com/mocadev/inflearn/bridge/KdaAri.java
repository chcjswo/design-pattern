package com.mocadev.inflearn.bridge;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-17
 **/
public class KdaAri implements Champion {

	@Override
	public void move() {
		System.out.println("KDA 아리 move");
	}

	@Override
	public void skillQ() {
		System.out.println("KDA 아리 skillQ");
	}

	@Override
	public void skillW() {
		System.out.println("KDA 아리 skillW");
	}

	@Override
	public void skillE() {
		System.out.println("KDA 아리 skillE");
	}

	@Override
	public void skillR() {
		System.out.println("KDA 아리 skillR");
	}
}
