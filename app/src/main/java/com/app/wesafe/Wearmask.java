package com.app.wesafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class Wearmask extends AppCompatActivity {
//WebView wv_wearmask;
    ImageView image_live1,img_wearmask_share, image_near_me,img_suggestion;
    TextView text_4;
    String str_applink="https://play.google.com/store/apps/details?id=com.app.wesafe&hl=en_IN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wearmask);
        img_wearmask_share=(ImageView)findViewById(R.id.img_wearmask_share);

        image_live1=(ImageView)findViewById(R.id.image_live1);

        image_live1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_mask=new Intent(Wearmask.this, CoronaLive.class);
                startActivity(intent_mask);
            }
        });
        img_suggestion=(ImageView)findViewById(R.id.img_suggestion);

        img_suggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_su=new Intent(Wearmask.this, ChallengeActivity.class);
                startActivity(intent_su);
            }
        });
        image_near_me=(ImageView)findViewById(R.id.image_near_me);

        image_near_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_masktonearme=new Intent(Wearmask.this, NearmeActivity.class);
                startActivity(intent_masktonearme);
            }
        });

        text_4=(TextView)findViewById(R.id.text_4);
        text_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_learn1=new Intent(Wearmask.this, MakemaskActivity.class);
                startActivity(intent_learn1);
            }
        });
        img_wearmask_share.setOnClickListener(new View.OnClickListener() {
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
