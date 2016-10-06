package com.example.administrator.askhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //ปุ่มกดไปหน้าโปรไฟล์
        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.Profile);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent go = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(go);
            }
        });
        //ปุ่มกดไปหน้าฟิตเนต
        imageView = (ImageView) findViewById(R.id.Fitness);
        imageView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View V){
                    Intent go = new Intent(getApplicationContext(),FitnessActivity.class);
                    startActivity(go);}
        });
        //ปุ่มกดไปหน้าวิ่ง
        imageView = (ImageView) findViewById(R.id.Jogging);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent go = new Intent(getApplicationContext(), JoggingActivity.class);
                startActivity(go);
            }
        });
        //ปุ่มกดไปหน้าฟุตบอล
        imageView = (ImageView) findViewById(R.id.Football);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent go = new Intent(getApplicationContext(), FootballActivity.class);
                startActivity(go);
            }
        });
        //ปุ่มกดไปหน้าบาส
        imageView = (ImageView) findViewById(R.id.Basketball);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent go = new Intent(getApplicationContext(), BasketballActivity.class);
                startActivity(go);
            }
        });//ปุ่มกดไปหน้าจักรยาน
        imageView = (ImageView) findViewById(R.id.Bicycla);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent go = new Intent(getApplicationContext(), BicycleActivity.class);
                startActivity(go);
            }
        });
        //ปุ่มกดไปหน้าแบดมินตัน
        imageView = (ImageView) findViewById(R.id.Badminton);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent go = new Intent(getApplicationContext(), BadmintonActivity.class);
                startActivity(go);
            }
        });
        //ปุ่มกดไปหน้าประเภทอื่น
        imageView = (ImageView) findViewById(R.id.More);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent go = new Intent(getApplicationContext(), MoreActivity.class);
                startActivity(go);
            }
        });
        //ปุ่มกดไปหน้าตั่งค่า
        imageView = (ImageView) findViewById(R.id.Setting);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent go = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(go);
            }
        });

    }
}
