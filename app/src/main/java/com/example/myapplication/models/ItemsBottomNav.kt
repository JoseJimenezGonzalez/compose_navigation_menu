package com.example.myapplication.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChangeCircle
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MiscellaneousServices
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.myapplication.navigation.NavScreen

sealed class ItemsBottomNav(
    val icono: ImageVector,
    val titulo: String,
    val ruta: String
) {
    object ItemBottomHome: ItemsBottomNav(
        Icons.Outlined.Home,
        "Home",
        NavScreen.HomeScreen.name
    )
    object ItemBottomServicios: ItemsBottomNav(
        Icons.Outlined.MiscellaneousServices,
        "Servicios",
        NavScreen.PagarServicios.name
    )
    object ItemBottomTarjetas: ItemsBottomNav(
        Icons.Outlined.CreditCard,
        "Tarjetas",
        NavScreen.PagarTarjetas.name
    )
    object ItemBottomTransferencias: ItemsBottomNav(
        Icons.Outlined.ChangeCircle,
        "Cambios",
        NavScreen.Transferencias.name
    )
}