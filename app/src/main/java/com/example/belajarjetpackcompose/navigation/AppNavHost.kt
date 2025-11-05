package com.example.belajarjetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.belajarjetpackcompose.material.AppRoutes
import com.example.belajarjetpackcompose.material.materialGraph
import com.example.belajarjetpackcompose.formlogin.formLoginGraph
import com.example.belajarjetpackcompose.layout.stateExampleGraph

@Composable
fun AppNavHost(startDestination: String = AppRoutes.HOME) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        materialGraph(navController)
        formLoginGraph()
        stateExampleGraph()
    }
}

