package com.woafes.stu_economy.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.woafes.stu_economy.R;

public class LeaderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader);
    }

    @Override
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);
    }
}