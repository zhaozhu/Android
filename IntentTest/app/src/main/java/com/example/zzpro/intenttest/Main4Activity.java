package com.example.zzpro.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent=getIntent();
        String data=intent.getStringExtra("data");
        Log.d("Main2Activity",data);
    }
}
