package com.example.user.head;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick1(View view){
        startActivity(new Intent("com.example.user.head.SecondActivity"));
    }
    public void onClick2(View view){
        startActivity(new Intent("com.example.user.head.ThirdActivity"));
    }
    public void onClick3(View view){
        startActivity(new Intent("com.example.user.head.FourActivity"));
    }
    public void onClick4(View view){
        startActivity(new Intent("com.example.user.head.FiveActivity"));
    }

}
