package com.itheima.phonedail;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	
    private EditText et_number;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //����һ������
        setContentView(R.layout.activity_main);
        //[1]�ҵ����ǹ��ĵĿؼ�  edittext  button 
        
        et_number = (EditText) findViewById(R.id.editText1);
        
        //[2]�ҵ���ť 
        Button btn_call = (Button) findViewById(R.id.button1);
        
        //[3]��button��ť����һ������¼� 
        btn_call.setOnClickListener(new MyClickListener());
        
        
        
    }

    
    //����һ����ȥʵ��  ��ť��Ҫ�Ľӿ����� 
    private class MyClickListener implements OnClickListener{
    	//Called when a view has been clicked. ����ť�������ʱ�����
		@Override
		public void onClick(View v) {
			//[4]��ȡedittext �ı����� 
			String number = et_number.getText().toString().trim();
			if ("".equals(number)) {
				/**
				 * context ������ 
				 */
				Toast.makeText(MainActivity.this, "number����Ϊ��", 1).show();
				return;
			}
			
			//[5]���в���绰   ��ͼ Intent 
			Intent intent = new Intent(); //����һ����ͼ����   ��   è ��  ����  �绰
			//[5.1]���ö��� 
			intent.setAction(Intent.ACTION_CALL);
			//[5.2]����Ҫ��������� 
			/**
			 * uri:ͳһ��Դ��ʾ�� �Լ������·�� �����ʲô�ʹ���˵�� 
			 * url:ͳһ��Դ��λ�� www.baidu.com
			 */
			intent.setData(Uri.parse("tel:"+number));
			
			//[6]������ͼ 
			startActivity(intent);
			
			
		}
    	
    }
    

   
    
}
