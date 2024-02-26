package com.woafes.stu_economy.Models;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.woafes.stu_economy.R;

public class DialogShower {
    public Dialog dialog;
    TextView _title, _text;
    Button _yes, _no;
    EditText _editText;
    public DialogShower(Context context, String title, String text, String yesBt) {

        dialog = new Dialog(context);
        dialog.setContentView(R.layout.yes_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        _title = dialog.findViewById(R.id.dialog_title);
        _text = dialog.findViewById(R.id.dialog_text);
        _yes = dialog.findViewById(R.id.dialog_yes_b);

        _yes.setText(yesBt);
        _title.setText(title);
        _text.setText(text);
    }

    public DialogShower(Context context, String title, String text, String yesBt, String noBt) {

        dialog = new Dialog(context);

        dialog.setContentView(R.layout.yes_no_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        _title = dialog.findViewById(R.id.dialog_title);
        _text = dialog.findViewById(R.id.dialog_text);
        _yes = dialog.findViewById(R.id.dialog_yes_b);
        _no = dialog.findViewById(R.id.dialog_no_b);

        _yes.setText(yesBt);
        _no.setText(noBt);
        _title.setText(title);
        _text.setText(text);
    }

    public DialogShower(Context context, String title, String text, String yesBt, boolean editText) {

        if (editText) {
            dialog = new Dialog(context);
            dialog.setContentView(R.layout.yes_enter_dialog);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            _title = dialog.findViewById(R.id.dialog_title);
            _text = dialog.findViewById(R.id.dialog_text);
            _yes = dialog.findViewById(R.id.dialog_yes_b);
            _editText = dialog.findViewById(R.id.editTextNumberSigned);

            _yes.setText(yesBt);
            _title.setText(title);
            _text.setText(text);
        }
    }


    public void setYesClickListener(View.OnClickListener yesListener){
        if (this._yes != null) {
            this._yes.setOnClickListener(yesListener);
        }
    }

    public void setNoClickListener(View.OnClickListener noListener){
        if (this._no != null) {
            this._no.setOnClickListener(noListener);
        }
    }

    public void show(){
        this.dialog.show();
    }

    public void cancel(){
        this.dialog.cancel();
    }

    public void setCancelable(boolean cancelable){
        this.dialog.setCancelable(cancelable);
    }

}
