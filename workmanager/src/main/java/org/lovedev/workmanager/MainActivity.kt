package org.lovedev.workmanager

import android.arch.lifecycle.Observer
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import androidx.work.Constraints
import androidx.work.OneTimeWorkRequest
import androidx.work.PeriodicWorkRequest
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_act)
    }


    fun doPeriodicTask(view: View) {
        val checkFillSizeWorker = PeriodicWorkRequest.Builder(CheckFileSizeWorker::class.java, 15, TimeUnit.MINUTES, 14, TimeUnit.MINUTES)
                .addTag("doPeriodicTask")
                .build()

        WorkManager.getInstance().enqueue(checkFillSizeWorker)
        WorkManager.getInstance().getStatusById(checkFillSizeWorker.id)
                .observe(this, Observer {
                    Log.i(TAG, it?.tags.toString() + "  " + it?.state.toString())
                })
    }

    fun getPeriodicTaskDetail(view: View) {
        val statusesByTag = WorkManager.getInstance().getStatusesByTag("doPeriodicTask").value
        Log.i(TAG, statusesByTag.toString())
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun doOneTimeTask(view: View) {
        val constraints = Constraints.Builder()
                .setRequiresDeviceIdle(true)
                .build()

        val oneTime = OneTimeWorkRequest.Builder(CheckFileSizeWorker::class.java)
                .addTag("doOneTimeTask")
                .setConstraints(constraints)
                .build()
        WorkManager.getInstance().enqueue(oneTime)
        WorkManager.getInstance().getStatusById(oneTime.id)
                .observe(this, Observer {
                    Log.i(TAG, it?.tags.toString() + "  " + it?.state.toString())
                })
    }

    companion object {
        private const val TAG = "MainActivity"
    }

}
