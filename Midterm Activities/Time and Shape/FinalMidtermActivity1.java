import javax.swing.JOptionPane;

public class FinalMidtermActivity1 {
	
	public static void main(String [] args) {
						
		int minutes = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Minutes: "));
		int hours = minutes / 60;
		int timeLeft = minutes % 60;
		minutes = timeLeft;
		
		JOptionPane.showMessageDialog(null, "There are " + hours + " hours and " + timeLeft + " minutes ");
	}
}