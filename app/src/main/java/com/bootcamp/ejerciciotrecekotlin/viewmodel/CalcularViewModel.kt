package com.bootcamp.ejerciciotrecekotlin.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import com.bootcamp.ejerciciotrecekotlin.state.IMCState


class CalcularViewModel: ViewModel() {

    var state = mutableStateOf(IMCState())
        private set


    fun onGeneroSelected(genero: String) {
        state.value = state.value.copy(genero = genero)
    }

    fun onEdadChanged(edad: String) {
        state.value = state.value.copy(edad = edad)
    }

    fun onPesoChanged(peso: String) {
        state.value = state.value.copy(peso = peso)
    }

    fun onAlturaChanged(altura: String) {
        state.value = state.value.copy(altura = altura)
    }

    fun calcularIMC() {
        val edadNum = state.value.edad.toIntOrNull()
        val pesoNum = state.value.peso.toFloatOrNull()
        val alturaNum = state.value.altura.toFloatOrNull()?.div(100) // Convertimos cm a m



        when {
            edadNum == null || edadNum <= 0 -> {
                state.value = state.value.copy(
                    errorMessage = "Por favor, ingresa una edad válida (mayor que 0)."

                )
            }

            pesoNum == null || pesoNum <= 0 -> {
                state.value = state.value.copy(
                    errorMessage = "Por favor, ingresa un peso válido (mayor que 0)."

                )
            }

            alturaNum == null || alturaNum <= 0 -> {
                state.value = state.value.copy(
                    errorMessage = "Por favor, ingresa una altura válida (mayor que 0)."
                )
            }

            else -> {
                val imc = pesoNum / (alturaNum * alturaNum)
                val resultado = "%.1f".format(imc)
                state.value = state.value.copy(
                    resultadoIMC = resultado,
                    errorMessage = "" // Limpiar el mensaje de error
                )
            }

        }
    }

    fun clearErrorMessage() {
        state.value = state.value.copy(errorMessage = "")
    }

}
