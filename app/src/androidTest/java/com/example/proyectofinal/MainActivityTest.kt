package com.example.proyectofinal

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testCompareButton_Clicked_DisplaysCorrectResult() {
        // No establezcas el contenido aquí, ya que el ComposeTestRule se encarga de eso

        // Interactuar con la interfaz de usuario de Compose (simular clic en el botón)
        composeTestRule.onNodeWithText("Comparar").performClick()

        // Verificar el resultado en la interfaz de usuario de Compose
        composeTestRule.onNodeWithText("Las cadenas de caracteres son iguales").assertIsDisplayed()
    }
}
