package com.nivetha.cs478.picturegallery;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/**
 * Created by nivetha on 10/29/17.
 */

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent i) {
        // TODO Auto-generated method stub

        // Intent to start the PictureGallery App
       Intent intent = new Intent(context, MainActivity.class);
        intent.setComponent(new ComponentName("com.nivetha.cs478.picturegallery", "com.nivetha.cs478.picturegallery.MainActivity"));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        context.startActivity(intent);

    }

}
