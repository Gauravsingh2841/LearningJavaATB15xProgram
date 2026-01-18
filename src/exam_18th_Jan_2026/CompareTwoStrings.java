package exam_18th_Jan_2026;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String string2 = scanner.nextLine();
        if(string1.equals(string2))
        {
            System.out.println("They are equal in all terms.");
        }else{
            System.out.println("Not equal, there is some difference observed!");
        }
    }
}
