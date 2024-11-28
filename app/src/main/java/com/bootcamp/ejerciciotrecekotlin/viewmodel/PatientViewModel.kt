package com.bootcamp.ejerciciotrecekotlin.viewmodel

import androidx.lifecycle.ViewModel
import com.bootcamp.ejerciciotrecekotlin.state.Patient

import androidx.compose.runtime.mutableStateListOf


class PatientViewModel : ViewModel() {


    private val _pacientes = mutableStateListOf<Patient>()
    val pacientes: List<Patient> get() = _pacientes

    fun agregarPaciente(nombre: String) {
        val newPatient = Patient(id = _pacientes.size + 1, name = nombre)
        _pacientes.add(newPatient)
    }
}
   // private var patientIdCounter = 1 // Para generar IDs únicos
  //  val pacientes = mutableStateListOf<ListPatient>() // Lista de pacientes

   // fun agregarPaciente(nombre: String) {
     //   val paciente = ListPatient(id = patientIdCounter++, name = nombre)
       // pacientes.add(paciente)

