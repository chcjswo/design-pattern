package com.mocadev.inflearn.command;

import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-07
 **/
public class DrawingApp extends JFrame {

	MacroCommand history = new MacroCommand();

	public DrawingApp(String title) throws HeadlessException {
		super(title);

		Box buttonBox = new Box(BoxLayout.X_AXIS);
		Box mainBox = new Box(BoxLayout.Y_AXIS);

		JButton undoButton = new JButton("undo");
		JButton clearButton = new JButton("clear");

		DrawCanvas canvas = new DrawCanvas(400, 400, history);

		buttonBox.add(undoButton);
		buttonBox.add(clearButton);
		mainBox.add(buttonBox);
		mainBox.add(canvas);

		getContentPane().add(mainBox);
		pack();
		setVisible(true);

		canvas.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				DrawCommand command = new DrawCommand(e.getPoint(), canvas);
				history.add(command);
				command.execute();
			}

			@Override
			public void mouseMoved(MouseEvent e) {

			}
		});

		undoButton.addActionListener(e -> {
			history.undo();
			canvas.repaint();
		});

		clearButton.addActionListener(e -> {
			history.clear();
			canvas.repaint();
		});
	}
}
