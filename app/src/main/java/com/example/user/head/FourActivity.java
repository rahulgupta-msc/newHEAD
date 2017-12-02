
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

public class FourActivity extends Activity {
    String[] lbd;
    String[] bloodgroup;

    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        lbd = getResources().getStringArray(R.array.Lbd);
        bloodgroup = getResources().getStringArray(R.array.Bloodgroup);
        Spinner S3= (Spinner) findViewById(R.id.spinner3);
        Spinner S7= (Spinner) findViewById(R.id.spinner7);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,lbd);
        S3.setAdapter(adapter1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,bloodgroup);
        S7.setAdapter(adapter2);
        S3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                int index = arg0.getSelectedItemPosition();

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
        S7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

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