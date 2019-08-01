package com.example.florida.easydeal;

public class AProduct {

    private int price;
    private String productName;
    private int productImageId;

    public AProduct(int price, String productName, int productImageId) {
        this.price = price;
        this.productName = productName;
        this.productImageId = productImageId;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductImageId() {
        return productImageId;
    }

    public void setProductImageId(int productImageId) {
        this.productImageId = productImageId;
    }
}
