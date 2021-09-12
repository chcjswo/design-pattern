package com.mocadev.fastcampus.templatemethod;

import com.mocadev.fastcampus.templatemethod.gamelevel.AdvancedLevel;
import com.mocadev.fastcampus.templatemethod.gamelevel.Player;
import com.mocadev.fastcampus.templatemethod.gamelevel.PlayerLevel;
import com.mocadev.fastcampus.templatemethod.gamelevel.SuperLevel;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-12
 **/
public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);

		PlayerLevel playerLevel = new AdvancedLevel();
		player.upgradeLevel(playerLevel);
		player.play(2);

		playerLevel = new SuperLevel();
		player.upgradeLevel(playerLevel);
		player.play(3);
	}

}
