package com.example.broadcast_reciverwe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class powereciver  extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "cable connected", Toast.LENGTH_SHORT).show();
    }
}
