package com.example.adhip91sqft.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.adhip91sqft.models.ApiResponse
import com.example.adhip91sqft.networking.domain.UseCase
import com.example.adhip91sqft.utils.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModel @Inject constructor(
    private val useCase: UseCase
) : ViewModel() {

    private val _liveData = MutableLiveData<ApiResponse>()
    fun liveData() = _liveData

    fun getData(){
        viewModelScope.launch {
            useCase.invoke().collect{ response ->
                when(response){
                    is Result.Success -> {
                        _liveData.postValue(response.data)
                    } else -> {

                    }
                }
            }
        }
    }
}