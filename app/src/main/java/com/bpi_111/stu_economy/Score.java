package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Score extends AppCompatActivity {
    int c1, c2, c3, c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
    }

    private double Company(int command, String name, int cost) {
        if (command == 1) {
            int n = Integer.parseInt(Data._c1.get(name).toString());
            double k = 1 + 0.2 * n;
            double d = k * n * cost;
            return d;
        }
        if (command == 2) {
            int n = Integer.parseInt(Data._c2.get(name).toString());
            double k = 1 + 0.2 * n;
            return k * n * cost;
        }
        if (command == 3) {
            int n = Integer.parseInt(Data._c3.get(name).toString());
            double k = 1 + 0.2 * n;
            return k * n * cost;
        }
        if (command == 4) {
            int n = Integer.parseInt(Data._c4.get(name).toString());
            double k = 1 + 0.2 * n;
            return k * n * cost;
        }
        return 0.0;
    }

    @Override public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Score.this);
        builder.setTitle(R.string.exitMain)
                .setMessage(R.string.progressNoSave)
                .setCancelable(true)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
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


    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
        c1=Integer.parseInt(Data._c1.get("money").toString());
        c2=Integer.parseInt(Data._c2.get("money").toString());
        c3=Integer.parseInt(Data._c3.get("money").toString());
        c4=Integer.parseInt(Data._c4.get("money").toString());

        TextView p1 = findViewById(R.id.p1_score);
        TextView p2 = findViewById(R.id.p2_score);
        TextView p3 = findViewById(R.id.p3_score);
        TextView p4 = findViewById(R.id.p4_score);


        // Вагоны
        int maxVag = 0;
        int vag1 = Integer.parseInt(Data._c1.get("pv").toString())+
                Integer.parseInt(Data._c1.get("cis").toString())+
                Integer.parseInt(Data._c1.get("pl").toString())+
                Integer.parseInt(Data._c1.get("kr").toString());
        int vag2 = Integer.parseInt(Data._c2.get("pv").toString())+
                Integer.parseInt(Data._c2.get("cis").toString())+
                Integer.parseInt(Data._c2.get("pl").toString())+
                Integer.parseInt(Data._c2.get("kr").toString());
        int vag3 = Integer.parseInt(Data._c3.get("pv").toString())+
                Integer.parseInt(Data._c3.get("cis").toString())+
                Integer.parseInt(Data._c3.get("pl").toString())+
                Integer.parseInt(Data._c3.get("kr").toString());
        int vag4 = Integer.parseInt(Data._c4.get("pv").toString())+
                Integer.parseInt(Data._c4.get("cis").toString())+
                Integer.parseInt(Data._c4.get("pl").toString())+
                Integer.parseInt(Data._c4.get("kr").toString());
        if (vag1>maxVag){ maxVag = vag1;}
        if (vag2>maxVag){ maxVag = vag2;}
        if (vag3>maxVag){ maxVag = vag3;}
        if (vag4>maxVag){ maxVag = vag4;}

        int vag1c = 1200000 * Integer.parseInt(Data._c1.get("pv").toString())/10+
                1600000 * Integer.parseInt(Data._c1.get("cis").toString())/10+
                1000000 * Integer.parseInt(Data._c1.get("pl").toString())/10+
                1400000 * Integer.parseInt(Data._c1.get("kr").toString())/10;
        int vag2c = 1200000 * Integer.parseInt(Data._c2.get("pv").toString())/10+
                1600000 * Integer.parseInt(Data._c2.get("cis").toString())/10+
                1000000 * Integer.parseInt(Data._c2.get("pl").toString())/10+
                1400000 * Integer.parseInt(Data._c2.get("kr").toString())/10;
        int vag3c = 1200000 * Integer.parseInt(Data._c3.get("pv").toString())/10+
                1600000 * Integer.parseInt(Data._c3.get("cis").toString())/10+
                1000000 * Integer.parseInt(Data._c3.get("pl").toString())/10+
                1400000 * Integer.parseInt(Data._c3.get("kr").toString())/10;
        int vag4c = 1200000 * Integer.parseInt(Data._c4.get("pv").toString())/10+
                1600000 * Integer.parseInt(Data._c4.get("cis").toString())/10+
                1000000 * Integer.parseInt(Data._c4.get("pl").toString())/10+
                1400000 * Integer.parseInt(Data._c4.get("kr").toString())/10;


        if (vag1 == maxVag) {
            c1 += vag1c*1.2;
            vag1c = 0;
        }
        if (vag2 == maxVag) {
            c2 += vag2c*1.2;
            vag2c = 0;
        }
        if (vag3 == maxVag) {
            c3 += vag3c*1.2;
            vag3c = 0;
        }
        if (vag4 == maxVag) {
            c4 += vag4c*1.2;
            vag4c = 0;
        }
        c1 += vag1c;
        c2 += vag2c;
        c3 += vag3c;
        c4 += vag4c;


        // Победные очки
        int maxPob = 0;
        int pob1 = Integer.parseInt(Data._c1.get("vict_p").toString());
        int pob2 = Integer.parseInt(Data._c2.get("vict_p").toString());
        int pob3 = Integer.parseInt(Data._c3.get("vict_p").toString());
        int pob4 = Integer.parseInt(Data._c4.get("vict_p").toString());
        if (pob1>maxPob){ maxPob = pob1;}
        if (pob2>maxPob){ maxPob = pob2;}
        if (pob3>maxPob){ maxPob = pob3;}
        if (pob4>maxPob){ maxPob = pob4;}

        int pob1c = 100000 * Integer.parseInt(Data._c1.get("vict_p").toString());
        int pob2c = 100000 * Integer.parseInt(Data._c2.get("vict_p").toString());
        int pob3c = 100000 * Integer.parseInt(Data._c3.get("vict_p").toString());
        int pob4c = 100000 * Integer.parseInt(Data._c4.get("vict_p").toString());

        if (pob1 == maxPob) {
            c1 += pob1c*1.2;
            pob1c = 0;
        }
        if (pob2 == maxPob) {
            c2 += pob2c*1.2;
            pob2c = 0;
        }
        if (pob3 == maxPob) {
            c3 += pob3c*1.2;
            pob3c = 0;
        }
        if (pob4 == maxPob) {
            c4 += pob4c*1.2;
            pob4c = 0;
        }
        c1 += pob1c;
        c2 += pob2c;
        c3 += pob3c;
        c4 += pob4c;


        // Порты
        double ports1K = 1 + 0.2 * (Integer.parseInt(Data._c1.get("ports_okt").toString())+
                Integer.parseInt(Data._c1.get("ports_sk").toString())+
                Integer.parseInt(Data._c1.get("ports_dv").toString()));

        double ports2K = 1 + 0.2 * (Integer.parseInt(Data._c2.get("ports_okt").toString())+
                Integer.parseInt(Data._c2.get("ports_sk").toString())+
                Integer.parseInt(Data._c2.get("ports_dv").toString()));

        double ports3K = 1 + 0.2 * (Integer.parseInt(Data._c3.get("ports_okt").toString())+
                Integer.parseInt(Data._c3.get("ports_sk").toString())+
                Integer.parseInt(Data._c3.get("ports_dv").toString()));

        double ports4K = 1 + 0.2 * (Integer.parseInt(Data._c4.get("ports_okt").toString())+
                Integer.parseInt(Data._c4.get("ports_sk").toString())+
                Integer.parseInt(Data._c4.get("ports_dv").toString()));


        c1 += ports1K * ((Integer.parseInt(Data._c1.get("ports_okt").toString())*4000000 +
                Integer.parseInt(Data._c1.get("ports_sk").toString())*1000000 +
                Integer.parseInt(Data._c1.get("ports_dv").toString())*5000000));

        c2 += ports2K * ((Integer.parseInt(Data._c2.get("ports_okt").toString())*4000000 +
                Integer.parseInt(Data._c2.get("ports_sk").toString())*1000000 +
                Integer.parseInt(Data._c2.get("ports_dv").toString())*5000000));

        c3 += ports3K * ((Integer.parseInt(Data._c3.get("ports_okt").toString())*4000000 +
                Integer.parseInt(Data._c3.get("ports_sk").toString())*1000000 +
                Integer.parseInt(Data._c3.get("ports_dv").toString())*5000000));

        c4 += ports4K * ((Integer.parseInt(Data._c4.get("ports_okt").toString())*4000000 +
                Integer.parseInt(Data._c4.get("ports_sk").toString())*1000000 +
                Integer.parseInt(Data._c4.get("ports_dv").toString())*5000000));


        c1 += Company(1, "kam_ug", 5500000);
        c1 += Company(1, "koks", 1000000);
        c1 += Company(1, "oil", 2500000);
        c1 += Company(1, "iron", 700000);
        c1 += Company(1, "bl_met", 4500000);
        c1 += Company(1, "str_gru", 500000);
        c1 += Company(1, "him_soda", 5000000);
        c1 += Company(1, "cement", 400000);
        c1 += Company(1, "les", 600000);
        c1 += Company(1, "seed", 2000000);
        c1 += Company(1, "kont", 3000000);

        c2 += Company(2, "kam_ug", 5500000);
        c2 += Company(2, "koks", 1000000);
        c2 += Company(2, "oil", 2500000);
        c2 += Company(2, "iron", 700000);
        c2 += Company(2, "bl_met", 4500000);
        c2 += Company(2, "str_gru", 500000);
        c2 += Company(2, "him_soda", 5000000);
        c2 += Company(2, "cement", 400000);
        c2 += Company(2, "les", 600000);
        c2 += Company(2, "seed", 2000000);
        c2 += Company(2, "kont", 3000000);

        c3 += Company(3, "kam_ug", 5500000);
        c3 += Company(3, "koks", 1000000);
        c3 += Company(3, "oil", 2500000);
        c3 += Company(3, "iron", 700000);
        c3 += Company(3, "bl_met", 4500000);
        c3 += Company(3, "str_gru", 500000);
        c3 += Company(3, "him_soda", 5000000);
        c3 += Company(3, "cement", 400000);
        c3 += Company(3, "les", 600000);
        c3 += Company(3, "seed", 2000000);
        c3 += Company(3, "kont", 3000000);

        c4 += Company(4, "kam_ug", 5500000);
        c4 += Company(4, "koks", 1000000);
        c4 += Company(4, "oil", 2500000);
        c4 += Company(4, "iron", 700000);
        c4 += Company(4, "bl_met", 4500000);
        c4 += Company(4, "str_gru", 500000);
        c4 += Company(4, "him_soda", 5000000);
        c4 += Company(4, "cement", 400000);
        c4 += Company(4, "les", 600000);
        c4 += Company(4, "seed", 2000000);
        c4 += Company(4, "kont", 3000000);

        // Рейтинг
        if (c1>=c2 && c1>=c3 && c1>=c4){
            p1.setText("1: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
            p1.setTextColor(getResources().getColor(R.color.red));
            Data._leader = 1;
            if (c2>=c3 && c2>=c4){
                p2.setText("2: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                p2.setTextColor(getResources().getColor(R.color.blue));
                if (c3 >= c4) {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p3.setTextColor(getResources().getColor(R.color.green));
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setTextColor(getResources().getColor(R.color.yellow));
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p3.setTextColor(getResources().getColor(R.color.yellow));
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setTextColor(getResources().getColor(R.color.green));
                }
            }
            else if (c3 >= c2 && c3 >= c4){
                p2.setText("2: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                p2.setTextColor(getResources().getColor(R.color.green));
                if (c2 >= c4) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p3.setTextColor(getResources().getColor(R.color.blue));
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setTextColor(getResources().getColor(R.color.yellow));
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p3.setTextColor(getResources().getColor(R.color.yellow));
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setTextColor(getResources().getColor(R.color.blue));
                }
            }
            else {
                p2.setText("2: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                p2.setTextColor(getResources().getColor(R.color.yellow));
                if (c2 >= c3) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p3.setTextColor(getResources().getColor(R.color.blue));
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setTextColor(getResources().getColor(R.color.green));
                }
                else {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p3.setTextColor(getResources().getColor(R.color.green));
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setTextColor(getResources().getColor(R.color.blue));
                }
            }
        }

        else if (c2>=c1 && c2>=c3 && c2>=c4){
            p1.setText("1: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
            p1.setTextColor(getResources().getColor(R.color.blue));
            Data._leader = 2;
            if (c1>=c3 && c1>=c4){
                p2.setText("2: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                p2.setTextColor(getResources().getColor(R.color.red));
                if (c3 >= c4) {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p3.setTextColor(getResources().getColor(R.color.green));
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setTextColor(getResources().getColor(R.color.yellow));
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p3.setTextColor(getResources().getColor(R.color.yellow));
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setTextColor(getResources().getColor(R.color.green));
                }
            }
            else if (c3 >= c1 && c3 >= c4){
                p2.setText("2: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                p2.setTextColor(getResources().getColor(R.color.green));
                if (c1 >= c4) {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p3.setTextColor(getResources().getColor(R.color.red));
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setTextColor(getResources().getColor(R.color.yellow));
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p3.setTextColor(getResources().getColor(R.color.yellow));
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setTextColor(getResources().getColor(R.color.red));
                }
            }
            else {
                p2.setText("2: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                p2.setTextColor(getResources().getColor(R.color.yellow));
                if (c1 >= c3) {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p3.setTextColor(getResources().getColor(R.color.red));
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setTextColor(getResources().getColor(R.color.green));
                }
                else {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p3.setTextColor(getResources().getColor(R.color.green));
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setTextColor(getResources().getColor(R.color.red));
                }
            }
        }

        else if (c3>=c1 && c3>=c2 && c3>=c4){
            p1.setText("1: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
            p1.setTextColor(getResources().getColor(R.color.green));
            Data._leader = 3;
            if (c2>=c3 && c2>=c4){
                p2.setText("2: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                p2.setTextColor(getResources().getColor(R.color.blue));
                if (c1 >= c4) {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p3.setTextColor(getResources().getColor(R.color.red));
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setTextColor(getResources().getColor(R.color.yellow));
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p3.setTextColor(getResources().getColor(R.color.yellow));
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setTextColor(getResources().getColor(R.color.red));
                }
            }
            else if (c1 >= c2 && c1 >= c4){
                p2.setText("2: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                p2.setTextColor(getResources().getColor(R.color.red));
                if (c2 >= c4) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p3.setTextColor(getResources().getColor(R.color.blue));
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setTextColor(getResources().getColor(R.color.yellow));
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p3.setTextColor(getResources().getColor(R.color.yellow));
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setTextColor(getResources().getColor(R.color.blue));
                }
            }
            else {
                p2.setText("2: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                p2.setTextColor(getResources().getColor(R.color.yellow));
                if (c2 >= c1) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p3.setTextColor(getResources().getColor(R.color.blue));
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setTextColor(getResources().getColor(R.color.red));
                }
                else {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p3.setTextColor(getResources().getColor(R.color.red));
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setTextColor(getResources().getColor(R.color.blue));
                }
            }
        }

        else {
            p1.setText("1: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
            p1.setTextColor(getResources().getColor(R.color.yellow));
            Data._leader = 4;
            if (c2>=c3 && c2>=c1){
                p2.setText("2: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                p2.setTextColor(getResources().getColor(R.color.blue));
                if (c3 >= c1) {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p3.setTextColor(getResources().getColor(R.color.green));
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setTextColor(getResources().getColor(R.color.red));
                }
                else {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p3.setTextColor(getResources().getColor(R.color.red));
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setTextColor(getResources().getColor(R.color.green));
                }
            }
            else if (c3 >= c2 && c3 >= c1){
                p2.setText("2: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                p2.setTextColor(getResources().getColor(R.color.green));
                if (c2 >= c1) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p3.setTextColor(getResources().getColor(R.color.blue));
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setTextColor(getResources().getColor(R.color.red));
                }
                else {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p3.setTextColor(getResources().getColor(R.color.red));
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setTextColor(getResources().getColor(R.color.blue));
                }
            }
            else {
                p2.setText("2: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                p2.setTextColor(getResources().getColor(R.color.red));
                if (c2 >= c3) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p3.setTextColor(getResources().getColor(R.color.blue));
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setTextColor(getResources().getColor(R.color.green));
                }
                else {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p3.setTextColor(getResources().getColor(R.color.green));
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setTextColor(getResources().getColor(R.color.blue));
                }
            }
        }


    }


    public void btnNxt(View V){

        AlertDialog.Builder builder = new AlertDialog.Builder(Score.this);
        builder.setTitle(R.string.attention)
                .setCancelable(true)
                .setMessage(R.string.select_move)
                .setPositiveButton(R.string.next_year, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Data._year += 1;
                        Data._cubes = true;
                        Data._move = 1;
                        while (true) {
                            try {
                                Data.save();
                                Toast.makeText(V.getContext(), "Прогресс сохранён.", Toast.LENGTH_SHORT).show();
                                break;
                            } catch (Exception e) {
                                Exception a = e;
                                Toast.makeText(V.getContext(), "Ошибка сохранения." + e.toString(), Toast.LENGTH_SHORT).show();
                            }
                        }
                        Intent intent = new Intent(V.getContext(), Year_display.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton(R.string.finish, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Data._cubes = true;
                        Data._move = 1;
                        Intent intent = new Intent(V.getContext(), Victory.class);
                        startActivity(intent);
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}