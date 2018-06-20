package com.example.admin.myapplication;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class usercheck extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usercheck);

        Button btn_enteruser = (Button)findViewById(R.id.enteruser);

        btn_enteruser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //메인엑티비티로 전환하는거
                Intent intent = new Intent(usercheck.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });


    }




}
