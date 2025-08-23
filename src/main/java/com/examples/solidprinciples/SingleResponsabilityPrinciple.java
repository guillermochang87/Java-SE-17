package com.examples.solidprinciples;

public class SingleResponsabilityPrinciple {

    /*
     * This principle states that "A class should have only one reason to change"
     * which means every class should have a single responsibility or single job or
     * single purpose. In other words, a class should have only one job or purpose
     * within the software system.
     */

    // Class for baking bread
    static class BreadBaker {
        public void bakeBread() {
            System.out.println("Baking high-quality bread...");
        }
    }

    // Class for managing inventory
    static class InventoryManager {
        public void manageInventory() {
            System.out.println("Managing inventory...");
        }
    }

    // Class for ordering cupplies
    static class SupplyOrder {
        public void orderSuplies() {
            System.out.println("Ordering supplies...");
        }
    }

    // Class for serving customers
    static class CustomerService {
        public void serveCustomer() {
            System.out.println("Serving customers...");
        }
    }

    // Class for cleaning the bakery
    static class BakeryCleaner {
        public void cleanBakery() {
            System.out.println("Claning the bakery...");
        }
    }

    public static void main(String[] args) {
        // Each class focuses on its specific responsability
        BreadBaker baker = new BreadBaker();
        InventoryManager inventoryManager = new InventoryManager();
        SupplyOrder supplyOrder = new SupplyOrder();
        CustomerService customerService = new CustomerService();
        BakeryCleaner cleaner = new BakeryCleaner();

        baker.bakeBread();
        inventoryManager.manageInventory();
        supplyOrder.orderSuplies();
        customerService.serveCustomer();
        cleaner.cleanBakery();

    }

}
