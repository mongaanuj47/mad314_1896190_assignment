package com.example.mad314_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent= new Intent(MainActivity.this,Main2Activity.class);
        final EditText value1 = findViewById(R.id.input1);
        final EditText value2 = findViewById(R.id.input2);
        final EditText value3 = findViewById(R.id.input3);
        Button button = findViewById(R.id.button1);
        int num1=Integer.parseInt(value1.getText().toString());
        int num2=Integer.parseInt(value2.getText().toString());
        int num3=Integer.parseInt(value3.getText().toString());
        final int sum = num1 + num2 + num3;
        final int product = num1* num2* num3;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sum",sum);
                intent.putExtra("product",product);
                startActivity(intent);
            }
        });
    }
}
