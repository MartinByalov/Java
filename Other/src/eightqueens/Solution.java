package eightqueens;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Font;

public class Solution {

	public static void main(String[] args) {

		final EightQueens solution = new EightQueens();
		solution.solve(0);

		JFrame frame = new JFrame("Eight Queens");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		Font font = new Font("Verdana", Font.BOLD, 12);
		textArea.setFont(font);

		textArea.append(
				"Total number of solutions: " + (solution.count) + "\nFor the next solution, please click Enter.");

		KeyListener listener = new KeyListener() {

			int i = 0;

			public void keyPressed(KeyEvent event) {

				try {

					if (event.getKeyCode() == KeyEvent.VK_ENTER) {

						textArea.append(solution.toString(i));

						i++;
					}

				} catch (IndexOutOfBoundsException e) {

					textArea.append("\nThe solution doesn't exist.\n");
				}
			}

			public void keyReleased(KeyEvent event) {
			}

			public void keyTyped(KeyEvent event) {
			}
		};

		textArea.addKeyListener(listener);

		JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		// Scroll automatically if the text area is fulfilled.
		textArea.setCaretPosition(textArea.getDocument().getLength());
		frame.add(scroll);

		frame.setSize(350, 350);
		frame.setVisible(true);
	}
}
