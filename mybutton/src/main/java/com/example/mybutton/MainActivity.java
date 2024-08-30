package com.example.mybutton;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

import static androidx.constraintlayout.motion.widget.MotionScene.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {
     private static final String TAG = "leo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_click = findViewById(R.id.btn_click);

        //点击事件
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Log.e(TAG,"OnClick:");
            }
        });
        //长按事件
        btn_click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Log.e(TAG,"OnLongClick:");
                return false;
            }
        });
        //触摸事件
        btn_click.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.e(TAG,"OnTouch:");
                return false;
            }
        });
    }
}