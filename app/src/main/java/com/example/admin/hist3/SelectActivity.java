package com.example.admin.hist3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SelectActivity extends AppCompatActivity {


    boolean start;
    public static Toast toast;
    FragmentManager fm = getFragmentManager();
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

       // getFragmentManager().beginTransaction().add(R.id.first_fragment, new Fragment()).commit();

        //getFragmentManager().beginTransaction().replace(R.id.button_fragment, new ButtonFragment()).commit();



        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.first_fragment, new Fragment());
        ButtonFragment fragment = new ButtonFragment();
        fragmentTransaction.replace(R.id.first_fragment, fragment);
        fragmentTransaction.commit();


       }

    }

