package com.example.smapcare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adapter extends ArrayAdapter {
    private final Context context;
    private final String[] listForm;
    public Adapter(@NonNull Context context,
                   String[] listForm) {
        super(context, R.layout.list_group,listForm);
        this.context = context;
        this.listForm = listForm;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView =inflater.inflate(R.layout.list_group, null, true);
        TextView listF =itemView.findViewById(R.id.lblListHeader);

        listF.setText(listForm[position]);
        return itemView;
    }
}
