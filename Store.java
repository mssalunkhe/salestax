package com.example.salestax;

public class Store {
    private String owner;
    private Basket basket=new Basket();
    private Receipt receipt= new Receipt();
    public Store    (Basket basket){
        this.basket=basket;
    }

    public void prepareReceiptFrom( Basket basket){
        String name;
        double price;
        double salesTax;
        for (Item item: basket.getListOfItems()
             ) {
            name = item.getName();
            price = item.getPrice();
            salesTax = item.getSalesTax();

            ReceiptEntry entry =new ReceiptEntry(name,price);
            entry.setSalesTax(salesTax);
            receipt.addEntryToList(entry);

        }

    }
    public Receipt getReceipt(){
        return receipt;
    }
    public Basket getBasket(){
        return basket;
    }
}
