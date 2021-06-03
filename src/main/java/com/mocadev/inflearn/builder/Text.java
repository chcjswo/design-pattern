package com.mocadev.inflearn.builder;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-03
 **/
public class Text {

	private String text;

	public static class Builder {
		private String title;
		private String content;
		private String[] items;

		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}

		public Builder setContent(String content) {
			this.content = content;
			return this;
		}

		public Builder setItems(String... items) {
			this.items = items;
			return this;
		}

		public Text build() {
			Text text = new Text();
			StringBuilder sb = new StringBuilder();
			sb.append(title).append("\n");
			sb.append(content).append("\n");
			for (String item : items) {
				sb.append(item).append("\n");
			}
			text.text = sb.toString();
			return text;
		}
	}

	@Override
	public String toString() {
		return "Text{" +
			"text='" + text + '\'' +
			'}';
	}
}
