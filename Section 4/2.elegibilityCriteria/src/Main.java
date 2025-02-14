import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age, height;
        Scanner input = new Scanner(System.in);
        // Asks user to enter their info
        System.out.println("Enter the following information:");
        System.out.print("\t>Age: ");
        age = input.nextInt();
        System.out.print("\t>Height (cm): ");
        height = input.nextInt();
        // Checks if user is qualified to play football
        if (age > 16 && height > 167)
            System.out.println("You are qualified to play");
        else if (age > 16 && height < 167)
            System.out.println("You are not qualified to play");
        else
            System.out.println("You are not qualified as of now, come back after " + (16 - age) + " years");
    }
}
