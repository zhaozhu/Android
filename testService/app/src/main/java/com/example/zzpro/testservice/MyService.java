package com.example.zzpro.testservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static String data="default";
    private boolean serviceRunning=false;
    private Callback callback=null;

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public Callback getCallback() {
        return callback;
    }

    public MyService() {
    }

    public class myBinder extends Binder{
        public void setData(String s){
            MyService.data=s;
        }

        public MyService getService(){
            return MyService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
       return new myBinder();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        /*Log.d("onstartcommand", "服务开始运行...");
        new Thread(){
            @Override
            public void run() {
                super.run();
                while (true) {
                    Log.d("tag_1", "服务正在运行...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();*/

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        serviceRunning=true;
        super.onCreate();
        new Thread(){
            @Override
            public void run() {
                super.run();
                int i=0;
                while (serviceRunning) {
                    i++;
                    String s=i+":"+data;
                    Log.d("tag_2", s);
                    if(callback!=null){
                        callback.setData(s);
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        serviceRunning=false;
        Log.d("tag", "服务已经停止...");
    }


    public interface Callback{
        void setData(String d);
    }
}
