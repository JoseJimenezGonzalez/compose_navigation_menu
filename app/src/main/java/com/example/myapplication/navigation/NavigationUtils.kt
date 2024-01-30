package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun rutaActual(navController: NavController): String? =
    navController.currentBackStackEntryAsState().value?.destination?.route