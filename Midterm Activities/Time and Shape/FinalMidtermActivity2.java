import java.lang.Math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class FinalMidtermActivity2 {
   
    public static void main(String[] args) throws IOException {
       
        DecimalFormat df = new DecimalFormat("0.00");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String shape = "";
       	float radius = 0, side, height, width, base;
           
            while(true){
                    System.out.println("Enter shape: ");
                shape = br.readLine();
           
            switch(shape){
                     
                case "circle":  
                    boolean b = true;
                   
                    System.out.println("Enter Radius: ");
                    radius = Float.parseFloat(br.readLine());
                    double answer = (Math.PI * (radius * radius));
                   
                    System.out.println(df.format(answer));
                    while(true){
                       
                        System.out.println("Try again [y/n]?");
                        char ans = br.readLine().charAt(0);

                        if (ans == 'y'){
                            break;
                        }
                        else if (ans == 'n'){
                            System.exit(0);
                        }
                        else if (ans != 'y' && ans != 'n'){
                           System.out.println("Invalid Input");
                           continue;
                        }
                    }
                    break;
           
                case "square":
                   
                    System.out.println("Enter Side: ");
                    side = Float.parseFloat(br.readLine());
                    double answer2 = (side * side);
                   
                    System.out.println(df.format(answer2));
                    while(true){
                       
                        System.out.println("Try again [y/n]?");
                        char ans = br.readLine().charAt(0);
                       
                        if (ans == 'y'){
                            break;
                        }
                        else if (ans == 'n'){
                            System.exit(0);
                        }
                        else if (ans != 'y' && ans != 'n'){
                            System.out.println("Invalid Input");
                            continue;
                        }
                    }
                    break;
         
                   
                case "rectangle":
                   
                    System.out.println("Enter Height: ");
                    height = Float.parseFloat(br.readLine());
                    System.out.println("Enter Width: ");
                    width = Float.parseFloat(br.readLine());
                    double answer3 = (height * width);
                   
                    System.out.println(df.format(answer3));
                    while(true){
                       
                        System.out.println("Try again [y/n]?");
                        char ans = br.readLine().charAt(0);
                       
                        if (ans == 'y'){
                            break;
                        }
                        else if (ans == 'n'){
                            System.exit(0);
                        }
                        else if (ans != 'y' && ans != 'n'){
                            System.out.println("Invalid Input");
                            continue;
                        }
                    }
                    break;
                   
                case "triangle":
                
                    System.out.println("Enter Height: ");
                    height = Float.parseFloat(br.readLine());
                    System.out.println("Enter Base: ");
                    base = Float.parseFloat(br.readLine());
                    double answer4 = (height * base) / 2;
                   
                    System.out.println(df.format(answer4));
                    while(true){
                       
                        System.out.println("Try again [y/n]?");
                        char ans = br.readLine().charAt(0);
                       
                        if (ans == 'y'){
                            break;
                        }
                        else if (ans == 'n'){
                            System.exit(0);
                        }
                        else if (ans != 'y' && ans != 'n'){
                            System.out.println("Invalid Input");
                            continue;
                        }
                    }
                    break;
                   
                default:
                    System.out.println("Try again");
            }
           
               
             
                                 
            }            
    }
}
