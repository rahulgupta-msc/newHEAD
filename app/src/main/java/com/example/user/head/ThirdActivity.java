package com.example.user.head;

/**
 * Created by user on 11/28/2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;



public class ThirdActivity extends Activity {
    String[] regtype;
    String[] gender;
    String [] bloodgroup;
    String [] category;

    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        regtype = getResources().getStringArray(R.array.Regtype);
        gender = getResources().getStringArray(R.array.Gender);
        bloodgroup = getResources().getStringArray(R.array.Bloodgroup);
        category= getResources().getStringArray(R.array.Category);

        Spinner S4= (Spinner) findViewById(R.id.spinner4);
        Spinner S5= (Spinner) findViewById(R.id.spinner5);
        Spinner S6= (Spinner) findViewById(R.id.spinner6);


        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,gender);
        S4.setAdapter(adapter4);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,bloodgroup);
        S5.setAdapter(adapter5);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,category);
        S6.setAdapter(adapter6);

        S4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                int index = arg0.getSelectedItemPosition();

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
        S5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                int index = arg0.getSelectedItemPosition();

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
        S6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                int index = arg0.getSelectedItemPosition();

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }
}


