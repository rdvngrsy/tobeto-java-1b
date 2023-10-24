package org.example;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı.";
        System.out.println(mesaj);

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setImageUrl("bilmemne1.jpg");
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(1);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(8);
        product2.setImageUrl("bilmemne2.jpg");
        product2.setUnitPrice(6500);
        product2.setUnitsInStock(3);

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(6);
        product3.setImageUrl("bilmemne3.jpg");
        product3.setUnitPrice(8500);
        product3.setUnitsInStock(6);

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05333331212");
        individualCustomer.setCustomerNumber("22");
        individualCustomer.setFirstName("Rıdvan");
        individualCustomer.setLastName("Gürsoy");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Gursoy Turizm");
        corporateCustomer.setPhone("05557757575");
        corporateCustomer.setTaxNumber("11111111111");
        corporateCustomer.setCustomerNumber("535353");

        Customer[] customers = {individualCustomer, corporateCustomer};
        System.out.println(customers[1].getPhone());

    }
}