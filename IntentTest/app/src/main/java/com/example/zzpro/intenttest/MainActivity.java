package com.example.zzpro.intenttest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_1(View v){
        Intent intent=new Intent("ZZ");
        intent.addCategory("aa");
        startActivity(intent);
    }

    public void onClick_2(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.baidu.com"));
        startActivity(intent);
    }

    public void onClick_3(View v){
        Intent intent=new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:10086"));
        startActivity(intent);
    }

    public void onClick_4(View v){
        Intent intent=new Intent("xx");
        String data="hello world";
        intent.putExtra("data",data);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        /*switch (requestCode){
            case 1:
                if(resultCode==RESULT_OK){
                    String returndata=data.getStringExtra("data");
                    Log.d("zz",returndata);
                }
                break;
            default:

        }*/
        if(requestCode==1&&resultCode==RESULT_OK){
            String returndata=data.getStringExtra("data");
            Log.d("zz",returndata);
        }
    }

    public void onClick_5(View v){
        Intent intent=new Intent(MainActivity.this,Main5Activity.class);
        startActivityForResult(intent,1);
    }
}
