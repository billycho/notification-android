package com.qwersoft.notificationdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by IT02106 on 27/06/2018.
 */

public class AlarmService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onCreate() {
        //MainActivity.startAlarm(this);

       // NotificationScheduler.setReminder(MainActivity.this,AlarmReceiver.class,20,49);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

}
