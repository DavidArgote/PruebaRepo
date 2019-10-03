package com.davidargote.apppruebarepo.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.davidargote.apppruebarepo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnDavid;
    private Button btnCristhian;
    private Button btnSantiago;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {

        btnDavid = findViewById(R.id.btnDavid);
        btnDavid.setOnClickListener(this);

        btnCristhian = findViewById(R.id.btnCristhian);
        btnCristhian.setOnClickListener(this);

        btnSantiago = findViewById(R.id.btnSantiago);
        btnSantiago.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnDavid:
                startActivity(new Intent(MainActivity.this, TekePhotoDavidActivity.class));
                break;
            case R.id.btnCristhian:
                startActivity(new Intent(this,TakePhotoCristhianActivity.class));
                break;

            case R.id.btnSantiago:
                Toast.makeText(this,"Boton Santiago",Toast.LENGTH_SHORT).show();
                break;

        }


    }
}
