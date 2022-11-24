package com.jhw.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Ex1AnimationActivity extends AppCompatActivity {

    Animation ani1,ani2,ani3,ani4,ani5;
    ImageView ivTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main03_ani_nilla);

        ivTest = (ImageView)findViewById(R.id.imageView2);
        findViewById(R.id.btn1).setOnClickListener(mClick);
        findViewById(R.id.btn2).setOnClickListener(mClick);
        findViewById(R.id.btn3).setOnClickListener(mClick);
        findViewById(R.id.btn4).setOnClickListener(mClick);
        findViewById(R.id.btn5).setOnClickListener(mClick);

        ani1 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.alpha);
        ani2 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.set2);
        ani3 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.rotate2);
        ani4 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.translate2);
        ani5 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.scale2);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btn1:
                    ivTest.startAnimation(ani1);
                    break;
                case R.id.btn2:
                    ivTest.startAnimation(ani2);
                    break;
                case R.id.btn3:
                    ivTest.startAnimation(ani3);
                    break;
                case R.id.btn4:
                    ivTest.startAnimation(ani4);
                    break;
                case R.id.btn5:
                    ivTest.startAnimation(ani5);
                    break;
            }
        }
    };
}