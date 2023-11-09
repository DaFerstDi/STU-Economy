package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

public class gamestart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamestart);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }

    public void sPIN(View v){
        Runnable runnable = new Runnable() {
            public void run() {
                Button b = findViewById(R.id.button6);
                ImageView i1 = findViewById(R.id.imageView10);
                ImageView i2 = findViewById(R.id.imageView11);
                ImageView i3 = findViewById(R.id.imageView12);
                ImageView i4 = findViewById(R.id.imageView13);
                double j = Math.random()*360;
                float i = (float) j;
                b.setRotation(i);
                i1.setRotation(i);
                i2.setRotation(i);
                i3.setRotation(i);
                i4.setRotation(i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}