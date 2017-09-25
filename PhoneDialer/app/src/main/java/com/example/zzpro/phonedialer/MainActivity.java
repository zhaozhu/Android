package com.example.zzpro.phonedialer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText phone_number;
    String number;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone_number=(EditText)findViewById(R.id.phonenumber);
    }


    public void onClick(View view){
        number=phone_number.getText().toString().trim();
        if("".equals(number)){
            Toast.makeText(this,"请输入电话号码",Toast.LENGTH_SHORT);
            return;
        }
        else{
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+number));
            startActivity(intent);
        }
    }
}
