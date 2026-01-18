package exam_18th_Jan_2026;

import java.util.Scanner;

public class CountCharactersInString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = scanner.nextLine().replaceAll(" ", "");
        int count = 0;
        for(int i = 0; i<word.length(); i++)
        {
            count++;
        }
        System.out.println("The count of characters in this string is: " + count);
    }
}
