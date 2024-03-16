package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
public class ListAdapter extends ArrayAdapter<List_Section> {

    public ListAdapter(@NonNull Context context, ArrayList<List_Section> list_SectionArrayList) {

        super(context, R.layout.list_item, list_SectionArrayList);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        List_Section list_section = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
            TextView className = convertView.findViewById(R.id.className);
            TextView yearLevel = convertView.findViewById(R.id.yearLevel);

            className.setText(list_section.className);
            yearLevel.setText(list_section.yearLevel);



        return convertView;

        }
    }

