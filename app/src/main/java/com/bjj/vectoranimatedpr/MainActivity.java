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
        View vMenuArrow = findViewById(R.id.view_menu_arrow);
        vMenuArrow.setOnClickListener(new ToggleBackgroundClickListener(R.drawable.animator_menu_to_arrow, R.drawable.animator_arrow_to_menu));
        View vMenuClose = findViewById(R.id.view_menu_close);
        vMenuClose.setOnClickListener(new ToggleBackgroundClickListener(R.drawable.animator_menu_to_close, R.drawable.animator_close_to_menu));
        View vPausePlay = findViewById(R.id.view_pause_play);
        vPausePlay.setOnClickListener(new ToggleBackgroundClickListener(R.drawable.animator_pause_to_play, R.drawable.animator_play_to_pause));
        View vCheck = findViewById(R.id.view_check);
        vCheck.setOnClickListener(new ToggleBackgroundClickListener(R.drawable.animator_check_draw, R.drawable.animator_check_erase));
    }
}