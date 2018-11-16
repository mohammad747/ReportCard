package com.example.android.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the view that shows the login button
        CardView cardView = (CardView) findViewById(R.id.login_cardView);

        //Set a click listener on that view
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(profileIntent);
            }
        });
    }
}
