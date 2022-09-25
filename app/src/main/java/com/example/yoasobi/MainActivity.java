package com.example.yoasobi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSee = (Button) findViewById(R.id.btnSee);

        btnSee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent tela = new Intent(MainActivity.this,Bio.class);

               startActivity(tela);
            }
        });
    }
}