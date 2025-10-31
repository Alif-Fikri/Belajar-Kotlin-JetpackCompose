package com.example.belajarjetpackcompose.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyBoxLayout() {
    Box(
        modifier = Modifier
            .size(width = 250.dp, height = 150.dp)
            .background(Color.LightGray)
    ) {
        Text(
            text = "Pojok Kiri Atas",
            modifier = Modifier.align(Alignment.TopStart)
        )
        Text(
            text = "Tengah",
            modifier = Modifier.align(Alignment.Center)
        )
        Text(
            text = "Pojok Kanan Bawah", fontSize = 20.sp,
            modifier = Modifier.align(Alignment.BottomEnd),
            color = Color.Red
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BoxLayoutPreview() {
    MyBoxLayout()
}