package com.bjj.vectoranimatedpr;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private boolean toArrow = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View v = findViewById(R.id.view);
        v.setOnClickListener(vvv -> {
            AnimatedVectorDrawable animationDrawable = (AnimatedVectorDrawable) vvv.getBackground();
            if (!animationDrawable.isRunning()) {
                if (toArrow) {
                    vvv.setBackgroundResource(R.drawable.animator_menu_to_arrow);
                } else {
                    vvv.setBackgroundResource(R.drawable.animator_arrow_to_menu);
                }
                toArrow = !toArrow;
                AnimatedVectorDrawable ad = (AnimatedVectorDrawable) vvv.getBackground();
                ad.start();
            }
        });
    }
}