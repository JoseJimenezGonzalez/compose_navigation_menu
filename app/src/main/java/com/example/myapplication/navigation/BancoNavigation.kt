package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.screens.HomeScreen
import com.example.myapplication.screens.PagarServicios
import com.example.myapplication.screens.PagarTarjetas
import com.example.myapplication.screens.Transferencias

@Composable
fun BancoNavigation(navController: NavHostController){
    NavHost(navController = navController,
        startDestination = NavScreen.HomeScreen.name){
        composable(NavScreen.HomeScreen.name){
            HomeScreen()
        }
        composable(NavScreen.PagarServicios.name){
            PagarServicios()
        }
        composable(NavScreen.PagarTarjetas.name){
            PagarTarjetas()
        }
        composable(NavScreen.Transferencias.name){
            Transferencias()
        }
    }
}