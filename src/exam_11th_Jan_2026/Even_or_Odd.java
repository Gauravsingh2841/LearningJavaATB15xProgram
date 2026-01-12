package exam_11th_Jan_2026;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        if(num%2==0)
        {
            System.out.println("The given number is Even");
        }else{
            System.out.println("The given number is odd");
        }
    }
}
