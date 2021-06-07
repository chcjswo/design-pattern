package com.mocadev.inflearn.templatemethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-08
 **/
public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero("용사");
		Monster monster1 = new Slime('A');
		Monster monster2 = new Wolf('A');

		SuperHero superHero = new SuperHero("슈퍼 히어로");
		superHero.setFly(true);

		hero.attack(monster1);
		superHero.attack(monster1);
		monster2.attack(hero);
	}

}
