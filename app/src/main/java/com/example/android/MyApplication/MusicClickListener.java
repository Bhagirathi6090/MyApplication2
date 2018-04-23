
package com.example.android.MyApplication;

import android.view.View;
import android.widget.Toast;
/**
 * Created by Bhagi on 08-04-2018.
 */

public class MusicClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),"Open the list of numbers",Toast.LENGTH_SHORT).show();

    }
}
