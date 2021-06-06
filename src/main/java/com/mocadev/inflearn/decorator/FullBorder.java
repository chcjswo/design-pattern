package com.mocadev.inflearn.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-06
 **/
public class FullBorder extends Border {

	public FullBorder(Widget widget) {
		super(widget);
	}

	@Override
	public int getColumns() {
		return widget.getColumns() + 2;
	}

	@Override
	public int getRows() {
		return widget.getRows() + 2;
	}

	@Override
	public String getRowText(int row) {
		if (row == 0 || row == widget.getRows() + 1) {
			return "+" + makeLine('-', widget.getColumns()) + "+";
		}
		return "|" + widget.getRowText(row - 1) + "|";
	}

	private String makeLine(char ch, int count) {
		return String.valueOf(ch).repeat(Math.max(0, count));
	}

}
