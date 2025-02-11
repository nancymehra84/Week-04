package com.generics.smart_warehouse_management_system;

import java.util.List;
import java.util.ArrayList;

public class Storage<T extends WarehouseItem> {
    private List<T> items=new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    public T retrieveItem(int index){
        if(index>=0 && index<items.size()){
            return items.get(index);
        }
        return null;
    }

    public List<T> getAllItems(){
        return items;
    }
}
