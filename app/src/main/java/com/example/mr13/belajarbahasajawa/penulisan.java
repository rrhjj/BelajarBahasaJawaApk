package com.example.mr13.belajarbahasajawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class penulisan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penulisan);

        getSupportActionBar().setTitle("Contoh Penulisan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
