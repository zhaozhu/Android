package com.example.zzpro.testservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ServiceConnection {

    Intent intent;

    private TextView textView;

    public MyService.myBinder binder=null;

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent=new Intent(MainActivity.this,MyService.class);

        textView= (TextView) findViewById(R.id.tvOut);
        editText= (EditText)findViewById(R.id.edData);

        findViewById(R.id.btnStartService).setOnClickListener(this);
        findViewById(R.id.btnStopService).setOnClickListener(this);
        findViewById(R.id.btnBindService).setOnClickListener(this);
        findViewById(R.id.btnunBindService).setOnClickListener(this);
        findViewById(R.id.btnSyncdata).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnStartService:
                startService(intent);
                break;
            case R.id.btnStopService:
                stopService(intent);
                break;
            case R.id.btnBindService:
                bindService(intent,this, Context.BIND_AUTO_CREATE);
                break;
            case R.id.btnunBindService:
                unbindService(this);
                break;
            case R.id.btnSyncdata:
                if(binder!=null){
                    binder.setData(editText.getText().toString());
                }
                break;
        }
    }

    @Override
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        binder= (MyService.myBinder) iBinder;
        binder.getService().setCallback(new MyService.Callback() {
            @Override
            public void setData(String d) {
                Message msg=new Message();
                Bundle b=new Bundle();
                b.putString("data",d);
                msg.setData(b);
                handler.sendMessage(msg);
            }
        });
    }

    @Override
    public void onServiceDisconnected(ComponentName componentName) {

    }

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            textView.setText(msg.getData().getString("data"));
        }
    };
}
