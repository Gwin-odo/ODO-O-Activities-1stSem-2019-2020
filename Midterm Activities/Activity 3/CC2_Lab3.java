public class CC2_Lab3 {

  public static void main (String [] args) {
  
    char W, I, N, H;
    int num1, num2, num3, num4;
    W = 'G';
    I = 'O';
    N = 'D';
    H = '!';
  
    num1 = W;
    num2 = I;
    num3 = N;
    num4 = H;
  
    int sum = num1 + num2 + num3;
    int product = num1 * num2 * num3 * num4;
    int average = sum / 3;
    int remainder = product % average;
  
    System.out.println(W + " - " + num1);
    System.out.println(I + " _ " + num2);
    System.out.println(N + " _ " + num3);
    System.out.println(H + " _ " + num4);
    System.out.println("GOD!");
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + product);
    System.out.println("Average: " + average);
    System.out.println("Remainder: " + product % average);
  
  }
}  