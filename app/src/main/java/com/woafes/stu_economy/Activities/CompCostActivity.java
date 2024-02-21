package com.woafes.stu_economy.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.woafes.stu_economy.EventBus.BusStation;
import com.woafes.stu_economy.Models.Values;
import com.woafes.stu_economy.R;
import com.woafes.stu_economy.ViewModels.CompCostViewModel;

import java.util.ArrayList;

public class CompCostActivity extends AppCompatActivity {
    private CompCostViewModel vm;

    ArrayList<Values> values = new ArrayList<Values>();

    private RecycleViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_cost);

        vm = new ViewModelProvider(this).get(CompCostViewModel.class);
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);

        try {
            RecyclerView recyclerView = findViewById(R.id.RecyclerView);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setHasFixedSize(true);

            adapter = new RecycleViewAdapter(vm);
            recyclerView.setAdapter(adapter);
        }
        catch (Exception e){
            Log.e("AAA", e.getMessage());
        }

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("AAA", "CompCostActivity destroyed");
    }

    public void goPlayerActivity(View V) {
        Intent intent = new Intent(this, PlayerActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }
}