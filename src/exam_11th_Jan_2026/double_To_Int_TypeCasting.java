package exam_11th_Jan_2026;

import java.util.Scanner;

public class double_To_Int_TypeCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double value: ");
        double doubleNum1 = scanner.nextDouble();
        int intNum1 = (int) doubleNum1;
        System.out.println("The double value is: " + doubleNum1);
        System.out.println("The type-casted int value will be " + intNum1);
    }
}
