package com.jhw.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex9ListActivity extends AppCompatActivity {

    TextView tvName1,tvName2,tvName3,tvName4,tvName5;
    TextView tvPhone1,tvPhone2,tvPhone3,tvPhone4,tvPhone5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12_list_rell);

        tvName1 = (TextView)findViewById(R.id.tvName1);
        tvName2 = (TextView)findViewById(R.id.tvName2);
        tvName3 = (TextView)findViewById(R.id.tvName3);
        tvName4 = (TextView)findViewById(R.id.tvName4);
        tvName5 = (TextView)findViewById(R.id.tvName5);
        tvPhone1 = (TextView)findViewById(R.id.tvPhone1);
        tvPhone2 = (TextView)findViewById(R.id.tvPhone2);
        tvPhone3 = (TextView)findViewById(R.id.tvPhone3);
        tvPhone4 = (TextView)findViewById(R.id.tvPhone4);
        tvPhone5 = (TextView)findViewById(R.id.tvPhone5);

        findViewById(R.id.btn1).setOnClickListener(mClick);
        findViewById(R.id.btn2).setOnClickListener(mClick);
        findViewById(R.id.btn3).setOnClickListener(mClick);
        findViewById(R.id.btn4).setOnClickListener(mClick);
        findViewById(R.id.btn5).setOnClickListener(mClick);
    }
    Button.OnClickListener mClick = new Button.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btn1:
                    String name1 = "tel:"+tvName1.getText().toString();
                    String number1 = "tel:"+tvPhone1.getText().toString();

                    Intent intentTel1 = new Intent(Intent.ACTION_VIEW, Uri.parse(number1));
                    startActivity(intentTel1);
                    Toast.makeText(Ex9ListActivity.this,name1+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn2:
                    String name2 = "tel:"+tvName2.getText().toString();
                    String number2 = "tel:"+tvPhone2.getText().toString();

                    Intent intentTel2 = new Intent(Intent.ACTION_VIEW, Uri.parse(number2));
                    startActivity(intentTel2);
                    Toast.makeText(Ex9ListActivity.this,name2+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn3:
                    String name3 = "tel:"+tvName3.getText().toString();
                    String number3 = "tel:"+tvPhone3.getText().toString();

                    Intent intentTel3 = new Intent(Intent.ACTION_VIEW, Uri.parse(number3));
                    startActivity(intentTel3);
                    Toast.makeText(Ex9ListActivity.this,name3+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn4:
                    String name4 = "tel:"+tvName4.getText().toString();
                    String number4 = "tel:"+tvPhone4.getText().toString();

                    Intent intentTel4 = new Intent(Intent.ACTION_VIEW, Uri.parse(number4));
                    startActivity(intentTel4);
                    Toast.makeText(Ex9ListActivity.this,name4+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn5:
                    String name5 = "tel:"+tvName5.getText().toString();
                    String number5 = "tel:"+tvPhone5.getText().toString();

                    Intent intentTel5 = new Intent(Intent.ACTION_VIEW, Uri.parse(number5));
                    startActivity(intentTel5);
                    Toast.makeText(Ex9ListActivity.this,name5+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}