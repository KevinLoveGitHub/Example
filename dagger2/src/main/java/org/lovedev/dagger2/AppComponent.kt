package org.lovedev.dagger2

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * @author Kevin
 * @data 2018/8/27
 */
@Component(modules = [ApiModule::class, AndroidSupportInjectionModule::class, AppModule::class, ActivityBuilder::class])
interface AppComponent : AndroidInjector<App> {

    fun secondBuilder(): SecondComponent.Builder

    // AndroidInjector.Builder 提供了两个函数 seedInstance 和 build
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}