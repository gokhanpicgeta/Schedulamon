package com.schedulamon.vishnu.schedulamon;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent resultIntent = new Intent(this, notifClass.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        startActivity(resultIntent);
        Button ass1 = (Button) findViewById(R.id.assesment1);
        final Intent intent = new Intent(this,AssesmentActivity.class);
        ass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        final Context context = getApplicationContext();
        final notifClass notifclass = new notifClass();

        Button prevWeek = (Button) findViewById(R.id.previousWeekButton);
        prevWeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Log.d("tag", "Inside");

                Intent resultIntent = new Intent(context, notifClass.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                startActivity(resultIntent);
            }
        });


    }
}
