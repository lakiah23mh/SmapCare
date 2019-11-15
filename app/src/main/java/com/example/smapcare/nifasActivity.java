package com.example.smapcare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class nifasActivity extends AppCompatActivity {
    RadioGroup rnifas, rpersalinan,rmenyusui, rmslhmenyusui;
    LinearLayout nifas03,nifas47,nifas814,nifas1542,lhrspontan,lhrsc,menyusuiya,mslhmenyusui;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nifas);

        rnifas = findViewById(R.id.radionifas);
        rpersalinan = findViewById(R.id.persalinan);
        rmenyusui = findViewById(R.id.menyusui);
        rmslhmenyusui = findViewById(R.id.masalahmenyusui);
        nifas03 = findViewById(R.id.nifas03);
        lhrspontan = findViewById(R.id.lhrspontan);
        nifas47 =findViewById(R.id.nifas47);
        nifas814 =findViewById(R.id.nifas814);
        nifas1542 =findViewById(R.id.nifas1542);
        lhrsc = findViewById(R.id.lhrsc);
        menyusuiya = findViewById(R.id.menyusuiya);
        mslhmenyusui = findViewById(R.id.mslhmenyusui);

        rnifas.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                View r1 = rnifas.findViewById(i);
                int index= rnifas.indexOfChild(r1);
                switch (index){
                    case 0:
                        nifas03.setVisibility(View.VISIBLE);
                        nifas47.setVisibility(View.GONE);
                        nifas814.setVisibility(View.GONE);
                        nifas1542.setVisibility(View.GONE);
                        break;
                    case 1:
                        nifas03.setVisibility(View.GONE);
                        nifas47.setVisibility(View.VISIBLE);
                        nifas814.setVisibility(View.GONE);
                        nifas1542.setVisibility(View.GONE);
                        break;
                    case 2:
                        nifas03.setVisibility(View.GONE);
                        nifas47.setVisibility(View.GONE);
                        nifas814.setVisibility(View.VISIBLE);
                        nifas1542.setVisibility(View.GONE);
                        break;
                    case 3:
                        nifas03.setVisibility(View.GONE);
                        nifas47.setVisibility(View.GONE);
                        nifas814.setVisibility(View.GONE);
                        nifas1542.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });
        rmenyusui.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                View r1 = rmenyusui.findViewById(i);
                int index= rmenyusui.indexOfChild(r1);
                switch (index){
                    case 0:
                        menyusuiya.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        menyusuiya.setVisibility(View.GONE);
                        break;
                }
            }
        });

        rpersalinan.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                View r1 = rpersalinan.findViewById(i);
                int index= rpersalinan.indexOfChild(r1);
                switch (index){
                    case 0:
                        lhrspontan.setVisibility(View.VISIBLE);
                        lhrsc.setVisibility(View.GONE);
                        break;
                    case 1:
                        lhrspontan.setVisibility(View.GONE);
                        lhrsc.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });
        rmslhmenyusui.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                View r1 = rmslhmenyusui.findViewById(i);
                int index= rmslhmenyusui.indexOfChild(r1);
                switch (index){
                    case 0:
                        mslhmenyusui.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        mslhmenyusui.setVisibility(View.GONE);
                        break;
                }
            }
        });
    }
}
