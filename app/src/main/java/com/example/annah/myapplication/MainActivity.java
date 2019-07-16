package com.example.annah.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ALC 4 Phase 1");

        Button about = findViewById(R.id.btn_about_alc);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abouti = new Intent(MainActivity.this,AboutAlc.class);
                startActivity(abouti);
            }
        });

        final Button profile = findViewById(R.id.btn_my_profile);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profilei= new Intent(MainActivity.this, Profile.class);
                startActivity(profilei);

            }
        });
    }
}
