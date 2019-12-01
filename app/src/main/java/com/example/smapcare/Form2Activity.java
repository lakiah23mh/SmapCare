package com.example.smapcare;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class Form2Activity extends AppCompatActivity {

//    Resources res = getResources();
    String[] agama = {"Islam","Kristen","Katolik","Hindu","Budha"};
    String[] pendidikan = {"SD","SMP","SMA","D1","D2","D3","D4","S1","S2","S3"};
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.spinner_selected_item, agama);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);

        ArrayAdapter adapter1 = new ArrayAdapter<String>(this, R.layout.spinner_selected_item, pendidikan);
        adapter1.setDropDownViewResource(R.layout.spinner_dropdown_item);

        ArrayAdapter adapter2 = new ArrayAdapter<String>(this, R.layout.spinner_selected_item, agama);
        adapter2.setDropDownViewResource(R.layout.spinner_dropdown_item);

        ArrayAdapter adapter3 = new ArrayAdapter<String>(this, R.layout.spinner_selected_item, pendidikan);
        adapter3.setDropDownViewResource(R.layout.spinner_dropdown_item);


        Spinner spinner1 = findViewById(R.id.sp_agama);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Form2Activity.this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner spinner2 = findViewById(R.id.sp_pendidikan);
        spinner2.setAdapter(adapter1);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Form2Activity.this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner spinner3 = findViewById(R.id.sp_agamasuami);
        spinner3.setAdapter(adapter2);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Form2Activity.this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner spinner4 = findViewById(R.id.sp_pendidikansuami);
        spinner4.setAdapter(adapter3);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Form2Activity.this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}

