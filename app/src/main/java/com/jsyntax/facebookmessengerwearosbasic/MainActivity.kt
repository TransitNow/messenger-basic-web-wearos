package com.jsyntax.facebookmessengerwearosbasic

import android.app.Activity
import android.os.Bundle
import com.jsyntax.facebookmessengerwearosbasic.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        UrlLauncher.launch(this, "https://mbasic.facebook.com/messages")

    }
}