package com.example.smapcare;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class ibuMelahirkanActivity extends AppCompatActivity {
    EditText edt1;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibu_melahirkan);

        radioGroup = findViewById(R.id.tmptlahir);
        edt1 = findViewById(R.id.lainnya);

        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                View r1 = radioGroup.findViewById(i);
                int index= radioGroup.indexOfChild(r1);

                if(index==3){
                    edt1.setVisibility(View.VISIBLE);
                } else {
                    edt1.setVisibility(View.GONE);
                }
        }
    });


    }


}
