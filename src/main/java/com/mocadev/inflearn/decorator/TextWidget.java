package com.mocadev.inflearn.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-06
 **/
public class TextWidget extends Widget {

	private String text;

	public TextWidget(String text) {
		this.text = text;
	}

	@Override
	public int getColumns() {
		return text.length();
	}

	@Override
	public int getRows() {
		return 1;
	}

	@Override
	public String getRowText(int row) {
		return row == 0 ? text : null;
	}

}
