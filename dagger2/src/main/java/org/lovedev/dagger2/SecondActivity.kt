package org.lovedev.dagger2

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class SecondActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var appClassName: String

    @Inject
    lateinit var longValue: Second


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i(TAG, appClassName)
        Log.i(TAG, longValue.toString())
    }


    companion object {
        private const val TAG = "SecondActivity"
    }
}
