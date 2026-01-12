package exam_11th_Jan_2026;

import java.util.Scanner;

public class Arithmetic_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int num1=0, num2=0;

        System.out.println("Enter the num1: ");
        int num1 = inputCheck(scanner);

        System.out.println("Enter the num2: ");
        int num2 = inputCheck(scanner);

        int sum = addition(num1, num2);
        System.out.println("The sum is: " + sum);

        int difference = subtraction(num1, num2);
        System.out.println("The difference is: " + difference);

        int multiplication = multiplication(num1, num2);
        System.out.println("The multiplication is: " + multiplication);

        int division = division(num1, num2);
        System.out.println("The division is: " + division);

        int remainder = remainder(num1, num2);
        System.out.println("The remainder is: " + remainder);

    }

    static int addition(int num1, int num2)
    {
        return num1 + num2;
    }

    static int subtraction(int num1, int num2)
    {
        return num1 - num2;
    }

    static int multiplication(int num1, int num2)
    {
        return num1 * num2;
    }

    static int division(int num1, int num2)
    {
        if(num2==0)
        {
            System.out.println("Division by zero not allowed");
        }
        return num1 / num2;
    }

    static int remainder(int num1, int num2)
    {
        if(num2==0)
        {
            System.out.println("Remainder by zero not allowed");
        }
        return num1 % num2;
    }

    static int inputCheck(Scanner scanner)
    {
        if(scanner.hasNextInt())
        {
            int num = scanner.nextInt();
            return num;
        }else{
            System.out.println("Invalid");
            System.exit(0);
        }
        return 0;
    }
}
