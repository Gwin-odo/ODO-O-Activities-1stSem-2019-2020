import java.util.Scanner;

public class YourName {

  public static void main (String [] args) {
  
  Scanner sc = new Scanner(System.in);
  //<variable> = <scanner obj.) . <scan method);
  System.out.print("Enter your name: ");
  String name = sc.nextLine();
  System.out.println("my name is " + name);
  
  System.out.println("Enter your age: ");
  String age = sc.nextLine();
  System.out.println("my age is " + age);
  
  System.out.println("What's your Sex?");
  String sex = sc.nextLine();
  System.out.print("I am a " + sex);
  }
}  