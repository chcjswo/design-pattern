package com.mocadev.fastcampus.state;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-16
 **/
public class Player {

	private PlayerLevel playerLevel;

	public Player() {
		playerLevel = new BeginnerLevel();
		playerLevel.showLevelMessage();
	}

	public void upgradeLevel(PlayerLevel playerLevel) {
		playerLevel.showLevelMessage();
		this.playerLevel = playerLevel;
	}

	public PlayerLevel getPlayerLevel() {
		return playerLevel;
	}

	public void play(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}

	private void turn() {
		playerLevel.turn();
	}

	private void jump() {
		playerLevel.jump();
	}

	public void run() {
		playerLevel.run();
	}

}
