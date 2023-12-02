package com.bpi_111.stu_economy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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

    @Override public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Year_display.this);
        builder.setTitle(R.string.exitMain)
                .setMessage(R.string.progressNoSave)
                .setCancelable(true)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);

        ImageView iv = findViewById(R.id.imageView6);
        TextView tv = findViewById(R.id.textView10);

        iv.setX(-750);
        tv.setAlpha(0.001f);
        iv.animate().x(1500).setDuration(2000).start();
        if (Data._cubes) {
            tv.setTextSize(50);
            tv.setText("ГОД " + Data._year);
        }
        else {
            tv.setTextSize(40);
            tv.setText("КОНЕЦ ГОДА");
        }
        tv.animate().alpha(1.0f).setDuration(400).setStartDelay(800).start();


        Handler handler = new Handler();
        Listener();
    }

    private void goNext(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                if (Data._cubes) {
                    Intent intent = new Intent(getApplicationContext(), Cubes.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), Enter_values.class);
                    startActivity(intent);
                }
            }
        }, 1800);
    }

    private void Listener(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            public void run() {

                TextView tv = findViewById(R.id.textView10);
                if (tv.getAlpha() == 1.0f) {
                    tv.animate().alpha(0).setDuration(1000).start();
                    goNext();
                }
                else {
                    Listener();
                }
            }
        }, 500);
    }


}