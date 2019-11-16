package com.example.smapcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class keluhanBayiActivity extends AppCompatActivity {
    RadioGroup rkeluhan;
    LinearLayout kejang, demam, lupanafas, susahnetek, kuning, batukpilek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keluhan_bayi);

        rkeluhan = findViewById(R.id.keluhanbayi);
        kejang = findViewById(R.id.kejang);
        demam = findViewById(R.id.demam);
        lupanafas = findViewById(R.id.lupanafas);
        susahnetek = findViewById(R.id.susahnetek);
        kuning = findViewById(R.id.kuning);
        batukpilek = findViewById(R.id.batukpilek);

        rkeluhan.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                View r1 = rkeluhan.findViewById(i);
                int index= rkeluhan.indexOfChild(r1);
                switch (index){
                    case 0:
                        kejang.setVisibility(View.VISIBLE);
                        demam.setVisibility(View.GONE);
                        lupanafas.setVisibility(View.GONE);
                        susahnetek.setVisibility(View.GONE);
                        kuning.setVisibility(View.GONE);
                        batukpilek.setVisibility(View.GONE);
                        break;
                    case 1:
                        kejang.setVisibility(View.GONE);
                        demam.setVisibility(View.VISIBLE);
                        lupanafas.setVisibility(View.GONE);
                        susahnetek.setVisibility(View.GONE);
                        kuning.setVisibility(View.GONE);
                        batukpilek.setVisibility(View.GONE);
                        break;
                    case 2:
                        kejang.setVisibility(View.GONE);
                        demam.setVisibility(View.GONE);
                        lupanafas.setVisibility(View.GONE);
                        susahnetek.setVisibility(View.GONE);
                        kuning.setVisibility(View.GONE);
                        batukpilek.setVisibility(View.GONE);
                        break;
                    case 3:
                        kejang.setVisibility(View.GONE);
                        demam.setVisibility(View.GONE);
                        lupanafas.setVisibility(View.VISIBLE);
                        susahnetek.setVisibility(View.GONE);
                        kuning.setVisibility(View.GONE);
                        batukpilek.setVisibility(View.GONE);
                        break;
                    case 4:
                        kejang.setVisibility(View.GONE);
                        demam.setVisibility(View.GONE);
                        lupanafas.setVisibility(View.GONE);
                        susahnetek.setVisibility(View.VISIBLE);
                        kuning.setVisibility(View.GONE);
                        batukpilek.setVisibility(View.GONE);
                        break;
                    case 5:
                        kejang.setVisibility(View.GONE);
                        demam.setVisibility(View.GONE);
                        lupanafas.setVisibility(View.GONE);
                        susahnetek.setVisibility(View.GONE);
                        kuning.setVisibility(View.VISIBLE);
                        batukpilek.setVisibility(View.GONE);
                        break;
                    case 6:
                        kejang.setVisibility(View.GONE);
                        demam.setVisibility(View.GONE);
                        lupanafas.setVisibility(View.GONE);
                        susahnetek.setVisibility(View.GONE);
                        kuning.setVisibility(View.GONE);
                        batukpilek.setVisibility(View.VISIBLE);
                        break;

                }
            }
        });
    }
}
