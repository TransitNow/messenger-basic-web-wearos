package com.jsyntax.facebookmessengerwearosbasic

import android.app.Activity
import android.os.Bundle
import com.jsyntax.facebookmessengerwearosbasic.databinding.ActivityMainBinding

class Friend1Activity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val cid = getString(R.string.friend1_convo_id)
        UrlLauncher.launch(this, "https://mbasic.facebook.com/messages/read/?tid=$cid")
    }
}