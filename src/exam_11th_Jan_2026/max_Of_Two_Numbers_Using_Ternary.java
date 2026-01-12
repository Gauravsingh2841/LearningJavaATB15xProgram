package exam_11th_Jan_2026;

import java.util.Scanner;

public class max_Of_Two_Numbers_Using_Ternary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = scanner.nextInt();
        int max = (num1>num2) ? num1 : num2;
        System.out.println("The maximum of two number is: " + max);
    }
}
