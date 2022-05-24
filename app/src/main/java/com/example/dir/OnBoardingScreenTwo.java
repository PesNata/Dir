package com.example.dir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class OnBoardingScreenTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen_two);
    }


    float x1, x2, y1, y2;

    public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;
            }
            case MotionEvent.ACTION_UP: {
                x2 = touchevent.getX();
                y2 = touchevent.getY();

                }
                if (x1 < x2) {
                    Intent intent = new Intent(OnBoardingScreenTwo.this, OnBoardingScreen.class);
                    startActivity(intent);
                }
                break;
            }
        return false;

    }

    public void onClickSign (View view){
        Intent intent = new Intent(OnBoardingScreenTwo.this, SignlnScreen.class);
        startActivity(intent);
    }

    public void onClickUp (View view){
        Intent intent = new Intent(OnBoardingScreenTwo.this, SignUpScreen.class);
        startActivity(intent);
    }
}