package com.example.zzpro.activitylaunchmodetest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("A create","zz");

        findViewById(R.id.startSelf).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        findViewById(R.id.startM2Ty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("A start","zz");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("A resume","zz");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("A pause","zz");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("A stop","zz");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("A destory","zz");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("A destory","zz");
    }
}
