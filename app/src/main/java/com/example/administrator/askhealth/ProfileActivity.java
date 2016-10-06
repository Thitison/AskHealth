package com.example.administrator.askhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //กดปุ่มโฮมไปยังหน้าโฮม
        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.homebar);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent go = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(go);
            }
        });
    }
}
