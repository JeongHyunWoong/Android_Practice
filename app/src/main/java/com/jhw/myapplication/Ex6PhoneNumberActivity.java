package com.jhw.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Ex6PhoneNumberActivity extends AppCompatActivity {

    Button btn1;
    EditText editTextPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main09_phone_akshan);

        btn1 = findViewById(R.id.btn1);
        editTextPhone = findViewById(R.id.editTextPhone);

        findViewById(R.id.btn1).setOnClickListener(mClick);
        //전화번호 표시로 변경해주기
        editTextPhone.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
    }
        View.OnClickListener mClick = new View.OnClickListener()
        {
            public void onClick(View v)
            {
                switch(v.getId())
                {
                    case R.id.btn1:
                        String tel_number = "tel:"+editTextPhone.getText().toString();

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number));
                        startActivity(intent);
                        break;
                }
            }
        };
}