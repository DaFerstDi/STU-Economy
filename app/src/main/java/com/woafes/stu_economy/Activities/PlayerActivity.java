package com.woafes.stu_economy.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

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
}