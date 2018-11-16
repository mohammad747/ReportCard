package com.example.android.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageButton gradeImageButton = (ImageButton) findViewById(R.id.grade_image_button);

        gradeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gradeIntent = new Intent(ProfileActivity.this,GradesActivity.class);
                startActivity(gradeIntent);
            }
        });
    }
}
