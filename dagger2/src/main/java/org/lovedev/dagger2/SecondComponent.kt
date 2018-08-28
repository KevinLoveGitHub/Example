package org.lovedev.dagger2

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * @author Kevin
 * @data 2018/8/28
 */
@Subcomponent(modules = [SecondModule::class])
interface SecondComponent : AndroidInjector<SecondActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<SecondActivity>()
}