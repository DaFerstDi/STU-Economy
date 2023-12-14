package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        Data.setDefault();
        Intent intent = new Intent(this, Command_enter.class);
        startActivity(intent);
    }

    public void goReturnGame(View v) {
        if (Data.load()){
            if (Data._end == 0){
                Intent intent = new Intent(this, Year_display.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(this, "Пожалуйста, начните новую игру.", Toast.LENGTH_SHORT).show();
            }

        }
        else {
            Toast.makeText(this, "Ошибка загрузки. Начните новую игру.", Toast.LENGTH_SHORT).show();
        }
    }


}