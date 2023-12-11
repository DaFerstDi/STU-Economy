package com.bpi_111.stu_economy;

import static android.text.InputType.TYPE_NUMBER_FLAG_DECIMAL;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class Enter_values extends AppCompatActivity {
    private final String[] keys = new String[] {
            "money",
            "vict_p",
            "pv",
            "cis",
            "pl",
            "kr",
            "ports_okt",
            "ports_sk",
            "ports_dv",
            "kam_ug",
            "koks",
            "oil",
            "iron",
            "bl_met",
            "str_gru",
            "him_soda",
            "cement",
            "les",
            "seed",
            "kont"
    };

    ArrayList<Values> values = new ArrayList<Values>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_values);
    }

    @Override public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Enter_values.this);
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
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);

        TextView cn = findViewById(R.id.c_name);
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

        RecyclerView recyclerView = findViewById(R.id.RecyclerView);

        // начальная инициализация списка
        if (recyclerView.getAdapter() == null) {
            setInitialData();
        }
        else {
            setOtherData();
        }
        // определяем слушателя нажатия элемента в списке
        ValueAdapter.OnValueClickListener stateClickListener = new ValueAdapter.OnValueClickListener() {
            @Override
            public void onValueClick(Values value, int position) {

                //Toast.makeText(getApplicationContext(), "Был выбран пункт " + value.getName(),Toast.LENGTH_SHORT).show();
                final String name = value.getName();

                AlertDialog.Builder alert = new AlertDialog.Builder(Enter_values.this);
                alert.setTitle(R.string.editValues);
                alert.setMessage("Введите новое значение для " + value.getName());
                EditText input = new EditText(Enter_values.this);
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                String v = name;
                String vNew = "1";
                switch (v){
                    case ("Деньги"):{vNew = "money"; break;}
                    case ("Победные очки"):{vNew = "vict_p"; break;}
                    case ("Полувагоны"):{vNew = "pv"; break;}
                    case ("Цистерны"):{vNew = "cis"; break;}
                    case ("Платформы"):{vNew = "pl"; break;}
                    case ("Крытые"):{vNew = "kr"; break;}
                    case ("Порты Октябрьской ж.д."):{vNew = "ports_okt"; break;}
                    case ("Порты Северо-Кавказской ж.д."):{vNew = "ports_sk"; break;}
                    case ("Порты Дальневосточной ж.д."):{vNew = "ports_dv"; break;}
                    case ("Каменный уголь"):{vNew = "kam_ug"; break;}
                    case ("Кокс"):{vNew = "koks"; break;}
                    case ("Нефть"):{vNew = "oil"; break;}
                    case ("Руда железная"):{vNew = "iron"; break;}
                    case ("Чёрные металлы"):{vNew = "bl_met"; break;}
                    case ("Строительные грузы"):{vNew = "str_gru"; break;}
                    case ("Химикаты и сода"):{vNew = "him_soda"; break;}
                    case ("Цемент"):{vNew = "cement"; break;}
                    case ("Лесные грузы"):{vNew = "les"; break;}
                    case ("Зерно"):{vNew = "seed"; break;}
                    case ("Грузы в контейнерах"):{vNew = "kont"; break;}
                }
                String p = "";
                if (Data._move == 1) {
                    p = Data._c1.get(vNew).toString();
                }
                else if (Data._move == 2) {
                    p = Data._c2.get(vNew).toString();
                }
                else if (Data._move == 3) {
                    p = Data._c3.get(vNew).toString();
                }
                else if (Data._move == 4) {
                    p = Data._c4.get(vNew).toString();
                }
                input.setText(p);
                alert.setView(input);
                alert.setPositiveButton(R.string.save, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String value = input.getText().toString();
                        char[] vc = value.toCharArray();
                        for (char c : vc) {
                            if (c == '0') {
                                value = value.replaceFirst("0", "");
                            } else break;
                        }
                        if (value.equals("")){
                            value = "0";
                        }
                        try {
                            int d = Integer.parseInt(value);
                            double b = Math.sqrt(d);
                            if (b != b){
                                throw new NumberFormatException();
                            }
                        }
                        catch (Exception e){
                            return;
                        }
                        String nm = "1";
                        switch (name){
                            case ("Деньги"):{nm = "money"; break;}
                            case ("Победные очки"):{nm = "vict_p"; break;}
                            case ("Полувагоны"):{nm = "pv"; break;}
                            case ("Цистерны"):{nm = "cis"; break;}
                            case ("Платформы"):{nm = "pl"; break;}
                            case ("Крытые"):{nm = "kr"; break;}
                            case ("Порты Октябрьской ж.д."):{nm = "ports_okt"; break;}
                            case ("Порты Северо-Кавказской ж.д."):{nm = "ports_sk"; break;}
                            case ("Порты Дальневосточной ж.д."):{nm = "ports_dv"; break;}
                            case ("Каменный уголь"):{nm = "kam_ug"; break;}
                            case ("Кокс"):{nm = "koks"; break;}
                            case ("Нефть"):{nm = "oil"; break;}
                            case ("Руда железная"):{nm = "iron"; break;}
                            case ("Чёрные металлы"):{nm = "bl_met"; break;}
                            case ("Строительные грузы"):{nm = "str_gru"; break;}
                            case ("Химикаты и сода"):{nm = "him_soda"; break;}
                            case ("Цемент"):{nm = "cement"; break;}
                            case ("Лесные грузы"):{nm = "les"; break;}
                            case ("Зерно"):{nm = "seed"; break;}
                            case ("Грузы в контейнерах"):{nm = "kont"; break;}
                        }
                        if (Data._move == 1) {
                            Data._c1.put(nm, value);
                        }
                        else if (Data._move == 2) {
                            Data._c2.put(nm, value);
                        }
                        else if (Data._move == 3) {
                            Data._c3.put(nm, value);
                        }
                        else if (Data._move == 4) {
                            Data._c4.put(nm, value);
                        }

                        values.get(Arrays.asList(keys).indexOf(nm)).setValue(value);
                        Values s = values.get(Arrays.asList(keys).indexOf(nm));
                        recyclerView.getAdapter().notifyItemChanged(Arrays.asList(keys).indexOf(nm));
                    }
                });
                alert.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    }
                });
                alert.show();
            }
        };
        // создаем адаптер
        ValueAdapter adapter = new ValueAdapter(this, values, stateClickListener);
        // устанавливаем для списка адаптер
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(adapter);
        }
        else {
            for (String nm: keys) {
                recyclerView.getAdapter().notifyItemChanged(Arrays.asList(keys).indexOf(nm));
            }
        }
    }

    private void setInitialData(){

        //Set<String> keys = Data._c1.keySet();
        for (String s: keys){
            String vl = "";
            if (Data._move == 1) {
                vl = Data._c1.get(s).toString();
            }
            else if (Data._move == 2) {
                vl = Data._c2.get(s).toString();
            }
            else if (Data._move == 3) {
                vl = Data._c3.get(s).toString();
            }
            else if (Data._move == 4) {
                vl = Data._c4.get(s).toString();
            }
            String j = "";
            switch (s){
                case ("money"):{
                    j = "Деньги";
                    values.add(new Values(j, vl, R.drawable.money));
                    break;}
                case ("vict_p"):{
                    j = "Победные очки";
                    values.add(new Values(j, vl, R.drawable.zvizda));
                    break;}
                case ("pv"):{
                    j = "Полувагоны";
                    values.add(new Values(j, vl, R.drawable.poluvagon));
                    break;
                }
                case ("cis"):{
                    j = "Цистерны";
                    values.add(new Values(j, vl, R.drawable.bochka));
                    break;
                }
                case ("pl"):{
                    j = "Платформы";
                    values.add(new Values(j, vl, R.drawable.platforma));
                    break;
                }
                case ("kr"):{
                    j = "Крытые";
                    values.add(new Values(j, vl, R.drawable.vagon));
                    break;
                }
                case ("ports_okt"):{
                    j = "Порты Октябрьской ж.д.";
                    values.add(new Values(j, vl, R.drawable.ports_okt));
                    break;
                }
                case ("ports_sk"):{
                    j = "Порты Северо-Кавказской ж.д.";
                    values.add(new Values(j, vl, R.drawable.ports_sk));
                    break;
                }
                case ("ports_dv"):{
                    j = "Порты Дальневосточной ж.д.";
                    values.add(new Values(j, vl, R.drawable.ports_dv));
                    break;
                }
                case ("kam_ug"):{
                    j = "Каменный уголь";
                    values.add(new Values(j, vl, R.drawable.kam_ug));
                    break;
                }
                case ("koks"):{
                    j = "Кокс";
                    values.add(new Values(j, vl, R.drawable.koks));
                    break;
                }
                case ("oil"):{
                    j = "Нефть";
                    values.add(new Values(j, vl, R.drawable.oil));
                    break;
                }
                case ("iron"):{
                    j = "Руда железная";
                    values.add(new Values(j, vl, R.drawable.iron));
                    break;
                }
                case ("bl_met"):{
                    j = "Чёрные металлы";
                    values.add(new Values(j, vl, R.drawable.bl_met));
                    break;
                }
                case ("str_gru"):{
                    j = "Строительные грузы";
                    values.add(new Values(j, vl, R.drawable.str_gru));
                    break;
                }
                case ("him_soda"):{
                    j = "Химикаты и сода";
                    values.add(new Values(j, vl, R.drawable.zhiza));
                    break;
                }
                case ("cement"):{
                    j = "Цемент";
                    values.add(new Values(j, vl, R.drawable.cement));
                    break;
                }
                case ("les"):{
                    j = "Лесные грузы";
                    values.add(new Values(j, vl, R.drawable.bobir));
                    break;
                }
                case ("seed"):{
                    j = "Зерно";
                    values.add(new Values(j, vl, R.drawable.seed));
                    break;
                }
                case ("kont"):{
                    j = "Грузы в контейнерах";
                    values.add(new Values(j, vl, R.drawable.kont));
                    break;}
            }
        }
    }

    private void setOtherData(){
        for (String s: keys){
            String vl = "";
            if (Data._move == 1) {
                vl = Data._c1.get(s).toString();
            }
            else if (Data._move == 2) {
                vl = Data._c2.get(s).toString();
            }
            else if (Data._move == 3) {
                vl = Data._c3.get(s).toString();
            }
            else if (Data._move == 4) {
                vl = Data._c4.get(s).toString();
            }
            values.get(Arrays.asList(keys).indexOf(s)).setValue(vl);
        }
    }


    public void nextButton(View V) {
        if (Data._move == 1) {
            Button btn = findViewById(R.id.button13);
            btn.setAlpha(1);
            Data._move = 2;
            onResume();
        } else if (Data._move == 2) {
            Data._move = 3;
            onResume();

        } else if (Data._move == 3) {
            Data._move = 4;
            onResume();
        }

        else if (Data._move == 4){
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(Enter_values.this);
            builder.setTitle(R.string.yearEnd)
                    .setCancelable(true)
                    .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(V.getContext(), Score.class);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
            android.app.AlertDialog dialog = builder.create();
            dialog.show();
            }
        }

    public void previousButton(View V) {
        if (Data._move == 2) {
            Button btn = findViewById(R.id.button13);
            btn.setAlpha(0);
            Data._move = 1;
            onResume();
        } else if (Data._move == 3) {
            Data._move = 2;
            onResume();

        } else if (Data._move == 4) {
            Data._move = 3;
            onResume();

        }

    }

}