package com.avelycure.runningapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.avelycure.runningapp.R
import com.avelycure.runningapp.data.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDAO: RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}