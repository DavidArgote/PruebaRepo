package com.davidargote.apppruebarepo.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.davidargote.apppruebarepo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnDavid;

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

        btnSantiago = findViewById(R.id.btnSantiago);
        btnSantiago.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnDavid:
                Toast.makeText(this, "Boton David", Toast.LENGTH_SHORT).show();
                break;

        }


    }
}
