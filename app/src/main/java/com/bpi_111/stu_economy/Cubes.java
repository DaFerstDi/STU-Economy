package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cubes extends AppCompatActivity {

    private String to = "";
    private String cargo = "";
    private int howM = 0;
    private int howC = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubes);
    }

    @Override public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Cubes.this);
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

        TextView cn = findViewById(R.id.c_name);
        EditText yt = findViewById(R.id.editTextText5);
        EditText bt = findViewById(R.id.editTextText7);
        EditText rt = findViewById(R.id.editTextText8);

        yt.setText("");
        bt.setText("");
        rt.setText("");

        if (Data._move == 1) {
            cn.setText("Команда:\n" + Data._c1.get("name").toString());
        }
        else if (Data._move == 2) {
            cn.setText("Команда:\n" + Data._c2.get("name").toString());
        }
        else if (Data._move == 3) {
            cn.setText("Команда:\n" + Data._c3.get("name").toString());
        }
        else if (Data._move == 4) {
            cn.setText("Команда:\n" + Data._c4.get("name").toString());
        }
    }

    public void calculate(View V){
        EditText yt = findViewById(R.id.editTextText5);
        EditText bt = findViewById(R.id.editTextText7);
        EditText rt = findViewById(R.id.editTextText8);

        to = "";
        cargo = "";
        howM = 0;
        howC = 0;

        try {
            int y = Integer.parseInt(yt.getText().toString());
            int b = Integer.parseInt(bt.getText().toString());
            int r = Integer.parseInt(rt.getText().toString());

            if (Data._year > 5){
                switch (r){
                    case (1):{howC = 10; break;}
                    case (2):{howC = 20; break;}
                    case (3):{howC = 30; break;}
                    case (4):{howC = 40; break;}
                    case (5):{howC = 50; break;}
                    case (6):{howC = 60; break;}
                }
            }
            else {
                switch (r){
                    case (1):{howC = 10; break;}
                    case (2):{howC = 10; break;}
                    case (3):{howC = 20; break;}
                    case (4):{howC = 20; break;}
                    case (5):{howC = 30; break;}
                    case (6):{howC = 30; break;}
                }
            }

            switch (y){
                case (2):{
                    cargo = "Руда железная (ПВ)";
                    switch (b){
                        case (2):{to = "Западно-Сибирская ж.д."; howM = 320000; break;}
                        case (3):{to = "Западно-Сибирская ж.д."; howM = 320000; break;}
                        case (4):{to = "Западно-Сибирская ж.д."; howM = 320000; break;}
                        case (5):{to = "Западно-Сибирская ж.д."; howM = 320000; break;}
                        case (6):{to = "Западно-Сибирская ж.д."; howM = 320000; break;}
                        case (7):{to = "Западно-Сибирская ж.д."; howM = 320000; break;}
                        case (8):{to = "Западно-Сибирская ж.д."; howM = 320000; break;}
                        case (9):{to = "Западно-Сибирская ж.д."; howM = 320000; break;}
                        case (10):{to = "Западно-Сибирская ж.д."; howM = 320000; break;}
                        case (11):{to = "Западно-Сибирская ж.д."; howM = 320000; break;}
                        case (12):{to = "Западно-Сибирская ж.д."; howM = 320000; break;}

                    }
                    break;
                }
                case (3):{
                    cargo = "Строительные грузы (ПВ)";
                    switch (b){
                        case (2):{to = "Дальневосточная ж.д."; howM = 1500000; break;}
                        case (3):{to = "Восточно-Сибирская  ж.д."; howM = 740000; break;}
                        case (4):{to = "Красноярская ж.д."; howM = 420000; break;}
                        case (5):{to = "Западно-Сибирская ж.д."; howM = 240000; break;}
                        case (6):{to = "Западно-Сибирская ж.д."; howM = 240000; break;}
                        case (7):{to = "Западно-Сибирская ж.д."; howM = 240000; break;}
                        case (8):{to = "Западно-Сибирская ж.д."; howM = 240000; break;}
                        case (9):{to = "Западно-Сибирская ж.д."; howM = 240000; break;}
                        case (10):{to = "Западно-Сибирская ж.д."; howM = 240000; break;}
                        case (11):{to = "Забайкальская ж.д."; howM = 940000; break;}
                        case (12):{to = "Свердловская ж.д."; howM = 660000; break;}
                    }
                    break;
                }
                case (4):{
                    cargo = "Кокс (ПВ)";
                    switch (b){
                        case (2):{to = "Свердловская ж.д."; howM = 800000; break;}
                        case (3):{to = "Западно-Сибирская ж.д."; howM = 300000; break;}
                        case (4):{to = "Украина"; howM = 1380000; break;}
                        case (5):{to = "Московская ж.д."; howM = 1240000; break;}
                        case (6):{to = "Московская ж.д."; howM = 1240000; break;}
                        case (7):{to = "Юго-Восточная ж.д."; howM = 1260000; break;}
                        case (8):{to = "Юго-Восточная ж.д."; howM = 1260000; break;}
                        case (9):{to = "Юго-Восточная ж.д."; howM = 1260000; break;}
                        case (10):{to = "Средняя Азия"; howM = 1100000; break;}
                        case (11):{to = "Южно-Уральская ж.д."; howM = 760000; break;}
                        case (12):{to = "Дальневосточная ж.д."; howM = 1820000; break;}
                    }
                    break;
                }
                case (5):{
                    cargo = "Лес (ПЛ)";
                    switch (b){case (2):{to = "Западно-Сибирская ж.д."; howM = 280000; break;}
                        case (3):{to = "Западно-Сибирская ж.д."; howM = 280000; break;}
                        case (4):{to = "Западно-Сибирская ж.д."; howM = 280000; break;}
                        case (5):{to = "Западно-Сибирская ж.д."; howM = 280000; break;}
                        case (6):{to = "Средняя Азия"; howM = 1600000; break;}
                        case (7):{to = "Средняя Азия"; howM = 1600000; break;}
                        case (8):{to = "Средняя Азия"; howM = 1600000; break;}
                        case (9):{to = "Средняя Азия"; howM = 1600000; break;}
                        case (10):{to = "Средняя Азия"; howM = 1600000; break;}
                        case (11):{to = "Забайкальская ж.д."; howM = 1160000; break;}
                        case (12):{to = "Дальневосточная ж.д."; howM = 1460000; break;}
                    }
                    break;
                }
                case (6):{
                    cargo = "Цемент (КР)";
                    switch (b){case (2):{to = "Восточно-Сибирская  ж.д."; howM = 1140000; break;}
                        case (3):{to = "Южно-Уральская ж.д."; howM = 960000; break;}
                        case (4):{to = "Красноярская ж.д."; howM = 640000; break;}
                        case (5):{to = "Свердловская ж.д."; howM = 1020000; break;}
                        case (6):{to = "Свердловская ж.д."; howM = 1020000; break;}
                        case (7):{to = "Западно-Сибирская ж.д."; howM = 380000; break;}
                        case (8):{to = "Западно-Сибирская ж.д."; howM = 380000; break;}
                        case (9):{to = "Западно-Сибирская ж.д."; howM = 380000; break;}
                        case (10):{to = "Западно-Сибирская ж.д."; howM = 380000; break;}
                        case (11):{to = "Средняя Азия"; howM = 1420000; break;}
                        case (12):{to = "Северная ж.д."; howM = 1540000; break;}
                    }
                    break;
                }
                case (7):{
                    cargo = "Каменный уголь (ПВ)";
                    switch (b){case (2):{to = "Беларусь"; howM = 1300000; break;}
                        case (3):{to = "Северо-Кавказская ж.д."; howM = 1340000; break;}
                        case (4):{to = "Украина"; howM = 1360000; break;}
                        case (5):{to = "Западно-Сибирская ж.д."; howM = 300000; break;}
                        case (6):{to = "Западно-Сибирская ж.д."; howM = 300000; break;}
                        case (7):{to = "Октябрьская ж.д."; howM = 1300000; break;}
                        case (8):{to = "Дальневосточная ж.д."; howM = 1580000; break;}
                        case (9):{to = "Дальневосточная ж.д."; howM = 1580000; break;}
                        case (10):{to = "Прибалтика"; howM = 1320000; break;}
                        case (11):{to = "Южно-Уральская ж.д."; howM = 760000; break;}
                        case (12):{to = "Юго-Восточная ж.д."; howM = 1260000; break;}
                    }
                    break;
                }
                case (8):{
                    cargo = "Нефть (ЦС)";
                    switch (b){case (2):{to = "Восточно-Сибирская  ж.д."; howM = 1720000; break;}
                        case (3):{to = "Средняя Азия"; howM = 2140000; break;}
                        case (4):{to = "Красноярская ж.д."; howM = 880000; break;}
                        case (5):{to = "Свердловская ж.д."; howM = 1480000; break;}
                        case (6):{to = "Западно-Сибирская ж.д."; howM = 480000; break;}
                        case (7):{to = "Западно-Сибирская ж.д."; howM = 480000; break;}
                        case (8):{to = "Октябрьская ж.д."; howM = 3020000; break;}
                        case (9):{to = "Октябрьская ж.д."; howM = 3020000; break;}
                        case (10):{to = "Дальневосточная ж.д."; howM = 3700000; break;}
                        case (11):{to = "Северо-Кавказская ж.д."; howM = 3320000; break;}
                        case (12):{to = "Южно-Уральская ж.д."; howM = 1400000; break;}
                    }
                    break;
                }
                case (9):{
                    cargo = "Грузы в контейнерах (ПЛ)";
                    switch (b){case (2):{to = "Куйбышевская ж.д."; howM = 1500000; break;}
                        case (3):{to = "Западно-Сибирская ж.д."; howM = 420000; break;}
                        case (4):{to = "Октябрьская ж.д."; howM = 2080000; break;}
                        case (5):{to = "Восточно-Сибирская  ж.д."; howM = 1220000; break;}
                        case (6):{to = "Забайкальская ж.д."; howM = 1880000; break;}
                        case (7):{to = "Дальневосточная ж.д."; howM = 3180000; break;}
                        case (8):{to = "Дальневосточная ж.д."; howM = 3180000; break;}
                        case (9):{to = "Дальневосточная ж.д."; howM = 3180000; break;}
                        case (10):{to = "Дальневосточная ж.д."; howM = 3180000; break;}
                        case (11):{to = "Якутия"; howM = 2260000; break;}
                        case (12):{to = "Северо-Кавказская ж.д."; howM = 2260000; break;}
                    }
                    break;
                }
                case (10):{
                    cargo = "Зерно (КР)";
                    switch (b){case (2):{to = "Забайкальская ж.д."; howM = 1740000; break;}
                        case (3):{to = "Западно-Сибирская ж.д."; howM = 420000; break;}
                        case (4):{to = "Прибалтика"; howM = 1900000; break;}
                        case (5):{to = "Калининградская ж.д."; howM = 3060000; break;}
                        case (6):{to = "Восточно-Сибирская  ж.д."; howM = 1360000; break;}
                        case (7):{to = "Октябрьская ж.д."; howM = 1840000; break;}
                        case (8):{to = "Северо-Кавказская ж.д."; howM = 1940000; break;}
                        case (9):{to = "Северо-Кавказская ж.д."; howM = 1940000; break;}
                        case (10):{to = "Северо-Кавказская ж.д."; howM = 1940000; break;}
                        case (11):{to = "Свердловская ж.д."; howM = 1200000; break;}
                        case (12):{to = "Беларусь"; howM = 1860000; break;}
                    }
                    break;
                }
                case (11):{
                    cargo = "Химикаты (ЦС)";
                    switch (b){
                        case (2):{to = "Красноярская ж.д."; howM = 1400000; break;}
                        case (3):{to = "Горьковская ж.д."; howM = 3660000; break;}
                        case (4):{to = "Куйбышевская ж.д."; howM = 3300000; break;}
                        case (5):{to = "Октябрьская ж.д."; howM = 4660000; break;}
                        case (6):{to = "Октябрьская ж.д."; howM = 4660000; break;}
                        case (7):{to = "Западно-Сибирская ж.д."; howM = 780000; break;}
                        case (8):{to = "Западно-Сибирская ж.д."; howM = 780000; break;}
                        case (9):{to = "Восточно-Сибирская  ж.д."; howM = 2660000; break;}
                        case (10):{to = "Свердловская ж.д."; howM = 2320000; break;}
                        case (11):{to = "Средняя Азия"; howM = 3720000; break;}
                        case (12):{to = "Дальневосточная ж.д."; howM = 7260000; break;}
                    }
                    break;
                }
                case (12):{
                    cargo = "Чёрные металлы (ПВ)";
                    switch (b){
                        case (2):{to = "Свердловская ж.д."; howM = 1520000; break;}
                        case (3):{to = "Красноярская ж.д."; howM = 940000; break;}
                        case (4):{to = "Восточно-Сибирская  ж.д."; howM = 1720000; break;}
                        case (5):{to = "Западно-Сибирская ж.д."; howM = 560000; break;}
                        case (6):{to = "Дальневосточная ж.д."; howM = 2680000; break;}
                        case (7):{to = "Дальневосточная ж.д."; howM = 2680000; break;}
                        case (8):{to = "Дальневосточная ж.д."; howM = 2680000; break;}
                        case (9):{to = "Дальневосточная ж.д."; howM = 2680000; break;}
                        case (10):{to = "Средняя Азия"; howM = 2440000; break;}
                        case (11):{to = "Московская ж.д."; howM = 2600000; break;}
                        case (12):{to = "Северо-Кавказская ж.д."; howM = 3120000; break;}
                    }
                    break;
                }
            }

            if (cargo.equals("") || howC == 0 || howM == 0){
                throw new Exception("Отсутствует значение");
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(Cubes.this);
            builder.setTitle(R.string.contract)
                    .setCancelable(true)
                    .setMessage("Груз: " + cargo + "\nВагоны: " + howC + "\nТариф: " + howM*howC/10 + "\nНаправление: " + to)
                    .setPositiveButton(R.string.next, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (Data._move < 4){
                                Data._move += 1;
                                onResume();
                            }
                            else {
                                Data._move = 1;
                                if (Data._simple_mode == 1)
                                {
                                    Data._year += 1;
                                    Data._cubes = true;
                                    Intent intent = new Intent(V.getContext(), Year_display.class);
                                    startActivity(intent);
                                }
                                else {
                                    Data._cubes = false;
                                    Intent intent = new Intent(V.getContext(), Year_display.class);
                                    startActivity(intent);
                                }
                            }
                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        catch (Exception e){
            Toast.makeText(this, "Проверьте правильность введённых данных.", Toast.LENGTH_SHORT).show();
        }
    }
}