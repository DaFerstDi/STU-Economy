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
            Intent intent = new Intent(this, activity_game.class);
            startActivity(intent);
    }
    public void goRulesActivity(View v) {
            Intent intent = new Intent(this, rules.class);
            startActivity(intent);
    }

    public void goAboutActivity(View v) {
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
    }

    public void goSettingsActivity(View v) {
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);
    }

    @Override public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.exit_ask)
                .setCancelable(true)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
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
}