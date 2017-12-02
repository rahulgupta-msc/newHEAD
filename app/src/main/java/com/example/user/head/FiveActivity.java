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

public class FiveActivity extends Activity {
    String[] bloodgroup;


    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        bloodgroup = getResources().getStringArray(R.array.Bloodgroup);

        Spinner S8= (Spinner) findViewById(R.id.spinner8);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,bloodgroup);
        S8.setAdapter(adapter1);

        S8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

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

