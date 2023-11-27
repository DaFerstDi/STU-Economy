package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Year_display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_display);
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);

        ImageView iv = findViewById(R.id.imageView6);
        TextView tv = findViewById(R.id.textView10);

        iv.setX(-750);
        tv.setAlpha(0.0001f);
        iv.animate().x(1500).setDuration(3000).start();
        if (Data._cubes) {
            tv.setTextSize(50);
            tv.setText("ГОД " + Data._year);
        }
        else {
            tv.setTextSize(40);
            tv.setText("КОНЕЦ ГОДА");
        }
        tv.animate().alpha(1).setDuration(200).setStartDelay(1300).start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                tv.animate().alpha(0).setDuration(2000).start();
            }
        }, 1000);

        handler.postDelayed(new Runnable() {
            public void run() {
                if (Data._cubes) {
                    Data._cubes = false;
                    Intent intent = new Intent(getApplicationContext(), Cubes.class);
                    startActivity(intent);
                }
                else {
                    Data._cubes = true;
                    Intent intent = new Intent(getApplicationContext(), Enter_values.class);
                    startActivity(intent);
                }
            }
        }, 3000);

    }


}