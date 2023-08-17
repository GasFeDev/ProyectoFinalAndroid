package com.example.proyectofinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectofinal.ui.theme.ProyectoFinalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoFinalTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    CompareScreen()
                }
            }
        }
    }
}

@Composable
fun CompareScreen() {
    var inputText1 by remember { mutableStateOf("") }
    var inputText2 by remember { mutableStateOf("") }
    var resultText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        OutlinedTextField(
            value = inputText1,
            onValueChange = { inputText1 = it },
            label = { Text("Texto 1") }
        )

        OutlinedTextField(
            value = inputText2,
            onValueChange = { inputText2 = it },
            label = { Text("Texto 2") }
        )

        Button(
            onClick = {
                resultText = if (inputText1 == inputText2) {
                    "Las cadenas de caracteres son iguales"
                } else {
                    "Las cadenas de caracteres son diferentes"
                }
            }
        ) {
            Text("Comparar")
        }

        Text(resultText)
    }
}

@Preview(showBackground = true)
@Composable
fun CompareScreenPreview() {
    ProyectoFinalTheme {
        CompareScreen()
    }
}
