package com.example.asmdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView text;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        text.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Log.d("xbase", "start time:" + System.currentTimeMillis());
        System.out.println("onclick test");
        Log.d("xbase", "end time:" + System.currentTimeMillis());
    }

}