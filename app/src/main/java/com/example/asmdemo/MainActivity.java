package com.example.asmdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView image;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.image);

        Glide.with(this).load("http://i1.whymtj.com/uploads/tu/201811/9999/4fea9edecd.jpg").into(image);

    }

    @Override
    public void onClick(View v) {

    }

}
