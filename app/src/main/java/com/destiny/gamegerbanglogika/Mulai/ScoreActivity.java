package com.destiny.gamegerbanglogika.Mulai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.destiny.gamegerbanglogika.HomeActivity;
import com.destiny.gamegerbanglogika.R;

public class ScoreActivity extends AppCompatActivity {
    TextView Dificulty,Score;
    Button Continue,Stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Dificulty = findViewById(R.id.tvDificulty);
        Score = findViewById(R.id.tvScore);
        Continue = findViewById(R.id.btnContinue);
        Stop = findViewById(R.id.btnExit);

        Intent data = getIntent();
        final String score = data.getStringExtra("SCORE");
        final String Kategori = data.getStringExtra("KATEGORI");
        if (Kategori.equals("Easy")){
            Dificulty.setText("Kesulitan : "+Kategori);
        }else if (Kategori.equals("Normal")){
            Dificulty.setText("Kesulitan : "+Kategori);
        }else if (Kategori.equals("Hard")){
            Dificulty.setText("Kesulitan : "+Kategori);
        }else if (Kategori.equals("AND")){
            Dificulty.setText("Kategorikal : "+Kategori);
        }else if (Kategori.equals("NAND")){
            Dificulty.setText("Kategorikal : "+Kategori);
        }else if (Kategori.equals("NOR")){
            Dificulty.setText("Kategorikal : "+Kategori);
        }else if (Kategori.equals("OR")){
            Dificulty.setText("Kategorikal : "+Kategori);
        }else if (Kategori.equals("XNOR")){
            Dificulty.setText("Kategorikal : "+Kategori);
        }else if (Kategori.equals("XOR")){
            Dificulty.setText("Kategorikal : "+Kategori);
        }
        Score.setText(score);

        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreActivity.this,StartActivity.class);
                startActivity(intent);
            }
        });
        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}