package com.jhw.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ex14intentReceiveActivity extends AppCompatActivity {

    TextView tvName, tvPrice;
    String data1, data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17_intentre_set);

        tvName = (TextView) findViewById(R.id.tvName);
        tvPrice = (TextView) findViewById(R.id.tvPrice);
        Intent getIntent = getIntent();
        data1 = getIntent.getStringExtra("data1");
        data2 = getIntent.getStringExtra("data2");

        tvName.setText(data1);
        tvPrice.setText(data2 + "원");

        findViewById(R.id.btnBack).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btnBack:
                    Intent ex17 = new Intent(Ex14intentReceiveActivity.this, Ex14intentSendActivity.class);
                    startActivity(ex17);
                    finish();
                    break;
            }
        }
    };
}


