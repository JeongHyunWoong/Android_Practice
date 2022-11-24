package com.jhw.myapplication;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ex13SwitchActivity extends AppCompatActivity {

    Switch switchView;
    TextView today;
    LinearLayout lilia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16_switch_lilia);

        today = findViewById(R.id.today);
        switchView = findViewById(R.id.switchView);
        lilia = (LinearLayout)findViewById(R.id.lilia);

        switchView.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    today.setText("부활");
                    lilia.setBackgroundResource(R.drawable.liliare);
                } else {
                    today.setText("사망");
                    lilia.setBackgroundResource(R.drawable.liliadie);
                }
            }
        });
    }
}