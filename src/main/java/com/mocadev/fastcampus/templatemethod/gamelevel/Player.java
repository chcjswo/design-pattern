package com.mocadev.fastcampus.templatemethod.gamelevel;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-12
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
		playerLevel.go(count);
	}

}
