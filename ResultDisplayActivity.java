package com.mobile_computing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ResultDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_display);
        String tit = getIntent().getStringExtra("title");
        String dat = getIntent().getStringExtra("date");
        String imag = getIntent().getStringExtra("img");
        String text = getIntent().getStringExtra("txt");

        // Make object appear

    }
}