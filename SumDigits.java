public class SumDigits {
    public static void main(String[] args) {
        // Test the sumDigits method with an example
        long number = 234;
        int result = sumDigits(number);
        System.out.println("Sum of digits in " + number + " is " + result);
    }

    public static int sumDigits(long n) {
        int sum = 0;

        // Use a loop to repeatedly extract and sum the digits
        while (n != 0) {
            // Extract the last digit using the % operator
            int digit = (int)(n % 10);

            // Add the extracted digit to the sum
            sum += digit;

            // Remove the extracted digit using the / operator
            n /= 10;
        }

        return sum;
    }
}
