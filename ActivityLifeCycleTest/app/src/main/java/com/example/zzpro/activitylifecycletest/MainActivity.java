package com.example.zzpro.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startNormal(View v){
        Intent intent=new Intent(MainActivity.this,Normal_Activity.class);
        startActivity(intent);
    }

    public void startDialog(View v){
        Intent intent=new Intent(MainActivity.this,Dialog_Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","this is onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","this is onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","this is onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","this is onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","this is ondestory");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG","this is onrestart");
    }
}
