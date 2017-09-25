package com.example.zzpro.transdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.tv_2);
        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                //传递简单数据
                //i.putExtra("data","hello world");
                //传递bundle数据包
//                Bundle b=new Bundle();
//                b.putString("data","hello world");
//                i.putExtra("bundle",b);
                //传递自定义对象
                startActivityForResult(i,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        textView.setText(data.getStringExtra("data"));
    }
}
