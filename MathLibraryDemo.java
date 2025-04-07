public class MathLibraryDemo {
    public static void main(String[] args) {
        // Declare and initialize variables
        double base = 2;
        int exponent = 3;
        
        // Using Math.pow() to calculate power
        double powerResult = Math.pow(base, exponent);

        // Using Math.sqrt() to calculate square root
        double numberForSqrt = 16;
        double sqrtResult = Math.sqrt(numberForSqrt);

        // Using Math.round() to round a decimal number
        double decimalNumber = 5.67;
        long roundedNumber = Math.round(decimalNumber);

        // Using Math.random() to generate a random number between 0.0 (inclusive) and 1.0 (exclusive)
        double randomNumber = Math.random();

        // Output the results
        System.out.println("Power: " + powerResult);
        System.out.println("Square Root: " + sqrtResult);
        System.out.println("Rounded Number: " + roundedNumber);
        System.out.println("Random Number: " + randomNumber);
    }
}
