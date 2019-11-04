package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Sorting {

    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter size of array: ");
        int size = Integer.parseInt(br.readLine());
        int []a = new int[size];
        float mean = 0;
        int sum = 0;
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter Element: " + " " + i);
            a[i] = Integer.parseInt(br.readLine());
            sum += a[i];
        }
        System.out.print("Unsorted Elements: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
                
        }
        System.out.print("\n" + "Sorted Elements: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        mean = sum / a.length;
        System.out.print("\n" + "Mean: " + mean);
    }
    
}
