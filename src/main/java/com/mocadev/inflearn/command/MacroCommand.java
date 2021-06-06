package com.mocadev.inflearn.command;

import java.util.Stack;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-07
 **/
public class MacroCommand implements Command, Cloneable {

	private Stack<Command> commands = new Stack<>();

	@Override
	public void execute() {
		commands.forEach(Command::execute);
	}

	public void add(Command command) {
		commands.push(command);
	}

	public void undo() {
		if (commands.size() > 0) {
			commands.pop();
		}
	}

	public void clear() {
		commands.clear();
	}

	@Override
	public MacroCommand clone() {
		MacroCommand macroCommand = null;
		try {
			macroCommand = (MacroCommand) super.clone();
			macroCommand.commands = (Stack<Command>) this.commands.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return macroCommand;
	}
}
