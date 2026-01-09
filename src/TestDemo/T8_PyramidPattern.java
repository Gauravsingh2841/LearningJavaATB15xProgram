package TestDemo;

import java.util.Scanner;

public class T8_PyramidPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for(int i=1; i<=rows; i++)
        {
            // Print spaces before the stars
            for(int j=i; j<=rows-1; j++)
            {
                System.out.print(" ");
            }
            // Print stars
            for(int k=1; k<=2*i-1; k++)
            {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        scanner.close();
    }
}
