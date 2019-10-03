package com.davidargote.apppruebarepo.controller;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.davidargote.apppruebarepo.R;
import com.frosquivel.magicalcamera.MagicalCamera;
import com.frosquivel.magicalcamera.MagicalPermissions;

public class TakePhotoCristhianActivity extends AppCompatActivity {

    private ImageView ivPhoto;
    private Button btnTake;

    MagicalPermissions permissions;
    MagicalCamera magicalCamera;

    public static String[] PERMISSIONS = {Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE,
                                        Manifest.permission.WRITE_EXTERNAL_STORAGE};

    public static int RESIZE_PHOTO = 80;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_photo_cristhian);
        references();

        permissions = new MagicalPermissions(this,PERMISSIONS);

        magicalCamera = new MagicalCamera(this,RESIZE_PHOTO,permissions);

    }

    private void references() {
        ivPhoto = findViewById(R.id.ivPhotoCristhian);
        btnTake = findViewById(R.id.btnTakePhoto);
        btnTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                magicalCamera.takePhoto();

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        magicalCamera.resultPhoto(requestCode,resultCode,data,MagicalCamera.ORIENTATION_ROTATE_90);

        ivPhoto.setImageBitmap(magicalCamera.getPhoto());

    }
}
