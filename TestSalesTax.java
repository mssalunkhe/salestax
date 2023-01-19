package com.example.salestax;
import org.junit.jupiter.api.Test;

import static com.example.salestax.ItemType.FOOD;
import static com.example.salestax.ItemType.BOOK;
import static com.example.salestax.ItemType.MEDICINE;
import static com.example.salestax.ItemType.OTHER;

import static com.example.salestax.ItemCategory.IMPORTED;
import static com.example.salestax.ItemCategory.LOCAL;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.Assert.assertEquals;

public class TestSalesTax {



    public TestSalesTax(){

    }
    public Basket fillBasket1()  {
        Basket basket= new Basket();
        Item item1 = new Item("Book1",12.49);
        Item item2 = new Item("Music-CD1",14.99);
        Item item3 = new Item("Chocolate",0.85);

        item1.setType(BOOK);
        item1.setCategory(LOCAL);
        item1.calculateSalesTax();

        item2.setType(OTHER);
        item2.setCategory(LOCAL);
        item2.calculateSalesTax();

        item3.setType(FOOD);
        item3.setCategory(LOCAL);
        item3.calculateSalesTax();

        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);


        return basket;
    }
    public Basket fillBasket2()  {
        Basket basket= new Basket();
        Item item1 = new Item("ChocolateBox",10.00);
        Item item2 = new Item("PerfumeBottle",47.50);

        item1.setType(FOOD);
        item1.setCategory(IMPORTED);
        item1.calculateSalesTax();

        item2.setType(OTHER);
        item2.setCategory(IMPORTED);
        item2.calculateSalesTax();

        basket.addItem(item1);
        basket.addItem(item2);

        return basket;

    }
    public Basket fillBasket3()  {
        Basket basket= new Basket();
        Item item1 = new Item("Perfume1",27.99);
        Item item2 = new Item("Perfume2",18.99);
        Item item3 = new Item("HeadachePills",9.75);
        Item item4 = new Item("ChocolateBox",11.25);

        item1.setType(OTHER);
        item1.setCategory(IMPORTED);
        item1.calculateSalesTax();

        item2.setType(OTHER);
        item2.setCategory(LOCAL);
        item2.calculateSalesTax();

        item3.setType(MEDICINE);
        item3.setCategory(LOCAL);
        item3.calculateSalesTax();


        item4.setType(FOOD);
        item4.setCategory(IMPORTED);
        item4.calculateSalesTax();

        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        basket.addItem(item4);

        return basket;
    }
@Test
    public void testBasket1(){
        Basket basket= fillBasket1();
        Receipt receipt =new Receipt(basket);
        receipt.calculateTotalTax();
        receipt.calculateTotalBillAmount();

        assertEquals(1.5, receipt.getTotalTax(),0.001d);
        assertEquals(29.83,receipt.getTotalBillAmount(),0.001d);

    }
    @Test
    public void testBasket2(){
        Basket basket= fillBasket2();
        Receipt receipt =new Receipt(basket);
        receipt.calculateTotalTax();
        receipt.calculateTotalBillAmount();

//        assertEquals(32.19, (receipt.getReceiptEntryList());
        assertEquals(7.65, receipt.getTotalTax(),0.001d);
        assertEquals(65.15,receipt.getTotalBillAmount(),0.001d);

    }
    @Test
    public void testBasket3(){
        Basket basket= fillBasket3();
        Receipt receipt =new Receipt(basket);
        receipt.calculateTotalTax();
        receipt.calculateTotalBillAmount();

        assertEquals(6.65, receipt.getTotalTax(),0.001d);
        assertEquals(74.63,receipt.getTotalBillAmount(),0.001d);

    }




}
