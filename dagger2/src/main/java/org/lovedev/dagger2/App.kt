package org.lovedev.dagger2

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * @author Kevin
 * @data 2018/8/27
 */
class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

    override fun onCreate() {
        super.onCreate()
    }


}