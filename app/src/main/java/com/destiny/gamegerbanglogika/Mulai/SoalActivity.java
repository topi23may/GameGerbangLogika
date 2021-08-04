package com.destiny.gamegerbanglogika.Mulai;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel1;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel2;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel3;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel4;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel5;
import com.destiny.gamegerbanglogika.Model.Dificulty.Hard.HardModel1;
import com.destiny.gamegerbanglogika.Model.Dificulty.Hard.HardModel2;
import com.destiny.gamegerbanglogika.Model.Dificulty.Hard.HardModel3;
import com.destiny.gamegerbanglogika.Model.Dificulty.Hard.HardModel4;
import com.destiny.gamegerbanglogika.Model.Dificulty.Hard.HardModel5;
import com.destiny.gamegerbanglogika.Model.Dificulty.Medium.NormalModel1;
import com.destiny.gamegerbanglogika.Model.Dificulty.Medium.NormalModel2;
import com.destiny.gamegerbanglogika.Model.Dificulty.Medium.NormalModel3;
import com.destiny.gamegerbanglogika.Model.Dificulty.Medium.NormalModel4;
import com.destiny.gamegerbanglogika.Model.Dificulty.Medium.NormalModel5;
import com.destiny.gamegerbanglogika.Model.Kategorikal.AND.AndModel1;
import com.destiny.gamegerbanglogika.Model.Kategorikal.AND.AndModel2;
import com.destiny.gamegerbanglogika.Model.Kategorikal.AND.AndModel3;
import com.destiny.gamegerbanglogika.Model.Kategorikal.AND.AndModel4;
import com.destiny.gamegerbanglogika.Model.Kategorikal.AND.AndModel5;
import com.destiny.gamegerbanglogika.Model.Kategorikal.NAND.NandModel1;
import com.destiny.gamegerbanglogika.Model.Kategorikal.NAND.NandModel2;
import com.destiny.gamegerbanglogika.Model.Kategorikal.NAND.NandModel3;
import com.destiny.gamegerbanglogika.Model.Kategorikal.NAND.NandModel4;
import com.destiny.gamegerbanglogika.Model.Kategorikal.NAND.NandModel5;
import com.destiny.gamegerbanglogika.Model.Kategorikal.NOR.NorModel1;
import com.destiny.gamegerbanglogika.Model.Kategorikal.NOR.NorModel2;
import com.destiny.gamegerbanglogika.Model.Kategorikal.NOR.NorModel3;
import com.destiny.gamegerbanglogika.Model.Kategorikal.NOR.NorModel4;
import com.destiny.gamegerbanglogika.Model.Kategorikal.NOR.NorModel5;
import com.destiny.gamegerbanglogika.Model.Kategorikal.OR.OrModel1;
import com.destiny.gamegerbanglogika.Model.Kategorikal.OR.OrModel2;
import com.destiny.gamegerbanglogika.Model.Kategorikal.OR.OrModel3;
import com.destiny.gamegerbanglogika.Model.Kategorikal.OR.OrModel4;
import com.destiny.gamegerbanglogika.Model.Kategorikal.OR.OrModel5;
import com.destiny.gamegerbanglogika.Model.Kategorikal.XNOR.XnorModel1;
import com.destiny.gamegerbanglogika.Model.Kategorikal.XNOR.XnorModel2;
import com.destiny.gamegerbanglogika.Model.Kategorikal.XNOR.XnorModel3;
import com.destiny.gamegerbanglogika.Model.Kategorikal.XNOR.XnorModel4;
import com.destiny.gamegerbanglogika.Model.Kategorikal.XNOR.XnorModel5;
import com.destiny.gamegerbanglogika.Model.Kategorikal.XOR.XorModel1;
import com.destiny.gamegerbanglogika.Model.Kategorikal.XOR.XorModel2;
import com.destiny.gamegerbanglogika.Model.Kategorikal.XOR.XorModel3;
import com.destiny.gamegerbanglogika.Model.Kategorikal.XOR.XorModel4;
import com.destiny.gamegerbanglogika.Model.Kategorikal.XOR.XorModel5;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class SoalActivity extends AppCompatActivity {
    Button Jawaban1,Jawaban2,Jawaban3,Submit;
    ImageView Gambar;
    private ArrayList<DataModel> pList = new ArrayList<>();
    String Jawaban = "0";
    String Kategori,Random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
        Intent data = getIntent();
        String No = data.getStringExtra("NO");
        final String Score = data.getStringExtra("SCORE");
        final String Kategori = data.getStringExtra("KATEGORI");
        final String Random = data.getStringExtra("RAND");
        final int no = Integer.parseInt(No);
        Jawaban1 = findViewById(R.id.btnJawaban1);
        Jawaban2 = findViewById(R.id.btnJawaban2);
        Jawaban3 = findViewById(R.id.btnJawaban3);
        Submit = findViewById(R.id.btnSubmit);
        Gambar = findViewById(R.id.ivGambar);
        if (Kategori.equals("Easy")){
            if (Random.equals("1")){
                pList.addAll(EasyModel1.getListData());
            }else if (Random.equals("2")){
                pList.addAll(EasyModel2.getListData());
            }else if (Random.equals("3")){
                pList.addAll(EasyModel3.getListData());
            }else if (Random.equals("4")){
                pList.addAll(EasyModel4.getListData());
            }else{
                pList.addAll(EasyModel5.getListData());
            }
        }else if (Kategori.equals("Normal")){
            if (Random.equals("1")){
                pList.addAll(NormalModel1.getListData());
            }else if (Random.equals("2")){
                pList.addAll(NormalModel2.getListData());
            }else if (Random.equals("3")){
                pList.addAll(NormalModel3.getListData());
            }else if (Random.equals("4")){
                pList.addAll(NormalModel4.getListData());
            }else{
                pList.addAll(NormalModel5.getListData());
            }
        }else if (Kategori.equals("Hard")){
            if (Random.equals("1")){
                pList.addAll(HardModel1.getListData());
            }else if (Random.equals("2")){
                pList.addAll(HardModel2.getListData());
            }else if (Random.equals("3")){
                pList.addAll(HardModel3.getListData());
            }else if (Random.equals("4")){
                pList.addAll(HardModel4.getListData());
            }else{
                pList.addAll(HardModel5.getListData());
            }
        }else if (Kategori.equals("AND")){
            if (Random.equals("1")){
                pList.addAll(AndModel1.getListData());
            }else if (Random.equals("2")){
                pList.addAll(AndModel2.getListData());
            }else if (Random.equals("3")){
                pList.addAll(AndModel3.getListData());
            }else if (Random.equals("4")){
                pList.addAll(AndModel4.getListData());
            }else{
                pList.addAll(AndModel5.getListData());
            }
        }else if (Kategori.equals("NAND")){
            if (Random.equals("1")){
                pList.addAll(NandModel1.getListData());
            }else if (Random.equals("2")){
                pList.addAll(NandModel2.getListData());
            }else if (Random.equals("3")){
                pList.addAll(NandModel3.getListData());
            }else if (Random.equals("4")){
                pList.addAll(NandModel4.getListData());
            }else{
                pList.addAll(NandModel5.getListData());
            }
        }else if (Kategori.equals("NOR")){
            if (Random.equals("1")){
                pList.addAll(NorModel1.getListData());
            }else if (Random.equals("2")){
                pList.addAll(NorModel2.getListData());
            }else if (Random.equals("3")){
                pList.addAll(NorModel3.getListData());
            }else if (Random.equals("4")){
                pList.addAll(NorModel4.getListData());
            }else{
                pList.addAll(NorModel5.getListData());
            }
        }else if (Kategori.equals("OR")){
            if (Random.equals("1")){
                pList.addAll(OrModel1.getListData());
            }else if (Random.equals("2")){
                pList.addAll(OrModel2.getListData());
            }else if (Random.equals("3")){
                pList.addAll(OrModel3.getListData());
            }else if (Random.equals("4")){
                pList.addAll(OrModel4.getListData());
            }else{
                pList.addAll(OrModel5.getListData());
            }
        }else if (Kategori.equals("XNOR")){
            if (Random.equals("1")){
                pList.addAll(XnorModel1.getListData());
            }else if (Random.equals("2")){
                pList.addAll(XnorModel2.getListData());
            }else if (Random.equals("3")){
                pList.addAll(XnorModel3.getListData());
            }else if (Random.equals("4")){
                pList.addAll(XnorModel4.getListData());
            }else{
                pList.addAll(XnorModel5.getListData());
            }
        }else if (Kategori.equals("XOR")){
            if (Random.equals("1")){
                pList.addAll(XorModel1.getListData());
            }else if (Random.equals("2")){
                pList.addAll(XorModel2.getListData());
            }else if (Random.equals("3")){
                pList.addAll(XorModel3.getListData());
            }else if (Random.equals("4")){
                pList.addAll(XorModel4.getListData());
            }else{
                pList.addAll(XorModel5.getListData());
            }
        }
        getSupportActionBar().setTitle("No : "+pList.get(no).getNo());
        Jawaban1.setText(pList.get(no).getJawaban1());
        Jawaban2.setText(pList.get(no).getJawaban2());
        Jawaban3.setText(pList.get(no).getJawaban3());
        Gambar.setImageResource(Integer.parseInt(pList.get(no).getGambar()));
        final Handler handler = new Handler();
        Jawaban1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one(pList.get(no).getJawaban1());
            }
        });
        Jawaban2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two(pList.get(no).getJawaban2());
            }
        });
        Jawaban3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                three(pList.get(no).getJawaban3());
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Jawaban.equals(pList.get(no).getJawaban())){
                    Gambar.setImageResource(Integer.parseInt(pList.get(no).getGambar2()));
                    Toast.makeText(SoalActivity.this, "Jawaban Benar "+Jawaban, Toast.LENGTH_SHORT).show();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            if (no >= pList.size()-1){
                                Intent goInput = new Intent(SoalActivity.this, ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                goInput.putExtra("KATEGORI",Kategori);
                                startActivity(goInput);
                            }else{
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                goInput.putExtra("KATEGORI",Kategori);
                                goInput.putExtra("RAND",Random);
                                startActivities(new Intent[]{goInput});
                            }
                        }
                    }, 3000); //3000 L
                }else{
                    Toast.makeText(SoalActivity.this, "Jawaban Salah "+Jawaban+" Yang Benar adalah "+pList.get(no).getJawaban(), Toast.LENGTH_SHORT).show();
                    Gambar.setImageResource(Integer.parseInt(pList.get(no).getGambar()));
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            if (no >= pList.size()-1){
                                Intent goInput = new Intent(SoalActivity.this, ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)));
                                goInput.putExtra("KATEGORI",Kategori);
                                startActivity(goInput);
                            }else{
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)));
                                goInput.putExtra("KATEGORI",Kategori);
                                goInput.putExtra("RAND",Random);
                                startActivities(new Intent[]{goInput});
                            }
                        }
                    }, 3000); //3000 L
                }
            }
        });
    }
    private void Default(){
        Jawaban1.setBackgroundResource(R.drawable.button_home_white);
        Jawaban2.setBackgroundResource(R.drawable.button_home_white);
        Jawaban3.setBackgroundResource(R.drawable.button_home_white);
    }
    private void one(String Jaw){
        Default();
        Jawaban1.setBackgroundResource(R.drawable.button_red_rounded);
        Jawaban = Jaw;
    }

    private void two(String Jaw){
        Default();
        Jawaban2.setBackgroundResource(R.drawable.button_red_rounded);
        Jawaban = Jaw;
    }

    private void three(String Jaw){
        Default();
        Jawaban3.setBackgroundResource(R.drawable.button_red_rounded);
        Jawaban = Jaw;
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(SoalActivity.this);

        // Set a title for alert dialog
        builder.setTitle("Pemberitahuan");

        // Ask the final question
        builder.setMessage("Jika Kembali Sekarang Jawaban anda akan Ter-Reset");

        // Set the alert dialog yes button click listener
        builder.setPositiveButton("Iya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Do something when user clicked the Yes button
                Intent intent = new Intent(SoalActivity.this,StartActivity.class);
                startActivity(intent);
                finishAffinity();
            }
        });

        // Set the alert dialog no button click listener
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Do something when No button clicked
            }
        });

        AlertDialog dialog = builder.create();
        // Display the alert dialog on interface
        dialog.show();
    }
}