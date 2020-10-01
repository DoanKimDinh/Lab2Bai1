package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private EditText editResult;
    private EditText editNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.btncreate);
        editResult = (EditText)findViewById(R.id.edtResult);
        editNumber = (EditText)findViewById(R.id.edtNumber);
        int min = 12;
        int max = 20;
        Random random = new Random();
 //       int i =
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText("Doan kim dinh");
            }
        });
    }
}
