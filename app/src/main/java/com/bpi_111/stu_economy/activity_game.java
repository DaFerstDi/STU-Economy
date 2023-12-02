package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class activity_game extends AppCompatActivity {

    //ImageView iv = findViewById(R.id.imageView5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }

    @Override
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);
        Data._easter = -4;
    }

    @Override public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void goMainActivity(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goCommandEnterActivity(View v) {
        if (Data._new_comm_inp == 1){
            Data.setDefault();
            Intent intent = new Intent(this, Command_enter.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, Command_enter3.class);
            startActivity(intent);
        }

    }

    public void goReturnGame(View v) {
        if (Data.load()){
            Intent intent = new Intent(this, Year_display.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Ошибка загрузки. Начните новую игру", Toast.LENGTH_SHORT).show();
        }
    }

    public void imageClickGame(View v){
        Data._easter += 1;
    }

}