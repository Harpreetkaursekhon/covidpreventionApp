package com.app.wesafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DescriptionActivity extends AppCompatActivity {
Button button_des;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        imageView=(ImageView)findViewById(R.id.img_des);
        String url="https://cdn.theconversation.com/static_files/files/890/Flatten_the_curve1.gif?1583941324";

        Glide.with(this).load(url).into(imageView);

        button_des=(Button)findViewById(R.id.button_des);
        button_des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_rec=new Intent(DescriptionActivity.this, RecommendActivity.class);
                startActivity(int_rec);
            }
        });
    }
}
