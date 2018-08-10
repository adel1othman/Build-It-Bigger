package com.example.adel.myandroidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class JokeDisplayActivity extends AppCompatActivity {

    public final static String INTENT_JOKE = "INTENT_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        String joke = getIntent().getStringExtra(INTENT_JOKE);
        TextView textViewJoke = findViewById(R.id.textview_joke);
        textViewJoke.setText(joke);
    }
}
