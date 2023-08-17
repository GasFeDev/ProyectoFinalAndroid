package com.example.proyectofinal

import org.junit.Assert.assertEquals
import org.junit.Test

class MainViewModelTest {

    @Test
    fun testCompareTexts_WhenEqual_ReturnsEqualString() {
        val viewModel = MainViewModel()
        viewModel.inputText1 = "Hello"
        viewModel.inputText2 = "Hello"
        val result = viewModel.compareTexts()
        assertEquals("Las cadenas de caracteres son iguales", result)
    }

    @Test
    fun testCompareTexts_WhenDifferent_ReturnsDifferentString() {
        val viewModel = MainViewModel()
        viewModel.inputText1 = "Hello"
        viewModel.inputText2 = "World"
        val result = viewModel.compareTexts()
        assertEquals("Las cadenas de caracteres son diferentes", result)
    }
}
