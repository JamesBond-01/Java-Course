import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Original prices of each product
        int[] ticket_price = {100,150,500,20};

        // Array where discounted prices will be stored
        int[] discounted_prices = new int[ticket_price.length];

        // Discount percentage to be applied to each product
        int discount_percentage;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the discount percentage: ");
        discount_percentage = input.nextInt();

        // Calculates each discounted price and stores them in the new array
        for(int i = 0; i < ticket_price.length; i++) {
            discounted_prices[i] = ticket_price[i] - (ticket_price[i] * discount_percentage) / 100;
        }

        // Prints ticket_prices array
        System.out.println("Ticket prices:");
        for(int i:ticket_price) {
            System.out.print(i + " ");
        }

        // Prints the discounted_prices array
        System.out.println("\nDiscounted prices:");
        for(int i:discounted_prices) {
            System.out.print(i + " ");
        }
    }
}
