package com.destiny.gamegerbanglogika;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.destiny.gamegerbanglogika.Method.Method;
import com.destiny.gamegerbanglogika.Mulai.StartActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomeActivity extends AppCompatActivity {
    LinearLayout Latihan,Mulai;
    ImageView ivHeader;
    TextView tvHeader,tvTgl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ivHeader = findViewById(R.id.ivHeader);
        tvHeader = findViewById(R.id.tvHeader);
        Latihan = findViewById(R.id.linearLatihan);
        Mulai = findViewById(R.id.linearMulai);
        Latihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(HomeActivity.this,LatihanActivity.class);
                startActivity(intent);
            }
        });
        Mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(HomeActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
        builder.setMessage("Keluar Aplikasi ?")
                .setCancelable(false)
                .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finishAffinity();
                        System.exit(0);
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                })
                //Set your icon here
                .setTitle("Perhatian !!!")
                .setIcon(R.drawable.ic_baseline_exit_to_app_24);
        AlertDialog alert = builder.create();
        alert.show();
    }
}