package com.example.yoasobi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bio extends AppCompatActivity {

    Button btnAlb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        btnAlb = (Button) findViewById(R.id.btnAlb);

        btnAlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tela2= new Intent(Bio.this,Albun.class);
                startActivity(tela2);
            }
        });
    }
}