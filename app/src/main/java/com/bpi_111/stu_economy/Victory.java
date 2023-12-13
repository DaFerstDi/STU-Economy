package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

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

        if (Data._leader == 1){
            tv.setText(Data._c1.get("name").toString());
            tv.setTextColor(getResources().getColor(R.color.red));
        }
        if (Data._leader == 2){
            tv.setText(Data._c2.get("name").toString());
            tv.setTextColor(getResources().getColor(R.color.blue));
        }
        if (Data._leader == 3){
            tv.setText(Data._c1.get("name").toString());
            tv.setTextColor(getResources().getColor(R.color.green));
        }
        if (Data._leader == 4){
            tv.setText(Data._c1.get("name").toString());
            tv.setTextColor(getResources().getColor(R.color.yellow));
        }
        tv.animate().alpha(1).setDuration(1500).start();
    }

    public void goMain(View V){
        Intent intent = new Intent(V.getContext(), MainActivity.class);
        startActivity(intent);
    }
}