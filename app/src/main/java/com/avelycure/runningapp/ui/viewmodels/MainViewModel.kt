package com.avelycure.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.avelycure.runningapp.data.Run
import com.avelycure.runningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {
    fun insertRun(run: Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}