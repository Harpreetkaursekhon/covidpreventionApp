package com.app.wesafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AvoidGathering extends AppCompatActivity {
    ImageView image_together,img_avoidge_share, image_agnearme,img_avoidgather;
    String str_applink="https://play.google.com/store/apps/details?id=com.app.wesafe&hl=en_IN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avoid_gathering);
        image_together=(ImageView) findViewById(R.id.image_together);
        img_avoidgather=(ImageView)findViewById(R.id.img_avoidgather);
        img_avoidgather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_gather=new Intent(AvoidGathering.this, ChallengeActivity.class);
                startActivity(intent_gather);
            }
        });
        image_agnearme=(ImageView)findViewById(R.id.image_agnearme);
        image_agnearme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_gather=new Intent(AvoidGathering.this, NearmeActivity.class);
                startActivity(intent_gather);
            }
        });
        img_avoidge_share=(ImageView)findViewById(R.id.img_avoidge_share);
        image_together.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_gather=new Intent(AvoidGathering.this, CoronaLive.class);
                startActivity(intent_gather);
            }
        });
        img_avoidge_share.setOnClickListener(new View.OnClickListener() {
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
