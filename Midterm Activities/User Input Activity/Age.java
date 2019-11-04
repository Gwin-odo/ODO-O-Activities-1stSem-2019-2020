import java.util.Scanner;

public class Age {

	public static void main (String [] args) {
  
	Scanner sc = new Scanner(System.in);
    
    	while(true) {
    		try {
    			
    			System.out.println(" Please Enter Your Age: ");
   				int age;
    			age = sc.nextInt();
    
    			if (age >= 0 && age <=  3) {
    				System.out.println("You are aBaby");
    				break;
    			}
    			else if (age >= 4 && age <= 12) {
    				System.out.println("You are a Child");
    				break;
    			}
    			else if (age >= 13 && age <= 19) {
    				System.out.println("You are a Teenager");
    				break;
   				 }
    			else if (age >= 20 && age <= 32) {
    				System.out.println("You are a Young Adult");
    				break;
    			}
    			else if (age >= 33 && age <= 45) {
    				System.out.println("You are a Middle Age");
    				break;
    			}
    			else if (age >= 46 && age <= 59) {
    				System.out.println("You are an Adult");
    				break;
    			}
    			else if (age >= 60 && age <= 122) {
    				System.out.println("You are a Senior");
    				break;
    			}
    			else{
    				System.out.println("Invalid Input");
  				}	
    
    
    		}
    		catch (Exception e) {
       			System.out.println("Error!");
       			sc.next();
    		}
    	 	
  		}
     
	}
  
}    