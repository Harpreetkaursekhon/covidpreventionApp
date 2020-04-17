package com.app.wesafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecommendActivity extends AppCompatActivity {
Button button1,button2, button3, button4, button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);
        button1=(Button)findViewById(R.id.btn_social_dist);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(RecommendActivity.this, Maintaindistance.class);
                startActivity(intent1);
            }
        });
        button2=(Button)findViewById(R.id.btn_self_ass);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(RecommendActivity.this, Testyourself.class);
                startActivity(intent2);
            }
        });
        button3=(Button)findViewById(R.id.btn_avoid_sgather);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(RecommendActivity.this, AvoidGathering.class);
                startActivity(intent3);
            }
        });
        button4=(Button)findViewById(R.id.btn_hand_shk);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(RecommendActivity.this, HandShake.class);
                startActivity(intent4);
            }
        });
        button5=(Button)findViewById(R.id.btn_mask);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(RecommendActivity.this, Wearmask.class);
                startActivity(intent5);
            }
        });
    }
}
