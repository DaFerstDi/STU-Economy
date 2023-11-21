package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.ProgressBar;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
        CheckBox cb = findViewById(R.id.checkBox);
        cb.setChecked(Data._new_comm_inp == 1);



    }
    public void onClickCk1(View v) {
        CheckBox cb = findViewById(R.id.checkBox);
        if (cb.isChecked()){
            Data._new_comm_inp = 1;
        }
        else{
            Data._new_comm_inp = 0;
        }
    }
}

