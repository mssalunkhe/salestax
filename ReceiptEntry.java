package com.example.salestax;

public class ReceiptEntry {
    String name;
    double price;
    double shelfPrice;
    double SalesTax=0;
    int quantity=1;
    public ReceiptEntry(String name, double price){
        this.name=name;
        this.price =price;
    }
    public void setPrice(double price){
        this.price =price;
    }
    public void setSalesTax(double tax){
        this.SalesTax =tax;
    }

    public void setShelfPrice(){
        shelfPrice=price+SalesTax;
    }
    public void setName(String name){
        this.name=name;
    }

    public void addToQuantity(int quantity){
        this.quantity=quantity;
    }
    public double getPrice(){ return price;}
    public double getShelfPrice(){ return shelfPrice;}
    public double getSalesTax(){ return SalesTax;}
    public String getName(){ return name;}


}
