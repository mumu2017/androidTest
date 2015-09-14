package com.example.mumu2.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by MuMu2 on 2015/9/14.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
