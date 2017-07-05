package com.example.lipeijing.testforlaop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.igexin.sdk.PushManager;
import com.example.lipeijing.testforlaop.DemoPushService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PushManager.getInstance().initialize(this.getApplicationContext(), com.example.lipeijing.testforlaop.DemoPushService.class);
        PushManager.getInstance().registerPushIntentService(this.getApplicationContext(), com.example.lipeijing.testforlaop.DemoIntentService.class);
    }
}
