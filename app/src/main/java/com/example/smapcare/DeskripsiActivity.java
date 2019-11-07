package com.example.smapcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DeskripsiActivity extends AppCompatActivity {
    TextView textView,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);
        textView =findViewById(R.id.sub_judul);
        textView1=findViewById(R.id.deskripsi);
        String subjudul = getIntent().getStringExtra("movetosubjudul");
        String desc = getIntent().getStringExtra("movetodeskripsi");

        textView.setText(subjudul);
        textView1.setText(desc);

    }
}
