package com.woafes.stu_economy.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.woafes.stu_economy.Models.Command;
import com.woafes.stu_economy.Models.DialogShower;
import com.woafes.stu_economy.R;
import com.woafes.stu_economy.ViewModels.PlayerActivityViewModel;

public class PlayerActivity extends AppCompatActivity {

    private PlayerActivityViewModel vm;
    private Command _comand;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        vm = new ViewModelProvider(this).get(PlayerActivityViewModel.class);

        _comand = vm.get_Command().getValue();

        dialog = new Dialog(PlayerActivity.this);
    }

    @Override
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);

        try {
            if (!_comand.get_lastSave().equals("")) {
                showDialog();
            }
        }
        catch (Exception e){
            Log.e("AAA", e.getMessage());
        }
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

    private void showDialog(){

        DialogShower dialog = new DialogShower(this,
                getString(R.string.load_game),
                getString(R.string.last_save) + "\n" + _comand.get_lastSave(),
                getString(R.string.load),
                getString(R.string.newgame));

        dialog.setCancelable(false);
        dialog.setYesClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _comand.set_lastSave("");
                vm.set_command(_comand);
                dialog.cancel();
            }
        });

        dialog.setNoClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Command cmd = new Command("Игрок");
                cmd.set_lastSave("");
                _comand = cmd;
                vm.set_command(cmd);
                dialog.cancel();
            }
        });

        dialog.show();
    }
}