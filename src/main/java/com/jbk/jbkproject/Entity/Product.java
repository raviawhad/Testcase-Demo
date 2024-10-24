package com.jbk.jbkproject.Entity;

public class Product {
    private Long productId;
    private String productName;
    private Long supplierId;
    private Long categoryId;
    private int ProductQty;
    private double productPrice;


    public Product(Long productId, String productName, Long supplierId, Long categoryId, int productQty, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.supplierId = supplierId;
        this.categoryId = categoryId;
        ProductQty = productQty;
        this.productPrice = productPrice;
    }

    public Product() {

    }

    public Product(String productName, double productPrice, Long productQty, Long categoryId, Long supplierId) {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public int getProductQty() {
        return ProductQty;
    }

    public void setProductQty(int productQty) {
        ProductQty = productQty;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", supplierId=" + supplierId +
                ", categoryId=" + categoryId +
                ", ProductQty=" + ProductQty +
                ", productPrice=" + productPrice +
                '}';
    }
}