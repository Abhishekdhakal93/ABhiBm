package com.Bm.abhiBm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edh, edw;
    TextView tv;
    Button btn, checkS;
    double Bmi;
//    Poso poso = new Poso();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edh = findViewById(R.id.edHeight);
        edw = findViewById(R.id.edWeight);
        btn = findViewById(R.id.btncal);
        btn.setOnClickListener(this);
        checkS = findViewById(R.id.checkS);
        checkS.setOnClickListener(this);
        tv = findViewById(R.id.tv);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.btncal):
                try {
                    double height = Double.parseDouble(edh.getText().toString());
                    double weight = Double.parseDouble(edw.getText().toString());
//                    poso.setWeight(weight);
//                    poso.setHeight(height);
//                    poso.setBmi(new Calculate().calculateBMI(height, weight));
                    Bmi =new Calculate().calculateBMI(height, weight);
                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
//                    tv.setText("Your BMI is : " + String.valueOf(decimalFormat.format(poso.getBmi())));
                    tv.setText("Your BMI is : " + String.valueOf(decimalFormat.format(Bmi)));
                    checkS.setVisibility(View.VISIBLE);
                } catch (Exception ex) {
                    Toast.makeText(this, "Please set correct value", Toast.LENGTH_SHORT).show();
                }
                break;
            case (R.id.checkS):
                Intent intent = new Intent(MainActivity.this, CheckBMI.class);
                intent.putExtra("bmi",String.valueOf(Bmi));
                startActivity(intent);
                break;

        }
    }


}

