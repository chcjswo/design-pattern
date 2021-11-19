package com.mocadev.inflearn.composite;


/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-19
 **/
public class Client {

	public static void main(String[] args) {
		final Item item1 = new Item("도란검", 450);
		final Item item2 = new Item("체력 물약", 50);

		Bag bag = new Bag();
		bag.add(item1);
		bag.add(item2);

		Client client = new Client();
		client.printPrice(item1);
		client.printPrice(bag);
	}

	private void printPrice(Component component) {
		System.out.println("item.getPrice() = " + component.getPrice());
	}

}
