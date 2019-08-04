package com.example.asmdemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView image;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.image);

        Glide.with(this).asBitmap().load("http://i1.whymtj.com/uploads/tu/201811/9999/4fea9edecd.jpg")
                .into(image);

    }

    @Override
    public void onClick(View v) {

    }

}
