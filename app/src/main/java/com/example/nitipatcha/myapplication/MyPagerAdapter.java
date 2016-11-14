package com.example.nitipatcha.myapplication;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;

import com.example.nitipatcha.myapplication.fragment.OneFragment;
import com.example.nitipatcha.myapplication.fragment.ThreeFragment;
import com.example.nitipatcha.myapplication.fragment.TwoFragment;

/**
 * Created by nitipat.cha on 11/14/2016.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public int getCount() {
        return 3;
    }

    public Fragment getItem(int position) {
        if(position == 0)
            return new OneFragment();
        else if(position == 1)
            return new TwoFragment();
        else if(position == 2)
            return new ThreeFragment();
        return null;    }
}
