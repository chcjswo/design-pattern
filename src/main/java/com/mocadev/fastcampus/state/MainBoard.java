package com.mocadev.fastcampus.state;

/**
 * 클래스가 잘 switch 되도록 한다.
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-16
 **/
public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);

		player.upgradeLevel(new AdvancedLevel());
		player.play(2);

		player.upgradeLevel(new SuperLevel());
		player.play(3);
	}

}
