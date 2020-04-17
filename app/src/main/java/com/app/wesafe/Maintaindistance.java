package com.app.wesafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Maintaindistance extends AppCompatActivity {
ImageView image_live,image_disMain_share,image_menumd,img_maindis_near;

String str_applink="https://play.google.com/store/apps/details?id=com.app.wesafe&hl=en_IN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintaindistance);
        image_live=(ImageView)findViewById(R.id.image_live);
        img_maindis_near=(ImageView)findViewById(R.id.img_maindis_near);
        image_disMain_share=(ImageView)findViewById(R.id.image_disMain_share);
        image_menumd=(ImageView)findViewById(R.id.image_menumd);
        image_menumd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_c=new Intent(Maintaindistance.this, ChallengeActivity.class);
                startActivity(intent_c);
            }
        });
        image_live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_dist=new Intent(Maintaindistance.this, CoronaLive.class);
                startActivity(intent_dist);
            }
        });
        image_disMain_share.setOnClickListener(new View.OnClickListener() {
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
        img_maindis_near.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_nearme=new Intent(Maintaindistance.this,NearmeActivity.class);
                startActivity(intent_nearme);
            }
        });
        }
    }

