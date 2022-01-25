package com.example.evacont03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Personal_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Personal_data=(Button)findViewById(R.id.ventana2);

        Personal_data.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i =new Intent( MainActivity.this, Body.class);
                startActivity(i);
            }
        });
    }
}