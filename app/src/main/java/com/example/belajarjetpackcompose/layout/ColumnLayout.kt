package com.example.belajarjetpackcompose.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyColumnLayout() {
    Column {
        Text(text = "Ini adalah item pertama di Column.")
        Text(text = "Ini adalah item kedua di Column.")
        Text(text = "Ini adalah item ketiga di Column.")
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnLayoutPreview() {
    MyColumnLayout()
}