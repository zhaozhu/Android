package com.example.zzpro.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void onClick(View v){
        Intent intent=new Intent();
        intent.putExtra("data","hello world");
        setResult(RESULT_OK,intent);
        finish();
    }
}
