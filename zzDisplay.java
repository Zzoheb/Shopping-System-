/*--------------------------------------------------------
Program Name: Order List Handler for an Online Retailer
Author: Zoheb Khan
Date: 09/28/23
----------------------------------------------------------
Pseudocode:
//Import essential packages and package needed class
//Presents order details to the user with the zzDisplay class
    //Display the orders which were passed to this method back to the user
----------------------------------------------------------
Program Inputs: User made input on what case to handle.  User input order information.
Program Outputs: Processing of a user made order.
--------------------------------------------------------*/
//Import essential packages and package needed class
package src.com.MainFile;

import java.util.LinkedList;

//Presents order details to the user with the zzDisplay class
public class zzDisplay {
    // Display the orders which were passed to this method back to the user
    public void zzDisplayOrders(LinkedList<zzOrderDetails> zzOrders) {
        System.out.println("--- Existing Orders ---");// Prints tittle
        for (zzOrderDetails zzOrder : zzOrders) { // Loops the ordered list
            System.out.println(zzOrder); // Prints the list back out
        }
    }
}
