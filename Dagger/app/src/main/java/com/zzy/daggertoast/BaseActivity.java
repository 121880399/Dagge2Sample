package com.zzy.daggertoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zzy.daggertoast.components.DaggerAppComponent;
import com.zzy.daggertoast.modules.AppModule;
import com.zzy.daggertoast.utils.ToastUtil;

import javax.inject.Inject;

/**
 * Created by adm on 2016/4/18.
 */
public abstract class BaseActivity extends AppCompatActivity
{
    @Inject
    public ToastUtil toast;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        DaggerAppComponent.builder().appModule(new AppModule(this)).build().inject(this);
        toast.showToast("BaseActivity onCreate....");
        setContentView(getLayoutId());
        afterCreate();
    }

    public abstract int getLayoutId();
    public abstract void afterCreate();
}
