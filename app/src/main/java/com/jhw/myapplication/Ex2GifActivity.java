package com.jhw.myapplication;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Ex2GifActivity extends AppCompatActivity {

    ImageView velbesq;
    ImageView velbesw;
    ImageView velbese;
    ImageView velbesr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main04_scroll_velbes);

        velbesq = (ImageView) findViewById(R.id.img2);
        velbesw = (ImageView) findViewById(R.id.img3);
        velbese = (ImageView) findViewById(R.id.img4);
        velbesr = (ImageView) findViewById(R.id.img5);

        Glide.with(Ex2GifActivity.this).load(R.drawable.velbesq).into(velbesq);
        Glide.with(Ex2GifActivity.this).load(R.drawable.velbesw).into(velbesw);
        Glide.with(Ex2GifActivity.this).load(R.drawable.velbese).into(velbese);
        Glide.with(Ex2GifActivity.this).load(R.drawable.velbesr).into(velbesr);
    }
}