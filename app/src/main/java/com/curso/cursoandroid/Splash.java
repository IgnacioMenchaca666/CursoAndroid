package com.curso.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by soporte.cta on 18/02/2017.
 */

public class Splash extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread =  new Thread(){
            public void run(){
                try {
                    sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(Splash.this, MainActivity.class);//sirve para guardar activitys
                    startActivity(intent);
                    finish();//Finaliza el splash para que no regrese al activity
                }
            }
        };
        thread.start();
    }
}
