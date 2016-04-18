package com.zzy.daggertoast.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by adm on 2016/4/18.
 */
public class ToastUtil
{
    public Context context;

    public ToastUtil(Context context)
    {
        this.context=context;
    }

    public void showToast(String text)
    {
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
    }
}
