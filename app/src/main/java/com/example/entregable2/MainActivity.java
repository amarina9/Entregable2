package com.example.entregable2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup r = (RadioGroup)findViewById(R.id.radioGroup);
        r.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(RadioGroup r, int a){
    ImageView img = (ImageView) findViewById(R.id.imageView2);
        switch (a){
            case R.id.radioButton1:
                img.setImageResource(R.drawable.scifi1);
                break;
            case R.id.radioButton2:
                img.setImageResource(R.drawable.miedo1);
                break;
            case R.id.radioButton3:
                img.setImageResource(R.drawable.drama1);
                break;
        } }

}
