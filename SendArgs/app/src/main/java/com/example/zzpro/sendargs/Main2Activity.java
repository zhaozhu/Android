package com.example.zzpro.sendargs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    /*TextView tv_1;
    TextView tv_2;*/

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*tv_1= (TextView) findViewById(R.id.tv_1);
        tv_2= (TextView) findViewById(R.id.tv_2);
        Intent intent=getIntent();

        User user=(User)intent.getSerializableExtra("user");
        tv_1.setText(user.getName());
        tv_2.setText(""+user.getAge());*/

        editText= (EditText) findViewById(R.id.edittext);

        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("data","hello world");
                setResult(1,intent);
                finish();
            }
        });
    }
}
