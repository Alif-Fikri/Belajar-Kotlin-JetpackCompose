package com.example.belajarjetpackcompose.layout

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyRowLayout() {
    Row {
        Text(text = "Item 1")
        Text(text = "Item 2")
        Text(text = "Item 3")
    }
}

@Preview(showBackground = true)
@Composable
fun RowLayoutPreview() {
    MyRowLayout()
}