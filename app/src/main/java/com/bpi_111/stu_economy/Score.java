package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
        int c1=0, c2=0, c3=0, c4=0;

        TextView p1 = findViewById(R.id.p1_score);
        TextView p2 = findViewById(R.id.p2_score);
        TextView p3 = findViewById(R.id.p3_score);
        TextView p4 = findViewById(R.id.p4_score);

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

        int vag1c = 1200000 * Integer.parseInt(Data._c1.get("pv").toString())+
                1600000 * Integer.parseInt(Data._c1.get("cis").toString())+
                1000000 * Integer.parseInt(Data._c1.get("pl").toString())+
                1400000 * Integer.parseInt(Data._c1.get("kr").toString());
        int vag2c = 1200000 * Integer.parseInt(Data._c2.get("pv").toString())+
                1600000 * Integer.parseInt(Data._c2.get("cis").toString())+
                1000000 * Integer.parseInt(Data._c2.get("pl").toString())+
                1400000 * Integer.parseInt(Data._c2.get("kr").toString());
        int vag3c = 1200000 * Integer.parseInt(Data._c3.get("pv").toString())+
                1600000 * Integer.parseInt(Data._c3.get("cis").toString())+
                1000000 * Integer.parseInt(Data._c3.get("pl").toString())+
                1400000 * Integer.parseInt(Data._c3.get("kr").toString());
        int vag4c = 1200000 * Integer.parseInt(Data._c4.get("pv").toString())+
                1600000 * Integer.parseInt(Data._c4.get("cis").toString())+
                1000000 * Integer.parseInt(Data._c4.get("pl").toString())+
                1400000 * Integer.parseInt(Data._c4.get("kr").toString());

        if (vag1 == maxVag) {
            c1 += vag1c*1.2;
            c2 += vag2c;
            c3 += vag3c;
            c4 += vag4c;
        }
        else if (vag2 == maxVag) {
            c1 += vag1c;
            c2 += vag2c*1.2;
            c3 += vag3c;
            c4 += vag4c;
        }
        else if (vag3 == maxVag) {
            c1 += vag1c;
            c2 += vag2c;
            c3 += vag3c*1.2;
            c4 += vag4c;
        }
        else if (vag4 == maxVag) {
            c1 += vag1c;
            c2 += vag2c;
            c3 += vag3c;
            c4 += vag4c*1.2;
        }



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
            c1 += pob1c*1.5;
            c2 += pob2c;
            c3 += pob3c;
            c4 += pob4c;
        }
        else if (pob2 == maxPob) {
            c1 += pob1c;
            c2 += pob2c*1.5;
            c3 += pob3c;
            c4 += pob4c;
        }
        else if (pob3 == maxPob) {
            c1 += pob1c;
            c2 += pob2c;
            c3 += pob3c*1.5;
            c4 += pob4c;
        }
        else if (pob4 == maxPob) {
            c1 += pob1c;
            c2 += pob2c;
            c3 += pob3c;
            c4 += pob4c*1.5;
        }


/*
//Порты не работают
        int ports1 = Integer.parseInt(Data._c1.get("ports").toString());
        int ports2 = Integer.parseInt(Data._c2.get("ports").toString());
        int ports3 = Integer.parseInt(Data._c3.get("ports").toString());
        int ports4 = Integer.parseInt(Data._c4.get("ports").toString());

        double k1p = 1 + 0.2 * ports1,
                k2p = 1 + 0.2 * ports2,
                k3p = 1 + 0.2 * ports2,
                k4p = 1 + 0.2 * ports2;

        int ports1c = 100000 * Integer.parseInt(Data._c1.get("ports").toString());
        int ports2c = 100000 * Integer.parseInt(Data._c2.get("ports").toString());
        int ports3c = 100000 * Integer.parseInt(Data._c3.get("ports").toString());
        int ports4c = 100000 * Integer.parseInt(Data._c4.get("ports").toString());
*/



        if (c1>=c2 && c1>=c3 && c1>=c4){
            p1.setText("1: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
            if (c2>=c3 && c2>=c4){
                p2.setText("2: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                if (c3 >= c4) {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                }
            }
            else if (c3 >= c2 && c3 >= c4){
                p2.setText("2: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                if (c2 >= c4) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                }
            }
            else {
                p2.setText("2: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                if (c2 >= c3) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                }
                else {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                }
            }
        }

        else if (c2>=c1 && c2>=c3 && c2>=c4){
            p1.setText("1: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
            if (c1>=c3 && c1>=c4){
                p2.setText("2: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                if (c3 >= c4) {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                }
            }
            else if (c3 >= c1 && c3 >= c4){
                p2.setText("2: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                if (c1 >= c4) {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                }
            }
            else {
                p2.setText("2: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                if (c1 >= c3) {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                }
                else {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                }
            }
        }

        else if (c3>=c1 && c3>=c2 && c3>=c4){
            p1.setText("1: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
            if (c2>=c3 && c2>=c4){
                p2.setText("2: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                if (c1 >= c4) {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                }
            }
            else if (c1 >= c2 && c1 >= c4){
                p2.setText("2: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                if (c2 >= c4) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setText("4: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                }
                else {
                    p3.setText("3: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                }
            }
            else {
                p2.setText("2: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
                if (c2 >= c1) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                }
                else {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                }
            }
        }

        else {
            p1.setText("1: " + Data._c4.get("name").toString() + ": (" + c4 + ")");
            if (c2>=c3 && c2>=c1){
                p2.setText("2: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                if (c3 >= c1) {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                }
                else {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                }
            }
            else if (c3 >= c2 && c3 >= c1){
                p2.setText("2: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                if (c2 >= c1) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setText("4: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                }
                else {
                    p3.setText("3: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                }
            }
            else {
                p2.setText("2: " + Data._c1.get("name").toString() + ": (" + c1 + ")");
                if (c2 >= c3) {
                    p3.setText("3: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                    p4.setText("4: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                }
                else {
                    p3.setText("3: " + Data._c3.get("name").toString() + ": (" + c3 + ")");
                    p4.setText("4: " + Data._c2.get("name").toString() + ": (" + c2 + ")");
                }
            }
        }


    }
}