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
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

/**
 * Created by Admin on 27.01.2018.
 */

public class TextFragment extends Fragment  {


    static TextView textView;
    public static int currentItem;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.text_layout, container, false);

        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("Click DialogMenu Item #: "+Integer.toString(currentItem));


        return view;

    }

}

