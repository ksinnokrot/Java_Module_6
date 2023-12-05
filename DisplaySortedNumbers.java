import java.util.Scanner;

public class DisplaySortedNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        // Display the numbers in increasing order
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Sort the numbers in increasing order using if statements
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Display the sorted numbers
        System.out.println("The numbers in increasing order are: " + num1 + " " + num2 + " " + num3);
    }
}
