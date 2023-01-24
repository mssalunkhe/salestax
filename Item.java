package com.example.salestax;

public class Item {
    private String name;
    private ItemType type;// food/medicine/book/other
    private ItemCategory category;//Imported or other
    private double price;
    private double salesTax=0;
    public Item(String name, double price)  {
        this.name=name;
        this.price=price;

    }
    public void setType(ItemType type){
        this.type=type;
    }
    public void setCategory(ItemCategory category){
        this.category=category;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setName(String name){
        this.name=name;
    }
    public void calculateSalesTax(){
        double taxRate=0;

        switch (category){

            case IMPORTED -> {
                taxRate+=5;
            }
            case LOCAL -> {
                taxRate+=0;
            }
            default -> throw new IllegalStateException("Unexpected value: " + category);
        }
        switch (type){
            case OTHER -> {
                taxRate+=10;
            }
            case BOOK, MEDICINE, FOOD -> {
                taxRate+=0;
            }

            default -> throw new IllegalStateException("Unexpected value: " + type);

        }
        double tax=price*taxRate/100;
        salesTax= Math.ceil(tax*20.0)/20.0; //rounding value to 0.05



    }

    public double getPrice(){ return price;}
    public String getName(){ return name;}
    public ItemType getItemType(){ return type;}
    public ItemCategory getItemCategory(){ return category;}
    public double getSalesTax(){ return salesTax;}
}
