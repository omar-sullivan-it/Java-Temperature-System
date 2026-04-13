import java.util.Scanner;

public class TempSystem {

    public static double convertToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void displayResult(double f, double c) {
        System.out.println("Fahrenheit: " + f);
        System.out.println("Celsius: " + c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;

        while (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = input.nextDouble();

            double c = convertToCelsius(f);
            displayResult(f, c);

            System.out.print("Enter 1 to continue or 0 to exit: ");
            choice = input.nextInt();
        }

        System.out.println("Program ended.");
    }
}