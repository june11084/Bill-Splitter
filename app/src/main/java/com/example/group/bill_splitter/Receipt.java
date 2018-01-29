package com.example.group.bill_splitter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//Each row in the database can be represented by an object
//Columns will represent the objects properties
public class  Receipt {

    private int _id;
    private String _receiptname;
    private float _price;
    private int _quantity;
    private String type;

    public Receipt(String _type)
    {
        this.type = _type;
    }



    public Receipt(String _receiptname, int _quantity, float _price, String _type){
        this._receiptname = _receiptname;
        this._quantity = _quantity;
        this._price = _price;
        this.type = _type;

    }

    public void set_receiptname(String _receiptname) {
        this._receiptname = _receiptname;
    }

    public String get_receiptname() {return _receiptname;}

    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_id() {
        return _id;
    }


    public void setprice(float price) {this._price = price;}

    public float getprice(){return _price;}

    public void setType(String type){this.type = type;}

    public String getType(){return type;}

    public void setQuantity(int quantity){this._quantity = quantity;}

    public int getQuantity(){return _quantity;}


    //    public abstract String getType();
    public String currentDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        Date date = new Date();
        return dateFormat.format(date);

    }


}