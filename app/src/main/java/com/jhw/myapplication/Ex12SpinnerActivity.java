package com.jhw.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ex12SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    ImageView ivPhoto;
    TextView tvName;
    Button btnBack;

    ArrayAdapter<String> myAdapter;
    Integer[] photos = {0,R.drawable.yone1,R.drawable.yone2,R.drawable.yone3,R.drawable.yone4};
    String[] names = {"이곳을 클릭하여 선택하세요.","기본스킨 요네","영혼의 꽃 요네","전투사관학교 요네","빛의 인도자 요네"};
    private Activity myActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15_spinner1_yone);

        myActivity = Ex12SpinnerActivity.this;
        myAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,names);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(myAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        if(position>0)
            showBigPhoto(position);
    }

    public void onNothingSelected(AdapterView<?> parent){

    }
    public void showBigPhoto(int position){
        setContentView(R.layout.activity_main15_spinner2_yone);

        tvName = (TextView)findViewById(R.id.tvName);
        ivPhoto = (ImageView)findViewById((R.id.ivChampion));
        tvName.setText(names[position]);
        ivPhoto.setImageResource(photos[position]);
        btnBack=(Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                myActivity.recreate();
            }
        });
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}