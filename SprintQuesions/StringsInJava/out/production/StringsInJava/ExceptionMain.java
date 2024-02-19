package out.production.StringsInJava;

public class ExceptionMain {
    // Method that throws the custom exception
    public static void checkValue(int value) throws UserDefinedException {
        // Check if the value is negative
        if (value < 0) {
            // If negative, throw the custom exception with an error message
            throw new UserDefinedException("Negative value not allowed");
        }
        System.out.println("Value is valid: " + value);
    }

    public static void main(String[] args) {
        try {
            // Call the method that may throw the custom exception
            checkValue(-5);
        } catch (UserDefinedException e) {
            // Catch the custom exception and handle it
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}