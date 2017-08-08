import javax.swing.JOptionPane;

public class QuizGame {
	public static <Int> void main(String[] args) {
		int score = 0;
		
		
		String one = JOptionPane.showInputDialog("What is 736 + 69?");
			if(one.equals(805)) {
				JOptionPane.showMessageDialog(null, "You are Correct!");
			score++;
			} else {
				JOptionPane.showMessageDialog(null, "You are Wrong!");
			
			}
		
		
		String two = JOptionPane.showInputDialog("What is the capital of California?");
			if(two.equalsIgnoreCase("Sacramento")) {
				JOptionPane.showMessageDialog(null, "You are Correct!");
			score++;
			} else {
				JOptionPane.showMessageDialog(null, "You are Wrong!");
			
			}
		
		
		String three = JOptionPane.showInputDialog("Who was the first president?");
			if(three.equalsIgnoreCase("George Washington")) {
				JOptionPane.showMessageDialog(null, "You are Correct!");
			score++;
			} else {
				JOptionPane.showMessageDialog(null, "You are Wrong!");
			
			}
			
			
		JOptionPane.showMessageDialog(null, "You got " + score + " correct. Play again soon!");
		
		
		
		
		
		
		
	}	
}
