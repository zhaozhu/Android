package com.example.zzpro.testcustomview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main2Activity extends LinearLayout {

    Button button_1;
    Button button_2;
    public Main2Activity(Context context, AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.activity_main2,this);
        /*
        /一次性实现自定义控件中点击事件的方法,也可以在引用后再具体实现
         */
        button_1=(Button)findViewById(R.id.button1);
        button_2=(Button)findViewById(R.id.button2);

        button_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"退出",Toast.LENGTH_SHORT).show();
            }
        });

        button_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"取消",Toast.LENGTH_SHORT).show();
            }
        });
    }


}
