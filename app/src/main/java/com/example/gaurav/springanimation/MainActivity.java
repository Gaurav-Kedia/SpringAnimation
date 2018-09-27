package com.example.gaurav.springanimation;

import android.support.animation.DynamicAnimation;
import android.support.animation.SpringAnimation;
import android.support.animation.SpringForce;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView androidImage = (ImageView) findViewById(R.id.android_image);
        final SpringAnimation springAnimationX = new
                SpringAnimation(androidImage, DynamicAnimation.TRANSLATION_Y,0);

        SpringForce springForceX = new SpringForce(0);
        springForceX.setStiffness(SpringForce.STIFFNESS_VERY_LOW);
        springForceX.setDampingRatio(SpringForce.DAMPING_RATIO_HIGH_BOUNCY);

        springAnimationX.setSpring(springForceX);
        springAnimationX.setStartVelocity(5000);

        androidImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                springAnimationX.setStartVelocity(5000);
                springAnimationX.start();
            }
        });
    }
}
