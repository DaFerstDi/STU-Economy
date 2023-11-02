package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        WebView webView = findViewById(R.id.rulesPage);
        webView.loadUrl("file:///android_asset/rules.html");
    }
}