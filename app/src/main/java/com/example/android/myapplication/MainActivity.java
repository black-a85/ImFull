package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View view){
        TextView textView = findViewById(R.id.status);
        ImageView imageView = findViewById(R.id.cookie_image);
        textView.setText("I'm so full");
        imageView.setImageResource(R.drawable.after_cookie);
    }
}
