package com.example.android.reportcard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GradesAdapter extends ArrayAdapter<Grades> {

    public GradesAdapter(@NonNull Context context, ArrayList<Grades> pGrades) {
        super(context, 0,pGrades);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listView = convertView;
        if(listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        Grades local_grades =getItem(position);

        TextView courseTextView = (TextView) listView.findViewById(R.id.courseName);

        courseTextView.setText(local_grades.getmCourses());

        TextView gradesTextView = (TextView) listView.findViewById(R.id.grades);

        gradesTextView.setText(local_grades.getmGrades());

        return listView;
    }
}
