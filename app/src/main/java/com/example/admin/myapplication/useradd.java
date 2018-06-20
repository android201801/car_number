package com.example.admin.myapplication;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class useradd extends AppCompatActivity {

    String filePath;
    static final int PICK_IMAGE_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useradd);

        Button btn_selectimg  = (Button) findViewById(R.id.selectimg);
        Button btn_adduser = (Button) findViewById(R.id.adduser);
        ImageView img_selectimg = (ImageView) findViewById(R.id.selectview);

        btn_selectimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageBrowse();
            }
        });

        btn_adduser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //통신하는버튼  사진전송버튼
                startActivity(new Intent(useradd.this, usercheck.class));
            }
        });
    }

//    void imageBrowse(){
//        Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//        //Start the Intent
//        startActivityForResult(galleryIntent,PICK_IMAGE_REQUEST);
//    }
}
