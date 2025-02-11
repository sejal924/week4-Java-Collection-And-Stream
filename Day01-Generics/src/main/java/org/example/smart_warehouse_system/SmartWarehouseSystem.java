package org.example.smart_warehouse_system;


    // Main class to demonstrate functionality
    public class SmartWarehouseSystem {
        public static void main(String[] args) {
            Storage<Electronics> electronicsStorage = new Storage<>();
            electronicsStorage.addItem(new Electronics("Laptop", 1000));
            electronicsStorage.addItem(new Electronics("Smartphone", 800));

            Storage<Groceries> groceriesStorage = new Storage<>();
            groceriesStorage.addItem(new Groceries("Apple", 2));
            groceriesStorage.addItem(new Groceries("Milk", 3));

            Storage<Furniture> furnitureStorage = new Storage<>();
            furnitureStorage.addItem(new Furniture("Chair", 50));
            furnitureStorage.addItem(new Furniture("Table", 120));

            System.out.println("Electronics:");
            WarehouseUtil.displayItems(electronicsStorage.getAllItems());

            System.out.println("\nGroceries:");
            WarehouseUtil.displayItems(groceriesStorage.getAllItems());

            System.out.println("\nFurniture:");
            WarehouseUtil.displayItems(furnitureStorage.getAllItems());
        }
    }
