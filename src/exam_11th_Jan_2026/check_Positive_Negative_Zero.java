package exam_11th_Jan_2026;

import java.util.Scanner;

public class check_Positive_Negative_Zero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        String status = (num > 0) ? "+ve" : ((num < 0) ? "-ve" : "Zero");
        System.out.println("The number is " + status);
    }
}
