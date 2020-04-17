package com.app.wesafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HandShake extends AppCompatActivity {
ImageView img_avoid_handshake,img_avoid_handshake_share, image_hand_shake,image_hshake;
    String str_applink="https://play.google.com/store/apps/details?id=com.app.wesafe&hl=en_IN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand_shake);
        img_avoid_handshake=(ImageView)findViewById(R.id.img_avoid_handshake);
        image_hand_shake= (ImageView)findViewById(R.id.image_hand_shake);
        image_hand_shake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_hsnear=new Intent(HandShake.this, NearmeActivity.class);
                startActivity(intent_hsnear);
            }
        });
        image_hshake= (ImageView)findViewById(R.id.image_hshake);
        image_hshake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_hschallenge=new Intent(HandShake.this, ChallengeActivity.class);
                startActivity(intent_hschallenge);
            }
        });
        img_avoid_handshake_share= (ImageView)findViewById(R.id.img_avoid_handshake_share);
        img_avoid_handshake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_hs=new Intent(HandShake.this, CoronaLive.class);
                startActivity(intent_hs);
            }
        });
        img_avoid_handshake_share.setOnClickListener(new View.OnClickListener() {
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
