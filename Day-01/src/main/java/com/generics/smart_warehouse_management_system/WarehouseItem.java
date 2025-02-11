package com.generics.smart_warehouse_management_system;

abstract class WarehouseItem {
     private String name;
     private double price;

    //constructor
    public WarehouseItem(String name, double price) {
        this.name= name;
        this.price= price;
    }

    //getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName()+"-"+name+": Rs"+price;
    }
}
