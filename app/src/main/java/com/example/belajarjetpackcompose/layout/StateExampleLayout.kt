package com.example.belajarjetpackcompose.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.collectAsState
import com.example.belajarjetpackcompose.viewmodel.CounterViewModel

@Composable
fun MyStateExampleLayout() {
    var count by rememberSaveable { mutableStateOf(0) } // remembersaveable angka tidak hilang saat rotasi

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Tombol telah ditekan sebanyak:",
            fontSize = 18.sp
        )
        Text(
            text = "$count kali",
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { count++ }
        ) {
            Text(text = "Tambah 1")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { count-- }
        ) {
            Text(text = "Kurang 1")
        }
    }
}

@Composable
fun MyStateExampleLayoutWithViewModel(counterViewModel: CounterViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    val count by counterViewModel.count.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Tombol telah ditekan sebanyak:",
            fontSize = 18.sp
        )
        Text(
            text = "$count kali",
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { counterViewModel.increment() }
        ) {
            Text(text = "Tambah 1")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { counterViewModel.decrement() }
        ) {
            Text(text = "Kurang 12")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StateExampleLayoutPreview() {
    MyStateExampleLayout()
}