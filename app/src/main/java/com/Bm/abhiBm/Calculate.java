package com.Bm.abhiBm;


import android.widget.TextView;

import java.text.DecimalFormat;

public class Calculate {


    public double calculateBMI(double height, double weight) {
        double bmi = (weight / (height * height));
        return bmi;
    }

    public void CheckBmi(TextView txtresult, double bmi) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (bmi < 16) {
            txtresult.setText("your BMI is : " +decimalFormat.format(bmi) + " Your are Sever Thinness ");
        } else if ((bmi > 16) && (bmi < 17)) {
            txtresult.setText("your BMI is : " + decimalFormat.format(bmi)  + " Your are Moderate Thinness ");
        } else if ((bmi > 17) && (bmi < 18.5)) {
            txtresult.setText("your BMI is : " + decimalFormat.format(bmi)  + " Your are Mild Thinness ");
        } else if ((bmi > 18.5) && (bmi < 25)) {
            txtresult.setText("your BMI is : " + decimalFormat.format(bmi)  + " Your are Normal  ");
        } else if ((bmi > 25) && (bmi < 30)) {
            txtresult.setText("your BMI is : " + decimalFormat.format(bmi)  + " Your are Overweight ");
        } else if ((bmi < 30)) {
            txtresult.setText("your BMI is : " + decimalFormat.format(bmi)  + " Your are Obese ");
        }

    }
}
