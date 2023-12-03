package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.webkit.WebView;
import android.view.View;

public class rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        WebView webView = findViewById(R.id.rulesPage);
        Object d = getApplicationContext().getTheme();
        if (getColor(R.color.bg) != -11711155){
            webView.loadUrl("file:///android_asset/rules.html");
        }
        else {
            webView.loadUrl("file:///android_asset/rulesWhite.html");
        }
        webView.setBackgroundColor(getColor(R.color.transparent));
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
    }

    @Override public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);
    }
    
}