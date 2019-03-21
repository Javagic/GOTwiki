package com.javagic.gotwiki.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.javagic.gotwiki.R
import kotlinx.android.synthetic.main.activity_details.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
