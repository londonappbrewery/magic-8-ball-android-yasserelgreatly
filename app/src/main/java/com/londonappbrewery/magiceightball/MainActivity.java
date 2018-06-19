package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askTheBall;

        final ImageView theBall;



        askTheBall =  findViewById(R.id.askButton);
        theBall = findViewById(R.id.answer);

       askTheBall.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


               int [] optionsArr;
               int number;

               Random numGenerator;

               numGenerator = new Random();

               number = numGenerator.nextInt(5) ;




               optionsArr = new int[]{
                       R.drawable.ball1,
                       R.drawable.ball2,
                       R.drawable.ball3,
                       R.drawable.ball4,
                       R.drawable.ball5};

               theBall.setImageResource(optionsArr[number]);

               Log.d("Button","Working....");




           }
       });

    }
}
