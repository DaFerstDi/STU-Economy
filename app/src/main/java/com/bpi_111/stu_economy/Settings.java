package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

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
        //CheckBox cb = findViewById(R.id.checkBox);
        CheckBox cb2 = findViewById(R.id.checkBox2);
        //cb.setChecked(Data._dark_theme == 1);
        cb2.setChecked(Data._simple_mode == 1);



    }
    public void onClickCk1(View v){ /*
        CheckBox cb = findViewById(R.id.checkBox);
        if (cb.isChecked()){
            //Data._dark_theme = 1;
            //Data.saveSett();
            Toast.makeText(this, "Coming soon.", Toast.LENGTH_SHORT).show();
            cb.setChecked(false);
            //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        else{
            //Data._dark_theme = 0;
            //Data.saveSett();
            Toast.makeText(this, "Coming soon.", Toast.LENGTH_SHORT).show();
            cb.setChecked(false);
            //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }*/

    }


    public void onClickCk2(View v) {

        CheckBox cb2 = findViewById(R.id.checkBox2);
        if (cb2.isChecked()){
            Data._simple_mode = 1;
            Data.saveSett();
            Toast.makeText(this, "Подсчёт очков отключен.\nПрогресс не сохраняется.", Toast.LENGTH_SHORT).show();
        }
        else{
            Data._simple_mode = 0;
            Data.saveSett();
            Toast.makeText(this, "Подсчёт очков включен.\nПрогресс сохраняется.", Toast.LENGTH_SHORT).show();
        }

    }
}

