package com.example.nitipatcha.myapplication.fragment;

/**
 * Created by nitipat.cha on 11/14/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nitipatcha.myapplication.R;

public class ThreeFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);
        return rootView;
    }
}
