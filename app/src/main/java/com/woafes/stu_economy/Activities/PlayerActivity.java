package com.woafes.stu_economy.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.woafes.stu_economy.EventBus.BusStation;
import com.woafes.stu_economy.R;
import com.woafes.stu_economy.ViewModels.PlayerActivityViewModel;

public class PlayerActivity extends AppCompatActivity {

    private PlayerActivityViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        vm = new ViewModelProvider(this).get(PlayerActivityViewModel.class);
    }

    @Override
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);
    }

    public void goContractActivity(View V){
        Intent intent = new Intent(this, ContractActivity.class);
        startActivity(intent);
    }

    public void goCompCostActivity(View V){
        Intent intent = new Intent(this, CompCostActivity.class);
        startActivity(intent);
    }

    public void goRulesActivity(View V){
        Intent intent = new Intent(this, RulesActivity.class);
        startActivity(intent);
    }

    public void goReferenceActivity(View V){
        Intent intent = new Intent(this, ReferenceActivity.class);
        startActivity(intent);
    }

    public void goMainActivity(View V){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}