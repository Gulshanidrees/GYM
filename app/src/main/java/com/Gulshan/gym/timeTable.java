package com.haris.gym;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.AlarmManager;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class timeTable extends AppCompatActivity {
    TextView selection ,t1,t,p;
    Button s1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_time_table);
        selection=findViewById(R.id.selection);
        t1=findViewById(R.id.t1);
        s1=findViewById(R.id.s1);
        t=findViewById(R.id.t);
        p=findViewById(R.id.hint);
        requestExactAlarmPermission();

    }
    private void requestExactAlarmPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
            if (alarmManager != null && !alarmManager.canScheduleExactAlarms()) {
                Intent intent = new Intent(Settings.ACTION_REQUEST_SCHEDULE_EXACT_ALARM);
                startActivity(intent);
            }
        }
    }

    @SuppressLint("ScheduleExactAlarm")
    public void setAlarm(String time) {
        try {
            // Parse the selected time to set the alarm
            String[] timeParts = time.split(":|\\s+");
            int hour = Integer.parseInt(timeParts[0]);
            int minute = Integer.parseInt(timeParts[1]);
            String period = timeParts[2];

            if (period.equalsIgnoreCase("PM") && hour != 12) {
                hour += 12;
            } else if (period.equalsIgnoreCase("AM") && hour == 12) {
                hour = 0;
            }else if (period.equalsIgnoreCase("am") && hour == 12) {
                hour = 0;
            }else if (period.equalsIgnoreCase("pm") && hour == 12) {
                hour += 12;
            }

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, hour);
            calendar.set(Calendar.MINUTE, minute);
            calendar.set(Calendar.SECOND, 0);

            AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
            Intent intent = new Intent(this, AlarmReceiver.class);

            PendingIntent pendingIntent = PendingIntent.getBroadcast(
                    this,
                    0,
                    intent,
                    PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE // Required for Android 12 and above
            );

            if (alarmManager != null) {
                alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
                Log.d("AlarmSet", "Alarm set for: " + calendar.getTime());
                Toast.makeText(this, "AlarmSet " + "Alarm set for: " + calendar.getTime(), Toast.LENGTH_LONG).show();
            } else {
                Log.e("AlarmError", "AlarmManager is null");
            }
        } catch (Exception e) {
            Log.e("AlarmError", "Error setting alarm: " + e.getMessage());
        }
    }

//    public void setAlarm(String time) {
//        // Parse the selected time to set the alarm
//        String[] timeParts = time.split(":|\\s+");
//        int hour = Integer.parseInt(timeParts[0]);
//        int minute = Integer.parseInt(timeParts[1]);
//        String period = timeParts[2];
//
//        if (period.equalsIgnoreCase("PM") && hour != 12) {
//            hour += 12;
//        } else if (period.equalsIgnoreCase("AM") && hour == 12) {
//            hour = 0;
//        }
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.HOUR_OF_DAY, hour);
//        calendar.set(Calendar.MINUTE, minute);
//        calendar.set(Calendar.SECOND, 0);
//
//        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//        Intent intent = new Intent(this, AlarmReceiver.class);
//        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
//
//        if (alarmManager != null) {
//            alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
//        }
//    }


    public void set1(View v){
        String text=t1.getText().toString();
        String text2=t.getText().toString();
        String abc=p.getText().toString();
        if(text.contains(":")&&text.length()==5&&text2.length()==2){
text=text + " "+text2;
        selection.setText(text);
        setAlarm(text);
        p.setText("Successfully Set");
        }
        else{
            Toast.makeText(this, "Alert! Formating Issue...", Toast.LENGTH_SHORT).show();
        abc=abc+" \n 'Your Formate Do not Match '";
        p.setText(abc);
        }
    }
}