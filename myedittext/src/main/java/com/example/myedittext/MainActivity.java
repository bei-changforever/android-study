package com.example.myedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
         et = findViewById(R.id.et);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String text = et.getText().toString();
                  Log.e("leo", "输入的内容"+text);
             }
         });
    }
}