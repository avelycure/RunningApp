package com.avelycure.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.avelycure.runningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel
@Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {
}