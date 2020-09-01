package com.owen.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Step 1. Include all the life cycle and post a toast message on cycle


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"OnCreate here",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(),"OnStart here",Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(getApplicationContext(),"OnRestart here",Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Toast.makeText(getApplicationContext(),"OnPause here",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(getApplicationContext(), "onStop here", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(),"OnDestroy here",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}