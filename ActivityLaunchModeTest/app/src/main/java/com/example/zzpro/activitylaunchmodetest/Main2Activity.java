package com.example.zzpro.activitylaunchmodetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("B create","zz");

        findViewById(R.id.startSelf).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main2Activity.this,Main2Activity.class);
                startActivity(i);
            }
        });

        findViewById(R.id.startMTy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("B start","zz");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("B resume","zz");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("B pause","zz");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("B stop","zz");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("B destory","zz");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("B restart","zz");
    }
}
