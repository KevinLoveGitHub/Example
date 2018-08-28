package org.lovedev.dagger2

import java.lang.annotation.Documented
import javax.inject.Qualifier

/**
 * @author Kevin
 * @data 2018/8/28
 */
@Qualifier
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class Named(val value: String = "")