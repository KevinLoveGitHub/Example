package org.lovedev.dagger2

import android.app.Activity
import dagger.Module
import dagger.Provides

/**
 * @author Kevin
 * @data 2018/8/28
 */
@Module
abstract class SecondModule {
    @Provides
    fun provideActivity(activity: SecondActivity): Activity {
        return activity
    }


    @Module
    companion object {
        @Provides
        @Named("SecondModule")
        @JvmStatic
        fun provideString(): String = "123123"

        @Provides
        @JvmStatic
        internal fun provideSecond(@Named("SecondModule") string: String): Second {
            return Second(string)
        }
    }
}