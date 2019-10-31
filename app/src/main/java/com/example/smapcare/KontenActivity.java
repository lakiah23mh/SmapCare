package com.example.smapcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;



public class KontenActivity extends AppCompatActivity {
String [] judulKonten={
        "Perawatan bayi baru lahir",
        "Tanda-tanda bahaya bayi baru lahir",
        "Masalah pada bayi",
        "Masalah ibu nifas",
        "ASI",
        "Perubahan ibu nifas",
        "Tanda-tanda ibu nifas",
        "SC",
        "Luka jalan lahir",
        "Gizi ibu nifas",
};

ListView lv_konten;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konten);
        lv_konten =findViewById(R.id.lv_konten);
        Adapter adapter = new Adapter(this, judulKonten);
        lv_konten.setAdapter(adapter);



    }
}
