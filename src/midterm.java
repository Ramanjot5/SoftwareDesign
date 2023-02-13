\package midterm;

import java.util.Scanner;

/**
 * Simulator to add items, print inventory and to search item's quantity.
 *
 * @author Ali Hassan
 * @author Paul Bonenfant
 * modified by Sivagama */
public class InventorySystem {

    public static void main(String[] args) {
        
        Item item1 = new Item(0, 0, null);//No ID, quantity or name assigned.

        /**
         * ramanjotGrover
         */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name of the item to add:");
        String name = input.nextLine();
        
        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();
        
        Item item2 = new Item(++item1.itemID, quantity, name);
        item1.addItem(item2);
        
        Item item5 = new Item(++item1.itemID, quantity, name);
        item1.addItem(item5);
        
        Item item6 = new Item(++item1.itemID, quantity, name);
        item1.addItem(item6);
        
        Item item3 = new Item(++item1.itemID, 5, "ET-2750 printer");
        item1.addItem(item3);

        Item item4 = new Item(++item1.itemID, 10, "MX-34 laptops");
        item1.addItem(item4);

        
        item1.printInventory();
        item2.printInventory();
        item3.printInventory();
        item4.printInventory();
        item5.printInventory();
        item6.printInventory();
        
        
        

        /**
         * Find quantity of a particular item in the inventory.
         */
        System.out.println("Enter ID of the item whose quantity you want to find:");
        int temp_ID = input.nextInt();
        System.out.println("Item's quantity is: " + item1.getItemQuantity(temp_ID));

    }

}
