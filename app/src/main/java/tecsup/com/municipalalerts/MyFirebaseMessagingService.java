package tecsup.com.municipalalerts;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import tecsup.com.municipalalerts.activities.UserActivity;

/**
 * Created by Steph on 23/05/2017.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService{
     public static final String TAG = "Noticias";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
       super.onMessageReceived(remoteMessage);

        String from = remoteMessage.getFrom();
        Log.d(TAG, "Mensaje de: " + from);
        if(remoteMessage.getNotification() != null){
            Log.d(TAG, "notificacion: " + remoteMessage.getNotification().getBody());
        }
    }
}
