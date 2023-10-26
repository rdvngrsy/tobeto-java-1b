package org.example.packages;


public class Product{


    public Product(String productName, String productId, int productPrice,Category category) {
        this.category = category;
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    String productName;
    String productId;
    int productPrice;
    Category category;

    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getCategory() {
        return category.getCategoryName();
    }

}
