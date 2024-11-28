package com.bootcamp.ejerciciotrecekotlin


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

import com.bootcamp.ejerciciotrecekotlin.ui.theme.EjercicioTreceKotlinTheme
import com.bootcamp.ejerciciotrecekotlin.view.HomeView
import com.bootcamp.ejerciciotrecekotlin.view.PatientsView
import com.bootcamp.ejerciciotrecekotlin.viewmodel.PatientViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioTreceKotlinTheme {


                val patientsViewModel: PatientViewModel = viewModel()
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home" ){
                    composable(route = "home") { PatientsView(navController,viewModel = patientsViewModel)}
                    composable(route = "imc") { HomeView(navController)}
                }
                    }
                }
            }

        }


            //    val navController = rememberNavController()

            // Contenido de navegación
          //  NavHost(navController = navController, startDestination = "patientList") {
            //    composable("patientList") {
                    // Pasa el navController y el ViewModel
              //      PatientsView(navController = navController, viewModel = viewModel())
             //   }
                //composable(
                  //  "calcularIMC/{patientId}", // Recibe el patientId
                   // arguments = listOf(navArgument("patientId") { type = NavType.IntType })
              //  ) { backStackEntry ->
                    // Recupera el patientId
               //     val patientId = backStackEntry.arguments?.getInt("patientId")
                 //   if (patientId != null) {
                        // Pasa el patientId y el ViewModel a HomeView
                   //     HomeView(patientId = patientId, navController = navController,
                     //       patientViewModel = viewModel(), calcularViewModel = viewModel()) }









