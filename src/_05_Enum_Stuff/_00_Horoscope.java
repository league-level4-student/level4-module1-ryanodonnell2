package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
		void run() {
			Zodiac[] options = {Zodiac.ARIES, Zodiac.TAURUS, Zodiac.GEMINI, Zodiac.CANCER, Zodiac.LEO, Zodiac.VIRGO, 
					Zodiac.LIBRA, Zodiac.SCORPIO, Zodiac.SAGITTARIUS, Zodiac.CAPRICORN, Zodiac.AQUARIUS, Zodiac.PISCES};

			int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
					options, 0);

			Zodiac choice = options[input];
			
			//use a switch statement to do something cool for each option
			switch (choice) {
			case ARIES:
				JOptionPane.showMessageDialog(null, "ARIES");
				break;
			case TAURUS:
				JOptionPane.showMessageDialog(null, "TAURUS");
				break;
			case GEMINI:
				JOptionPane.showMessageDialog(null, "GEMINI");
				break;
			case CANCER:
				JOptionPane.showMessageDialog(null, "CANCER");
				break;
			case LEO:
				JOptionPane.showMessageDialog(null, "LEO");
				break;
			case VIRGO:
				JOptionPane.showMessageDialog(null, "VIRGO");
				break;
			case LIBRA:
				JOptionPane.showMessageDialog(null, "LIBRA");
				break;
			case SCORPIO:
				JOptionPane.showMessageDialog(null, "SCORPIO");
				break;
			case SAGITTARIUS:
				JOptionPane.showMessageDialog(null, "SAGITTARIUS");
				break;
			case CAPRICORN:
				JOptionPane.showMessageDialog(null, "CAPRICORN");
				break;
			case AQUARIUS:
				JOptionPane.showMessageDialog(null, "AQUARIUS");
				break;
			case PISCES:
				JOptionPane.showMessageDialog(null, "PISCES");
				break;
			default:
				break;
			}
		}

	// 3. Make a main method to test your method
	
}
