package com.example.belajarjetpackcompose.material

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTabLayout() {
    var tabIndex by remember { mutableStateOf(0) }
    val tabs = listOf("Home", "About", "Settings")

    Column {
        TopAppBar(title = { Text("Test TabLayout") })

        // padding untuk semua sisi (all)
        // Column(modifier = Modifier.padding(all = 16.dp)) {

        // padding simetris (horizontal dan vertikal)
        // Column(modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)) {

        // pdding untuk sisi individual (top, start, end, bottom)
        // Catatan: Menggunakan 'start' & 'end' lebih disarankan daripada 'left' & 'right'
        // untuk mendukung layout kanan-ke-kiri (RTL).
        Column(modifier = Modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
            // Contoh lain:
            // Column(modifier = Modifier.padding(top = 20.dp, left = 20.dp)) {

            TabRow(
                selectedTabIndex = tabIndex,
                indicator = { tabPositions ->
                    TabRowDefaults.Indicator(
                        Modifier.tabIndicatorOffset(tabPositions[tabIndex]),
                        color = Color.Black
                    )
                }
            ) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = tabIndex == index,
                        onClick = { tabIndex = index },
                        text = { Text(text = title) },
                        selectedContentColor = Color.Red,
                        unselectedContentColor = Color.Gray
                    )
                }
            }
            when (tabIndex) {
                // padding juga bisa diterapkan ke komponen individual
                0 -> Text("Home Screen", modifier = Modifier.padding(top = 16.dp))
                1 -> Text("About Screen", modifier = Modifier.padding(top = 16.dp))
                2 -> Text("Settings Screen", modifier = Modifier.padding(top = 16.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TabLayoutPreview() {
    MyTabLayout()
}
