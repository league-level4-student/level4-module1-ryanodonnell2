package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Last Day Of The Weekend!");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Long Boring Day!");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "You Are Getting Closer To The End Of The Week!");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Half Way!");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "So Close!");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Last Day Of The Week!");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Relax Today!");
			break;
		default:
			break;
		}
	}
}
