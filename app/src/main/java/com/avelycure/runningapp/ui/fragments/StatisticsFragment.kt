package com.avelycure.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.avelycure.runningapp.R
import com.avelycure.runningapp.ui.viewmodels.MainViewModel
import com.avelycure.runningapp.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment:Fragment(R.layout.fragment_statistics) {
    private val viewModel: StatisticsViewModel by viewModels()

}