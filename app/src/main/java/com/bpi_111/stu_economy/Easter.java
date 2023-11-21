package com.bpi_111.stu_economy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Easter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easter);

        WebView webView = findViewById(R.id.recroll);
        webView.loadUrl("https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstley");
        WebView webView1 = findViewById(R.id.memes);
        webView1.loadUrl("http://smolensk.library67.ru/cbs-40-let/shutki-anekdoty-o-bibliotekah-i-/shutki-anekdoty-o-bibliotekah-i-/");
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
    }

    public void imgClickEgg(View v){
        TextView tv = findViewById(R.id.textViewEgg);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                tv.setText("3");
            }
        }, 1000);
        handler.postDelayed(new Runnable() {
            public void run() {
                tv.setText("2");
            }
        }, 2000);
        handler.postDelayed(new Runnable() {
            public void run() {
                tv.setText("1");
            }
        }, 3000);
        handler.postDelayed(new Runnable() {
            public void run() {
                finish();
            }
        }, 4000);
    }
}