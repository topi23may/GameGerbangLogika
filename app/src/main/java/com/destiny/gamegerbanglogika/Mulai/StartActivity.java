package com.destiny.gamegerbanglogika.Mulai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.destiny.gamegerbanglogika.R;

public class StartActivity extends AppCompatActivity {
    Spinner dificulty,kategori;
    LinearLayout LDificulty,LKategori;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        dificulty = findViewById(R.id.spinnerDificulty);
        kategori = findViewById(R.id.spinnerKategori);
        LDificulty = findViewById(R.id.linearDificulty);
        LKategori = findViewById(R.id.linearCategory);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.dificulty, R.layout.spinner_item);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,
                R.array.kategorikal, R.layout.spinner_item);
        dificulty.setAdapter(adapter);
        kategori.setAdapter(adapter2);


        LDificulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dificulty.getSelectedItem().toString().equals("Easy")){
                    Intent goInput = new Intent(StartActivity.this, SoalActivity.class);
                    goInput.putExtra("NO",String.valueOf(0));
                    goInput.putExtra("SCORE",String.valueOf(0));
                    goInput.putExtra("KATEGORI","Easy");
                    int min = 1;
                    int max = 5;
                    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                    goInput.putExtra("RAND",String.valueOf(random_int));
                    startActivities(new Intent[]{goInput});
                }else if (dificulty.getSelectedItem().toString().equals("Normal")){
                    Intent goInput = new Intent(StartActivity.this, SoalActivity.class);
                    goInput.putExtra("NO",String.valueOf(0));
                    goInput.putExtra("SCORE",String.valueOf(0));
                    goInput.putExtra("KATEGORI","Normal");
                    int min = 1;
                    int max = 5;
                    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                    goInput.putExtra("RAND",String.valueOf(random_int));
                    startActivities(new Intent[]{goInput});
                }else if (dificulty.getSelectedItem().toString().equals("Hard")){
                    Intent goInput = new Intent(StartActivity.this, SoalActivity.class);
                    goInput.putExtra("NO",String.valueOf(0));
                    goInput.putExtra("SCORE",String.valueOf(0));
                    goInput.putExtra("KATEGORI","Hard");
                    int min = 1;
                    int max = 5;
                    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                    goInput.putExtra("RAND",String.valueOf(random_int));
                    startActivities(new Intent[]{goInput});
                }else{
                    Toast.makeText(StartActivity.this, "Harap Pilih Dificulty", Toast.LENGTH_SHORT).show();
                }
            }
        });
        LKategori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kategori.getSelectedItem().toString().equals("AND")){
                    Intent goInput = new Intent(StartActivity.this, SoalActivity.class);
                    goInput.putExtra("NO",String.valueOf(0));
                    goInput.putExtra("SCORE",String.valueOf(0));
                    goInput.putExtra("KATEGORI","AND");
                    int min = 1;
                    int max = 5;
                    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                    goInput.putExtra("RAND",String.valueOf(random_int));
                    startActivities(new Intent[]{goInput});
                }else if (kategori.getSelectedItem().toString().equals("OR")){
                    Intent goInput = new Intent(StartActivity.this, SoalActivity.class);
                    goInput.putExtra("NO",String.valueOf(0));
                    goInput.putExtra("SCORE",String.valueOf(0));
                    goInput.putExtra("KATEGORI","OR");
                    int min = 1;
                    int max = 5;
                    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                    goInput.putExtra("RAND",String.valueOf(random_int));
                    startActivities(new Intent[]{goInput});
                }else if (kategori.getSelectedItem().toString().equals("NAND")){
                    Intent goInput = new Intent(StartActivity.this, SoalActivity.class);
                    goInput.putExtra("NO",String.valueOf(0));
                    goInput.putExtra("SCORE",String.valueOf(0));
                    goInput.putExtra("KATEGORI","NAND");
                    int min = 1;
                    int max = 5;
                    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                    goInput.putExtra("RAND",String.valueOf(random_int));
                    startActivities(new Intent[]{goInput});
                }else if (kategori.getSelectedItem().toString().equals("NOR")){
                    Intent goInput = new Intent(StartActivity.this, SoalActivity.class);
                    goInput.putExtra("NO",String.valueOf(0));
                    goInput.putExtra("SCORE",String.valueOf(0));
                    goInput.putExtra("KATEGORI","NOR");
                    int min = 1;
                    int max = 5;
                    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                    goInput.putExtra("RAND",String.valueOf(random_int));
                    startActivities(new Intent[]{goInput});
                }else if (kategori.getSelectedItem().toString().equals("XOR")){
                    Intent goInput = new Intent(StartActivity.this, SoalActivity.class);
                    goInput.putExtra("NO",String.valueOf(0));
                    goInput.putExtra("SCORE",String.valueOf(0));
                    goInput.putExtra("KATEGORI","XOR");
                    int min = 1;
                    int max = 5;
                    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                    goInput.putExtra("RAND",String.valueOf(random_int));
                    startActivities(new Intent[]{goInput});
                }else if (kategori.getSelectedItem().toString().equals("XNOR")){
                    Intent goInput = new Intent(StartActivity.this, SoalActivity.class);
                    goInput.putExtra("NO",String.valueOf(0));
                    goInput.putExtra("SCORE",String.valueOf(0));
                    goInput.putExtra("KATEGORI","XNOR");
                    int min = 1;
                    int max = 5;
                    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                    goInput.putExtra("RAND",String.valueOf(random_int));
                    startActivities(new Intent[]{goInput});
                }else{
                    Toast.makeText(StartActivity.this, "Harap Pilih Kategori", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}