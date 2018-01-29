package com.example.admin.hist3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.admin.hist3.SelectActivity.fragment;
import static com.example.admin.hist3.SelectActivity.toast;

/**
 * Created by Admin on 27.01.2018.
 */

public class TextFragment extends Fragment implements View.OnClickListener {


    static TextView textView;
    public static int currentItem;
    Toast toast;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.text_layout, container, false);

        TextView textView = view.findViewById(R.id.textView);
        textView.setText("Click DialogMenu Item #: "+Integer.toString(currentItem));


        FloatingActionButton fab = view.findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View view) {


        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        //ft.hide( fm.findFragmentByTag("textfragment"));


        ft.replace(R.id.first_fragment, fragment);
        //ft.show(fm.findFragmentByTag("startfragment"));
        ft.commit();

        //toast.makeText(view.getContext(),"clickFAB",Toast.LENGTH_SHORT).show();
    }
}

