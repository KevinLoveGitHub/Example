package org.lovedev.dagger2

import android.util.Log
import javax.inject.Inject

/**
 * @author Kevin
 * @data 2018/8/28
 */
class Test @Inject constructor(var className: String) : ITest{
    override fun print() {
        Log.i("Test", className)
    }
}
