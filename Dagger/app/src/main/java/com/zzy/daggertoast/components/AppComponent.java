package com.zzy.daggertoast.components;

import com.zzy.daggertoast.BaseActivity;
import com.zzy.daggertoast.modules.AppModule;

import dagger.Component;

/**
 * Created by adm on 2016/4/18.
 */
@Component(modules = {AppModule.class})
public interface AppComponent
{
    void inject(BaseActivity activity);
}
