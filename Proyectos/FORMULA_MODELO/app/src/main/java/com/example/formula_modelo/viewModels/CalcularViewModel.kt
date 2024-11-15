package com.example.formula_modelo.viewModels


import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlin.math.abs

class CalcularViewModel: ViewModel() {
    private val _valX = mutableStateOf("")
    val valX: State<String> = _valX
    fun onValueX(value: String) {
        _valX.value = value
    }

    private val _valF = mutableStateOf("")
    val valF: State<String> = _valF
    fun onValueF(value: String) {
        _valF.value = value
    }

    private val _showAlert = mutableStateOf(false)
    val showAlert: State<Boolean> = _showAlert

    fun cambiaAlert() {
        _showAlert.value = !_showAlert.value
    }

    fun calcular(valX: Double, valF: Double): String {
        val divisor = valX - 2 * valF
        if (abs(divisor) > 0.0005) {
            val a = (2 * valX + valF) / divisor
            return "a=$a"
        } else {
            return "Combinación Incorrecta"
        }
    }

    fun limpiar() {
        _valF.value = ""
        _valX.value = ""
    }
}