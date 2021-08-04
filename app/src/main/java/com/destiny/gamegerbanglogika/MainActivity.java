package com.destiny.gamegerbanglogika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                changeActivity();
            }
        }, 0000); //3000 L = 3 detik
    }
    private void changeActivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
}