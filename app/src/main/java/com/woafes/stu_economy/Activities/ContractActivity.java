package com.woafes.stu_economy.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.woafes.stu_economy.Models.Contract;
import com.woafes.stu_economy.R;
import com.woafes.stu_economy.ViewModels.ContractActivityViewModel;

public class ContractActivity extends AppCompatActivity {

    private ContractActivityViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contract);

        TextView name = findViewById(R.id.c_name);
        name.setText("Контракт");
        name.setAlpha(1);

        vm = new ViewModelProvider(this).get(ContractActivityViewModel.class);

        try {
            vm.getContract().observe(this, new Observer<Contract>() {
                @Override
                public void onChanged(Contract contract) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(ContractActivity.this);
                    builder.setTitle(R.string.contract)
                            .setCancelable(true)
                            .setMessage("Груз: " + contract.get_cargo() + "\nВагоны: " + contract.get_carriage() + "\nТариф: " + contract.get_cost() * contract.get_carriage() / 10 + "\nНаправление: " + contract
                                    .get_destination())
                            .setPositiveButton(R.string.next, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            });
        }
        catch (Exception e){
            Log.e("AAA", e.getMessage());
        }
    }

    @Override
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);

        SwitchCompat switchCompat = findViewById(R.id.switchContract);

        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!switchCompat.isChecked()){
                    switchCompat.setText(getText(R.string.is_startStage));
                }
                else {
                    switchCompat.setText(getText(R.string.is_mainStage));
                }
            }
        });
    }

    public void calculate(View V){
        TextView yellowT = findViewById(R.id.editTextYellow);
        TextView blueT = findViewById(R.id.editTextBlue);
        TextView redT = findViewById(R.id.editTextRed);
        SwitchCompat sw = findViewById(R.id.switchContract);

        try {
            int yellow = Integer.parseInt(yellowT.getText().toString());
            int blue = Integer.parseInt(blueT.getText().toString());
            int red = Integer.parseInt(redT.getText().toString());
            boolean mainStage = sw.isChecked();

            if (yellow > 1 && yellow < 13 && blue > 1 && blue < 13 && red > 0 && red < 7) {
                vm.getContractByDice(yellow, blue, red, mainStage);
                yellowT.setText("");
                blueT.setText("");
                redT.setText("");
            }
            else {
                Toast.makeText(this, "Проверьте правильность ввода и повторите попытку.", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e){
            Log.e("AAA", e.getMessage());
            Toast.makeText(this, "Проверьте правильность ввода и повторите попытку.", Toast.LENGTH_SHORT).show();
        }
    }
}