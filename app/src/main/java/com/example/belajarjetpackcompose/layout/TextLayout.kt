package com.example.belajarjetpackcompose.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyTextLayout() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Teks Biasa")
        Spacer(Modifier.height(8.dp))

        Text(text = "Teks Warna Merah", color = Color.Red)
        Spacer(Modifier.height(8.dp))

        Text(text = "Teks Ukuran 24sp", fontSize = 24.sp)
        Spacer(Modifier.height(8.dp))

        Text(text = "Teks Tebal (Bold)", fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(8.dp))

        Text(text = "Teks Miring (Italic)", fontStyle = FontStyle.Italic)
        Spacer(Modifier.height(8.dp))

        Text(
            text = "Teks Rata Tengah di dalam area yang tersedia.",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 20.dp)
        )
        Spacer(Modifier.height(8.dp))

        Text(text = "Teks dengan Garis Bawah", textDecoration = TextDecoration.Underline)
        Spacer(Modifier.height(8.dp))

        Text(text = "Teks dengan Garis Tengah", textDecoration = TextDecoration.LineThrough)
    }
}

@Preview(showBackground = true)
@Composable
fun TextLayoutPreview() {
    MyTextLayout()
}