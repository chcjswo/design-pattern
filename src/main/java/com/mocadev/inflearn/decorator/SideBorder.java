package com.mocadev.inflearn.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-06
 **/
public class SideBorder extends Border {

	public SideBorder(Widget widget) {
		super(widget);
	}

	@Override
	public int getColumns() {
		return widget.getColumns() + 2;
	}

	@Override
	public int getRows() {
		return widget.getRows();
	}

	@Override
	public String getRowText(int row) {
		return "*" + widget.getRowText(row) + "*";
	}
}
