package com.example.admin.hist3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


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

            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft;


            switch (view.getId()){

                case R.id.button:
                    ft = getActivity().getFragmentManager().beginTransaction();
                    SelectDialog dialog = new SelectDialog();
                    dialog.show(fm, "dialog");
                    break;

                case R.id.button2:
                    ft = getActivity().getFragmentManager().beginTransaction();
                    DatabaseQueries dq = new DatabaseQueries();
                    ft.replace(R.id.first_fragment, dq,"query");
                    ft.commit();
                    break;
            }

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

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}