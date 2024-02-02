package Com.hotelPackage;

import java.util.*;

public class Greetings {
    int price;
    public Object scanner;
    float totalBill;

    public void receptionist() {
        System.out.println("Welcome, Sir");
        System.out.println("May I have your Good name, please?");
    }

    public void customer(Scanner scanner) {
        System.out.println("Enter your name ");
        String customerName = scanner.next();
        System.out.println("Name:" + customerName);
    }

    public void tableChoice(Scanner scanner) {
        System.out.println("Please select the Table");
        System.out.println("1 -is for Gardeen table");
        System.out.println("2 -is for InSide hotel table");
        int tablechoice = scanner.nextInt();
        switch (tablechoice) {
            case 1 -> System.out.println("Gardeen table is selected");
            case 2 -> System.out.println("InSide hotel table is selected");
            default -> System.out.println("Please a valid table");
        }
    }

    public void munuListAndCalculateTotalPrice() {

        System.out.println("Menu:");
        System.out.println("1. Paneer - Price: 100");
        System.out.println("2. Roti - Price: 20");
        System.out.println("3. Rice - Price: 50");
        System.out.println("4. Water bottle - Price: 20");

        // Get user input for the order
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your order (comma-separated items): ");
        String order = scanner.nextLine();
        // Split the order into individual items
        String[] items = order.split(",");

        // Calculate the total price
        int totalPrice = 0;
        for (String item : items) {
            String trimmedItem = item.trim().toLowerCase();
            switch (trimmedItem) {
                case "paneer" -> totalPrice += 100;
                case "roti" -> totalPrice += 20;
                case "rice" -> totalPrice += 50;
                case "water bottle" -> totalPrice += 20;
                default -> System.err.println("Invalid item: " + item);
            }
        }
        // Display the total price
        System.out.println("Total Price: " + totalPrice);
        float SGST = totalPrice * 9 / 100;
        float CGST = totalPrice * 9 / 100;
        float totalPriceWithTax = SGST + CGST;
        System.out.println(totalPriceWithTax);
        float final_Amt = totalPrice + totalPriceWithTax;
        totalBill = final_Amt;
        System.out.println("Total Price With Tax: " + final_Amt);
    }

    boolean payTheBill(Scanner scanner) {
        System.out.println("Payment process started....");
        System.out.println("Please confirm (with Y/N) to pay final amount " + totalBill);
        String confirmation = scanner.next();

        if("Y".equalsIgnoreCase(confirmation)) {
            System.out.println("Payment processing completed....");
            totalBill = 0;
            return true;
        } else {
            System.out.println("Ooooops Payment Declined....");
            return false;
        }
    }

    public void feedback(Scanner scanner) {

        if (totalBill == 0) {
            System.out.println("Please provide the feedback by rating between 1 to 3");
            int feedback = scanner.nextInt();
            if (feedback == 1) {
                System.out.println("Satisfied");
            } else if (feedback == 2) {
                System.out.println("Good");
            } else if (feedback == 3) {
                System.out.println("Unsatisfied");

            } else {
                System.out.println("Pay the bill first");
            }
        }
    }
}

    
