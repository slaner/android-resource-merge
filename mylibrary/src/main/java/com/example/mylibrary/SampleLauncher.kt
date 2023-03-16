package com.example.mylibrary

import android.app.Activity
import android.content.Intent
import com.example.external_library.SampleActivity

object SampleLauncher {

    fun launch(activity: Activity) {
        Intent(activity, SampleActivity::class.java).apply {
            activity.startActivity(this)
        }
    }
}