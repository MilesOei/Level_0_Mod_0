package string_manip;

import javax.swing.JOptionPane;

public class CandyCrush {

    public static void main(String[] args) {
        // 1. Using a pop-up, ask the user who they don't like
    	String hate = JOptionPane.showInputDialog("Who do you hate?");
    	
        // 2. Change the next line so that the pop-up will tell them they have a crush on that person
        JOptionPane.showMessageDialog(null, "You totally have a crush on " + hate + "!");
		
        
        // 3. Ask the user for the name of their best friend
        String best= JOptionPane.showInputDialog("Who is your best friend?");
        
        // 4. Tell them their best friend is as sweet as candy
        JOptionPane.showMessageDialog(null, best + " is as sweet as candy.");
  
    
    
        //EXTRA
        String like = JOptionPane.showInputDialog("What food do you like?");
        
        JOptionPane.showMessageDialog(null, like + " tastes great!");
    } 
}