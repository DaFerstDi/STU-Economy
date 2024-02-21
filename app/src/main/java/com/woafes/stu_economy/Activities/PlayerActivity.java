package com.woafes.stu_economy.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.woafes.stu_economy.EventBus.BusStation;
import com.woafes.stu_economy.Models.Command;
import com.woafes.stu_economy.R;
import com.woafes.stu_economy.ViewModels.PlayerActivityViewModel;

public class PlayerActivity extends AppCompatActivity {

    private PlayerActivityViewModel vm;
    private Command _comand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        vm = new ViewModelProvider(this).get(PlayerActivityViewModel.class);

        _comand = vm.get_Command().getValue();
    }

    @Override
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);

        try {
            if (!_comand.get_lastSave().equals("")) {
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle(R.string.load_game);
                alert.setMessage(getString(R.string.last_save) + "\n" + _comand.get_lastSave());
                alert.setCancelable(false);
                alert.setPositiveButton(R.string.load, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        _comand.set_lastSave("");
                        vm.set_command(_comand);
                    }
                });
                alert.setNegativeButton(R.string.newgame, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Command cmd = new Command("Игрок");
                        cmd.set_lastSave("");
                        _comand = cmd;
                        vm.set_command(cmd);

                    }
                });
                alert.show();

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
}