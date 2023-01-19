package com.example.salestax;

import java.util.*;

public class Receipt {
    List<ReceiptEntry> receiptEntryList =new ArrayList<>();
    double totalTax=0; //sum of sales tax on all entries in the list
    double totalBillAmount=0; // total amount to be paid i.e. (price + tax) of all entries in the list
    public Receipt(){

    }
    public Receipt(Basket basket){
        String name;
        double price;
        double salesTax;
        double shelfPrice;
        for (Item item: basket.getListOfItems()
        ) {
            name = item.getName();
            price = item.getPrice();
            salesTax = item.getSalesTax();


            ReceiptEntry entry =new ReceiptEntry(name,price);
            entry.setSalesTax(salesTax);
            entry.setShelfPrice();
            addEntryToList(entry);

        }

    }
    public void addEntryToList(ReceiptEntry entry){
        receiptEntryList.add(entry);
    }
    public void calculateTotalTax(){
        double total=0;
        for (ReceiptEntry entry:receiptEntryList){
            total+= entry.getSalesTax();
        }
        totalTax=total;
    }
    public void calculateTotalBillAmount(){
        double total=0;
        for (ReceiptEntry entry:receiptEntryList){
            total+= entry.getPrice();
            total+= entry.getSalesTax();
        }
        totalBillAmount=total;
    }
    public void addToTotalBillAmount(double amount){
        totalBillAmount+=amount;
    }
    public double getTotalTax(){ return totalTax;}
    public double getTotalBillAmount(){ return totalBillAmount;}
    public List<ReceiptEntry> getReceiptEntryList(){ return  receiptEntryList;}
}
