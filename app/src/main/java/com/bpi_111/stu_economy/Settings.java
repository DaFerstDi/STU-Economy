package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.Switch;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }

    @Override public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
        CheckBox cb = findViewById(R.id.checkBox);
        cb.setChecked(Data._dark_theme == 1);



    }
    public void onClickCk1(View v) {
        CheckBox cb = findViewById(R.id.checkBox);
        if (cb.isChecked()){
            Data._dark_theme = 1;
            Data.saveSett();
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        else{
            Data._dark_theme = 0;
            Data.saveSett();
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}

