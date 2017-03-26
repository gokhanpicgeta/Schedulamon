package com.schedulamon.vishnu.schedulamon;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AssesmentActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtProgress;
    private ProgressBar progressBar;
    private int pStatus = 0;
    private Handler handler = new Handler();
    int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assesment);

        txtProgress = (TextView) findViewById(R.id.txtProgress);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        ActivitySwipeDetector activitySwipeDetector = new ActivitySwipeDetector(this);
       RelativeLayout lowestLayout = (RelativeLayout) this.findViewById(R.id.rel);
        lowestLayout.setOnTouchListener(activitySwipeDetector);

    if(flag == 1){
        Intent intent = new Intent(this,assesment_detailed.class);
        startActivity(intent);
    }

    }

    @Override
    public void onClick(View v) {

    }

    public void progressShit(int counter){
        LayoutInflater Inflater = (LayoutInflater) AssesmentActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = Inflater.inflate(R.layout.activity_assesment,null);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        Log.d("hew", "DSDS");
        progressBar.setProgress(counter*25);
       // txtProgress.setText(counter*25 + "%");
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
