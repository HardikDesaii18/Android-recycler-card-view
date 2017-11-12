package com.example.hardikdesaii.recyclerviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class PhotoActivity extends AppCompatActivity {

    ImageView image;
    int photouri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        image=(ImageView)findViewById(R.id.img1);
        Intent intent=getIntent();
        photouri=intent.getIntExtra("image",android.R.drawable.btn_star);
        image.setImageResource(photouri);
    }
}
