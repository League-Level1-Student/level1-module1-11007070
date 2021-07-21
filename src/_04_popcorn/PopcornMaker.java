package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("what flavor popcorn would you like to make?");
		String minute = JOptionPane.showInputDialog("How many minutes would you like to cook the popcorn for?");
		int minutes = Integer.parseInt(minute);
		
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		
		microwave.putInMicrowave(popcorn);
		microwave.setTime(minutes);
		microwave.startMicrowave();
		
	}
}
