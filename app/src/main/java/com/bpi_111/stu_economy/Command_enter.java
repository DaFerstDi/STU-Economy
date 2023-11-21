package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Command_enter extends AppCompatActivity {

    private int cmd = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        setContentView(R.layout.activity_command_enter);
        EditText editTexttext = findViewById(R.id.editTextText6);
        ImageView iv = findViewById(R.id.imageView4);
        TextView textView = findViewById(R.id.textView9);

        //iv.setColorFilter(new LightingColorFilter(Color.RED, Color.RED));
        editTexttext.setHintTextColor(getColor(R.color.lightRed));
        textView.setTextColor(getResources().getColor(R.color.red));
        iv.animate().alpha(1).setDuration(2000).start();

    }

    @Override
    protected void onResume(){
        super.onResume();
        overridePendingTransition(0,0);
    }

    public void nextButton(View V){
        ImageView iv = findViewById(R.id.imageView4);
        EditText editTexttext = findViewById(R.id.editTextText6);
        TextView textView = findViewById(R.id.textView9);
        Button btn = findViewById(R.id.button9);
        int d = cmd;

        switch (cmd){
            case (1):{
                iv.setColorFilter(new LightingColorFilter(Color.BLUE, Color.BLUE));
                Data._c1.put("name", editTexttext.getText());
                editTexttext.setText(Data._c2.get("name").toString());
                textView.setText(getResources().getText(R.string.command_2));
                textView.setTextColor(getResources().getColor(R.color.blue));
                editTexttext.setTextColor(getResources().getColor(R.color.blue));
                editTexttext.setHintTextColor(getColor(R.color.lightBlue));
                btn.setAlpha(1);
                cmd = 2;
                break;
            }
            case (2):{
                iv.setColorFilter(new LightingColorFilter(Color.GREEN, Color.GREEN));
                Data._c2.put("name", editTexttext.getText());
                editTexttext.setText(Data._c3.get("name").toString());
                textView.setText(getResources().getText(R.string.command_3));
                textView.setTextColor(getResources().getColor(R.color.green));
                editTexttext.setTextColor(getResources().getColor(R.color.green));
                editTexttext.setHintTextColor(getColor(R.color.lightGreen));
                btn.setAlpha(1);
                cmd = 3;
                break;
            }
            case (3):{
                iv.setColorFilter(new LightingColorFilter(Color.YELLOW, Color.YELLOW));
                Data._c3.put("name", editTexttext.getText());
                editTexttext.setText(Data._c4.get("name").toString());
                textView.setText(getResources().getText(R.string.command_4));
                textView.setTextColor(getResources().getColor(R.color.yellow));
                editTexttext.setTextColor(getResources().getColor(R.color.yellow));
                editTexttext.setHintTextColor(getColor(R.color.lightYellow));
                btn.setAlpha(1);
                cmd = 4;
                break;
            }
            case (4):{
                AlertDialog.Builder builder = new AlertDialog.Builder(Command_enter.this);
                builder.setTitle(R.string.start_ask)
                        .setCancelable(true)
                        .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(V.getContext(), activity_game.class);
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
                break;
            }
        }
    }


    public void previousButton(View V) {
        ImageView iv = findViewById(R.id.imageView4);
        EditText editTexttext = findViewById(R.id.editTextText6);
        TextView textView = findViewById(R.id.textView9);
        Button btn = findViewById(R.id.button9);
        String s = Data._c1.get("name").toString();

        switch (cmd) {
            case (2): {
                iv.setColorFilter(new LightingColorFilter(Color.RED, Color.RED));
                Data._c2.put("name", editTexttext.getText());
                editTexttext.setText(Data._c1.get("name").toString());
                textView.setText(getResources().getText(R.string.command_1));
                textView.setTextColor(getResources().getColor(R.color.red));
                editTexttext.setTextColor(getResources().getColor(R.color.red));
                editTexttext.setHintTextColor(getColor(R.color.lightRed));
                btn.setAlpha(0);
                cmd = 1;
                break;
            }
            case (3): {
                iv.setColorFilter(new LightingColorFilter(Color.BLUE, Color.BLUE));
                Data._c3.put("name", editTexttext.getText());
                editTexttext.setText(Data._c2.get("name").toString());
                textView.setText(getResources().getText(R.string.command_2));
                textView.setTextColor(getResources().getColor(R.color.blue));
                editTexttext.setTextColor(getResources().getColor(R.color.blue));
                editTexttext.setHintTextColor(getColor(R.color.lightBlue));
                btn.setAlpha(1);
                cmd = 2;
                break;
            }
            case (4): {
                iv.setColorFilter(new LightingColorFilter(Color.GREEN, Color.GREEN));
                Data._c4.put("name", editTexttext.getText());
                editTexttext.setText(Data._c3.get("name").toString());
                textView.setText(getResources().getText(R.string.command_3));
                textView.setTextColor(getResources().getColor(R.color.green));
                editTexttext.setTextColor(getResources().getColor(R.color.green));
                editTexttext.setHintTextColor(getColor(R.color.lightGreen));
                btn.setAlpha(1);
                cmd = 3;
                break;
            }
        }
    }
}