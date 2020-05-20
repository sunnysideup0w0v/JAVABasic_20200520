package com.example.javabasic_20200520;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText contentEdt;   // 참조형 변수, 클래스의 멤버변수, 기본값. null
    Button okBtn;
    TextView contentTxt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentEdt = findViewById(R.id.contentEdt);
        okBtn = findViewById(R.id.okBtn);
        contentTxt = findViewById(R.id.contentTxt);

    }
}
