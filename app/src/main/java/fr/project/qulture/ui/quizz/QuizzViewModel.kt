package fr.project.qulture.ui.quizz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizzViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Quizz Fragment"
    }
    val text: LiveData<String> = _text
}