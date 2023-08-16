package com.example.multitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity3 extends AppCompatActivity {
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textView3);
         editText = findViewById(R.id.input_number);
    }
    public void mtable(View view){
        Toast.makeText(this,"Kaam ker raha" ,Toast.LENGTH_SHORT).show();
        String s =  editText.getText().toString();
        StringBuffer buffer = new StringBuffer();
        int ans ;
        int m = Integer.parseInt(s);
        for(int i=m;i <=10;i++){
        ans = i*m;
        buffer.append(m+"x"+i+"="+ans+"\n"); //used buffer to store the values for an instance
        }
        textView.setText(buffer);

    }

}