package org.lovedev.dagger2

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap


/**
 * @author Kevin
 * @data 2018/8/28
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity(): MainActivity

    @Binds
    @IntoMap
    @ActivityKey(SecondActivity::class)
    abstract fun secondActivity(builder: SecondComponent.Builder): AndroidInjector.Factory<out Activity>
}