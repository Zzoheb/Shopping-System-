/*--------------------------------------------------------
Program Name: Order List Handler for an Online Retailer
Author: Zoheb Khan
Date: 09/28/23
----------------------------------------------------------
Pseudocode:
//Import and package essentials
//Create Main class to suppor the entire order system
//Instanced zzOrder for managing
//Instialize scanner for user input
//Will loop until user makes desicion
//Potiential Options
//Users choice from input picked up zzSc
//Switch case to handle various scenarios dictated by customers decision
//Order information acquried from User which otherwise would be acquired from a database based of existing information
//Manage the order information here
//The items in the order will become processed
//Will display items in current order
//Exit Program
//If no valid option is selected tell the user what is valid

----------------------------------------------------------
Program Inputs: User made input on what case to handle.  User input order information.
Program Outputs: Processing of a user made order.
--------------------------------------------------------*/
//Import and package essentials
package src.com.MainFile;

import java.util.Scanner;

//Create Main class to support the entire order system
public class zzMain {
    // Instanced zzOrder for managing
    private static zzOrder zzOrderManager = new zzOrder();
    // Instanced zzDisplay for order details
    private static zzDisplay zzDisplayManager = new zzDisplay();

    // Initialize scanner for user input
    public static void main(String[] args) {
        Scanner zzSc = new Scanner(System.in);

        // Will loop until user makes a decision
        while (true) {
            // Potential Options
            System.out.println("\nZoheb Mart Cart:");
            System.out.println("1. Place an Order");
            System.out.println("2. Process an Order");
            System.out.println("3. Display Current Orders");
            System.out.println("4. Exit");
            System.out.print("Enter your choice with the corresponding number: ");

            // User's choice from input picked up by zzSc
            int zzChoice = zzSc.nextInt();
            zzSc.nextLine(); // Consume the leftover newline

            // Switch case to handle various scenarios dictated by customer's decision
            switch (zzChoice) {
                // Order information acquired from User which otherwise would be acquired from a
                // database based on existing information
                case 1:
                    System.out.print("Enter customer's last name: ");
                    String zzLastName = zzSc.nextLine(); // Use nextLine() for spaces
                    System.out.print("Enter product model: ");
                    String zzModel = zzSc.nextLine(); // Use nextLine() for spaces
                    System.out.print("Enter product price: ");
                    double zzPrice = 0.0;
                    try {
                        zzPrice = zzSc.nextDouble();
                        zzSc.nextLine(); // Consume the leftover newline
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Invalid price input. Please enter a valid number.");
                        zzSc.nextLine(); // Consume the invalid input
                        continue;
                    }
                    // Manage the order information here
                    zzOrderManager.zzAddOrder(zzLastName, zzModel, zzPrice);
                    break;

                // The items in the order will become processed
                case 2:
                    zzOrderDetails zzProcessedOrder = zzOrderManager.zzProcessOrder();
                    if (zzProcessedOrder != null) {
                        System.out.println("Processed: " + zzProcessedOrder);
                    }
                    break;

                // Will display items in current order
                case 3:
                    zzDisplayManager.zzDisplayOrders(zzOrderManager.zzGetOrders());
                    break;

                // Exit Program
                case 4:
                    zzSc.close();
                    System.out.println("Exiting the Zoheb Mart Order System...");
                    System.exit(0);
                    break;

                // If no valid option is selected, tell the user what is valid
                default:
                    System.out.println("Please enter a valid input which can only be 1-4.");
            }
        }
    }
}