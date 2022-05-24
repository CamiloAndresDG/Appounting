package com.example.appounting.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.appounting.LogInActivity;
import com.example.appounting.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread logo = new Thread(){
            public void run(){
                try{
                    int tiempo=0;
                    while(tiempo<1500){
                        sleep(100);
                        tiempo=tiempo+100;
                    }
                    Intent i =new Intent(MainActivity.this, LogInActivity.class);
                    startActivity(i);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    finish();
                }
            }
        };
        logo.start();
    }
}