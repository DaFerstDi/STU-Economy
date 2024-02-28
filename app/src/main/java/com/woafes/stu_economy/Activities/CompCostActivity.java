package com.woafes.stu_economy.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;

import com.woafes.stu_economy.Models.Command;
import com.woafes.stu_economy.Models.DialogShower;
import com.woafes.stu_economy.Models.Values;
import com.woafes.stu_economy.R;
import com.woafes.stu_economy.ViewModels.CompCostViewModel;

import java.util.ArrayList;

public class CompCostActivity extends AppCompatActivity {
    private Command _command;
    private CompCostViewModel vm;

    ArrayList<Values> values = new ArrayList<Values>();

    private RecycleViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_cost);

        vm = new ViewModelProvider(this).get(CompCostViewModel.class);
        vm.setContext(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);

        vm.get_Command().observe(this, new Observer<Command>() {
            @Override
            public void onChanged(Command command) {
                _command = command;
            }
        });

        vm.getCost().observe(this, new Observer<Long>() {
            @Override
            public void onChanged(Long aLong) {
                DialogShower dialog = new DialogShower(CompCostActivity.this,
                        getString(R.string.comp_cost),
                        getString(R.string.comp_your_cost) + "\n" + String.valueOf(aLong),
                        getString(R.string.next));

                dialog.setYesClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });

                dialog.show();
            }
        });

        try {
            RecyclerView recyclerView = findViewById(R.id.RecyclerView);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setHasFixedSize(true);

            adapter = new RecycleViewAdapter(vm, this);
            recyclerView.setAdapter(adapter);
        }
        catch (Exception e){
            Log.e("AAA", e.getMessage());
        }

        SwitchCompat max_carr = findViewById(R.id.switchMaxCarriage);
        SwitchCompat max_points = findViewById(R.id.switchMaxPoints);

        max_carr.setChecked(_command.is_maxCarriage());
        max_points.setChecked(_command.is_maxPoints());

        max_carr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vm.setIsMaxCarriage(max_carr.isChecked());
            }
        });

        max_points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vm.setIsMaxPoints(max_points.isChecked());
            }
        });

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("AAA", "CompCostActivity destroyed");
    }

    public void calculateCost(View v){
        vm.getCompCost();
    }

    public void goPlayerActivity(View V) {
        Intent intent = new Intent(this, PlayerActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }
}