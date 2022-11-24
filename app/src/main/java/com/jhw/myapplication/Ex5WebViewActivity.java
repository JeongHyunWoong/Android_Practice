package com.jhw.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ex5WebViewActivity extends AppCompatActivity {

    TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main07_web_bex);

        tvMsg = (TextView)findViewById(R.id.msg);

        findViewById(R.id.btn1).setOnClickListener(mClick);
        findViewById(R.id.btn2).setOnClickListener(mClick);
        findViewById(R.id.btn3).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btn1:
                    tvMsg.setText("구글접속!");
                    Intent act1 = new Intent(Ex5WebViewActivity.this, Ex5WebViewExGoogle.class);
                    startActivity(act1);
                    break;
                case R.id.btn2:
                    tvMsg.setText("유튜브접속!");
                    Intent act2 = new Intent(Ex5WebViewActivity.this, Ex5WebViewExYoutube.class);
                    startActivity(act2);
                    break;
                case R.id.btn3:
                    tvMsg.setText("네이버접속!");
                    Intent act3 = new Intent(Ex5WebViewActivity.this, Ex5WebViewExNaver.class);
                    startActivity(act3);
                    break;
            }
        }
    };
}