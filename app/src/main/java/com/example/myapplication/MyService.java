package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }



    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("MyService","创建服务执行onCreat()方法");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("Myservice","开启服务，执行onStartCommand()方法");
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("MyService","关闭服务，执行onDextroy()方法");
    }
}