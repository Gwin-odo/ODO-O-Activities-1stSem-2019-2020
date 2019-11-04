import java.lang.Math;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class FinalActivity1 {

	public static void main(String[] args) {
		int employee = 1; 
		double weekGross = 0;
		String condi = ""; 
		int i = 0; 
		
		DecimalFormat df2 = new DecimalFormat("0.00");
		
		double[] pr = {200,300,400,500,600,700,800,900,1000};
		char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
		int[] classNum = new int[a.length]; 
                
		System.out.println("---------- TRYING SIMULATION ----------");
			
		while(true) {
			
			try {
				weekGross = Double.valueOf(JOptionPane.showInputDialog("Employee " + employee + " gross:"));
			} catch (Exception e) {
				System.out.println("----------  SIMULATION FAIL  ----------");
				break;
			}
			
			if (weekGross < 200 || weekGross > 100000) {
				System.out.println("----------  SIMULATION FAIL  ----------");
				break;
				
			} else {
				
				System.out.println("EMPLOYEE #" + employee);
				System.out.println("Week Gross "+employee+": " + weekGross);
				System.out.println("Week Bonus "+employee+": " + df2.format(weekGross*0.09));
				System.out.println("Week Total "+employee+": " + df2.format((weekGross*0.09) + 200));
				
				
				if( ((weekGross*0.09) + 200) >= 1000 && ((weekGross*0.09) + 200) <= 100000) {
					
					classNum[classNum.length-1]++;
					System.out.println("Classification "+employee+": " + a[a.length-1]);
					
				} else {
					
					for(i = 0; i < pr.length; i++) {
						
						if( ((weekGross*0.09) + 200) >= pr[i] && ((weekGross*0.09) + 200) <= pr[i]+99) {
							classNum[i]++;
							System.out.println("Classification "+employee+": " + a[i]);
						}
					}
					
				}
				
			}
			
			try {
				condi = JOptionPane.showInputDialog("Enter another Employee?\n[0] Yes\n[1] No");

			} catch (Exception e) {
				System.out.println("----------  SIMULATION FAIL  ----------");
				break;
			}
			
			System.out.println("----------");
			
			if(condi.toLowerCase() == "yes" || Integer.parseInt(condi) == 0) {
				
				employee++;
				
			} else if(condi.toLowerCase() == "no" || Integer.parseInt(condi) == 1) {
				
				for (i = 0; i < classNum.length; i++) {
					System.out.println("There are " + classNum[i] + " employees in class " + a[i]+".");
				}
				System.out.println("---------- SIMULATION SUCCESSFUL ----------");
				break;
				
			} else {
				
				System.out.println("----------  SIMULATION FAIL  ----------");
				break;
			}
			
		}
		
	}
}
