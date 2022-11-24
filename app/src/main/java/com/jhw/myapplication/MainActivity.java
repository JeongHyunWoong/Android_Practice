package com.jhw.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02_introduce);

        findViewById(R.id.btn1).setOnClickListener(mClick);
        findViewById(R.id.btn2).setOnClickListener(mClick);
        findViewById(R.id.btn3).setOnClickListener(mClick);
        findViewById(R.id.btn4).setOnClickListener(mClick);
        findViewById(R.id.btn5).setOnClickListener(mClick);
        findViewById(R.id.btn6).setOnClickListener(mClick);
        findViewById(R.id.btn7).setOnClickListener(mClick);
        findViewById(R.id.btn8).setOnClickListener(mClick);
        findViewById(R.id.btn9).setOnClickListener(mClick);
        findViewById(R.id.btn10).setOnClickListener(mClick);
        findViewById(R.id.btn11).setOnClickListener(mClick);
        findViewById(R.id.btn12).setOnClickListener(mClick);
        findViewById(R.id.btn13).setOnClickListener(mClick);
        findViewById(R.id.btn14).setOnClickListener(mClick);
        findViewById(R.id.btn15).setOnClickListener(mClick);
        findViewById(R.id.btn16).setOnClickListener(mClick);
        findViewById(R.id.btn17).setOnClickListener(mClick);
        findViewById(R.id.btn18).setOnClickListener(mClick);
        findViewById(R.id.btn19).setOnClickListener(mClick);
        findViewById(R.id.btn20).setOnClickListener(mClick);
        findViewById(R.id.btn21).setOnClickListener(mClick);
        findViewById(R.id.btn22).setOnClickListener(mClick);
    }
    Button.OnClickListener mClick = new Button.OnClickListener()

    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btn1:
                    Intent ex1 = new Intent(MainActivity.this, Ex1AnimationActivity.class);
                    startActivity(ex1);
                    break;
                case R.id.btn2:
                    Intent ex2 = new Intent(MainActivity.this, Ex2GifActivity.class);
                    startActivity(ex2);
                    break;
                case R.id.btn3:
                    Intent ex3 = new Intent(MainActivity.this, Ex3VideoActivity.class);
                    startActivity(ex3);
                    break;
                case R.id.btn4:
                    Intent ex4 = new Intent(MainActivity.this, Ex4MediaActivity.class);
                    startActivity(ex4);
                    break;
                case R.id.btn5:
                    Intent ex5 = new Intent(MainActivity.this, Ex5WebViewActivity.class);
                    startActivity(ex5);
                    break;
                case R.id.btn6:
                    Intent ex6 = new Intent(MainActivity.this, Ex6PhoneNumberActivity.class);
                    startActivity(ex6);
                    break;
                case R.id.btn7:
                    Intent ex7 = new Intent(MainActivity.this, Ex7SmsActivity.class);
                    startActivity(ex7);
                    break;
                case R.id.btn8:
                    Intent ex8 = new Intent(MainActivity.this,Ex8GalleryActivity.class);
                    startActivity(ex8);
                    break;
                case R.id.btn9:
                    Intent ex9 = new Intent(MainActivity.this,Ex9ListActivity.class);
                    startActivity(ex9);
                    break;
                case R.id.btn10:
                    Intent ex10 = new Intent(MainActivity.this,Ex10ListViewActivity.class);
                    startActivity(ex10);
                    break;
                case R.id.btn11:
                    Intent ex11 = new Intent(MainActivity.this,Ex11ListViewActivity.class);
                    startActivity(ex11);
                    break;
                case R.id.btn12:
                    Intent ex12 = new Intent(MainActivity.this,Ex12SpinnerActivity.class);
                    startActivity(ex12);
                    break;
                case R.id.btn13:
                    Intent ex13 = new Intent(MainActivity.this,Ex13SwitchActivity.class);
                    startActivity(ex13);
                    break;
                case R.id.btn14:
                    Intent ex14 = new Intent(MainActivity.this, Ex14intentSendActivity.class);
                    startActivity(ex14);
                    break;
                case R.id.btn15:
                    Intent ex15 = new Intent(MainActivity.this, Ex15SharedPreferencesActivity.class);
                    startActivity(ex15);
                    break;
                case R.id.btn16:
                    Intent ex16 = new Intent(MainActivity.this, Ex16Viewpager2Activity.class);
                    startActivity(ex16);
                    break;
                case R.id.btn17:
                    Intent ex17 = new Intent(MainActivity.this, Ex17HadlerActivity.class);
                    startActivity(ex17);
                    break;
                case R.id.btn18:
                    Intent ex18 = new Intent(MainActivity.this, Ex18FragmentActivity.class);
                    startActivity(ex18);
                    break;
                case R.id.btn19:
                    Intent ex19 = new Intent(MainActivity.this, Ex19CalcActivity.class);
                    startActivity(ex19);
                    break;
                case R.id.btn20:
                    Intent ex20 = new Intent(MainActivity.this, Ex20GpsMapActivity.class);
                    startActivity(ex20);
                    break;
                case R.id.btn21:
                    Intent ex21 = new Intent(MainActivity.this, Ex21SQLiteExLogin.class);
                    startActivity(ex21);
                    break;
                case R.id.btn22:
                    Intent ex22 = new Intent(MainActivity.this, Ex22DDayActivity.class);
                    startActivity(ex22);
                    break;
            }
        }
    };
}