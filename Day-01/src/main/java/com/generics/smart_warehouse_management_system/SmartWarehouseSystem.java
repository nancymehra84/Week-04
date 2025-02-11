package com.generics.smart_warehouse_management_system;

//main class
public class SmartWarehouseSystem {
    public static void main(String[] args){
        //storage of different types of item
        Storage<Electronics> electronicsStorage=new Storage<>();
        Storage<Groceries> groceriesStorage=new Storage<>();
        Storage<Furniture> furnitureStorage=new Storage<>();

        //Add items
        electronicsStorage.addItem(new Electronics("Mobile Phone",40000));
        electronicsStorage.addItem(new Electronics("Refrigerator",30000));

        groceriesStorage.addItem(new Groceries("Bread",25));
        groceriesStorage.addItem(new Groceries("Butter",68));

        furnitureStorage.addItem(new Furniture("Sofa",15000));
        furnitureStorage.addItem(new Furniture("Almira",25000));

        //Display
        System.out.println("Electronics:");
        WarehouseUtility.DisplayItems(electronicsStorage.getAllItems());

        System.out.println("\nGroceries:");
        WarehouseUtility.DisplayItems(groceriesStorage.getAllItems());

        System.out.println("\nFurniture:");
        WarehouseUtility.DisplayItems(furnitureStorage.getAllItems());


    }
}
