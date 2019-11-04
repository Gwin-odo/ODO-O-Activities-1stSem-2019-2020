import javax.swing.JOptionPane;


public class AgeJ{
	
	public static void main (String [] args) {
          
   		while(true) {
    		try {
    	
    			int age;
    			String exitAge;
    			exitAge = JOptionPane.showInputDialog(null,"Please Enter Your Age: ");
    			
    			if(exitAge == null) {
    				System.exit(0);
    			}
    	    	else if(exitAge != null) {
    	    	age = Integer.parseInt(exitAge);
    	    		
    			if (age >= 0 && age <=  3) {
    				JOptionPane.showMessageDialog(null,"You are a Baby");
    				break;
    			}
    			else if (age >= 4 && age <= 12) {
    				JOptionPane.showMessageDialog(null,"You are a Child");
    				break;
    			}
    			else if (age >= 13 && age <= 19) {
    				JOptionPane.showMessageDialog(null,"You are a Teenager");
    				break;
    			}
    			else if (age >= 20 && age <= 32) {
    				JOptionPane.showMessageDialog(null,"You are a Young Adult");
    				break;
    			}
    			else if (age >= 33 && age <= 45) {
    				JOptionPane.showMessageDialog(null,"You are a Middle Age");
    				break;
    			}
    			else if (age >= 46 && age <= 59) {
    				JOptionPane.showMessageDialog(null,"You are an Adult");
    				break;
    			}
    			else if (age >= 60 && age <= 122) {
    				JOptionPane.showMessageDialog(null,"You are a Senior");
    				break;
    			}
    			else{
    				JOptionPane.showMessageDialog(null,"Invalid Input");
    			}
    			
    			}
    
   			}
    	
   			catch (Exception e) {
        			JOptionPane.showMessageDialog(null,"Error!!");
        	}	
        	 	
    	}
    	
    }
    	
}
