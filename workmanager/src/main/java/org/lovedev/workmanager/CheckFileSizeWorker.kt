package org.lovedev.workmanager

import android.util.Log
import androidx.work.Worker

/**
 * @author Kevin
 * @data 2018/8/24
 */
class CheckFileSizeWorker : Worker() {
    override fun doWork(): Result {
        checkFileSize()
        return Result.SUCCESS
    }

    private fun checkFileSize() {
        Log.i(TAG,"checkFileSize")
    }

    companion object {
        private val TAG = "CheckFileSizeWorker"
    }
}