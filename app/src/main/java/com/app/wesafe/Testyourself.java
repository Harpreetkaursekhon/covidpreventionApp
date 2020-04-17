package com.app.wesafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class Testyourself extends AppCompatActivity {
//WebView web_test;
    TextView text_testur_4;
    ImageView image_test_yourself, image_test_nearme,img_testmenu,img_selftst_share;

    String str_applink="https://play.google.com/store/apps/details?id=com.app.wesafe&hl=en_IN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testyourself);
        text_testur_4=(TextView)findViewById(R.id.text_testur_4);
        text_testur_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_test=new Intent(Testyourself.this, MytestActivity.class);
                startActivity(intent_test);
            }
        });
        image_test_yourself=(ImageView)findViewById(R.id.image_test_yourself);
        image_test_nearme=(ImageView)findViewById(R.id.image_test_nearme);
        image_test_nearme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_nearme=new Intent(Testyourself.this, NearmeActivity.class);
                startActivity(intent_nearme);
            }
        });
        img_testmenu=(ImageView)findViewById(R.id.img_testmenu);
        img_testmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_tmenu=new Intent(Testyourself.this, ChallengeActivity.class);
                startActivity(intent_tmenu);
            }
        });
        img_selftst_share=(ImageView)findViewById(R.id.img_selftst_share);
        image_test_yourself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_tu=new Intent(Testyourself.this, CoronaLive.class);
                startActivity(intent_tu);
            }
        });
        img_selftst_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,str_applink);
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });
    }
}
