package models;

import java.util.ArrayList;



public class Receipt {
    private String receiptName;
    private double total;
    private int id;

    public Receipt(String receiptName) {
        this.receiptName = receiptName;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName;
    }
    public String getReceiptName() {
        return this.receiptName;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

}