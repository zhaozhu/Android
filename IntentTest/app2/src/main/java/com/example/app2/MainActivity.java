package com.example.app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("ZZ");
                try {
                    startActivity(intent);
                }catch (Exception e1){
                    Toast.makeText(MainActivity.this,"启动main2Activity失败",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
