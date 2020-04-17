package com.app.wesafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChallengeActivity extends AppCompatActivity {
Button btn_challege1, btn_challege2, btn_challege3, btn_challege4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);
        btn_challege1=(Button)findViewById(R.id.btn_challege1);
        btn_challege2=(Button)findViewById(R.id.btn_challege2);
        btn_challege3=(Button)findViewById(R.id.btn_challege3);
        btn_challege4=(Button)findViewById(R.id.btn_challege4);
        btn_challege1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_challenge1=new Intent(ChallengeActivity.this, Challenge1Activity.class);
                startActivity(intent_challenge1);
            }
        });
        btn_challege2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_challenge2=new Intent(ChallengeActivity.this, Challege2Activity.class);
                startActivity(intent_challenge2);
            }
        });
        btn_challege3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_challenge3=new Intent(ChallengeActivity.this, Challege3Activity.class);
                startActivity(intent_challenge3);
            }
        });
        btn_challege4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_challenge4=new Intent(ChallengeActivity.this, Challenge4Activity.class);
                startActivity(intent_challenge4);
            }
        });

    }
}
