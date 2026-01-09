package TestDemo;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;

public class T3_Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
        // String s = scanner.next(); This will only read the value upto space in the provided input.
        String s = scanner.nextLine();
        // Remove spaces and convert to lowercase
        s = s.replaceAll(" ", "").toLowerCase(Locale.ROOT);
        String s_rev = "";
        for(int i=s.length()-1; i>=0; i--)
        {
            s_rev += s.charAt(i);
        }
        if(s.equals(s_rev))
        {
            System.out.println("It's a Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
        scanner.close();
    }
}
