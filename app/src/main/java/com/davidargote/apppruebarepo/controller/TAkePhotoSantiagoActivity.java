package com.davidargote.apppruebarepo.controller;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.davidargote.apppruebarepo.R;
import com.frosquivel.magicalcamera.MagicalCamera;
import com.frosquivel.magicalcamera.MagicalPermissions;

public class TAkePhotoSantiagoActivity extends AppCompatActivity {

    private Button btnTake;
    private ImageView ivPhoto;

    public static String[] MY_PERMISSON = {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE};

    private MagicalCamera magicalCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teke_photo_david);

        initViews();

        MagicalPermissions permissions = new MagicalPermissions(this, MY_PERMISSON);
        magicalCamera = new MagicalCamera(this, 80, permissions);

    }

    private void initViews() {
        btnTake = findViewById(R.id.btnTakePhoto1);
        ivPhoto = findViewById(R.id.ivPhoto1);

        btnTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magicalCamera.takePhoto();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        magicalCamera.resultPhoto(requestCode, resultCode, data, MagicalCamera.ORIENTATION_ROTATE_90);
        ivPhoto.setImageBitmap(magicalCamera.getPhoto());

    }
}
