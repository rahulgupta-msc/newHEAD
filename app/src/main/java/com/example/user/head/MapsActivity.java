package com.example.user.head;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.content.Intent;
public class MapsActivity extends AppCompatActivity {
    private WebView mWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        mWebview = new WebView(this);
        mWebview.loadUrl("https://google.co.in/maps");
        setContentView(mWebview);
    }
}