package com.peng.mynetworklib;

import android.content.Context;
import android.widget.Toast;

public class CommonUtils {
    public static void showMessage(Context context,String strMsg){
        Toast.makeText(context,strMsg,Toast.LENGTH_SHORT).show();
    }
}
