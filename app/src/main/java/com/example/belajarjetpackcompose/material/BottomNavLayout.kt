package com.example.belajarjetpackcompose.material

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyBottomNavLayout() {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Home", "Favorites", "Settings")
    val icons = listOf(Icons.Filled.Home, Icons.Filled.Favorite, Icons.Filled.Settings)

    Scaffold(
        containerColor = Color.White,
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.shadow(elevation = 20.dp),
                containerColor = Color.White
            ) {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = { Icon(icons[index], contentDescription = item) },
                        label = { Text(item, fontSize = 10.sp)},
                        selected = selectedItem == index,
                        onClick = { selectedItem = index },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = Color.Red,
                            unselectedIconColor = Color.Gray,
                            indicatorColor = Color.Transparent,
                            selectedTextColor = Color.Red,
                            unselectedTextColor = Color.Gray
                        )
                    )
                }
            }
        }
    ) { innerPadding ->
            Box(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(), // agar bisa ke center
                contentAlignment = Alignment.Center) {
            when (selectedItem) {
                0 -> Text("Home Screen")
                1 -> Text("Favorites Screen")
                2 -> Text("Settings Screen")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavLayoutPreview() {
    MyBottomNavLayout()
}
