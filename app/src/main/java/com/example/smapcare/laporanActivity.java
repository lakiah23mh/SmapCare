package com.example.smapcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class laporanActivity extends AppCompatActivity {
    ListView lv_form;
    String[] listForm ={
            "Laporan ibu sudah melahirkan",
            "Kondisi realtime ibu dan bayi",
            "Nifas",
            "Keluhan pada bayi",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);

        lv_form =findViewById(R.id.lv_form);
        Adapter adapter = new Adapter(this,listForm);
        lv_form.setAdapter(adapter);
        lv_form.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(laporanActivity.this,ibuMelahirkanActivity.class);
                    startActivity(intent);
                } else if(position == 1){
                    Intent intent = new Intent(laporanActivity.this,realTimeActivity.class);
                    startActivity(intent);
                } else if (position == 2){
                    Intent intent = new Intent(laporanActivity.this, nifasActivity.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(laporanActivity.this, keluhanBayiActivity.class);
                    startActivity(intent);
                }


            }
        });
    }

}
