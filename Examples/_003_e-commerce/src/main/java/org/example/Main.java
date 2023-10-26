package org.example;

import org.example.packages.Category;
import org.example.packages.Order;
import org.example.packages.Product;
import org.example.packages.User;


public class Main {
    public static void main(String[] args) {

        User user1 = new User("Rıdvan","Gürsoy","05333337777","001");
        User user2 = new User("Atiba","Hutchinson","05448885555","002");
        User user3 = new User("Leo","Messi","05666665653","003");


        Category categoryName1 = new Category("Bilgisayar Çevre Birimleri");
        Category categoryName2 = new Category("Telefon");
        Category categoryName3 = new Category("Laptop");

        Product product1 = new Product("Logitech Klavye", "PCKB-15", 999, categoryName1);
        Product product2 = new Product("Iphone 15", "PHON-07", 1100, categoryName2);
        Product product3 = new Product("Dell G16 7630", "LPTP-23", 1400, categoryName3);

        Order order1 = new Order("ORDR-023", true, user1, product1);
        Order order2 = new Order("ORDR-024", false, user3, product2);
        Order order3 = new Order("ORDR-025", true, user2, product3);

        System.out.println(order1.getOrderNumber()+" numaralı siparişin müşteri bilgileri:\n--------------------------------------");
        System.out.println("Müşteri Adı: "+ order1.getUser().getFirstName() +
                           "\nMüşteri Soyadı: "+ order1.getUser().getSurname() +
                           "\nMüşteri Telefon Numarası: "+order1.getUser().getPhoneNumber() +
                           "\nMüşteri Id' si: "+order1.getUser().getCustomerId()+
                           "\nSipariş Teslim Durumu: "+ (order1.getDelivered()?"Teslim edildi.":"Teslim edilmedi")+
                           "\n--------------------------------------");

        System.out.println(order1.getOrderNumber()+" numaralı siparişin ürün bilgileri:\n--------------------------------------");
        System.out.println("Ürün Adı: "+ order1.getProduct().getProductName() +
                "\nÜrün Kategorisi: "+ order1.getProduct().getCategory() +
                "\nÜrün Fiyatı: "+order1.getProduct().getProductPrice() +"₺"+
                "\nÜrün Id' si: "+order1.getProduct().getProductId()+
                "\n--------------------------------------");

        System.out.println("************************************************");

        System.out.println(order2.getOrderNumber()+" numaralı siparişin müşteri bilgileri:\n--------------------------------------");
        System.out.println("Müşteri Adı: "+ order2.getUser().getFirstName() +
                "\nMüşteri Soyadı: "+ order2.getUser().getSurname() +
                "\nMüşteri Telefon Numarası: "+order2.getUser().getPhoneNumber() +
                "\nMüşteri Id' si: "+order2.getUser().getCustomerId()+
                "\nSipariş Teslim Durumu: "+ (order2.getDelivered()?"Teslim edildi.":"Teslim edilmedi")+
                "\n--------------------------------------");

        System.out.println(order2.getOrderNumber()+" numaralı siparişin ürün bilgileri:\n--------------------------------------");
        System.out.println("Ürün Adı: "+ order2.getProduct().getProductName() +
                "\nÜrün Kategorisi: "+ order2.getProduct().getCategory() +
                "\nÜrün Fiyatı: "+order2.getProduct().getProductPrice() +"₺"+
                "\nÜrün Id' si: "+order2.getProduct().getProductId()+
                "\n--------------------------------------");

        System.out.println("************************************************");

        System.out.println(order3.getOrderNumber()+" numaralı siparişin müşteri bilgileri:\n--------------------------------------");
                System.out.println("Müşteri Adı: "+ order3.getUser().getFirstName() +
                "\nMüşteri Soyadı: "+ order3.getUser().getSurname() +
                "\nMüşteri Telefon Numarası: "+order3.getUser().getPhoneNumber() +
                "\nMüşteri Id' si: "+order3.getUser().getCustomerId()+
                "\nSipariş Teslim Durumu: "+ (order3.getDelivered()?"Teslim edildi.":"Teslim edilmedi")+
                "\n--------------------------------------");

        System.out.println(order3.getOrderNumber()+" numaralı siparişin ürün bilgileri:\n--------------------------------------");
        System.out.println("Ürün Adı: "+ order3.getProduct().getProductName() +
                "\nÜrün Kategorisi: "+ order3.getProduct().getCategory() +
                "\nÜrün Fiyatı: "+order3.getProduct().getProductPrice() +"₺"+
                "\nÜrün Id' si: "+order3.getProduct().getProductId()+
                "\n--------------------------------------");




    }
}