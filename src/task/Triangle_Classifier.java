package task;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side 1: ");
        int s1 = scanner.nextInt();
        System.out.println("Enter the length of side 2: ");
        int s2 = scanner.nextInt();
        System.out.println("Enter the length of side 3: ");
        int s3 = scanner.nextInt();
        if(s1 == s2 && s2 == s3)
        {
            System.out.println("The triangle is equilateral");
        }else if(s1 == s2 || s2 == s3 || s3 == s1)
        {
            System.out.println("The triangle is isosceles");
        }else
        {
            System.out.println("The triangle is scalene");
        }
        scanner.close();
    }
}
