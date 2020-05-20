package com.example.javabasic_20200520;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.javabasic_20200520.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

//    EditText contentEdt;   // 참조형 변수, 클래스의 멤버변수, 기본값. null
//    Button okBtn;
//    TextView contentTxt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputMessage = binding.contentEdt.getText().toString();
                Log.d("적은내용",inputMessage);
                binding.contentTxt.setText(inputMessage);
                Toast.makeText(MainActivity.this, "문구를 반영했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
