package com.example.android.jokesdisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayMainActivity extends AppCompatActivity {

    public static String JOKE_KEY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_dispay);

        TextView textView = findViewById(R.id.joke_text_view);
        Intent intent = getIntent();
        if (intent.hasExtra(JOKE_KEY)){
            String joke = intent.getStringExtra(JOKE_KEY);
            textView.setText(joke);
        }
    }
}
