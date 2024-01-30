package com.example.myapplication.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.myapplication.models.ItemsBottomNav
import com.example.myapplication.navigation.rutaActual

@Composable
fun NavegacionInferior(navHostController: NavHostController){
    val itemsMenu = listOf(
        ItemsBottomNav.ItemBottomHome,
        ItemsBottomNav.ItemBottomServicios,
        ItemsBottomNav.ItemBottomTarjetas,
        ItemsBottomNav.ItemBottomTransferencias
    )
    BottomAppBar {
        NavigationBar(
            //containerColor = Color.Blue Por si quieres cambiar el color
        ) {
            itemsMenu.forEach { item ->
                val estaSeleccionado = rutaActual(navHostController) == item.ruta
                NavigationBarItem(selected = estaSeleccionado,
                    onClick = { navHostController.navigate(item.ruta) },
                    icon = {
                        Icon(imageVector = item.icono,
                            contentDescription = item.titulo)
                    },
                    label = { Text(text = item.titulo)}
                )
            }
        }
    }
}