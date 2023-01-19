package com.example.salestax;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> listOfItems;
    public Basket() {
        listOfItems =new ArrayList<Item>();

    }
    public void addItem(Item item){
        listOfItems.add(item);
    }
    public List<Item> getListOfItems(){
        return listOfItems;
    }


}
