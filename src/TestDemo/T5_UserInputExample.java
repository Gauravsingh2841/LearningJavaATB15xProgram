package TestDemo;

import java.util.Scanner;

public class T5_UserInputExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        // System.out.println("Hi " + name + "! Your age is " + age);
        System.out.printf("Hi %s! Your age is %d",name,age);
        scanner.close();
    }
}
