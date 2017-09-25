package com.example.zzpro.testcustomview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*public void back(View v){
        Toast.makeText(this,"退出",Toast.LENGTH_SHORT).show();
    }

    public void cancel(View v){
        Toast.makeText(this,"取消",Toast.LENGTH_SHORT).show();
    }*/
}
