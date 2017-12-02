
package com.example.user.head;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.widget.Button;
import android.widget.TextView;

import android.database.SQLException;
import android.content.ContentValues;
import android.widget.Toast;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;
import android.widget.Spinner;




public class SecondActivity extends AppCompatActivity{
    String[] disease;
    String[] category;
    SQLiteDatabase db;
    Button chk_avail;
    EditText hosp, beds,loc;
    Spinner categ;

    String S;


    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        chk_avail = (Button) findViewById(R.id.button5);
        hosp = (EditText) findViewById(R.id.editText2);
        beds = (EditText) findViewById(R.id.h1);
        loc = (EditText) findViewById(R.id.tvaddress);







       try {
            db = openOrCreateDatabase("dengue", SQLiteDatabase.CREATE_IF_NECESSARY, null);
            db.execSQL("create table hospital(disease text,city text, location text, hospitalname text, category text, bedavail text)");


        } catch (SQLException e) {
        }

        ContentValues values = new ContentValues();
        values.put("disease", "dengue");
        values.put("city", "kota");
        values.put("location", "talwandi");
        values.put("hospitalname", "sudha");
        values.put("category", "SuperDeluxe");
        values.put("bedavail", "5");

        values.put("disease", "dengue");
        values.put("city", "kota");
        values.put("location", "station");
        values.put("hospitalname", "maitri");
        values.put("category", "General");
        values.put("bedavail", "2");

        values.put("disease", "dengue");
        values.put("city", "kota");
        values.put("location", "talwandi");
        values.put("hospitalname", "kotaheart");
        values.put("category", "ICU");
        values.put("bedavail", "3");

        values.put("disease", "dengue");
        values.put("city", "kota");
        values.put("location", "station");
        values.put("hospitalname", "bharatvikas");
        values.put("category", "General");
        values.put("bedavail", "4");


















        disease = getResources().getStringArray(R.array.Disease);
        category = getResources().getStringArray(R.array.Category);
        Spinner S1 = (Spinner) findViewById(R.id.spinner1);
        Spinner S2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, disease);
        S1.setAdapter(adapter1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, category);
        S2.setAdapter(adapter2);


        S1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                int index = arg0.getSelectedItemPosition();

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });

        S2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                int index = arg0.getSelectedItemPosition();
                 S= arg0.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });


    }
    public void onClickSL(View v){
        startActivity(new Intent(SecondActivity.this, MapsActivity.class ));
    }

    public void onClickCA(View v) {

        Cursor c = db.rawQuery("Select * from hospital" ,null);
        //Cursor c = db.rawQuery("Select * from hospital where hospitalname LIKE '"+hosp.getText().toString()+"'",null);

        c.moveToFirst();
       while (!c.isAfterLast()) {

            beds.setText(c.getString(5));
           c.moveToNext();


        }
        c.close();


    }
}

