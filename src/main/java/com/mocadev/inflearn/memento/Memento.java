package com.mocadev.inflearn.memento;

import com.mocadev.inflearn.command.MacroCommand;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-07
 **/
public class Memento {

	private MacroCommand state;

	public Memento(MacroCommand state) {
		this.state = state.clone();
	}

	public MacroCommand getSaveState() {
		return state.clone();
	}

}
