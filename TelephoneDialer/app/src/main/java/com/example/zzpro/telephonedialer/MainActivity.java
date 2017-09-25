package com.example.zzpro.telephonedialer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ED_number;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         /*
        *获得EditText中的电话号码
        */
        ED_number=(EditText)findViewById(R.id.phone_number);

    }


    public void Dialer(View view){
        number=ED_number.getText().toString().trim();
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_CALL);
        /*
        判断电话号码是否为空
         */
        if("".equals(number)){
            Toast.makeText(this,"电话号码不能为空",Toast.LENGTH_SHORT).show();
            return;
        }
        intent.setData(Uri.parse("tel:"+number));
        startActivity(intent);
    }

}
