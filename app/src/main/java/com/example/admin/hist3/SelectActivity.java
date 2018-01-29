package com.example.admin.hist3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SelectActivity extends AppCompatActivity {

    static Fragment fragment;

    boolean start;
    public static Toast toast;
    FragmentManager fm = getFragmentManager();
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);


        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragment = new ButtonFragment();
        fragmentTransaction.add(R.id.first_fragment, fragment,"startfragment");

        fragmentTransaction.commit();


       }

}

