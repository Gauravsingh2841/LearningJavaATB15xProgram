package task.OOPs_Test;

public class CodingChallenge14 {
    public static void main(String[] args) {

        // 1. ArithmeticException (division by zero)
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }

        // 2. NumberFormatException (invalid number format)
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            int value = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        }
    }
}
