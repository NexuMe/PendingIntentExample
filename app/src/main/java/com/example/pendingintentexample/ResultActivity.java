package com.example.pendingintentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvResult = findViewById(R.id.tvResult);

        Intent intent = getIntent();
        if(intent.hasExtra("resultActivity")){
            String resultStr = intent.getStringExtra("resultActivity");
            tvResult.setText(resultStr);
        }

    }
}