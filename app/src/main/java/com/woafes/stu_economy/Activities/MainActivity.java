package com.woafes.stu_economy.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.woafes.stu_economy.R;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    @Override
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);
    }

    public void goPlayerActivity(View v){
        Intent intent = new Intent(this, PlayerActivity.class); // Пример перехода к другой Activity
        startActivity(intent);
    }
    public void goLeaderActivity(View v) {
        Intent intent = new Intent(this, LeaderActivity.class);
        startActivity(intent);
    }

    public void goRulesActivity(View v) {
        Intent intent = new Intent(this, RulesActivity.class);
        startActivity(intent);
    }

    public void goReferenceActivity(View v) {
        Intent intent = new Intent(this, ReferenceActivity.class);
        startActivity(intent);
    }

    public void goAboutActivity(View V) {
        Intent intent = new Intent(this, AboutActivity.class);
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