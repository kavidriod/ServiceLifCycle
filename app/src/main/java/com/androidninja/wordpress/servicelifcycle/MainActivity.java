package com.androidninja.wordpress.servicelifcycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startserviceButton,stopserviceButton;

    //https://www.survivingwithandroid.com/2014/01/android-service-tutorial-2.html

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startserviceButton = (Button) findViewById(R.id.startserviceButton);
        stopserviceButton = (Button) findViewById(R.id.stopserviceButton);

        startserviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(getApplicationContext(),MyService.class));
            }
        });

        stopserviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(getApplicationContext(),MyService.class));
            }
        });
    }
}

