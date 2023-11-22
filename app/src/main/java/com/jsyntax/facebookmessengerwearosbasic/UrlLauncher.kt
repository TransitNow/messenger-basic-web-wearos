package com.jsyntax.facebookmessengerwearosbasic

import android.app.Activity
import android.content.Intent
import android.net.Uri

object UrlLauncher {
    fun launch(activity: Activity, url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        activity.startActivity(intent)
        activity.finish()
    }
}
