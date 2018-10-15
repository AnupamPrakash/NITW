package com.example.anupamprakash.nitw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity {
    private ImageView imageView;
    private TextView institutename,intittuteloc;
    private CardView cardimage,namecard,loccard;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        cardimage= (CardView) findViewById(R.id.imageCard);
        namecard = (CardView) findViewById(R.id.nameCard);
        loccard = (CardView) findViewById(R.id.locCard);
        Animation myanim=AnimationUtils.loadAnimation(this,R.anim.mytransition);
        cardimage.startAnimation(myanim);

        myanim=AnimationUtils.loadAnimation(this,R.anim.mytranslate);
        loccard.startAnimation(myanim);
        namecard.startAnimation(myanim);
        final Intent intent=new Intent(this, MainActivity.class);

        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch(InterruptedException e){
                    // do nothing
                }finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }

}