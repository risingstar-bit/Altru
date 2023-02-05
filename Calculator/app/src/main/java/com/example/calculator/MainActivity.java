package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edt1,edt2;
TextView tv;
Button plus,minus,divide,multiply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=findViewById(R.id.editText1);
        edt2=findViewById(R.id.editText2);
        tv=findViewById(R.id.result);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        divide=findViewById(R.id.divide);
        multiply=findViewById(R.id.mul);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first=edt1.getText().toString();
                double num1=Double.parseDouble(first);
                String second=edt2.getText().toString();
                double num2=Double.parseDouble(second);
                double result=num1+num2;
                tv.setText("Result : "+Double.toString(result));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first=edt1.getText().toString();
                double num1=Double.parseDouble(first);
                String second=edt2.getText().toString();
                double num2=Double.parseDouble(second);
                double result=num1-num2;
                tv.setText("Result : "+Double.toString(result));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first=edt1.getText().toString();
                double num1=Double.parseDouble(first);
                String second=edt2.getText().toString();
                double num2=Double.parseDouble(second);
                double result=num1*num2;
                tv.setText("Result : "+Double.toString(result));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first=edt1.getText().toString();
                double num1=Double.parseDouble(first);
                String second=edt2.getText().toString();
                double num2=Double.parseDouble(second);
                if(num2==0){
                    tv.setText("Result : cannot divide by Zero");
                }
                else {
                    double result = num1 / num2;
                    tv.setText("Result : " + Double.toString(result));
                }
            }
        });
    }
}