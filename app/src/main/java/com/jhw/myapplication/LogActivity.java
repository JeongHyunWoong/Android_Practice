package com.jhw.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class LogActivity extends AppCompatActivity {
    private static int progress_percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main01_log);

        ProgressBar progressBar = findViewById(R.id.progressBar);
        progress_percent = 0;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable()

        {
            @Override
            public void run() {
                Intent intent = new Intent(LogActivity.this, Log1Activity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);

        new Thread() {
            public  void run() {
                while(true) {
                    try {
                        while(!Thread.currentThread().isInterrupted()){
                            progress_percent += 20;
                            Thread.sleep(1000);
                            ProgressBar progressBar = findViewById(R.id.progressBar);
                            progressBar.setProgress(progress_percent);

                            if (progress_percent >= 100) {
                                Intent intent = new Intent(LogActivity.this, Log1Activity.class);
                                startActivity(intent);
                                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                                currentThread().interrupt();
                            }
                        }
                    } catch (Throwable t){
                    } finally {
                    }
                }
            }
        }.start();
    }
}