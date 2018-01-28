package com.example.admin.hist3;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

public class TextFragment extends Fragment {


    static TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.text_layout, container, false);

//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//
//                String clickButton = Integer.toString(view.getId());
//                makeText(getActivity(), clickButton, Toast.LENGTH_SHORT).show();
//            }
//        };


//        textView = view.findViewById (R.id.textView);
//        textView.setBackgroundColor(0xffff8800);




        return view;

    }
}

