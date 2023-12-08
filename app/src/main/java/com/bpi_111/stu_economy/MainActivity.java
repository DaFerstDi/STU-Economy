package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private static boolean egigi = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Data.loadSett()) {
            if (Data._dark_theme == 1)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            else AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
        else AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

    }

    @Override
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);
    }

    public void goPlayActivity(View v){
        if (egigi) {
            Button bt = findViewById(R.id.button);
            Random rnd = new Random();
            int width = 1080 - 100;  // deprecated
            int height = 2340 - 100;  // deprecated
            float posX = bt.getX() + rnd.nextInt(1000) - rnd.nextInt(1000),
                    posY = bt.getY() + rnd.nextInt(1000) - rnd.nextInt(1000);
            while (posX > width || posY > height) {
                posX = bt.getX() + rnd.nextInt(1000) - rnd.nextInt(1000);
                posY = bt.getY() + rnd.nextInt(1000) - rnd.nextInt(1000);
            }
            bt.setX(posX);
            bt.setY(posY);
        }
        else {
            Intent intent = new Intent(this, activity_game.class);
            startActivity(intent);
        }
    }
    public void goRulesActivity(View v) {
        if (egigi) {
            Button bt = findViewById(R.id.button2);
            Random rnd = new Random();
            int width = 1080 - 100;  // deprecated
            int height = 2340 - 100;  // deprecated
            float posX = bt.getX() + rnd.nextInt(1000) - rnd.nextInt(1000),
                    posY = bt.getY() + rnd.nextInt(1000) - rnd.nextInt(1000);
            while ((posX > width || posY > height) || (posX < -width || posY < -height)) {
                posX = bt.getX() + rnd.nextInt(1000) - rnd.nextInt(1000);
                posY = bt.getY() + rnd.nextInt(1000) - rnd.nextInt(1000);
            }
            bt.setX(posX);
            bt.setY(posY);
        }
        else {
            Intent intent = new Intent(this, rules.class);
            startActivity(intent);
        }
    }

    public void goAboutActivity(View v) {
        if (egigi) {
            Button bt = findViewById(R.id.button4);
            Random rnd = new Random();
            int width = 1080 - 100;  // deprecated
            int height = 2340 - 100;  // deprecated
            float posX = bt.getX() + rnd.nextInt(1000) - rnd.nextInt(1000),
                    posY = bt.getY() + rnd.nextInt(1000) - rnd.nextInt(1000);
            while (posX > width || posY > height) {
                posX = bt.getX() + rnd.nextInt(1000) - rnd.nextInt(1000);
                posY = bt.getY() + rnd.nextInt(1000) - rnd.nextInt(1000);
            }
            bt.setX(posX);
            bt.setY(posY);
        }
        else {
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
        }
    }

    public void goSettingsActivity(View v) {
        if (egigi) {
            Button bt = findViewById(R.id.button3);
            Random rnd = new Random();
            int width = 1080 - 100;  // deprecated
            int height = 2340 - 100;  // deprecated
            float posX = bt.getX() + rnd.nextInt(1000) - rnd.nextInt(1000),
                    posY = bt.getY() + rnd.nextInt(1000) - rnd.nextInt(1000);
            while (posX > width || posY > height) {
                posX = bt.getX() + rnd.nextInt(1000) - rnd.nextInt(1000);
                posY = bt.getY() + rnd.nextInt(1000) - rnd.nextInt(1000);
            }
            bt.setX(posX);
            bt.setY(posY);
        }
        else {
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);
        }
    }

    @Override public void onBackPressed() {
        egigi = !egigi;
        Intent i = new Intent( this , this.getClass() );
        finish();
        this.startActivity(i);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.exit_ask)
                .setCancelable(true)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton(R.string.TRAIN, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void imageClickMain(View v){
        if (Data._easter == 4){
            Data._easter = -666;
        }
    }
}