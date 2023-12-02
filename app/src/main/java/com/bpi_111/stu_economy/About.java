package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
    }

    @Override public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void imageClickAbout(View v){
        if (Data._easter == -666){
            //Data._easter = -96;
            Intent intent = new Intent(this, Easter.class);
            startActivity(intent);
        }
    }
}