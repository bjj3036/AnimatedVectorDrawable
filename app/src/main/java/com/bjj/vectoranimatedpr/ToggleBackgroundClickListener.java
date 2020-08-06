package com.bjj.vectoranimatedpr;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.view.View;

import androidx.annotation.DrawableRes;

public class ToggleBackgroundClickListener implements View.OnClickListener {

    private final int firstRes, secondRes;

    private boolean isFirst = true;

    public ToggleBackgroundClickListener(@DrawableRes int firstRes, @DrawableRes int secondRes) {
        this.firstRes = firstRes;
        this.secondRes = secondRes;
    }

    public ToggleBackgroundClickListener(@DrawableRes int res) {
        this.firstRes = this.secondRes = res;
    }

    @Override
    public void onClick(View v) {
        AnimatedVectorDrawable animationDrawable = (AnimatedVectorDrawable) v.getBackground();
        if (!animationDrawable.isRunning()) {
            if (isFirst) {
                v.setBackgroundResource(firstRes);
            } else {
                v.setBackgroundResource(secondRes);
            }
            isFirst = !isFirst;
            AnimatedVectorDrawable ad = (AnimatedVectorDrawable) v.getBackground();
            ad.start();
        }
    }
}
