package com.example.zzpro.transdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText= (EditText) findViewById(R.id.editText);

        findViewById(R.id.btn_SendBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("data",editText.getText().toString());
                setResult(1,intent);
                finish();
            }
        });
        //接受普通数据
        //tv_1.setText(getIntent().getStringExtra("data"));
        //接受bundle数据包
        //tv_1.setText(getIntent().getBundleExtra("bundle") .getString("data"));
        //接受自定义对象
//        Intent i=getIntent();
//        User user= (User) i.getSerializableExtra("user");
//        tv_1.setText(user.getAge()+""+"  "+user.name);
    }
}
