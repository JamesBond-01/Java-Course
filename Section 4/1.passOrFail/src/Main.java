import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variable where users mark is stored
        int mark;
        Scanner input = new Scanner(System.in);
        //Asks user to enter the mark
        System.out.print("Enter your mark [0/100]: ");
        mark = input.nextInt();
        // Checks if users input is correct
        while (mark < 0 || mark > 100) {
                System.out.print("Enter a correct value: ");
                mark = input.nextInt();
        }
        // Informs user if they passed or failed
        if (mark >= 35)
            System.out.println("You passed!");
        else
            System.out.println("You failed.");
    }
}
