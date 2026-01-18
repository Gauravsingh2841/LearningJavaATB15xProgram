package exam_18th_Jan_2026;

import java.util.*;

public class CheckStringLength {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = scanner.nextLine();
        if(word.length() > 10)
        {
            System.out.println("Length of the string is greater than 10, which is " + word.length() + ".");
        }else{
            System.out.println("Length of the string is not greater than 10, which is " + word.length() + ".");
        }
    }
}
