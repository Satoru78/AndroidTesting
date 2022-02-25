package com.example.bababoy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ButtonNext = findViewById(R.id.button_next);

        ButtonNext.setOnClickListener(v -> {
            Intent toMainActivity2Intent = new Intent (this, MainActivity2.class);
            startActivity(toMainActivity2Intent);
        });

    }
}