package com.woafes.stu_economy.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.woafes.stu_economy.EventBus.BusStation;
import com.woafes.stu_economy.Models.Command;
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

                /*
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
                 */

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
        dialog.setContentView(R.layout.custom_alert_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);

        TextView _title, _text;
        _title = dialog.findViewById(R.id.dialog_title);
        _text = dialog.findViewById(R.id.dialog_text);
        Button _yes, _no;
        _yes = dialog.findViewById(R.id.dialog_yes_b);
        _no = dialog.findViewById(R.id.dialog_no_b);

        _title.setText(R.string.load_game);
        _text.setText(getString(R.string.last_save) + "\n" + _comand.get_lastSave());
        _yes.setText(R.string.load);
        _no.setText(R.string.newgame);

        _yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _comand.set_lastSave("");
                vm.set_command(_comand);
                dialog.cancel();
            }
        });

        _no.setOnClickListener(new View.OnClickListener() {
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