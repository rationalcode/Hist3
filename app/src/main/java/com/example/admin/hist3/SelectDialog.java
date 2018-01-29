package com.example.admin.hist3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import static com.example.admin.hist3.SelectActivity.toast;

/**
 * Created by Admin on 28.01.2018.
 */

public class SelectDialog extends DialogFragment {

    Context context;
    Toast toast;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        SelectActivity activity = (SelectActivity) getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(activity, R.array.data,android.R.layout.simple_list_item_1);

        DialogInterface.OnClickListener myClickListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {


                TextFragment.currentItem =which;


                dialog.dismiss();
                onClickItem(which);
            }
        };

        builder.setView(R.layout.dialog_layout);
        builder.setTitle("Test");
                //builder.setItems(R.array.data, myClickListener);

        builder.setAdapter(arrayAdapter,myClickListener);
        builder.setNegativeButton("CANCEL", myClickListener);

        //builder.show();

        return builder.create();
    }

    public void onClickItem (int which){

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        TextFragment textFragment = new TextFragment();


        //ft.hide( fm.findFragmentByTag("firstfragment"));
        ft.replace(R.id.first_fragment, textFragment,"textfragment");
        //ft.show(new TextFragment());
        ft.commit();


    }

}
