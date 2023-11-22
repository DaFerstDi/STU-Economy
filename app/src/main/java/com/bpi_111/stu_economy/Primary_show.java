package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Primary_show extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_show);
    }

    @Override
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);

        TextView pvV = findViewById(R.id.ps_view_pv);
        TextView cisV = findViewById(R.id.ps_view_cis);
        TextView plV = findViewById(R.id.ps_view_pl);
        TextView krV = findViewById(R.id.ps_view_kr);
        TextView money = findViewById(R.id.ps_money);
        TextView points = findViewById(R.id.ps_points);
        TextView cmd = findViewById(R.id.ps_c_name);

        if (Data._move == 1) {
            cmd.setText("Команда:\n" + Data._c1.get("name").toString());
            pvV.setText(Data._c1.get("pv").toString());
            cisV.setText(Data._c1.get("cis").toString());
            plV.setText(Data._c1.get("pl").toString());
            krV.setText(Data._c1.get("kr").toString());
            money.setText(Data._c1.get("money").toString());
            points.setText(Data._c1.get("points").toString());
        }

        else if (Data._move == 2) {
            cmd.setText("Команда:\n" + Data._c2.get("name").toString());
            pvV.setText(Data._c2.get("pv").toString());
            cisV.setText(Data._c2.get("cis").toString());
            plV.setText(Data._c2.get("pl").toString());
            krV.setText(Data._c2.get("kr").toString());
            money.setText(Data._c2.get("money").toString());
            points.setText(Data._c2.get("points").toString());
        }

        else if (Data._move == 3) {
            cmd.setText("Команда:\n" + Data._c3.get("name").toString());
            pvV.setText(Data._c3.get("pv").toString());
            cisV.setText(Data._c3.get("cis").toString());
            plV.setText(Data._c3.get("pl").toString());
            krV.setText(Data._c3.get("kr").toString());
            money.setText(Data._c3.get("money").toString());
            points.setText(Data._c3.get("points").toString());
        }

        else if (Data._move == 4) {
            cmd.setText("Команда:\n" + Data._c4.get("name").toString());
            pvV.setText(Data._c4.get("pv").toString());
            cisV.setText(Data._c4.get("cis").toString());
            plV.setText(Data._c4.get("pl").toString());
            krV.setText(Data._c4.get("kr").toString());
            money.setText(Data._c4.get("money").toString());
            points.setText(Data._c4.get("points").toString());
        }
    }

    public void ps_buy_pv(View V){
        AlertDialog.Builder builder = new AlertDialog.Builder(Primary_show.this);
        builder.setTitle("Покупка вагонов")
                .setMessage(R.string.ps_buy_pv)
                .setCancelable(true)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (Data._move == 1 && Integer.parseInt(Data._c1.get("money").toString()) >= 1200000){
                            Data._c1.put("money", Integer.parseInt(Data._c1.get("money").toString())-1200000);
                            Data._c1.put("pv", Integer.parseInt(Data._c1.get("pv").toString())+20);
                        }
                        else if (Data._move == 2 && Integer.parseInt(Data._c2.get("money").toString()) >= 1200000){
                            Data._c2.put("money", Integer.parseInt(Data._c2.get("money").toString())-1200000);
                            Data._c2.put("pv", Integer.parseInt(Data._c2.get("pv").toString())+20);
                        }
                        else if (Data._move == 3 && Integer.parseInt(Data._c3.get("money").toString()) >= 1200000){
                            Data._c3.put("money", Integer.parseInt(Data._c3.get("money").toString())-1200000);
                            Data._c3.put("pv", Integer.parseInt(Data._c3.get("pv").toString())+20);
                        }
                        else if (Data._move == 4 && Integer.parseInt(Data._c4.get("money").toString()) >= 1200000){
                            Data._c4.put("money", Integer.parseInt(Data._c4.get("money").toString())-1200000);
                            Data._c4.put("pv", Integer.parseInt(Data._c4.get("pv").toString())+20);
                        }
                        onResume();
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void ps_buy_cis(View V){
        AlertDialog.Builder builder = new AlertDialog.Builder(Primary_show.this);
        builder.setTitle("Покупка вагонов")
                .setMessage(R.string.ps_buy_cis)
                .setCancelable(true)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (Data._move == 1 && Integer.parseInt(Data._c1.get("money").toString()) >= 1600000){
                            Data._c1.put("money", Integer.parseInt(Data._c1.get("money").toString())-1600000);
                            Data._c1.put("cis", Integer.parseInt(Data._c1.get("cis").toString())+20);
                        }
                        else if (Data._move == 2 && Integer.parseInt(Data._c2.get("money").toString()) >= 1600000){
                            Data._c2.put("money", Integer.parseInt(Data._c2.get("money").toString())-1600000);
                            Data._c2.put("cis", Integer.parseInt(Data._c2.get("cis").toString())+20);
                        }
                        else if (Data._move == 3 && Integer.parseInt(Data._c3.get("money").toString()) >= 1600000){
                            Data._c3.put("money", Integer.parseInt(Data._c3.get("money").toString())-1600000);
                            Data._c3.put("cis", Integer.parseInt(Data._c3.get("cis").toString())+20);
                        }
                        else if (Data._move == 4 && Integer.parseInt(Data._c4.get("money").toString()) >= 1600000){
                            Data._c4.put("money", Integer.parseInt(Data._c4.get("money").toString())-1600000);
                            Data._c4.put("cis", Integer.parseInt(Data._c4.get("cis").toString())+20);
                        }
                        onResume();
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void ps_buy_pl(View V){
        AlertDialog.Builder builder = new AlertDialog.Builder(Primary_show.this);
        builder.setTitle("Покупка вагонов")
                .setMessage(R.string.ps_buy_pl)
                .setCancelable(true)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (Data._move == 1 && Integer.parseInt(Data._c1.get("money").toString()) >= 1000000){
                            Data._c1.put("money", Integer.parseInt(Data._c1.get("money").toString())-1000000);
                            Data._c1.put("pl", Integer.parseInt(Data._c1.get("pl").toString())+20);
                        }
                        else if (Data._move == 2 && Integer.parseInt(Data._c2.get("money").toString()) >= 1000000){
                            Data._c2.put("money", Integer.parseInt(Data._c2.get("money").toString())-1000000);
                            Data._c2.put("pl", Integer.parseInt(Data._c2.get("pl").toString())+20);
                        }
                        else if (Data._move == 3 && Integer.parseInt(Data._c3.get("money").toString()) >= 1000000){
                            Data._c3.put("money", Integer.parseInt(Data._c3.get("money").toString())-1000000);
                            Data._c3.put("pl", Integer.parseInt(Data._c3.get("pl").toString())+20);
                        }
                        else if (Data._move == 4 && Integer.parseInt(Data._c4.get("money").toString()) >= 1000000){
                            Data._c4.put("money", Integer.parseInt(Data._c4.get("money").toString())-1000000);
                            Data._c4.put("pl", Integer.parseInt(Data._c4.get("pl").toString())+20);
                        }
                        onResume();
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void ps_buy_kr(View V){
        AlertDialog.Builder builder = new AlertDialog.Builder(Primary_show.this);
        builder.setTitle("Покупка вагонов")
                .setMessage(R.string.ps_buy_kr)
                .setCancelable(true)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (Data._move == 1 && Integer.parseInt(Data._c1.get("money").toString()) >= 1400000){
                            Data._c1.put("money", Integer.parseInt(Data._c1.get("money").toString())-1400000);
                            Data._c1.put("kr", Integer.parseInt(Data._c1.get("kr").toString())+20);
                        }
                        else if (Data._move == 2 && Integer.parseInt(Data._c2.get("money").toString()) >= 1400000){
                            Data._c2.put("money", Integer.parseInt(Data._c2.get("money").toString())-1400000);
                            Data._c2.put("kr", Integer.parseInt(Data._c2.get("kr").toString())+20);
                        }
                        else if (Data._move == 3 && Integer.parseInt(Data._c3.get("money").toString()) >= 1400000){
                            Data._c3.put("money", Integer.parseInt(Data._c3.get("money").toString())-1400000);
                            Data._c3.put("kr", Integer.parseInt(Data._c3.get("kr").toString())+20);
                        }
                        else if (Data._move == 4 && Integer.parseInt(Data._c4.get("money").toString()) >= 1400000){
                            Data._c4.put("money", Integer.parseInt(Data._c4.get("money").toString())-1400000);
                            Data._c4.put("kr", Integer.parseInt(Data._c4.get("kr").toString())+20);
                        }
                        onResume();
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void ps_next(View v){
        if (Data._move == 1){
            Data._move = 2;
            onResume();
        }
        else if (Data._move == 2){
            Data._move = 3;
            onResume();
        }
        else if (Data._move == 3){
            Data._move = 4;
            onResume();
        }
        else if (Data._move == 4){
            Data._move = 1;
            Data._year = 1;
            Intent intent = new Intent(this, Year_display.class);
            startActivity(intent);
        }
    }
}