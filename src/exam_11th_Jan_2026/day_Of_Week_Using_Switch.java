package exam_11th_Jan_2026;

import java.util.Scanner;

public class day_Of_Week_Using_Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number: ");

        if(scanner.hasNextInt()) {
            int day_Number = scanner.nextInt();
            switch (day_Number) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid input");

            }
        }else{
            System.out.println("Invalid input");
        }
    }
}
