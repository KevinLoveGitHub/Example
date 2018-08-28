package org.lovedev.dagger2

import dagger.Binds
import dagger.Module

/**
 * @author Kevin
 * @data 2018/8/28
 */
@Module
abstract class MainModule {

    @Binds
    abstract fun provideTestBean(test: Test):ITest
}