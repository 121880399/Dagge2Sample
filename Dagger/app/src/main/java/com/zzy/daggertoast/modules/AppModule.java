package com.zzy.daggertoast.modules;

import android.content.Context;

import com.zzy.daggertoast.utils.ToastUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by adm on 2016/4/18.
 */
@Module
public class AppModule
{
    public Context context;

    public AppModule(Context context)
    {
        this.context=context;
    }

    @Provides
    ToastUtil provideToastUtil()
    {
        return new ToastUtil(context);
    }
}
