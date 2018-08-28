package org.lovedev.dagger2

import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * @author Kevin
 * @data 2018/8/27
 */
@Module(subcomponents = [SecondComponent::class])
abstract class AppModule {

    // application 这个参数是从 AppComponent 的 builder 中获取的
    @Binds
    abstract fun bindContext(application: App): Context

}