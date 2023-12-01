package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Easter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);

        Button EMMA = findViewById(R.id.EMMA);
        Button EMGA = findViewById(R.id.EMGA);
        Button EMCEA = findViewById(R.id.EMCEA);
        Button EMCA = findViewById(R.id.EMCA);
        Button EMEA = findViewById(R.id.EMEA);
        Button EMRA = findViewById(R.id.EMRA);
        Button EMSA = findViewById(R.id.EMSA);
        Button EMSeA = findViewById(R.id.EMSeA);
        Button EMYDA = findViewById(R.id.EMYDA);
        Button EMSW = findViewById(R.id.EMSW);

    }

    public void EMMAF(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void EMGAF(View v){
        Intent intent = new Intent(getApplicationContext(), activity_game.class);
        startActivity(intent);
    }
    public void EMCEAF(View v){
        Intent intent = new Intent(getApplicationContext(), Command_enter.class);
        startActivity(intent);
    }
    public void EMCAF(View v){
        Intent intent = new Intent(getApplicationContext(), Cubes.class);
        startActivity(intent);
    }
    public void EMEAF(View v){
        Intent intent = new Intent(getApplicationContext(), Enter_values.class);
        startActivity(intent);
    }
    public void EMRAF(View v){
        Intent intent = new Intent(getApplicationContext(), rules.class);
        startActivity(intent);
    }
    public void EMSAF(View v){
        Intent intent = new Intent(getApplicationContext(), Score.class);
        startActivity(intent);
    }
    public void EMSeAF(View v){
        Intent intent = new Intent(getApplicationContext(), Settings.class);
        startActivity(intent);
    }
    public void EMYDAF(View v){
        Intent intent = new Intent(getApplicationContext(), Year_display.class);
        startActivity(intent);
    }
    public void EMSWF(View v){
        ImageView iv = findViewById(R.id.imageView3);
        if (iv.getAlpha() == 0.0f){
            iv.setAlpha(1.0f);
        }
        else {
            iv.setAlpha(0.0f);
        }
    }

    /*

    public void imgClickEgg(View v){
        TextView tv = findViewById(R.id.textViewEgg);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                tv.setText("3");
            }
        }, 1000);
        handler.postDelayed(new Runnable() {
            public void run() {
                tv.setText("2");
            }
        }, 2000);
        handler.postDelayed(new Runnable() {
            public void run() {
                tv.setText("1");
            }
        }, 3000);
        handler.postDelayed(new Runnable() {
            public void run() {
                finish();
            }
        }, 4000);
    }

     */
}