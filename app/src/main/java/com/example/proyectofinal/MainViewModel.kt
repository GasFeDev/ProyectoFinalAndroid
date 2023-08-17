package com.example.proyectofinal

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var inputText1: String = ""
    var inputText2: String = ""

    fun compareTexts(): String {
        return if (inputText1 == inputText2) {
            "Las cadenas de caracteres son iguales"
        } else {
            "Las cadenas de caracteres son diferentes"
        }
    }
}
