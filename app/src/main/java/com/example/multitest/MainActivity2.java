package com.example.multitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.button2);
        textview = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextNumber);
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Button Working", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int cm = Integer.parseInt(s);
                Double feet = 0.032808*cm;
                textview.setText("Your height in Feet is "+ feet);
            }
           });*/

    }

    public void calculate(View view){
        Toast.makeText(MainActivity2.this, "Button Working", Toast.LENGTH_SHORT).show();
        String s = editText.getText().toString();
        int cm = Integer.parseInt(s);
        Double feet = 0.032808*cm;
        textview.setText("Your height in Feet is "+ feet);
    }
}