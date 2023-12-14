package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Victory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);
    }

    @Override public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onResume() {
        overridePendingTransition(0, 0);
        super.onResume();
        TextView tv = findViewById(R.id.textView11);
        tv.setAlpha(0);

        Data._end = 1;
        Data.save();

        String s = "";

        for (int i = 0; i < 4; i++){
            if (Data._leader[i] != "") s += Data._leader[i] + "\n";
        }
        tv.setText(s);
        tv.animate().alpha(1).setDuration(1500).start();
    }

    public void goMain(View V){
        Intent intent = new Intent(V.getContext(), MainActivity.class);
        startActivity(intent);
    }
}