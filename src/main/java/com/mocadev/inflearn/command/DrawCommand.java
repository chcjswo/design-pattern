package com.mocadev.inflearn.command;

import java.awt.Point;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-07
 **/
public class DrawCommand implements Command, Cloneable {

	private Point point;
	private Drawable drawable;

	public DrawCommand(Point point, Drawable drawable) {
		this.point = point;
		this.drawable = drawable;
	}

	@Override
	public void execute() {
		drawable.draw(point.x, point.y);
	}

}
