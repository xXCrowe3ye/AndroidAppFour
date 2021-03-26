package com.hbernabe.androidappfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {
    ImageView imgViewPreview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgViewPreview = (ImageView) findViewById(R.id.imgViewPreview);
    }
    public void onClickPreview(View v){
        switch(v.getId()){
            case R.id.imgViewOne:
                imgViewPreview.setBackgroundResource(R.drawable.img_one);
                break;
            case R.id.imgViewTwo:
                imgViewPreview.setBackgroundResource(R.drawable.img_two);
                break;
            case R.id.imgViewThree:
                imgViewPreview.setBackgroundResource(R.drawable.img_three);
                break;
            case R.id.imgViewFour:
                imgViewPreview.setBackgroundResource(R.drawable.img_four);
                break;
            case R.id.imgViewFive:
                imgViewPreview.setBackgroundResource(R.drawable.img_five);
                break;

        }
    }
}