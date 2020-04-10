package com.priyanka.digitaldiary.activity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import com.priyanka.digitaldiary.R;

import java.io.IOException;

import androidx.appcompat.app.AppCompatActivity;
import pl.droidsonroids.gif.GifDrawable;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 3000;
    private ImageView iv_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashHandler();
        initUi();
        //rotateImage((ImageView)findViewById(R.id.iv_splash), 0, 3000);
    }

    private void initUi() {
        iv_splash = findViewById(R.id.iv_splash);
        try {
            GifDrawable gifFromResource = new GifDrawable( getResources(), R.drawable.digital_diary_gify);
            iv_splash.setImageDrawable(gifFromResource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void splashHandler() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }

    public static void rotateImage(ImageView ivTimeup, int count, long milliSeconds) throws NullPointerException {
        if (ivTimeup == null) {
            throw new NullPointerException();
        } else {
            ObjectAnimator rotate = ObjectAnimator.ofFloat(ivTimeup, "rotationY", 0.0f, 360f);
            if (count > 0)
                rotate.setRepeatCount(count);
            //rotate.setRepeatMode(ValueAnimator.RESTART);
            rotate.setDuration(milliSeconds);
            rotate.start();
        }
    }


}
