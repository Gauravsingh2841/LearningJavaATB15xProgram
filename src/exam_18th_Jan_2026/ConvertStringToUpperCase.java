package exam_18th_Jan_2026;

import java.util.Scanner;

public class ConvertStringToUpperCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = scanner.nextLine().toUpperCase();
        System.out.println("The uppercase format is: " + word);
    }
}
