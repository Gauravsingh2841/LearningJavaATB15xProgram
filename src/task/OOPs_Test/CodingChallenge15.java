package task.OOPs_Test;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CodingChallenge15 {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(
                    "InvalidAgeException: Age must be 18 or above. Provided age: " + age
            );
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {

        // Case 1: Invalid age
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        // Case 2: Valid age
        try {
            validateAge(25);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
