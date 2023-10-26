package org.example.packages;

public class Order {

    public Order(String orderNumber, Boolean isDelivered, User user, Product product) {
        this.orderNumber = orderNumber;
        this.isDelivered = isDelivered;
        this.user = user;
        this.product = product;
    }

    String orderNumber;
    Boolean isDelivered;
    User user;
    Product product;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Boolean getDelivered() {
        return isDelivered;
    }

    public void setDelivered(Boolean delivered) {
        isDelivered = delivered;
    }

    public User getUser() {
        return user;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void getProductInfo(){

        String[] showProductInfo = {getProduct().getProductId(),getProduct().getProductName(), String.valueOf(getProduct().getCategory()), String.valueOf(getProduct().getProductPrice())};
        for (int i = 0; i < showProductInfo.length; i++) {
            System.out.println(showProductInfo[i]);
        }
    }

}
