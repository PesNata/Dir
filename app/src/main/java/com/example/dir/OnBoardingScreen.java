package com.example.dir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class OnBoardingScreen extends AppCompatActivity {

    Context context;
    LayoutInflater layoutInflater;

    public  void ssss (Context context){
        this.context = context;
    }




    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen);
    }

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

                if (x1 > x2) {
                    Intent intent = new Intent(OnBoardingScreen.this, OnBoardingScreenTwo.class);
                    startActivity(intent);
                }
                break;
            }
        }
        return false;

    }
}