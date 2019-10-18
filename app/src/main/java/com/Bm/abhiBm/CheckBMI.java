package com.Bm.abhiBm;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CheckBMI extends AppCompatActivity {
    TextView txtresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_bmi);
        txtresult=findViewById(R.id.textresult);
        Intent intent = getIntent();
        double bmi= Double.parseDouble(intent.getStringExtra("bmi"));
        new Calculate().CheckBmi(txtresult,bmi);
    }

}