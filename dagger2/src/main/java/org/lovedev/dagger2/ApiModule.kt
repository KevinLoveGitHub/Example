package org.lovedev.dagger2

import dagger.Module
import dagger.Provides

/**
 * @author Kevin
 * @data 2018/8/28
 */
@Module
abstract class ApiModule {

    // 用 @Provides 注解的函数，必须是静态方法
    @Module
    companion object {
        @Provides
        @JvmStatic
        internal fun provideAppClassName(app: App): String {
            return "直接就能拿到 ${app.applicationInfo.className}"
        }
    }
}