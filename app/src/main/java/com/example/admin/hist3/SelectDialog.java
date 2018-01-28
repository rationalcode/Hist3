package com.example.admin.hist3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

/**
 * Created by Admin on 28.01.2018.
 */

public class SelectDialog extends DialogFragment {

    Context context;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        SelectActivity activity = (SelectActivity) getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(activity, R.array.data,android.R.layout.simple_list_item_1);






        DialogInterface.OnClickListener myClickListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

            }
        };

        builder.setAdapter(arrayAdapter,myClickListener);




        return builder.create();
    }


}
