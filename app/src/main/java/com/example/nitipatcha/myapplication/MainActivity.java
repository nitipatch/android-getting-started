package com.example.nitipatcha.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.net.Uri;

public class MainActivity extends FragmentActivity {
    ViewPager pager;
    Uri uri;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uri = getIntent().getData();

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);


        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Second.class);
                startActivity(i);
            }
        });
    }

    public void onBackPressed() {
        // กดปุ่ม Back แล้วจะให้โปรแกรมทำอะไรให้ใส่ในนี้
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Exit");
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setCancelable(true);
        dialog.setMessage(uri.getScheme() + " " + uri.getHost()
                          + "\n" + uri.getQueryParameter("id")
                          + "\nDo you want to exit?");

        dialog.setPositiveButton("Yes", new OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        dialog.setNegativeButton("No", new OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                if(uri.getQueryParameter("id").equalsIgnoreCase("mobile"))
                {
                    Intent j = new Intent(getApplicationContext(), Fourth.class);
                    startActivity(j);
                }
            }
        });

        dialog.show();
    }
}

