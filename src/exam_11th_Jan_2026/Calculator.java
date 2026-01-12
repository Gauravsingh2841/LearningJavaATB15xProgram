package exam_11th_Jan_2026;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your operation choice: ");
        String operation = scanner.nextLine().toLowerCase();
        switch (operation)
        {
            case "addition":
                System.out.println("The addition is " + (num1+num2));
                break;
            case "subtraction":
                System.out.println("The subtraction is " + (num1-num2));
                break;
            case "multiplication":
                System.out.println("The multiplication is " + (num1*num2));
                break;
            case "division":
                System.out.println("The division is " + (num1/num2));
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
