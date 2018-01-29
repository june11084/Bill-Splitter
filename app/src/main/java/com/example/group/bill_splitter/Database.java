package com.example.group.bill_splitter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Database extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "receiptsDB.db";
    public static final String TABLE_RECEIPT = "receipts";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_RECEIPTNAME = "receiptname";
    public static final String COLUMN_PRICE = "price";
    public static final String COLUMN_TYPE = "categorytype";
    public static final String COLUMN_QUANTITY = "quantity";

    public static final String TAG = "Database";


    private SQLiteDatabase dbConnection = null;


    // pass database information along to superclass
    public Database(Context context) {
        //public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public boolean open() {
        if (dbConnection == null)
            dbConnection = getWritableDatabase();
        if (dbConnection != null)
            return true;
        else
            return false;
    }

    public void close() {
        if (dbConnection != null)
            dbConnection.close();
        dbConnection = null;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_RECEIPT + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_RECEIPTNAME + " TEXT, " +
                COLUMN_QUANTITY + " INTEGER, " +
                COLUMN_PRICE + " FLOAT, " +
                COLUMN_TYPE + " TEXT" +
                ");";
        db.execSQL(query);
        Log.i(TAG, "onCreate called");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RECEIPT);
        onCreate(db);
        Log.i(TAG, "onUpgrade called");
    }

    //Add a new row to the database
    public void addReceipt(Receipt receipt) {
        Log.i(TAG, "addReceipt called");
        ContentValues values = new ContentValues();
        values.put(COLUMN_RECEIPTNAME, receipt.get_receiptname());
        values.put(COLUMN_QUANTITY, receipt.getQuantity());
        values.put(COLUMN_PRICE, receipt.getprice());
        values.put(COLUMN_TYPE, receipt.getType());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_RECEIPT, null, values);
        db.close();
    }

    public void deleteReceipt(String id) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_RECEIPT + " WHERE " + COLUMN_ID + "=\"" + id + "\";");
    }

    public Cursor findByType(String type) {
        String query = String.format("select * from %s where %s = '%s';", TABLE_RECEIPT, COLUMN_TYPE, type);
        Cursor c = dbConnection.rawQuery(query, null);
        return c;
    }

    public Cursor findByColumn() {
        String query = String.format("select * from %s where %s", TABLE_RECEIPT, COLUMN_PRICE);
        Cursor c = dbConnection.rawQuery(query, null);
        return c;
    }

    public String databaseToString() {
        String dbString = "";
        //SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_RECEIPT;
        //Cursor points to a location in your results
        Cursor c = dbConnection.rawQuery(query, null);
        //Move to the first row in your results
        c.moveToFirst();

        //Position after the last row means the end of the results
        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex("receiptname")) != null) {
                dbString += c.getString(c.getColumnIndex("receiptname"));
                dbString += " /";
                dbString += c.getString(c.getColumnIndex("quantity"));
                dbString += " /";
                dbString += c.getString(c.getColumnIndex("price"));
                dbString += " /";
                dbString += c.getString(c.getColumnIndex("categorytype"));
                dbString += "\n";
            }
            c.moveToNext();
        }
        return dbString;
    }
}