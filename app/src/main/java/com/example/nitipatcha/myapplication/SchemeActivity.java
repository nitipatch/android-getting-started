package com.example.nitipatcha.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

/**
 * Created by nitipat.cha on 11/11/2016.
 */

public class SchemeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, Fourth.class);
        startActivity(intent);

        finish();
    }
}
