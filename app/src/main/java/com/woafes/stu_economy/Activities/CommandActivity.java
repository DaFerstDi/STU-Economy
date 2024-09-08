package com.woafes.stu_economy.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.woafes.stu_economy.Models.Command;
import com.woafes.stu_economy.Models.DialogShower;
import com.woafes.stu_economy.R;
import com.woafes.stu_economy.ViewModels.CommandActivityViewModel;

public class CommandActivity extends AppCompatActivity {

    private CommandActivityViewModel vm;
    private Command _comand;
    private Dialog dialog;
    private TextView cmdName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);

        vm = new ViewModelProvider(this).get(CommandActivityViewModel.class);

        _comand = vm.get_command().getValue();

        dialog = new Dialog(CommandActivity.this);
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

        cmdName = findViewById(R.id.cmd_name_tw);
        cmdName.setText(_comand.get_name());
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
                vm.clearLastSave();
                _comand = vm.get_command().getValue();
                dialog.cancel();
            }
        });

        dialog.setNoClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vm.createNewCommandGroup();
                _comand = vm.get_command().getValue();
                dialog.cancel();
            }
        });

        dialog.show();
    }

    public void prevCmd(View V){
        vm.setPrevCommand();
        _comand = vm.get_command().getValue();
        if (_comand != null) {
            cmdName.setText(_comand.get_name());
        }
    }

    public void nextCmd(View V){
        vm.setNextCommand();
        _comand = vm.get_command().getValue();
        if (_comand != null) {
            cmdName.setText(_comand.get_name());
        }
    }
}