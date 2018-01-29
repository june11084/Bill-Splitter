package models;

public class Item {
    private String itemName;
    private double cost;
    private int receiptId;
    private int id;

    public Item(String itemName, double cost, int receiptId) {
        this.itemName = itemName;
        this.cost = cost;
        this.receiptId = receiptId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemName() {
        return this.itemName;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return this.cost;
    }

    public void setReceiptId(int id) {
        this.receiptId = id;
    }

    public int getReceiptId() {
        return this.receiptId;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
}