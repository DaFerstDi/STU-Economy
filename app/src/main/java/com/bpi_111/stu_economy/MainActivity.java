package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void goPlayActivity(View v){
            Intent intent = new Intent(this, activity_game.class);
            startActivity(intent);
    }
    public void goRulesActivity(View v) {
        Intent intent = new Intent(this, rules.class);
        startActivity(intent);
    }
}