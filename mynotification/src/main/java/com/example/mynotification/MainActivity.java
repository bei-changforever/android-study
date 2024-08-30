package com.example.mynotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private NotificationManager manager;
    private Notification notification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
         if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
             NotificationChannel channel = new NotificationChannel("leo", "测试通知", NotificationManager.IMPORTANCE_HIGH);
             manager.createNotificationChannel(channel);

         }
        Intent intent = new Intent(this, not.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        notification = new NotificationCompat.Builder(this,"leo")
                .setContentTitle("我是你爸爸")
                .setContentText("你是小垃圾,大垃圾，看着我的就是垃圾")
                .setSmallIcon(R.drawable.ic_baseline_person_24)
                 .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher_girl))
                 .setColor(Color.parseColor("#ff0000"))
                 .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .build();
    }

    public void sendNotification(View view) {
        manager.notify(1,notification);
    }

    public void calcelNotification(View view) {
    }
}