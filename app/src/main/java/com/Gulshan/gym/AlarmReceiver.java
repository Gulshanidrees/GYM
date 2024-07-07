package com.haris.gym;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("AlarmReceiver", "Alarm received!");
        Toast.makeText(context, "Alarm! Time is up!", Toast.LENGTH_LONG).show();

        // Play a beep sound
        playSound(context);
    }

    private void playSound(Context context) {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                AudioAttributes attributes = new AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_ALARM)
                        .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                        .build();
                mediaPlayer.setAudioAttributes(attributes);
            } else {
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_ALARM);
            }
            mediaPlayer.setDataSource(context, Settings.System.DEFAULT_ALARM_ALERT_URI);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (Exception e) {
            Log.e("AlarmReceiver", "Failed to play sound: " + e.getMessage());
        }
    }
}
