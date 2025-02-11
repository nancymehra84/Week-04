package com.generics.smart_warehouse_management_system;

import java.util.List;

//class to display items using wildcards
public class WarehouseUtility {
    public static void DisplayItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item:items){
            System.out.println(item);
        }
    }
}
