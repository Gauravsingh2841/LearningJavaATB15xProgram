package exam_18th_Jan_2026;

import java.util.Scanner;

public class ReverseAStringUsingLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = scanner.nextLine();
        String revString = "";
        for(int i=string.length()-1; i>=0; i--)
        {
            revString += string.charAt(i);
        }
        System.out.println("The reversed string is: " + revString);
    }
}
