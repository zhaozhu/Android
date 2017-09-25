package com.example.zzpro.log;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {


    EditText user_name;
    EditText user_psw;
    CheckBox cb_checkbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_name=(EditText)findViewById(R.id.username);
        user_psw=(EditText)findViewById(R.id.userpsw);
        cb_checkbox=(CheckBox)findViewById(R.id.cb_box);

        Toast.makeText(this,"如果你是第一次登陆，请保存密码",Toast.LENGTH_LONG).show();

        String[] userInfo=readInfo(MainActivity.this);
        if(userInfo!=null){
            String name=userInfo[0];
            String psw=userInfo[1];
            user_name.setText(name);
            user_psw.setText(psw);
        }

    }



    public boolean SaveInfo(Context context,String name, String password){
        try {
            /*
            *获得输入输出流
            *这种方法不需要context
            *FileOutputStream fileOutputStream=new FileOutputStream("data/data/com.example.zzpro.log/info.txt");
             */
            /*String path=context.getFilesDir().getPath();
            *File file=new File(path,"Info");
            *FileIOututStream fileOutputStream=new FileOutputStream(path);
            * */

            FileOutputStream fileOutputStream=context.openFileOutput("Info.txt",0);
            String Info=name+"###"+password;
            fileOutputStream.write(Info.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        }
        catch (Exception e1){
            e1.getStackTrace();
            return false;
        }
    }

    public String[] readInfo(Context context){
        try{

            /*
            *获得输入输出流
            *这种方法不需要context
            *FileInputStream fileInputStream=new FileInputStream("data/data/com.example.zzpro.log/info.txt");
             */
            /*String path=context.getFilesDir().getPath();
            *File file=new File(path,"Info");
            *FileInputStream fileInputStream=new FileInputStream(path);
            * */
            FileInputStream fileInputStream=context.openFileInput("Info.txt");
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(fileInputStream));
            String Info=bufferedReader.readLine();
            String[] userInfo=Info.split("###");
            return userInfo;
        }catch (Exception e){
            e.getStackTrace();
            return null;
        }

    }

    public void onClick_1(View view){

        String userName=user_name.getText().toString().trim();
        String userPsw=user_psw.getText().toString().trim();
        if(TextUtils.isEmpty(userName)||TextUtils.isEmpty(userPsw)){
            Toast.makeText(this,"请输入用户名密码",Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            if(cb_checkbox.isChecked()){
                boolean Result=SaveInfo(MainActivity.this,userName,userPsw);
                if(Result){
                    Toast.makeText(this,"保存成功",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(this,"保存失败",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
