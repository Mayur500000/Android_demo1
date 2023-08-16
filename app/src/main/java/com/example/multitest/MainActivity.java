package com.example.multitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            //this take us to MainActiviy2
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
    //this method take us to MainActiviy3
    public void cal (View view){
        Toast.makeText(this, "Button Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
    }

}