package com.example;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Anastasia Belozertseva
 */
public class Splash extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                } finally{
                    Intent openActivity = new Intent(Splash.this, Menu.class);
                    startActivity(openActivity);
                }
            }
        };
        timer.start();
    }

    @Override
    public void onPause(){
        super.onPause();
        finish();
    }
}
