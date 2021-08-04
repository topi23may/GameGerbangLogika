package com.destiny.gamegerbanglogika;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.destiny.gamegerbanglogika.Tabs.AndFragment;
import com.destiny.gamegerbanglogika.Tabs.NandFragment;
import com.destiny.gamegerbanglogika.Tabs.NorFragment;
import com.destiny.gamegerbanglogika.Tabs.OrFragment;
import com.destiny.gamegerbanglogika.Tabs.XnorFragment;
import com.destiny.gamegerbanglogika.Tabs.XorFragment;

public class LatihanActivity extends AppCompatActivity {
    LinearLayout LAND,LOR,LNAND,LNOR,LXOR,LXNOR;
    TextView AND,OR,NAND,NOR,XOR,XNOR;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
        Declaration();
        AND();
        OnCLick();
    }
    private void OnCLick(){
        LAND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AND();
            }
        });
        LOR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OR();
            }
        });
        LNAND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NAND();
            }
        });
        LNOR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NOR();
            }
        });
        LXOR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XOR();
            }
        });
        LXNOR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XNOR();
            }
        });
    }
    private void Declaration(){
        LAND = findViewById(R.id.linearAnd);
        LOR = findViewById(R.id.linearOr);
        LNAND = findViewById(R.id.linearNand);
        LNOR = findViewById(R.id.linearNor);
        LXOR = findViewById(R.id.linearXor);
        LXNOR = findViewById(R.id.linearXnor);

        AND = findViewById(R.id.tvAnd);
        OR = findViewById(R.id.tvOr);
        AND = findViewById(R.id.tvAnd);
        NAND = findViewById(R.id.tvNand);
        NOR = findViewById(R.id.tvNor);
        XOR = findViewById(R.id.tvXor);
        XNOR = findViewById(R.id.tvXnor);
    }
    private void ChangeFragment(Fragment fragment){
        if(fragment != null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.Container,fragment);
            ft.commit();
        }
    }
    private void Default(){
        LAND.setBackgroundResource(R.color.colorWhite);
        LOR.setBackgroundResource(R.color.colorWhite);
        LNAND.setBackgroundResource(R.color.colorWhite);
        LNOR.setBackgroundResource(R.color.colorWhite);
        LXOR.setBackgroundResource(R.color.colorWhite);
        LXNOR.setBackgroundResource(R.color.colorWhite);

        AND.setTextColor(Color.rgb(0,0,0));
        OR.setTextColor(Color.rgb(0,0,0));
        NAND.setTextColor(Color.rgb(0,0,0));
        NOR.setTextColor(Color.rgb(0,0,0));
        XOR.setTextColor(Color.rgb(0,0,0));
        XNOR.setTextColor(Color.rgb(0,0,0));
    }
    private void AND(){
        Default();
        LAND.setBackgroundResource(R.color.colorPrimary);
        AND.setTextColor(Color.rgb(255,255,255));
        fragment = new AndFragment();
        ChangeFragment(fragment);
    }
    private void OR(){
        Default();
        LOR.setBackgroundResource(R.color.colorPrimary);
        OR.setTextColor(Color.rgb(255,255,255));
        fragment = new OrFragment();
        ChangeFragment(fragment);
    }
    private void NAND(){
        Default();
        LNAND.setBackgroundResource(R.color.colorPrimary);
        NAND.setTextColor(Color.rgb(255,255,255));
        fragment = new NandFragment();
        ChangeFragment(fragment);
    }
    private void NOR(){
        Default();
        LNOR.setBackgroundResource(R.color.colorPrimary);
        NOR.setTextColor(Color.rgb(255,255,255));
        fragment = new NorFragment();
        ChangeFragment(fragment);
    }
    private void XOR(){
        Default();
        LXOR.setBackgroundResource(R.color.colorPrimary);
        XOR.setTextColor(Color.rgb(255,255,255));
        fragment = new XorFragment();
        ChangeFragment(fragment);
    }
    private void XNOR(){
        Default();
        LXNOR.setBackgroundResource(R.color.colorPrimary);
        XNOR.setTextColor(Color.rgb(255,255,255));
        fragment = new XnorFragment();
        ChangeFragment(fragment);
    }
}