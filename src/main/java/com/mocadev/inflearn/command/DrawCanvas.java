package com.mocadev.inflearn.command;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-07
 **/
public class DrawCanvas extends Canvas implements Drawable {
	private static final int radius = 5;
	private MacroCommand history;

	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}

	@Override
	public void paint(Graphics g) {
		history.execute();
	}

	@Override
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(Color.red);
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
	}

	public void setHistory(MacroCommand history) {
		this.history = history;
	}
}
