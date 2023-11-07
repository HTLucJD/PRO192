/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tan Luc
 */
public class Product implements Comparable<Product>{

    private int productID;
    private String productName;
    private double unitPrice;
    private int quantity, version;
    Date productManufacturingDate;

    public Product() {
    }

    public Product(int productID, String productName, double unitPrice, int quantity, int version, Date productManufacturingDate) {
        this.productID = productID;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.version = version;
        this.productManufacturingDate = productManufacturingDate;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getProductManufacturingDate() {
        return productManufacturingDate;
    }

    public void setProductManufacturingDate(Date productManufacturingDate) {
        this.productManufacturingDate = productManufacturingDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        return productID + ", " + productName + ", " + unitPrice + ", " + quantity 
                + ", " + version + ", " + dateFormat.format(productManufacturingDate) ;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return this.productID == other.productID;
    }

    @Override
    public int compareTo(Product o) {
        return this.productName.compareTo(o.getProductName());
    }
    
}
