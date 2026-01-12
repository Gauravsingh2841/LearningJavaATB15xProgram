package exam_11th_Jan_2026;

import java.util.Scanner;

public class Reverse_A_Number_Do_While {
    public static void main(String[] args){
        int rev = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        if (scanner.hasNextInt())
        {
            int num = scanner.nextInt();
            do{
                rev = rev*10 + num%10;
                num /= 10;
            }while (num>0);
            System.out.println("The reversed number is: " + rev);
        }else {
            System.out.println("Enter valid int number");
        }
    }
}
