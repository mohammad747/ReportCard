package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class GradesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades);

        //Create an arrayList to store the grades
        ArrayList<Grades> grades =new ArrayList<Grades>();

        //Initialize that arrayList
        grades.add(new Grades("Mathematic","75%"));
        grades.add(new Grades("Software Engineering 1","50%"));
        grades.add(new Grades("Data Structure","55%"));
        grades.add(new Grades("Algorithms","88%"));
        grades.add(new Grades("Programming","90%"));


        //Modified array adapter
        GradesAdapter gradesAdapter = new GradesAdapter(this,grades);

        ListView listView =(ListView)findViewById(R.id.list);

        listView.setAdapter(gradesAdapter);



    }
}
