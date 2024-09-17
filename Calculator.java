public class Calculator {

    // Method to add two numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Main method to test the calculator
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Example usage
        System.out.println("Addition: " + calculator.add(5, 3));      // Output: 8.0
        System.out.println("Subtraction: " + calculator.subtract(5, 3)); // Output: 2.0
        System.out.println("Multiplication: " + calculator.multiply(5, 3)); // Output: 15.0
        System.out.println("Division: " + calculator.divide(5, 3));    // Output: 1.6666666666666667
    }
}
