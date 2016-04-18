package com.zzy.daggertoast;

import android.os.Bundle;

public class MainActivity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(getLayoutId());
        toast.showToast("MainActivity onCreate....");
    }

    @Override
    public int getLayoutId()
    {
        return R.layout.activity_main;
    }

    @Override
    public void afterCreate()
    {

    }

}
