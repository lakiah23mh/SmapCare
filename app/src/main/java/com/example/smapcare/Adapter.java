package com.example.smapcare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter {
    private final String[] judulKonten;
    private final Context context;

    public Adapter(@NonNull Context context,
                   String[] judulKonten) {
        super(context, R.layout.listkonten, judulKonten);
        this.context= context;
        this.judulKonten= judulKonten;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View itemView =inflater.inflate(R.layout.listkonten, null,true);
        TextView jdlkonten = itemView.findViewById(R.id.judul_konten);

        jdlkonten.setText(judulKonten[position]);
        
        return itemView;
    }
}
