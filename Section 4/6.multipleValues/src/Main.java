import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variable to store the amount of numbers the user wants to save
        int amount;
        Scanner scanner = new Scanner(System.in);

        // Asks user the amount of numbers they wish to enter
        System.out.print("How many numbers do you want to save? ");
        amount = scanner.nextInt();

        // Array where numbers will be stored
        int[] numbers = new int[amount];

        // The user select their values
        System.out.println("Enter " + amount + " numbers:");
        for (int i = 0; i < amount; i++) {
            System.out.print("> ");
            numbers[i] = scanner.nextInt();
        }

        // Prints the values of the array
        System.out.println("The numbers you have saved are:");
        for (int i:numbers)
            System.out.println(i);
    }
}
