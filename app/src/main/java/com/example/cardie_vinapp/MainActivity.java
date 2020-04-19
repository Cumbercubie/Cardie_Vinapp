package com.example.cardie_vinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView secondTextView;
    Button Learn;
    Button Stats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // xác định xem Activity xài layout nào!
        setContentView(R.layout.activity_main);
        secondTextView = findViewById(R.id.Title);
        Learn = findViewById(R.id.learn_btn);
        Stats = findViewById(R.id.stats_btn);
        setGradientForTitle(secondTextView,"#627cf2","#0bc6ab");
        initOnclick();
    }

    private void setGradientForTitle(TextView tv,String startColor, String endColor)
    {
        Shader textShader= new LinearGradient(0, 0, 200, tv.getPaint().getTextSize(),
                new int[]{Color.parseColor(startColor),Color.parseColor(endColor)},
                new float[]{0, 1}, Shader.TileMode.CLAMP);
        tv.getPaint().setShader(textShader);
    }

    private void initOnclick() {
        Learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoSets = new Intent(MainActivity.this, MyListActivity.class);
                startActivity(gotoSets);
            }
        });

        Stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}
