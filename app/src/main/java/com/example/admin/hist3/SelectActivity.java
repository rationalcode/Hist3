package com.example.admin.hist3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class SelectActivity extends AppCompatActivity {

    static Fragment fragment;

    public static Toast toast;
    String LOG_TAG = "fragment_state";
    private FragmentManager fm = getFragmentManager();
    private FragmentTransaction ft;
    private SelectActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);



        if (fragment==null) {
            ft = fm.beginTransaction();
            fragment = new ButtonFragment();
            ft.add(R.id.first_fragment, fragment, "startfragment");

            ft.commit();
            Log.d(LOG_TAG, "fragment create. hashCode() = "+fragment.hashCode());
        }


        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
        Log.d(LOG_TAG, "fragment"+fragment.hashCode());
        }

    }


}

