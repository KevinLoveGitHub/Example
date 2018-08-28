package org.lovedev.dagger2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var appClassName: String

    @Inject
    lateinit var test: Test

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, appClassName)
        test.print()
    }

    fun jump(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
