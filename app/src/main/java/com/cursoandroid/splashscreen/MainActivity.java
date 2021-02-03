package com.cursoandroid.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getWindow().getInsetsController().hide(WindowInsets.Type.statusBars());

        setContentView(R.layout.activity_main);


        //Agregar animaciones
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_hacia_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_hacia_abajo);


        TextView byTextView = findViewById(R.id.byTextView);
        TextView tomasnecrisTextView = findViewById(R.id.tomasnecrisTextView);
        ImageView logoImageView = findViewById(R.id.logoImageView);

        byTextView.setAnimation(animation2);
        tomasnecrisTextView.setAnimation(animation2);
        logoImageView.setAnimation(animation1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);

    }
}