import java.util.Scanner;

public class IT24104022Lab5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start date: ");
        int start_date = scanner.nextInt();

        System.out.print("Enter end date: ");
        int end_date = scanner.nextInt();

        if (start_date < 1 || start_date > 31) {
            System.out.println("Start date cannot be less than 1 or greater than 31");
            return;
        }

        if (end_date < 1 || end_date > 31) {
            System.out.println("End date cannot be less than 1 or greater than 31");
            return;
        }

        if (start_date >= end_date) {
            System.out.println("Start date should be less than end date");
            return;
        }

        int days_reserved = end_date - start_date + 1;
        double daily_rate = 48000;
        double discount_rate;

        if (days_reserved < 3) {
            discount_rate = 0;
        } else if (days_reserved < 5) {
            discount_rate = 10;
        } else {
            discount_rate = 20;
        }
        
        double total_amount = days_reserved * daily_rate * (1 - discount_rate / 100);

        System.out.println("Number of days reserved: " + days_reserved);
        System.out.println("Total Amount to be paid: " + total_amount);

        scanner.close();
    }
}
