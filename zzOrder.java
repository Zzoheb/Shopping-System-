/*--------------------------------------------------------
Program Name: Order List Handler for an Online Retailer
Author: Zoheb Khan
Date: 09/28/23
----------------------------------------------------------
Pseudocode:
//Import Required Packages and Package requried materials
//Create Class for main file to acess and create zzQueue Linked List.
//Group Order information using zzAddOrder method then into zzOrderDetails
//Add Order Details to the Linked List, zzQueue
//No more order method or process the next order
//Acquire orders copy from order in queue
//Structure of individual order information
//Contructor which wll initialize an order detail
//Return order in string

----------------------------------------------------------
Program Inputs: User made input on what case to handle.  User input order information.
Program Outputs: Processing of a user made order.
--------------------------------------------------------*/
//Import Required Packages and Package requried materials
package src.com.MainFile;

import java.util.LinkedList;

//Create Class for main file to acess and create zzQueue Linked List.
public class zzOrder {
    private LinkedList<zzOrderDetails> zzQueue = new LinkedList<>();

    // Group Order information using zzAddOrder method then into zzOrderDetails
    public void zzAddOrder(String zzCustomerLastName, String zzProductModel, double zzPrice) {
        zzOrderDetails zzNewOrder = new zzOrderDetails(zzCustomerLastName, zzProductModel, zzPrice); // Instanced
        // Add Order Details to the Linked List, zzQueue
        zzQueue.add(zzNewOrder);
    }

    // No more order method or process the next order
    public zzOrderDetails zzProcessOrder() {
        if (zzQueue.isEmpty()) {
            System.out.println("No more orders to process.");
            return null;
        }
        return zzQueue.remove();
    }

    // Acquire orders copy from order in queue
    public LinkedList<zzOrderDetails> zzGetOrders() {
        return new LinkedList<>(zzQueue);
    }
}

// Structure of individual order information
class zzOrderDetails {
    String zzCustomerLastName;
    String zzProductModel;
    double zzPrice;

    // Contructor which wll initialize an order detail
    public zzOrderDetails(String zzCustomerLastName, String zzProductModel, double zzPrice) {
        this.zzCustomerLastName = zzCustomerLastName;
        this.zzProductModel = zzProductModel;
        this.zzPrice = zzPrice;
    }

    // Return order in string
    @Override
    public String toString() {
        return "Customer: " + zzCustomerLastName + ", Product Model: " + zzProductModel + ", Price: $" + zzPrice;
    }
}