package com.qwersoft.notificationdemo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;

import java.time.LocalDate;

/**
 * Created by IT02106 on 27/06/2018.
 */

public class AlarmReceiver extends BroadcastReceiver {

    String TAG = "AlarmReceiver";

    @Override
    public void onReceive(Context context, Intent intent)
    {
        if(intent.getAction() != null && context != null)
        {
            if(intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED))
            {
                NotificationScheduler.setReminder(context, AlarmReceiver.class, 21,45);

                return;
            }

        }
        NotificationScheduler.showNotification(context, MainActivity.class,"You have 5 unwatched videos","Watch them now?");
    }


}
