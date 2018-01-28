package com.example.admin.hist3;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;
import static com.example.admin.hist3.TextFragment.textView;

/**
 * Created by Admin on 26.01.2018.
 */

public class ButtonFragment extends Fragment {


    public ButtonFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.button_select, container, false);

        View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {




            FragmentTransaction ft = getActivity().getFragmentManager().beginTransaction();
            ft.replace(R.id.button_fragment, new SelectDialog());
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();



//            FragmentTransaction ft = getActivity().getFragmentManager().beginTransaction();
//            ft.replace(R.id.first_fragment, new TextFragment());
//            ft.addToBackStack(null);
//            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//            ft.commit();



            String clickButton = Integer.toString(view.getId());
            makeText(getActivity(), clickButton, Toast.LENGTH_SHORT).show();
        }
    };
        View button = view.findViewById(R.id.button);
        View button2 = view.findViewById(R.id.button2);
        View button3 = view.findViewById(R.id.button3);
        button.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);




            return view;

    }
}