package com.example.mad314_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String sum = intent1.getStringExtra("sum");
        String product1 = intent1.getStringExtra("product");
        textView.setText(sum);
        textView1.setText(product1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
    }
    Intent intent1= new Intent(Main2Activity.this,MainActivity.class);
    TextView textView = findViewById(R.id.textView);
    TextView textView1 = findViewById(R.id.textView2);
    Button button = findViewById(R.id.button2);
}
