package com.example.group.bill_splitter;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bill extends AppCompatActivity {
//    private EditText electricityinput;
//    private EditText electricitymonths;
//    EditText electricityprice;
//    TextView electricitylist;
//    TextView electricitytotal;
//    private Context instance;
//
//    private Database db;
//
//    public static final String TAG = "Database";
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.popup);
//        instance = this;
//
//        db = new Database(this);
//
//        electricityinput = (EditText) findViewById(R.id.nameinput);
//        electricitymonths = (EditText) findViewById(R.id.quantity);
//        electricityprice = (EditText) findViewById(R.id.price);
//        electricitylist = (TextView) findViewById(R.id.list);
//        electricitylist.setMovementMethod(new ScrollingMovementMethod());
//        electricitytotal = (TextView) findViewById(R.id.total);
//        printElectricityDatabase();
//
//
//        DisplayMetrics dm = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//
//        int width = dm.widthPixels;
//        int height = dm.heightPixels;
//        getWindow().setLayout((int) (width * .8), (int) (height * .8));
//
//    }
//
//
//    private boolean validInput() {
//        try {
//            Integer.parseInt(electricitymonths.getText().toString());
//            Float.parseFloat(electricityprice.getText().toString());
//        } catch (Exception e) {
//            return false;
//        }
//        return true;
//    }
//
//
//    //Add a product to the database
//    public void addButtonClicked(View view) {
//
//        if (!validInput()) {
//            Toast.makeText(instance, "Invalid inputs", Toast.LENGTH_SHORT).show();
//            return;
//        }
//        ElectricityModel receipt = new ElectricityModel();
//        receipt.set_receiptname(electricityinput.getText().toString());
//        receipt.setprice(Float.parseFloat(electricityprice.getText().toString()));
//        receipt.setQuantity(Integer.parseInt(electricitymonths.getText().toString()));
//        db.open();
//        db.addReceipt(receipt);
//        db.close();
//        printElectricityDatabase();
//    }
//
//
//    //Delete items
//    public void deleteButtonClicked(View view) {
//        String inputText = electricityinput.getText().toString();
//        db.open();
//        db.deleteReceipt(inputText);
//        db.close();
//        printElectricityDatabase();
//    }
//
//    public float getElectricitybalance() {
//
//        float electricityBalance = 0;
//        db.open();
//        Cursor c = db.findByType(ElectricityModel.TYPE);
//
//        if (c.moveToFirst()) {
//            while (!c.isAfterLast()) {
//                electricityBalance += c.getFloat(c.getColumnIndex("price"));
//                c.moveToNext();
//            }
//            c.close();
//        }
//        db.close();
//        Log.i(TAG, "return electricitybalance called");
//
//        return electricityBalance;
//    }
//
//
//    public String electricityDBToString() {
//        String dbString = "";
//
//        //Cursor points to a location in your results
//        db.open();
//        Cursor c = db.findByType(ElectricityModel.TYPE);
//        //Move to the first row in your results
//        c.moveToFirst();
//
//        //Position after the last row means the end of the results
//        while (!c.isAfterLast()) {
//            if (c.getString(c.getColumnIndex("receiptname")) != null) {
//                dbString += c.getString(c.getColumnIndex("receiptname"));
//                dbString += "/Months:";
//                dbString += c.getString(c.getColumnIndex("quantity"));
//                dbString += "/$:";
//                dbString += c.getString(c.getColumnIndex("price"));
//                dbString += "/ID: ";
//                dbString += c.getString(c.getColumnIndex("_id"));
//                dbString += "\n";
//            }
//            c.moveToNext();
//        }
//        db.close();
//        return dbString;
//    }
//
//    //Print the database
//    public void printElectricityDatabase() {
//        String electricityDBString = this.electricityDBToString();
//        electricitylist.setText(electricityDBString);
//        String electricityBalance = new Float(this.getElectricitybalance()).toString();
//        electricitytotal.setText(electricityBalance);
//        electricityinput.setText("");
//        electricitymonths.setText("");
//        electricityprice.setText("");
//    }
//

}