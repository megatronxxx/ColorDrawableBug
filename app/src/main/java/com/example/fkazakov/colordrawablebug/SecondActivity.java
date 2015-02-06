package com.example.fkazakov.colordrawablebug;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClick(View view) {
        final Drawable background = view.getBackground();
        background.setAlpha(10);
        findViewById(R.id.activity).invalidate();
    }
}
