package com.chriscodes.christopherfortune.unittestingpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private float value1, value2, totalValue;

    private boolean addition, subtraction, multiply, divide;

    private TextView mathTxtVw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num0Btn = findViewById(R.id.num_0_btn);
        Button num1Btn = findViewById(R.id.num_1_btn);
        Button num2Btn = findViewById(R.id.num_2_btn);
        Button num3Btn = findViewById(R.id.num_3_btn);
        Button num4Btn = findViewById(R.id.num_4_btn);
        Button num5Btn = findViewById(R.id.num_5_btn);
        Button num6Btn = findViewById(R.id.num_6_btn);
        Button num7Btn = findViewById(R.id.num_7_btn);
        Button num8Btn = findViewById(R.id.num_8_btn);
        Button num9Btn = findViewById(R.id.num_9_btn);
        Button decBtn = findViewById(R.id.dec_btn);
        Button clearBtn = findViewById(R.id.clear_btn);
        Button plusBtn = findViewById(R.id.plus_btn);
        Button minusBtn = findViewById(R.id.minus_btn);
        Button multBtn = findViewById(R.id.multi_btn);
        Button divBtn = findViewById(R.id.div_btn);
        Button eqlBtn = findViewById(R.id.equal_btn);
        mathTxtVw = findViewById(R.id.math_txtVw);

        num0Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String displayValue = getString(R.string.displayValue, mathTxtVw.getText(), "0");
                mathTxtVw.setText(displayValue);
            }
        });

        num1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String displayValue = getString(R.string.displayValue, mathTxtVw.getText(), "1");
                mathTxtVw.setText(displayValue);
            }
        });

        num2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayValue = getString(R.string.displayValue, mathTxtVw.getText(), "2");
                mathTxtVw.setText(displayValue);
            }
        });

        num3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayValue = getString(R.string.displayValue, mathTxtVw.getText(), "3");
                mathTxtVw.setText(displayValue);
            }
        });

        num4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayValue = getString(R.string.displayValue, mathTxtVw.getText(), "4");
                mathTxtVw.setText(displayValue);
            }
        });

        num5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayValue = getString(R.string.displayValue, mathTxtVw.getText(), "5");
                mathTxtVw.setText(displayValue);
            }
        });

        num6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayValue = getString(R.string.displayValue, mathTxtVw.getText(), "6");
                mathTxtVw.setText(displayValue);
            }
        });

        num7Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayValue = getString(R.string.displayValue, mathTxtVw.getText(), "7");
                mathTxtVw.setText(displayValue);
            }
        });

        num8Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayValue = getString(R.string.displayValue, mathTxtVw.getText(), "8");
                mathTxtVw.setText(displayValue);
            }
        });

        num9Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayValue = getString(R.string.displayValue, mathTxtVw.getText(), "9");
                mathTxtVw.setText(displayValue);
            }
        });

        decBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayValue = getString(R.string.displayValue, mathTxtVw.getText(), ".");
                mathTxtVw.setText(displayValue);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathTxtVw.setText("");
            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mathTxtVw.getText() == ""){
                    value1 = Float.parseFloat(0 + "");
                    addition = true;
                    mathTxtVw.setText(null);
                } else {
                    value1 = Float.parseFloat(mathTxtVw.getText() + "");
                    addition = true;
                    mathTxtVw.setText(null);
                }
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mathTxtVw.getText() == ""){
                    value1 = Float.parseFloat(0 + "");
                    subtraction = true;
                    mathTxtVw.setText(null);
                } else {
                    value1 = Float.parseFloat(mathTxtVw.getText() + "");
                    subtraction = true;
                    mathTxtVw.setText(null);
                }
            }
        });

        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mathTxtVw.getText() == ""){
                    value1 = Float.parseFloat(0 + "");
                    multiply = true;
                    mathTxtVw.setText(null);
                } else {
                    value1 = Float.parseFloat(mathTxtVw.getText() + "");
                    multiply = true;
                    mathTxtVw.setText(null);
                }
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mathTxtVw.getText() == ""){
                    value1 = Float.parseFloat(0 + "");
                    divide = true;
                    mathTxtVw.setText(null);
                } else {
                    value1 = Float.parseFloat(mathTxtVw.getText() + "");
                    divide = true;
                    mathTxtVw.setText(null);
                }
            }
        });

        eqlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value2 = Float.parseFloat(mathTxtVw.getText() + "");

                if (addition) {

                    totalValue = value1 + value2;
                    mathTxtVw.setText(totalValue + "");
                    addition = false;
                    totalValue = 0;

                } else if (subtraction) {

                    totalValue = value1 - value2;
                    mathTxtVw.setText(totalValue + "");
                    subtraction = false;
                    totalValue = 0;

                } else if (multiply) {

                    totalValue = value1 * value2;
                    mathTxtVw.setText(totalValue + "");
                    totalValue = 0;
                    multiply = false;

                } else if (divide) {

                    totalValue = value1 / value2;
                    mathTxtVw.setText(totalValue + "");
                    divide = false;
                    totalValue = 0;
                }
            }
        });
    }
}
