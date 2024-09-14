/**
 * @title Tower of Hanoi
 * @description "Tower of Hanoi is a mathematical game or puzzle.
 * It consists of three rods and a number of disks of different sizes,
 * which can slide onto any rod. The puzzle starts with the disks in a neat stack
 * in ascending order of size on one rod, the smallest at the top.
 * The objective of the puzzle is to move the entire stack to another rod,
 * obeying the following simple rules: 
 * (1) Only one disk can be moved at a time;
 * (2) Each move consists of taking the upper disk from one of the stacks 
 * and placing it on top of another stack or on an empty rod;
 * (3) No disk may be placed on top of a smaller disk." - Wikipedia
 * @author Martin Byalov / FN: 50438
 *
 */

package towerofhanoi;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class TowerOfHanoi {

	public static int n; // number of disks
	public static ArrayList<Integer> left = new ArrayList<Integer>();
	public static ArrayList<Integer> middle = new ArrayList<Integer>();
	public static ArrayList<Integer> right = new ArrayList<Integer>();

	public static ArrayList<String> solution = new ArrayList<String>();

	public static void tower(int n) {

		for (int i = n; i > 0; i--) {
			left.add(i);
		}
		output();

		move(n, left, middle, right);
	}

	public static int pop(ArrayList<Integer> list) {

		int disk = list.remove((list.size() - 1));
		return disk;
	}

	public static void push(int value, ArrayList<Integer> list) {
		list.add(value);
	}

	public static void move(int n, ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {
		if (n > 0) {
			move(n - 1, a, c, b);
			int disk = pop(a);
			push(disk, c);
			output();
			move(n - 1, b, a, c);
		}
	}

	public static void output() {

		String output = "";

		output += "   A   |   B   |   C\n----------------------\n";

		for (int i = n - 1; i >= 0; i--)

		{
			String leftPole = " ", middlePole = " ", rightPole = " ";

			try {
				leftPole = String.valueOf(left.get(i));
			} catch (Exception e) {
			}

			try {
				middlePole = String.valueOf(middle.get(i));
			} catch (Exception e) {
			}

			try {
				rightPole = String.valueOf(right.get(i));
			} catch (Exception e) {
			}

			output += String.format("   %s   |   %s   |   %s%n", leftPole, middlePole, rightPole);
		}

		solution.add(output);

	}

	public static void main(String[] args) {

		String tower = JOptionPane.showInputDialog(null, "Enter number of disks for tower:", "Tower of Hanoi",
				JOptionPane.QUESTION_MESSAGE);
		int size = Integer.parseInt(tower);
		n = size;

		tower(n);

		Object[] options = { "Next", "Quit" };

		JPanel panel = new JPanel();

		JLabel label = new JLabel("For next solution click \"Next\"");

		panel.add(label);

		int result = JOptionPane.showOptionDialog(null, panel, "Tower of Hanoi", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, options, null);

		for (int i = 0; i < solution.size(); i++) {

			if (result == JOptionPane.OK_OPTION) {

				System.out.println(solution.get(i));

				result = JOptionPane.showOptionDialog(null, panel, "Tower of Hanoi", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, options, null);
			}
		}
	}
}