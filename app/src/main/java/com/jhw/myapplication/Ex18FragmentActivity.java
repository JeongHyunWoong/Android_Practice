package com.jhw.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Ex18FragmentActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private Ex18FragmentA fragmentA;
    private Ex18FragmentB fragmentB;
    private Ex18FragmentC fragmentC;
    private Ex18FragmentD fragmentD;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21_fragment_yuumi);

        fragmentManager = getSupportFragmentManager();

        fragmentA = new Ex18FragmentA();
        fragmentB = new Ex18FragmentB();
        fragmentC = new Ex18FragmentC();
        fragmentD = new Ex18FragmentD();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();

        findViewById(R.id.btn_fragmentA).setOnClickListener(mClick);
        findViewById(R.id.btn_fragmentB).setOnClickListener(mClick);
        findViewById(R.id.btn_fragmentC).setOnClickListener(mClick);
        findViewById(R.id.btn_fragmentD).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            transaction = fragmentManager.beginTransaction();

            switch(v.getId())
            {
                case R.id.btn_fragmentA:
                    transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
                    break;
                case R.id.btn_fragmentB:
                    transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
                    break;
                case R.id.btn_fragmentC:
                    transaction.replace(R.id.frameLayout, fragmentC).commitAllowingStateLoss();
                    break;
                case R.id.btn_fragmentD:
                    transaction.replace(R.id.frameLayout, fragmentD).commitAllowingStateLoss();
                    break;
            }

        }
    };


}