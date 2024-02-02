package Com.hotelPackage;

import java.util.Scanner;

public class HotelManagementSys {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        Scanner scanner = new Scanner(System.in);
        greetings.receptionist();
        greetings.customer(scanner);
        greetings.tableChoice(scanner);
        System.out.println("MenuList and Price");
        System.out.println("Please select the Menu as per the below list");
        greetings.munuListAndCalculateTotalPrice();
        
        boolean payConfirmation = greetings.payTheBill(scanner);
        if(payConfirmation) {
            greetings.feedback(scanner);
        } else {
            System.out.println("Please pay the bill amount..");
        }

        scanner.close();
    }
}
